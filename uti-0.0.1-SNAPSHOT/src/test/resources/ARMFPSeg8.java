package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg8 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(s_c_address_match);
    variables.add(t_bank_confirm_dof);
    variables.add(is_online);
    variables.add(num_logins_7_days);
    variables.add(ncc_failed_amt_ratio);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(v31_ip_hopping_strict);
    variables.add(s_ms_amt_dk_40);
    variables.add(n_rt_dcl_14dys);
    variables.add(Decline_rate_ccbin);
    variables.add(ach_outstd_age);
    variables.add(v2_e_un_indicative);
    variables.add(email_MP_UPIA_180d);
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(v36_soft_activity_d);
    variables.add(top_bin_cnt_pct);
    variables.add(rcvr_cc_d_cnt_dk_40);
    variables.add(n_bdrt_bp_txn);
    variables.add(ip_ratio_avg_dk_320);
    variables.add(s_mp_amt_dk_40);
    variables.add(first_ach_txn_dof);
    variables.add(email_percofletter);
    variables.add(v21_e_dom_score_worst);
    variables.add(p90_dys_return);
    variables.add(primaryach_verify_saving);
    variables.add(rt_amt_rate);
    variables.add(email_MP_sinc_UPI);


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

    if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0250174203) woeValue = -1.334541;
    else if (0.0250174203 < valueDouble && valueDouble <= 0.0262874625) woeValue = -1.040891;
    else if (0.0262874625 < valueDouble && valueDouble <= 0.0398882765) woeValue = -0.994719;
    else if (0.0398882765 < valueDouble && valueDouble <= 0.1036230048) woeValue = -0.334295;
    else if (0.1036230048 < valueDouble && valueDouble <= 0.1658640984) woeValue = -0.134437;
    else if (0.1658640984 < valueDouble && valueDouble <= 0.1829689096) woeValue = 0.615092;
    else if ( valueDouble > 0.1829689096) woeValue = 1.338053;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.008746;
    else if ( valueDouble > 0) woeValue = 1.232184;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1046) woeValue = -0.116372;
    else if (1046 < valueDouble && valueDouble <= 4536.0666667) woeValue = 0.052839;
    else if (4536.0666667 < valueDouble && valueDouble <= 8378.6666667) woeValue = 0.600129;
    else if ( valueDouble > 8378.6666667) woeValue = 1.595763;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2662730186) woeValue = -0.355851;
    else if (0.2662730186 < valueDouble && valueDouble <= 0.8682944304) woeValue = -0.135299;
    else if (0.8682944304 < valueDouble && valueDouble <= 1.047568384) woeValue = -0.079212;
    else if (1.047568384 < valueDouble && valueDouble <= 2.0342005823) woeValue = -0.040264;
    else if (2.0342005823 < valueDouble && valueDouble <= 3.8751240235) woeValue = 0.355915;
    else if (3.8751240235 < valueDouble && valueDouble <= 5.6683470739) woeValue = 0.879162;
    else if ( valueDouble > 5.6683470739) woeValue = 1.365957;
    else woeValue = 0;}else if(email_MP_UPIA_180d.getName().equals(varName)){if (value == null) woeValue = 0.195023;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.560935;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.447322;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = 0.380902;
    else if ( valueDouble > 4) woeValue = 1.625707;
    else woeValue = 0;}else if(email_MP_sinc_UPI.getName().equals(varName)){if (value == null) woeValue = -0.085249;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 9) woeValue = 1.329529;
    else if (9 < valueDouble && valueDouble <= 20) woeValue = 0.806252;
    else if (20 < valueDouble && valueDouble <= 228) woeValue = 0.572929;
    else if (228 < valueDouble && valueDouble <= 352) woeValue = 0.284760;
    else if ( valueDouble > 352) woeValue = -1.467906;
    else woeValue = 0;}else if(email_percofletter.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.65) woeValue = 0.778548;
    else if (0.65 < valueDouble && valueDouble <= 0.8) woeValue = 0.040219;
    else if (0.8 < valueDouble && valueDouble <= 0.9285714286) woeValue = -0.105561;
    else if (0.9285714286 < valueDouble && valueDouble <= 0.9642857143) woeValue = -0.261562;
    else if ( valueDouble > 0.9642857143) woeValue = -0.086740;
    else woeValue = 0;}else if(first_ach_txn_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.038583;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.726098;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.581612;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = -0.177273;
    else if (4 < valueDouble && valueDouble <= 444) woeValue = -0.740067;
    else if ( valueDouble > 444) woeValue = -4.000000;
    else woeValue = 0;}else if(ip_ratio_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = -0.270702;
    else if (-2 < valueDouble && valueDouble <= -1) woeValue = -0.231564;
    else if (-1 < valueDouble && valueDouble <= 0.0634) woeValue = -0.547130;
    else if (0.0634 < valueDouble && valueDouble <= 12.2411) woeValue = 0.111786;
    else if ( valueDouble > 12.2411) woeValue = 0.626783;
    else woeValue = 0;}else if(is_online.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.036448;
    else if ( valueDouble > 0) woeValue = 0.452718;
    else woeValue = 0;}else if(n_bdrt_bp_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.149075;
    else if (0 < valueDouble && valueDouble <= 0.00276) woeValue = -0.882190;
    else if (0.00276 < valueDouble && valueDouble <= 0.00682) woeValue = -0.248395;
    else if (0.00682 < valueDouble && valueDouble <= 0.0125) woeValue = 0.057760;
    else if (0.0125 < valueDouble && valueDouble <= 0.04861) woeValue = 0.106578;
    else if (0.04861 < valueDouble && valueDouble <= 0.17391) woeValue = 0.310036;
    else if ( valueDouble > 0.17391) woeValue = 1.340581;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.028302) woeValue = -0.759643;
    else if (0.028302 < valueDouble && valueDouble <= 0.051921) woeValue = -0.564495;
    else if (0.051921 < valueDouble && valueDouble <= 0.095506) woeValue = -0.073671;
    else if (0.095506 < valueDouble && valueDouble <= 0.268456) woeValue = 0.075269;
    else if (0.268456 < valueDouble && valueDouble <= 0.363636) woeValue = 0.556445;
    else if ( valueDouble > 0.363636) woeValue = 1.499512;
    else woeValue = 0;}else if(ncc_failed_amt_ratio.getName().equals(varName)){if (value == null) woeValue = 0.049953;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.616372;
    else if (0 < valueDouble && valueDouble <= 0.0362675509) woeValue = -2.159667;
    else if (0.0362675509 < valueDouble && valueDouble <= 0.1903450275) woeValue = -0.571196;
    else if (0.1903450275 < valueDouble && valueDouble <= 0.3528291699) woeValue = 0.036975;
    else if (0.3528291699 < valueDouble && valueDouble <= 0.7142353356) woeValue = 0.552320;
    else if (0.7142353356 < valueDouble && valueDouble <= 0.9997451689) woeValue = 1.592245;
    else if ( valueDouble > 0.9997451689) woeValue = 1.625819;
    else woeValue = 0;}else if(num_logins_7_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.471115;
    else if (0 < valueDouble && valueDouble <= 6) woeValue = -0.251877;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = -0.052988;
    else if (8 < valueDouble && valueDouble <= 11) woeValue = -0.005012;
    else if (11 < valueDouble && valueDouble <= 16) woeValue = 0.263443;
    else if (16 < valueDouble && valueDouble <= 18) woeValue = 0.713933;
    else if (18 < valueDouble && valueDouble <= 40) woeValue = 0.982514;
    else if ( valueDouble > 40) woeValue = 1.907801;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5) woeValue = 0.631383;
    else if (5 < valueDouble && valueDouble <= 23) woeValue = -0.071795;
    else if ( valueDouble > 23) woeValue = -1.164366;
    else woeValue = 0;}else if(primaryach_verify_saving.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.005435;
    else if ( valueDouble > 0) woeValue = 1.989169;
    else woeValue = 0;}else if(rcvr_cc_d_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.108906;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = 0.482940;
    else if (0.0003 < valueDouble && valueDouble <= 164.0698) woeValue = 0.010581;
    else if ( valueDouble > 164.0698) woeValue = -0.413100;
    else woeValue = 0;}else if(rt_amt_rate.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.288266;
    else if (0 < valueDouble && valueDouble <= 0.377) woeValue = -0.458526;
    else if (0.377 < valueDouble && valueDouble <= 0.799) woeValue = -0.389093;
    else if (0.799 < valueDouble && valueDouble <= 1.409) woeValue = -0.229966;
    else if (1.409 < valueDouble && valueDouble <= 2.115) woeValue = -0.069574;
    else if (2.115 < valueDouble && valueDouble <= 3.699) woeValue = 0.355262;
    else if (3.699 < valueDouble && valueDouble <= 4.27) woeValue = 0.986035;
    else if ( valueDouble > 4.27) woeValue = 1.280607;
    else woeValue = 0;}else if(s_c_address_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.012804;
    else if ( valueDouble > 0) woeValue = 1.834247;
    else woeValue = 0;}else if(s_mp_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.072408;
    else if (0 < valueDouble && valueDouble <= 4625.5123) woeValue = -0.560914;
    else if (4625.5123 < valueDouble && valueDouble <= 11836.6451) woeValue = 0.209864;
    else if ( valueDouble > 11836.6451) woeValue = 1.160653;
    else woeValue = 0;}else if(s_ms_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.179856;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = -1.331950;
    else if (0.0012 < valueDouble && valueDouble <= 0.0545) woeValue = -1.042889;
    else if (0.0545 < valueDouble && valueDouble <= 659.6261) woeValue = -0.457048;
    else if (659.6261 < valueDouble && valueDouble <= 1080.5158) woeValue = 0.026618;
    else if (1080.5158 < valueDouble && valueDouble <= 1683.1664) woeValue = 0.231588;
    else if (1683.1664 < valueDouble && valueDouble <= 2561.9241) woeValue = 0.286704;
    else if (2561.9241 < valueDouble && valueDouble <= 11014.5655) woeValue = 0.762398;
    else if (11014.5655 < valueDouble && valueDouble <= 24997.6476) woeValue = 1.303307;
    else if ( valueDouble > 24997.6476) woeValue = 1.999684;
    else woeValue = 0;}else if(t_bank_confirm_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 444) woeValue = -0.182270;
    else if (444 < valueDouble && valueDouble <= 1234) woeValue = -0.059467;
    else if ( valueDouble > 1234) woeValue = 0.665624;
    else woeValue = 0;}else if(top_bin_cnt_pct.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.015) woeValue = 1.333448;
    else if (0.015 < valueDouble && valueDouble <= 0.021) woeValue = 0.036158;
    else if (0.021 < valueDouble && valueDouble <= 0.077) woeValue = -0.052779;
    else if ( valueDouble > 0.077) woeValue = -0.275637;
    else woeValue = 0;}else if(v36_soft_activity_d.getName().equals(varName)){if (value == null) woeValue = 0.866937;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 0.411772;
    else if (1 < valueDouble && valueDouble <= 45) woeValue = -0.175520;
    else if (45 < valueDouble && valueDouble <= 133) woeValue = -0.706533;
    else if ( valueDouble > 133) woeValue = -2.554011;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.735179;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.423441;
    else if (Arrays.asList( "MED","NO_EMAILS","BAD"," ","_MISSING_").contains(value)) woeValue = 0.134359;
    else woeValue = 0;}else if(v2_e_un_indicative.getName().equals(varName)){if (Arrays.asList( "NAME_MATCH","OTHER").contains(value)) woeValue = -0.213280;
    else if (Arrays.asList( "NO_EMAILS"," ").contains(value)) woeValue = 0.256231;
    else if (Arrays.asList( "CRAPPY","_MISSING_").contains(value)) woeValue = 0.580747;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "STATE_HOPPING_GT2","NO_HOPPING","CITY_HOPPING_2").contains(value)) woeValue = -0.307923;
    else if (Arrays.asList( "STATE_HOPPING_2","IP_HOP_1").contains(value)) woeValue = 0.113105;
    else if (Arrays.asList( "STATE_HOPPING_EXCESSIVE").contains(value)) woeValue = 0.368649;
    else if (Arrays.asList( "IP_HOPPING_2"," ","CTRY_HOPPING_2","CITY_HOPPING_GT2").contains(value)) woeValue = 0.507250;
    else if (Arrays.asList( "IP_HOPPING_GT2","CTRY_HOPPING_EXCESSIVE").contains(value)) woeValue = 2.074537;
    else if (Arrays.asList( "CTRY_HOPPING_GT2").contains(value)) woeValue = 2.272920;
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
    
    coeffMap.put("Intercept",+3.37413035);
    coeffMap.put(p90_dys_return.getName(),-0.73490504);
    coeffMap.put(s_ms_amt_dk_40.getName(),-0.43787878);
    coeffMap.put(first_ach_txn_dof.getName(),-0.66075441);
    coeffMap.put(v36_soft_activity_d.getName(),-0.53897913);
    coeffMap.put(num_logins_7_days.getName(),-0.38091433);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.38870069);
    coeffMap.put(rt_amt_rate.getName(),-0.64414234);
    coeffMap.put(email_MP_UPIA_180d.getName(),-0.63368480);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.65562772);
    coeffMap.put(ncc_failed_amt_ratio.getName(),-0.59057753);
    coeffMap.put(s_mp_amt_dk_40.getName(),-0.46535642);
    coeffMap.put(ach_outstd_age.getName(),-0.50068203);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-0.69999761);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.77707044);
    coeffMap.put(email_MP_sinc_UPI.getName(),-0.65013190);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.59119440);
    coeffMap.put(t_bank_confirm_dof.getName(),-1.36747467);
    coeffMap.put(n_bdrt_bp_txn.getName(),-0.97435249);
    coeffMap.put(email_percofletter.getName(),-0.62236809);
    coeffMap.put(top_bin_cnt_pct.getName(),-0.63694551);
    coeffMap.put(v2_e_un_indicative.getName(),-0.54062973);
    coeffMap.put(ip_ratio_avg_dk_320.getName(),-0.56507258);
    coeffMap.put(s_c_address_match.getName(),-0.83510404);
    coeffMap.put(rcvr_cc_d_cnt_dk_40.getName(),-1.31500799);
    coeffMap.put(is_online.getName(),-1.10592607);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-1.00579722);
    coeffMap.put(primaryach_verify_saving.getName(),-1.14452089);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 849.52014462;
  }

  @Override
  public double getCoeff2() {
    return  -59.0176872;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT8;
  }
  
}