package com.decadev.facemini.service;

import com.decadev.facemini.entity.Post;
import com.decadev.facemini.entity.User;


public interface LikeService {
    boolean likePost(User user, Long postId, String action);
    void deleteAllLikesInPost(Post post);

}
