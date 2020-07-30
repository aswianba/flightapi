package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.FlightDetailsDao;
import com.example.demo.entity.FlightDetails;
import com.example.demo.request.SearchFields;

@Controller
@RequestMapping("/api")
public class FlightController {
	
	@Autowired
	private FlightDetailsDao flightDetailsDao;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/flightDetails")
	public ResponseEntity<?> getFlightDetails(@RequestBody SearchFields searchFields) {
		List<FlightDetails> details = flightDetailsDao.getFlightDetails(searchFields);
		
		List<FlightDetails> filteredDetails = details.stream().filter(flight -> {
			return flight.getDepatureTime().toLocalDate().isEqual(LocalDate.parse(searchFields.travelDate));
		}).collect(Collectors.toList());
		return new ResponseEntity<>(filteredDetails, HttpStatus.OK);
	}
	
}
