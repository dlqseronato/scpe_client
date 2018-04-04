package com.positivo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Amigo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String nome;
	private String telefone;
	private String src_foto;
	private String email;
	private Date dtAniversario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSrc_foto() {
		return src_foto;
	}
	
	public void setSrc_foto(String src_foto) {
		this.src_foto = src_foto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDtAniversario() {
		return dtAniversario;
	}
	
	public void setDtAniversario(Date dtAniversario) {
		this.dtAniversario = dtAniversario;
	}
}
