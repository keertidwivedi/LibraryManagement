package org.library.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String userName;
	
	private String email;
	
	private String password;

	@ManyToMany
	@JoinTable(name="user_role",joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id") )
	private Role role;
	
	@OneToMany
	private Book book;
	
}
