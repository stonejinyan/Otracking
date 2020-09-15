package com.otracking.tool;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

public class ExtendStrutsFilter extends StrutsPrepareAndExecuteFilter {
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
	        throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req; // 不过滤的url,可以自行添加

		if (request.getRequestURI().indexOf("Service") != -1) {
			chain.doFilter(req, res);

		} else {

			// System.out.println("使用默认的过滤器");

			super.doFilter(request, res, chain);

		}

	}

}
