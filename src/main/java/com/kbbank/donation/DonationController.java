package com.kbbank.donation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/donation/*")
public class DonationController {

    private static final Logger logger = LoggerFactory.getLogger(DonationController.class);

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public String fundingList() throws Exception {
        logger.info("funding List Approach");

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
