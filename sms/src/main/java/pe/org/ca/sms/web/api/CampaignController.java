/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.org.ca.sms.domain.Campaign;
import pe.org.ca.sms.service.CampaignServiceImpl;

/**
 *
 * @author itecs
 */
@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    CampaignServiceImpl campaignService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Campaign> allCampaigns() {
        return campaignService.findCampaigns();
    }

}
