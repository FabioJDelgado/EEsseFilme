package com.api.eessefilme.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.eessefilme.entities.Comment;
import com.api.eessefilme.entities.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

	Page<Comment> findByUser(User user, Pageable pageable);
}
