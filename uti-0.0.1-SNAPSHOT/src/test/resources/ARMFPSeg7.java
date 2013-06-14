package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg7 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(ipr_ratio_4w_ato_dol);
    variables.add(added_address_lt_14);
    variables.add(ach_dof_age);
    variables.add(ncc_failed_ratio);
    variables.add(s_trans_ip3_tof_t_v2);
    variables.add(MOA_V_MOALife);
    variables.add(s_ms_amt_dk_40);
    variables.add(email_MP_since_bought);
    variables.add(PC_LT50K_Income_CCBIN);
    variables.add(return_lt_30d_cnt);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(return_lt_14d_cnt);
    variables.add(seen_same_bankid_90d_ago);
    variables.add(v31_ip_hopping);
    variables.add(rt_num_rate);
    variables.add(v2_ph_indicative);
    variables.add(first_ach_txn_dof);
    variables.add(v3_browser_lang_match);
    variables.add(acct_h_s_cnt_dk_320);
    variables.add(v21_e_dom_score_worst);
    variables.add(email_percofnumeric);
    variables.add(outamt_to_avg_faild);
    variables.add(isebay);
    variables.add(ebay_5d_txn_dk_360all);
    variables.add(rcvr_cc_d_amt_dk_5);
    variables.add(num_logins_7_days);
    variables.add(email_percofasdf);
    variables.add(ebay_dy_snc_sus_max_360all);


    return variables;
    
  }
  
  @Override
  protected double getWoeValue(String varName, Object value, Map<String, Object> context)
      throws Exception {
	String valueStr = "";
	double valueDouble = 0;
	int valueInteger; // for context variables
	
	if (value instanceof String)
		valueStr = (String)value;
	else if (value instanceof Number)
		valueDouble = ((Number)value).doubleValue();
	else if (value instanceof NullValue)
		value = null;

	double woeValue = 0;

    if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 1.042956;
    else if (-1e38 < valueDouble && valueDouble <= 0.1261228673) woeValue = -1.004659;
    else if (0.1261228673 < valueDouble && valueDouble <= 0.1717554798) woeValue = -0.584318;
    else if (0.1717554798 < valueDouble && valueDouble <= 0.2143687269) woeValue = -0.405978;
    else if (0.2143687269 < valueDouble && valueDouble <= 0.2649382022) woeValue = -0.259407;
    else if (0.2649382022 < valueDouble && valueDouble <= 0.6721935309) woeValue = -0.159597;
    else if (0.6721935309 < valueDouble && valueDouble <= 0.901488498) woeValue = 0.273052;
    else if (0.901488498 < valueDouble && valueDouble <= 0.9912449124) woeValue = 0.628109;
    else if (0.9912449124 < valueDouble && valueDouble <= 1.055290139) woeValue = 0.807426;
    else if (1.055290139 < valueDouble && valueDouble <= 1.2969156447) woeValue = 0.984992;
    else if (1.2969156447 < valueDouble && valueDouble <= 1.5366969249) woeValue = 1.027654;
    else if (1.5366969249 < valueDouble && valueDouble <= 3.125794155) woeValue = 1.187650;
    else if ( valueDouble > 3.125794155) woeValue = 1.709424;
    else woeValue = 0;}else if(PC_LT50K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.066205;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.188842;
    else if (0 < valueDouble && valueDouble <= 0.0890688259) woeValue = -0.432884;
    else if (0.0890688259 < valueDouble && valueDouble <= 0.115902965) woeValue = 0.175673;
    else if ( valueDouble > 0.115902965) woeValue = 0.547609;
    else woeValue = 0;}else if(acct_h_s_cnt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.884047;
    else if (0 < valueDouble && valueDouble <= 0.0927) woeValue = 0.168910;
    else if (0.0927 < valueDouble && valueDouble <= 1.0598) woeValue = -0.290780;
    else if (1.0598 < valueDouble && valueDouble <= 1.2864) woeValue = -0.293705;
    else if (1.2864 < valueDouble && valueDouble <= 3.2425) woeValue = -0.738411;
    else if ( valueDouble > 3.2425) woeValue = -1.093804;
    else woeValue = 0;}else if(ach_dof_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 1.990729;
    else if (-1 < valueDouble && valueDouble <= 0.009569378) woeValue = 1.145994;
    else if (0.009569378 < valueDouble && valueDouble <= 0.4241501776) woeValue = 0.260781;
    else if (0.4241501776 < valueDouble && valueDouble <= 0.9996734161) woeValue = 0.120233;
    else if ( valueDouble > 0.9996734161) woeValue = -0.162191;
    else woeValue = 0;}else if(added_address_lt_14.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.071664;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.006802;
    else if ( valueDouble > 1) woeValue = 0.956292;
    else woeValue = 0;}else if(ebay_5d_txn_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.688618;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.469053;
    else if (0 < valueDouble && valueDouble <= 1.899065E-16) woeValue = 0.648726;
    else if (1.899065E-16 < valueDouble && valueDouble <= 3.3911661E-6) woeValue = 0.349049;
    else if (3.3911661E-6 < valueDouble && valueDouble <= 0.0273237238) woeValue = -0.198927;
    else if ( valueDouble > 0.0273237238) woeValue = -0.631648;
    else woeValue = 0;}else if(ebay_dy_snc_sus_max_360all.getName().equals(varName)){if (value == null) woeValue = -0.037953;
    else if (-1e38 < valueDouble && valueDouble <= 182) woeValue = 2.139435;
    else if (182 < valueDouble && valueDouble <= 378) woeValue = 0.899277;
    else if (378 < valueDouble && valueDouble <= 1117) woeValue = 0.543378;
    else if (1117 < valueDouble && valueDouble <= 1461) woeValue = 0.365463;
    else if (1461 < valueDouble && valueDouble <= 2697) woeValue = 0.019135;
    else if ( valueDouble > 2697) woeValue = -0.779076;
    else woeValue = 0;}else if(email_MP_since_bought.getName().equals(varName)){if (value == null) woeValue = 0.301606;
    else if (-1e38 < valueDouble && valueDouble <= 52) woeValue = 1.836952;
    else if (52 < valueDouble && valueDouble <= 560) woeValue = 0.519942;
    else if (560 < valueDouble && valueDouble <= 1078) woeValue = -0.172125;
    else if (1078 < valueDouble && valueDouble <= 1435) woeValue = -0.199547;
    else if (1435 < valueDouble && valueDouble <= 3365) woeValue = -0.687016;
    else if (3365 < valueDouble && valueDouble <= 3671) woeValue = -0.853357;
    else if ( valueDouble > 3671) woeValue = -1.344428;
    else woeValue = 0;}else if(email_percofasdf.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.050750;
    else if (0 < valueDouble && valueDouble <= 0.0769230769) woeValue = -0.476614;
    else if (0.0769230769 < valueDouble && valueDouble <= 0.16) woeValue = -0.059010;
    else if (0.16 < valueDouble && valueDouble <= 0.4736842105) woeValue = 0.029493;
    else if ( valueDouble > 0.4736842105) woeValue = 0.616947;
    else woeValue = 0;}else if(email_percofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.094758;
    else if (0 < valueDouble && valueDouble <= 0.5) woeValue = 0.159674;
    else if ( valueDouble > 0.5) woeValue = 0.743613;
    else woeValue = 0;}else if(first_ach_txn_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 20) woeValue = 1.790092;
    else if (20 < valueDouble && valueDouble <= 52) woeValue = 1.186804;
    else if (52 < valueDouble && valueDouble <= 106) woeValue = 0.849409;
    else if (106 < valueDouble && valueDouble <= 199) woeValue = 0.501531;
    else if (199 < valueDouble && valueDouble <= 223) woeValue = 0.261349;
    else if (223 < valueDouble && valueDouble <= 336) woeValue = 0.124181;
    else if (336 < valueDouble && valueDouble <= 624) woeValue = -0.205177;
    else if (624 < valueDouble && valueDouble <= 680) woeValue = -0.297542;
    else if (680 < valueDouble && valueDouble <= 727) woeValue = -0.869832;
    else if (727 < valueDouble && valueDouble <= 728) woeValue = -1.083801;
    else if ( valueDouble > 728) woeValue = -0.335927;
    else woeValue = 0;}else if(ipr_ratio_4w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.043718;
    else if (-1e38 < valueDouble && valueDouble <= 0.0605506582) woeValue = -0.203132;
    else if (0.0605506582 < valueDouble && valueDouble <= 0.2426435573) woeValue = 0.149664;
    else if (0.2426435573 < valueDouble && valueDouble <= 0.3856386109) woeValue = 0.170777;
    else if (0.3856386109 < valueDouble && valueDouble <= 1.9) woeValue = 0.396541;
    else if ( valueDouble > 1.9) woeValue = 1.150300;
    else woeValue = 0;}else if(isebay.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.345384;
    else if ( valueDouble > 0) woeValue = -0.456535;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = -0.045674;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.316532;
    else if (0 < valueDouble && valueDouble <= 0.0135135135) woeValue = -1.627039;
    else if (0.0135135135 < valueDouble && valueDouble <= 0.1474358974) woeValue = -0.660742;
    else if (0.1474358974 < valueDouble && valueDouble <= 0.1777301927) woeValue = -0.341075;
    else if (0.1777301927 < valueDouble && valueDouble <= 0.2215909091) woeValue = -0.235711;
    else if (0.2215909091 < valueDouble && valueDouble <= 0.3276836158) woeValue = -0.170909;
    else if (0.3276836158 < valueDouble && valueDouble <= 0.3406593407) woeValue = 0.366283;
    else if (0.3406593407 < valueDouble && valueDouble <= 0.578313253) woeValue = 0.526262;
    else if (0.578313253 < valueDouble && valueDouble <= 0.6279069767) woeValue = 0.693179;
    else if (0.6279069767 < valueDouble && valueDouble <= 0.8) woeValue = 0.813197;
    else if ( valueDouble > 0.8) woeValue = 1.451726;
    else woeValue = 0;}else if(num_logins_7_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.674545;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = -0.315608;
    else if (4 < valueDouble && valueDouble <= 8) woeValue = -0.167889;
    else if (8 < valueDouble && valueDouble <= 10) woeValue = -0.068747;
    else if (10 < valueDouble && valueDouble <= 14) woeValue = -0.045098;
    else if (14 < valueDouble && valueDouble <= 16) woeValue = 0.080942;
    else if (16 < valueDouble && valueDouble <= 43) woeValue = 0.772399;
    else if ( valueDouble > 43) woeValue = 1.396379;
    else woeValue = 0;}else if(outamt_to_avg_faild.getName().equals(varName)){if (value == null) woeValue = 2.407796;
    else if (-1e38 < valueDouble && valueDouble <= 0.2367631297) woeValue = -0.507399;
    else if (0.2367631297 < valueDouble && valueDouble <= 0.6246275234) woeValue = -0.346751;
    else if (0.6246275234 < valueDouble && valueDouble <= 2.8926590806) woeValue = -0.264150;
    else if (2.8926590806 < valueDouble && valueDouble <= 3.8355091384) woeValue = -0.048126;
    else if (3.8355091384 < valueDouble && valueDouble <= 4.2639972064) woeValue = 0.011342;
    else if (4.2639972064 < valueDouble && valueDouble <= 8.5821944553) woeValue = 0.229726;
    else if (8.5821944553 < valueDouble && valueDouble <= 10.72985348) woeValue = 0.521769;
    else if (10.72985348 < valueDouble && valueDouble <= 22.293764988) woeValue = 1.114795;
    else if ( valueDouble > 22.293764988) woeValue = 1.628145;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.560446;
    else if (-1e38 < valueDouble && valueDouble <= 0.3692065986) woeValue = -0.731476;
    else if (0.3692065986 < valueDouble && valueDouble <= 0.8915662651) woeValue = -0.070500;
    else if (0.8915662651 < valueDouble && valueDouble <= 0.9629124005) woeValue = 0.388668;
    else if (0.9629124005 < valueDouble && valueDouble <= 3.0210205636) woeValue = 0.425168;
    else if (3.0210205636 < valueDouble && valueDouble <= 7.396978022) woeValue = 0.459390;
    else if ( valueDouble > 7.396978022) woeValue = 0.768686;
    else woeValue = 0;}else if(rcvr_cc_d_amt_dk_5.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.328900;
    else if (0 < valueDouble && valueDouble <= 221661.1438) woeValue = 0.181128;
    else if ( valueDouble > 221661.1438) woeValue = -0.661207;
    else woeValue = 0;}else if(return_lt_14d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.014281;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.495006;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.297532;
    else if ( valueDouble > 2) woeValue = 1.337688;
    else woeValue = 0;}else if(return_lt_30d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.058172;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.923909;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = -0.043082;
    else if (3 < valueDouble && valueDouble <= 5) woeValue = 0.572278;
    else if ( valueDouble > 5) woeValue = 1.420534;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0.076739;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.237500;
    else if (0 < valueDouble && valueDouble <= 0.005) woeValue = -0.685697;
    else if (0.005 < valueDouble && valueDouble <= 0.014) woeValue = -0.222006;
    else if (0.014 < valueDouble && valueDouble <= 0.024) woeValue = 0.389132;
    else if (0.024 < valueDouble && valueDouble <= 0.052) woeValue = 0.582316;
    else if ( valueDouble > 0.052) woeValue = 0.986093;
    else woeValue = 0;}else if(s_ms_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.143371;
    else if (0 < valueDouble && valueDouble <= 0.0004) woeValue = -0.514217;
    else if (0.0004 < valueDouble && valueDouble <= 42.9831) woeValue = -0.297733;
    else if (42.9831 < valueDouble && valueDouble <= 70.9706) woeValue = -0.271712;
    else if (70.9706 < valueDouble && valueDouble <= 109.7717) woeValue = -0.260020;
    else if (109.7717 < valueDouble && valueDouble <= 1006.2558) woeValue = -0.183094;
    else if (1006.2558 < valueDouble && valueDouble <= 2575.0266) woeValue = -0.115784;
    else if (2575.0266 < valueDouble && valueDouble <= 5711.4086) woeValue = 0.370100;
    else if (5711.4086 < valueDouble && valueDouble <= 8069.7351) woeValue = 0.831405;
    else if (8069.7351 < valueDouble && valueDouble <= 24419.6055) woeValue = 1.047546;
    else if ( valueDouble > 24419.6055) woeValue = 1.757921;
    else woeValue = 0;}else if(s_trans_ip3_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 974028) woeValue = 0.185796;
    else if (974028 < valueDouble && valueDouble <= 12156037) woeValue = -0.046278;
    else if (12156037 < valueDouble && valueDouble <= 20164095) woeValue = -0.152435;
    else if (20164095 < valueDouble && valueDouble <= 29347206) woeValue = -0.213434;
    else if (29347206 < valueDouble && valueDouble <= 133626313) woeValue = -0.403286;
    else if ( valueDouble > 133626313) woeValue = -1.732668;
    else woeValue = 0;}else if(seen_same_bankid_90d_ago.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.951998;
    else if ( valueDouble > 0) woeValue = -0.290909;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "BAD").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.829780;
    else if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.596646;
    else if (Arrays.asList( "UNKNOWN","NO_EMAILS").contains(value)) woeValue = 0.008618;
    else if (Arrays.asList( "MED","_MISSING_").contains(value)) woeValue = 0.186070;
    else woeValue = 0;}else if(v2_ph_indicative.getName().equals(varName)){if (Arrays.asList(" ").contains(value)) woeValue = -0.829780;
    else if (Arrays.asList( "CORP","FIXED_GEO_MATCH").contains(value)) woeValue = -0.753222;
    else if (Arrays.asList( "FIXED").contains(value)) woeValue = -0.646070;
    else if (Arrays.asList( "TWO_SIMILAR").contains(value)) woeValue = -0.385724;
    else if (Arrays.asList( "NO_PHONES","TWO_GEO_MATCH").contains(value)) woeValue = 0.041722;
    else if (Arrays.asList( "MOBILE").contains(value)) woeValue = 0.272671;
    else if (Arrays.asList( "OTHER","_MISSING_").contains(value)) woeValue = 0.581434;
    else woeValue = 0;}else if(v31_ip_hopping.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "STATE_HOPPING_EXCESSIVE"," ","NO_HOPPING").contains(value)) woeValue = -0.188703;
    else if (Arrays.asList( "IP_HOP_1","CTRY_HOPPING_GT2").contains(value)) woeValue = 0.260304;
    else if (Arrays.asList( "STATE_HOPPING_2","IP_HOPPING_2","CTRY_HOPPING_2").contains(value)) woeValue = 1.207619;
    else if (Arrays.asList( "CTRY_HOPPING_EXCESSIVE","CITY_HOPPING_2").contains(value)) woeValue = 1.405065;
    else if (Arrays.asList( "STATE_HOPPING_GT2","CITY_HOPPING_GT2","IP_HOPPING_GT2").contains(value)) woeValue = 2.596522;
    else woeValue = 0;}else if(v3_browser_lang_match.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "BAD").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MANY_LANGS").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "JOKER_MISMATCH"," ").contains(value)) woeValue = -1.064727;
    else if (Arrays.asList( "JOKER_MATCH","MISMATCH","NO_LANG").contains(value)) woeValue = -0.147762;
    else if (Arrays.asList( "MATCH","STRONG_MATCH").contains(value)) woeValue = 0.147381;
    else if (Arrays.asList( "JOKER").contains(value)) woeValue = 1.069866;
    else woeValue = 0;}
	
	else 

		{
			throw new RuntimeException("WOE not available for variable " + varName);
		}
		
		return woeValue;
  }
  
  @Override
  public HashMap<String, Double> getCoeffMap() {
    HashMap<String, Double> coeffMap = new HashMap<String, Double>();
    
    coeffMap.put("Intercept",+3.76971797);
    coeffMap.put(MOA_V_MOALife.getName(),-0.18519651);
    coeffMap.put(acct_h_s_cnt_dk_320.getName(),-0.95100716);
    coeffMap.put(first_ach_txn_dof.getName(),-0.32023685);
    coeffMap.put(outamt_to_avg_faild.getName(),-0.76336306);
    coeffMap.put(ebay_5d_txn_dk_360all.getName(),-0.32372718);
    coeffMap.put(email_MP_since_bought.getName(),-0.49741813);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.50812062);
    coeffMap.put(seen_same_bankid_90d_ago.getName(),-0.36829720);
    coeffMap.put(s_ms_amt_dk_40.getName(),-0.19776585);
    coeffMap.put(num_logins_7_days.getName(),-0.58860171);
    coeffMap.put(return_lt_30d_cnt.getName(),-0.64819846);
    coeffMap.put(ncc_failed_ratio.getName(),-0.69688636);
    coeffMap.put(rt_num_rate.getName(),-0.56868678);
    coeffMap.put(v31_ip_hopping.getName(),-0.50810613);
    coeffMap.put(isebay.getName(),-0.49686574);
    coeffMap.put(ach_dof_age.getName(),-0.79854903);
    coeffMap.put(return_lt_14d_cnt.getName(),-0.53708711);
    coeffMap.put(v2_ph_indicative.getName(),-0.45530784);
    coeffMap.put(PC_LT50K_Income_CCBIN.getName(),-0.55891118);
    coeffMap.put(rcvr_cc_d_amt_dk_5.getName(),-0.73826955);
    coeffMap.put(s_trans_ip3_tof_t_v2.getName(),-0.46542331);
    coeffMap.put(ebay_dy_snc_sus_max_360all.getName(),-0.81483541);
    coeffMap.put(added_address_lt_14.getName(),-0.49589979);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.35171379);
    coeffMap.put(v3_browser_lang_match.getName(),-0.42145281);
    coeffMap.put(ipr_ratio_4w_ato_dol.getName(),-0.50129085);
    coeffMap.put(email_percofnumeric.getName(),-0.92227043);
    coeffMap.put(email_percofasdf.getName(),-0.99452100);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 849.65607765;
  }

  @Override
  public double getCoeff2() {
    return  -55.61889668;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT7;
  }
  
}