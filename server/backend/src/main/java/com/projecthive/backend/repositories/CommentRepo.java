package com.projecthive.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecthive.backend.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}	
