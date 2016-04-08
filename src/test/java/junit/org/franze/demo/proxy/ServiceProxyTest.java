package junit.org.franze.demo.proxy;

import junit.framework.Assert;
import org.franze.demo.proxy.ServiceProxy;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  Created by franze on 04.04.2016.
 */
public class ServiceProxyTest {

    @Test
    public void test001() throws Exception {
        int result = new ServiceProxy().add(0,1);
        assertEquals(1,result);
    }

    @Test
    public void test002() throws Exception {
        int result = new ServiceProxy().mul(7,6);
        assertEquals(42,result);
    }

    @Test
    public void test003() throws Exception {
        int result = new ServiceProxy().sub(1,2);
        assertEquals(-1,result);
    }
}