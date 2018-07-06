package net.vitalii.filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class TestFilter extends BaseFilter {
    FilterConfig filterConfig;


    public TestFilter() {
        System.out.println(" <<  TestFilter - new ");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        System.out.println(" << TestFilter - init");
    }

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(filterConfig.getFilterName());
        Enumeration<String> parameters = filterConfig.getInitParameterNames();
        while (parameters.hasMoreElements()) {
            String parameter = parameters.nextElement();
            System.out.println(filterConfig.getInitParameter(parameter));
        }
        chain.doFilter(request, response);

    }
}
