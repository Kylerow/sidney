package org.sidney.core;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Header {
    private Map<String, Integer> classNameToValue = new HashMap<>();
    private Class[] generics;

    private transient Map<Class, Integer> classToValueMap = new IdentityHashMap<>();
    private transient Map<Integer, Class> valueToClassMap = new HashMap<>();
    private transient int counter = 0;

    public Class[] getGenerics() {
        return generics;
    }

    public void setGenerics(Class[] generics) {
        this.generics = generics;
    }

    public Map<String, Integer> getClassNameToValue() {
        return classNameToValue;
    }

    public void setClassNameToValue(Map<String, Integer> classNameToValue) {
        this.classNameToValue = classNameToValue;
    }

    public int valueForType(Class clazz) {
        Integer value = classToValueMap.get(clazz);
        if(value == null) {
            value = counter++;
            classToValueMap.put(clazz, value);
        }
        return value;
    }

    public Class classForValue(int value) {
        return valueToClassMap.get(value);
    }

    public Class readConcreteType(int value) {
        return valueToClassMap.get(value);
    }

    public void prepareForStorage() {
        for(Map.Entry<Class, Integer> entry : classToValueMap.entrySet()) {
            classNameToValue.put(entry.getKey().getName(), entry.getValue());
        }
    }

    public void prepareForRead() throws ClassNotFoundException {
        valueToClassMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : classNameToValue.entrySet()) {
            valueToClassMap.put(entry.getValue(), Class.forName(entry.getKey()));
        }
    }
}