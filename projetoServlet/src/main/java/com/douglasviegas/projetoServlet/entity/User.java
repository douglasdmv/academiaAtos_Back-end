package com.douglasviegas.projetoServlet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USERS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
	
	@Id
	@Column(name="ID_USER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="USERNAME", nullable=false)
	private String username;
	
	@Column(name="PASSWORD", nullable=false)
	private String password;
}
