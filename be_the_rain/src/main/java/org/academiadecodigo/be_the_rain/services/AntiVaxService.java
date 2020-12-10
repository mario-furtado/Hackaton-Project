package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.AntiVaxDao;
import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AntiVaxService  {

    private AntiVaxDao antiVaxDao;

    @Autowired
    public void setAntiVaxDao(AntiVaxDao antiVaxDao) {
        this.antiVaxDao = antiVaxDao;
    }

    @Transactional
    public AntiVax get(Integer id) {
        return antiVaxDao.findById(id);
    }

    @Transactional
    public List<AntiVax> getAll() {
        return antiVaxDao.findAll();
    }
}
