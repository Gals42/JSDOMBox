/*
 * Element.java
 * Copyright (c) Radim Kocman
 */

package org.fit.cssbox.jsdombox.global.core;

import org.fit.cssbox.jsdombox.global.misc.JSAdapterFactory;
import org.fit.cssbox.jsdombox.global.misc.JSAdapter;
import org.fit.cssbox.jsdombox.global.misc.JSAdapterType;
import org.w3c.dom.DOMException;

/**
 * DOM Interface Element Adapter
 * 
 * @author Radim Kocman
 */
public class Element extends Node
{
	protected org.w3c.dom.Element source;
	
	public Element(org.w3c.dom.Element source, JSAdapterFactory jsaf)
	{
		super(source, jsaf);
		this.source = source;
	}
	
	
	// DOM Level 1 Implementation
	
	public String getTagName()
	{
		return source.getTagName().toUpperCase();
	}
	
	public String getAttribute(String name)
	{
		String convName = jsaf.innerNameFormat(name);
		return source.getAttribute(convName);
	}
	
	public void setAttribute(String name, String value)
	{
		String convName = jsaf.innerNameFormat(name);
		source.setAttribute(convName, value);
		jsaf.cssEvent.recomputeStyles(source);
	}
	
	public void removeAttribute(String name)
	{
		String convName = jsaf.innerNameFormat(name);
		source.removeAttribute(convName);
		jsaf.cssEvent.recomputeStyles(source);
	}
	
	public JSAdapter getAttributeNode(String name)
	{
		String convName = jsaf.innerNameFormat(name);
		Object result = source.getAttributeNode(convName);
		return jsaf.create(result, JSAdapterType.ATTR);
	}
	
	public JSAdapter setAttributeNode(Attr newAttr)
	{
		Object result = source.setAttributeNode((org.w3c.dom.Attr) getSource(newAttr));
		jsaf.cssEvent.recomputeStyles(source);
		return jsaf.create(result, JSAdapterType.ATTR);
	}
	
	public JSAdapter removeAttributeNode(Attr oldAttr)
	{
		Object result = source.removeAttributeNode((org.w3c.dom.Attr) getSource(oldAttr));
		jsaf.cssEvent.recomputeStyles(source);
		return jsaf.create(result, JSAdapterType.ATTR);
	}
	
	public JSAdapter getElementsByTagName(String name)
	{
		String convName = jsaf.innerNameFormat(name);
		Object result = source.getElementsByTagName(convName);
		return jsaf.create(result, JSAdapterType.ELEMENT);
	}
	
	// moved: public void normalize()
	
	
	// DOM Level 2 Implementation
	
	public String getAttributeNS(String namespaceURI, String localName)
	{
		// getAttributeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "getAttributeNS is not supported");
	}
	
	public void setAttributeNS(String namespaceURI, String qualifiedName, String value)
	{
		// setAttributeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "setAttributeNS is not supported");
	}
	
	public void removeAttributeNS(String namespaceURI, String localName)
	{
		// removeAttributeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "removeAttributeNS is not supported");
	}
	
	public JSAdapter getAttributeNodeNS(String namespaceURI, String localName)
	{
		// getAttributeNodeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "getAttributeNodeNS is not supported");
	}
	
	public JSAdapter setAttributeNodeNS(Attr newAttr)
	{
		// setAttributeNodeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "setAttributeNodeNS is not supported");
	}
	
	public JSAdapter getElementsByTagNameNS(String namespaceURI, String localName)
	{
		// getElementsByTagNameNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "getElementsByTagNameNS is not supported");
	}
	
	public boolean hasAttribute(String name)
	{
		String convName = jsaf.innerNameFormat(name);
		return source.hasAttribute(convName);
	}
	
	public boolean hasAttributeNS(String namespaceURI, String localName)
	{
		// hasAttributeNS is not supported
		throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "hasAttributeNS is not supported");
	}
	
}
