package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import technicalblog.model.*;
import technicalblog.service.PostService;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")// home page
    //@RequestMapping(value = "message", method = RequestMethod.GET)
    public String getAllPosts(Model model){

        // Note that postService is not initialized with an object, Spring takes care of this in the
        // background. All I had to do was tell Spring that postService is an object which will be used.
        // Spring creates the object when needed and keeps track of it
        ArrayList<Post> posts = postService.getAllPosts();

        // addAttribute function hashes the text "posts" with the ArrayList object posts, so that Spring
        // can simply use this object when it is referenced using the name "posts". Check index.html
        model.addAttribute("posts",posts);

        return "index";
    }

    @RequestMapping("/1")
    //@RequestMapping(value = "message", method = RequestMethod.GET)
    public String getFirstPost(Model model){

        // Note that postService is not initialized with an object, Spring takes care of this in the
        // background. All I had to do was tell Spring that postService is an object which will be used.
        // Spring creates the object when needed and keeps track of it
        ArrayList<Post> posts = postService.getAllPosts();

        // addAttribute function hashes the text "post1" with the object posts.get(0), so that Spring
        // can simply use this object when it is referenced using the name post1. Check index2.html
        model.addAttribute("post1",posts.get( (int)( Math.random()*posts.size() ) ));

        return "index2";
    }

    @RequestMapping("/resp1")
    @ResponseBody
    //@RequestMapping(value = "message", method = RequestMethod.GET)
    public PostService testResponseBody(){

        return postService;
    }
}
