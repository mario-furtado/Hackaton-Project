package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.Institution;
import org.springframework.stereotype.Repository;

@Repository
public class InstitutionDao extends GenericDao<Institution> {

    public InstitutionDao() {
        super(Institution.class);
    }
}
