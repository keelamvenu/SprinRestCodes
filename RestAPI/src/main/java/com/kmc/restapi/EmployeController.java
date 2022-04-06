package com.kmc.restapi;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeController 
{
	
	List<Employee> list= new LinkedList<Employee>();

	public EmployeController()
	{
		Employee e1=new Employee();
		
		list.add(e1);
		
	}
	
	
	@GetMapping
	public List<Employee> get()
	{
		return list;
	}
	
	@PostMapping
	public String postemp(@RequestBody Employee empdetails)
	{
		Employee e1=new Employee();
		e1.setId(empdetails.getId());
		e1.setName(empdetails.getName());
		e1.setSalary(empdetails.getSalary());
		
		list.add(e1);
		
		return "added";
	}
	@DeleteMapping(path="/{id}")
	public String delete(@PathVariable String id)
	{
   if(list.contains(id)){
	    list.remove(id);
	    return "employee details deleted";
	}
	else
    return "employee ID not found";
	}
	
	@PutMapping(path="/{id}")
	public String putemp(@PathVariable String id,@RequestBody Employee empdetails)
	{
		if(list.contains(id)) {
	
		Employee e1=new Employee();
		e1.setId(empdetails.getId());
		e1.setName(empdetails.getName());
		e1.setSalary(empdetails.getSalary());
		
		list.add(e1);
		list.add(empdetails);		
		
	
		}
		return "put";
	}
	
		
	
}
