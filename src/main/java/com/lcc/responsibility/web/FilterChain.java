package com.lcc.responsibility.web;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lcc
 * @Date: 2018-06-28
 **/
public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();
	int index = 0;

	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;

	}


	@Override
	public void doFilter(Request request, Response response, FilterChain fc) {
		if(index ==fc.filters.size()) {return;}
		Filter f = fc.filters.get(index);
		index++;
		f.doFilter(request, response, fc);
	}
}
