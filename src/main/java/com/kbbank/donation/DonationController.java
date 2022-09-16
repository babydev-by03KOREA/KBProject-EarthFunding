package com.kbbank.donation;

import com.kbbank.donation.dto.DonationDTO;
import com.kbbank.donation.service.DonationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

        List<DonationDTO> list = service.donationList();
        model.addAttribute("list", list);

        return "Donation/list";
    }

    @RequestMapping(value = "fundingProduct.do", method = RequestMethod.GET)
    public String fundingView(@RequestParam("n") int fundingNum, Model model) throws Exception {
        logger.info("funding List Approach");

        DonationDTO dto = service.goodsView(fundingNum);
        model.addAttribute("list", fundingNum);

        return "Donation/product";
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
