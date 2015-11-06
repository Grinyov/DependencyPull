package com.grinyov.IoC;

/**
 * Created by green on 11/6/15.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
