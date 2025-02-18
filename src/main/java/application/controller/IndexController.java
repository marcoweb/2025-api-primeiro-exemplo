package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {
    //private List<String> frutas = Arrays.asList("Maça", "Banana", "Morango");
    private List<String> frutas = new ArrayList<String>();

    @GetMapping
    public List<String> home() {
        return frutas;
        //return "home - GET";
    }

    @PostMapping
    public List<String> homePost(@RequestBody String fruta) {
        frutas.add(fruta);
        return frutas;
        // return "home - POST";
    }
}
