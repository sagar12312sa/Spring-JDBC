/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.test;

import com.sagar.employee.Employee;
import com.sagar.employeeDAO.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sagar
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDAO em=(EmployeeDAO)context.getBean("three");
        int status = em.deleteEmployee(1);
        System.out.println(status);
    }
}
