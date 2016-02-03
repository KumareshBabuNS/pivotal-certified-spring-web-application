package br.com.hm.sample;

import br.com.hm.sample.manager.PersonManager;
import br.com.hm.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Date;

/**
 * Created by helmutmigge on 01/02/2016.
 */
@Configuration
@ComponentScan(basePackageClasses = CrudSampleAppConfig.class)
@PropertySource(name = "dbProp",value = "classpath:db.properties")
public class CrudSampleAppConfig {

    private Logger logger = LoggerFactory.getLogger(CrudSampleAppConfig.class);

    @Autowired
    Environment env;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CrudSampleAppConfig.class);
        PersonManager personManager = context.getBean("personManager", PersonManager.class);
        Person person = new Person("Helmut", "Migge", new Date(1983, 0, 11));
        personManager.save(person);
        context.close();
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("database.url"));
        dataSource.setDriverClassName(env.getProperty("database.driverClassName"));
        dataSource.setUsername(env.getProperty("database.username"));
        dataSource.setPassword(env.getProperty("database.password"));
        logger.info("DataSource constructor");
        return dataSource;
    }
}
