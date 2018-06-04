package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author CaoYongCheng
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {  //根容器
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  //Spring mvc容器
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {  //DispatcherServlet映射,从"/"开始
        return new String[]{"/"};
    }


}
