package org.franze.demo.proxy;

import org.franze.demo.proxy.Service;

/**
 * Created by franze on 04.04.2016.
 */
public class ServiceDefaultImpl implements Service {


    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b) { return a/b; }
}
