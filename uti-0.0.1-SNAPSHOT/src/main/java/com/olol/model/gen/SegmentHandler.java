package com.olol.model.gen;

import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

import com.olol.model.gen.parser.SasParser;

public class SegmentHandler implements ElementHandler {
	
	String dir;

	/**
	 * @param dir
	 */
	public SegmentHandler(String dir) {
		super();
		this.dir = dir;
	}

	public void onEnd(ElementPath path) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ElementPath path) {
		// TODO Auto-generated method stub
		Element elt = path.getCurrent();
		System.out.println(elt.attribute("sasfile"));
		
//		SasParser.parse(dir + "/" +elt.attribute("sasfile").getValue());
	}

}
