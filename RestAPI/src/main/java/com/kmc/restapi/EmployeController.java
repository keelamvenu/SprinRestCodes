package com.kmc.restapi;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
		Employee e1=new Employee("1", "kmc", 10000);
		
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
		
		
		list.add(empdetails);
		
		return "added";
	}
	
	
	
		
	
}
