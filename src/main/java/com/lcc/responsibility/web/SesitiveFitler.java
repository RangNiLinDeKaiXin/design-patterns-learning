package com.lcc.responsibility.web;

/**
 * @author: lcc
 * @Date: 2018-06-28
 **/
public class SesitiveFitler implements Filter {
	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		String dealRequest = request.getRequestStr()+"->SesitiveFitler";
		request.setRequestStr(dealRequest);
		filterChain.doFilter(request,response,filterChain);
		String dealresponse =response.getResponseStr()+"->SesitiveFitler";
		response.setResponseStr(dealresponse);

	}
}
