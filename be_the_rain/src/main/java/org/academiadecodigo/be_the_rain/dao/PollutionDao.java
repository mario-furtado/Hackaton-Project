package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.Pollution;
import org.springframework.stereotype.Repository;

@Repository
public class PollutionDao extends GenericDao<Pollution> {

    public PollutionDao() {
        super(Pollution.class);
    }
}
