package com.olol.model.gen.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, String> zTovMap = new HashMap<String, String>();
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
		
		Map<String, String> varToZ = new HashMap<String, String>();
		Map<String, String> varToW = new HashMap<String, String>();
		Map<String, String> varMapping = new HashMap<String, String>();
		Map<String, String> varType = new HashMap<String, String>();
		
		File folder = new File(dir);
		boolean woeflag = false;
		SasParser parseWoe = null;
		for (File f : folder.listFiles()) {
			if (f.getName().endsWith(".woe")) {
				woeflag = true;
//				System.out.println(f.getAbsolutePath());
				
				try {
					parseWoe = new SasParser(new FileInputStream(f));
					parseWoe.translation_unit();
					for (String var : parseWoe.variables) {
						System.out.print("\""+var+"\",");
					}
					System.out.println();
					classnamest.setAttribute("woe", parseWoe.varaddsb.toString());
					classnamest.setAttribute("variables", parseWoe.woeMap);
					varToW.putAll(parseWoe.woeMap);
					varType.putAll(parseWoe.typeMap);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (!woeflag) {
			System.out.println("woe not find!");
		}
		
		for (Element variable : variables) {
//			System.out.println(variable.elementText("name") + "|" + variable.elementText("output"));
			Variable var = new Variable();
			String name = variable.elementText("name");
			if (parseWoe.woeMap.containsKey(name))
				var.name = "\"" + variable.elementText("name") + "\"";
			else
				var.name = variable.elementText("name") + ".getName()";
//			var.name = variable.elementText("name");
			var.output = variable.elementText("output");
			var.norm =  variable.elementText("norm");
			var.source = Boolean.valueOf(variable.elementText("source"));
			String params = variable.elementText("params");
//			System.out.println(params);
			var.params = params.substring(params.indexOf(",", params.indexOf(",")+1)+1);
			classnamest.setAttribute("VarList", var);
			
			varToZ.put(variable.elementText("name"), variable.elementText("output"));
		}
		
		System.out.println("zsclmap: " + varToZ);
		System.out.println("woemap: " + varToW);
		for (Map.Entry<String, String> var : varToZ.entrySet()) {
			if (!varToW.containsKey(var.getKey())) {
				varMapping.put(var.getValue(),var.getKey());
			}
		}
		for (Map.Entry<String, String> var : varToZ.entrySet()) {
			if (varToW.containsKey(var.getKey())) {
				varMapping.put(var.getValue(),varToW.get(var.getKey()));
			}
		}
		zTovMap = varMapping;
		System.out.println("wholemap: " + varMapping);
		System.out.print("typemap: " + varType);
		
		
		try {
			String filename = "VariableLibrary.java";
			FileOutputStream out = new FileOutputStream(new File(dir + "/" + filename));
			out.write(classnamest.toString().getBytes());
			System.out.println("File " + filename + " created.");
			out.close();
		} catch (Exception e) {
			System.err.println("File write error");
		}
//		System.out.println(classnamest.toString());
		
    } 
		

	public void onStart(ElementPath path) {

	}

}
