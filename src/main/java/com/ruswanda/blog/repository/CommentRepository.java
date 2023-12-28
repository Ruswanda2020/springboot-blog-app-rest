package com.ruswanda.blog.repository;

import com.ruswanda.blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(Long id);

}
