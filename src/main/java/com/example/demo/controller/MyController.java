package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * @author U55353
 *
 */

@Controller
@Slf4j
public class MyController {

	/**
	 * index page loading
	 *
	 */
	@GetMapping("/")
	public String home() {
		log.info("in home controler #");
		return "index";
	}

}
