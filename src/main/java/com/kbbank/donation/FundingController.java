package com.kbbank.donation;

import com.kbbank.donation.dto.FundingDTO;
import com.kbbank.donation.service.FundingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/funding/*")
public class FundingController {
    private static final Logger logger = LoggerFactory.getLogger(FundingController.class);

    @ModelAttribute("cp")
    public String getContextPath(HttpServletRequest request) {
//		정적파일 위치를 ${cp}로 맵핑해줌.
        return request.getContextPath();
    }

    @Inject
    private FundingService service;

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public String donationList(Model model) throws Exception {
        logger.info("funding List Approach");

        List<FundingDTO> list = service.fundingList();
        model.addAttribute("list", list);

        return "funding/list";
    }

    @RequestMapping(value = "polarBear.do", method = RequestMethod.GET)
    public String polarBear(Model model) throws Exception {
        logger.info("funding Several View > polarBear.do Approach");

        return "funding/polarBear";
    }

    @RequestMapping(value = "turtle.do", method = RequestMethod.GET)
    public String turtle(Model model) throws Exception {
        logger.info("funding Several View > turtle.do Approach");
        return "funding/turtle";
    }

    @RequestMapping(value = "factory.do", method = RequestMethod.GET)
    public String factory(Model model) throws Exception {
        logger.info("funding Several View > factory.do Approach");
        return "funding/factory";
    }

    @RequestMapping(value = "simulation.do", method = RequestMethod.GET)
    public String simulation(Model model) throws Exception{

        return "funding/GlobalWarming";
    }

}
