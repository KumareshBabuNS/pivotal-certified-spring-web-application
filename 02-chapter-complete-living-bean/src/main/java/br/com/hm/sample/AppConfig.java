package br.com.hm.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by helmutmigge on 27/01/2016.
 */
@Configuration
public class AppConfig {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }

    @Bean(name = "setParameter")
    public String setParameter(){
        return "setParameter";
    }

    @Bean(destroyMethod = "destroyMethod", initMethod = "initMethod")
    public CompleteLivingBean completeLivingBean(@Qualifier("setParameter") String setParameter){
        CompleteLivingBean bean = new CompleteLivingBean();
        bean.setInternal(setParameter);
        return bean;
    }
}
