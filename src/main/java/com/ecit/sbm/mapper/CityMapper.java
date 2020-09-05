package com.ecit.sbm.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecit.sbm.domain.City;

@Repository
public interface CityMapper {
	
	public int save(City city);
	
	public List<City> qryCity(City city);

}
