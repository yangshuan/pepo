package com.olol.nn;

public class DataField {
	private String name;
	private String displayName;
	private String optype;
	private String dataType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getOptype() {
		return optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return "DataField [name=" + name + ", displayName=" + displayName
				+ ", optype=" + optype + ", dataType=" + dataType + "]";
	}
}
