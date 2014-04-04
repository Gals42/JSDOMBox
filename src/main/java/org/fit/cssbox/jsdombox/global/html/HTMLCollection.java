/*
 * HTMLCollection.java
 * Copyright (c) Radim Kocman
 */

package org.fit.cssbox.jsdombox.global.html;

import org.fit.cssbox.jsdombox.global.misc.JSAdapter;
import org.fit.cssbox.jsdombox.global.misc.JSAdapterFactory;
import org.fit.cssbox.jsdombox.global.misc.JSAdapterType;
import org.fit.cssbox.jsdombox.global.util.HTMLTraversal;

/**
 * DOM Interface HTMLCollection
 * 
 * @author Radim Kocman
 */
public class HTMLCollection extends JSAdapter
{
	protected org.w3c.dom.Node source;
	protected String[] tags; // All relevant HTML tags for this collection
	
	public HTMLCollection(org.w3c.dom.Node source, JSAdapterFactory jsaf, String[] tags)
	{
		super(source, jsaf);
		this.source = source;
		this.tags = tags;
	}
	
	
	// DOM Level 2 HTML Implementation
	
	public int getLength()
	{
		return HTMLTraversal.getCountOfTagsInNode(source, tags);
	}
	
	public JSAdapter item(int index)
	{
		Object result = HTMLTraversal.getNthTagInNode(source, tags, index); 
		return jsaf.create(result, JSAdapterType.NODE);
	}
	
	public JSAdapter namedItem(String name)
	{
		Object result = HTMLTraversal.getNamedTagInNode(source, tags, name, jsaf);
		return jsaf.create(result, JSAdapterType.NODE);
	}
	
}