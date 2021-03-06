package com.animuscloud.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;

public class LambdaSNSFunctionHandler implements RequestHandler<SNSEvent, Object> {

    @Override
    public Object handleRequest(SNSEvent input, Context context) {
        context.getLogger().log("Input: " + input);

        if (input != null) {
            System.out.println(input.toString());
        }
        // TODO: implement your handler
        return null;
    }

}
