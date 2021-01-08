package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoFear;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.Fear;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<DtoFear> convertList(List<Fear> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
