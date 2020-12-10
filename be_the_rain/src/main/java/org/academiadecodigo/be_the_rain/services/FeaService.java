package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.FearDao;
import org.academiadecodigo.be_the_rain.models.Fear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FeaService  {

    private FearDao fearDao;

    @Autowired
    public void setFearDao(FearDao fearDao) {
        this.fearDao = fearDao;
    }

    @Transactional
    public Fear get(Integer id) {
        return fearDao.findById(id);
    }

    @Transactional
    public List<Fear> getAll() {

        return fearDao.findAll();
    }
}
