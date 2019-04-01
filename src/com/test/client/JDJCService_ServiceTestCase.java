/**
 * JDJCService_ServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.client;

public class JDJCService_ServiceTestCase extends junit.framework.TestCase {
    public JDJCService_ServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testBasicHttpBinding_JDJCServiceWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.test.client.JDJCService_ServiceLocator().getBasicHttpBinding_JDJCServiceAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.test.client.JDJCService_ServiceLocator().getServiceName());
        assertTrue(service != null);
    }

/*    public void test1BasicHttpBinding_JDJCServicePDF_XCJCBL() throws Exception {
        com.test.client.BasicHttpBinding_JDJCServiceStub binding;
        try {
            binding = (com.test.client.BasicHttpBinding_JDJCServiceStub)
                          new com.test.client.JDJCService_ServiceLocator().getBasicHttpBinding_JDJCService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.PDF_XCJCBL(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }*/

    public void test2BasicHttpBinding_JDJCServiceAcceptJDJC() throws Exception {
        com.test.client.BasicHttpBinding_JDJCServiceStub binding;
        try {
            binding = (com.test.client.BasicHttpBinding_JDJCServiceStub)
                          new com.test.client.JDJCService_ServiceLocator().getBasicHttpBinding_JDJCService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.acceptJDJC(new java.lang.String(), java.util.Calendar.getInstance(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), java.util.Calendar.getInstance(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), new java.lang.String(), java.util.Calendar.getInstance(), java.util.Calendar.getInstance(), new java.lang.String(), new java.lang.String(), new java.lang.Integer(0));
        // TBD - validate results
    }

}
