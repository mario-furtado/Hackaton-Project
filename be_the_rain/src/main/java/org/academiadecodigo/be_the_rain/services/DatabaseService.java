package org.academiadecodigo.be_the_rain.services;

import java.util.List;

public interface DatabaseService<T> {

    T get(Integer id);

    List<T> getAll();

}
