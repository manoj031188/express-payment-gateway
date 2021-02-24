package com.manoj.xpg.services;

import org.springframework.stereotype.Service;

@Service
public class ApiOwnerServiceImpl implements ApiOwnerService {

	@Override
	public void generateClientSecretKey(String clientName) {
		// TODO Auto-generated method stub
		generateAPIKey(clientName);
		sendMailToOwner(clientName);
	}

	//send generated keys to owner
	private void sendMailToOwner(String clientName) {
		// TODO Auto-generated method stub
		
	}

	//this method generate 
	//client access key
	// secret key
	//and domain url
	private void generateAPIKey(String clientName) {
		// TODO Auto-generated method stub
		
	}

	
	
}
