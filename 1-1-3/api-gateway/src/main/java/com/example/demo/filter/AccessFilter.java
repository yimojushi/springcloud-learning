package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2017/8/15.
 */

public class AccessFilter extends ZuulFilter{

    private static org.slf4j.Logger log  = LoggerFactory.getLogger(AccessFilter.class);

    public String filterType(){
        return "pre";
    }

    public int filterOrder(){
        return 0;
    }

    public boolean shouldFilter(){
        return true;
    }

    public Object run(){

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s",request.getMethod(),request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null){
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("you are unauthorized!!");
            return null;
        }
        log.info("access token ok");
        return null;

    }

}
