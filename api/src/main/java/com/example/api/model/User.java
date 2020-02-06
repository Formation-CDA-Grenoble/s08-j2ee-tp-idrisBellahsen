package com.example.api.model;


import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    private Set<Article> article;

    public String getname() {
    	return this.name;
    }
    public void setname(String name) {
    	this.name = name;
    }

    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public long getId() {
    	return this.id;
    }
    public void setId(long id) {
    	this.id = id;
    }

}
