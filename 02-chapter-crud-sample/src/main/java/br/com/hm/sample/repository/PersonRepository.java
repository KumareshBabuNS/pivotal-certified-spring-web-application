package br.com.hm.sample.repository;

import br.com.hm.sample.model.Person;

import javax.sql.DataSource;

/**
 * Created by helmutmigge on 01/02/2016.
 */
public interface PersonRepository {
    int save(Person person);
    void setDataSource(DataSource dataSource);
}
