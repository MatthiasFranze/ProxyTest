package org.franze.demo.proxy;

/**
 * Created by franze on 04.04.2016.
 */
public class ServiceProxyLogger implements Service {

    private ServiceDefaultImpl test;

    public ServiceProxyLogger() {
        test = new ServiceDefaultImpl();
    }

    public int add(int a, int b) {
        System.out.println("Adding " + a + " and " + b + ".");
        return test.add(a,b);
    }

    public int sub(int a, int b) {
        System.out.println("Subtracting " + a + " with " + b + ".");
        return test.sub(a,b);
    }

    public int mul(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b + ".");
        return test.mul(a,b);
    }

    public int div(int a, int b) {
        System.out.println("Dividing " + a + " by " + b + ".");
        return test.div(a,b); }
}
