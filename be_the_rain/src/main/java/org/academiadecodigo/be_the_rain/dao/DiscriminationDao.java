package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.stereotype.Repository;

@Repository
public class DiscriminationDao extends GenericDao<Discrimination> {

    public DiscriminationDao() {
        super(Discrimination.class);
    }
}
