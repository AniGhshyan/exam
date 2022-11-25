package com.example.exam.example;

import com.example.exam.entity.User;

import java.util.*;

public final class ImmutableUserClass {

    private final int id;
    private final String name;
    private final String surname;
    private final List<User> users;
    private final Date date;

    private ImmutableUserClass(int id, String name, String surname,List<User> users,Date date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.users=new ArrayList<>(users);
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public List<User> getUsers(){
        return new ArrayList<>(users);
    }
    public Date getDate(){
        return (Date) date.clone();

    }

//    SELECT country.country_name, city.city_name
//    FROM country
//    INNER JOIN city ON city.country_id = country.id


//    SELECT COUNT(CustomerID), Country
//    FROM Customers
//    GROUP BY Country
//    HAVING COUNT(CustomerID) > 5;
}
