package com.kbbank.donation.service;

import com.kbbank.donation.dao.DonationDAO;
import com.kbbank.donation.dto.DonationDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class DonationService implements IDonationService{

    @Inject
    private DonationDAO dao;

    @Override
    public List<DonationDTO> donationList() throws Exception {
        return dao.donationList();
    }
}
