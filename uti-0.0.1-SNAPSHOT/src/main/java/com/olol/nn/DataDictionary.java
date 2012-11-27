package com.olol.nn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DataDictionary {
	private HashMap<String, DataField> dataFields = new HashMap<String, DataField>();
	private Integer numberOfFields;
	
	public Integer getNumberOfFields() {
		return numberOfFields;
	}
	public void setNumberOfFields(Integer numberOfFields) {
		this.numberOfFields = numberOfFields;
	}
	
	public void setDataFields(HashMap<String, DataField> dataFields) {
		this.dataFields = dataFields;
	}
	public void addDataField(DataField dataField) {
		dataFields.put(String.valueOf(dataField.getName()), dataField);
	}
	public DataField findDataField(String name) {
		return dataFields.get(name);
	}
	public Iterator<Entry<String, DataField>> getDataFields() {
		return dataFields.entrySet().iterator();
	}

	
	public String toString() {
		return "DataDictionary [dataField="+dataFields.size()+", numberOfFields=" + numberOfFields + "]";
	}
}
