package org.sidney.benchmarking;

import org.sidney.core.encoding.Decoder;
import org.sidney.core.encoding.Encoder;

import java.util.HashMap;
import java.util.Map;

public class BenchmarkingBase {
    private final ThreadLocal<Map<Class<? extends Encoder>, Encoder>> encoderCache = new ThreadLocal<Map<Class<? extends Encoder>, Encoder>>() {
        @Override
        protected Map<Class<? extends Encoder>, Encoder> initialValue() {
            return new HashMap<>();
        }
    };

    private final ThreadLocal<Map<Class<? extends Decoder>, Decoder>> decoderCache = new ThreadLocal<Map<Class<? extends Decoder>, Decoder>>() {
        @Override
        protected Map<Class<? extends Decoder>, Decoder> initialValue() {
            return new HashMap<>();
        }
    };

    public <T extends Encoder> T getEncoder(Class<T> clazz) {
        if (encoderCache.get().containsKey(clazz)) {
            return (T) encoderCache.get().get(clazz);
        } else {
            try {
                T encoder = (T) clazz.getConstructors()[0].newInstance();
                encoderCache.get().put(clazz, encoder);
                return encoder;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public <T extends Decoder> T getDecoder(Class<T> clazz) {
        if (decoderCache.get().containsKey(clazz)) {
            return (T) decoderCache.get().get(clazz);
        } else {
            try {
                T decoder = (T) clazz.getConstructors()[0].newInstance();
                decoderCache.get().put(clazz, decoder);
                return decoder;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
