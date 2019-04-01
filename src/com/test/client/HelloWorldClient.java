package com.test.client;

import javax.xml.rpc.ServiceException;
import java.util.Calendar;

public class HelloWorldClient {

    public static void main(String[] args) {
        try {
            JDJCService_ServiceLocator locator = new JDJCService_ServiceLocator();
            JDJCService_PortType service = locator.getBasicHttpBinding_JDJCService();
            try {
                String res = service.acceptJDJC("1",Calendar.getInstance(),"3","4","5","6","7","8","9",
                        Calendar.getInstance(),
                        "11","12","13","14","15","16","17",
                        "张三，13000000000，123456788",
                        "张三，13000000000，123456788|李四，13000000001，123456789",
                        Calendar.getInstance(),Calendar.getInstance(),
                        "22","23",1
                );
                System.out.println(res);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
