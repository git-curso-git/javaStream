package eci.seguros.webs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



@Component
public class EciInterceptor extends HandlerInterceptorAdapter{

	private static final Logger logger = LoggerFactory.getLogger(Aplicacion.class);

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse  response, Object handler) throws Exception{
    	logger.info("INTERCEPTOR");
    	
    //your custom logic here.
        return true;
    }

}
