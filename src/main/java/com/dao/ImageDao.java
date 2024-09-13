package com.dao;

import java.util.List;

import com.entity.Image;

public interface ImageDao {
	public List<Image> getAllImages();
	public Image getImageById(int id);
	public Image createImage(Image image);
	public Image updateImage(Image image);
	public boolean deleteImageById(int id);
}
