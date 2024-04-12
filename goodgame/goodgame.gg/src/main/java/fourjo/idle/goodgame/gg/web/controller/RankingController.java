package fourjo.idle.goodgame.gg.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class RankingController {
    @GetMapping("/index")
    public String ranking () {return "ranking/index.html";}
}
