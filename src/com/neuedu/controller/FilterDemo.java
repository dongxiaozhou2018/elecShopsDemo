package com.neuedu.controller;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter(filterName = "FilterDemo",value = "*")
public class FilterDemo implements Filter {
    public void destroy() {
        System.out.println("filter被销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        System.out.println("filter被访问");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter被初始化");

    }

}
