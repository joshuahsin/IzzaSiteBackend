package com.dao;

import java.util.List;

import com.entity.Traits;

public interface TraitsDao {
	public List<Traits> getAllTraits();
	public Traits getTraitsById(int id);
	public Traits createTraits(Traits Traits);
	public Traits updateTraits(Traits Traits);
	public boolean deleteTraitsById(int id);
}
