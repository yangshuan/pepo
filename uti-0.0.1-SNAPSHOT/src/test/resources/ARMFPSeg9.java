package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg9 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(added_address_lt_7);
    variables.add(CP4WRtDolBadTxn);
    variables.add(s_mp_cnt_dk_40);
    variables.add(max_cross4wRtDclAcc);
    variables.add(ncc_failed_amt_avg);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(ip_avg_dk_10);
    variables.add(n_ebay_lnkd_360all);
    variables.add(days_snc_last_achtxn);
    variables.add(outamt_to_max_cleard);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(alias_min_dof);
    variables.add(SNR4WRtAtoBadTxn);
    variables.add(cc_num_debit);
    variables.add(min_to_max_ach_tof);
    variables.add(s_visitor_id_dof);
    variables.add(ismobile);
    variables.add(t_bank_dof);
    variables.add(ach_outstd_age);
    variables.add(outamt_to_avg_faild);
    variables.add(s_ms_cnt_dk_40);
    variables.add(wach_n_inactive);
    variables.add(s_c_fso_match);
    variables.add(is_regional);
    variables.add(n_dist_bankid_30d_180d);
    variables.add(tpv_cnt);
    variables.add(txnsnt_amt_stss_sd_lst_48_hrs);
    variables.add(acct_login_cnt_dk_80);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.287997;
    else if (0 < valueDouble && valueDouble <= 0.0004) woeValue = -0.679515;
    else if (0.0004 < valueDouble && valueDouble <= 0.0008) woeValue = -0.547292;
    else if (0.0008 < valueDouble && valueDouble <= 0.0021) woeValue = -0.398838;
    else if (0.0021 < valueDouble && valueDouble <= 0.0026) woeValue = -0.193361;
    else if (0.0026 < valueDouble && valueDouble <= 0.0042) woeValue = -0.096970;
    else if (0.0042 < valueDouble && valueDouble <= 0.0053) woeValue = -0.011431;
    else if (0.0053 < valueDouble && valueDouble <= 0.0091) woeValue = 0.077663;
    else if (0.0091 < valueDouble && valueDouble <= 0.01) woeValue = 0.259184;
    else if (0.01 < valueDouble && valueDouble <= 0.0109) woeValue = 0.377027;
    else if (0.0109 < valueDouble && valueDouble <= 0.0178) woeValue = 0.466135;
    else if (0.0178 < valueDouble && valueDouble <= 0.0322) woeValue = 0.596879;
    else if ( valueDouble > 0.0322) woeValue = 1.378194;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.009827;
    else if ( valueDouble > 0) woeValue = 1.452445;
    else woeValue = 0;}else if(SNR4WRtAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0008) woeValue = 0.058400;
    else if ( valueDouble > 0.0008) woeValue = -0.077898;
    else woeValue = 0;}else if(acct_login_cnt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 1.9366) woeValue = -0.138970;
    else if (1.9366 < valueDouble && valueDouble <= 3.4704) woeValue = -0.136494;
    else if (3.4704 < valueDouble && valueDouble <= 5.2774) woeValue = -0.116567;
    else if (5.2774 < valueDouble && valueDouble <= 10.5532) woeValue = 0.423573;
    else if ( valueDouble > 10.5532) woeValue = 1.787847;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 87.205882353) woeValue = -0.052464;
    else if ( valueDouble > 87.205882353) woeValue = 1.443361;
    else woeValue = 0;}else if(added_address_lt_7.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.001569;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.060776;
    else if ( valueDouble > 2) woeValue = 1.427888;
    else woeValue = 0;}else if(alias_min_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 381) woeValue = -0.402458;
    else if ( valueDouble > 381) woeValue = 0.044549;
    else woeValue = 0;}else if(cc_num_debit.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.113274;
    else if ( valueDouble > 0) woeValue = 1.137679;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.889091;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.485398;
    else if (0 < valueDouble && valueDouble <= 201) woeValue = -0.830525;
    else if (201 < valueDouble && valueDouble <= 217) woeValue = -0.588872;
    else if (217 < valueDouble && valueDouble <= 260) woeValue = -0.547478;
    else if (260 < valueDouble && valueDouble <= 278) woeValue = -0.518881;
    else if (278 < valueDouble && valueDouble <= 288) woeValue = -0.386209;
    else if (288 < valueDouble && valueDouble <= 300) woeValue = -0.281046;
    else if (300 < valueDouble && valueDouble <= 354) woeValue = -0.040859;
    else if (354 < valueDouble && valueDouble <= 457) woeValue = 0.123072;
    else if (457 < valueDouble && valueDouble <= 662) woeValue = 0.327936;
    else if ( valueDouble > 662) woeValue = 0.712880;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.024401;
    else if (-1e38 < valueDouble && valueDouble <= 205) woeValue = 2.511655;
    else if (205 < valueDouble && valueDouble <= 294) woeValue = 2.340336;
    else if (294 < valueDouble && valueDouble <= 1094.2) woeValue = 1.308618;
    else if (1094.2 < valueDouble && valueDouble <= 2115) woeValue = 0.479584;
    else if (2115 < valueDouble && valueDouble <= 2202) woeValue = 0.394426;
    else if (2202 < valueDouble && valueDouble <= 2771) woeValue = 0.215973;
    else if (2771 < valueDouble && valueDouble <= 2906.5) woeValue = 0.003350;
    else if ( valueDouble > 2906.5) woeValue = -1.191890;
    else woeValue = 0;}else if(ip_avg_dk_10.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 199) woeValue = 0.389897;
    else if (199 < valueDouble && valueDouble <= 499.8395) woeValue = 0.334977;
    else if (499.8395 < valueDouble && valueDouble <= 6575) woeValue = -0.008978;
    else if (6575 < valueDouble && valueDouble <= 36547) woeValue = -0.130339;
    else if ( valueDouble > 36547) woeValue = -0.217737;
    else woeValue = 0;}else if(is_regional.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.051227;
    else if ( valueDouble > 0) woeValue = -0.346666;
    else woeValue = 0;}else if(ismobile.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.030263;
    else if ( valueDouble > 0) woeValue = 0.435709;
    else woeValue = 0;}else if(max_cross4wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0297) woeValue = -0.332384;
    else if (0.0297 < valueDouble && valueDouble <= 0.0388) woeValue = -0.272417;
    else if (0.0388 < valueDouble && valueDouble <= 0.0556) woeValue = 0.128691;
    else if (0.0556 < valueDouble && valueDouble <= 0.0682) woeValue = 0.639514;
    else if ( valueDouble > 0.0682) woeValue = 0.811219;
    else woeValue = 0;}else if(min_to_max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 3.279181;
    else if (-1 < valueDouble && valueDouble <= 3.2387282E-7) woeValue = 0.825787;
    else if (3.2387282E-7 < valueDouble && valueDouble <= 0.6798334407) woeValue = 0.574860;
    else if (0.6798334407 < valueDouble && valueDouble <= 0.9999996842) woeValue = -0.356529;
    else if ( valueDouble > 0.9999996842) woeValue = -0.270389;
    else woeValue = 0;}else if(n_dist_bankid_30d_180d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.545303;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.568717;
    else if ( valueDouble > 1) woeValue = 0.307221;
    else woeValue = 0;}else if(n_ebay_lnkd_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.140764;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.210209;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.103604;
    else if ( valueDouble > 2) woeValue = 0.834335;
    else woeValue = 0;}else if(ncc_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = -0.149240;
    else if (-1e38 < valueDouble && valueDouble <= 2085.6666667) woeValue = 1.796301;
    else if (2085.6666667 < valueDouble && valueDouble <= 19431.666667) woeValue = 0.699908;
    else if (19431.666667 < valueDouble && valueDouble <= 115095) woeValue = 0.419744;
    else if (115095 < valueDouble && valueDouble <= 166844) woeValue = 0.378231;
    else if ( valueDouble > 166844) woeValue = -0.714658;
    else woeValue = 0;}else if(outamt_to_avg_faild.getName().equals(varName)){if (value == null) woeValue = -0.081190;
    else if (-1e38 < valueDouble && valueDouble <= 4.4843677088) woeValue = 0.485116;
    else if (4.4843677088 < valueDouble && valueDouble <= 65.434609418) woeValue = 1.047082;
    else if ( valueDouble > 65.434609418) woeValue = 4.000000;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1.9455337691) woeValue = -0.139859;
    else if (1.9455337691 < valueDouble && valueDouble <= 5.8586848223) woeValue = 0.030183;
    else if (5.8586848223 < valueDouble && valueDouble <= 20.737509104) woeValue = 0.782818;
    else if ( valueDouble > 20.737509104) woeValue = 1.756716;
    else woeValue = 0;}else if(s_c_fso_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.013256;
    else if ( valueDouble > 0) woeValue = 2.285354;
    else woeValue = 0;}else if(s_mp_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.054819;
    else if (0 < valueDouble && valueDouble <= 0.573) woeValue = -0.562591;
    else if (0.573 < valueDouble && valueDouble <= 0.9982) woeValue = -0.356498;
    else if (0.9982 < valueDouble && valueDouble <= 1.2045) woeValue = -0.308339;
    else if (1.2045 < valueDouble && valueDouble <= 2.0475) woeValue = 0.008939;
    else if ( valueDouble > 2.0475) woeValue = 0.731060;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.119557;
    else if (0 < valueDouble && valueDouble <= 0.2573) woeValue = -0.492122;
    else if (0.2573 < valueDouble && valueDouble <= 0.5081) woeValue = -0.292083;
    else if (0.5081 < valueDouble && valueDouble <= 0.7987) woeValue = 0.304084;
    else if (0.7987 < valueDouble && valueDouble <= 2.1078) woeValue = 0.991279;
    else if ( valueDouble > 2.1078) woeValue = 1.809516;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 14525723) woeValue = 0.281435;
    else if (14525723 < valueDouble && valueDouble <= 17592568) woeValue = -0.219235;
    else if (17592568 < valueDouble && valueDouble <= 99808815) woeValue = -0.237868;
    else if (99808815 < valueDouble && valueDouble <= 109056430) woeValue = -0.343606;
    else if (109056430 < valueDouble && valueDouble <= 121390111) woeValue = -0.378654;
    else if ( valueDouble > 121390111) woeValue = -0.573948;
    else woeValue = 0;}else if(s_visitor_id_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.756747;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.056341;
    else if (0 < valueDouble && valueDouble <= 143) woeValue = 0.126070;
    else if (143 < valueDouble && valueDouble <= 249) woeValue = -0.339896;
    else if ( valueDouble > 249) woeValue = -0.611781;
    else woeValue = 0;}else if(t_bank_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 3.484928;
    else if (-1 < valueDouble && valueDouble <= 2) woeValue = 0.859789;
    else if (2 < valueDouble && valueDouble <= 99) woeValue = 0.376225;
    else if (99 < valueDouble && valueDouble <= 249) woeValue = 0.016960;
    else if (249 < valueDouble && valueDouble <= 1308) woeValue = -0.217522;
    else if (1308 < valueDouble && valueDouble <= 1349) woeValue = -0.550036;
    else if (1349 < valueDouble && valueDouble <= 2711) woeValue = -0.619571;
    else if ( valueDouble > 2711) woeValue = -0.755086;
    else woeValue = 0;}else if(tpv_cnt.getName().equals(varName)){if (value == null) woeValue = 0.046354;
    else if (-1e38 < valueDouble && valueDouble <= 51) woeValue = -0.382155;
    else if (51 < valueDouble && valueDouble <= 1230) woeValue = -0.143133;
    else if (1230 < valueDouble && valueDouble <= 12382) woeValue = 0.002207;
    else if (12382 < valueDouble && valueDouble <= 344424) woeValue = 0.099497;
    else if (344424 < valueDouble && valueDouble <= 408617) woeValue = 0.319214;
    else if ( valueDouble > 408617) woeValue = 0.691923;
    else woeValue = 0;}else if(txnsnt_amt_stss_sd_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.041826;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if ( valueDouble > 0) woeValue = 1.511913;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.418116;
    else if ( valueDouble > 0) woeValue = 1.183315;
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
    
    coeffMap.put("Intercept",+5.10426869);
    coeffMap.put(t_bank_dof.getName(),-0.17889840);
    coeffMap.put(wach_n_inactive.getName(),-0.43315294);
    coeffMap.put(min_to_max_ach_tof.getName(),-0.69703307);
    coeffMap.put(days_snc_last_achtxn.getName(),-1.08419233);
    coeffMap.put(n_dist_bankid_30d_180d.getName(),-0.37918953);
    coeffMap.put(outamt_to_avg_faild.getName(),-0.94776317);
    coeffMap.put(max_cross4wRtDclAcc.getName(),-0.04761679);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.20445378);
    coeffMap.put(ncc_failed_amt_avg.getName(),-0.15055477);
    coeffMap.put(acct_login_cnt_dk_80.getName(),-0.07506811);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.95336444);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.72725353);
    coeffMap.put(cc_num_debit.getName(),-0.26735227);
    coeffMap.put(s_visitor_id_dof.getName(),-0.09534268);
    coeffMap.put(n_ebay_lnkd_360all.getName(),-0.70463909);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.68700015);
    coeffMap.put(ach_outstd_age.getName(),-0.26942369);
    coeffMap.put(s_mp_cnt_dk_40.getName(),-1.26440755);
    coeffMap.put(txnsnt_amt_stss_sd_lst_48_hrs.getName(),-0.55699223);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-1.84287392);
    coeffMap.put(tpv_cnt.getName(),-1.17956196);
    coeffMap.put(s_c_fso_match.getName(),-0.96483768);
    coeffMap.put(added_address_lt_7.getName(),-1.17533216);
    coeffMap.put(alias_min_dof.getName(),-1.01383761);
    coeffMap.put(is_regional.getName(),-1.00855256);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-1.17623042);
    coeffMap.put(ismobile.getName(),-1.68742199);
    coeffMap.put(ip_avg_dk_10.getName(),-1.81733184);
    coeffMap.put(SNR4WRtAtoBadTxn.getName(),-1.39732010);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 861.55221319;
  }

  @Override
  public double getCoeff2() {
    return  -62.12317413;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT9;
  }
  
}