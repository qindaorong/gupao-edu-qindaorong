package com.design.pattern.protocolconversion;


public class Boss {

    public void command(String command, Leader leader){
        leader.doing(command);
    }
}
