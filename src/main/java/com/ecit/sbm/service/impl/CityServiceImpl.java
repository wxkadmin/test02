package com.ecit.sbm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecit.sbm.domain.City;
import com.ecit.sbm.mapper.CityMapper;
import com.ecit.sbm.service.ICityService;


@Service
public class CityServiceImpl implements ICityService{
	
	@Autowired
	private CityMapper cityMapper;

	@Override
	public List<City> qryCity(City city) {
		return cityMapper.qryCity(city);
	}

}
