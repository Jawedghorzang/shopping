package shopping.com.shopping.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	
	
	@GetMapping("/")
	public String getHome() {
		return "index";
	}
	
	@GetMapping("/login2")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/delete")
	public String delete(Model model) {
		model.addAttribute("dmessage","The Product is successful deleted!");
		return "delete";
	}
	
	@GetMapping("/edit")
	public String edit(Model model) {
		model.addAttribute("emessage","The Product is successful edited!");
		return "edit";
	}
}
