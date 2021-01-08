package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoAntiMask;
import org.academiadecodigo.be_the_rain.Dto.DtoSocialImpact;
import org.academiadecodigo.be_the_rain.models.AntiMask;
import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SocialImpactConverter extends GenericConverter<SocialImpact, DtoSocialImpact> {

    @Override
    public DtoSocialImpact convert(SocialImpact model) {

        DtoSocialImpact dtoSocialImpact = new DtoSocialImpact();

        dtoSocialImpact.setContent(model.getContent());
        dtoSocialImpact.setTitle(model.getTitle());
        dtoSocialImpact.setLink(model.getLink());
        return dtoSocialImpact;
    }

    @Override
    public List<DtoSocialImpact> convertList(List<SocialImpact> list) {

        return list.stream().map(this::convert).collect(Collectors.toList());
    }
}
