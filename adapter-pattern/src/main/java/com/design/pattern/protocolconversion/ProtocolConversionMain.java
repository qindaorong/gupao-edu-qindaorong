package com.design.pattern.protocolconversion;

public class ProtocolConversionMain {
    public static void main(String[] args) {
            Http http = new ProtocolConversionAdapter(new Webservice());
            http.outputHttp();
    }
}
