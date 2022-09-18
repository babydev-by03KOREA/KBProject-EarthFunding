package com.kbbank.donation.service;

import com.kbbank.donation.dto.FundingDTO;

import java.util.List;

public interface IFundingService {
//    목록
    public List<FundingDTO> fundingList() throws Exception;

    // 상품조회
    public FundingDTO fundingView(int fundingNum) throws Exception;
}
