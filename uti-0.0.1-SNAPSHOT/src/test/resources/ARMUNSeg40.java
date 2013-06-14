package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg40 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(wach_n_checking);
    variables.add(email_MP_UPI_AMT_180d);
    variables.add(v35_ip_ph_geo_worst);
    variables.add(rcvr_cc_d_cnt_dk_160);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(s_cc_s_amt_dk_80);
    variables.add(v3_browser_lang_match);
    variables.add(n_rt_dcl_14dys);
    variables.add(CP4WRtDolBadTxn);
    variables.add(v36_cc_bin_indc);
    variables.add(nach_amt_max_ratio);
    variables.add(s_ms_cnt_dk_20);
    variables.add(Declined_asp_ccbin);
    variables.add(added_phone_lt_30);
    variables.add(s_pmts_rcvd_count);
    variables.add(cc_pct_passed_cvv2);
    variables.add(min_eaby_dof_360all);
    variables.add(s_amt_dk_20);
    variables.add(v31_ip_shipping_billing_match);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(s_trans_ip3_tof_t_v2);
    variables.add(txnsnt_amt_stss_sd_lst_48_hrs);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(s_ach_faild_2nd_count);
    variables.add(v35_ip_conn_type);
    variables.add(ebay_dy_snc_sus_max_360all);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(v2_ip_conn_type_old);
    variables.add(outamt_to_avg_cleard);
    variables.add(s_rtrn_decay_180d_cnt);


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

    if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.566793;
    else if (0 < valueDouble && valueDouble <= 0.0026) woeValue = -0.807727;
    else if (0.0026 < valueDouble && valueDouble <= 0.0034) woeValue = -0.762761;
    else if (0.0034 < valueDouble && valueDouble <= 0.0036) woeValue = -0.569719;
    else if (0.0036 < valueDouble && valueDouble <= 0.0062) woeValue = -0.340408;
    else if (0.0062 < valueDouble && valueDouble <= 0.0175) woeValue = 0.195231;
    else if (0.0175 < valueDouble && valueDouble <= 0.0253) woeValue = 0.491017;
    else if ( valueDouble > 0.0253) woeValue = 2.048177;
    else woeValue = 0;}else if(Declined_asp_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.053357;
    else if (-1e38 < valueDouble && valueDouble <= 7567.0141249) woeValue = 1.600905;
    else if (7567.0141249 < valueDouble && valueDouble <= 12236.321531) woeValue = 0.671112;
    else if (12236.321531 < valueDouble && valueDouble <= 18920.206105) woeValue = 0.033003;
    else if (18920.206105 < valueDouble && valueDouble <= 19325.479094) woeValue = -0.187297;
    else if (19325.479094 < valueDouble && valueDouble <= 23774.766454) woeValue = -0.461954;
    else if ( valueDouble > 23774.766454) woeValue = -0.833671;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.871577;
    else if (0 < valueDouble && valueDouble <= 565) woeValue = 0.491204;
    else if (565 < valueDouble && valueDouble <= 14087) woeValue = -0.078849;
    else if ( valueDouble > 14087) woeValue = -1.149392;
    else woeValue = 0;}else if(added_phone_lt_30.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.013222;
    else if ( valueDouble > 0) woeValue = 1.025079;
    else woeValue = 0;}else if(cc_pct_passed_cvv2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.152764;
    else if (0 < valueDouble && valueDouble <= 0.4444444444) woeValue = 0.247019;
    else if (0.4444444444 < valueDouble && valueDouble <= 0.8888888889) woeValue = -0.132150;
    else if ( valueDouble > 0.8888888889) woeValue = -1.024872;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.340638;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.431304;
    else if ( valueDouble > 1) woeValue = 0.787782;
    else woeValue = 0;}else if(ebay_dy_snc_sus_max_360all.getName().equals(varName)){if (value == null) woeValue = -0.156014;
    else if (-1e38 < valueDouble && valueDouble <= 96) woeValue = 2.435455;
    else if (96 < valueDouble && valueDouble <= 337) woeValue = 1.893822;
    else if (337 < valueDouble && valueDouble <= 1501) woeValue = 1.638476;
    else if (1501 < valueDouble && valueDouble <= 3557) woeValue = 0.522871;
    else if (3557 < valueDouble && valueDouble <= 3870) woeValue = -0.014523;
    else if ( valueDouble > 3870) woeValue = -1.370095;
    else woeValue = 0;}else if(email_MP_UPI_AMT_180d.getName().equals(varName)){if (value == null) woeValue = 0.239881;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.664833;
    else if (0 < valueDouble && valueDouble <= 87.5) woeValue = 0.057936;
    else if ( valueDouble > 87.5) woeValue = 1.881890;
    else woeValue = 0;}else if(min_eaby_dof_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1023) woeValue = 0.441310;
    else if (1023 < valueDouble && valueDouble <= 1350) woeValue = 0.070813;
    else if (1350 < valueDouble && valueDouble <= 1654) woeValue = 0.001501;
    else if (1654 < valueDouble && valueDouble <= 1934) woeValue = -0.435454;
    else if (1934 < valueDouble && valueDouble <= 4729) woeValue = -0.750629;
    else if ( valueDouble > 4729) woeValue = -1.342726;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.059259) woeValue = -0.448490;
    else if (0.059259 < valueDouble && valueDouble <= 0.08046) woeValue = -0.193188;
    else if (0.08046 < valueDouble && valueDouble <= 0.189487) woeValue = -0.133468;
    else if ( valueDouble > 0.189487) woeValue = 1.821534;
    else woeValue = 0;}else if(nach_amt_max_ratio.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0254230293) woeValue = -0.915463;
    else if (0.0254230293 < valueDouble && valueDouble <= 0.0563628579) woeValue = -0.529522;
    else if (0.0563628579 < valueDouble && valueDouble <= 0.1429387569) woeValue = -0.165476;
    else if (0.1429387569 < valueDouble && valueDouble <= 0.3718683972) woeValue = 0.037177;
    else if (0.3718683972 < valueDouble && valueDouble <= 0.4313598819) woeValue = 0.203715;
    else if (0.4313598819 < valueDouble && valueDouble <= 0.6706634692) woeValue = 1.280774;
    else if ( valueDouble > 0.6706634692) woeValue = 1.767301;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1.6970365595) woeValue = -0.555403;
    else if (1.6970365595 < valueDouble && valueDouble <= 4.0430448223) woeValue = -0.496441;
    else if (4.0430448223 < valueDouble && valueDouble <= 6.8815897136) woeValue = -0.022387;
    else if (6.8815897136 < valueDouble && valueDouble <= 20.462881499) woeValue = 0.919104;
    else if ( valueDouble > 20.462881499) woeValue = 3.009282;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.658344;
    else if (-1e38 < valueDouble && valueDouble <= 0.0386964542) woeValue = -1.184984;
    else if (0.0386964542 < valueDouble && valueDouble <= 0.1841421594) woeValue = -0.994374;
    else if (0.1841421594 < valueDouble && valueDouble <= 0.2713643178) woeValue = -0.547936;
    else if (0.2713643178 < valueDouble && valueDouble <= 0.3383162864) woeValue = -0.320017;
    else if (0.3383162864 < valueDouble && valueDouble <= 0.9301969784) woeValue = 0.173494;
    else if (0.9301969784 < valueDouble && valueDouble <= 8.0175) woeValue = 0.319253;
    else if ( valueDouble > 8.0175) woeValue = 1.219823;
    else woeValue = 0;}else if(rcvr_cc_d_cnt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.564448;
    else if (0 < valueDouble && valueDouble <= 2.4922) woeValue = -0.412605;
    else if (2.4922 < valueDouble && valueDouble <= 26.6389) woeValue = 0.226408;
    else if (26.6389 < valueDouble && valueDouble <= 53.6322) woeValue = 0.366115;
    else if ( valueDouble > 53.6322) woeValue = 1.326609;
    else woeValue = 0;}else if(s_ach_faild_2nd_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.339801;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.197732;
    else if ( valueDouble > 1) woeValue = 1.568816;
    else woeValue = 0;}else if(s_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.075326;
    else if (0 < valueDouble && valueDouble <= 4.6998) woeValue = -0.645085;
    else if (4.6998 < valueDouble && valueDouble <= 844.6451) woeValue = -0.576231;
    else if (844.6451 < valueDouble && valueDouble <= 3911.4877) woeValue = -0.440006;
    else if (3911.4877 < valueDouble && valueDouble <= 9907.6373) woeValue = 0.098732;
    else if (9907.6373 < valueDouble && valueDouble <= 14099.7671) woeValue = 0.198233;
    else if (14099.7671 < valueDouble && valueDouble <= 23863.1123) woeValue = 1.883073;
    else if ( valueDouble > 23863.1123) woeValue = 2.676747;
    else woeValue = 0;}else if(s_cc_s_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.023069;
    else if (0 < valueDouble && valueDouble <= 145.9885) woeValue = -0.098770;
    else if ( valueDouble > 145.9885) woeValue = -0.480411;
    else woeValue = 0;}else if(s_ms_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.314139;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -0.826550;
    else if (0.0002 < valueDouble && valueDouble <= 0.0012) woeValue = -0.733692;
    else if (0.0012 < valueDouble && valueDouble <= 1.0327) woeValue = -0.330648;
    else if (1.0327 < valueDouble && valueDouble <= 1.6118) woeValue = 0.112447;
    else if (1.6118 < valueDouble && valueDouble <= 2.9075) woeValue = 1.061243;
    else if ( valueDouble > 2.9075) woeValue = 3.049126;
    else woeValue = 0;}else if(s_pmts_rcvd_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 90) woeValue = 0.160632;
    else if ( valueDouble > 90) woeValue = -0.309565;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -2.278157;
    else if (0 < valueDouble && valueDouble <= 0.2621033485) woeValue = -0.656705;
    else if (0.2621033485 < valueDouble && valueDouble <= 0.5995553435) woeValue = -0.534731;
    else if (0.5995553435 < valueDouble && valueDouble <= 0.99650065) woeValue = -0.292442;
    else if (0.99650065 < valueDouble && valueDouble <= 1.0763367669) woeValue = -0.050768;
    else if (1.0763367669 < valueDouble && valueDouble <= 1.3482540979) woeValue = 0.470874;
    else if (1.3482540979 < valueDouble && valueDouble <= 4.765037665) woeValue = 0.820910;
    else if ( valueDouble > 4.765037665) woeValue = 0.967998;
    else woeValue = 0;}else if(s_trans_ip3_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 86400727) woeValue = 0.026390;
    else if (86400727 < valueDouble && valueDouble <= 114296793) woeValue = -0.812660;
    else if ( valueDouble > 114296793) woeValue = -1.070602;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.683465;
    else if ( valueDouble > 0) woeValue = -0.105021;
    else woeValue = 0;}else if(txnsnt_amt_stss_sd_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.316991;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.809326;
    else if (0 < valueDouble && valueDouble <= 0.805) woeValue = 0.348225;
    else if ( valueDouble > 0.805) woeValue = 2.650945;
    else woeValue = 0;}else if(wach_n_checking.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.113600;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.096876;
    else if ( valueDouble > 2) woeValue = 0.676435;
    else woeValue = 0;}else if(v2_ip_conn_type_old.getName().equals(varName)){if (Arrays.asList( "MIL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "_MISSING_","AOL").contains(value)) woeValue = -1.425976;
    else if (Arrays.asList( "GOV").contains(value)) woeValue = -0.998532;
    else if (Arrays.asList( "PUBLIC").contains(value)) woeValue = -0.964630;
    else if (Arrays.asList( "EDU").contains(value)) woeValue = -0.846708;
    else if (Arrays.asList( "DIALUP","ISP","CORP","PRIV","UNKNOWN"," ","WIRELESS","BROADBAND","SAT").contains(value)) woeValue = 0.012861;
    else woeValue = 0;}else if(v31_ip_shipping_billing_match.getName().equals(varName)){if (Arrays.asList( "FULL_MATCH_CTRY_MISTAKE").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "NO_GEO_AD_DIFF","SHIP_MATCH_IP_BUT_BILL_DIFF","SHIP_MATCH_BILL_BUT_IP_DIFF","FULL_CTRY_MATCH").contains(value)) woeValue = -0.311218;
    else if (Arrays.asList( "NO_GEO_AD_MATCH","FULL_MATCH"," ","BILL_MATCH_IP_BUT_SHIP_DIFF","ALL_DIFF","SHIP_AD_NULL").contains(value)) woeValue = 0.525441;
    else woeValue = 0;}else if(v35_ip_conn_type.getName().equals(varName)){if (Arrays.asList( "AOL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MIL_ISP").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "TRAVEL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "_MISSING_","CORP_ISP").contains(value)) woeValue = -2.297815;
    else if (Arrays.asList( "MILITARY","EDU","ISPBIZ").contains(value)) woeValue = -1.197180;
    else if (Arrays.asList( "TRAVEL_OTHER","CORP","EDU_ISP").contains(value)) woeValue = -0.717016;
    else if (Arrays.asList( "UNKNOWN","GOV_ISP","HOSTING_ISP").contains(value)) woeValue = -0.449091;
    else if (Arrays.asList( "NO_DATA","GOVERNMENT"," ","ISP").contains(value)) woeValue = -0.024740;
    else if (Arrays.asList( "MOBILE","TRAVEL_ISP","HOSTING").contains(value)) woeValue = 0.851563;
    else woeValue = 0;}else if(v35_ip_ph_geo_worst.getName().equals(varName)){if (Arrays.asList( "OTHER").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "REGION_MATCH").contains(value)) woeValue = -1.290053;
    else if (Arrays.asList( "CITY_MATCH").contains(value)) woeValue = -0.652313;
    else if (Arrays.asList( "NO_PHONES"," ","NO_MATCH","COUNTRY_MATCH").contains(value)) woeValue = 0.019138;
    else if (Arrays.asList( "MM_ERROR","STATE_MATCH").contains(value)) woeValue = 0.361445;
    else woeValue = 0;}else if(v36_cc_bin_indc.getName().equals(varName)){if (Arrays.asList( "NO_CCS"," ","NO_NEW_CCS","CONSISTENT").contains(value)) woeValue = -0.016862;
    else if (Arrays.asList( "MINOR_MISMATCH").contains(value)) woeValue = 0.390544;
    else if (Arrays.asList( "SINGLE_CC_NEW_ISSUER","MAJOR_MISMATCH").contains(value)) woeValue = 0.770871;
    else if (Arrays.asList( "MATCH_FEW_CCS").contains(value)) woeValue = 0.000000;
    else woeValue = 0;}else if(v3_browser_lang_match.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "STRONG_MATCH").contains(value)) woeValue = -1.438935;
    else if (Arrays.asList( "JOKER").contains(value)) woeValue = -0.743640;
    else if (Arrays.asList( "NO_LANG","JOKER_MATCH","JOKER_MISMATCH","MISMATCH"," ","BAD","MATCH").contains(value)) woeValue = 0.008728;
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
    
    coeffMap.put("Intercept",+6.04726532);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.32007796);
    coeffMap.put(s_ms_cnt_dk_20.getName(),-0.09514155);
    coeffMap.put(s_amt_dk_20.getName(),-0.47671808);
    coeffMap.put(txnsnt_amt_stss_sd_lst_48_hrs.getName(),-0.34011379);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.40443832);
    coeffMap.put(email_MP_UPI_AMT_180d.getName(),-0.27992419);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.53851723);
    coeffMap.put(nach_amt_max_ratio.getName(),-0.39678010);
    coeffMap.put(min_eaby_dof_360all.getName(),-0.56662962);
    coeffMap.put(s_ach_faild_2nd_count.getName(),-0.39343960);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.42669729);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.63200355);
    coeffMap.put(rcvr_cc_d_cnt_dk_160.getName(),-0.25966423);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.38481031);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-1.13282740);
    coeffMap.put(Declined_asp_ccbin.getName(),-0.68280252);
    coeffMap.put(ebay_dy_snc_sus_max_360all.getName(),-0.84093813);
    coeffMap.put(v31_ip_shipping_billing_match.getName(),-0.39872422);
    coeffMap.put(wach_n_checking.getName(),-1.10923168);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-1.36041796);
    coeffMap.put(cc_pct_passed_cvv2.getName(),-0.64689752);
    coeffMap.put(v35_ip_conn_type.getName(),-0.39918529);
    coeffMap.put(s_pmts_rcvd_count.getName(),-1.03921478);
    coeffMap.put(s_trans_ip3_tof_t_v2.getName(),-0.62795966);
    coeffMap.put(s_cc_s_amt_dk_80.getName(),-0.58885426);
    coeffMap.put(v35_ip_ph_geo_worst.getName(),-0.56945493);
    coeffMap.put(added_phone_lt_30.getName(),-0.68986637);
    coeffMap.put(v36_cc_bin_indc.getName(),-1.06145186);
    coeffMap.put(v3_browser_lang_match.getName(),-1.05924467);
    coeffMap.put(v2_ip_conn_type_old.getName(),-1.68083851);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 894.21132335;
  }

  @Override
  public double getCoeff2() {
    return  -67.45618143;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT40;
  }
  
}