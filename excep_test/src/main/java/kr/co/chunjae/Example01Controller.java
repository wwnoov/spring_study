package kr.co.chunjae;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Example01Controller {

    public static Logger logger = LoggerFactory.getLogger(Example01Controller.class);

    @GetMapping("/exam01")
    public String requestmethod(Model model){

        logger.trace("Trace 메시지");
        logger.debug("Debug 메시지");
        logger.info("Info 메시지");
        logger.warn("Warn 메시지");
        logger.error("Error 메시지");

        return "webpage11_01";
    }

}
