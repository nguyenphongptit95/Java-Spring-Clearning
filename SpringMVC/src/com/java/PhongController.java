package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhongController {
	@RequestMapping( value = "/index",method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("string", "Gio va may");
		return "index";
	}
}
