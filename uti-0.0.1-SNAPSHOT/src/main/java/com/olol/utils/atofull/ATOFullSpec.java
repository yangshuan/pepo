package com.olol.utils.atofull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.olol.utils.Spec;

public class ATOFullSpec implements Spec {
	
	private Map<String, Object> map = new HashMap<String, Object>();
	
	public Object put(String name, Object value){
		return map.put(name, value);
	}

	public String getClazz() {
		return (String)map.get("class");
	}

	public Object getParameter(String name) {
		return map.get(name);
	}

	public Map<String, Object> getParameters() {
		return Collections.unmodifiableMap(map);
	}
	

	


}