package metrics.controller;

import metrics.dto.GreetingDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(value = "/greeting")
    public GreetingDTO greeting(@RequestParam(name="name", required=false, defaultValue="world") String name) {
        return new GreetingDTO(name);
    }

}
