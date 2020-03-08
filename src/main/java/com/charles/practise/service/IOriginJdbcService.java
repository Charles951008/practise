package com.charles.practise.service;


import com.charles.practise.pojos.OriginJdbcObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Charles
 * @date 2020年3月7日12:04:33
 */
public interface IOriginJdbcService {
    /**
     *
     * @param areaName
     * @param objectId
     * @return
     */
    List<OriginJdbcObject> getOriginJdbcData(@Param(value = "areaName") String areaName,
                                             @Param(value = "objectId") Integer objectId);
}
