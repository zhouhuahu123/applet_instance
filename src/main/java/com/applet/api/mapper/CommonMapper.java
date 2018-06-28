package com.applet.api.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by changjingyuan on 2016/5/11.
 */
public interface CommonMapper {

    public Map selectSingleLine(String sqlStr);

    public List<Map> selectListMap(String sqlStr);

    public Integer selectCount(String sql);

    public Integer insertBatch(String sql);

    public Integer updateBatch(String sql);
}
