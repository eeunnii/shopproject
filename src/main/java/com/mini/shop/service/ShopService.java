package com.mini.shop.service;

import java.util.Map;

public interface ShopService {
	
	public Map<String, Object> getProductList();
	public Map<String, Object> getCompanyList();
	public Map<String, Object> getCustomerList();
	public Map<String, Object> getBuyingInfoList();
	
	public int addCustomer(String name, String tel);
	public int addCompany(String companyName, String companyLeader, String companyTel);
	public int addProduct(String productName, int productPrice, int companyNo, String companyName);
	public int addBuyingInfo(int customerNo, int productNo);
}
