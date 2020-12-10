package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.AntiMaskDao;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AntiMaskDatabaseService implements DatabaseService<AntiMask> {

    private AntiMaskDao antiMaskDao;

    @Autowired
    public void setAntiMaskDao(AntiMaskDao antiMaskDao) {
        this.antiMaskDao = antiMaskDao;
    }

    @Transactional
    @Override
    public AntiMask get(Integer id) {

        return antiMaskDao.findById(id);
    }

    @Transactional
    @Override
    public List<AntiMask> getAll() {
        return antiMaskDao.findAll();
    }
}
