package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "image_memories")
@Data
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int alt;
	private String src;
	private String caption;
	
	public Image() {
	}
	
	public Image(int alt, String src, String caption) {
		this.alt = alt;
		this.src = src;
		this.caption = caption;
	}
	
	public int getalt() {
		return alt;
	}
	public void setalt(int alt) {
		this.alt = alt;
	}
	public String getsrc() {
		return src;
	}
	public void setsrc(String src) {
		this.src = src;
	}
	public String getcaption() {
		return caption;
	}
	public void setcaption(String caption) {
		this.caption = caption;
	}

	@Override
	public String toString() {
		return "Image [alt=" + alt + ", src=" + src + ", caption=" + caption + "]";
	}
}
