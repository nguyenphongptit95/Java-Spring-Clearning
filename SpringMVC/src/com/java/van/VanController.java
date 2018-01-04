package com.java.van;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VanController {
	@RequestMapping(value="/van", method = RequestMethod.GET)
	public String van(ModelMap model) {
		model.addAttribute("van", "Nguyen Thi Thu Van");
		return "van";
	}
}
