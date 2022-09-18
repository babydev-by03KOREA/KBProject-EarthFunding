package com.kbbank.donation.service;

import com.kbbank.donation.dao.FundingDAO;
import com.kbbank.donation.dto.FundingDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class FundingService implements IFundingService {

    @Inject
    private FundingDAO dao;

    @Override
    public List<FundingDTO> fundingList() throws Exception {
        return dao.fundingList();
    }

    @Override
    public FundingDTO fundingView(int fundingNum) throws Exception {
        return dao.fundingView(fundingNum);
    }

    @Override
    public void fundingCreate(FundingDTO dto) throws Exception {
        dao.fundingCreate(dto);
    }
}
