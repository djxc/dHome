package com.djxc.dhome.mapper;

import com.djxc.dhome.entity.GeoLayerManage;
import com.djxc.dhome.entity.RasterGeoLayerManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 地理图层数据管理
 */
@Mapper
public interface GeoLayerManageMapper {

    @Select("select id, name, path, resolution from raster_layer_manage")
    List<RasterGeoLayerManage> getRasterLayers();

    @Select("select id, name from vector_layer_manage")
    List<GeoLayerManage> getVectorLayers();

    boolean insertRasterLayer(GeoLayerManage rasterLayer);
    boolean insertVectorLayer(GeoLayerManage vectorLayer);
}
