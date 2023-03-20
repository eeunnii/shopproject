package com.mini.shop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mini.shop.domain.CustomerDTO;
import com.mini.shop.mapper.ShopMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ShopServiceImpl implements ShopService {
	
	
	private ShopMapper mapper;

	@Override
	public Map<String, Object> getProductList() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("productList", mapper.selectProductAll());
		result.put("total_product_count", mapper.selectProductcount());
		return result;
	}

	@Override
	public Map<String, Object> getCompanyList() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("companyList", mapper.selectCompanyAll());
		result.put("total_company_count", mapper.selectCompanyCount());
		return result;
	}
	
	@Override
	public Map<String, Object> getCustomerList() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("customerList", mapper.selectCustomerAll());
		result.put("total_customer_count", mapper.selectCustomerCount());
		return result;
	}
	
	
	@Override
	public Map<String, Object> getBuyingInfoList() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("buyingInfoList", mapper.selectBuyingInfoAll());
		result.put("total_buying_count", mapper.selectBuyingInfoCount());
		return result;
	}
	

	@Override
	public int addCustomer(String name, String tel) {
		CustomerDTO customerDTO = new CustomerDTO(name, tel);
		return mapper.insertCustomer(customerDTO);
	}
	
	
}
	