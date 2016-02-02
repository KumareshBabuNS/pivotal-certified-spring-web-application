package br.com.hm.sample.manager;

import br.com.hm.sample.model.Person;
import br.com.hm.sample.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by helmutmigge on 01/02/2016.
 */
@Service("personManager")
public class PlainPersonManager  implements PersonManager{

    private Logger logger = LoggerFactory.getLogger(PlainPersonManager.class);

    public PlainPersonManager(){
        logger.info("PlainPersonManager constructor");
    }

    PersonRepository personRepository;

    @Override
    public int save(Person person) {
        return personRepository.save(person);
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository){
        logger.info("PlainPersonManager set personRepository");
        this.personRepository = personRepository;
    }
}
