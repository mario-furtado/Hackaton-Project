package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoAntiVax;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AntiVaxConverter extends GenericConverter<AntiVax, DtoAntiVax> {


    @Override
    public DtoAntiVax convert(AntiVax model) {

        DtoAntiVax dtoAntiVax = new DtoAntiVax();

        dtoAntiVax.setContent(model.getContent());
        dtoAntiVax.setTitle(model.getTitle());
        dtoAntiVax.setLink(model.getLink());
        return dtoAntiVax;
    }

    @Override
    public List<DtoAntiVax> convertList(List<AntiVax> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
