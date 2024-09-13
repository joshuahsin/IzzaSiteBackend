package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ImageDao;
import com.entity.Image;
import com.repository.ImageRepository;

@Service
public class ImageDaoImpl implements ImageDao{
	@Autowired
	private ImageRepository imageRepo;

	@Override
	public List<Image> getAllImages() {
		return imageRepo.findAll();
	}

	@Override
	public Image getImageById(int id) {
		Optional<Image> image = imageRepo.findById(id);
		return image.get();
	}

	@Override
	public Image createImage(Image image) {
		return imageRepo.save(image);
	}

	@Override
	public Image updateImage(Image image) {
		return imageRepo.save(image);
	}

	@Override
	public boolean deleteImageById(int id) {
		imageRepo.deleteById(id);
		return true;
	}
	
}
