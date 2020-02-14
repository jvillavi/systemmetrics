package com.jvillavi.components;

import com.jvillavi.entities.GeneralInfo;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Metrics {

    public Metrics(){

    }

    public GeneralInfo getGeneralInfo(){
        var info = new GeneralInfo();

        info.setOs(System.getProperty("os.name"));
        info.setDistribution(System.getProperty("os.version"));
        info.setSystemDate(new Date());

        return info;
    }

}
