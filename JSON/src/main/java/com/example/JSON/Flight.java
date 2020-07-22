package com.example.JSON;

import com.fasterxml.jackson.annotation.*;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//declared in the class
@JsonInclude(JsonInclude.Include.NON_NULL)
class Flight {

    private Date departs; //name based on the JSON
    @JsonProperty("departs")
    @JsonFormat(pattern = "yyyy-MM-dd hh:MM")
    public Date getDeparts() { return departs; }
    public void setDeparts(Date departs) { this.departs = departs; }

    //this allowed the tickets to declared as an array
    private Ticket[] tickets;
    @JsonProperty("Tickets") //why capital compared to the setter
    public Ticket[] getTickets() { return tickets; }
    @JsonProperty("tickets") //this is not beginning with a capital
    public void setTickets(Ticket[] tickets) { this.tickets = tickets; }

    //declaring the object of the array
    static class Ticket {

        private Person passenger; //I should have declared as a object
        public Person getPassenger() { return passenger; }
        public void setPassenger(Person passenger) { this.passenger = passenger; }

        private int price;
        @JsonProperty("Price")
        public int getPrice() { return price; }
        @JsonProperty("price")
        public void setPrice(int price) { this.price = price; }

        static class Person {
            private String firstName;
            @JsonProperty("FirstName")
            public String getFirstName() { return firstName; }
            @JsonProperty("firstName")
            public void setFirstName(String firstName) { this.firstName = firstName; }

            private String lastName;
            @JsonProperty("LastName")
            public String getLastName() { return lastName; }
            @JsonProperty("lastName")
            public void setLastName(String lastName) { this.lastName = lastName; }
        }
    }



} //end of class
