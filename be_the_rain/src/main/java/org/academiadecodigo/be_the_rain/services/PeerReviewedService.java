package org.academiadecodigo.be_the_rain.services;

import org.academiadecodigo.be_the_rain.dao.PeerReviewedDao;
import org.academiadecodigo.be_the_rain.models.PeerReviewed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeerReviewedService implements DatabaseService<PeerReviewed> {

    private PeerReviewedDao peerReviewedDao;

    @Autowired
    public void setPeerReviewedDao(PeerReviewedDao peerReviewedDao) {
        this.peerReviewedDao = peerReviewedDao;
    }

    @Transactional
    @Override
    public PeerReviewed get(Integer id) {
        return peerReviewedDao.findById(id);
    }

    @Transactional
    @Override
    public List<PeerReviewed> getAll() {

        return peerReviewedDao.findAll();
    }
}
