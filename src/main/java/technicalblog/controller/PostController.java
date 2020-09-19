package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPosts(Model model){

        // Note that postService is not initialized with an object, Spring takes care of this in the
        // background. All I had to do was tell Spring that postService is an object which will be used.
        // Spring creates the object when needed and keeps track of it
        ArrayList<Post> posts = postService.getAllPosts();

        // addAttribute function hashes the text "post1" with the object posts.get(0), so that Spring
        // can simply use this object when it is referenced using the name post1
        model.addAttribute("post1",posts.get(2));

        return "posts";
    }

}
