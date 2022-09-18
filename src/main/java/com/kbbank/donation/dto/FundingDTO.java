package com.kbbank.donation.dto;

import java.util.Date;

public class FundingDTO {

    /*
    *  donationNum       number          not null,
    donationName      varchar2(50)    not null,
    donationMaxPrice     number          not null,
    donationDescription       varchar(1500)  not null,
    donationPurpose  VARCHAR2(1500)  not null,
    gdsDate      date            default sysdate,
    *  */

    private int fundingNum;
    private String fundingName;
    private int fundingMaxPrice;
    private String fundingDescription;
    private String fundingPurpose;
    private Date gdsDate;

    public int getFundingNum() {
        return fundingNum;
    }

    public void setFundingNum(int fundingNum) {
        this.fundingNum = fundingNum;
    }

    public String getFundingName() {
        return fundingName;
    }

    public void setFundingName(String fundingName) {
        this.fundingName = fundingName;
    }

    public int getFundingMaxPrice() {
        return fundingMaxPrice;
    }

    public void setFundingMaxPrice(int fundingMaxPrice) {
        this.fundingMaxPrice = fundingMaxPrice;
    }

    public String getFundingDescription() {
        return fundingDescription;
    }

    public void setFundingDescription(String fundingDescription) {
        this.fundingDescription = fundingDescription;
    }

    public String getFundingPurpose() {
        return fundingPurpose;
    }

    public void setFundingPurpose(String fundingPurpose) {
        this.fundingPurpose = fundingPurpose;
    }

    public Date getGdsDate() {
        return gdsDate;
    }

    public void setGdsDate(Date gdsDate) {
        this.gdsDate = gdsDate;
    }
}
