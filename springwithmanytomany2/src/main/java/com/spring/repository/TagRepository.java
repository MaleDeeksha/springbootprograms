package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Tags;

@Repository
public interface TagRepository extends JpaRepository<Tags, Long>{

}


