package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController for Api build

@Controller
public class Home_controller 
{
	@Autowired
	studentservice serv;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/savedata")
	public String savedata(@ModelAttribute("stud") Student stud)
	{
		
	//	System.out.println(stud);
		serv.savestudent(stud);
		
		return "redirect:/welcome";
		
	}
	
	@RequestMapping("/welcome")
	public String welcome(ModelMap m)
	{
		List<Student> list = serv.getAllStudents();
		
		m.addAttribute("data", list);
		//return list; //Api build and change method type list to string
		return "welcome";
	}
	
	@RequestMapping("/deletestud")
	public String deletestud(@RequestParam("id") int id)
	{
		serv.deletestud(id);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/editstud")
	public String editstud(@RequestParam("id") int id,ModelMap map)
	{
		Student s=serv.getstudent(id);
		
		map.addAttribute("data", s);
		return "edit";
		
		
	}
	
	@PostMapping("/updatestud")
	public String updatestud(@ModelAttribute("stud") Student stud)
	{

		Student s = new Student();
		
		s.setId(stud.getId());
		
		s.setFullname(stud.getFullname());
		
		s.setEmail(stud.getEmail());
		
		s.setPassword(stud.getPassword());
		
		serv.savestudent(s);
		
		return "redirect:/welcome";
		
	}
}
