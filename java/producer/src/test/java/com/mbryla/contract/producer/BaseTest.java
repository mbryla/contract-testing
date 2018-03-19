package com.mbryla.contract.producer;

import org.junit.Before;

import com.mbryla.contract.producer.echo.EchoController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new EchoController());
    }

}