package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AntiMaskConverter extends GenericConverter<AntiMask, DtoAntiMask> {

    @Override
    public DtoAntiMask convert(AntiMask model) {
        DtoAntiMask dtoAntiMask = new DtoAntiMask();

        dtoAntiMask.setTitle(model.getTitle());
        dtoAntiMask.setContent(model.getContent());
        dtoAntiMask.setLink(model.getLink());
        return dtoAntiMask ;
    }

    @Override
    public List<DtoAntiMask> convertList(List<AntiMask> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
