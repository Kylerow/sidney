package org.sidney.core.writer;

import org.sidney.core.field.FieldAccessor;

public class IntLeafWriter implements LeafWriter {
    @Override
    public void writeRecordFromField(ColumnWriter consumer, Object parent, int index, FieldAccessor accessor) {
        consumer.writeInt(index, accessor.getInt(parent));
    }
}
