package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.springframework.stereotype.Repository;

@Repository
public class SocialImpactDao extends GenericDao<SocialImpact> {

    public SocialImpactDao() {
        super(SocialImpact.class);
    }
}
