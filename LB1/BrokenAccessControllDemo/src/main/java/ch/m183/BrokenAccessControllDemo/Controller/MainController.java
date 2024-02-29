package ch.m183.BrokenAccessControllDemo.Controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the index page!";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome: " + SecurityContextHolder.getContext().getAuthentication().getName() + " to the home page!";
    }

    @GetMapping("/authenticated")
    public String authenticated() {
        return "Welcome: " + SecurityContextHolder.getContext().getAuthentication().getName() + " to the authenticated page!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome: " + SecurityContextHolder.getContext().getAuthentication().getName() + " to the admin page! \n" +
                "Your role is: " + SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
    }
}
