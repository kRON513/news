package com.example.blog.controllers.repo;

import com.example.blog.controllers.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post , Long> {
}