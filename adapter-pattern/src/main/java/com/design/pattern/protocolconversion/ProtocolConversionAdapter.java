package com.design.pattern.protocolconversion;

public class ProtocolConversionAdapter implements Http {

    private Webservice webservice;

    public ProtocolConversionAdapter(Webservice webservice) {
        this.webservice = webservice;
    }

    @Override
    public String outputHttp() {
        String  adapterInput = webservice.outputWebservice();
        String adapterOutput = "我是http协议";
        System.out.println("使用PowerAdapter输入协议:" + adapterInput + ",输出协议：" + adapterOutput );
        return adapterOutput;
    }
}
