package com.olol.nn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NeuralNetwork {
	private String modelName;
	private String functionName;
	private String normalizationMethod;
	private String activationFunction;
	private List<NeuralLayer> neuralLayers = new ArrayList<NeuralLayer>();

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getNormalizationMethod() {
		return normalizationMethod;
	}

	public void setNormalizationMethod(String normalizationMethod) {
		this.normalizationMethod = normalizationMethod;
	}

	public String getActivationFunction() {
		return activationFunction;
	}

	public void setActivationFunction(String activationFunction) {
		this.activationFunction = activationFunction;
	}

	public Iterator<NeuralLayer> getNeuralLayers() {
		return neuralLayers.iterator();
	}

	public void setNeuralLayers(List<NeuralLayer> neuralLayers) {
		this.neuralLayers = neuralLayers;
	}

	public void addNeuralLayer(NeuralLayer neuralLayer) {
		neuralLayers.add(neuralLayer);
	}

	@Override
	public String toString() {
		return "NeuralNetwork [modelName=" + modelName + ", functionName="
				+ functionName + ", normalizationMethod=" + normalizationMethod
				+ ", activationFunction=" + activationFunction + "]";
	}

}
