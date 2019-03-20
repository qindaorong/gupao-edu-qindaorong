package com.design.pattern.protocolconversion;

import com.google.common.eventbus.EventBus;



public class GPerQuestion {

    EventBus eventBus;

    public GPerQuestion(EventBus eventBus)
    {
        this.eventBus = eventBus;
    }

    public void sendQuestion(String question)
    {
        System.out.println("send message :"+question);

        NotifyEvent event = new NotifyEvent(question);

        eventBus.post(event);
    }

}
