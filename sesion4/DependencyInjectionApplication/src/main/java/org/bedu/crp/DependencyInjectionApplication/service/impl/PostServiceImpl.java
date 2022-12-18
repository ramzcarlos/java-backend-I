package org.bedu.crp.DependencyInjectionApplication.service.impl;

import org.bedu.crp.DependencyInjectionApplication.model.Post;
import org.bedu.crp.DependencyInjectionApplication.service.IPostService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
@Service
public class PostServiceImpl implements IPostService {

    private List<Post> posts;
    public  PostServiceImpl(){
        posts = new LinkedList<>();
        posts.add(new Post("hello world", 1));
        posts.add(new Post("Esto es una prueba", 2));
    }
    public List<Post> getAll(){
        return posts;
    }
}
