package com.olol.nn;

import java.util.HashMap;
import java.util.Map;

public class Neuron {
	private String id;
	private Double bias;
	private Map<String, Concon> cons = new HashMap<String, Concon>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getBias() {
		return bias;
	}
	public void setBias(Double bias) {
		this.bias = bias;
	}
	public Map<String, Concon> getCon() {
		return cons;
	}
	public void setCon(Map<String, Concon> con) {
		this.cons = con;
	}
	public void addCon(Concon con) {
		cons.put(con.getFrom(), con);
	}
	
}
