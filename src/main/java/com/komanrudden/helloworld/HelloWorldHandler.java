package com.komanrudden.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.komanrudden.helloworld.model.Person;

public class HelloWorldHandler implements RequestHandler<Person, String> {

    public static final String HELLO_FROM_AWS_LAMBDA = "Hello from AWS Lambda : ";

    public String handleRequest(Person person, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("Function name is : " + context.getFunctionName());
        logger.log("Function ARN is : " + context.getInvokedFunctionArn());
        logger.log("Amazon Cognito identity is : " + context.getIdentity());

        return HELLO_FROM_AWS_LAMBDA + person;
    }
}
