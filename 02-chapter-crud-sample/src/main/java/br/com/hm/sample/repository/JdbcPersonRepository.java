package br.com.hm.sample.repository;

import br.com.hm.sample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by helmutmigge on 01/02/2016.
 */
@Repository
public class JdbcPersonRepository implements PersonRepository{

    private Logger logger = LoggerFactory.getLogger(JdbcPersonRepository.class);

    public JdbcPersonRepository(){
        logger.info(" JdbcPersonRepository constructor");
    }

    @Override
    public int save(Person person) {
        logger.info(" JdbcPersonRepository save");
        return 1;
    }

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        logger.info(" JdbcPersonRepository set dataSource");
    }
}
