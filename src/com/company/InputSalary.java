package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 22.11.2015.
 */
public class InputSalary implements IView {
    private List<Person> persons = new ArrayList<>();//?????? diamonds

    public InputSalary(List<Person> list) {
        persons = list;
    }

    @Override
    public Salary getOneEntity() {
        Salary s = new Salary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        if (scanner.hasNextInt()) {
            s.setId(scanner.nextInt());
        }
        System.out.println("Enter month number");
        if (scanner.hasNextInt()) {
            s.setMonPay(scanner.nextInt());
        }
        System.out.println("Enter year");
        if (scanner.hasNextInt()) {
            s.setYearPay(scanner.nextInt());
        }
        System.out.println("Enter salary sum");
        if (scanner.hasNextInt()) {
            s.setSumPay(scanner.nextInt());
        }
        System.out.println("Enterperson id");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            for (Person p : persons) {
                if (p.getId() == id) {
                    s.setPerson(p);
                }
            }
        }
        return s;
    }

    @Override
    public List<Salary> getManyEntities() {
        List<Salary> salaries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do{
            salaries.add(getOneEntity());
            System.out.println("Any one? y/n");
        } while (!scanner.next().equals("n"));
        return salaries;
    }
}
