package com.java;
import org.springframework.context.ApplicationEvent;
public class CustomEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.EventObject#toString()
	 */
	@Override
	public String toString() {
		return "Phong customEvent...";
	}	
	
}
