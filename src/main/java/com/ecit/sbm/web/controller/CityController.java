package com.ecit.sbm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecit.sbm.domain.City;
import com.ecit.sbm.service.ICityService;

@Controller
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private ICityService cityService;
	
	@RequestMapping("/city/qry/{id}")
	@ResponseBody
	public String qryCity(@PathVariable("id")Long id){
		City c = new City();
		c.setId(id);
		List<City> cs = cityService.qryCity(c);
		if(cs !=  null && cs.size() > 0){
			return cs.get(0).getName();
		}
		return "未找到";
	}

}
