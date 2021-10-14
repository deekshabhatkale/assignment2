package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Arrays;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.DonationCamp;
import com.example.demo.entity.Donors;



@Controller
public class ClientController {
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private Donors object;
	
	@Autowired
	private DonationCamp object2;
	
	@Autowired
	private RestTemplate template;
	

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String init(Model model) {
		 model.addAttribute("majHeading","Blood Donation Management System");
		 return "front1";
	}
	
	@GetMapping(path="/client")
	public String iamaclient(Model model) {
		model.addAttribute("heading","Welcome !! Search for your perfect Donor");
		return "clientView";
	}

	@GetMapping(path="/donor")
	public String iamadonor(Model model) {
		model.addAttribute("heading","Welcome Donor !! You are special");
		return "donorView";
	}
//	@GetMapping(path="/alreadyRegistered")
//	public String alreadyregistered(Model model) {
//		model.addAttribute("majHeading","Welcome Back Donor");
//		return "alreadyRegistered";
//	}
//	
	@GetMapping(path = "/getAllDonor")
	public String findAll(Model model) {

	Donors[] resp =template.getForObject("http://localhost:3030/api/v1/donors/",
	Donors[].class);

	model.addAttribute("data",resp);
	return "showAllDonors";

	}
	@GetMapping(path="/searchThisBloodGroup")
	public String searchThisBloodGroup(Model model) {
		model.addAttribute("heading","Search:");
		return "searchThisBloodGroup";
	}
	
	@GetMapping(path = "/searchByBloodGroup")
	public String searchBybloodgroup(Model model,@RequestParam("search") String bloodgroup) {

	Donors[] resp =template.getForObject("http://localhost:3030/api/v1/donors/"+bloodgroup,
	Donors[].class);

	model.addAttribute("donors",resp);
	return "findByBloodGroup";

	}
	
	@GetMapping(path="/searchThisBloodGroupA")
	public String searchThisBloodGroupA(Model model) {
		model.addAttribute("heading","Search:");
		return "searchThisAvailableBloodGroup";
	}
	
	@GetMapping(path = "/searchByBloodGroupAvailability")
	public String searchByBloodGroupAvailability(Model model,@RequestParam("search") String bloodgroup) {


	Donors[] resp =template.getForObject("http://localhost:3030/api/v1/donors/srch/available/"+bloodgroup,
	Donors[].class);

	model.addAttribute("data",resp);
	return "searchByAvailability";
	}
	
	@GetMapping(path="/searchThisArea")
	public String searchThisArea(Model model) {
		model.addAttribute("heading","Search:");
		return "searchThisArea";
	}
	
	@GetMapping(path = "/searchByarea")
	public String searchByareacode(Model model,@RequestParam("search") String location) {


	Donors[] resp =template.getForObject("http://localhost:3030/api/v1/donors/srch/"+location,
	Donors[].class);

	model.addAttribute("data",resp);
	return "searchBycode";
	}
	
	@GetMapping(path="/searchThisCamp")
	public String searchThisCamp(Model model) {
		model.addAttribute("heading","Search:");
		return "searchThisCamp";
	}
	
	@GetMapping(path = "/searchBycamp")
	public String searchBycamp(Model model,@RequestParam("search") String campName) {

	DonationCamp[] resp =template.getForObject("http://localhost:3030/api/v1/camps/"+campName,
	DonationCamp[].class);

	model.addAttribute("data2",resp);
	return "donorsOfcamp";
	}
	
	
	
	/*
	 * Donor view starts from here
	 */
	@GetMapping(path="/add")
	public String tempAdd(Model model)
	{
		model.addAttribute("heading","Be a donor !! Save Lives");
		return "addDonor";
	}
	
	@GetMapping(path="/addDonor")
	public String sendForm(Model model) {
		model.addAttribute("command",object);
		return "addDonor";
	}
	

	
	@PostMapping(path = "/addDonor")
    public String submitForm(@ModelAttribute("command") Donors donor,BindingResult result) {
        String nextStep = "success";
        //this.template.postForObject("http://localhost:8080/api/v1/students", student, Student.class);
        
   
        if(result.hasErrors()) {
            nextStep="addDonor";
        }else {
        	HttpHeaders headers=new HttpHeaders();
        	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        	headers.setContentType(MediaType.APPLICATION_JSON);
        	HttpEntity<Donors> requestBody=new HttpEntity<>(donor,headers);
        	template.postForObject("http://localhost:3030/api/v1/donors/",requestBody, Donors[].class);
        }
        return "success";
    }
	
	@GetMapping(path="deleteMe")
	public String deleteMe(Model model)
	{
		model.addAttribute("heading","Delete me");
		return "deleteMe";
	}
	
	@DeleteMapping(path="/delete")
	public String deleteRecord(Model model,@RequestParam("search") int id) {
		template.delete("http://localhost:3030/api/v1/donors/"+id);
		return "success";
	}
	
	
	//registering for donorcamp
	
//	@GetMapping(path="/searchMyCamp")
//	public String searchMyCamp(Model model)
//	{
//		model.addAttribute("heading", "Are you sure you want to join nearest camp of you?");
//		return "searchMyCamp";
//	}
	
		@GetMapping(path="/registerForCamp")
		public String sendForm2(Model model) {
			model.addAttribute("command",object2);
			return "registerForCamp";
		}
		
		@PostMapping(path = "/registerForCamp")
	    public String submitForm2(@ModelAttribute("command") DonationCamp donor,BindingResult result) {
	        String nextStep = "success";  
	        if(result.hasErrors()) {
	            nextStep="registerForCamp";
	        }else {
	        	HttpHeaders headers=new HttpHeaders();
	        	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        	headers.setContentType(MediaType.APPLICATION_JSON);
	        	HttpEntity<DonationCamp> requestBody=new HttpEntity<>(donor,headers);
	        	template.postForObject("http://localhost:3030/api/v1/camps/",requestBody, DonationCamp[].class);
	        }
	        return "success";
	    }

//		@PutMapping(path="/registerForCamp")
//		public String addMeToo(@ModelAttribute("command") Donors donor,int id,BindingResult result)
//		{
//			HttpHeaders headers=new HttpHeaders();
//        	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        	headers.setContentType(MediaType.APPLICATION_JSON);
//        	HttpEntity<Integer> requestBody=new HttpEntity<>(id,headers);
//			template.put("http://localhost:3030/api/v1/donors/addme/"+id,requestBody, Donors[].class);
//			
//			return "showAllDonors";
//		}
//		@GetMapping(path="/update")
//		public String updateData(Model model,@RequestParam("search") int id,@RequestParam("date") LocalDate donationDate  ) {
//			model.addAttribute("command",donorService.getDonorByid(id));
//			return "addDonor";
//		}
		
		
}
