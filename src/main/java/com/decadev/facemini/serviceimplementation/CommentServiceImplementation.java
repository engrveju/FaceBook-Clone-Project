package com.decadev.facemini.serviceimplementation;

import com.decadev.facemini.entity.Comment;
import com.decadev.facemini.entity.Post;
import com.decadev.facemini.repositories.CommentRepository;
import com.decadev.facemini.repositories.PostRepository;
import com.decadev.facemini.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService {


    CommentRepository commentRepository;
    PostRepository postRepository;

    @Autowired
    public CommentServiceImplementation(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    /**
     * Method to save a comment
     * @param comment the comment made
     */
    @Override
    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }


    /**
     * Method to find all the comments in a post
     * @param post the post that has the comments
     * @return the list of comments
     */
    @Override
    public List<Comment> findCommentByPost(Post post) {
        return commentRepository.findCommentByPost(post);
    }

    /**
     * Method to delete a comment by the id
     * @param commentId the id of the comment
     */
    @Override
    @Transactional
    public void deleteComment(Long commentId) {
        commentRepository.deleteCommentByCommentId(commentId);
    }

    /**
     * Method to delete all the comments in a post
     * @param post the post that contains all the comments
     */
    @Override
    @Transactional
    public void deleteAllCommentsInPost(Post post) {
        commentRepository.deleteAllByPost(post);
    }


//    @Override
//    public List<Comment> getAllComment() {
//        return commentRepository.findAllByCommentIdIsNotNullOrderByCommentIdDesc();
//    }

    /**
     * Method to save an  edited comment to the database
     * @param editedComment the edited comment
     */
    @Override
    public void updateComment(Comment editedComment) {
        commentRepository.save(editedComment);
    }

//    @Override
//    public void deleteComment(Comment comment) {
//        commentRepository.delete(comment);
//    }

    /**
     * Method to get a comment by the id
     * @param id the id of the comment
     * @return the comment
     */
    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findByCommentId(id);
    }
}
