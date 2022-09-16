package com.kbbank.donation.dto;

import java.util.Date;

public class DonationDTO {

    /*
    *  donationNum       number          not null,
    donationName      varchar2(50)    not null,
    donationMaxPrice     number          not null,
    donationDescription       varchar(1500)  not null,
    donationPurpose  VARCHAR2(1500)  not null,
    donationImg       varchar(200)   not null,
    gdsDate      date            default sysdate,
    *  */

    private int donationNum;
    private String donationName;
    private int donationMaxPrice;
    private String donationDescription;
    private String donationPurpose;
    private String donationImg;
    private Date gdsDate;

}
