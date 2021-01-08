package org.academiadecodigo.be_the_rain.converters;

import java.util.List;

public abstract class GenericConverter<S, T> {

    public abstract T convert(S model);

    public abstract List<T> convertList(List<S> list);

}
