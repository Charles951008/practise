package com.charles.practise.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author wsl
 * @date
 */

/**
 * @author Charles
 * @Mapper 指定这是一个操作数据库的mapper
 */

public interface CommunityInformationMapper {
    /**
     * 获取单页查询结果
     * @param areaName
     * @param endItem
     * @param startItem
     * @return
     */
    public List<Map<String,Object>> getCommunityInf(@Param(value = "areaName") String areaName,
                                             @Param(value = "startItem") Integer startItem,
                                             @Param(value = "endItem") Integer endItem);

    /**
     * 获取全部数据条数
     * @param areaName
     * @return
     */
    Integer getCommunityNum(
            @Param(value = "areaName") String areaName);

    /**
     * 111
     * @param areaName
     * @return
     */
    List<Map<String,Object>> getUserList(@Param(value = "areaName") String areaName);
}
