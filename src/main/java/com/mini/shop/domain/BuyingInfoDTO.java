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
public class BuyingInfoDTO {
	
	private int buyingNo;
	private Date buyingDate;
	private int customerNo;
	private int productNo;
	private ProductDTO productDTO;
	private CustomerDTO customerDTO;
	
	public BuyingInfoDTO(int customerNo, int productNo) {
		super();
		this.customerNo = customerNo;
		this.productNo = productNo;
	}

}
