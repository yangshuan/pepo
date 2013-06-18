package com.olol.model.gen.handler;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import com.olol.model.gen.parser.SasParser;

public class VariableLibraryHandler implements ElementHandler {

	String dir;
	String stFileDir = "src/main/resources/STFiles";
	/**
	 * @param dir
	 */
	public VariableLibraryHandler(String dir) {
		super();
		this.dir = dir;
	}

	@SuppressWarnings("unchecked")
	public void onEnd(ElementPath path) {
		Element elt = path.getCurrent();
		List<Element> variables = elt.elements();
		
		StringTemplateGroup group = new StringTemplateGroup("group", stFileDir, DefaultTemplateLexer.class);
		StringTemplate classnamest = group.getInstanceOf("VariableLibrary");
		
		for (Element variable : variables) {
			Variable var = new Variable();
			var.name = variable.elementText("name");
			var.output = variable.elementText("output");
			var.norm =  variable.elementText("norm");
			var.source = Boolean.valueOf(variable.elementText("source"));
			String params = variable.elementText("params");
//			System.out.println(params);
			var.params = params.substring(params.indexOf(",", params.indexOf(",")+1)+1);
			classnamest.setAttribute("VarList", var);
		}
		
		System.out.println(dir);
		File folder = new File(dir);
		boolean woeflag = false;
		for (File f : folder.listFiles()) {
			if (f.getName().endsWith(".woe")) {
				woeflag = true;
//				System.out.println(f.getAbsolutePath());
				SasParser parseWoe = null;
				try {
					parseWoe = new SasParser(new FileInputStream(f));
					parseWoe.translation_unit();
					System.out.println(parseWoe.varaddsb.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (!woeflag) {
			System.out.println("woe not find!");
		}
		
		
//		System.out.println(classnamest.toString());
		
    } 
		

	public void onStart(ElementPath path) {

	}

}
