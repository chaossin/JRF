/**
 * 
 */
package com.tuin.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuin.base.BaseModel;

/**
 * @author jaeyong.pae
 *
 */
@RestController
@RequestMapping("/api/v1.0/base")
public class CodeController {

	@GetMapping("/code")
	public BaseModel getCode() {
		
		//log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		return new BaseModel();
	}
}
