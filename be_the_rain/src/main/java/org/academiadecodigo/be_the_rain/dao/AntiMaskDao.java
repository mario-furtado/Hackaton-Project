package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.springframework.stereotype.Repository;

@Repository
public class AntiMaskDao extends GenericDao<AntiMask> {


    public AntiMaskDao() {
        super(AntiMask.class);
    }
}
