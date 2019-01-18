package com.zkrichen.userportal;
//package com.devglan.userportal;
//
//import java.io.IOException;
//import java.util.HashMap;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestTemplate;
//@Component
//public class TransactionFilter implements Filter {
//	private HashMap usersSession =new HashMap<Long,String>();
//	private final Logger log = LoggerFactory.getLogger(TransactionFilter.class);
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, javax.servlet.ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest req = (HttpServletRequest) request;
//		log.info(  "Starting a transaction for req : {}", req.getRequestURI());
//		final String url = "http://127.0.0.1:8888/EservicesLoginStatus?idUser=";
//		String idUser =	((HttpServletRequest) request).getParameter("userId");
//		 RestTemplate eservicesResource = new RestTemplate();
//		if (usersSession.get(idUser)!=null) {
//	    	  // test if session is valid POST
//	    	  
//
//	  		// fimResource.requestHeaders.set("Cookie", this.sessionCookie);
//	  		HttpHeaders requestHeaders = new HttpHeaders();
//	  		requestHeaders.add("Cookie", "JSESSIONID=" + usersSession.get(idUser));
//	  		HttpEntity requestEntity = new HttpEntity(null, requestHeaders);
//	  		ResponseEntity <AccountDTO>response2 = eservicesResource.exchange(url+idUser, HttpMethod.POST, requestEntity, AccountDTO.class);
//	  		log.info(  "response if session is OK ", response2.getStatusCode());
//	      }
//	      else{
//	    	  // get session id and test if valid GET 
//	    	  AccountDTO account = eservicesResource.getForObject(url+idUser, AccountDTO.class);
//	    	  usersSession.put(idUser,account.getJsessionID());
//	    	  log.info(  "response if session is OK ", account);
//	      }
//	      
//	}
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		
//	}
// 
//	
//}
//
