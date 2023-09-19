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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
    public ModelAndView donationList(Model model) throws Exception {
        ModelAndView mav = new ModelAndView("funding/list");
        List<FundingDTO> fundingProjects = service.fundingList();
        mav.addObject("fundingProjects", fundingProjects);
        return mav;
    }

    // 상품 등록
    @RequestMapping(value = "createFunding.do", method = RequestMethod.GET)
    public String getCreateFunding(Model model) throws Exception {
        logger.info("get createFunding.do");

        return "funding/createFunding";
    }


    // 상품 등록
    @RequestMapping(value = "createFundingSuccess.do", method = RequestMethod.POST)
    public String postCreateFunding(FundingDTO dto, HttpServletRequest request) throws Exception {

        MultipartFile file = dto.getImageFile();
        String savePath = request.getSession().getServletContext().getRealPath("/resources/view/img");

        String originalFileName = file.getOriginalFilename();
        String savedFileName = UUID.randomUUID().toString() + "_" + originalFileName;

        File targetFile = new File(savePath, savedFileName);
        try {
            file.transferTo(targetFile);  // 실제 파일 저장
            dto.setSavedImageName(savedFileName);  // DB에 저장될 파일 이름 설정
            service.fundingCreate(dto);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "member/JoinSuccess";
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
    public String simulation(Model model) throws Exception {

        return "funding/GlobalWarming";
    }

}
