package com.tuin.domain.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author jaeyong.pae
 *
 */
@Getter
@Setter
public class CodeDTO {

	private String cdId;
	private String cdGrp;
	private String cdValue;
	private String cdDescr;
	private String regId;
	private Date regDttm;
	private String updId;
	private Date updDttm;
}
