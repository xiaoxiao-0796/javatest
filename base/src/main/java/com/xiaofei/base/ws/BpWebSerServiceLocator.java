/**
 * BpWebSerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xiaofei.base.ws;

public class BpWebSerServiceLocator extends org.apache.axis.client.Service implements BpWebSerService {

    public BpWebSerServiceLocator() {
    }


    public BpWebSerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BpWebSerServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BestpayServiceServerOnSkyszWs
    private String BestpayServiceServerOnSkyszWs_address = "https://172.17.162.103:8189/services/BestpayServiceServerOnSkysz.ws";

    public String getBestpayServiceServerOnSkyszWsAddress() {
        return BestpayServiceServerOnSkyszWs_address;
    }

    // The WSDD service name defaults to the port name.
    private String BestpayServiceServerOnSkyszWsWSDDServiceName = "BestpayServiceServerOnSkysz.ws";

    public String getBestpayServiceServerOnSkyszWsWSDDServiceName() {
        return BestpayServiceServerOnSkyszWsWSDDServiceName;
    }

    public void setBestpayServiceServerOnSkyszWsWSDDServiceName(String name) {
        BestpayServiceServerOnSkyszWsWSDDServiceName = name;
    }

    public BpWebSer getBestpayServiceServerOnSkyszWs() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BestpayServiceServerOnSkyszWs_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBestpayServiceServerOnSkyszWs(endpoint);
    }

    public BpWebSer getBestpayServiceServerOnSkyszWs(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BestpayServiceServerOnSkyszWsSoapBindingStub _stub = new BestpayServiceServerOnSkyszWsSoapBindingStub(portAddress, this);
            _stub.setPortName(getBestpayServiceServerOnSkyszWsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBestpayServiceServerOnSkyszWsEndpointAddress(String address) {
        BestpayServiceServerOnSkyszWs_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (BpWebSer.class.isAssignableFrom(serviceEndpointInterface)) {
                BestpayServiceServerOnSkyszWsSoapBindingStub _stub = new BestpayServiceServerOnSkyszWsSoapBindingStub(new java.net.URL(BestpayServiceServerOnSkyszWs_address), this);
                _stub.setPortName(getBestpayServiceServerOnSkyszWsWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("BestpayServiceServerOnSkysz.ws".equals(inputPortName)) {
            return getBestpayServiceServerOnSkyszWs();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://172.17.162.103:8189/services/BestpayServiceServerOnSkysz.ws", "BpWebSerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://172.17.162.103:8189/services/BestpayServiceServerOnSkysz.ws", "BestpayServiceServerOnSkysz.ws"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("BestpayServiceServerOnSkyszWs".equals(portName)) {
            setBestpayServiceServerOnSkyszWsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
