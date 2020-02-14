package com.jvillavi.systemmetrics;

import com.jvillavi.components.Metrics;
import com.jvillavi.entities.GeneralInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    private final Metrics metrics;

    MetricsController(Metrics metrics){
        this.metrics = metrics;
    }

    @GetMapping("/info/general")
    GeneralInfo getGeneralInfo(){
        return metrics.getGeneralInfo();
    }

}
