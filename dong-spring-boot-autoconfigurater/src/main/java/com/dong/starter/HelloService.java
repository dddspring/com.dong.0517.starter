package com.dong.starter;

public class HelloService {
    HelloPropeties helloPropeties;

    public HelloPropeties getHelloPropeties() {
        return helloPropeties;
    }

    public void setHelloPropeties(HelloPropeties helloPropeties) {
        this.helloPropeties = helloPropeties;
    }

    public String sayHello(String name){

        return helloPropeties.getPrefix()+"-"+name+"-"+helloPropeties.getSuffix();
    }
}
