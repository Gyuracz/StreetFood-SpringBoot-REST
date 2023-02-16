package com.example.streetfood;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class HomeController {

  public HomeService homeService;

  @Autowired
  public void setHomeService(HomeService h) {
    this.homeService = h;
  }

  @RequestMapping("/menu/getPizzas")
  public ResponseEntity<List<Pizza>> getPizzas(){
    return new ResponseEntity<List<Pizza>>(homeService.getPizzas(), HttpStatus.OK);
  }

  @RequestMapping("/menu/getHamburgers")
  public ResponseEntity<List<Hamburger>> getHamburgers(){
    return new ResponseEntity<List<Hamburger>>(homeService.getHamburgers(), HttpStatus.OK);
  }

  @RequestMapping("/menu/getSalats")
  public ResponseEntity<List<Salat>> getSalats(){
    return new ResponseEntity<List<Salat>>(homeService.getSalats(), HttpStatus.OK);
  }

  @RequestMapping("/admin/getSubscribers")
  public ResponseEntity<List<Subscriber>> getSubscribers(){
    return new ResponseEntity<List<Subscriber>>(homeService.getSubscribers(), HttpStatus.OK);
  }

  @PostMapping("/admin/addSubscriber")
  public ResponseEntity<Subscriber> addSubscriber(@RequestBody Subscriber subscriber) {
    return new ResponseEntity<Subscriber>(homeService.addSubscriber(subscriber), HttpStatus.OK);
  }

  @PostMapping("/admin/addPizza")
  public ResponseEntity<Pizza> addPizza(@RequestBody Pizza pizza) {
    return new ResponseEntity<Pizza>(homeService.addPizza(pizza), HttpStatus.OK);
  }

  @PostMapping("/admin/addHamburger")
  public ResponseEntity<Hamburger> addHamburger(@RequestBody Hamburger hamburger) {
    return new ResponseEntity<Hamburger>(homeService.addHamburger(hamburger), HttpStatus.OK);
  }

  @PostMapping("/admin/addSalat")
  public ResponseEntity<Salat> addSalat(@RequestBody Salat salat) {
    return new ResponseEntity<Salat>(homeService.addSalat(salat), HttpStatus.OK);
  }

  @DeleteMapping("/admin/deleteSubscriber")
  public ResponseEntity<Boolean> deleteSubscriber(@RequestParam(name = "id") Long id) {
    return new ResponseEntity<Boolean>(homeService.deleteSubscriber(id), HttpStatus.OK);
  }

  @DeleteMapping("/admin/deletePizza")
  public ResponseEntity<Boolean> deletePizza(@RequestParam(name = "id") Long id) {
    return new ResponseEntity<Boolean>(homeService.deletePizza(id), HttpStatus.OK);
  }

  @DeleteMapping("/admin/deleteHamburger")
  public ResponseEntity<Boolean> deleteHamburger(@RequestParam(name = "id") Long id) {
    return new ResponseEntity<Boolean>(homeService.deleteHamburger(id), HttpStatus.OK);
  }

  @DeleteMapping("/admin/deleteSalat")
  public ResponseEntity<Boolean> deleteSalat(@RequestParam(name = "id") Long id) {
    return new ResponseEntity<Boolean>(homeService.deleteSalat(id), HttpStatus.OK);
  }

}
