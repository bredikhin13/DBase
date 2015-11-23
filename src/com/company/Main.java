package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputDepartment inputDepartment = new InputDepartment();
        System.out.println("Enter departments");
        List<Department> departmentList = inputDepartment.getManyEntities();
        InputPerson inputPerson = new InputPerson(departmentList);
        System.out.println("Enter persons");
        List<Person> personList = inputPerson.getManyEntities();
        InputSalary inputSalary = new InputSalary(personList);
        System.out.println("Enter salaries");
        List<Salary> salaryList = inputSalary.getManyEntities();
        for(Salary s:salaryList){
            System.out.println(s);
        }

        Map<String,Integer> hm = new HashMap<>();
        for(Salary s:salaryList){
            if(hm.containsKey(s.getPerson().getDepartment().getName())){
                int value = hm.get(s.getPerson().getDepartment().getName());
                hm.put(s.getPerson().getDepartment().getName(),value+s.getSumPay());
            } else {
                hm.put(s.getPerson().getDepartment().getName(),s.getSumPay());
            }
        }

        Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
