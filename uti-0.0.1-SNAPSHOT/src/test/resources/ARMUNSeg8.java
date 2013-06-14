package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg8 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(ED20WRtCcBadAcc);
    variables.add(is_online);
    variables.add(ncc_failed_amt_ratio);
    variables.add(added_address_lt_14);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_ms_amt_dk_40);
    variables.add(acct_login_cnt_dk_20);
    variables.add(PC_LT50K_Income_CCBIN);
    variables.add(n_rt_dcl_14dys);
    variables.add(Decline_rate_ccbin);
    variables.add(ach_outstd_age);
    variables.add(ratio_login_failed_30_days);
    variables.add(v36_soft_activity_d);
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(c_dof);
    variables.add(PC_PREPAID_CCBIN);
    variables.add(min_to_max_ach_tof);
    variables.add(n_bdrt_bp_txn);
    variables.add(s_mp_amt_dk_40);
    variables.add(first_ach_txn_dof);
    variables.add(ip_ratio_20w_uaa_dol);
    variables.add(top_bin_amt_pct);
    variables.add(CP4WRtDclTxn);
    variables.add(email_percofnumeric);
    variables.add(v21_e_dom_score_worst);
    variables.add(s_c_fso_match);
    variables.add(IP4WRtDolBadTxn);
    variables.add(ip_ratio_max_dk_5);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(is_signup_ip2);


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

    if(CP4WRtDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0022) woeValue = -0.235003;
    else if (0.0022 < valueDouble && valueDouble <= 0.0085) woeValue = -0.194373;
    else if (0.0085 < valueDouble && valueDouble <= 0.0614) woeValue = -0.075731;
    else if (0.0614 < valueDouble && valueDouble <= 0.1027) woeValue = 0.289712;
    else if (0.1027 < valueDouble && valueDouble <= 0.1427) woeValue = 0.635330;
    else if ( valueDouble > 0.1427) woeValue = 1.070169;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.006158;
    else if (-1e38 < valueDouble && valueDouble <= 0.0254360926) woeValue = -1.343395;
    else if (0.0254360926 < valueDouble && valueDouble <= 0.0393836836) woeValue = -1.132849;
    else if (0.0393836836 < valueDouble && valueDouble <= 0.1036230048) woeValue = -0.356389;
    else if (0.1036230048 < valueDouble && valueDouble <= 0.1468499391) woeValue = 0.138410;
    else if (0.1468499391 < valueDouble && valueDouble <= 0.1683373111) woeValue = 0.292059;
    else if (0.1683373111 < valueDouble && valueDouble <= 0.1865208463) woeValue = 0.737792;
    else if ( valueDouble > 0.1865208463) woeValue = 1.338645;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0008) woeValue = -0.250425;
    else if (0.0008 < valueDouble && valueDouble <= 0.0015) woeValue = 0.094087;
    else if ( valueDouble > 0.0015) woeValue = 0.793669;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0055) woeValue = -0.299911;
    else if (0.0055 < valueDouble && valueDouble <= 0.0056) woeValue = -0.070802;
    else if (0.0056 < valueDouble && valueDouble <= 0.0113) woeValue = 0.107023;
    else if ( valueDouble > 0.0113) woeValue = 0.516112;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.009318;
    else if ( valueDouble > 0) woeValue = 1.277240;
    else woeValue = 0;}else if(PC_LT50K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.008704;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0821917808) woeValue = -0.660364;
    else if (0.0821917808 < valueDouble && valueDouble <= 0.1020408163) woeValue = -0.288363;
    else if (0.1020408163 < valueDouble && valueDouble <= 0.1559139785) woeValue = 0.404580;
    else if ( valueDouble > 0.1559139785) woeValue = 0.639688;
    else woeValue = 0;}else if(PC_PREPAID_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.005530;
    else if (-1e38 < valueDouble && valueDouble <= 0.0017761989) woeValue = -0.548844;
    else if (0.0017761989 < valueDouble && valueDouble <= 0.0049019608) woeValue = 0.042586;
    else if ( valueDouble > 0.0049019608) woeValue = 0.646347;
    else woeValue = 0;}else if(acct_login_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1.9696) woeValue = -0.376328;
    else if (1.9696 < valueDouble && valueDouble <= 1.9985) woeValue = -0.323792;
    else if (1.9985 < valueDouble && valueDouble <= 2.7647) woeValue = 0.105592;
    else if (2.7647 < valueDouble && valueDouble <= 3.3346) woeValue = 0.209204;
    else if (3.3346 < valueDouble && valueDouble <= 5.3527) woeValue = 0.289273;
    else if (5.3527 < valueDouble && valueDouble <= 5.9818) woeValue = 0.594519;
    else if (5.9818 < valueDouble && valueDouble <= 6.9614) woeValue = 0.689694;
    else if (6.9614 < valueDouble && valueDouble <= 11.7597) woeValue = 1.324941;
    else if ( valueDouble > 11.7597) woeValue = 1.535225;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 835) woeValue = -0.152481;
    else if (835 < valueDouble && valueDouble <= 4702.8) woeValue = 0.175715;
    else if (4702.8 < valueDouble && valueDouble <= 8715.4090909) woeValue = 0.755755;
    else if ( valueDouble > 8715.4090909) woeValue = 1.687283;
    else woeValue = 0;}else if(added_address_lt_14.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.095312;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.149502;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.266069;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.423760;
    else if ( valueDouble > 3) woeValue = 1.520866;
    else woeValue = 0;}else if(c_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 68) woeValue = 0.875641;
    else if (68 < valueDouble && valueDouble <= 1107) woeValue = 0.146492;
    else if (1107 < valueDouble && valueDouble <= 3145) woeValue = -0.166748;
    else if ( valueDouble > 3145) woeValue = -0.198287;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.097709589) woeValue = -0.360598;
    else if (0.097709589 < valueDouble && valueDouble <= 0.8695652174) woeValue = -0.170928;
    else if (0.8695652174 < valueDouble && valueDouble <= 1.0508673632) woeValue = -0.123302;
    else if (1.0508673632 < valueDouble && valueDouble <= 2.0477667763) woeValue = 0.007727;
    else if (2.0477667763 < valueDouble && valueDouble <= 3.9120607961) woeValue = 0.370178;
    else if (3.9120607961 < valueDouble && valueDouble <= 5.7099185575) woeValue = 0.891419;
    else if ( valueDouble > 5.7099185575) woeValue = 1.304962;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.216798;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.717851;
    else if (0 < valueDouble && valueDouble <= 0.0050634142) woeValue = 0.358116;
    else if (0.0050634142 < valueDouble && valueDouble <= 0.0487935528) woeValue = 0.750394;
    else if (0.0487935528 < valueDouble && valueDouble <= 0.4895423653) woeValue = 0.940235;
    else if (0.4895423653 < valueDouble && valueDouble <= 0.9993824181) woeValue = 1.166528;
    else if ( valueDouble > 0.9993824181) woeValue = 1.951594;
    else woeValue = 0;}else if(email_percofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.130175;
    else if (0 < valueDouble && valueDouble <= 0.0714285714) woeValue = -0.585043;
    else if (0.0714285714 < valueDouble && valueDouble <= 0.2) woeValue = 0.121518;
    else if ( valueDouble > 0.2) woeValue = 0.491235;
    else woeValue = 0;}else if(first_ach_txn_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.069892;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.748539;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.279933;
    else if (2 < valueDouble && valueDouble <= 18) woeValue = -0.288898;
    else if (18 < valueDouble && valueDouble <= 383) woeValue = -1.242153;
    else if ( valueDouble > 383) woeValue = -3.840021;
    else woeValue = 0;}else if(ip_ratio_20w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.057939;
    else if (-1e38 < valueDouble && valueDouble <= 0.0119957411) woeValue = -0.535933;
    else if (0.0119957411 < valueDouble && valueDouble <= 0.0737765637) woeValue = -0.343601;
    else if (0.0737765637 < valueDouble && valueDouble <= 0.0806949062) woeValue = -0.262189;
    else if (0.0806949062 < valueDouble && valueDouble <= 0.7518571429) woeValue = 0.030215;
    else if (0.7518571429 < valueDouble && valueDouble <= 2.7965528495) woeValue = 0.477169;
    else if ( valueDouble > 2.7965528495) woeValue = 1.208607;
    else woeValue = 0;}else if(ip_ratio_max_dk_5.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.211413;
    else if (-1 < valueDouble && valueDouble <= 0.0547) woeValue = -0.505720;
    else if (0.0547 < valueDouble && valueDouble <= 18.794) woeValue = 0.105520;
    else if ( valueDouble > 18.794) woeValue = 0.392028;
    else woeValue = 0;}else if(is_online.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.031319;
    else if ( valueDouble > 0) woeValue = 0.400964;
    else woeValue = 0;}else if(is_signup_ip2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.112010;
    else if ( valueDouble > 0) woeValue = -0.225265;
    else woeValue = 0;}else if(min_to_max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 2.674123;
    else if (-1 < valueDouble && valueDouble <= 0.0000180809) woeValue = 1.483916;
    else if (0.0000180809 < valueDouble && valueDouble <= 0.9999999488) woeValue = 0.618798;
    else if ( valueDouble > 0.9999999488) woeValue = -0.171491;
    else woeValue = 0;}else if(n_bdrt_bp_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.214810;
    else if (0 < valueDouble && valueDouble <= 0.00308) woeValue = -0.765373;
    else if (0.00308 < valueDouble && valueDouble <= 0.00735) woeValue = -0.097532;
    else if (0.00735 < valueDouble && valueDouble <= 0.01274) woeValue = 0.112025;
    else if (0.01274 < valueDouble && valueDouble <= 0.06522) woeValue = 0.128206;
    else if ( valueDouble > 0.06522) woeValue = 0.663886;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.013514) woeValue = -1.640276;
    else if (0.013514 < valueDouble && valueDouble <= 0.029412) woeValue = -0.775571;
    else if (0.029412 < valueDouble && valueDouble <= 0.059278) woeValue = -0.442632;
    else if (0.059278 < valueDouble && valueDouble <= 0.066008) woeValue = -0.061550;
    else if (0.066008 < valueDouble && valueDouble <= 0.106195) woeValue = -0.020643;
    else if (0.106195 < valueDouble && valueDouble <= 0.245509) woeValue = 0.100979;
    else if (0.245509 < valueDouble && valueDouble <= 0.269231) woeValue = 0.442177;
    else if (0.269231 < valueDouble && valueDouble <= 0.378049) woeValue = 0.530685;
    else if ( valueDouble > 0.378049) woeValue = 1.449647;
    else woeValue = 0;}else if(ncc_failed_amt_ratio.getName().equals(varName)){if (value == null) woeValue = 0.029970;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.626811;
    else if (0 < valueDouble && valueDouble <= 0.1095934767) woeValue = -0.888523;
    else if (0.1095934767 < valueDouble && valueDouble <= 0.3847315791) woeValue = 0.128226;
    else if (0.3847315791 < valueDouble && valueDouble <= 0.6526545284) woeValue = 0.822962;
    else if ( valueDouble > 0.6526545284) woeValue = 1.497609;
    else woeValue = 0;}else if(ratio_login_failed_30_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.110338;
    else if (0 < valueDouble && valueDouble <= 0.0398) woeValue = 1.216799;
    else if (0.0398 < valueDouble && valueDouble <= 0.3) woeValue = 0.070502;
    else if ( valueDouble > 0.3) woeValue = -0.052412;
    else woeValue = 0;}else if(s_c_fso_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.024280;
    else if ( valueDouble > 0) woeValue = 2.149310;
    else woeValue = 0;}else if(s_mp_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.069077;
    else if (0 < valueDouble && valueDouble <= 192.4196) woeValue = -0.993282;
    else if (192.4196 < valueDouble && valueDouble <= 1111.6656) woeValue = -0.409836;
    else if (1111.6656 < valueDouble && valueDouble <= 4927.1851) woeValue = -0.219806;
    else if (4927.1851 < valueDouble && valueDouble <= 12314.5231) woeValue = 0.228027;
    else if ( valueDouble > 12314.5231) woeValue = 1.136347;
    else woeValue = 0;}else if(s_ms_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.209443;
    else if (0 < valueDouble && valueDouble <= 0.0054) woeValue = -0.704479;
    else if (0.0054 < valueDouble && valueDouble <= 743.6975) woeValue = -0.391776;
    else if (743.6975 < valueDouble && valueDouble <= 1191.5763) woeValue = 0.028817;
    else if (1191.5763 < valueDouble && valueDouble <= 4134.1503) woeValue = 0.392534;
    else if (4134.1503 < valueDouble && valueDouble <= 11555.8645) woeValue = 0.903031;
    else if (11555.8645 < valueDouble && valueDouble <= 25735.4757) woeValue = 1.385250;
    else if ( valueDouble > 25735.4757) woeValue = 2.023852;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.017) woeValue = 0.678188;
    else if (0.017 < valueDouble && valueDouble <= 0.019) woeValue = 0.090504;
    else if (0.019 < valueDouble && valueDouble <= 0.032) woeValue = -0.032894;
    else if (0.032 < valueDouble && valueDouble <= 0.079) woeValue = -0.106185;
    else if ( valueDouble > 0.079) woeValue = -0.175588;
    else woeValue = 0;}else if(v36_soft_activity_d.getName().equals(varName)){if (value == null) woeValue = 0.857723;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 0.274143;
    else if (1 < valueDouble && valueDouble <= 55) woeValue = -0.176916;
    else if (55 < valueDouble && valueDouble <= 93) woeValue = -0.597909;
    else if (93 < valueDouble && valueDouble <= 130) woeValue = -0.664737;
    else if ( valueDouble > 130) woeValue = -2.467228;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.788371;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.329545;
    else if (Arrays.asList( "MED","BAD","NO_EMAILS"," ","_MISSING_").contains(value)) woeValue = 0.135453;
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
    
    coeffMap.put("Intercept",+3.32016852);
    coeffMap.put(s_ms_amt_dk_40.getName(),-0.34532412);
    coeffMap.put(min_to_max_ach_tof.getName(),-1.05631298);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.74893674);
    coeffMap.put(ach_outstd_age.getName(),-0.51419633);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.42215388);
    coeffMap.put(v36_soft_activity_d.getName(),-0.59599651);
    coeffMap.put(ncc_failed_amt_ratio.getName(),-0.55349624);
    coeffMap.put(first_ach_txn_dof.getName(),-0.62467590);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.73866518);
    coeffMap.put(n_bdrt_bp_txn.getName(),-0.71892448);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-0.51296281);
    coeffMap.put(acct_login_cnt_dk_20.getName(),-0.28090945);
    coeffMap.put(CP4WRtDclTxn.getName(),-0.44221037);
    coeffMap.put(top_bin_amt_pct.getName(),-1.30279100);
    coeffMap.put(s_c_fso_match.getName(),-0.45385184);
    coeffMap.put(email_percofnumeric.getName(),-0.75395096);
    coeffMap.put(is_online.getName(),-0.94541985);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.61688348);
    coeffMap.put(ratio_login_failed_30_days.getName(),-0.37478142);
    coeffMap.put(added_address_lt_14.getName(),-0.50014687);
    coeffMap.put(s_mp_amt_dk_40.getName(),-0.45880459);
    coeffMap.put(ip_ratio_max_dk_5.getName(),-1.05942104);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.68846146);
    coeffMap.put(PC_LT50K_Income_CCBIN.getName(),-0.43607369);
    coeffMap.put(ip_ratio_20w_uaa_dol.getName(),-0.47378370);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.84824803);
    coeffMap.put(PC_PREPAID_CCBIN.getName(),-0.67319423);
    coeffMap.put(is_signup_ip2.getName(),-1.02112596);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.19668725);
    coeffMap.put(c_dof.getName(),-0.50740457);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 840.80366618;
  }

  @Override
  public double getCoeff2() {
    return  -56.36142626;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT8;
  }
  
}