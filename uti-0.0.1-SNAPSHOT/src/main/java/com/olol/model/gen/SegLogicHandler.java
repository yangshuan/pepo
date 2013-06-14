package com.olol.model.gen;

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

	public void onStart(ElementPath path) {
		Element elt = path.getCurrent();
		System.out.println(dir + "/" +elt.attribute("sasfile").getValue());
//		SasParser.parse(dir + "/" +elt.attribute("sasfile").getValue());

	}

}
