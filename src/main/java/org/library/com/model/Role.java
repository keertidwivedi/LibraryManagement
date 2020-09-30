package org.library.com.model;

import javax.persistence.Id; 
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role {
	@Id
	private int id;
	
	private String name;
	
	
	@ManyToMany
	@JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "role_id" , referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "perm_id ", referencedColumnName = "id"))
	private Permission permisiion;
	
	@ManyToMany
	private User user;
}
