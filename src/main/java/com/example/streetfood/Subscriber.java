package com.example.streetfood;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribers")
public class Subscriber {

  @GeneratedValue
  @Id
  @Column(name = "id", unique = true)
  private Long id;

  @Column(name = "email")
  private String email;


  public Subscriber() {}

  public Subscriber(Long id, String email) {
    this.id = id;
    this.email = email;
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
