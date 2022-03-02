/**
 * 
 */
package com.tuin.base;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jaeyong.pae
 *
 */
@RestControllerAdvice
public class ApiAdvice {	
	
	@ExceptionHandler(Exception.class)
	public String exception() {
		return "error";
	}
}
