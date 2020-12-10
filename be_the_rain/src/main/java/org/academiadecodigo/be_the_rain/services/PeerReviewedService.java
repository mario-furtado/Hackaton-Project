package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.PeerReviewedDao;
import org.academiadecodigo.be_the_rain.models.PeerReviewed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeerReviewedService implements DatabaseService<PeerReviewed> {

    private PeerReviewedDao peerReviewedDao;

    @Autowired
    public void setPeerReviewedDao(PeerReviewedDao peerReviewedDao) {
        this.peerReviewedDao = peerReviewedDao;
    }

    @Override
    public PeerReviewed get(Integer id) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
