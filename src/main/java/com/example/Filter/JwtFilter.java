package com.example.Filter;

import java.io.IOException;
import org.springframework.stereotype.Component;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String header = req.getHeader("Authorization");

        if (header == null || !header.startsWith("Satish ")) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setStatus(401);
            res.getWriter().write("Token Missing");
            return;
        }

  
        String token = header.substring(7);  

        if (!token.equals("12345")) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setStatus(401);
            res.getWriter().write("Invalid Token");
            return;
        }

        chain.doFilter(request, response);
    }
}
