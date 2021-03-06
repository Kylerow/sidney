package org.sidney.benchmarking.data;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvFormat;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.codehaus.jackson.map.ObjectMapper;
import org.openjdk.jmh.annotations.*;
import org.sidney.core.Writer;
import org.springframework.core.io.ClassPathResource;
import org.xerial.snappy.SnappyOutputStream;

import java.io.*;
import java.util.List;

@State(Scope.Benchmark)
@Warmup(iterations = 10)
@Measurement(iterations = 2)
@Threads(1)
@Fork(1)
public class FlaInsuranceRecordBenchmarks {
    private List<FlaInsuranceRecord> records;

    public FlaInsuranceRecordBenchmarks() {
        BeanListProcessor<FlaInsuranceRecord> processor = new BeanListProcessor<>(FlaInsuranceRecord.class);

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setRowProcessor(processor);
        parserSettings.setHeaderExtractionEnabled(true);
        CsvFormat format = new CsvFormat();
        format.setDelimiter(',');
        format.setLineSeparator("\n");
        parserSettings.setFormat(format);
        ClassPathResource pathResource = new ClassPathResource("FL_insurance_sample.csv");
        CsvParser parser = new CsvParser(parserSettings);
        try {
            parser.parse(new InputStreamReader(pathResource.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        records = processor.getBeans();
    }

    @Benchmark
    @Group("data")
    public byte[] sidney() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = new SnappyOutputStream(new ByteArrayOutputStream());
        org.sidney.core.Writer<FlaInsuranceRecord> recordSerializer = new Writer<>(FlaInsuranceRecord.class, os);
        for (FlaInsuranceRecord record : records) {
            recordSerializer.write(record);
        }
        os.close();

        return baos.toByteArray();
    }

    @Benchmark
    @Group("data")
    public byte[] kryo() throws IOException {
        ByteArrayOutputStream kryoBaos = new ByteArrayOutputStream();
        OutputStream kryoGzos = new SnappyOutputStream(new BufferedOutputStream(kryoBaos));
        Output output = new Output(kryoGzos);
        new Kryo().writeObject(output, records);
        output.close();
        kryoGzos.close();
        return kryoBaos.toByteArray();
    }

    @Benchmark
    @Group("data")
    public byte[] jackson() throws IOException {
        ByteArrayOutputStream kryoBaos = new ByteArrayOutputStream();
        OutputStream kryoGzos = new SnappyOutputStream(new BufferedOutputStream(kryoBaos));
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(kryoGzos, records);
        kryoGzos.close();
        return kryoBaos.toByteArray();
    }
}
