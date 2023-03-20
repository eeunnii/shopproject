package com.mini.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mini.shop.mapper.ShopMapper;
import com.mini.shop.service.ShopService;

@SpringBootTest
class ShopApplicationTests {

	@Autowired
	private ShopMapper mapper;
	@Autowired
	private ShopService service;

	@Test
	public void 구매자추가테스트() {
		assertEquals(1, service.addCustomer("테스트_구매자", "테스트_번호")); // 전화번호는 - 없이 숫자로만 구성
	}
	
	@Test void 상품정보리스트조회하기() {
		assertNotNull(mapper.selectProductAll());
	}
	
	@Test void 등록업체리스트조회하기() {
		assertNotNull(mapper.selectCompanyAll());
	}
	
	@Test void 구매자리스트조회하기() {
		assertNotNull(mapper.selectCustomerAll());
	}
	
	@Test void 구매정보리스트조회하기() {
		assertNotNull(mapper.selectBuyingInfoAll());
		System.out.println("구매정보리스트조회");
	}
	

	
	

}
