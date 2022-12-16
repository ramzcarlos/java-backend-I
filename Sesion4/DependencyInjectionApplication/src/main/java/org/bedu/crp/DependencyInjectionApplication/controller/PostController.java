package org.bedu.crp.DependencyInjectionApplication.controller;

import org.bedu.crp.DependencyInjectionApplication.model.Post;
import org.bedu.crp.DependencyInjectionApplication.service.IPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private IPostService postService;

    public  PostController(IPostService postService){

        this.postService=postService;
    }
    @GetMapping()
    public List<Post> getAll(){
        return postService.getAll();

    }
}
