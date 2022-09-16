package com.kbbank.donation.dao;

import com.kbbank.donation.dto.DonationDTO;

import java.util.List;

public interface IDonationDAO {
    // 상품목록
    public List<DonationDTO> donationList() throws Exception;

    // 상품조회
    public DonationDTO donationView(int gdsNum) throws Exception;
}
