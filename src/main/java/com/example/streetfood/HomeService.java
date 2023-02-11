package com.example.streetfood;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public List<String> getOptions(){
        List<String> options = new ArrayList<String>();
        options.add("Pizza");
        options.add("Hamburger");
        options.add("Saláta");
        return options;
    }

    public SubscriberRepository subscriberRepository;

    @Autowired
    public void setSubscriberRepository(SubscriberRepository sub){
        this.subscriberRepository = sub;
    }

    public PizzaRepository pizzaRepository;

    @Autowired
    public void setPizzaRepository(PizzaRepository p){
        this.pizzaRepository = p;
    }

    public HamburgerRepository hamburgerRepository;

    @Autowired
    public void setHamburgerRepository(HamburgerRepository ham){
        this.hamburgerRepository = ham;
    }

    public SalatRepository salatRepository;

    @Autowired
    public void setSalatRepository(SalatRepository s){
        this.salatRepository = s;
    }
    
    public Subscriber addSubscriber(Subscriber sub){
        return subscriberRepository.save(sub);
    }

    public Pizza addPizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public Hamburger addHamburger(Hamburger hamburger){
        return hamburgerRepository.save(hamburger);
    }

    public Salat addSalat(Salat salat){
        return salatRepository.save(salat);
    }

    public List<Subscriber> getSubscribers(){
        return subscriberRepository.findAll();
    }

    public List<Pizza> getPizzas(){
        return pizzaRepository.findAll();
    }

    public List<Hamburger> getHamburgers(){
        return hamburgerRepository.findAll();
    }

    public List<Salat> getSalats(){
        return salatRepository.findAll();
    }
    
}
