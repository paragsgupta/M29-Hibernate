package org.tnsif.service;
import org.tnsif.entities.Employee;
public interface EmployeeService {
	
	//user-defined method
	void createEmployee(Employee emp);//create
	Employee retrieveEmployee(int id);//retrieve
	void updateEmployee(Employee emp);//update
	void removeEmployee(Employee emp);//delete

}