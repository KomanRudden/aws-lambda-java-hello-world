package com.komanrudden.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.komanrudden.helloworld.model.Person;

public class HelloWorldHandler implements RequestHandler<Person, String> {

    public static final String HELLO_FROM_AWS_LAMBDA = "Hello from AWS Lambda : ";

    public String handleRequest(Person person, Context context) {
        return HELLO_FROM_AWS_LAMBDA + person;
    }
}
