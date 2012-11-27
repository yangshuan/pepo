package com.olol.model.gen;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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
			saxReader.addHandler("/model/segment-logic", new SegLogicHandler());
			saxReader.addHandler("/model/segments", new SegmentsHandler());
			saxReader.read(inputXml);

		} catch (DocumentException e) {
			System.err.println(e.getMessage());
		}
	}

	private static class SegLogicHandler implements ElementHandler {

		public void onEnd(ElementPath arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ElementPath path) {
			// TODO Auto-generated method stub
			Element elt = path.getCurrent();
			SasParser.parse();
			System.out.println(elt.attribute("sasfile"));
		}
	}
	
	private static class SegmentsHandler implements ElementHandler {

		public void onEnd(ElementPath path) {
			path.removeHandler("Segment");
		}

		public void onStart(ElementPath path) {
			// TODO Auto-generated method stub
			Element elt = path.getCurrent();
			path.addHandler("Segment", new SegmentHandler());
		}
	}
	
	private static class SegmentHandler implements ElementHandler {

		public void onEnd(ElementPath path) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ElementPath path) {
			// TODO Auto-generated method stub
			Element elt = path.getCurrent();
			System.out.println(elt.attribute("sasfile"));
		}
	}

	public static void main(String args[]) throws IOException {
		ModelGen gen = new ModelGen(new ClassPathResource("session/sm_cfg.xml").getFile());
		gen.setHandler(gen.getDocument());
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
