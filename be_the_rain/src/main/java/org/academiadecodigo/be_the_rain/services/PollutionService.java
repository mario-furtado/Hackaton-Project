package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.PollutionDao;
import org.academiadecodigo.be_the_rain.models.Pollution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PollutionService implements DatabaseService<Pollution> {

    private PollutionDao pollutionDao;

    @Autowired
    public void setPollutionDao(PollutionDao pollutionDao) {
        this.pollutionDao = pollutionDao;
    }

    @Transactional
    @Override
    public Pollution get(Integer id) {
        return pollutionDao.findById(id);
    }

    @Transactional
    @Override
    public List<Pollution> getAll() {

        return pollutionDao.findAll();
    }
}
