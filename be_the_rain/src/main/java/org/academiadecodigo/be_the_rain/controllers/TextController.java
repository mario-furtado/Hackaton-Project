package org.academiadecodigo.be_the_rain.controllers;

import org.academiadecodigo.be_the_rain.Dto.*;
import org.academiadecodigo.be_the_rain.converters.*;
import org.academiadecodigo.be_the_rain.models.*;
import org.academiadecodigo.be_the_rain.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/text")

public class TextController {

    private AntiMaskDatabaseService antiMaskDatabaseService;
    private AntiVaxDatabaseService antiVaxDatabaseService;
    private DiscriminationService discriminationService;
    private FearService fearService;
    private InstitutionService institutionService;
    private PeerReviewedService peerReviewedService;
    private PollutionService pollutionService;
    private SocialImpactService socialImpactService;

    private AntiVaxConverter antiVaxConverter;
    private AntiMaskConverter antiMaskConverter;
    private DiscriminationConverter discriminationConverter;
    private FearConverter fearConverter;
    private InstitutionConverter institutionConverter;
    private PeerReviewedConverter peerReviewedConverter;
    private PollutionConverter pollutionConverter;
    private SocialImpactConverter socialImpactConverter;


    @Autowired
    public void setAntiVaxDatabaseService(AntiVaxDatabaseService antiVaxDatabaseService) {
        this.antiVaxDatabaseService = antiVaxDatabaseService;
    }

    @Autowired
    public void setAntiMaskDatabaseService(AntiMaskDatabaseService antiMaskDatabaseService) {
        this.antiMaskDatabaseService = antiMaskDatabaseService;
    }
    @Autowired
    public void setDiscriminationService(DiscriminationService discriminationService) {
        this.discriminationService = discriminationService;
    }
    @Autowired
    public void setFearService(FearService fearService) {
        this.fearService = fearService;
    }
    @Autowired
    public void setInstitutionService(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }
    @Autowired
    public void setPeerReviewedService(PeerReviewedService peerReviewedService) {
        this.peerReviewedService = peerReviewedService;
    }
    @Autowired
    public void setPollutionService(PollutionService pollutionService) {
        this.pollutionService = pollutionService;
    }
    @Autowired
    public void setSocialImpactService(SocialImpactService socialImpactService) {
        this.socialImpactService = socialImpactService;
    }
    @Autowired
    public void setAntiVaxConverter(AntiVaxConverter antiVaxConverter) {
        this.antiVaxConverter = antiVaxConverter;
    }
    @Autowired
    public void setAntiMaskConverter(AntiMaskConverter antiMaskConverter) {
        this.antiMaskConverter = antiMaskConverter;
    }
    @Autowired
    public void setDiscriminationConverter(DiscriminationConverter discriminationConverter) {
        this.discriminationConverter = discriminationConverter;
    }
    @Autowired
    public void setFearConverter(FearConverter fearConverter) {
        this.fearConverter = fearConverter;
    }
    @Autowired
    public void setInstitutionConverter(InstitutionConverter institutionConverter) {
        this.institutionConverter = institutionConverter;
    }
    @Autowired
    public void setPollutionConverter(PollutionConverter pollutionConverter) {
        this.pollutionConverter = pollutionConverter;
    }
    @Autowired
    public void setSocialImpactConverter(SocialImpactConverter socialImpactConverter) {
        this.socialImpactConverter = socialImpactConverter;
    }

    @Autowired
    public void setPeerReviewedConverter(PeerReviewedConverter peerReviewedConverter) {
        this.peerReviewedConverter = peerReviewedConverter;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/antiMask/{id}")
    public ResponseEntity<DtoAntiMask> showAntiMask(@PathVariable Integer id){

        AntiMask antiMask = antiMaskDatabaseService.get(id);

        return new ResponseEntity<>(antiMaskConverter.convert(antiMask), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/antiVax/{id}")
    public ResponseEntity<DtoAntiVax> showAntiVax(@PathVariable Integer id){

        AntiVax antiVax = antiVaxDatabaseService.get(id);

        return new ResponseEntity<>(antiVaxConverter.convert(antiVax), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/discrimination/{id}")
    public ResponseEntity<DtoDiscrimination> showDiscrimination(@PathVariable Integer id){

        Discrimination discrimination = discriminationService.get(id);

        return new ResponseEntity<>(discriminationConverter.convert(discrimination), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/fear/{id}")

    public ResponseEntity<DtoFear> showFear(@PathVariable Integer id){

        Fear fear = fearService.get(id);

        return new ResponseEntity<>(fearConverter.convert(fear), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/institution/{id}")
    public ResponseEntity<DtoInstitution> showInstitution(@PathVariable Integer id){

        Institution institution = institutionService.get(id);

        return new ResponseEntity<>(institutionConverter.convert(institution), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/peerReviewed/{id}")
    public ResponseEntity<DtoPeerReviewed> showPeer(@PathVariable Integer id){

        PeerReviewed peerReviewed = peerReviewedService.get(id);

        return new ResponseEntity<>(peerReviewedConverter.convert(peerReviewed), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/pollution/{id}")
    public ResponseEntity<DtoPollution> showPollution(@PathVariable Integer id){

        Pollution pollution = pollutionService.get(id);

        return new ResponseEntity<>(pollutionConverter.convert(pollution), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/social/{id}")
    public ResponseEntity<DtoSocialImpact> showSocial(@PathVariable Integer id){

        SocialImpact socialImpact = socialImpactService.get(id);

        return new ResponseEntity<>(socialImpactConverter.convert(socialImpact), HttpStatus.OK);
    }



}
