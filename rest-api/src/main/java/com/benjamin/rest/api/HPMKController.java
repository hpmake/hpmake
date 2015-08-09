package com.benjamin.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HPMK")
public class HPMKController {

    @RequestMapping("version")
    public String HPMKVersion() {
        return "0.0.1.SNAPSHOT!";
    }
}
