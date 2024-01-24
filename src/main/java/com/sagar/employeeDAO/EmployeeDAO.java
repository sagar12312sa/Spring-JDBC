/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.employeeDAO;

import com.sagar.employee.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sagar
 */
public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int saveEmployee(Employee e){
        String sql = "Insert into emp (id,name,salary) values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
        return jdbcTemplate.update(sql);
    }
    
    public int updateEmployee(Employee e){
        String sql = "Update emp set id = '"+e.getId()+"',name = '"+e.getName()+"',salary = '"+e.getSalary()+"' where id = '"+e.getId()+"'";
        return jdbcTemplate.update(sql);
    }
    public int deleteEmployee(int id){
        String sql = "delete from emp where id = '"+id+"'";
        return jdbcTemplate.update(sql);
    }
}
