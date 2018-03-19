package com.mbryla.contract.producer.echo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class EchoController {

    @GetMapping(value = "/echo/{value}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Echo postEndpoint(@PathVariable(name = "value") String value) {
        return new Echo(value);
    }

}
