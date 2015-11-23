package com.company;

/**
 * Created by User on 21.11.2015.
 */
public class Person implements DBEntity {
    private int id;
    private String fio;
    private Department department;

    @Override
    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", department=" + department +
                '}';
    }
}
