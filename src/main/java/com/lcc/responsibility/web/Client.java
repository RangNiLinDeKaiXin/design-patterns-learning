package com.lcc.responsibility.web;

/**
 * @author: lcc
 * @Date: 2018-06-28
 **/
public class Client {
	public static void main(String[] args) {
		String msg = "request";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
				.addFilter(new SesitiveFitler());
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
