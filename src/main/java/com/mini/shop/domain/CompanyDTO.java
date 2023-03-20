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
public class CompanyDTO {
	
	private int companyNo;
	private String companyName;
	private String companyLeader;
	private String companyTel;
	
	
	public CompanyDTO(String companyName, String companyLeader, String companyTel) {
		super();
		this.companyName = companyName;
		this.companyLeader = companyLeader;
		this.companyTel = companyTel;
	}
	
	

}
