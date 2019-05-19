package com.trainee.codeplays.pet;


import java.util.UUID;

public class Pet {

    private UUID id;
    private String name;
    private double weight;

    public Pet() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
