package com.example.JSON;


import org.springframework.web.bind.annotation.*;

import java.awt.datatransfer.FlavorListener;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@RestController

public class JSONController {
    @GetMapping("/flights/flight")

    public Flight getFlightInfo() {
        //declared a new Flight object
        Flight flight = new Flight();

        //set the new date
        flight.setDeparts(new Date());

        //inside the flight object, there is a ticket object
        // and setting it to a size of 1
        Flight.Ticket[] tickets = new Flight.Ticket[1];

        //Also, inside the Ticket class, there is a Person class
        Flight.Ticket.Person person = new Flight.Ticket.Person();
        //set both Person attributes
        person.setFirstName("Some name");
        person.setFirstName("Some other name");

        //setting an element inside the tickets array
        tickets[0] = new Flight.Ticket();
        tickets[0].setPassenger(person);
        tickets[0].setPrice(200);
        flight.setTickets(tickets);
        return flight;
    }

    @GetMapping("/flights")
    public Flight getTwoFlightInfo() {
       //declare a Flight object
       Flight flight1 = new Flight();
       flight1.setDeparts(new Date());

       //when declaring a object array

       Flight.Ticket[] tickets1 = new Flight.Ticket[1];
       Flight.Ticket.Person passenger = new Flight.Ticket.Person();

       passenger.setFirstName("Some name");
       passenger.setLastName("Some other name");

       tickets1[0] = new Flight.Ticket();
       tickets1[0].setPassenger(passenger);
       tickets1[0].setPrice(200);
       flight1.setTickets(tickets1);

       return flight1;
    }

}
