package com.decadev.facemini.repositories;

import com.decadev.facemini.entity.Post;
import com.decadev.facemini.entity.PostLikes;
import com.decadev.facemini.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<PostLikes, Long> {

    @Transactional
    void deletePostLikesByPostAndUser(Post post, User user);

    List<PostLikes> findAllByPost(Post post);

    void deleteAllByPost(Post post);

}
