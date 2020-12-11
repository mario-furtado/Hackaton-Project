package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoPollution;
import org.academiadecodigo.be_the_rain.models.Pollution;
import org.springframework.stereotype.Component;

@Component
public class PollutionConverter extends GenericConverter<Pollution, DtoPollution> {

    @Override
    public DtoPollution convert(Pollution model) {

        DtoPollution dtoPollution = new DtoPollution();

        dtoPollution.setContent(model.getContent());
        dtoPollution.setTitle(model.getTitle());
        dtoPollution.setLink(model.getLink());
        return dtoPollution;
    }
}
