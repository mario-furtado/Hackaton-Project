package org.academiadecodigo.be_the_rain.converters;

import org.academiadecodigo.be_the_rain.Dto.DtoSocialImpact;
import org.academiadecodigo.be_the_rain.models.SocialImpact;
import org.springframework.stereotype.Component;

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
}
