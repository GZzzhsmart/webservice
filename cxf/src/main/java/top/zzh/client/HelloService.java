package top.zzh.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-16T11:43:16.124+08:00
 * Generated source version: 3.2.2
 *
 */
@WebService(targetNamespace = "http://server.zzh.top/", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.zzh.top/", className = "top.zzh.client.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.zzh.top/", className = "top.zzh.client.SayHelloResponse")
    public void sayHello();

    @WebMethod
    @RequestWrapper(localName = "say", targetNamespace = "http://server.zzh.top/", className = "top.zzh.client.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://server.zzh.top/", className = "top.zzh.client.SayResponse")
    @WebResult(name = "return", targetNamespace = "")
    public String say(@WebParam(name = "arg0", targetNamespace = "") String arg0);
}
