package org.library.com.model;

import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bookName;
	
	private String  bookAuthor;
	
	private int bookCode;
	
	@OneToMany
	private Comment comment;
	
	private Rating rating;
}
