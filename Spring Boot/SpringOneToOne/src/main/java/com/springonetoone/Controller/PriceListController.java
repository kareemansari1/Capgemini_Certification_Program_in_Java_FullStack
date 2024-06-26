package com.springonetoone.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springonetoone.Entity.PriceList;

@RestController
public class PriceListController {

	@GetMapping("/getpricelist")
	public Map<String, Integer> sayHello() {
	    HashMap<String, Integer> map = new HashMap<>();
	    PriceList p=new PriceList();
	    map.put("VEG_THALI", p.VEG_THALI);
	    return map;
	}
	
}
