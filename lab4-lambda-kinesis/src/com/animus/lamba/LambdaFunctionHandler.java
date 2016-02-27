package com.animus.lamba;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

public class LambdaFunctionHandler implements RequestHandler<KinesisEvent, Object> {

    @Override
    public Object handleRequest(KinesisEvent input, Context context) {
        context.getLogger().log("Input: " + input);
        System.out.println(input.toString());   
        System.out.println("input.getRecords().size()=" + input.getRecords().size());   
        return null;
    }

}
