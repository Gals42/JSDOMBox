/*
 * HTMLListener.java
 * Copyright (c) Radim Kocman
 */

package org.fit.cssbox.jsdombox.event;

import org.w3c.dom.Node;

/**
 * Common interface for receiving HTML events from the JSDOMBox
 * 
 * @author Radim Kocman
 */
public interface HTMLListener
{
	/**
	 * Getter for the HTMLLinkElement attribute disabled
	 * @param node Source Node of the HTML Link Element
	 * @return Disabled value: true/false
	 */
	public boolean link_getDisabled(Node node);
	/**
	 * Setter for the HTMLLinkElement attribute disabled
	 * @param node Source Node of the HTML Link Element
	 * @param disabled New value for the attribute disabled
	 */
	public void link_setDisabled(Node node, boolean disabled);
	
	
	/**
	 * Getter for the HTMLStyleElement attribute disabled
	 * @param node Source Node of the HTML Style Element
	 * @return Disabled value: true/false
	 */
	public boolean style_getDisabled(Node node);
	/**
	 * Setter for the HTMLStyleElement attribute disabled
	 * @param node Source Node of the HTML Style Element
	 * @param disabled New value for the attribute disabled
	 */
	public void style_setDisabled(Node node, boolean disabled);
	
	
	/**
	 * Removes keyboard focus from the HTMLAnchorElement
	 * @param node Source Node of the HTML Anchor Element
	 */
	public void anchor_blur(Node node);
	/**
	 * Gives keyboard focus to the HTMLAnchorElement
	 * @param node Source Node of the HTML Anchor Element
	 */
	public void anchor_focus(Node node);
	
	
	/**
	 * Submits the HTMLFormElement
	 * @param node Source Node of the HTML Form Element
	 */
	public void form_submit(Node node);
	/**
	 * Resets the HTMLFormElement
	 * @param node Source Node of the HTML Form Element
	 */
	public void form_reset(Node node);
	
	
	/**
	 * Gets the index of the selected option in the HTMLSelectElement
	 * @param node Source Node of the HTML Select Element
	 * @return Ordinal index (zero-based) or -1
	 */
	public int select_getSelectedIndex(Node node);
	/**
	 * Sets the index of the selected option in the HTMLSelectElement
	 * @param node Source Node of the HTML Select Element
	 * @param selectedIndex Ordinal index (zero-based) or -1
	 */
	public void select_setSelectedIndex(Node node, int selectedIndex);
	/**
	 * Removes keyboard focus from the HTMLSelectElement
	 * @param node Source Node of the HTML Select Element
	 */
	public void select_blur(Node node);
	/**
	 * Gives keyboard focus to the HTMLSelectElement
	 * @param node Source Node of the HTML Select Element
	 */
	public void select_focus(Node node);
	
	
	/**
	 * Gets the selection state of the HTMLOptionElement
	 * @param node Source Node of the HTML Option Element
	 * @return true/false
	 */
	public boolean option_getSelected(Node node);
	/**
	 * Sets the selection state of the HTMLOptionElement
	 * @param node Source Node of the HTML Option Element
	 * @param selected true/false
	 */
	public void option_setSelected(Node node, boolean selected);
	
	
	/**
	 * Gets the checked state of the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 * @return true/false
	 */
	public boolean input_getChecked(Node node);
	/**
	 * Sets the checked state of the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 * @param checked true/false
	 */
	public void input_setChecked(Node node, boolean checked);
	/**
	 * Gets the current value of the HTMLInputElement
	 * For input types: text|file|password
	 * @param node Source Node of the HTML Input Element
	 * @return Current value
	 */
	public String input_getValue(Node node);
	/**
	 * Sets the current value of the HTMLInputElement
	 * For input types: text|file|password
	 * @param node Source Node of the HTML Input Element
	 * @param value New value
	 */
	public void input_setValue(Node node, String value);
	/**
	 * Removes keyboard focus from the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 */
	public void input_blur(Node node);
	/**
	 * Gives keyboard focus to the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 */
	public void input_focus(Node node);
	/**
	 * Selects the content of the text area of the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 */
	public void input_select(Node node);
	/**
	 * Simulates a mouse-click on the HTMLInputElement
	 * @param node Source Node of the HTML Input Element
	 */
	public void input_click(Node node);
	
	
	/**
	 * Gets the current value of the HTMLTextAreaElement
	 * @param node Source Node of the HTML Text Area Element
	 * @return Current value
	 */
	public String textarea_getValue(Node node);
	/**
	 * Sets the current value of the HTMLTextAreaElement
	 * @param node Source Node of the HTML Text Area Element
	 * @param value New value
	 */
	public void textarea_setValue(Node node, String value);
	/**
	 * Removes keyboard focus from the HTMLTextAreaElement
	 * @param node Source Node of the HTML Text Area Element
	 */
	public void textarea_blur(Node node);
	/**
	 * Gives keyboard focus to the HTMLTextAreaElement
	 * @param node Source Node of the HTML Text Area Element
	 */
	public void textarea_focus(Node node);
	/**
	 * Selects the content of the HTMLTextAreaElement
	 * @param node Source Node of the HTML Text Area Element
	 */
	public void textarea_select(Node node);
	
	
	/**
	 * Gets the title of the document
	 * @param node Source Node of the HTML Document
	 * @return Current title
	 */
	public String document_getTitle(Node node);
	/**
	 * Sets the title of the document
	 * @param node Source Node of the HTML Document
	 * @param title New title
	 */
	public void document_setTitle(Node node, String title);
	/**
	 * Gets the URI of the page that linked to this document
	 * @param node Source Node of the HTML Document
	 * @return URI of the page that linked to this documnet
	 */
	public String document_getReferrer(Node node);
	/**
	 * Gets the cookies of the document
	 * @param node Source Node of the HTML Document
	 * @return Cookie string
	 */
	public String document_getCookie(Node node);
	/**
	 * Sets the cookies of the document
	 * @param node Source Node of the HTML Document
	 * @param cookie Cookie string
	 * @return Is cookie string valid? true/false
	 */
	public boolean document_setCookie(Node node, String cookie);
	
}
