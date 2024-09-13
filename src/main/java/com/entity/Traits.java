package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "traits")
@Data
public class Traits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String frontHTML;
	private String backHTML;
	
	public Traits() {
	}
	
	public Traits(int id, String frontHTML, String backHTML) {
		this.id = id;
		this.frontHTML = frontHTML;
		this.backHTML = backHTML;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrontHTML() {
		return frontHTML;
	}

	public void setFrontHTML(String frontHTML) {
		this.frontHTML = frontHTML;
	}

	public String getBackHTML() {
		return backHTML;
	}

	public void setBackHTML(String backHTML) {
		this.backHTML = backHTML;
	}

	@Override
	public String toString() {
		return "Traits [id=" + id + ", frontHTML=" + frontHTML + ", backHTML=" + backHTML + "]";
	}
	
}
