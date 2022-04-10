package com.kmc.restapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController is the way the HTTP response body is created
@RequestMapping("/employee")
public class EmployeController {
	Map<String, Employee> map = new TreeMap();

	@GetMapping
	public Map<String, Employee> getAL̥ll() {
		return map;
	}

	@GetMapping(path="/{id}")
	public Map<String, Employee> getbyid(@PathVariable String id)
	{
		if (map.containsKey(id)) {
			map.get(id);
			
		} else
			return (Map<String, Employee>) map.get(id);
		return (Map<String, Employee>) map.values();
		
	}

	@PostMapping
	public String postEmployee(@RequestBody Employee empdetails) {
		Employee e1 = new Employee();
		e1.setId(empdetails.getId());
		e1.setName(empdetails.getName());
		e1.setSalary(empdetails.getSalary());

		map.put(e1.getId(), e1);

		return "added";
	}

	@PutMapping(path = "/{id}")
	public String putEmployee(@PathVariable String id, @RequestBody Employee empdetails) {
		if (map.containsKey(id)) {

			Employee e1 = new Employee();
			e1.setId(empdetails.getId());
			e1.setName(empdetails.getName());
			e1.setSalary(empdetails.getSalary());

			map.put(id, e1);

		}
		return "put";
	}

	@DeleteMapping(path = "/{id}")
	public String deleteEmployeeById(@PathVariable String id) {
		if (map.containsKey(id)) {
			map.remove(id);
			return "employee details deleted";
		} else
			return "employee ID not found";
	}

	@PatchMapping(path = "/{id}")
	public String patchEmployee(@PathVariable String id, @RequestBody Employee empdetails) {

		if (map.containsKey(id)) {
			Employee e1 = new Employee();
			e1.setId(empdetails.getId());
			e1.setName(empdetails.getName());
			e1.setSalary(empdetails.getSalary());
			map.put(id, e1);
			return "employee details patched";
		} else
			return "employee ID not found";
	}

}
