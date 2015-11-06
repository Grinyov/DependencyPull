package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 */
public class HelloWorldMessageProvider  implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
