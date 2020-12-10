package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.InstitutionDao;
import org.academiadecodigo.be_the_rain.models.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstituService  {

    private InstitutionDao institutionDao;

    @Autowired
    public void setInstitutionDao(InstitutionDao institutionDao) {
        this.institutionDao = institutionDao;
    }

    @Transactional
    public Institution get(Integer id) {
        return institutionDao.findById(id);
    }

    @Transactional
    public List<Institution> getAll() {

        return institutionDao.findAll();
    }
}
