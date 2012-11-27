package com.olol.nn;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.xmlrules.DigesterLoader;

public class NNParser {
	
	public void testParse() {
		URL xmlURL = this.getClass().getClassLoader().getResource("nn.pmml");
		URL xmlRule = this.getClass().getClassLoader().getResource("rule.xml");
		Digester digester = DigesterLoader.createDigester(xmlRule);

		try {
			PMML pmml = (PMML) digester.parse(xmlURL);
			Iterator<Entry<String, Neuron>> iter = pmml.getNeuralNetwork().getNeuralLayers().next().getNeurons();
			Map<String, Concon> map= iter.next().getValue().getCon();
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		NNParser parser = new NNParser();
		parser.testParse();
	}
}
