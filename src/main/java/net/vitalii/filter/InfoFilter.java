package net.vitalii.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.DataLine;
import java.io.IOException;

public class InfoFilter extends BaseFilter {

    public InfoFilter(){
        System.out.println("<< InfoFilter - NEW");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("<< InfoFilter initialized - init");
    }

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println();
        System.out.println("<< " + request.getRequestURI());
        System.out.println("<< " + request.getServletPath());
        System.out.println("<< " + request.getQueryString());
        System.out.println();
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
