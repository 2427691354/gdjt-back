package com.example.gdjtback.service.impl;

import com.example.gdjtback.entity.PressureData;
import com.example.gdjtback.mapper.PressureDataMapper;
import com.example.gdjtback.service.PressureDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PressureDataServiceImpl implements PressureDataService {

    @Autowired
    PressureDataMapper pressureDataMapper;
    @Override
    public List<PressureData> findWeeklyPressureDataByDeviceID(String deviceID,String sensorID) {
        return pressureDataMapper.findWeeklyPressureDataByDeviceID(deviceID,sensorID);
    }

    @Override
    public List<PressureData> getDeviceInfoByDeviceID(String deviceID) {
        return pressureDataMapper.getDeviceInfoByDeviceID(deviceID);
    }
}
