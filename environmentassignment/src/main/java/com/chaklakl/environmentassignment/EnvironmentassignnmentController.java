package com.chaklakl.environmentassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EnvironmentassignnmentController {
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}

}
