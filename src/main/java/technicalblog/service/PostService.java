package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<Post>();
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

        Post post4 = new Post();
        post4.setTitle("Who changed my nappy");
        post4.setBody("Cookie monster");
        post4.setDate(new java.util.Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;
    }

    public void createPost(Post post){
        System.out.println("Post created - ");
        post.setDate(new java.util.Date());

        System.out.println("post.getDate() = " + post.getDate());
        System.out.println("post.getTitle() = " + post.getTitle());
        System.out.println("post.getBody() = " + post.getBody());
    }

}
