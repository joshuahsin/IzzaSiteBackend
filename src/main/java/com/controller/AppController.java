package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ImageDao;
import com.dao.TraitsDao;
import com.entity.Image;
import com.entity.Traits;

@RestController
@RequestMapping("/app")
@CrossOrigin("*")
public class AppController {
	@Autowired
	private ImageDao imageDao;
	
	@GetMapping("/allImages")
	public List<Image> getAllImages(){
		return imageDao.getAllImages();
	}
	
	@GetMapping("/getImageById/{id}")
	public Image getImageById(@PathVariable int id){
		return imageDao.getImageById(id);
	}
	
	@PostMapping("/createImage")
	public Image createImage(@RequestBody Image image) {
		//System.out.println(image.getImageDescription());
		return imageDao.createImage(image);
	}
	
	@PutMapping("/updateImage")
	public Image updateImage(@RequestBody Image image) {
		return imageDao.createImage(image);
	}
	
	@DeleteMapping("/deleteImageById/{id}")
	public boolean deleteImage(@PathVariable int id) {
		return imageDao.deleteImageById(id);
	}
	
	@Autowired
	private TraitsDao traitsDao;
	
	@GetMapping("/allTraits")
	public List<Traits> getAllTraits(){
		return traitsDao.getAllTraits();
	}
	
	@GetMapping("/getTraitById/{id}")
	public Traits getTraitsById(@PathVariable int id){
		return traitsDao.getTraitsById(id);
	}
	
	@PostMapping("/createTrait")
	public Traits createTraits(@RequestBody Traits traits) {
		//System.out.println(image.getImageDescription());
		return traitsDao.createTraits(traits);
	}
	
	@PutMapping("/updateTrait")
	public Traits updateTraits(@RequestBody Traits traits) {
		return traitsDao.createTraits(traits);
	}
	
	@DeleteMapping("/deleteTraitById/{id}")
	public boolean deleteTraits(@PathVariable int id) {
		return traitsDao.deleteTraitsById(id);
	}
}
