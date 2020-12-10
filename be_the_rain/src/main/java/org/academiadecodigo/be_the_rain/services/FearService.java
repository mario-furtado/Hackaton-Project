package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.FearDao;
import org.academiadecodigo.be_the_rain.models.Fear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FearService implements DatabaseService<Fear> {

    private FearDao fearDao;

    @Autowired
    public void setFearDao(FearDao fearDao) {
        this.fearDao = fearDao;
    }

    @Transactional
    @Override
    public Fear get(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void getAll() {

    }
}
