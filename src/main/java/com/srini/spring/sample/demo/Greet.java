package com.srini.spring.sample.demo;

public class Greet {
    public String greet;

    public Greet() {
    }

    @Override
    public String toString() {
        return "Greet{" +
                "greet='" + greet + '\'' +
                '}';
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }
}
