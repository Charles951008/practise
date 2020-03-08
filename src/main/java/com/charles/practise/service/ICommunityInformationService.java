package com.charles.practise.service;


import com.charles.practise.tools.ResultPage;
import org.apache.ibatis.annotations.Param;

/**
 * @author wsl
 * @date
 */

public interface ICommunityInformationService {
    /**
     * 111
     *
     * @param areaName
     * @param query
     * @return
     */
    public ResultPage getUserList(@Param(value = "areaName") String areaName,
                                  @Param(value = "query") ResultPage query);
}
