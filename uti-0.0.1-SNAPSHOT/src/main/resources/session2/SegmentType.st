package com.paypal.risk.idi.models.session;

public enum $segmenttype$ {

  $segmentenums$
  
  private String name;
  private Integer id;
  
  private $segmenttype$(String name, Integer id) {
    this.name = name;
    this.id = id;
  }
  
  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }
}