package com.komanrudden.helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class HelloWorldStreamHandler implements RequestStreamHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

        LambdaLogger logger = context.getLogger();
        logger.log("Function name is : " + context.getFunctionName());
        logger.log("Function ARN is : " + context.getInvokedFunctionArn());
        logger.log("Amazon Cognito identity is : " + context.getIdentity());

        int letter;
        while((letter = inputStream.read()) != -1) {
            outputStream.write(Character.toUpperCase(letter));
        }
    }
}
