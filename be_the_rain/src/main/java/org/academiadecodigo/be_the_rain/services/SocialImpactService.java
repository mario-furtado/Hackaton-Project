package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.SocialImpactDao;
import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialImpactService implements DatabaseService<SocialImpact> {

    private SocialImpactDao socialImpactDao;

    @Autowired
    public void setSocialImpactDao(SocialImpactDao socialImpactDao) {
        this.socialImpactDao = socialImpactDao;
    }

    @Override
    public SocialImpact get(Integer id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
