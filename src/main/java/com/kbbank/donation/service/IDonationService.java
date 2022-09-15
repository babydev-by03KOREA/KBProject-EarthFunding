package com.kbbank.donation.service;

import com.kbbank.donation.dto.DonationDTO;

import java.util.List;

public interface IDonationService {
//    목록
    public List<DonationDTO> donationList() throws Exception;
}
