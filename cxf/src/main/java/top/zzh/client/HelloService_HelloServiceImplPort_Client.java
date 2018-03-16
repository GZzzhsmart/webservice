
package top.zzh.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-16T11:43:15.999+08:00
 * Generated source version: 3.2.2
 *
 */
public final class HelloService_HelloServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.zzh.top/", "HelloServiceImplService");

    private HelloService_HelloServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = HelloServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        HelloServiceImplService ss = new HelloServiceImplService(wsdlURL, SERVICE_NAME);
        HelloService port = ss.getHelloServiceImplPort();

        {
        System.out.println("Invoking sayHello...");
        port.sayHello();


        }
        {
        System.out.println("Invoking say...");
        String _say_arg0 = "";
        String _say__return = port.say(_say_arg0);
        System.out.println("say.result=" + _say__return);


        }

        System.exit(0);
    }

}
