package com.t2t.top.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者
 *
 * @author yangpengfei
 */
public class ServerProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();

        System.out.println("启动服务Provider");

        System.in.read(); // 按任意键退出
    }

}