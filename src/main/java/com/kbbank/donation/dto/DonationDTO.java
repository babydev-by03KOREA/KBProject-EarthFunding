package com.kbbank.donation.dto;

import java.util.Date;

public class DonationDTO {

    /*
    *  donationNum       number          not null,
    donationName      varchar2(50)    not null,
    donationMaxPrice     number          not null,
    donationDescription       varchar(1500)  not null,
    donationPurpose  VARCHAR2(1500)  not null,
    gdsDate      date            default sysdate,
    *  */

    private int donationNum;
    private String donationName;
    private int donationMaxPrice;
    private String donationDescription;
    private String donationPurpose;
    private Date gdsDate;

    public int getDonationNum() {
        return donationNum;
    }

    public void setDonationNum(int donationNum) {
        this.donationNum = donationNum;
    }

    public String getDonationName() {
        return donationName;
    }

    public void setDonationName(String donationName) {
        this.donationName = donationName;
    }

    public int getDonationMaxPrice() {
        return donationMaxPrice;
    }

    public void setDonationMaxPrice(int donationMaxPrice) {
        this.donationMaxPrice = donationMaxPrice;
    }

    public String getDonationDescription() {
        return donationDescription;
    }

    public void setDonationDescription(String donationDescription) {
        this.donationDescription = donationDescription;
    }

    public String getDonationPurpose() {
        return donationPurpose;
    }

    public void setDonationPurpose(String donationPurpose) {
        this.donationPurpose = donationPurpose;
    }


    public Date getGdsDate() {
        return gdsDate;
    }

    public void setGdsDate(Date gdsDate) {
        this.gdsDate = gdsDate;
    }
}
