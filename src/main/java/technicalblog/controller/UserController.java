package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;

@Controller
public class UserController {

    // referenced in layout.html : fragment = "logged-out"
    // If button LOGIN is clicked, DS is sent here, and users/login.html is returned
    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    // referenced in layout.html : fragment = "logged-out"
    // If button LOGIN is clicked, DS is sent here, and users/register.html is returned
    @RequestMapping("users/register")
    public String register(){
        return "users/register";
    }

    // referenced in login.html : fragment = "logged-out"
    // Similar to overloading, based on the method, this users/login is called instead of the one above
    // Redirected to /posts, which is a URL defined in PostController
    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginUser(User user){
        //System.out.println("user.getUserName() = " + user.getUserName());
        //System.out.println("user.getPassword() = " + user.getPassword());
        return "redirect:/posts";
    }

    // referenced in layout.html : fragment = "logged-in"
    // Similar to overloading, based on the method, this users/logout is called instead of the one above
    // Redirected to /, which is a URL defined in PostController
    @RequestMapping(value = "users/logout", method = RequestMethod.POST)
    public String logoutUser(){
        System.out.println("logout");
        return "redirect:/";
        //return "redirect:/users/login";
    }
}
