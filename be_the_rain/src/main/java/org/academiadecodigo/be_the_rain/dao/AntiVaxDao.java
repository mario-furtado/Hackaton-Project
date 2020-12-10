package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.stereotype.Repository;

@Repository
public class AntiVaxDao extends GenericDao<AntiVax> {
    public AntiVaxDao() {
        super(AntiVax.class);
    }
}
