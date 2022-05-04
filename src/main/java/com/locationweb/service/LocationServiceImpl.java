package com.locationweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb.entities.Location;
import com.locationweb.repositories.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	 
	@Autowired
	private LocationRepository locationRepo;
	
	
	@Override
	public void savePage(Location location) {
		locationRepo.save(location);
		

	}


	@Override
	public List<Location> getAllLocation() {
		List<Location> location=locationRepo.findAll();
		return location;
	}





	@Override
	public void deleteLocationById(long id) {
		locationRepo.deleteById(id);
		
	}


	@Override
	public Location updateLocationById(long id) {
		Optional<Location> findById = locationRepo.findById(id);
	 Location location = findById.get();
	 return location;
	}


	

}
