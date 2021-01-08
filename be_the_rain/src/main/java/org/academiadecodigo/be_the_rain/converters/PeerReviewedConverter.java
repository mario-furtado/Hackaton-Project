package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoPeerReviewed;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.PeerReviewed;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PeerReviewedConverter extends GenericConverter<PeerReviewed, DtoPeerReviewed> {

    @Override
    public DtoPeerReviewed convert(PeerReviewed model) {

        DtoPeerReviewed dtoPeerReviewed = new DtoPeerReviewed();
        dtoPeerReviewed.setContent(model.getContent());
        dtoPeerReviewed.setTitle(model.getTitle());
        dtoPeerReviewed.setLink(model.getLink());
        return dtoPeerReviewed;
    }

    @Override
    public List<DtoPeerReviewed> convertList(List<PeerReviewed> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
