package com.example.demo.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FlightDetails;
import com.example.demo.request.SearchFields;




@Repository
public class FlightDetailsDao{
	
	@Autowired
	public EntityManager entitymanager;

	@Transactional
	public List getFlightDetails(SearchFields searchData) {
		List<FlightDetails> flightDetails = new ArrayList<>();
		
		try {
		
		Query query = entitymanager.createQuery("from FlightDetails fs where "
				+ "fs.sourceCity=:sourceCity "
				+ "and fs.destinationCity=:destinationCity ");
		
		query.setParameter("sourceCity",searchData.sourceCity);
		query.setParameter("destinationCity",searchData.destinationCity);
		flightDetails = query.getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flightDetails;
		
		 
	}
}
