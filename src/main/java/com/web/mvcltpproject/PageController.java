package com.web.mvcltpproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("grades")
    public String getGrades(Model model) {
        studentGrades.add(new Grade("Harry","Potions", "C-"));
        studentGrades.add(new Grade("Henry","Peterson", "A-"));
        studentGrades.add(new Grade("Robert","Smith", "B+"));

        model.addAttribute("grades",studentGrades);
        return "grades";
    }
    @GetMapping("shows")
    public String getShows(Model model) {
        model.addAttribute("bb", new Show("Breaking Bad","Ozymandias", "10.0"));
        model.addAttribute("aot1", new Show("Attack on Titan","Hero", "9.9"));
        model.addAttribute("aot2", new Show("Attack on Titan","Perfect Game", "9.9"));
        model.addAttribute("sw", new Show("Star Wars: The Clone Wars","Victory and Death", "9.9"));
        model.addAttribute("mr", new Show("Mr. Robot","407 Proxy Authentication Required", "9.9"));
        return "shows";
    }
    @GetMapping("conditionals")

    public String getConditionals(Model model) {
        model.addAttribute("cond",150);
        model.addAttribute("product","chair");
        return "conditionals";
    }

    @GetMapping("signs")
    public String getSigns(Model model) {
        model.addAttribute("sign",100);
        return "signs";
    }
    @GetMapping("dealer")
    public String getDeal(Model model) {
        model.addAttribute("budget", 1500);
        model.addAttribute("make", "ford");
        model.addAttribute("toyota", new Car("Toyota Corolla", 5000));
        model.addAttribute("volkswagen", new Car("Volkswagen Jetta", 6000));
        model.addAttribute("ford", new Car("Ford Escape", 7000));
        model.addAttribute("honda", new Car("Honda Civic", 8000));
        return "dealer";
    }
    @GetMapping("view")
    public String getView(Model model) {
        model.addAttribute("menu", "We sell chocolate rice cakes bubble tea");
        return "view";
    }
    @GetMapping("name")
    public String getName(Model model) {
        model.addAttribute("myName", "Ilya");
        return "name";
    }
    @GetMapping("home")
    public String getHome() {
        return "home";
    }
    @GetMapping("away")
    public String getAway() {
        return "away";
    }
}
