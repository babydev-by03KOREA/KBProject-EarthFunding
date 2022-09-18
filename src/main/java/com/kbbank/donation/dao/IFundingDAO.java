package com.kbbank.donation.dao;

import com.kbbank.donation.dto.FundingDTO;

import java.util.List;

public interface IFundingDAO {
    // 상품목록
    public List<FundingDTO> fundingList() throws Exception;

    // 상품조회
    public FundingDTO fundingView(int fundingNum) throws Exception;
}
