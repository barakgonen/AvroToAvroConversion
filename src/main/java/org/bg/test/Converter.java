package org.bg.test;

public interface Converter<Source, Dest> {
    Dest convert(Source sourceCode);
}
