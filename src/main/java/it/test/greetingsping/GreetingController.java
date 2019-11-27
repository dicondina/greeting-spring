package it.test.greetingsping;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {

    @ResponseBody
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "{name}")
    public ResponseEntity greeting(@PathVariable("name") String name) {

        String finalGreeting = name.isBlank() ? "Hello" : "Hello " + name ;

        return ResponseEntity.ok(finalGreeting);
    }
}
