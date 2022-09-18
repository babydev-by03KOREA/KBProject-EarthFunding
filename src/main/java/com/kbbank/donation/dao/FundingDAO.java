package com.kbbank.donation.dao;

import com.kbbank.donation.dto.FundingDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import java.util.List;

@Controller
public class FundingDAO implements IFundingDAO {

    @Inject
    private SqlSessionTemplate session;

    private final String statement = "Funding";

    @Override
    public List<FundingDTO> fundingList() throws Exception {
        return session.selectList(statement+".fundingList");
    }


    @Override
    public FundingDTO fundingView(int fundingNum) throws Exception {
        // SelectOne("option", selectOpt);
        return session.selectOne(statement+".fundingView", fundingNum);
    }

}
