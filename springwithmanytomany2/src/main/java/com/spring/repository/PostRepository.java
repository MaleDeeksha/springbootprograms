package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Posts;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long>{

}
