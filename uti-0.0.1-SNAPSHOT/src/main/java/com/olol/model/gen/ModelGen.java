package com.olol.model.gen;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;

import com.olol.model.gen.parser.ParseException;
import com.olol.model.gen.parser.SasParser;

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
			saxReader.addHandler("/model/segment-logic", new SegLogicHandler(dir));
			saxReader.addHandler("/model/segments", new SegmentsHandler(dir));
			saxReader.read(inputXml);

		} catch (DocumentException e) {
			System.err.println(e.getMessage());
		}
	}
	


	public static void main(String args[]) throws IOException {
		ModelGen gen = new ModelGen(new ClassPathResource("session/sm_cfg.xml").getFile());
		gen.setHandler(gen.getDocument());
		StringTemplateGroup group = new StringTemplateGroup("group", gen.dir, DefaultTemplateLexer.class);
		StringTemplate classnamest = group.getInstanceOf("ModelClass");
		classnamest.setAttribute("classname", "SegLogic");
		System.out.println(classnamest.toString());
//		System.out.println("haha");
		// InputStream input;
		// try {
		// File woeFile = new ClassPathResource("variables.woe").getFile();
		// input = new java.io.FileInputStream(woeFile);
		// } catch (IOException e) {
		// System.out.println("File not found.");
		// return;
		// }
		//
		// try {
		// SasParser parser = new SasParser(input);
		// parser.translation_unit();
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
	}
}
