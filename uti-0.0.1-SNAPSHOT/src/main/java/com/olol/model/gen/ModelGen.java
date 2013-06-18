package com.olol.model.gen;

import java.io.File;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.olol.model.gen.handler.PmmlHandler;
import com.olol.model.gen.handler.VariableLibraryHandler;

public class ModelGen {

	private File inputXml;

	private String dir;

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

			saxReader.addHandler("/PMML/NeuralNetwork", new PmmlHandler(dir));
			saxReader.addHandler("/variableDict", new VariableLibraryHandler(dir));
			saxReader.read(inputXml);

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws IOException {

		File folder = new File(args[0]);
		if (folder.exists()) {
			for (File f : folder.listFiles()) {
				if (f.getName().endsWith(".pmml")
						|| f.getName().endsWith(".var")) {
					ModelGen gen = new ModelGen(f);
					gen.setHandler(gen.getDocument());
				}
			}
		} else {
			System.err.println("pmml not found!");
		}
	}
}
