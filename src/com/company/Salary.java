package com.company;

/**
 * Created by User on 21.11.2015.
 */
public class Salary implements DBEntity {
    private int id;
    private int monPay;
    private int yearPay;
    private int sumPay;
    private Person person;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonPay() {
        return monPay;
    }

    public void setMonPay(int monPay) {
        this.monPay = monPay;
    }

    public int getYearPay() {
        return yearPay;
    }

    public void setYearPay(int yearPay) {
        this.yearPay = yearPay;
    }

    public int getSumPay() {
        return sumPay;
    }

    public void setSumPay(int sumPay) {
        this.sumPay = sumPay;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", monPay=" + monPay +
                ", yearPay=" + yearPay +
                ", sumPay=" + sumPay +
                ", person=" + person +
                '}';
    }
}
