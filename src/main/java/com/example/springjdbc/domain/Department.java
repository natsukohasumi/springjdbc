package com.example.springjdbc.domain;

public class Department {
    private Integer id;
    private String name;

    public String toString(){
        return "Depatment [ id = " + id + " name = " + name + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
