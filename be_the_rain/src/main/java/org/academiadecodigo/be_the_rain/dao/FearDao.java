package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.Fear;
import org.springframework.stereotype.Repository;

@Repository
public class FearDao extends GenericDao<Fear> {

    public FearDao() {
        super(Fear.class);
    }
}
