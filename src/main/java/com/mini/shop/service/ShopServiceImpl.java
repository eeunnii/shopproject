package com.mini.shop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mini.shop.domain.BuyingInfoDTO;
import com.mini.shop.domain.CompanyDTO;
import com.mini.shop.domain.CustomerDTO;
import com.mini.shop.domain.ProductDTO;
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
	

	// 구매자 추가
	@Override
	public int addCustomer(String name, String tel) {
		CustomerDTO customerDTO = new CustomerDTO(name, tel);
		return mapper.insertCustomer(customerDTO);
	}
	
	// 등록업체 추가
	public int addCompany(String companyName, String companyLeader, String companyTel) {
		CompanyDTO companyDTO = new CompanyDTO(companyName, companyLeader, companyTel);
		return mapper.insertCompany(companyDTO);
	}
	
	// 상품 추가
	@Override
	public int addProduct(String productName, int productPrice, int companyNo, String companyName) {
		ProductDTO prodcutdtoDTO = new ProductDTO(productName, productPrice, companyNo, companyName);
		return mapper.insertProduct(prodcutdtoDTO);
	}
	
	// 구매정보 추가
	@Override
	public int addBuyingInfo(int customerNo, int productNo) {
		BuyingInfoDTO buyingInfoDTO = new BuyingInfoDTO(customerNo, productNo);
		return mapper.insertBuyingInfo(buyingInfoDTO);
	}
	
}
	