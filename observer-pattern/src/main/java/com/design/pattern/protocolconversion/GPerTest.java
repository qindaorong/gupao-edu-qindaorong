package com.design.pattern.protocolconversion;

import com.google.common.eventbus.EventBus;


public class GPerTest {

    public static void main(String[] args) {
        GPerNotify gPerNotify = new GPerNotify();

        EventBus eventBus = new EventBus();
        eventBus.register(gPerNotify);

        GPerQuestion question = new GPerQuestion(eventBus);
        question.sendQuestion("hello GuPao!!");


        eventBus.post("station message");

    }
}
