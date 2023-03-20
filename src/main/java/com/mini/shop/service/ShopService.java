package com.mini.shop.service;

import java.util.Map;

public interface ShopService {
	
	public Map<String, Object> getProductList();
	public Map<String, Object> getCompanyList();
	public Map<String, Object> getCustomerList();
	public Map<String, Object> getBuyingInfoList();
	
	
	
	

	public int addCustomer(String name, String tel);
}
