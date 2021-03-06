/*
 * JSAdapterFactory.java
 * Copyright (c) Radim Kocman
 */

package org.fit.cssbox.jsdombox.global.misc;

import org.fit.cssbox.jsdombox.event.CSSListener;
import org.fit.cssbox.jsdombox.event.HTMLListener;
import org.fit.cssbox.jsdombox.event.ParserListener;
import org.fit.cssbox.jsdombox.global.util.HTMLURI;

/**
 * Basic abstract class for the JS Adapter Factories 
 * 
 * @author Radim Kocman
 */
public abstract class JSAdapterFactory 
{
	/**
	 * Interface for the HTML events
	 */
	public HTMLListener htmlEvent;
	
	/**
	 * Interface for the CSS events
	 */
	public CSSListener cssEvent;
	
	/**
	 * Interface for the parser events
	 */
	public ParserListener parserEvent;
	
	/**
	 * Class for manipulation with the HTML URIs
	 */
	public HTMLURI htmlUri;
	
	/**
	 * Creates appropriate JS adapter for the Java DOM object
	 * @param source Java DOM object
	 * @param type JSAdapter type
	 * @return Initialized JS adapter
	 */
	public abstract JSAdapter create(Object source, JSAdapterType type);
	
	/**
	 * Converts names into the inner DOM format
	 */
	public abstract String innerNameFormat(String name);
	
}
