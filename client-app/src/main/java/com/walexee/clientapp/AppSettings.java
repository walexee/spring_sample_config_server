package com.walexee.clientapp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@Data
@RefreshScope // needed to refresh this bean when a refresh is triggered from the RESTful endpoint
public class AppSettings {
    @Value("${rate}")
    private String rate;

    @Value("${lanecount}")
    private String laneCount;

    @Value("${tollstart}")
    private String tollStart;

    @Value("${connstring}")
    String connString;
}
