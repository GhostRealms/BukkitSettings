package me.anxuiz.bukkitsettings;

public interface Type {
    String getName();

    boolean isInstance(Object obj);

    String print(Object obj) throws IllegalArgumentException;

    String serialize(Object obj) throws IllegalArgumentException;

    Object parse(String raw) throws TypeParseException;
}
