package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg11 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v2_beacon_lat_numeric);
    variables.add(s_v_tx_ratio_num);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(v36_login_exces_10m);
    variables.add(s_amt_dk_20);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(outamt_to_avg_cleard);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(s_ach_faild_2nd_amt);
    variables.add(min_ebay_d_snc_conf_360all);
    variables.add(CP4WRtDolBadTxn);
    variables.add(num_address_country);
    variables.add(num_logins_3_days);
    variables.add(n_bdrt_txn);
    variables.add(s_vid_min_dof);
    variables.add(s_cc_s_amt_dk_320);
    variables.add(v31_ip_hopping_strict);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(max_MOA_Life);
    variables.add(min_to_s_dof);
    variables.add(ebay_V_7d1Yr_ASP_360all);
    variables.add(added_ach_lt_1);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(v3_account_age_sm);
    variables.add(v35_ip_ph_geo_worst);
    variables.add(prtlamt_to_max_sent_30);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.240892;
    else if (0 < valueDouble && valueDouble <= 0.0018) woeValue = -0.589369;
    else if (0.0018 < valueDouble && valueDouble <= 0.0035) woeValue = -0.453152;
    else if (0.0035 < valueDouble && valueDouble <= 0.007) woeValue = -0.072850;
    else if (0.007 < valueDouble && valueDouble <= 0.008) woeValue = -0.033049;
    else if (0.008 < valueDouble && valueDouble <= 0.0141) woeValue = 0.417143;
    else if ( valueDouble > 0.0141) woeValue = 0.616752;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 23.0077) woeValue = 1.644255;
    else if (23.0077 < valueDouble && valueDouble <= 118.8964) woeValue = 1.614429;
    else if (118.8964 < valueDouble && valueDouble <= 190.445) woeValue = 0.843025;
    else if (190.445 < valueDouble && valueDouble <= 276.7936) woeValue = 0.805180;
    else if (276.7936 < valueDouble && valueDouble <= 613.6365) woeValue = 0.312698;
    else if ( valueDouble > 613.6365) woeValue = -0.341124;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.013244;
    else if ( valueDouble > 0) woeValue = 1.013410;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0843111714) woeValue = -0.977346;
    else if (0.0843111714 < valueDouble && valueDouble <= 0.1228517462) woeValue = -0.446421;
    else if (0.1228517462 < valueDouble && valueDouble <= 0.8711632065) woeValue = -0.300466;
    else if (0.8711632065 < valueDouble && valueDouble <= 1.1151347934) woeValue = 0.277629;
    else if ( valueDouble > 1.1151347934) woeValue = 0.420219;
    else woeValue = 0;}else if(ebay_V_7d1Yr_ASP_360all.getName().equals(varName)){if (value == null) woeValue = 0.265422;
    else if (-1e38 < valueDouble && valueDouble <= 0.0677) woeValue = -1.460471;
    else if (0.0677 < valueDouble && valueDouble <= 0.4889) woeValue = -0.671583;
    else if (0.4889 < valueDouble && valueDouble <= 2.3266) woeValue = -0.493745;
    else if (2.3266 < valueDouble && valueDouble <= 4.8616) woeValue = -0.159758;
    else if ( valueDouble > 4.8616) woeValue = 0.418860;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.547302;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.650328;
    else if (0 < valueDouble && valueDouble <= 5.6267587E-7) woeValue = -0.009328;
    else if ( valueDouble > 5.6267587E-7) woeValue = 0.337882;
    else woeValue = 0;}else if(max_MOA_Life.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 15386) woeValue = 0.671428;
    else if (15386 < valueDouble && valueDouble <= 117313) woeValue = -0.060048;
    else if (117313 < valueDouble && valueDouble <= 139702) woeValue = -0.264071;
    else if ( valueDouble > 139702) woeValue = -0.404251;
    else woeValue = 0;}else if(min_ebay_d_snc_conf_360all.getName().equals(varName)){if (value == null) woeValue = 0.048298;
    else if (-1e38 < valueDouble && valueDouble <= 1383) woeValue = 0.412160;
    else if (1383 < valueDouble && valueDouble <= 1659) woeValue = 0.042954;
    else if (1659 < valueDouble && valueDouble <= 2374) woeValue = -0.249617;
    else if (2374 < valueDouble && valueDouble <= 3590) woeValue = -0.712927;
    else if ( valueDouble > 3590) woeValue = -0.954727;
    else woeValue = 0;}else if(min_to_s_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0219670494) woeValue = 1.952806;
    else if (0.0219670494 < valueDouble && valueDouble <= 0.1632241814) woeValue = 0.875825;
    else if (0.1632241814 < valueDouble && valueDouble <= 1) woeValue = -0.256663;
    else if ( valueDouble > 1) woeValue = -4.000000;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.043079;
    else if (0 < valueDouble && valueDouble <= 0.00049) woeValue = -0.953187;
    else if (0.00049 < valueDouble && valueDouble <= 0.00806) woeValue = 0.008427;
    else if ( valueDouble > 0.00806) woeValue = 0.774616;
    else woeValue = 0;}else if(num_address_country.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 0.031009;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.411145;
    else if ( valueDouble > 2) woeValue = -0.623616;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.645716;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = -0.320141;
    else if (4 < valueDouble && valueDouble <= 13) woeValue = 0.085631;
    else if (13 < valueDouble && valueDouble <= 21) woeValue = 1.628698;
    else if ( valueDouble > 21) woeValue = 1.797760;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5.3495329517) woeValue = -0.357644;
    else if (5.3495329517 < valueDouble && valueDouble <= 5.8841577415) woeValue = 0.046395;
    else if (5.8841577415 < valueDouble && valueDouble <= 7.3230157517) woeValue = 0.125830;
    else if (7.3230157517 < valueDouble && valueDouble <= 9.7451337193) woeValue = 0.684970;
    else if (9.7451337193 < valueDouble && valueDouble <= 11.888742825) woeValue = 0.997259;
    else if (11.888742825 < valueDouble && valueDouble <= 24.699628571) woeValue = 1.669992;
    else if ( valueDouble > 24.699628571) woeValue = 1.811601;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.936149;
    else if (-1e38 < valueDouble && valueDouble <= 0.0245759597) woeValue = -1.008594;
    else if (0.0245759597 < valueDouble && valueDouble <= 0.2609956501) woeValue = -0.836135;
    else if (0.2609956501 < valueDouble && valueDouble <= 4.3794567063) woeValue = 0.074385;
    else if ( valueDouble > 4.3794567063) woeValue = 0.881725;
    else woeValue = 0;}else if(s_ach_faild_2nd_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.050501;
    else if (0 < valueDouble && valueDouble <= 36048) woeValue = 0.410178;
    else if ( valueDouble > 36048) woeValue = -1.003725;
    else woeValue = 0;}else if(s_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1583.2027) woeValue = -0.202721;
    else if (1583.2027 < valueDouble && valueDouble <= 9293.2779) woeValue = -0.160968;
    else if (9293.2779 < valueDouble && valueDouble <= 13133.4695) woeValue = 0.283470;
    else if (13133.4695 < valueDouble && valueDouble <= 23136.0026) woeValue = 0.749217;
    else if ( valueDouble > 23136.0026) woeValue = 2.284972;
    else woeValue = 0;}else if(s_cc_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.055574;
    else if (-1 < valueDouble && valueDouble <= 461.3116) woeValue = 0.386531;
    else if (461.3116 < valueDouble && valueDouble <= 2029.0881) woeValue = -0.053120;
    else if ( valueDouble > 2029.0881) woeValue = -0.245256;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -2.245301;
    else if (0 < valueDouble && valueDouble <= 0.0057672751) woeValue = -1.096171;
    else if (0.0057672751 < valueDouble && valueDouble <= 0.0340789618) woeValue = -0.581841;
    else if (0.0340789618 < valueDouble && valueDouble <= 0.3782415667) woeValue = -0.407861;
    else if (0.3782415667 < valueDouble && valueDouble <= 0.5801640072) woeValue = -0.363248;
    else if (0.5801640072 < valueDouble && valueDouble <= 0.8971870572) woeValue = -0.206142;
    else if (0.8971870572 < valueDouble && valueDouble <= 1.1413049412) woeValue = 0.188078;
    else if (1.1413049412 < valueDouble && valueDouble <= 4.8313223453) woeValue = 0.583866;
    else if ( valueDouble > 4.8313223453) woeValue = 1.510229;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 30910941) woeValue = 0.178735;
    else if (30910941 < valueDouble && valueDouble <= 65849419) woeValue = 0.040482;
    else if (65849419 < valueDouble && valueDouble <= 85723864) woeValue = -0.256082;
    else if (85723864 < valueDouble && valueDouble <= 1330073888) woeValue = -0.526870;
    else if ( valueDouble > 1330073888) woeValue = -0.839749;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.823943662) woeValue = 1.396121;
    else if (0.823943662 < valueDouble && valueDouble <= 0.9344262295) woeValue = 0.779496;
    else if (0.9344262295 < valueDouble && valueDouble <= 0.9941860465) woeValue = -0.193837;
    else if (0.9941860465 < valueDouble && valueDouble <= 0.9975942261) woeValue = -2.068943;
    else if (0.9975942261 < valueDouble && valueDouble <= 0.9992743106) woeValue = -3.165687;
    else if ( valueDouble > 0.9992743106) woeValue = -1.900862;
    else woeValue = 0;}else if(s_vid_min_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 15) woeValue = 0.283161;
    else if ( valueDouble > 15) woeValue = -0.240336;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.130898;
    else if ( valueDouble > 0) woeValue = -0.207250;
    else woeValue = 0;}else if(v2_beacon_lat_numeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -19) woeValue = -0.165580;
    else if (-19 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = 1.033089;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.021845;
    else if ( valueDouble > 6) woeValue = -0.113468;
    else woeValue = 0;}else if(v36_login_exces_10m.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.584679;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.276806;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = -0.135820;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.252077;
    else if ( valueDouble > 4) woeValue = 1.729296;
    else woeValue = 0;}else if(v3_account_age_sm.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 544.10063657) woeValue = 0.106359;
    else if (544.10063657 < valueDouble && valueDouble <= 577.96681713) woeValue = -0.202888;
    else if (577.96681713 < valueDouble && valueDouble <= 1039.2793519) woeValue = -0.286228;
    else if (1039.2793519 < valueDouble && valueDouble <= 1368.2317593) woeValue = -0.479887;
    else if (1368.2317593 < valueDouble && valueDouble <= 1744.6341551) woeValue = -0.851396;
    else if ( valueDouble > 1744.6341551) woeValue = -0.953238;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "IP_HOPPING_GT2","STATE_HOPPING_GT2","_MISSING_","IP_HOPPING_2","CTRY_HOPPING_2").contains(value)) woeValue = -0.408301;
    else if (Arrays.asList( "IP_HOP_1").contains(value)) woeValue = -0.200134;
    else if (Arrays.asList( "CTRY_HOPPING_EXCESSIVE","CITY_HOPPING_GT2","CITY_HOPPING_2","NO_HOPPING"," ","STATE_HOPPING_2","CTRY_HOPPING_GT2","STATE_HOPPING_EXCESSIVE").contains(value)) woeValue = 0.047841;
    else woeValue = 0;}else if(v35_ip_ph_geo_worst.getName().equals(varName)){if (Arrays.asList( "OTHER").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "NO_PHONES","REGION_MATCH").contains(value)) woeValue = -0.756382;
    else if (Arrays.asList( "CITY_MATCH").contains(value)) woeValue = -0.532156;
    else if (Arrays.asList( "NO_MATCH").contains(value)) woeValue = -0.193936;
    else if (Arrays.asList( "COUNTRY_MATCH"," ","MM_ERROR","STATE_MATCH").contains(value)) woeValue = 0.057593;
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
    
    coeffMap.put("Intercept",+6.61741817);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.42810260);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.58991081);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.59321031);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.77461979);
    coeffMap.put(s_amt_dk_20.getName(),-0.44234607);
    coeffMap.put(min_to_s_dof.getName(),-0.58461925);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.83008393);
    coeffMap.put(num_logins_3_days.getName(),-0.48301969);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.64647711);
    coeffMap.put(v36_login_exces_10m.getName(),-0.50052218);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.49254342);
    coeffMap.put(min_ebay_d_snc_conf_360all.getName(),-0.68206455);
    coeffMap.put(v2_beacon_lat_numeric.getName(),-0.46251801);
    coeffMap.put(ebay_V_7d1Yr_ASP_360all.getName(),-0.58780407);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.51431047);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.42776372);
    coeffMap.put(n_bdrt_txn.getName(),-1.04263868);
    coeffMap.put(max_MOA_Life.getName(),-0.72314283);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.74295941);
    coeffMap.put(v3_account_age_sm.getName(),-0.73885402);
    coeffMap.put(s_vid_min_dof.getName(),-1.20692869);
    coeffMap.put(s_ach_faild_2nd_amt.getName(),-1.39834056);
    coeffMap.put(s_cc_s_amt_dk_320.getName(),-0.50036827);
    coeffMap.put(v35_ip_ph_geo_worst.getName(),-0.97637391);
    coeffMap.put(num_address_country.getName(),-1.14676356);
    coeffMap.put(added_ach_lt_1.getName(),-0.77943584);
    coeffMap.put(v31_ip_hopping_strict.getName(),-1.59667401);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 913.01587636;
  }

  @Override
  public double getCoeff2() {
    return  -67.68883102;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT11;
  }
  
}