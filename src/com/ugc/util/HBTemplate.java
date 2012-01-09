package com.ugc.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.ugc.service.master.MasterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author omenkzz
 */
public class HBTemplate {

    private static ApplicationContext applicationContext;
    
    public static ApplicationContext getApplicationContext() {
        applicationContext = new FileSystemXmlApplicationContext("/conf/spring-ctx.xml");
        return applicationContext;
    }

    public static MasterService getMasterService(){
        return (MasterService) applicationContext.getBean("masterService");
    }

   

}
