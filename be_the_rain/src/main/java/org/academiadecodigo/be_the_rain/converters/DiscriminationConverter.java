package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoDiscrimination;
import org.academiadecodigo.be_the_rain.dao.DiscriminationDao;
import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.stereotype.Component;

@Component
public class DiscriminationConverter extends GenericConverter<Discrimination, DtoDiscrimination> {

    @Override
    public DtoDiscrimination convert(Discrimination model) {
        DtoDiscrimination dtoDiscrimination = new DtoDiscrimination();

        dtoDiscrimination.setContent(model.getContent());
        dtoDiscrimination.setTitle(model.getTitle());
        return dtoDiscrimination;
    }
}
