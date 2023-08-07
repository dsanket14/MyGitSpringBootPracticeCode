package org.designpattern.factory;

public class EmployeeFactory {

    public Employee getEmployeeSalary(String empType){
        Employee employee = null;
        if(empType.equalsIgnoreCase("Web")){
             employee=new WebDeveloper();
        }else if(empType.equalsIgnoreCase("Android")) {
             employee=new AndroidDeveloper();
        }
        return employee;
    }
}
