package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoPeerReviewed;
import org.academiadecodigo.be_the_rain.models.PeerReviewed;
import org.springframework.stereotype.Component;

@Component
public class PeerReviewedConverter extends GenericConverter<PeerReviewed, DtoPeerReviewed> {

    @Override
    public DtoPeerReviewed convert(PeerReviewed model) {

        DtoPeerReviewed dtoPeerReviewed = new DtoPeerReviewed();
        dtoPeerReviewed.setContent(model.getContent());
        dtoPeerReviewed.setTitle(model.getTitle());
        return dtoPeerReviewed;
    }
}
