/**
 * JDJCService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.client;

public class JDJCService_ServiceLocator extends org.apache.axis.client.Service implements com.test.client.JDJCService_Service {

    public JDJCService_ServiceLocator() {
    }


    public JDJCService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JDJCService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_JDJCService
    private java.lang.String BasicHttpBinding_JDJCService_address = "http://192.168.200.153:14625/V1/JDJCService.svc";

    public java.lang.String getBasicHttpBinding_JDJCServiceAddress() {
        return BasicHttpBinding_JDJCService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_JDJCServiceWSDDServiceName = "BasicHttpBinding_JDJCService";

    public java.lang.String getBasicHttpBinding_JDJCServiceWSDDServiceName() {
        return BasicHttpBinding_JDJCServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_JDJCServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_JDJCServiceWSDDServiceName = name;
    }

    public com.test.client.JDJCService_PortType getBasicHttpBinding_JDJCService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_JDJCService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_JDJCService(endpoint);
    }

    public com.test.client.JDJCService_PortType getBasicHttpBinding_JDJCService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.test.client.BasicHttpBinding_JDJCServiceStub _stub = new com.test.client.BasicHttpBinding_JDJCServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_JDJCServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_JDJCServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_JDJCService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.test.client.JDJCService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.test.client.BasicHttpBinding_JDJCServiceStub _stub = new com.test.client.BasicHttpBinding_JDJCServiceStub(new java.net.URL(BasicHttpBinding_JDJCService_address), this);
                _stub.setPortName(getBasicHttpBinding_JDJCServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_JDJCService".equals(inputPortName)) {
            return getBasicHttpBinding_JDJCService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "JDJCService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_JDJCService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_JDJCService".equals(portName)) {
            setBasicHttpBinding_JDJCServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
