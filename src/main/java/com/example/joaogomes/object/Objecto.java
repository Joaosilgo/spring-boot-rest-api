package com.example.joaogomes.object;

import java.time.LocalDate;

public class Objecto {

    private long id;
    private String name;
    private String description;
    private LocalDate date;
    private Integer amount;

    public Objecto() {
    }

    public Objecto(long id, String name, String description, LocalDate date, Integer amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
