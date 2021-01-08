package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.DiscriminationDao;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiscriminService   {

    private DiscriminationDao discriminationDao;

    @Autowired
    public void setDiscriminationDao(DiscriminationDao discriminationDao) {
        this.discriminationDao = discriminationDao;
    }

    @Transactional
    public Discrimination get(Integer id) {
        return discriminationDao.findById(id);
    }

    @Transactional
    public List<Discrimination> getAll() {

        return discriminationDao.findAll();
    }

    @Transactional
    public void persist(Discrimination model){
        discriminationDao.persist(model);
    }
}
