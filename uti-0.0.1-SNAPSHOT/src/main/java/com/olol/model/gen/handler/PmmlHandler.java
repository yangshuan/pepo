package com.olol.model.gen.handler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

public class PmmlHandler implements ElementHandler {

	String dir;
	String stFileDir = "src/main/resources/STFiles";
	/**
	 * @param dir
	 */
	public PmmlHandler(String dir) {
		super();
		this.dir = dir;
	}

	@SuppressWarnings("unchecked")
	public void onEnd(ElementPath path) {
		Element elt = path.getCurrent();
		List<Element> nnproperties = (List<Element>) elt.elements();
		
		StringTemplateGroup group = new StringTemplateGroup("group", stFileDir, DefaultTemplateLexer.class);
		StringTemplate classnamest = group.getInstanceOf("Pmml");
		
		int layerCount = 0;
		for (Element property : nnproperties) {
			
			if (property.getName().equals("NeuralInputs")) {
				List<Element> inputslist = property.elements();
				StringBuilder nInputs = new StringBuilder();
				for (Element input : inputslist) {
					nInputs.append("neuralInputsList.add(\""+input.attribute("id").getValue()+"\");\n");
				}
				classnamest.setAttribute("neuralInputsList",nInputs);
				
			} else if (property.getName().equals("NeuralLayer")) {
				NeuralLayer nl = new NeuralLayer();
				layerCount ++;
				Integer neuronCount = Integer.valueOf(property.attribute("numberOfNeurons").getValue());
				nl.index = layerCount;
				nl.NumberOfNeurons = neuronCount;
				nl.ActivationFunction = property.attribute("activationFunction").getValue();
				List<Element> neurons = property.elements();
				nl.Neurons = new ArrayList<String>();
				for (Element neuron : neurons) {
					nl.Neurons.add("nl.addNeuron(buildNeuronL" +layerCount+ "N" + neuron.attribute("id").getValue() + "());\n");
					List<Element> cons = neuron.elements();
					Neuron neu = new Neuron();
					neu.bias = Double.valueOf(neuron.attribute("bias").getValue());
					neu.id = neuron.attribute("id").getValue();
					neu.con = new ArrayList<String>();
					neu.layer = nl.index;
					for (Element con : cons) {
						neu.con.add("n.addCon(\"" + con.attribute("from").getValue() +"\"," + con.attribute("weight").getValue() + ");\n");
					}
					classnamest.setAttribute("BuildNeurons", neu);
				}
//				System.out.println(nl.Neurons);
				classnamest.setAttribute("NeuronList", nl.Neurons);
				classnamest.setAttribute("NeuralLayer", nl);
				
//				System.out.println(classnamest.toString());
			}
			
			
//			System.out.println(property.getName());
		}
		
		
		
		
		 
		
    } 
		

	public void onStart(ElementPath path) {

	}

}
