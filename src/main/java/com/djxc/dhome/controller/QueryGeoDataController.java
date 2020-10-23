package com.djxc.dhome.controller;

import com.djxc.dhome.util.QueryPlaceByName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryGeoDataController {

    /**
     * 查询地名
     * @param placeName
     * @return
     */
    @RequestMapping(value = "/queryplace")
    public String queryPlaceByName(@RequestParam String placeName) {
        QueryPlaceByName queryPlace = new QueryPlaceByName(placeName);
        return queryPlace.queryPlace();
    }
}
