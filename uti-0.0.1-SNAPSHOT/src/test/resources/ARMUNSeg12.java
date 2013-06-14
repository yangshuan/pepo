package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg12 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(MOA_V_MOALife);
    variables.add(added_address_lt_14);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(s_ms_cnt_dk_40);
    variables.add(CP20WRtAtoBadAcc);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(email_username_match);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(CP4WRtDolBadTxn);
    variables.add(min_eaby_dof_360all);
    variables.add(s_visitor_id_dof);
    variables.add(r_cnt_dk_10);
    variables.add(first_name_lowcase);
    variables.add(v36_d_sn_prev_login);
    variables.add(ratio_login_failed_7_days);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(ip_conn_type);
    variables.add(is_credit_union);
    variables.add(wach_n_inactive);
    variables.add(email_numofvowel);
    variables.add(added_ach_lt_1);
    variables.add(email_percofnumeric);
    variables.add(num_spoof_url_b_30day);
    variables.add(IP4WRtDolBadTxn);
    variables.add(first_address_dof);
    variables.add(a_bdrt_txn);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(acct_login_cnt_dk_40);
    variables.add(s_c_address_match);


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

    if(CP20WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.318961;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.534936;
    else if (0.0001 < valueDouble && valueDouble <= 0.0003) woeValue = -0.209432;
    else if (0.0003 < valueDouble && valueDouble <= 0.0004) woeValue = 0.072953;
    else if (0.0004 < valueDouble && valueDouble <= 0.0005) woeValue = 0.091210;
    else if (0.0005 < valueDouble && valueDouble <= 0.0007) woeValue = 0.298087;
    else if (0.0007 < valueDouble && valueDouble <= 0.0015) woeValue = 0.395898;
    else if (0.0015 < valueDouble && valueDouble <= 0.002) woeValue = 0.503591;
    else if (0.002 < valueDouble && valueDouble <= 0.0045) woeValue = 0.993095;
    else if (0.0045 < valueDouble && valueDouble <= 0.0087) woeValue = 1.235966;
    else if ( valueDouble > 0.0087) woeValue = 1.529054;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.257893;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = -0.532117;
    else if (0.0012 < valueDouble && valueDouble <= 0.0026) woeValue = -0.356607;
    else if (0.0026 < valueDouble && valueDouble <= 0.0039) woeValue = -0.325432;
    else if (0.0039 < valueDouble && valueDouble <= 0.0054) woeValue = -0.088603;
    else if (0.0054 < valueDouble && valueDouble <= 0.0068) woeValue = -0.031950;
    else if (0.0068 < valueDouble && valueDouble <= 0.0073) woeValue = 0.026007;
    else if (0.0073 < valueDouble && valueDouble <= 0.0122) woeValue = 0.257842;
    else if (0.0122 < valueDouble && valueDouble <= 0.0157) woeValue = 0.595389;
    else if (0.0157 < valueDouble && valueDouble <= 0.0178) woeValue = 0.776148;
    else if (0.0178 < valueDouble && valueDouble <= 0.033) woeValue = 0.868825;
    else if ( valueDouble > 0.033) woeValue = 1.147426;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.026591;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = -0.380997;
    else if (0.0012 < valueDouble && valueDouble <= 0.0059) woeValue = -0.058891;
    else if (0.0059 < valueDouble && valueDouble <= 0.0114) woeValue = 0.039009;
    else if ( valueDouble > 0.0114) woeValue = 0.813611;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.031861;
    else if ( valueDouble > 0) woeValue = 2.385780;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 3.013903;
    else if (-1e38 < valueDouble && valueDouble <= 0.0876901481) woeValue = -0.571136;
    else if (0.0876901481 < valueDouble && valueDouble <= 0.2144504982) woeValue = -0.522136;
    else if (0.2144504982 < valueDouble && valueDouble <= 0.3103423578) woeValue = -0.511655;
    else if (0.3103423578 < valueDouble && valueDouble <= 0.4796173497) woeValue = -0.371885;
    else if (0.4796173497 < valueDouble && valueDouble <= 0.6489928224) woeValue = -0.159429;
    else if (0.6489928224 < valueDouble && valueDouble <= 0.7036995766) woeValue = -0.042767;
    else if (0.7036995766 < valueDouble && valueDouble <= 0.8270239774) woeValue = -0.035037;
    else if (0.8270239774 < valueDouble && valueDouble <= 0.897230977) woeValue = 0.161580;
    else if (0.897230977 < valueDouble && valueDouble <= 0.9673832468) woeValue = 0.259122;
    else if (0.9673832468 < valueDouble && valueDouble <= 1.6213834068) woeValue = 0.630932;
    else if (1.6213834068 < valueDouble && valueDouble <= 2.7076663858) woeValue = 0.878655;
    else if (2.7076663858 < valueDouble && valueDouble <= 4.7987843532) woeValue = 1.234837;
    else if ( valueDouble > 4.7987843532) woeValue = 1.869792;
    else woeValue = 0;}else if(a_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.293907;
    else if (0 < valueDouble && valueDouble <= 0.00008) woeValue = -1.050229;
    else if (0.00008 < valueDouble && valueDouble <= 0.00047) woeValue = -0.656700;
    else if (0.00047 < valueDouble && valueDouble <= 0.00135) woeValue = -0.459148;
    else if (0.00135 < valueDouble && valueDouble <= 0.00287) woeValue = -0.269800;
    else if (0.00287 < valueDouble && valueDouble <= 0.00571) woeValue = -0.002451;
    else if (0.00571 < valueDouble && valueDouble <= 0.00746) woeValue = 0.155309;
    else if (0.00746 < valueDouble && valueDouble <= 0.0079) woeValue = 0.492189;
    else if (0.0079 < valueDouble && valueDouble <= 0.01283) woeValue = 0.648798;
    else if (0.01283 < valueDouble && valueDouble <= 0.02832) woeValue = 1.364478;
    else if ( valueDouble > 0.02832) woeValue = 1.669218;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.013) woeValue = 2.112258;
    else if (0.013 < valueDouble && valueDouble <= 0.0968) woeValue = 0.919352;
    else if (0.0968 < valueDouble && valueDouble <= 1.0872) woeValue = 0.662832;
    else if (1.0872 < valueDouble && valueDouble <= 52.3074) woeValue = 0.358903;
    else if (52.3074 < valueDouble && valueDouble <= 145.579) woeValue = 0.145974;
    else if (145.579 < valueDouble && valueDouble <= 190.077) woeValue = -0.000270;
    else if (190.077 < valueDouble && valueDouble <= 1521.7489) woeValue = -0.052119;
    else if (1521.7489 < valueDouble && valueDouble <= 1703.378) woeValue = -0.265802;
    else if ( valueDouble > 1703.378) woeValue = -0.387874;
    else woeValue = 0;}else if(acct_login_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.221623;
    else if (0 < valueDouble && valueDouble <= 1.356) woeValue = -0.475227;
    else if (1.356 < valueDouble && valueDouble <= 1.9163) woeValue = -0.296454;
    else if (1.9163 < valueDouble && valueDouble <= 1.9907) woeValue = -0.215174;
    else if (1.9907 < valueDouble && valueDouble <= 2.3122) woeValue = -0.105869;
    else if (2.3122 < valueDouble && valueDouble <= 2.5824) woeValue = 0.086596;
    else if (2.5824 < valueDouble && valueDouble <= 3.0771) woeValue = 0.188801;
    else if (3.0771 < valueDouble && valueDouble <= 3.5509) woeValue = 0.377953;
    else if (3.5509 < valueDouble && valueDouble <= 4.717) woeValue = 0.654960;
    else if (4.717 < valueDouble && valueDouble <= 5.8188) woeValue = 0.886375;
    else if (5.8188 < valueDouble && valueDouble <= 8.2536) woeValue = 1.538565;
    else if ( valueDouble > 8.2536) woeValue = 2.484642;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.030558;
    else if ( valueDouble > 0) woeValue = 1.496822;
    else woeValue = 0;}else if(added_address_lt_14.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.126441;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.219013;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.843927;
    else if ( valueDouble > 2) woeValue = 1.140954;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6674750827) woeValue = -0.183931;
    else if (0.6674750827 < valueDouble && valueDouble <= 0.6934254949) woeValue = -0.148413;
    else if (0.6934254949 < valueDouble && valueDouble <= 0.8863419562) woeValue = -0.058938;
    else if (0.8863419562 < valueDouble && valueDouble <= 1.8649513187) woeValue = 0.059417;
    else if (1.8649513187 < valueDouble && valueDouble <= 2.7499068957) woeValue = 0.286036;
    else if (2.7499068957 < valueDouble && valueDouble <= 4.9430194903) woeValue = 0.386334;
    else if ( valueDouble > 4.9430194903) woeValue = 1.073715;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.129056;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 9) woeValue = 1.531995;
    else if (9 < valueDouble && valueDouble <= 21) woeValue = 1.287879;
    else if (21 < valueDouble && valueDouble <= 42) woeValue = 1.038722;
    else if (42 < valueDouble && valueDouble <= 191) woeValue = 0.832957;
    else if (191 < valueDouble && valueDouble <= 276) woeValue = 0.392353;
    else if (276 < valueDouble && valueDouble <= 470) woeValue = 0.231744;
    else if ( valueDouble > 470) woeValue = 0.096611;
    else woeValue = 0;}else if(email_numofvowel.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.007271;
    else if (0 < valueDouble && valueDouble <= 5) woeValue = -0.030947;
    else if (5 < valueDouble && valueDouble <= 7) woeValue = 0.068595;
    else if ( valueDouble > 7) woeValue = 0.808945;
    else woeValue = 0;}else if(email_percofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.123573;
    else if (0 < valueDouble && valueDouble <= 0.0555555556) woeValue = -0.463382;
    else if (0.0555555556 < valueDouble && valueDouble <= 0.1071428571) woeValue = 0.210410;
    else if (0.1071428571 < valueDouble && valueDouble <= 0.1363636364) woeValue = 0.344899;
    else if (0.1363636364 < valueDouble && valueDouble <= 0.4545454545) woeValue = 0.398186;
    else if ( valueDouble > 0.4545454545) woeValue = 0.475618;
    else woeValue = 0;}else if(email_username_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.123362;
    else if ( valueDouble > 0) woeValue = -0.139403;
    else woeValue = 0;}else if(first_address_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 30) woeValue = 1.384808;
    else if (30 < valueDouble && valueDouble <= 54) woeValue = 0.809063;
    else if (54 < valueDouble && valueDouble <= 123) woeValue = 0.691722;
    else if (123 < valueDouble && valueDouble <= 198) woeValue = 0.255144;
    else if (198 < valueDouble && valueDouble <= 415) woeValue = 0.047290;
    else if (415 < valueDouble && valueDouble <= 2165) woeValue = -0.204200;
    else if ( valueDouble > 2165) woeValue = -0.369935;
    else woeValue = 0;}else if(first_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.143720;
    else if ( valueDouble > 0) woeValue = 0.791902;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.132003;
    else if ( valueDouble > 0) woeValue = -0.621047;
    else woeValue = 0;}else if(min_eaby_dof_360all.getName().equals(varName)){if (value == null) woeValue = 0.491013;
    else if (-1e38 < valueDouble && valueDouble <= 55) woeValue = 1.357664;
    else if (55 < valueDouble && valueDouble <= 132) woeValue = 0.778864;
    else if (132 < valueDouble && valueDouble <= 285) woeValue = 0.732322;
    else if (285 < valueDouble && valueDouble <= 470) woeValue = 0.404223;
    else if (470 < valueDouble && valueDouble <= 610) woeValue = 0.178157;
    else if (610 < valueDouble && valueDouble <= 1031) woeValue = -0.015157;
    else if (1031 < valueDouble && valueDouble <= 1459) woeValue = -0.108258;
    else if (1459 < valueDouble && valueDouble <= 1907) woeValue = -0.188784;
    else if (1907 < valueDouble && valueDouble <= 2352) woeValue = -0.440430;
    else if (2352 < valueDouble && valueDouble <= 2731) woeValue = -0.547824;
    else if (2731 < valueDouble && valueDouble <= 3013) woeValue = -0.799281;
    else if (3013 < valueDouble && valueDouble <= 3178) woeValue = -1.017540;
    else if (3178 < valueDouble && valueDouble <= 3357) woeValue = -1.054913;
    else if ( valueDouble > 3357) woeValue = -1.123460;
    else woeValue = 0;}else if(num_spoof_url_b_30day.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.007209;
    else if ( valueDouble > 0) woeValue = 1.575693;
    else woeValue = 0;}else if(r_cnt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0.029873;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.183899;
    else if (0 < valueDouble && valueDouble <= 1.9211) woeValue = -0.221638;
    else if (1.9211 < valueDouble && valueDouble <= 5.6507) woeValue = -0.193501;
    else if (5.6507 < valueDouble && valueDouble <= 23.3743) woeValue = -0.141080;
    else if (23.3743 < valueDouble && valueDouble <= 81.7185) woeValue = -0.015198;
    else if (81.7185 < valueDouble && valueDouble <= 114.0561) woeValue = 0.189801;
    else if ( valueDouble > 114.0561) woeValue = 0.503045;
    else woeValue = 0;}else if(ratio_login_failed_7_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.141215;
    else if (0 < valueDouble && valueDouble <= 0.0411) woeValue = 2.768248;
    else if (0.0411 < valueDouble && valueDouble <= 0.1228) woeValue = 1.644749;
    else if (0.1228 < valueDouble && valueDouble <= 0.1961) woeValue = 0.724215;
    else if ( valueDouble > 0.1961) woeValue = 0.106625;
    else woeValue = 0;}else if(s_c_address_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.007522;
    else if ( valueDouble > 0) woeValue = 1.936812;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.140111;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = -0.579313;
    else if (0.0003 < valueDouble && valueDouble <= 0.0009) woeValue = -0.495219;
    else if (0.0009 < valueDouble && valueDouble <= 0.0178) woeValue = -0.335685;
    else if (0.0178 < valueDouble && valueDouble <= 0.055) woeValue = -0.268981;
    else if (0.055 < valueDouble && valueDouble <= 0.233) woeValue = -0.155710;
    else if (0.233 < valueDouble && valueDouble <= 0.3376) woeValue = -0.012339;
    else if (0.3376 < valueDouble && valueDouble <= 0.6524) woeValue = 0.286569;
    else if (0.6524 < valueDouble && valueDouble <= 0.9968) woeValue = 0.490859;
    else if (0.9968 < valueDouble && valueDouble <= 1.2328) woeValue = 0.842627;
    else if (1.2328 < valueDouble && valueDouble <= 2.2459) woeValue = 1.199390;
    else if ( valueDouble > 2.2459) woeValue = 2.259317;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.081820;
    else if (0 < valueDouble && valueDouble <= 0.0464292377) woeValue = 0.284926;
    else if (0.0464292377 < valueDouble && valueDouble <= 0.4271915883) woeValue = 0.897595;
    else if ( valueDouble > 0.4271915883) woeValue = 1.630584;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1840840) woeValue = 0.596766;
    else if (1840840 < valueDouble && valueDouble <= 4823210) woeValue = 0.551430;
    else if (4823210 < valueDouble && valueDouble <= 8215070) woeValue = 0.211218;
    else if (8215070 < valueDouble && valueDouble <= 9181592) woeValue = 0.137190;
    else if (9181592 < valueDouble && valueDouble <= 10205427) woeValue = 0.036349;
    else if (10205427 < valueDouble && valueDouble <= 15789692) woeValue = -0.208661;
    else if (15789692 < valueDouble && valueDouble <= 18336650) woeValue = -0.307488;
    else if ( valueDouble > 18336650) woeValue = -0.475840;
    else woeValue = 0;}else if(s_visitor_id_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.707517;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 5) woeValue = 0.684857;
    else if (5 < valueDouble && valueDouble <= 13) woeValue = 0.403369;
    else if (13 < valueDouble && valueDouble <= 32) woeValue = 0.217453;
    else if (32 < valueDouble && valueDouble <= 39) woeValue = -0.023131;
    else if (39 < valueDouble && valueDouble <= 131) woeValue = -0.207812;
    else if (131 < valueDouble && valueDouble <= 170) woeValue = -0.361392;
    else if (170 < valueDouble && valueDouble <= 195) woeValue = -0.538215;
    else if (195 < valueDouble && valueDouble <= 491) woeValue = -0.762744;
    else if ( valueDouble > 491) woeValue = -1.104047;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.673919;
    else if (-1e38 < valueDouble && valueDouble <= 74.856909722) woeValue = -0.125375;
    else if (74.856909722 < valueDouble && valueDouble <= 94.116423611) woeValue = 0.061018;
    else if (94.116423611 < valueDouble && valueDouble <= 121.07206019) woeValue = 0.216017;
    else if (121.07206019 < valueDouble && valueDouble <= 176.58965278) woeValue = 0.343203;
    else if ( valueDouble > 176.58965278) woeValue = 0.758544;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.190266;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.876847;
    else if ( valueDouble > 1) woeValue = 1.577810;
    else woeValue = 0;}else if(ip_conn_type.getName().equals(varName)){if (Arrays.asList( "dialup","satellite","xdsl","oc3","t1").contains(value)) woeValue = -0.194338;
    else if (Arrays.asList("broadband").contains(value)) woeValue = -0.073680;
    else if (Arrays.asList( "wireless","cable").contains(value)) woeValue = 0.380067;
    else if (Arrays.asList("mobile").contains(value)) woeValue = 0.474102;
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
    
    coeffMap.put("Intercept",+6.56754059);
    coeffMap.put(acct_login_cnt_dk_40.getName(),-0.50229339);
    coeffMap.put(MOA_V_MOALife.getName(),-0.62965535);
    coeffMap.put(a_bdrt_txn.getName(),-0.53457936);
    coeffMap.put(wach_n_inactive.getName(),-0.79333354);
    coeffMap.put(min_eaby_dof_360all.getName(),-0.52700668);
    coeffMap.put(CP20WRtAtoBadAcc.getName(),-0.37345968);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.77937671);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-1.04005626);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.46124200);
    coeffMap.put(first_address_dof.getName(),-0.81876664);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.43030308);
    coeffMap.put(first_name_lowcase.getName(),-0.61083699);
    coeffMap.put(added_ach_lt_1.getName(),-0.86242642);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.64342595);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.45596049);
    coeffMap.put(added_address_lt_14.getName(),-0.41648555);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.90088548);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.58247621);
    coeffMap.put(s_c_address_match.getName(),-0.91031941);
    coeffMap.put(ip_conn_type.getName(),-0.77680072);
    coeffMap.put(s_visitor_id_dof.getName(),-0.27422973);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.81940983);
    coeffMap.put(email_percofnumeric.getName(),-0.42244908);
    coeffMap.put(num_spoof_url_b_30day.getName(),-1.09853440);
    coeffMap.put(is_credit_union.getName(),-0.18038601);
    coeffMap.put(email_numofvowel.getName(),-1.04680320);
    coeffMap.put(ratio_login_failed_7_days.getName(),-0.23000940);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.82625241);
    coeffMap.put(r_cnt_dk_10.getName(),-0.46023077);
    coeffMap.put(email_username_match.getName(),-0.57141626);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 835.58000819;
  }

  @Override
  public double getCoeff2() {
    return  -55.1428724;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT12;
  }
  
}