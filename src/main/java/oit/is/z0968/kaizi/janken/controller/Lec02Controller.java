package oit.is.z0968.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import oit.is.z0968.kaizi.janken.model.Janken;

@Controller
public class Lec02Controller {

  @GetMapping("/lec02")
  public String lec02() {
    return "lec02.html";
  }

  @GetMapping("/lec02_janken")
  public String lec02_janken(@RequestParam Integer jankenhand, ModelMap model) {

    Janken hand = new Janken(jankenhand);
    model.addAttribute("Hand", hand.hand());
    model.addAttribute("Result", hand.jankenresult());
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam final String loginuser, ModelMap model) {
    model.addAttribute("loginuser", loginuser);
    return "lec02.html";
  }
}
