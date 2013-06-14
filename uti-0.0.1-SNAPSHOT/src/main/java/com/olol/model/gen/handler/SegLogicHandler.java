package com.olol.model.gen.handler;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import com.olol.model.gen.parser.SasParser;

public class SegLogicHandler implements ElementHandler {

	String dir;	

	public SegLogicHandler(String dir) {
		this.dir = dir;
	}

	public void onEnd(ElementPath arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ElementPath elementPath) {
		// TODO Auto-generated method stub
		
	}

//	public void onStart(ElementPath path) {
//		Element elt = path.getCurrent();
////		System.out.println(dir + "/" +elt.attribute("sasfile").getValue());
//		
//		HashMap<String, String> varMap = SasParser.parse(dir + "/" +elt.attribute("sasfile").getValue());
//		
//		StringTemplateGroup group = new StringTemplateGroup("group", dir, DefaultTemplateLexer.class);
//		StringTemplate classnamest = group.getInstanceOf("SegmentLogic");
//		classnamest.setAttribute("classname", "SessionSegmentLogic");
//		classnamest.setAttribute("getsegment", varMap.get("getsegment"));
//		classnamest.setAttribute("abstractsegment", "SessionAbstractSegment");
////		System.out.println(classnamest.toString());
////		SasParser.woeMap = new HashMap<String, String>();
////		SasParser.varaddsb = new StringBuilder();
//		try {
//			File file = new File("./src/test/resources/SessionSegmentLogic.java");
//			FileOutputStream out = new FileOutputStream(file);
//			out.write(classnamest.toString().getBytes());
//			System.out.println(file.getPath());
//			System.out.println("File SessionSegmentLogic.java created.");
//			out.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
