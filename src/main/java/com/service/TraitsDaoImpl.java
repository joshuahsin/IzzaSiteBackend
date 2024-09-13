package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TraitsDao;
import com.entity.Traits;
import com.repository.TraitsRepository;

@Service
public class TraitsDaoImpl implements TraitsDao {
	@Autowired
	private TraitsRepository traitsRepo;
	
	@Override
	public List<Traits> getAllTraits() {
		return traitsRepo.findAll();
	}

	@Override
	public Traits getTraitsById(int id) {
		Optional<Traits> Traits = traitsRepo.findById(id);
		return Traits.get();
	}

	@Override
	public Traits createTraits(Traits Traits) {
		return traitsRepo.save(Traits);
	}

	@Override
	public Traits updateTraits(Traits Traits) {
		return traitsRepo.save(Traits);
	}

	@Override
	public boolean deleteTraitsById(int id) {
		traitsRepo.deleteById(id);
		return true;
	}
}
