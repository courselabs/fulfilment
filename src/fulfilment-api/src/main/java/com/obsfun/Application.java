package fulfilment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
   
    @RequestMapping("/")
    public String home() {
        return "Nothing to see here, try /documents";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
