package org.sidney.core.writer;

public class StringLeafWriter extends NullableLeafWriter {
    @Override
    protected void writeIfNotNull(Object value, int index, ColumnWriter consumer) {
        consumer.writeString(index, (String) value);
    }
}
