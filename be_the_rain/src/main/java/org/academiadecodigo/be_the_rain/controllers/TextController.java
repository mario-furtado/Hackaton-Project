package org.academiadecodigo.be_the_rain.controllers;

import org.academiadecodigo.be_the_rain.Dto.*;
import org.academiadecodigo.be_the_rain.converters.*;
import org.academiadecodigo.be_the_rain.crawler.*;
import org.academiadecodigo.be_the_rain.models.*;
import org.academiadecodigo.be_the_rain.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/text")

public class TextController  {

    private AntiMaskService antiMaskService;
    private AntiVaxService antiVaxService;
    private DiscriminService discriminService;
    private FeaService feaService;
    private InstituService instituService;
    private PeerRevService peerRevService;
    private PollutService pollutService;
    private SocialImpService socialImpService;

    private AntiVaxConverter antiVaxConverter;
    private AntiMaskConverter antiMaskConverter;
    private DiscriminationConverter discriminationConverter;
    private FearConverter fearConverter;
    private InstitutionConverter institutionConverter;
    private PeerReviewedConverter peerReviewedConverter;
    private PollutionConverter pollutionConverter;
    private SocialImpactConverter socialImpactConverter;

    private MaskCrawler maskCrawler;
    private VaxCrawler vaxCrawler;
    private DiscriminationCrawler discriminationCrawler;
    private FearCrawler fearCrawler;
    private InstitutionsCrawler institutionsCrawler;
    private SocialImpactCrawler socialImpactCrawler;
    private PeerReviewedCrawler peerReviewedCrawler;
    private PollutionCrawler pollutionCrawler;

    @Autowired
    public void setMaskCrawler(MaskCrawler maskCrawler) {
        this.maskCrawler = maskCrawler;
    }
    @Autowired
    public void setVaxCrawler(VaxCrawler vaxCrawler) {
        this.vaxCrawler = vaxCrawler;
    }
    @Autowired
    public void setDiscriminationCrawler(DiscriminationCrawler discriminationCrawler) {
        this.discriminationCrawler = discriminationCrawler;
    }
    @Autowired
    public void setFearCrawler(FearCrawler fearCrawler) {
        this.fearCrawler = fearCrawler;
    }
    @Autowired
    public void setInstitutionsCrawler(InstitutionsCrawler institutionsCrawler) {
        this.institutionsCrawler = institutionsCrawler;
    }
    @Autowired
    public void setSocialImpactCrawler(SocialImpactCrawler socialImpactCrawler) {
        this.socialImpactCrawler = socialImpactCrawler;
    }
    @Autowired
    public void setPeerReviewedCrawler(PeerReviewedCrawler peerReviewedCrawler) {
        this.peerReviewedCrawler = peerReviewedCrawler;
    }
    @Autowired
    public void setPollutionCrawler(PollutionCrawler pollutionCrawler) {
        this.pollutionCrawler = pollutionCrawler;
    }


    @Autowired
    public void setAntiVaxService(AntiVaxService antiVaxService) {
        this.antiVaxService = antiVaxService;
    }

    @Autowired
    public void setAntiMaskService(AntiMaskService antiMaskService) {
        this.antiMaskService = antiMaskService;
    }
    @Autowired
    public void setDiscriminService(DiscriminService discriminService) {
        this.discriminService = discriminService;
    }
    @Autowired
    public void setFeaService(FeaService feaService) {
        this.feaService = feaService;
    }

    @Autowired
    public void setInstituService(InstituService instituService) {
        this.instituService = instituService;
    }
    @Autowired
    public void setPeerRevService(PeerRevService peerRevService) {
        this.peerRevService = peerRevService;
    }
    @Autowired
    public void setPollutService(PollutService pollutService) {
        this.pollutService = pollutService;
    }

