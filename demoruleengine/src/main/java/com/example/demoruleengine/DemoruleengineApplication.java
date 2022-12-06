package com.example.demoruleengine;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StopWatch;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j

@SpringBootApplication
public class DemoruleengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoruleengineApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean<OncePerRequestFilter> executionTimeLoggingFilter() {
		return new FilterRegistrationBean<OncePerRequestFilter>() {{
			//Any servlet filter that wraps the request, should be configured with an order that is less than or equal to 0,
			// which is OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER
			setOrder(OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER);

			//OncePerRequestFilter is an abstract class with one default method doFilterInternal
			setFilter(new OncePerRequestFilter() {
				//in  method doFilterInternal is implemented the clock logic
				@Override
				protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res,
												FilterChain chain) throws ServletException, IOException {
					StopWatch watch = new StopWatch();
					watch.start();
					try {
						chain.doFilter(req, res);
					}finally {
						watch.stop();
						log.info("REQUEST: {} completed within {} ms",
								getUriWithMethodAndQuery(req), watch.getTotalTimeMillis());
					}
				}

				private String getUriWithMethodAndQuery(HttpServletRequest req) {
					return req.getMethod() + ": " + req.getRequestURI() +
							(StringUtils.hasText(req.getQueryString()) ? "?" + req.getQueryString() : "");
				}
			});
		}};
	}
}

