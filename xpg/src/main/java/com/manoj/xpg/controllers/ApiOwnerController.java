package com.manoj.xpg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.xpg.services.ApiOwnerService;


@RestController
public class ApiOwnerController {

	@Autowired
    private ApiOwnerService apiOwnerService;
	
	
	
	/**
	 * this method generate client and secret key with domain url and send mail to client
	 * @param clientName
	 * @return
	 */
	@PostMapping("/generate/client-secret-key")
    public ResponseEntity<String> generateClientSecretKey(@RequestParam String clientName)
    {
        apiOwnerService.generateClientSecretKey(clientName);
        return ResponseEntity.ok("App key is created successfully");
    }
	
	
	
}
