package com.dafang.monitor.nx.statistics.service.impl;

import cn.hutool.core.convert.Convert;
import com.dafang.monitor.nx.statistics.entity.po.DailyParam;
import com.dafang.monitor.nx.statistics.mapper.BaseMapper;
import com.dafang.monitor.nx.statistics.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseMapper mapper;

    @Override
    public List<Map<String, Object>> staInfoList(DailyParam params) {
        // 获取数据
        List<Map<String, Object>> resList = mapper.staInfoList(params);
        return resList;
    }

}
