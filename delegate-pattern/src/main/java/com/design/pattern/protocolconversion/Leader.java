package com.design.pattern.protocolconversion;

import java.util.HashMap;
import java.util.Map;


public class Leader implements IEmployee{
    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader(){
        targets.put("encrypt", new EmployeeA());
        targets.put("login", new EmployeeB());
    }

    @Override
    public void doing(String command) {

        targets.get(command).doing(command);

    }
}
