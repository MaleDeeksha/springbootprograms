package com.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Story")
public class Story {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int storyId;



@Column(name="story_name")
private String sName;

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinColumn(name = "book_id", referencedColumnName = "bookId")
private Book book;

public int getStoryId() {
	return storyId;
}

public void setStoryId(int storyId) {
	this.storyId = storyId;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

 





}
