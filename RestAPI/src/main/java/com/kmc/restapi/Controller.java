package com.kmc.restapi;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/employees")
public class Controller {

    Map<String,Employee> info= new HashMap<String, Employee>();
@PostMapping
public String send(@RequestBody Employee empdetails)
{
	Employee add=new Employee("12", "kmccorp", 0);

add.setId(empdetails.getId());
add.setName(empdetails.getName());
add.setSalary(empdetails.getSalary());
info.put(empdetails.getId(),add);
System.out.println(empdetails.toString());
return "employee added";
}

@GetMapping
public Collection<Employee> recieve()
{
return info.values();
}

//@PutMapping(path="/{User_id}")
//public String alter(@PathVariable String User_id,@RequestBody Rest empdetails)
//{
//if(info.containsKey(User_id))
//{
//	Employee add=new Employee(null, null, 0);
//
////    Rest moddetails= new Rest();
////    moddetails.setUser_id(empdetails.getUser_id());
////    moddetails.setName(empdetails.getName());
////    moddetails.setMail(empdetails.getMail());
////    info.put(User_id,moddetails);
////    return "edit is done";
//    
//
//	
//}
//else
//    return "employee ID not found";
//}
//
//@DeleteMapping(path="/{User_id}")
//public String delete(@PathVariable String User_id)
//{
//if(info.containsKey(User_id)){
//    info.remove(User_id);
//    return "employee details deleted";
//}
//else
//    return "employee ID not found";
//}
//
//@PatchMapping("/employees/{id}/{firstName}")
//
//public String update(@PathVariable String user_id, @PathVariable String name)
//{
//	
////	try {
////		Rest rest = info.   //findById(user_id).get();
////		employee.setFirstName(name);
////		return new ResponseEntity<Employee>(employeeRepository.save(employee), HttpStatus.OK);
////	} catch (Exception e) {
//		return  "patch done";
//}
}
