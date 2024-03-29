package com.prodapt.ReferTalents.interceptor;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.springframework.stereotype.Component;
	import org.springframework.web.servlet.HandlerInterceptor;
	import org.springframework.web.servlet.ModelAndView;

	@Component
	public class CorsInterceptor implements HandlerInterceptor {

		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			response.setHeader("Access-Control-Allow-Origin", "*");
		}
	}


