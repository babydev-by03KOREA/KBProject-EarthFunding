package com.kbbank.donation;

import com.kbbank.donation.dto.DonationDTO;
import com.kbbank.donation.service.DonationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/donation/*")
public class DonationController {
    private static final Logger logger = LoggerFactory.getLogger(DonationController.class);

    @Inject
    private DonationService service;

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public String fundingList(Model model) throws Exception {
        logger.info("funding List Approach");

        List<DonationDTO> dto = service.donationList();
        model.addAttribute("products", dto);

        return "Donation/list";
    }

    @RequestMapping(value = "polarBear.do", method = RequestMethod.GET)
    public String PolarBear() {
        logger.info("polarBear Donation Approach");

        return "Donation/polarBear";
    }

    @RequestMapping(value = "turtle.do", method = RequestMethod.GET)
    public String turtle() {
        logger.info("polarBear Donation Approach");

        return "Donation/turtle";
    }
}
