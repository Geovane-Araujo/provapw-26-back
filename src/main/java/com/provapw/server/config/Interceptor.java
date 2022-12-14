package com.provapw.server.config;

import com.jatom.security.Security;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {

        if(request.getRequestURI().equals("/authentication/login")){

        } else {
            String token = request.getHeader("Authorization");
            if(token != null){
                token = token.split(" ")[1];
                boolean validate = validateToken(token);
                if(!validate){
                    response.sendError(401);
                    return true;
                }

            }
        }
        return true;
    }

    private boolean validateToken(String token) {

        Security security = new Security();
        ;
        if(security.validToken(token)){
            return true;
        }
        return false;
    }
}
