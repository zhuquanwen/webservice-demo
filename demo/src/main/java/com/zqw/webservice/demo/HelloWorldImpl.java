
package com.zqw.webservice.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldImpl", targetNamespace = "http://demo.webservice.zqw.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://demo.webservice.zqw.com/", className = "com.zqw.webservice.demo.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://demo.webservice.zqw.com/", className = "com.zqw.webservice.demo.SayHelloWorldResponse")
    @Action(input = "http://demo.webservice.zqw.com/HelloWorldImpl/sayHelloWorldRequest", output = "http://demo.webservice.zqw.com/HelloWorldImpl/sayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
