package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tags")
public class Tags {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy="tags")
	private Set<Posts>p=new HashSet<>();
	public Tags() {
		
	}
	public Tags(String name) {
		super();
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Posts> getP() {
		return p;
	}
	public void setP(Set<Posts> p) {
		this.p = p;
	}


	
}
