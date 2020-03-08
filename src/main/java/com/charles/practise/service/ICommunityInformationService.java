package com.charles.practise.service;


import com.charles.practise.tools.ResultPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     *获取社区积水详情信息
     * @param areaName
     * @return
     */
    List<Map<String,Object>> getUserList(@Param(value = "areaName") String areaName);
}
