package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoInstitution;
import org.academiadecodigo.be_the_rain.models.Institution;
import org.springframework.stereotype.Component;

@Component
public class InstitutionConverter extends GenericConverter<Institution, DtoInstitution> {

    @Override
    public DtoInstitution convert(Institution model) {

        DtoInstitution dtoInstitution = new DtoInstitution();

        dtoInstitution.setContent(model.getContent());
        dtoInstitution.setTitle(model.getTitle());
        return dtoInstitution;
    }
}
