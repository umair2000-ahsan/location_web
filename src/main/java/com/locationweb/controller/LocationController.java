package com.locationweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.locationweb.dto.LocationData;
import com.locationweb.entities.Location;
import com.locationweb.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	
    @RequestMapping("/show")
	public String showLocationPage() {
		return "create_location";
	}
	
    
    @RequestMapping("/savePage")
    public String savePage(@ModelAttribute("loc") Location location,ModelMap model) {
    	
    	model.addAttribute("msg", "Location is saved....");
    	locationService.savePage(location);
    	return "create_location";
    	
    }
	
    @RequestMapping("listall")
    public String listAll(ModelMap model) {
    	List<Location> location = locationService.getAllLocation();
    	model.addAttribute("location", location);
    	return "search";    
    }
     
    @RequestMapping("delete")
    public String delteLocation(@RequestParam("id") long id,ModelMap model) {
    	locationService.deleteLocationById(id); 
    	List<Location> location = locationService.getAllLocation();
    	model.addAttribute("location", location); 
    	return "search"; 
    } 
    @RequestMapping("update")
    public String updateLocation(@RequestParam("id") long id,ModelMap model) {
    	Location location = locationService.updateLocationById(id); 
    	model.addAttribute("location",location);
    	return "update_location";
    	
    } 
    @RequestMapping("/updateLocation")
    public String updateLocation(@ModelAttribute("loc") Location location,ModelMap model) {
    	
    	model.addAttribute("msg", "Location is updated....");
    	locationService.savePage(location);
    	return "update_location";
    	
    }
	
}
