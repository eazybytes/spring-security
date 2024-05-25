package com.eazybytes.eazyschool.handlers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {


    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String excMsg = exception.getMessage();
        log.error("Login failed for the due to : {}", excMsg);
        response.setHeader("login-error", "Login failed for the due to : " + excMsg);
        response.sendRedirect("/login?error=true");
    }
}
