package fr.test.controler.hello;

/**
 * Created by lionel on 22/07/2014.
 */

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
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
}
