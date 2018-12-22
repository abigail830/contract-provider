package com.github.abigail830.ContractProvider.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


@Ignore
@AutoConfigureMockMvc
public class StatusMonitorContractBaseController {

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(new StatusMonitorController());
    }
}