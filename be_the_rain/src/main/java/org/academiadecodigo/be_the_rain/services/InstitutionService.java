package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.InstitutionDao;
import org.academiadecodigo.be_the_rain.models.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService implements DatabaseService<Institution> {

    private InstitutionDao institutionDao;

    @Autowired
    public void setInstitutionDao(InstitutionDao institutionDao) {
        this.institutionDao = institutionDao;
    }

    @Override
    public Institution get(Integer id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}