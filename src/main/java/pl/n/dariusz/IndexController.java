package pl.n.dariusz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DariuszN on 04.12.2016.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "/src/index";
    }
}
