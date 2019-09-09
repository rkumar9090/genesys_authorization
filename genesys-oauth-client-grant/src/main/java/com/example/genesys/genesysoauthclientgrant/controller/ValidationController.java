package com.example.genesys.genesysoauthclientgrant.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

	/**
	 * This Api will get called internally from our microservice to validate the
	 * token
	 * 
	 * @param user
	 * @return Principal
	 */
	@RequestMapping("/validateUser")
	public Principal user(Principal user) {
		return user;
	}

}
