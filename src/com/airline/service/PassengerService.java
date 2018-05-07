package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.airline.models.Passenger;

/**
 * Session Bean implementation class PassengerService
 */
@Stateless
@LocalBean 
public class PassengerService {

    /**
     * Default constructor. 
     */
    public PassengerService() { 
 
    }
    
    @PersistenceContext(unitName="airline")
    private EntityManager em;//help to communicate with database
    
    public void addPassenger(Passenger p) {
    	em.persist(p);
    }
}
