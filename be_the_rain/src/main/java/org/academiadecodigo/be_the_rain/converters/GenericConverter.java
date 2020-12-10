package org.academiadecodigo.be_the_rain.converters;

public abstract class GenericConverter<S, T> {

    public abstract T convert(S model);

}
