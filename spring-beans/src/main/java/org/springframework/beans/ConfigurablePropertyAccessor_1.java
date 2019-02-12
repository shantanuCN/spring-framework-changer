package org.springframework.beans;

import org.springframework.core.convert.ConversionService;
import org.springframework.lang.Nullable;

public interface ConfigurablePropertyAccessor_1 extends PropertyAccessor, PropertyEditorRegistry, TypeConverter {
    void setExtractOldValueForEditor(boolean extractOldValueForEditor);

    void setAutoGrowNestedPaths(boolean autoGrowNestedPaths);
}
