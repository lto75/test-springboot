package hello;

/**
 * Created by lionel on 22/07/2014.
 */

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class SampleController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        log.debug("coucou");
        return "Hello World!";
    }

    @RequestMapping("/simple")
    String testThymeLeaf(){
        return "simple";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
