package com.sgte.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgte.domain.Product;

@RestController
@RequestMapping("/product")
public class SgteController {
	
	@GetMapping("/getAbc")
	public String getProduct() {
		return "enadu";
	}
	
	@GetMapping("/allproducts")
	public List<Product> allProducts() {
		
		List<Product> listPrds = new ArrayList<Product>();
		listPrds.add(new Product("eenadu","Indian politics","18-12-2021"));
		listPrds.add(new Product("thatstelugu","Local news","18-12-2021"));
		listPrds.add(new Product("tupaki","Sports news","18-12-2021"));
		
		return listPrds;
	}
	
	@GetMapping("/getAbc/{name}")
	public Product getProduct(@PathVariable("name") String name) {
		List<Product> listPrds = new ArrayList<Product>();
		listPrds.add(new Product("eenadu","Indian politics","18-12-2021"));
		listPrds.add(new Product("thatstelugu","Local news","18-12-2021"));
		listPrds.add(new Product("tupaki","Sports news","18-12-2021"));
		
		for(Product prd : listPrds) {
			if(prd.getName().equals(name)) {
				return prd;
			}
		}
		return null;
	}
	
	@GetMapping("/getAbcd")
	public Product getProductByRequest(@RequestParam String name) {
		List<Product> listPrds = new ArrayList<Product>();
		listPrds.add(new Product("eenadu","Indian politics","18-12-2021"));
		listPrds.add(new Product("thatstelugu","Local news","18-12-2021"));
		listPrds.add(new Product("tupaki","Sports news","18-12-2021"));
		
		for(Product prd : listPrds) {
			if(prd.getName().equals(name)) {
				return prd;
			}
		}
		return null;
	}
	
	
	

}
