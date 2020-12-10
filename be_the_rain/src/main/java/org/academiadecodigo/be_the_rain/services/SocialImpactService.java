package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.SocialImpactDao;
import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SocialImpactService implements DatabaseService<SocialImpact> {

    private SocialImpactDao socialImpactDao;

    @Autowired
    public void setSocialImpactDao(SocialImpactDao socialImpactDao) {
        this.socialImpactDao = socialImpactDao;
    }

    @Transactional
    @Override
    public SocialImpact get(Integer id) {
        return socialImpactDao.findById(id);
    }

    @Transactional
    @Override
    public List<SocialImpact> getAll() {

        return socialImpactDao.findAll();
    }
}
