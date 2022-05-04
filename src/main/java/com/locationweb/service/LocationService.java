package com.locationweb.service;

import java.util.List;

import com.locationweb.entities.Location;

public interface LocationService {
 
	

	public void savePage(Location location);

	public List<Location> getAllLocation();



	public void deleteLocationById(long id);

	public Location updateLocationById(long id);

	
	
	
}
