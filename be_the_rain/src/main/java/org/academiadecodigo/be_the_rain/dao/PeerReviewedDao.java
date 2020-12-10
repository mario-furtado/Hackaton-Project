package org.academiadecodigo.be_the_rain.dao;

import org.academiadecodigo.be_the_rain.models.PeerReviewed;
import org.springframework.stereotype.Repository;

@Repository
public class PeerReviewedDao extends GenericDao<PeerReviewed> {

    public PeerReviewedDao() {
        super(PeerReviewed.class);
    }
}
