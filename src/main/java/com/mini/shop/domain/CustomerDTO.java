package com.mini.shop.domain;

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
public class CustomerDTO {
	private int customerNo;
	private String customerName;
	private String customerTel;
	
	public CustomerDTO(String customerName, String customerTel) {
		super();
		this.customerName = customerName;
		this.customerTel = customerTel;
	}
	
	
	
}
