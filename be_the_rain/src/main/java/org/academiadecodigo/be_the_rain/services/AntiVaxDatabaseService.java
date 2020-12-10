package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.AntiVaxDao;
import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AntiVaxDatabaseService implements DatabaseService<AntiVax> {

    private AntiVaxDao antiVaxDao;

    @Autowired
    public void setAntiVaxDao(AntiVaxDao antiVaxDao) {
        this.antiVaxDao = antiVaxDao;
    }

    @Transactional
    @Override
    public AntiVax get(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void getAll() {

    }
}
