package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.DiscriminationDao;
import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.TransactionScoped;
import java.util.Date;
import java.util.List;

@Service
public class DiscriminationService implements DatabaseService<Discrimination> {

    private DiscriminationDao discriminationDao;

    @Autowired
    public void setDiscriminationDao(DiscriminationDao discriminationDao) {
        this.discriminationDao = discriminationDao;
    }

    @Transactional
    @Override
    public Discrimination get(Integer id) {
        return discriminationDao.findById(id);
    }

    @Transactional
    @Override
    public List<Discrimination> getAll() {

        return discriminationDao.findAll();
    }
}
