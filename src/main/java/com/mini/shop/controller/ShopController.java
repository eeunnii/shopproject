package com.mini.shop.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mini.shop.service.ShopService;

@Controller
public class ShopController {
	
	@Autowired
	private ShopService service;
	
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	
	
	// 단순이동 
	@GetMapping("/move/product") 
	public String moveproductlist(){
		return "/shop/productList";
	}
	
	// 상품 정보 조회(JSON)
	@ResponseBody
	@GetMapping(value="/product/list", produces="application/json")
	public Map<String, Object> productList() {
		return service.getProductList();
	}
	
	// 상품 insert
	@PutMapping("/customer/add") 
	public void updateCustomer(@RequestParam("name") String name, @RequestParam("tel") String tel) {
		service.addCustomer(name, tel);
	}

	
	
	// 단순이동
	@GetMapping("move/company") 
	public String movecompanyList(){
		return "/shop/companyList";
	}
	
	// 등록 업체 조회(JSON)
	@ResponseBody
	@GetMapping(value="/company/list", produces="application/json")
	public Map<String, Object> companyList() {
		return service.getCompanyList();
	}
	
	
	//단순이동
	@GetMapping("move/customer") 
	public String moveCustomerList(){
		return "/shop/customerList";
	}
	
	@ResponseBody
	@GetMapping(value="/customer/list", produces="application/json")
	public Map<String, Object> customerList() {
		return service.getCustomerList();
	}
	
	
	
	
	// 단순 이동
	@GetMapping("/move/buying")
	public String movebuyingInfoList() {
		return "/shop/buyingInfoList";
	}
	
	@ResponseBody
	@GetMapping(value="/buyingInfo/list", produces="application/json")
	public Map<String, Object> buyingInfoList() {
		return service.getBuyingInfoList();
	}
	
	
	
	

	
}
