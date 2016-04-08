package org.franze.demo.proxy;

import org.franze.demo.proxy.Service;
import org.franze.demo.proxy.ServiceDefaultImpl;

/**
 * Created by franze on 04.04.2016.
 */
public class ServiceProxy implements Service {

    private ServiceDefaultImpl test;

    public ServiceProxy() {
        test = new ServiceDefaultImpl();
    }

    public int add(int a, int b) {
        return test.add(a,b);
    }

    public int sub(int a, int b) {
        return test.sub(a,b);
    }

    public int mul(int a, int b) {
        return test.mul(a,b);
    }

    public int div(int a, int b) { return test.div(a,b); }
}
