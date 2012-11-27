package com.olol.nn;

import java.util.List;

public class PMML {
	private String version;
	private DataDictionary dataDictionary;
	private NeuralNetwork neuralNetwork;
	
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public DataDictionary getDataDictionary() {
		return dataDictionary;
	}
	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}	
	public NeuralNetwork getNeuralNetwork() {
		return neuralNetwork;
	}
	public void setNeuralNetwork(NeuralNetwork neuralNetwork) {
		this.neuralNetwork = neuralNetwork;
	}
	
	@Override
	public String toString() {
		return "PMML [version = " + version + ", DataDictionary = " + dataDictionary.getNumberOfFields() + ", NeuralNetwork = " + neuralNetwork.getModelName() + "]";
	}
}
