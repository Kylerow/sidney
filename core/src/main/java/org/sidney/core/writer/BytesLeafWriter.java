package org.sidney.core.writer;

import org.sidney.core.field.FieldAccessor;

public class BytesLeafWriter implements LeafWriter {
    @Override
    public void writeRecordFromField(ColumnWriter consumer, Object parent, int index, FieldAccessor accessor) {
        consumer.writeBytes(index, (byte[]) accessor.get(parent));
    }
}