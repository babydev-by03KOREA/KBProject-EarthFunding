package com.kbbank.donation.dto;

import java.util.Date;

public class DonationDTO {

    /* fundingNum       number          not null,
    fundingName      varchar2(50)    not null,
    fundingMaxPrice     number          not null,
    fundingDes       varchar(1500)    null,
    fundingImg       varchar(200)    null,
    gdsDate      date            default sysdate, */

    private int fundingNum;
    private String fundingName;
    private int fundingMaxPrice;
    private String fundingDes;
    private String fundingImg;
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

    public String getFundingDes() {
        return fundingDes;
    }

    public void setFundingDes(String fundingDes) {
        this.fundingDes = fundingDes;
    }

    public String getFundingImg() {
        return fundingImg;
    }

    public void setFundingImg(String fundingImg) {
        this.fundingImg = fundingImg;
    }

    public Date getGdsDate() {
        return gdsDate;
    }

    public void setGdsDate(Date gdsDate) {
        this.gdsDate = gdsDate;
    }

}
