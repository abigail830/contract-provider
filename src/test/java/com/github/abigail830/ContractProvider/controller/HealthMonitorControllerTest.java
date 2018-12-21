package com.github.abigail830.ContractProvider.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.junit.jupiter.api.Assertions.*;

@Ignore
@AutoConfigureMockMvc
class HealthMonitorControllerTest {

    @BeforeEach
    void setUp() {
        RestAssuredMockMvc.standaloneSetup(new HealthMonitorController());
    }
}