package com.olol.utils;


import java.util.Map;

public interface Spec {
	
	String getClazz();
	
	Object getParameter(String name);
	
	Map<String, Object> getParameters();
	
	Object put(String name, Object value);
	
}
