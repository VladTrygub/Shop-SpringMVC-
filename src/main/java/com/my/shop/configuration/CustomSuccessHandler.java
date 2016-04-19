package com.my.shop.configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomSuccessHandler.class);
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	protected void handle(HttpServletRequest req, HttpServletResponse resp,
			Authentication authentication) throws IOException {
		String tergetUrl = determineTargetUrl(authentication);
		
		if (resp.isCommitted()) {
			logger.info("Can't redirect");
			return;
		}
		
		redirectStrategy.sendRedirect(req, resp, tergetUrl);
	}
	
	protected String determineTargetUrl(Authentication authentication) {
		String url = "";
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		List<String> roles = new ArrayList<String>();
		
		for (GrantedAuthority a : authorities) 
			roles.add(a.getAuthority());
		
		if(isSimpleUser(roles))
			url = "/";
		else if (isAdmin(roles)) 
			url = "/admin";
		else
			url = "/accessDenied";
		
		return url;
	}
	
	private boolean isSimpleUser(List<String> roles) {
		if (roles.contains("ROLE_USER"))
			return true;
		return false;
	}
	
	private boolean isAdmin(List<String> roles) {
		if (roles.contains("ROLE_ADMIN"))
			return true;
		return false;
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}
	
}
