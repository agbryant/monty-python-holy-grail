package com.agbryant.montypythonholygrail.controller;


import com.agbryant.montypythonholygrail.repository.LocationRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Log4j2
@RestController
public class PlotController {

	private LocationRepository locationRepository;

	@Autowired
	public PlotController(LocationRepository locationRepository){
		this.locationRepository = locationRepository;
	}

	@RequestMapping("/locations")
	public ModelAndView listKnights(Model model) {

		LOG.debug("Calling for Locations");

		Map<String, Object> params = new HashMap<>();
		params.put("locations", locationRepository.ohThePlacesWeWillGo());

		return new ModelAndView("locations", params);
	}
}
