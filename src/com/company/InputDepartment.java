package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 22.11.2015.
 */
public class InputDepartment implements IView {

    @Override
    public Department getOneEntity() {
        Scanner scanner = new Scanner(System.in);
        Department d = new Department();
        System.out.println("Enter id");
        if (scanner.hasNextInt()) {
            d.setId(scanner.nextInt());
        }
        System.out.println("Enter Name");
        if (scanner.hasNext()) {
            d.setName(scanner.next());
        }
        return (d);
    }

    @Override
    public List<Department> getManyEntities() {
        Scanner scanner = new Scanner(System.in);
        List<Department> departmentList = new ArrayList<>();
        do {
            departmentList.add(getOneEntity());
            System.out.println("Any one? y/n");
        } while (!scanner.next().equals("n"));
        return departmentList;
    }
}
