package com.mini.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mini.shop.domain.BuyingInfoDTO;
import com.mini.shop.domain.CompanyDTO;
import com.mini.shop.domain.CustomerDTO;
import com.mini.shop.domain.ProductDTO;

@Mapper
public interface ShopMapper {
	
	public List<ProductDTO> selectProductAll();
	public int selectProductcount();
	
	public List<CompanyDTO> selectCompanyAll();
	public int selectCompanyCount();
	
	public List<CompanyDTO> selectCustomerAll();
	public int selectCustomerCount();
	
	public List<BuyingInfoDTO> selectBuyingInfoAll();
	public int selectBuyingInfoCount();
	
	
	
	
	public int insertCustomer(CustomerDTO customerDTO);
	
	
}
