package com.kbbank.donation.dao;

import com.kbbank.donation.dto.DonationDTO;
import org.apache.ibatis.session.SqlSession;

import javax.inject.Inject;
import java.util.List;

public class DonationDAO implements IDonationDAO{

    @Inject
    private SqlSession session;

    private final String statement = "Donation";

    @Override
    public List<DonationDTO> donationList() throws Exception {
        return session.selectList(statement+".donationList");
    }

    /*
    List 구현 후 상세페이지 제작예정임.
    @Override
    public DonationDTO donationView(int gdsNum) throws Exception {
        return session.selectOne(statement+".");
    }
    */
}
