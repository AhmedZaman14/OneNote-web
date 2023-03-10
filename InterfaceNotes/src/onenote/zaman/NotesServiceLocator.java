/**
 * NotesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package onenote.zaman;

public class NotesServiceLocator extends org.apache.axis.client.Service implements onenote.zaman.NotesService {

    public NotesServiceLocator() {
    }


    public NotesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NotesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Notes
    private java.lang.String Notes_address = "http://localhost:8080/OneNote-web/services/Notes";

    public java.lang.String getNotesAddress() {
        return Notes_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NotesWSDDServiceName = "Notes";

    public java.lang.String getNotesWSDDServiceName() {
        return NotesWSDDServiceName;
    }

    public void setNotesWSDDServiceName(java.lang.String name) {
        NotesWSDDServiceName = name;
    }

    public onenote.zaman.Notes getNotes() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Notes_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNotes(endpoint);
    }

    public onenote.zaman.Notes getNotes(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            onenote.zaman.NotesSoapBindingStub _stub = new onenote.zaman.NotesSoapBindingStub(portAddress, this);
            _stub.setPortName(getNotesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNotesEndpointAddress(java.lang.String address) {
        Notes_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (onenote.zaman.Notes.class.isAssignableFrom(serviceEndpointInterface)) {
                onenote.zaman.NotesSoapBindingStub _stub = new onenote.zaman.NotesSoapBindingStub(new java.net.URL(Notes_address), this);
                _stub.setPortName(getNotesWSDDServiceName());
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
        if ("Notes".equals(inputPortName)) {
            return getNotes();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://zaman.onenote", "NotesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://zaman.onenote", "Notes"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Notes".equals(portName)) {
            setNotesEndpointAddress(address);
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
