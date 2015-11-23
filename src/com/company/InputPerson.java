package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 21.11.2015.
 */
public class InputPerson implements IView {
    private List<Department> departments;

    public InputPerson(List<Department> d) {
        departments = d;
    }

    @Override
    public Person getOneEntity() {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        if (scanner.hasNextInt()) {
            p.setId(scanner.nextInt());
        }
        System.out.println("Enter Name");
        if (scanner.hasNext()) {
            p.setFio(scanner.next());
        }
        System.out.println("Enter Department id");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            for (Department d : departments) {
                if (d.getId() == id) {
                    p.setDepartment(d);
                }
            }
        }
        return (p);
    }

    @Override
    public List<Person> getManyEntities() {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<Person>();
        do {
            personList.add(getOneEntity());
            System.out.println("Any one? y/n");
        } while (!scanner.next().equals("n"));
        return personList;
    }
}
