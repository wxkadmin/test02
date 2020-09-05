package com.ecit.app;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecit.sbm.domain.City;
import com.ecit.sbm.mapper.CityMapper;
import com.ecit.sbm.service.ICityService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	
	@Autowired
	ICityService citySevice;
	
	@Autowired
	CityMapper cityMapper;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testQryCity(){
		City city = new City();
		city.setId(100L);
		List<City> cs = citySevice.qryCity(city);
		Assert.assertNotNull(cs);
	}
	
	@Test
	public void testSaveCity(){
		City c = new City();
		c.setName("ccccccc");
		c.setDistrict("A");
		c.setCountryCode("ARG");
		cityMapper.save(c);
		Assert.assertNotNull(c.getId());
	}

}
