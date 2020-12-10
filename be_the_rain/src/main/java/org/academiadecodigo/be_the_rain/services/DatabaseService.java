package org.academiadecodigo.be_the_rain.services;

public interface DatabaseService<T> {

    T get(Integer id);

    void getAll();

}
