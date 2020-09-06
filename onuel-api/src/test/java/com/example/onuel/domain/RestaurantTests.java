package com.example.onuel.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bon");
        assertThat(restaurant.getName(), is("Bon"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant("Bon", "Seoul");
        assertThat(restaurant.getInformation(), is("Bon Seoul"));
    }
}