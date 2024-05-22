package com.ivoronline.springboot_database_jdbctemplate_concatenate.controllers;

import com.ivoronline.springboot_database_jdbctemplate_concatenate.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // CONCATENATE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/concatenate")
  public int concatenate() {
    int    success = myService.concatenate("Jill", 40, "John New", "John");
    return success;
  }

}