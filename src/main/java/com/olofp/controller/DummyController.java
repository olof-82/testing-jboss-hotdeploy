package com.olofp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Olof on 2015-07-30.
 */
@Controller
public class DummyController {

	@RequestMapping(value="/dummy", method = RequestMethod.GET)
	@ResponseBody
	public String foo() {
		return "Dumny Response!";
	}
}
