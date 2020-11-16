package oit.is.z0968.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0968.kaizi.janken.model.Janken;
import oit.is.z0968.kaizi.janken.model.Entry;

@Controller
public class Lec02Controller {

  @Autowired
  private Entry entry;

  @GetMapping("/lec02")
  public String lec02(Principal prin, ModelMap model) {
    String loginuser = prin.getName();
    this.entry.addUser(loginuser);
    model.addAttribute("entry", this.entry);
    model.addAttribute("Loginuser", loginuser);
    return "lec02.html";
  }

  @GetMapping("/lec02/janken")
  public String lec02_janken(@RequestParam Integer jankenhand, ModelMap model) {

    Janken hand = new Janken(jankenhand);
    model.addAttribute("Hand", hand.hand());
    model.addAttribute("Result", hand.jankenresult());
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam String loginuser, ModelMap model) {
    model.addAttribute("loginuser", loginuser);
    return "lec02.html";
  }
}
