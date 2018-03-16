package top.zzh.server;

import javax.jws.WebService;

/**
 * @author 曾志湖
 * @date 2018/3/16 10:42
 */
@WebService
public interface HelloService {

    void sayHello();
    String say(String name);

}
