package com.charles.practise.service.impl;


import com.charles.practise.mapper.CommunityInformationMapper;
import com.charles.practise.service.ICommunityInformationService;
import com.charles.practise.tools.ResultPage;
import com.charles.practise.tools.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wsl
 * @date 2020年3月7日15:35:03
 */

@Service
public class CommunityInformationServiceImpl implements ICommunityInformationService {

    @Autowired
    private CommunityInformationMapper communityInformationMapper;

    /**
     * 社区信息分页写法
     * @param areaName
     * @return ResultPage
     */
    @Override
    public ResultPage getUserList(String areaName, ResultPage query) {
        Integer currentPage = query.getCurrentPage();
        Integer limits = query.getLimits();
        System.out.println("111");
        Integer count = communityInformationMapper.getCommunityNum(areaName);
        if (count == null) {
            count = 0;
        }
        System.out.println("222");
        List<Integer> pageSize = ResultUtils.pageSize(currentPage, limits, count);
        List<Map<String, Object>> result = communityInformationMapper.getCommunityInf(areaName, pageSize.get(0), pageSize.get(1));
        ResultPage resultPage = ResultUtils.ofSuccessResultPage(result, result == null ? 0 : result.size(), limits,
                currentPage, pageSize.get(2), count);
        return resultPage;
    }

}
