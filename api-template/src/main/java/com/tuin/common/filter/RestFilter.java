/**
 * 
 */
package com.tuin.common.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import lombok.extern.log4j.Log4j2;

/**
 * @author jaeyong.pae
 *
 */
@Log4j2
public class RestFilter extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;		
		log.info(String.format("RestFilter : %s %s %s", httpRequest.getMethod(), httpRequest.getRequestURL().toString(), httpRequest.getHeader("User-Agent")));		
	}
}
