package br.ce.rest;


import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {

	@Test
	public void testOlaMundo(){
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me:80/ola");
		System.out.println(response.getBody().asString().equals("Ola Mundo!"));
		System.out.println(response.statusCode() == 200);
		
		
		ValidatableResponse validacao = response.then();
		 
		System.out.println("--- "+ validacao);
		validacao.statusCode(200);
		
	
		
	}

}
