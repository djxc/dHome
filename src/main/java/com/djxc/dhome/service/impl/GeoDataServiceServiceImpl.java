package com.djxc.dhome.service.impl;

import com.djxc.dhome.entity.GeoLayerManage;
import com.djxc.dhome.entity.RasterGeoLayerManage;
import com.djxc.dhome.mapper.GeoLayerManageMapper;
import com.djxc.dhome.service.IGeoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoDataServiceServiceImpl implements IGeoDataService {

    @Autowired
    GeoLayerManageMapper layerManageMapper;

    @Override
    public boolean importRaster(String rasterPath) {
        System.out.println(rasterPath);
        return false;
    }

    @Override
    public boolean importVector(String vectorPath) {
        return false;
    }

    @Override
    public List<RasterGeoLayerManage> selectAllRasterLayers() {
        return layerManageMapper.getRasterLayers();
    }

    @Override
    public List<GeoLayerManage> selectAllVectorLayers() {
        return layerManageMapper.getVectorLayers();
    }
}
