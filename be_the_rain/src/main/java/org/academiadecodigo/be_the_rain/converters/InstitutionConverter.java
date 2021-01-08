package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoInstitution;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.Institution;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InstitutionConverter extends GenericConverter<Institution, DtoInstitution> {

    @Override
    public DtoInstitution convert(Institution model) {

        DtoInstitution dtoInstitution = new DtoInstitution();

        dtoInstitution.setContent(model.getContent());
        dtoInstitution.setTitle(model.getTitle());
        dtoInstitution.setLink(model.getLink());
        return dtoInstitution;
    }

    @Override
    public List<DtoInstitution> convertList(List<Institution> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
