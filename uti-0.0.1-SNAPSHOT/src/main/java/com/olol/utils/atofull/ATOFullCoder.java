package com.olol.utils.atofull;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

import com.olol.utils.Spec;

public class ATOFullCoder {
	
	private final static String GROUP = "ATOFullSuperSeg";
	
	private static Properties VAR_MAPPING = new Properties();
	
	static {
		try {
			
			VAR_MAPPING.load(new FileReader(new File("varmapping.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private int segment;
	
	public ATOFullCoder(int segment){
		this.segment = segment;
	}
	
	public Spec getSpec() throws IOException {
		Spec spec = new ATOFullSpec();
		File woeFile = new ClassPathResource("variables.woe").getFile();
		List<String> woe = FileUtils.readLines(woeFile);
		List<String> scorecard = FileUtils.readLines(woeFile);
		
		spec.put("class", GROUP+segment);
		
		String cam2011_scr = scorecard.get(scorecard.size()-1);
		//parseCoeffs(spec, cam2011_scr);
		parseScoreCard(spec, scorecard);
		parseWOE(spec, woe);
	
		
		return spec;
	}
	
	private void parseScoreCard(Spec spec, List<String> scorecard) {
		Map<String, String> varMap = new LinkedHashMap<String, String>();
		List<String> vars = new LinkedList<String>();
		for(String line : scorecard){
			if(line!=null && line.length()>0) {
				char ch = line.charAt(0);
				if(ch=='+'||ch=='-'){
					int i = line.indexOf('(');
					int j =  line.indexOf('*');
					int k =  line.indexOf(')');
					String w = ch+line.substring(i+1, j).trim();
					String v = line.substring(j+1, k).trim();
					if(v.startsWith("w"))v = v.substring(1, v.length());
					if(v.endsWith("_s"+segment))v = v.substring(0, v.length()-("_s"+segment).length());
					String v2 = VAR_MAPPING.getProperty(v);
					if(v2==null){
						v2 = v;
						if(!v.equalsIgnoreCase("Intercept"))System.err.println(v);
					}
					if(v.equalsIgnoreCase("Intercept"))
						varMap.put("\"Intercept\"", w);
					else
						varMap.put(v2.toUpperCase()+".getName()", w);
					if(!v.equalsIgnoreCase("Intercept"))vars.add(v2.toUpperCase());
				}
			}
		}
		
		spec.put("vars", vars);
		spec.put("scorecard", varMap.entrySet());
		
	}

	private void parseCoeffs(Spec spec, String cam2011Scr) {
		int i = cam2011Scr.indexOf('=');
		int j =  cam2011Scr.indexOf('+');
		int k =  cam2011Scr.indexOf('*');
		
		//spec.put("coeff1", cam2011Scr.substring(i+1, j).trim());
		//spec.put("coeff2", cam2011Scr.substring(j+1, k).trim());
	}

	private void parseWOE(Spec spec, List<String> woe){
		List<String> blocks = new LinkedList<String>();
		StringBuilder builder = new StringBuilder();
		String v = null;
		String type = "double";
		for(String line : woe){
			
			if(line!=null && !line.trim().isEmpty()){
				line = line.trim();
				
				if (line.startsWith("label")) continue;
				
				if(line.startsWith("/*")){
					//System.out.println(line);
					v = subString(line, "for ", "*/");
					if("industry_cat".equals(v))type="int";
					else if("billing_cntry".equals(v) || "shipping_cntry".equals(v)
							||v.startsWith("buyer_region")
							||v.equals("cp_delta_1w_appr_pertxn_c")
							||v.equals("ARS_v3_ip_ad_dist_3d_worst")
							||v.equals("ARS_v31_ip_hopping")
							||v.equals("ipr_delta_20w_appr_pertxn_c")
							||v.equals("ARS_v2_ad_type_indicative")
							||v.equals("s_de_country")
							||v.equals("ARS_v2_ip_net_score_worst")
							||v.equals("ARS_v31_ip_country_match")
							||v.equals("ARS_v2_acct_ad_add_event_10d")
							||v.equals("ARS_v2_ip_bin_ctry_score_worst")
							||v.equals("ARS_v31_ip_conn_type_indic")
							||v.equals("vid_delta_20w_appr_pertxn_c")
							||v.equals("ARS_v3_txn_cat")
//							||v.equals("ARS_v3_ip_ad_dist_3d_wst_num")
							||v.equals("ARS_v31_ip_country_match")
							||v.equals("ARS_v2_acct_num_tx_events_10d")
							||v.equals("ARS_CPConsistEnum")
							||v.equals("ARS_v3_ip_ad_dist_3d_worst")
							||v.equals("cp_delta_20w_appr_pertxn_c")
							||v.equals("ARS_CPConsistEnum")
							||v.equals("ARS_v2_acct_ip_new_ctry")
							||v.equals("ARS_AcctConsistRelAgeScore")
							||v.equals("ARS_v31_ip_hopping")
							||v.equals("cp_delta_20w_appr_pertxn_c")
							||v.equals("ARS_CPConsistEnum")
							||v.equals("ARS_v2_ip_conn_type_indicative")
							||v.equals("ARS_v2_beacon_lat_ratio_to_net")
							||v.equals("ARS_v3_txn_cat")
							||v.equals("ARS_AcctConsistRelAgeScore")
							||v.equals("ARS_v21_ip_ethnicity_match_best")
							||v.equals("ARS_v21_ip_ph_geo_worst")
							||v.equals("ARS_v31_ip_ship_bill_match")
							||v.equals("ARS_v2_ip_bin_ctry_score_worst")
							||v.equals("ARS_v2_ph_indicative")
							||v.equals("ARS_v2_e_ip_eq_indicative")
							||v.equals("ARS_v21_cc_name_bogus_any")
							||v.equals("ARS_v3_browser_lang_match")
							||v.equals("ARS_v3_ebay_item_ars_category")
							||v.equals("ARS_v31_ship_ad_name_match")
							||v.equals("s_de_most_used_country")
							||v.equals("snr_delta_20w_appr_pertxn_c")
							||v.equals("ARS_v31_ip_conn_type")
							||v.equals("ARS_v21_ip_same_vid_diff_worst")
							||v.equals("ARS_v2_beacon_lat_ratio_3d_wst")
							||v.equals("ipr_delta_4w_appr_pertxn_c")
							||v.equals("vid_delta_4w_appr_pertxn_c")
							||v.equals("ARS_v2_ip_conn_type_old")
							||v.equals("ARS_v31_trigger_in_trusted")
							||v.equals("ARS_v2_e_dom_type_indicative")
							)
						
						type="string";
					else type = "double";
					String v2 = VAR_MAPPING.getProperty(v);
					if(v2==null){
						System.err.println(v);
						builder.append("if("+v.toUpperCase()+".getName().equals(varName)){").append("\r\n");
						//v2 = v.toUpperCase();
					}
					else 
					{
						builder.append("if("+v2.toUpperCase()+".getName().equals(varName)){").append("\r\n");
					}
				}
				else if("double".equals(type)){
					if(line.startsWith("if")){
						String w = lastSubString(line, "=", ";");
						builder.append("\tif (value == null) woeValue =").append(w).append(";\r\n");

					}else if(line.startsWith("else if")){ 
						String code = line;
						String w = lastSubString(line, "=", ";");
						int c = countOps(line);
						if(c==1){
							//System.out.println(line);
							String t = null;
							
							if(line.contains(")"))
								t = subString(line, v, ")");
							else
								t = subString(line, v, "then");
							code = "else if ( valueDouble "+t+" )"+" woeValue =  "+w;
							
						}else {
							//System.out.println(line);
							String t1 = subString(line, "(", v);
							//if(t1.equals("."))t1= "-1e38";
							String t2 = subString(line, v, ")");
							if("-1e38 <".equals(t1.trim()) && "<= .".equals(t2.trim()))
								continue;
							else if (". <".equals(t1.trim()))
								code = "else if ( value!=null && valueDouble "+t2+" )"+" woeValue =  "+w;
							else 
								code = "else if ( "+t1+" valueDouble && valueDouble "+t2+" )"+" woeValue =  "+w;

						}
						code = code.replace("then w"+v+"_s"+segment, "woeValue");
						builder.append("\t").append(code).append(";\r\n");;

					}else if(line.startsWith("else")){ 
						builder.append("\telse woeValue = 0;\r\n}\r\nelse ");
						blocks.add(builder.toString());
						builder = new StringBuilder();
						type = "double";
					}else if (!line.startsWith("label")){
						builder = new StringBuilder();
						//System.out.println(line);
						v = lastSubString(line, "=", ";");
						String v2 = VAR_MAPPING.getProperty(v);
						if(v2==null)System.err.println(v);
						builder.append("if("+v2+".getName().equals(varName)){").append("\r\n");
						builder.append("\tif (value == null) woeValue = 0.0;\r\n");
						builder.append("\telse woeValue = valueDouble;\r\n").append("}\r\nelse");
						
						blocks.add(builder.toString());
						builder = new StringBuilder();
						type = "double";
					}

				}else if("int".equals(type)){
					if(line.startsWith("if")||line.startsWith("else if")){
						String pre = "if";
						if(line.startsWith("else")) pre = "else if";
						//System.out.println(line);
						String w = lastSubString(line, "=", ";");
						
						if(line.contains(" in ")){
							String eles = subString(line, "(", ")");
							eles = eles.replace("'", "").replace(" ", "");
							eles = eles.replace(".", "null");
							builder.append("\t").append(pre)
							.append("( Arrays.asList(").append(eles).append(").contains(value) ) woeValue = ")
							.append(w).append(";\r\n");
						}else {
							String ele = subString(line, "=", "then");
							ele = ele.replace("'", "").replace(" ", "");
							builder.append("\t").append(pre).append("( ");
							if(!".".equals(ele)){
	
								builder.append("value!=null && value.equals(").append(ele).append(") ");
							}else {
								builder.append("value==null ");
							}
							builder.append(") woeValue = ").append(w).append(";\r\n");
						}
						
					
					}else if(line.startsWith("else")){ 
						builder.append("\telse woeValue = 0;\r\n}\r\nelse ");
						blocks.add(builder.toString());
						builder = new StringBuilder();
						type = "double";
					}
				}else if("string".equals(type)){
					if(line.startsWith("if")||line.startsWith("else if")){
						String pre = "if";
						if(line.startsWith("else")) pre = "else if";
						//System.out.println(line);
						String w = lastSubString(line, "=", ";");
						
						if(line.contains(" in ")){
							String eles = subString(line, "(", ")");
							eles = eles.replace("'", "\"").replace(" ", "");
							eles = eles.replace(".", "null");
							builder.append("\t").append(pre)
							.append("( Arrays.asList(").append(eles).append(").contains(value) ) woeValue = ")
							.append(w).append(";\r\n");
						}else {
							String ele = subString(line, "=", "then");
							ele = ele.replace("'", "\"").replace(" ", "");
							builder.append("\t").append(pre).append("( ");
							if(!".".equals(ele)){
	
								builder.append("value!=null && value.equals(").append(ele).append(") ");
							}else {
								builder.append("value==null ");
							}
							builder.append(") woeValue = ").append(w).append(";\r\n");
						}
						
					
					}else if(line.startsWith("else")){ 
						builder.append("\telse woeValue = 0;\r\n}\r\nelse ");
						blocks.add(builder.toString());
						builder = new StringBuilder();
						type = "double";
					}
				}
			}
			
		}
		
		spec.put("woe", blocks);
	}
	
	
	private int countOps(String line) {
		int c = 0;
		for(int i = 0; i<line.length();i++){
			char ch = line.charAt(i);
			if(ch=='<' || ch=='>')c++;
		}
		return c;
	}

	private static String subString(String input, String start, String end){
		int i = input.indexOf(start)+start.length();
		int j = input.indexOf(end, i);
		return input.substring(i, j).trim();
	}
	
	private static String lastSubString(String input, String start, String end){
		int i = input.lastIndexOf(start)+start.length();
		int j = input.indexOf(end, i);
		return input.substring(i, j).trim();
	}
	
	public void coding(Spec spec){
		
		StringTemplateGroup templateGroup = new StringTemplateGroup("myGroup", "./src/test/resources");
		StringTemplate template = templateGroup.getInstanceOf(GROUP);
		
		for(Map.Entry<String, Object> entry : spec.getParameters().entrySet()){
			template.setAttribute(entry.getKey(), entry.getValue());
		}
		String javaCode = template.toString();
		System.out.println(javaCode);

	}
	
	public static void main(String[] args) throws IOException {
		
		
//		List<Integer> list = Arrays.asList(1,2, null);
//		System.out.println(list.contains(null));
//		Integer i = 1;
//		Integer i2 = null;
//		System.out.println(i2==null);
//		System.out.println(1==i2);
	}
}
