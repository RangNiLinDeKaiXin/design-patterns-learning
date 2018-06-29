package com.lcc.responsibility.web;

/**
 * @description:
 * @author: lcc
 * @Date: 2018-06-28
 **/
public interface Filter {
 void doFilter(Request request,Response response,FilterChain fc);
}
