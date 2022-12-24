package com.v2ssolutions.main.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestProcessingTimeInterceptor implements HandlerInterceptor {

	public RequestProcessingTimeInterceptor() {
		System.out.println("RequestProcessingTimeInterceptor");
	}

	private static final Logger logger = 
				LoggerFactory.getLogger(RequestProcessingTimeInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("preHandle start");
//		long startTime = System.currentTimeMillis();
//		logger.info(
//				"Request URL::" + request.getRequestURL().toString() 
//				+ ":: Start Time=" + System.currentTimeMillis());
//		request.setAttribute("startTime", startTime);
//		System.out.println("preHandle end");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		System.out.println("postHandle start");
//		System.out.println("Request URL::" + request.getRequestURL().toString() 
//				+ " Sent to Handler :: Current Time="
//				+ System.currentTimeMillis());
//		System.out.println("postHandle end");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("afterCompletion start");
//		long startTime = (Long) request.getAttribute("startTime");
//		logger.info("Request URL::" + request.getRequestURL().toString() 
//				+ ":: End Time=" + System.currentTimeMillis());
//		logger.info("Request URL::" + request.getRequestURL().toString() 
//				+ ":: Time Taken="
//				+ (System.currentTimeMillis() - startTime));
//		System.out.println("afterCompletion end");
	}
}


