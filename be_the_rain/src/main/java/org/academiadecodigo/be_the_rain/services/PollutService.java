package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.PollutionDao;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.Pollution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PollutService {

    private PollutionDao pollutionDao;

    @Autowired
    public void setPollutionDao(PollutionDao pollutionDao) {
        this.pollutionDao = pollutionDao;
    }

    @Transactional
    public Pollution get(Integer id) {
        return pollutionDao.findById(id);
    }

    @Transactional
    public List<Pollution> getAll() {

        return pollutionDao.findAll();
    }

    @Transactional
    public void persist(Pollution model){
        pollutionDao.persist(model);
    }
}
