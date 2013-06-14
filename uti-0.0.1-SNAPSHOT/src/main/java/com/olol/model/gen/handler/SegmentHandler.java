package com.olol.model.gen.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import com.olol.model.gen.parser.SasParser;

public class SegmentHandler implements ElementHandler {
	
	String dir;
	String stFileDir;
	String segName;
	String outputdir = "./src/test/resources/";

	/**
	 * @param dir
	 */
	public SegmentHandler(String dir) {
		super();
		this.dir = dir;
		this.stFileDir = dir.substring(0, dir.lastIndexOf('\\')) + "/STFiles";
	}

	public void onEnd(ElementPath path) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ElementPath path) {
		Element elt = path.getCurrent();
		
		this.segName = elt.attribute("name").getValue();
		String modelName = segName.substring(0,segName.indexOf("Seg"));
		
		System.out.println("start parsing " + segName + "...");
		
//		SasParser parser = new SasParser(stream);
//		SasParser.parse(dir + "/" +elt.attribute("woe").getValue());
		File woeFile = new File(dir + "/" +elt.attribute("woe").getValue());
		File scorecardFile = new File(dir + "/" +elt.attribute("scorecard").getValue());
		SasParser parseWoe = null;
		try {
			parseWoe = new SasParser(new FileInputStream(woeFile));
			parseWoe.translation_unit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		StringBuilder variablesadd = new StringBuilder();
		
		HashMap<String, String> woeMap = new HashMap<String, String>();
		for (Map.Entry<String, String> keyset : parseWoe.woeMap.entrySet()) {
			variablesadd.append("variables.add(" + keyset.getValue() + ");\n");
			woeMap.put(keyset.getKey(), keyset.getValue());
		}
		
		StringBuilder varaddsb = parseWoe.varaddsb;
		
		try {
			parseWoe = new SasParser(new FileInputStream(scorecardFile));
			parseWoe.setWoeMap(woeMap);
			parseWoe.translation_unit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		StringTemplateGroup group = new StringTemplateGroup("group", stFileDir, DefaultTemplateLexer.class);
		StringTemplate classnamest = group.getInstanceOf("Segment");
		classnamest.setAttribute("segment", elt.attribute("name").getValue());
		classnamest.setAttribute("abstractsegment", modelName + "AbstractSegment");
		classnamest.setAttribute("variablesadd", variablesadd.toString());
		classnamest.setAttribute("getwoevalue", varaddsb.toString());
		classnamest.setAttribute("coeffmap", parseWoe.coeffmapsb.toString());
		classnamest.setAttribute("coeff1", parseWoe.coeff1);
		classnamest.setAttribute("coeff2", parseWoe.coeff2);
		classnamest.setAttribute("segmenttype", modelName + "SegmentType");
		classnamest.setAttribute("segmentenum", elt.attribute("type").getValue());
//		System.out.println(classnamest.toString());
		try {
			String filename = elt.attribute("name").getValue() + ".java";
			FileOutputStream out = new FileOutputStream(new File(outputdir + "/" + filename));
			out.write(classnamest.toString().getBytes());
			System.out.println("File " + filename + " created.");
			out.close();
		} catch (Exception e) {
			System.err.println("File write error");
		}
		
//		System.out.println(SasParser.varaddsb);
//		System.out.println(SasParser.coeffmapsb.toString());
//		SasParser.woeMap = new HashMap<String, String>();
//		parseWoe.coeffmapsb = new StringBuilder();
//		parseWoe.varaddsb = new StringBuilder();
//		System.out.println(SasParser.coeff1 + SasParser.coeff2);
	}

}
