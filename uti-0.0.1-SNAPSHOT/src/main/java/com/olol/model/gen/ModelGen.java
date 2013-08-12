package com.olol.model.gen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.io.SAXReader;

import com.olol.model.gen.handler.PmmlHandler;
import com.olol.model.gen.handler.VariableLibraryHandler;

public class ModelGen {

	private File inputXml;

	private String dir;
	
	PmmlHandler PmmlHandler;
	VariableLibraryHandler varlibHandler;
	
	
//	private String pkg;

	public ModelGen(File inputXml) {
		this.inputXml = inputXml;
		this.dir = this.inputXml.getParent();
	}

	public Document getDocument() {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			document = saxReader.read(inputXml);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return document;
	}

	public Element getRootElement() {
		return getDocument().getRootElement();
	}

	public void setHandler(Document document) {
		SAXReader saxReader = new SAXReader();
		try {
			// saxReader.addHandler("/model/segment-logic", new
			// SegLogicHandler(dir));
			// saxReader.addHandler("/model/segments", new
			// SegmentsHandler(dir));
//			Element root = document.getRootElement();
//			System.out.println(root.selectSingleNode("/PMML").selectSingleNode("NeuralNetwork"));
			this.PmmlHandler = new PmmlHandler(dir);
			this.varlibHandler = new VariableLibraryHandler(dir);
			
			saxReader.addHandler("/PMML/NeuralNetwork", PmmlHandler);
			saxReader.addHandler("/variableDict", varlibHandler);
			saxReader.read(inputXml);
			
			
			

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws IOException {
		
		List<String> pmmlNodes = new ArrayList<String>();
		Map<String, String> varlibMap = new HashMap<String, String>();
		Map<String, String> zTovMap = new HashMap<String, String>();
		
		File folder = new File(args[0]);
		if (folder.exists()) {
			for (File f : folder.listFiles()) {
				if (f.getName().endsWith(".pmml")
						|| f.getName().endsWith(".var")) {
					ModelGen gen = new ModelGen(f);
					gen.setHandler(gen.getDocument());
					
					if (gen.PmmlHandler.pmmlNodes != null && gen.PmmlHandler.pmmlNodes.size() != 0) {
						pmmlNodes.addAll(gen.PmmlHandler.pmmlNodes);
					}
					if (gen.varlibHandler.zTovMap != null) {
						varlibMap.putAll(gen.varlibHandler.zTovMap);
					}
					
				}
			}
		} else {
			System.err.println("pmml not found!");
		}	
		
		// z to v map
		for (Map.Entry<String, String> entry : varlibMap.entrySet()) {
			if (pmmlNodes.contains(entry.getKey()))
				zTovMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("node map: " + zTovMap);
		for (String var : zTovMap.values()) {
			System.out.print("\"" + var +"\",");
		}
		System.out.println();
		
//		for (String var : zTovMap.values()) {
//			System.out.println(var +",");
//		}
		
//		for (String var : zTovMap.keySet()) {
//			System.out.println(var +",");
//		}
		
		
	}
}
