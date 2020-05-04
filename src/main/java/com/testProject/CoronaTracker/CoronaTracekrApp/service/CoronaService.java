package com.testProject.CoronaTracker.CoronaTracekrApp.service;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.testProject.CoronaTracker.CoronaTracekrApp.model.CoronaDataModel;

@Service
public class CoronaService {

	private static String URL = "https://api.covid19api.com/summary";

	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void coronaVirusStatus() throws JsonMappingException, JsonProcessingException {
		Client client = Client.create();
		WebResource resource = client.resource(URL);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		System.out.println(response.getStatus());
		String outPut = response.getEntity(String.class);
		// System.out.println(outPut);
		ObjectMapper objectMapper = new ObjectMapper();
		CoronaDataModel data = objectMapper.readValue(outPut, CoronaDataModel.class);
		System.out.println(data.getCountries());

		/*
		 * RestTemplate restTemplate = new RestTemplate(); String response =
		 * restTemplate.getForObject(URL, String.class); System.out.println(response);
		 */
	}

}
