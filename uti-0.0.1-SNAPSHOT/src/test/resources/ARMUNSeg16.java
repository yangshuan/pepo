package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg16 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v36_cc_bin_indc);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(wach_n_savings);
    variables.add(v2_beacon_lat_numeric);
    variables.add(MOA_V_MOALife);
    variables.add(n_bdrt_txn);
    variables.add(s_v_tx_ratio_num);
    variables.add(ip_amt_dk_160);
    variables.add(v36_login_exces_1h);
    variables.add(PC_STUDENT_CCBIN);
    variables.add(rt_num_rate);
    variables.add(email_MP_GMB_1Y);
    variables.add(billing_shipping_city_match);
    variables.add(email_numofvowely);
    variables.add(acct_login_cnt_dk_80);
    variables.add(ip_ratio_20w_uaa_dol);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(nach_last_return_age);
    variables.add(s_cc_s_amt_dk_80);
    variables.add(p90_dys_return);
    variables.add(cp_ratio_1w_appr_dol);


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

    if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2647127784) woeValue = -0.761774;
    else if (0.2647127784 < valueDouble && valueDouble <= 0.6052170327) woeValue = -0.601488;
    else if (0.6052170327 < valueDouble && valueDouble <= 0.733193766) woeValue = -0.279536;
    else if (0.733193766 < valueDouble && valueDouble <= 0.9313926648) woeValue = 1.227146;
    else if (0.9313926648 < valueDouble && valueDouble <= 1.0422561546) woeValue = 1.809046;
    else if ( valueDouble > 1.0422561546) woeValue = 2.245961;
    else woeValue = 0;}else if(PC_STUDENT_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.699301;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.388966;
    else if (0 < valueDouble && valueDouble <= 0.0001150173) woeValue = 1.360081;
    else if (0.0001150173 < valueDouble && valueDouble <= 0.0001831535) woeValue = 0.557946;
    else if ( valueDouble > 0.0001831535) woeValue = -0.822842;
    else woeValue = 0;}else if(acct_login_cnt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.694150;
    else if (0 < valueDouble && valueDouble <= 3.2471) woeValue = -0.787107;
    else if (3.2471 < valueDouble && valueDouble <= 6.8033) woeValue = 0.129718;
    else if (6.8033 < valueDouble && valueDouble <= 13.9626) woeValue = 1.263570;
    else if ( valueDouble > 13.9626) woeValue = 2.431997;
    else woeValue = 0;}else if(billing_shipping_city_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.159055;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.200075;
    else if ( valueDouble > 1) woeValue = 0.183480;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0775154544) woeValue = -1.093364;
    else if (0.0775154544 < valueDouble && valueDouble <= 0.4821834429) woeValue = -0.257796;
    else if (0.4821834429 < valueDouble && valueDouble <= 1.2145824494) woeValue = -0.126141;
    else if (1.2145824494 < valueDouble && valueDouble <= 2.4856429463) woeValue = 0.167204;
    else if (2.4856429463 < valueDouble && valueDouble <= 5.1691190685) woeValue = 0.433765;
    else if ( valueDouble > 5.1691190685) woeValue = 1.466585;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.160474;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 3.199051;
    else if ( valueDouble > 1) woeValue = 0.174541;
    else woeValue = 0;}else if(email_MP_GMB_1Y.getName().equals(varName)){if (value == null) woeValue = 0.365802;
    else if (-1e38 < valueDouble && valueDouble <= 11.59) woeValue = 0.147669;
    else if (11.59 < valueDouble && valueDouble <= 2827.095) woeValue = -0.087234;
    else if (2827.095 < valueDouble && valueDouble <= 3613.9053) woeValue = -0.483223;
    else if (3613.9053 < valueDouble && valueDouble <= 15329.27) woeValue = -2.601624;
    else if ( valueDouble > 15329.27) woeValue = -3.754304;
    else woeValue = 0;}else if(email_numofvowely.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.820070;
    else if (1 < valueDouble && valueDouble <= 7) woeValue = -0.014267;
    else if ( valueDouble > 7) woeValue = 1.606101;
    else woeValue = 0;}else if(ip_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.587505;
    else if (0 < valueDouble && valueDouble <= 41.0156) woeValue = 0.406521;
    else if (41.0156 < valueDouble && valueDouble <= 762134.7941) woeValue = 0.005220;
    else if ( valueDouble > 762134.7941) woeValue = -0.949454;
    else woeValue = 0;}else if(ip_ratio_20w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.028552;
    else if (-1e38 < valueDouble && valueDouble <= 0.0142227886) woeValue = -1.959292;
    else if (0.0142227886 < valueDouble && valueDouble <= 0.0314699619) woeValue = -1.546198;
    else if (0.0314699619 < valueDouble && valueDouble <= 0.1417300885) woeValue = -0.220897;
    else if (0.1417300885 < valueDouble && valueDouble <= 1.4337015319) woeValue = 0.367248;
    else if ( valueDouble > 1.4337015319) woeValue = 0.686129;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.00987) woeValue = -0.097365;
    else if (0.00987 < valueDouble && valueDouble <= 0.02273) woeValue = 0.313389;
    else if ( valueDouble > 0.02273) woeValue = 1.577076;
    else woeValue = 0;}else if(nach_last_return_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4144.916819) woeValue = -0.296352;
    else if ( valueDouble > 4144.916819) woeValue = 2.038056;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 8) woeValue = -0.085151;
    else if (8 < valueDouble && valueDouble <= 11) woeValue = -0.067516;
    else if ( valueDouble > 11) woeValue = 1.618022;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2407714329) woeValue = -0.326717;
    else if (0.2407714329 < valueDouble && valueDouble <= 0.9532357109) woeValue = 0.048075;
    else if (0.9532357109 < valueDouble && valueDouble <= 7.0100334448) woeValue = 0.393270;
    else if ( valueDouble > 7.0100334448) woeValue = 0.629911;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = -0.602710;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.064668;
    else if (0 < valueDouble && valueDouble <= 0.003) woeValue = -1.502175;
    else if (0.003 < valueDouble && valueDouble <= 0.011) woeValue = -0.319836;
    else if (0.011 < valueDouble && valueDouble <= 0.025) woeValue = 0.453434;
    else if (0.025 < valueDouble && valueDouble <= 0.027) woeValue = 1.024567;
    else if ( valueDouble > 0.027) woeValue = 1.143438;
    else woeValue = 0;}else if(s_cc_s_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.219152;
    else if (0 < valueDouble && valueDouble <= 0.1186) woeValue = 0.999315;
    else if (0.1186 < valueDouble && valueDouble <= 805.8612) woeValue = 0.584649;
    else if (805.8612 < valueDouble && valueDouble <= 12369.1035) woeValue = -0.603628;
    else if ( valueDouble > 12369.1035) woeValue = -1.434251;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.8407407407) woeValue = 2.400642;
    else if (0.8407407407 < valueDouble && valueDouble <= 0.9136212625) woeValue = 2.037289;
    else if (0.9136212625 < valueDouble && valueDouble <= 0.9607843137) woeValue = 0.827272;
    else if (0.9607843137 < valueDouble && valueDouble <= 0.9892473118) woeValue = -0.414667;
    else if ( valueDouble > 0.9892473118) woeValue = -1.144386;
    else woeValue = 0;}else if(v2_beacon_lat_numeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.105004;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 1.870984;
    else if (1 < valueDouble && valueDouble <= 14) woeValue = 0.098074;
    else if (14 < valueDouble && valueDouble <= 100) woeValue = -0.321218;
    else if ( valueDouble > 100) woeValue = -1.034974;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.175860;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.672181;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = 0.179269;
    else if (3 < valueDouble && valueDouble <= 5) woeValue = 1.253017;
    else if ( valueDouble > 5) woeValue = 2.435573;
    else woeValue = 0;}else if(wach_n_savings.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.042030;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.230064;
    else if ( valueDouble > 1) woeValue = -1.105094;
    else woeValue = 0;}else if(v36_cc_bin_indc.getName().equals(varName)){if (Arrays.asList( "EXCESSIVE_BINS","MATCH_FEW_CCS","MATCH_MANY_CCS","NO_CCS").contains(value)) woeValue = -1.130851;
    else if (Arrays.asList(" ").contains(value)) woeValue = -1.052726;
    else if (Arrays.asList( "NO_NEW_CCS").contains(value)) woeValue = -0.197637;
    else if (Arrays.asList( "CONSISTENT").contains(value)) woeValue = 1.183394;
    else if (Arrays.asList( "MINOR_MISMATCH","MAJOR_MISMATCH","SINGLE_CC_NEW_ISSUER").contains(value)) woeValue = 2.109395;
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
    
    coeffMap.put("Intercept",+7.18195188);
    coeffMap.put(MOA_V_MOALife.getName(),-0.63464488);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.71331783);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.53689047);
    coeffMap.put(acct_login_cnt_dk_80.getName(),-0.34558840);
    coeffMap.put(rt_num_rate.getName(),-0.54279546);
    coeffMap.put(email_numofvowely.getName(),-0.97444844);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.52277555);
    coeffMap.put(nach_last_return_age.getName(),-0.71234290);
    coeffMap.put(v36_login_exces_1h.getName(),-0.66095900);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-1.37230853);
    coeffMap.put(p90_dys_return.getName(),-1.03978913);
    coeffMap.put(email_MP_GMB_1Y.getName(),-0.60008646);
    coeffMap.put(n_bdrt_txn.getName(),-0.69003308);
    coeffMap.put(v36_cc_bin_indc.getName(),-0.33072323);
    coeffMap.put(PC_STUDENT_CCBIN.getName(),-0.54267011);
    coeffMap.put(v2_beacon_lat_numeric.getName(),-0.29844304);
    coeffMap.put(billing_shipping_city_match.getName(),-1.39221109);
    coeffMap.put(ip_amt_dk_160.getName(),-1.00513129);
    coeffMap.put(ip_ratio_20w_uaa_dol.getName(),-0.67085666);
    coeffMap.put(wach_n_savings.getName(),-0.08274011);
    coeffMap.put(s_cc_s_amt_dk_80.getName(),-0.47489834);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 846.27275648;
  }

  @Override
  public double getCoeff2() {
    return  -57.70675392;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT16;
  }
  
}