    @Autowired
    public void setSocialImpService(SocialImpService socialImpService) {
        this.socialImpService = socialImpService;
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

        AntiMask antiMask = antiMaskService.get(id);

        return new ResponseEntity<>(antiMaskConverter.convert(antiMask), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/antiVax/{id}")
    public ResponseEntity<DtoAntiVax> showAntiVax(@PathVariable Integer id){

        AntiVax antiVax = antiVaxService.get(id);

        return new ResponseEntity<>(antiVaxConverter.convert(antiVax), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/discrimination/{id}")
    public ResponseEntity<DtoDiscrimination> showDiscrimination(@PathVariable Integer id){

        Discrimination discrimination = discriminService.get(id);

        return new ResponseEntity<>(discriminationConverter.convert(discrimination), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fear/{id}")

    public ResponseEntity<DtoFear> showFear(@PathVariable Integer id){

        Fear fear = feaService.get(id);

        return new ResponseEntity<>(fearConverter.convert(fear), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institution/{id}")
    public ResponseEntity<DtoInstitution> showInstitution(@PathVariable Integer id){

        Institution institution = instituService.get(id);

        return new ResponseEntity<>(institutionConverter.convert(institution), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/peerReviewed/{id}")
    public ResponseEntity<DtoPeerReviewed> showPeer(@PathVariable Integer id){

        PeerReviewed peerReviewed = peerRevService.get(id);

        return new ResponseEntity<>(peerReviewedConverter.convert(peerReviewed), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pollution/{id}")
    public ResponseEntity<DtoPollution> showPollution(@PathVariable Integer id){

        Pollution pollution = pollutService.get(id);

        return new ResponseEntity<>(pollutionConverter.convert(pollution), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/social/{id}")
    public ResponseEntity<DtoSocialImpact> showSocial(@PathVariable Integer id){

        SocialImpact socialImpact = socialImpService.get(id);

        return new ResponseEntity<>(socialImpactConverter.convert(socialImpact), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/antiMask")
    public ResponseEntity<List<DtoAntiMask>> showAntiMask(){

        maskCrawler.init("masks", antiMaskService);
        List<AntiMask> antiMask = antiMaskService.getAll();

        return new ResponseEntity<>(antiMaskConverter.convertList(antiMask), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/antiVax")
    public ResponseEntity<List<DtoAntiVax>> showAntiVax(){

        vaxCrawler.init("vaccines+Covid19", antiVaxService);
        List<AntiVax> antiVax = antiVaxService.getAll();

        return new ResponseEntity<>(antiVaxConverter.convertList(antiVax), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/discrimination")
    public ResponseEntity<List<DtoDiscrimination>> showDiscrimination(){

        discriminationCrawler.init("discrimination+Covid19", discriminService);
        List<Discrimination> discrimination = discriminService.getAll();

        return new ResponseEntity<>(discriminationConverter.convertList(discrimination), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fear")
    public ResponseEntity<List<DtoFear>> showFear(){

        fearCrawler.init("fear+Covid19", feaService);
        List<Fear> fear = feaService.getAll();

        return new ResponseEntity<>(fearConverter.convertList(fear), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institution")
    public ResponseEntity<List<DtoInstitution>> showInstitution(){

        institutionsCrawler.init("institutions+Covid19", instituService);
        List<Institution> institution = instituService.getAll();

        return new ResponseEntity<>(institutionConverter.convertList(institution), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/peerReviewed")
    public ResponseEntity<List<DtoPeerReviewed>> showPeer(){

        peerReviewedCrawler.init("peer+reviewed+studies+Covid19", peerRevService);
        List<PeerReviewed> peerReviewed = peerRevService.getAll();

        return new ResponseEntity<>(peerReviewedConverter.convertList(peerReviewed), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pollution")
    public ResponseEntity<List<DtoPollution>> showPollution(){

        pollutionCrawler.init("pollution+Covid19", pollutService);
        List<Pollution> pollution = pollutService.getAll();

        return new ResponseEntity<>(pollutionConverter.convertList(pollution), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/social")
    public ResponseEntity<List<DtoSocialImpact>> showSocial(){

        socialImpactCrawler.init("social+impact+Covid19",socialImpService);
        List<SocialImpact> socialImpact = socialImpService.getAll();

        return new ResponseEntity<>(socialImpactConverter.convertList(socialImpact), HttpStatus.OK);
    }



}
