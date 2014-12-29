package org.sidney.core.resolver;

import org.sidney.core.column.MessageConsumer;
import org.sidney.core.field.FieldAccessor;

public interface LeafWriter {
    void writeRecordFromField(MessageConsumer consumer, Object parent, int index, FieldAccessor accessor);
}