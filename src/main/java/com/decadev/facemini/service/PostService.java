package com.decadev.facemini.service;

import com.decadev.facemini.entity.Post;
import com.decadev.facemini.entity.User;
import com.decadev.facemini.mapper.LikePosts;
import java.util.List;

public interface PostService {
    void addPost(User user, Post post);

    List<LikePosts> getAllPost(User user);

    void updatePost(Post post);

    void deletePost(Post post);

    Post getPostById(Long id);
}
