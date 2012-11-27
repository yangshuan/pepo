package com.olol.model.gen;

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
		path.removeHandler("Segment");
	}

	public void onStart(ElementPath path) {
		// TODO Auto-generated method stub
		Element elt = path.getCurrent();
		path.addHandler("Segment", new SegmentHandler(this.dir));
	}

}
