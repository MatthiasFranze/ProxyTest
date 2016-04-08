package org.franze.demo.proxy;

/**
 * Created by franze on 04.04.2016.
 */
public class ServiceProxyDivisor implements Service{

    private ServiceDefaultImpl test;

    public ServiceProxyDivisor() {
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

    public int div(int a, int b) { return 1; }

}
