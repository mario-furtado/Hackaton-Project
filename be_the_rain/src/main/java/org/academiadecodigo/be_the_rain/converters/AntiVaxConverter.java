package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiVax;
import org.academiadecodigo.be_the_rain.models.AntiVax;
import org.springframework.stereotype.Component;

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
}
