package com.design.pattern.protocolconversion;

import com.google.common.eventbus.Subscribe;

public class GPerNotify {

    @Subscribe
    public void recordCustomerChange(NotifyEvent e) {

        System.out.println("get notify message:" + e);

    }
}
