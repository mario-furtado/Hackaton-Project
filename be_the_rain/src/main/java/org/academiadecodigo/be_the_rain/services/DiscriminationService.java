package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.DiscriminationDao;
import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DiscriminationService implements DatabaseService<Discrimination> {

    private DiscriminationDao discriminationDao;

    @Autowired
    public void setDiscriminationDao(DiscriminationDao discriminationDao) {
        this.discriminationDao = discriminationDao;
    }

    @Override
    public Discrimination get(Integer id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
