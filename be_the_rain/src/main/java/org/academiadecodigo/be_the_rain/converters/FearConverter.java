package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoFear;
import org.academiadecodigo.be_the_rain.models.Fear;
import org.springframework.stereotype.Component;

@Component
public class FearConverter extends GenericConverter<Fear, DtoFear> {

    @Override
    public DtoFear convert(Fear model) {

        DtoFear dtoFear = new DtoFear();

        dtoFear.setTitle(model.getTitle());
        dtoFear.setContent(model.getContent());
        dtoFear.setLink(model.getLink());
        return dtoFear;
    }
}
