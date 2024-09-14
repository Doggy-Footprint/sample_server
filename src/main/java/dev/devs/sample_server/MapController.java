package dev.devs.sample_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    @GetMapping("/maps/sample")
    public String sample() {
        return "main_13-05";
    }
}
