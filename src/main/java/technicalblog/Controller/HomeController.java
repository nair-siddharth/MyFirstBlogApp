package technicalblog.Controller;

import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.Model.*;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")// home page
    //@RequestMapping(value = "message", method = RequestMethod.GET)
    public String getAllPosts(Model model){
        // dummy Post object created and then returned, as an example
        Post post1 = new Post();
        post1.setTitle("How to change a light bulb");
        post1.setBody("Blubber Nupple");
        post1.setDate(new java.util.Date());

        Post post2 = new Post();
        post2.setTitle("How to break an egg");
        post2.setBody("Blubber Nupple - 3 cups");
        post2.setDate(new java.util.Date());

        Post post3 = new Post();
        post3.setTitle("Why change a bulb");
        post3.setBody("Duh, cookies");
        post3.setDate(new java.util.Date());

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);

        return "index";
    }
}
