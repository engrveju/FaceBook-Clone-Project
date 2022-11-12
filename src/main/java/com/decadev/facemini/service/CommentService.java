package com.decadev.facemini.service;

import com.decadev.facemini.entity.Comment;
import com.decadev.facemini.entity.Post;

import java.util.List;

public interface CommentService {
    void updateComment(Comment editedComment);


    Comment getCommentById(Long id);

    void saveComment(Comment comment);

    List<Comment> findCommentByPost(Post post);

    void deleteComment(Long commentId);

    void deleteAllCommentsInPost(Post post);
}
