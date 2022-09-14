package com.kbbank.donation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/donation/*")
public class DonationController {
    @RequestMapping("polarBear.do")
    public String PolarBear() {

        return "donation/polarBear";
    }
}
