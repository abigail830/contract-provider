package com.github.abigail830.ContractProvider.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthMonitorController {
    private static final Logger logger = LoggerFactory.getLogger(HealthMonitorController.class);


    @ApiOperation(value = "Get Health Status")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "请求成功")})
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getStatus() {
        return "{ \"status\": \"UP\" }";
    }

}
