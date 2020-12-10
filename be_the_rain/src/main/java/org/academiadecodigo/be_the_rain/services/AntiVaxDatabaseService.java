package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.AntiVaxDao;
import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AntiVaxDatabaseService implements DatabaseService<AntiVax> {

    private AntiVaxDao antiVaxDao;

    @Autowired
    public void setAntiVaxDao(AntiVaxDao antiVaxDao) {
        this.antiVaxDao = antiVaxDao;
    }

    @Override
    public AntiVax get(Integer id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
