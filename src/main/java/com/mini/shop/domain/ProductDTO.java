package com.mini.shop.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductDTO {
	
	private int productNo;
	private String productName;
	private int productPrice;
	private Date productDate;
	private int companyNo;
	private String companyName;
	
	
	public ProductDTO(String productName, int productPrice, int companyNo, String companyName) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.companyNo = companyNo;
		this.companyName = companyName;
	}
	
	
	
	

}
