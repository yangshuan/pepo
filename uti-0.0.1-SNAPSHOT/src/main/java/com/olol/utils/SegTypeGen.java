package com.olol.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class SegTypeGen {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = null;
		try {
		reader = new BufferedReader(new FileReader("C:/Users/tezhang/Desktop/tmp/new  888.txt"));
		for (String line = reader.readLine(); line != null; line = reader
		.readLine()) {
			line = line.trim();
			//String str[] = line.split("/s");
			/*String first = line.substring(0, 2);
			String last = line.substring(2);
			String prefix = "ATO_SEGMENT_" + first;
			String name = "ato_seg" + first;
			System.out.println(prefix + "(\"" + name + "\", "
					+ first.trim() + ", " + last.trim() + "),");*/
			String str[] = line.split(",");
			StringBuilder sb = new StringBuilder();
			sb.append("segMap.put(Arrays.asList(new String[]{");
			sb.append("\"" + str[0] + "\",");
			sb.append("\"" + str[1] + "\",");
			sb.append("\"" + str[2] + "\",");
			sb.append("\"" + str[3] + "\"");
			sb.append("}), ATOSegmentType.ATO_SEGMENT_" + str[4] + ");");
			System.out.println(sb.toString());
		}
	}
	finally {
		reader.close();
	} 
	}
}
