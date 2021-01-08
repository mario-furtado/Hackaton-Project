package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoDiscrimination;
import org.academiadecodigo.be_the_rain.dao.DiscriminationDao;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.Discrimination;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DiscriminationConverter extends GenericConverter<Discrimination, DtoDiscrimination> {

    @Override
    public DtoDiscrimination convert(Discrimination model) {
        DtoDiscrimination dtoDiscrimination = new DtoDiscrimination();

        dtoDiscrimination.setContent(model.getContent());
        dtoDiscrimination.setTitle(model.getTitle());
        dtoDiscrimination.setLink(model.getLink());
        return dtoDiscrimination;
    }

    @Override
    public List<DtoDiscrimination> convertList(List<Discrimination> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
