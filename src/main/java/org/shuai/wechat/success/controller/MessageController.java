package org.shuai.wechat.success.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

	@RequestMapping(value = "getMessage", method = RequestMethod.POST)
	public String getMessage(@RequestBody String body) {
		
		
		return "success";
		
	}
}
