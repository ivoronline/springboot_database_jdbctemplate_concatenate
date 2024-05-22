package com.ivoronline.springboot_database_jdbctemplate_concatenate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // CONCATENATE
  //=========================================================================================================
  public int concatenate(String name1, Integer age1, String nameNew, String nameOld) {

    //CREATE STATEMENTS
    String statements = " INSERT INTO PERSON (NAME, AGE) VALUES ( '"+name1+"',"+age1+")         ; "+
                        " UPDATE      PERSON SET NAME = '"+nameNew+"' WHERE name = '"+nameOld+"'; ";

    //EXECUTE STATEMENT
    return jdbcTemplate.update(statements);

  }

}
