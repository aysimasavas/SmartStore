package com.aysimasavas.smartstore.controller;

import com.aysimasavas.smartstore.dto.CampaignRequest;
import com.aysimasavas.smartstore.dto.CampaignResponse;
import com.aysimasavas.smartstore.dto.CategoryResponse;
import com.aysimasavas.smartstore.service.CampaignService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    private final CampaignService campaignService;


    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }


    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CampaignResponse createCampaign(@RequestBody CampaignRequest request){
        return campaignService.createCampaign(request);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<CampaignResponse> getAllCampaign(){
        return campaignService.getAllCampaigns();
    }
}
