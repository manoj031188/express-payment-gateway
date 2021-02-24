package com.manoj.xpg.services;

import java.util.Map;

import com.manoj.xpg.web.response.Response;

/**
 * @author manoj
 *
 */
public interface RegistrationService {

	Response addClient(Map<String, String> requestBody);

}
