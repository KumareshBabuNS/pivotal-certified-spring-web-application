package br.com.hm.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by helmutmigge on 27/01/2016.
 */
public class CompleteLivingBean implements InitializingBean,DisposableBean {
    Logger logger= LoggerFactory.getLogger(CompleteLivingBean.class);

    public CompleteLivingBean(){
        logger.info("Construct");
    }


    public void setInternal(String parameter){
        logger.info("set parameter");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("@PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("InitializingBean.afterPropertiesSet");
    }

    public void initMethod(){
        logger.info("Bean init-method");
    }

    public void destroyMethod(){
        logger.info("Bean destroy-method");
    }
}
