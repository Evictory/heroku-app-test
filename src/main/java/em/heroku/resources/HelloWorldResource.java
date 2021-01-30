package em.heroku.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloWorldResource {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
