package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv) {
		mv.addObject("suzuki",false);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView indexPost(ModelAndView mv){
    mv.addObject("suzuki", true);
    mv.setViewName("index");
    return mv;
	}
	
}
