package com.olol.model.gen.handler;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

public class SegmentsHandler implements ElementHandler {

	String dir;
	
	/**
	 * @param dir
	 */
	public SegmentsHandler(String dir) {
		super();
		this.dir = dir;
	}

	public void onEnd(ElementPath path) {
//		path.removeHandler("Segment");
		Element elt = path.getCurrent();
		List<Element> segments = elt.elements();
		StringBuilder segmentenumssb = new StringBuilder();
		for (Element segment : segments) {
			String id = segment.attribute("segmentId").getValue();
			String name = segment.attribute("name").getValue();
			segmentenumssb.append("SESSION_MODEL_SEGMENT" + id);
			segmentenumssb.append("(\""+name+"\", "+id+")");
			segmentenumssb.append(",\n");
		}
		String segmentenums = segmentenumssb.toString().substring(0, segmentenumssb.length() - 2) + ";\n";
		
		StringTemplateGroup group = new StringTemplateGroup("group", dir, DefaultTemplateLexer.class);
		StringTemplate classnamest = group.getInstanceOf("SegmentType");
		classnamest.setAttribute("segmenttype", "SessionSegmentType");
		classnamest.setAttribute("segmentenums", segmentenums);
//		System.out.println(classnamest.toString());
		try {
			FileOutputStream out = new FileOutputStream(new File("SessionSegmentType.java"));
			out.write(classnamest.toString().getBytes());
			System.out.println("File SessionSegmentType.java created.");
			out.close();
		} catch (Exception e) {
			System.err.println("File write error");
		}
		
		
		classnamest = group.getInstanceOf("AbstractSegment");
		classnamest.setAttribute("abstractsegment", "SessionAbstractSegment");
		classnamest.setAttribute("segmenttype", "SessionSegmentType");
		try {
			FileOutputStream out = new FileOutputStream(new File("SessionAbstractSegment.java"));
			out.write(classnamest.toString().getBytes());
			System.out.println("File SessionAbstractSegment.java created.");
			out.close();
		} catch (Exception e) {
			System.err.println("File write error");
		}
//		System.out.println(classnamest.toString());
		
		classnamest = group.getInstanceOf("Model");
		classnamest.setAttribute("abstractsegment", "SessionAbstractSegment");
		classnamest.setAttribute("segmentlogic", "SessionSegmentLogic");
		classnamest.setAttribute("classname", "SessionModel");
		try {
			FileOutputStream out = new FileOutputStream(new File("SessionModel.java"));
			out.write(classnamest.toString().getBytes());
			System.out.println("File SessionModel.java created.");
			out.close();
		} catch (Exception e) {
			System.err.println("File write error");
		}
//		System.out.println(classnamest.toString());
		
	}

	public void onStart(ElementPath path) {
		// TODO Auto-generated method stub
//		Element elt = path.getCurrent();
//		System.out.println(elt.elements().size());
		

	}

}
