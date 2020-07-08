package com.walexee.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rates")
public class RatesController {

    @Autowired
    private AppSettings appSettings;

    @GetMapping()
    public Map<String, String> GetRate() {
        Map<String, String> values = new HashMap<>();

        values.put("rate", appSettings.getRate());
        values.put("tollStart", appSettings.getTollStart());
        values.put("laneCount", appSettings.getLaneCount());
        values.put("connectionString", appSettings.getConnString());

        return values;
    }
}
