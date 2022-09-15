package com.kbbank.donation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/donation/*")
public class DonationController {

    private static final Logger logger = LoggerFactory.getLogger(DonationController.class);

    @RequestMapping("FundingList.do")
    public String fundingList() {
        logger.info("펀딩하기 접근");

        return "donation/donationlist";
    }

    @RequestMapping("polarBear.do")
    public String PolarBear() {

        return "donation/polarBear";
    }
}
