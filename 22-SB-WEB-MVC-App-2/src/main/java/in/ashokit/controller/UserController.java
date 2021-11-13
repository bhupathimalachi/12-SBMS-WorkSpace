package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	/*@GetMapping("/user")
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Ashok");
		mav.addObject("email", "info@ashokit.in");
		mav.addObject("phno", "+91 - 6301921083");
		mav.setViewName("index");
		return mav;
	}*/
	
	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("name", "Ashok");
		model.addAttribute("email", "info@ashokit.in");
		model.addAttribute("phno", "+91 - 6301921083");
		return "index";
	}
}
