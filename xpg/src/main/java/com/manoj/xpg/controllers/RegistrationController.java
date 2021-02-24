package com.manoj.xpg.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.xpg.services.RegistrationService;
import com.manoj.xpg.web.response.Response;

/**
 * @author manoj
 *
 */
@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationServiceImpl;

	@RequestMapping(value = "addClient", method = RequestMethod.POST)
	public Response addClient(@RequestBody Map<String, String> requestBody) {
		 return registrationServiceImpl.addClient(requestBody);
	}
	
	
}
