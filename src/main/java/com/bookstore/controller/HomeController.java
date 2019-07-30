/**
 * 
 */
package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sam
 *
 */
//this spring MVC annotation has marked this class as a controller 
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() 
	{
		//RequetMapping annotation tells spring framework to look for the front end resources path "- src/main/resources/templates/ fileName.extension
		//In the template folder we are having index.html file  
		return "index";
	}

}
