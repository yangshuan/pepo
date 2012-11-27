package com.olol.nn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NeuralLayer {
	private Integer numberOfNeurons;
	private String activationFunction;
	private Map<String, Neuron> neurons = new HashMap<String, Neuron>();
	public Integer getNumberOfNeurons() {
		return numberOfNeurons;
	}
	public void setNumberOfNeurons(Integer numberOfNeurons) {
		this.numberOfNeurons = numberOfNeurons;
	}
	public String getActivationFunction() {
		return activationFunction;
	}
	public void setActivationFunction(String activationFunction) {
		this.activationFunction = activationFunction;
	}
	public Iterator<Entry<String, Neuron>> getNeurons() {
		return neurons.entrySet().iterator();
	}
	public void setNeurons(Map<String, Neuron> neurons) {
		this.neurons = neurons;
	}
	public void addNeuron(Neuron neuron) {
		neurons.put(neuron.getId(), neuron);
	}
	public Neuron findNeuron(String id) {
		return neurons.get(id);
	}
}
