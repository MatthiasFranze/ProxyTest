package junit.org.franze.demo.proxy;

import junit.framework.Assert;
import org.franze.demo.proxy.ServiceDefaultImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  Created by franze on 04.04.2016.
 */
public class ServiceDefaultImplTest {

    @Test
    public void test001() throws Exception {
        int result = new ServiceDefaultImpl().add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void test002() throws Exception {
        int result = new ServiceDefaultImpl().add(Integer.MAX_VALUE,Integer.MIN_VALUE);
        assertEquals(-1,result);
    }
}