package junit.org.franze.demo.proxy;

import junit.framework.Assert;
import org.franze.demo.proxy.ServiceProxyDivisor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by franze on 08.04.2016.
 */
public class ServiceProxyDivisorTest {

    @Test
    public void test001() throws Exception {
        int result = new ServiceProxyDivisor().div(6,1);
        assertEquals(1,result);
    }
}