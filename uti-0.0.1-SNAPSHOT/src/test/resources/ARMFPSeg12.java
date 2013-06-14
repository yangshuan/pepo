package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg12 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(seen_same_bankid_30d_90d);
    variables.add(avg_ebay_since_bid_360all);
    variables.add(ach_prtlamt_age);
    variables.add(days_snc_last_achtxn);
    variables.add(added_address_lt_14);
    variables.add(ebay_sinc_UPIA_360all);
    variables.add(pst_hour_created);
    variables.add(CP20WRtAtoBadAcc);
    variables.add(t_bank_dof);
    variables.add(ebay_dy_snc_sus_min_360all);
    variables.add(v36_login_exces_1h);
    variables.add(s_outstd_iach_amt);
    variables.add(Decline_rate_ccbin);
    variables.add(v3_ip_ad_dist_best);
    variables.add(s_has_used_vid);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(s2r_txnsnt_amt_avg_lst_1_hrs);
    variables.add(s2r_txnsnt_as_min_lst_1_hrs);
    variables.add(v36_diff_vid_3d);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(CP4WRtDolBadTxn);
    variables.add(v21_acct_age_by_cc);
    variables.add(email_percofvowel);
    variables.add(num_logins_3_days);
    variables.add(ratio_login_failed_3_days);
    variables.add(ebay_V_7d1Yr_ASP_360all);
    variables.add(first_name_lowcase);
    variables.add(v2_ph_indicative);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(email_percofletter);
    variables.add(wach_n_inactive);
    variables.add(s_visitor_id_tof);
    variables.add(added_ach_lt_1);
    variables.add(p90_dys_return);
    variables.add(v21_e_dom_score_worst);
    variables.add(outstd_iach_count2);
    variables.add(r_cnt_dk_20);
    variables.add(IP4WRtDolBadTxn);
    variables.add(s2r_txnsnt_as_max_lst_1_hrs);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(cp_ratio_1w_ato_dol);
    variables.add(diff_asp);
    variables.add(ncc_failed_ratio);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.263735;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.402325;
    else if (0.0001 < valueDouble && valueDouble <= 0.0003) woeValue = -0.168294;
    else if (0.0003 < valueDouble && valueDouble <= 0.0005) woeValue = 0.127564;
    else if (0.0005 < valueDouble && valueDouble <= 0.0008) woeValue = 0.248421;
    else if (0.0008 < valueDouble && valueDouble <= 0.0016) woeValue = 0.329857;
    else if (0.0016 < valueDouble && valueDouble <= 0.0024) woeValue = 0.807205;
    else if (0.0024 < valueDouble && valueDouble <= 0.0077) woeValue = 0.947462;
    else if ( valueDouble > 0.0077) woeValue = 1.301636;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.335131;
    else if (0 < valueDouble && valueDouble <= 0.0018) woeValue = -0.472933;
    else if (0.0018 < valueDouble && valueDouble <= 0.004) woeValue = -0.309381;
    else if (0.004 < valueDouble && valueDouble <= 0.0056) woeValue = -0.017425;
    else if (0.0056 < valueDouble && valueDouble <= 0.0066) woeValue = 0.017527;
    else if (0.0066 < valueDouble && valueDouble <= 0.0089) woeValue = 0.104972;
    else if (0.0089 < valueDouble && valueDouble <= 0.0117) woeValue = 0.376741;
    else if (0.0117 < valueDouble && valueDouble <= 0.0133) woeValue = 0.434260;
    else if (0.0133 < valueDouble && valueDouble <= 0.0152) woeValue = 0.620600;
    else if (0.0152 < valueDouble && valueDouble <= 0.0172) woeValue = 0.727886;
    else if ( valueDouble > 0.0172) woeValue = 0.953010;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.031983601) woeValue = -0.628550;
    else if (0.031983601 < valueDouble && valueDouble <= 0.0341311489) woeValue = -0.569284;
    else if (0.0341311489 < valueDouble && valueDouble <= 0.0387434555) woeValue = -0.442709;
    else if (0.0387434555 < valueDouble && valueDouble <= 0.072815534) woeValue = -0.199328;
    else if (0.072815534 < valueDouble && valueDouble <= 0.1164781688) woeValue = 0.118988;
    else if (0.1164781688 < valueDouble && valueDouble <= 0.1587922403) woeValue = 0.531564;
    else if (0.1587922403 < valueDouble && valueDouble <= 0.1646586345) woeValue = 0.718529;
    else if ( valueDouble > 0.1646586345) woeValue = 1.246266;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.017097;
    else if (0 < valueDouble && valueDouble <= 0.0014) woeValue = -0.286970;
    else if (0.0014 < valueDouble && valueDouble <= 0.0059) woeValue = -0.048155;
    else if (0.0059 < valueDouble && valueDouble <= 0.0114) woeValue = 0.151097;
    else if ( valueDouble > 0.0114) woeValue = 1.024876;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.240973;
    else if (0 < valueDouble && valueDouble <= 0.0676) woeValue = 0.078391;
    else if ( valueDouble > 0.0676) woeValue = 0.680895;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0137) woeValue = 2.302457;
    else if (0.0137 < valueDouble && valueDouble <= 1.1515) woeValue = 0.905660;
    else if (1.1515 < valueDouble && valueDouble <= 53.3049) woeValue = 0.468763;
    else if (53.3049 < valueDouble && valueDouble <= 110.3261) woeValue = 0.214230;
    else if (110.3261 < valueDouble && valueDouble <= 147.3325) woeValue = 0.196933;
    else if (147.3325 < valueDouble && valueDouble <= 192.0512) woeValue = 0.011700;
    else if (192.0512 < valueDouble && valueDouble <= 1533.5357) woeValue = -0.106179;
    else if (1533.5357 < valueDouble && valueDouble <= 1714.756) woeValue = -0.236750;
    else if (1714.756 < valueDouble && valueDouble <= 4383.9703) woeValue = -0.373762;
    else if (4383.9703 < valueDouble && valueDouble <= 4886.7556) woeValue = -0.616213;
    else if ( valueDouble > 4886.7556) woeValue = -0.677719;
    else woeValue = 0;}else if(ach_prtlamt_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11.841025641) woeValue = -0.137178;
    else if (11.841025641 < valueDouble && valueDouble <= 26.357664234) woeValue = -0.072034;
    else if (26.357664234 < valueDouble && valueDouble <= 101) woeValue = 0.167718;
    else if (101 < valueDouble && valueDouble <= 187.01724138) woeValue = 0.860983;
    else if ( valueDouble > 187.01724138) woeValue = 1.567835;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.045638;
    else if ( valueDouble > 0) woeValue = 1.814829;
    else woeValue = 0;}else if(added_address_lt_14.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.151576;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.297317;
    else if ( valueDouble > 1) woeValue = 0.926004;
    else woeValue = 0;}else if(avg_ebay_since_bid_360all.getName().equals(varName)){if (value == null) woeValue = 0.430912;
    else if (-1e38 < valueDouble && valueDouble <= 1663) woeValue = 0.214907;
    else if (1663 < valueDouble && valueDouble <= 1899.4) woeValue = -0.097564;
    else if (1899.4 < valueDouble && valueDouble <= 2122) woeValue = -0.125742;
    else if (2122 < valueDouble && valueDouble <= 2350.75) woeValue = -0.266691;
    else if (2350.75 < valueDouble && valueDouble <= 2678.25) woeValue = -0.337301;
    else if (2678.25 < valueDouble && valueDouble <= 2930.5) woeValue = -0.421092;
    else if (2930.5 < valueDouble && valueDouble <= 3239) woeValue = -0.696856;
    else if (3239 < valueDouble && valueDouble <= 4047) woeValue = -0.770710;
    else if ( valueDouble > 4047) woeValue = -0.949411;
    else woeValue = 0;}else if(cp_ratio_1w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.171549;
    else if (-1e38 < valueDouble && valueDouble <= 0.1111115823) woeValue = -0.093351;
    else if (0.1111115823 < valueDouble && valueDouble <= 0.1550849985) woeValue = -0.035462;
    else if (0.1550849985 < valueDouble && valueDouble <= 0.1737328658) woeValue = 0.007993;
    else if (0.1737328658 < valueDouble && valueDouble <= 0.3229015544) woeValue = 0.199805;
    else if (0.3229015544 < valueDouble && valueDouble <= 0.8491379793) woeValue = 0.433753;
    else if (0.8491379793 < valueDouble && valueDouble <= 5.6323161581) woeValue = 0.516607;
    else if ( valueDouble > 5.6323161581) woeValue = 0.535291;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 3.264476;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.537296;
    else if (0 < valueDouble && valueDouble <= 25) woeValue = -0.563327;
    else if (25 < valueDouble && valueDouble <= 27) woeValue = -0.348976;
    else if (27 < valueDouble && valueDouble <= 29) woeValue = -0.326875;
    else if (29 < valueDouble && valueDouble <= 43) woeValue = -0.293112;
    else if (43 < valueDouble && valueDouble <= 62) woeValue = -0.114497;
    else if (62 < valueDouble && valueDouble <= 71) woeValue = -0.014156;
    else if (71 < valueDouble && valueDouble <= 95) woeValue = 0.268428;
    else if (95 < valueDouble && valueDouble <= 109) woeValue = 0.542948;
    else if (109 < valueDouble && valueDouble <= 126) woeValue = 0.626635;
    else if (126 < valueDouble && valueDouble <= 150) woeValue = 0.840621;
    else if ( valueDouble > 150) woeValue = 1.051706;
    else woeValue = 0;}else if(diff_asp.getName().equals(varName)){if (value == null) woeValue = 0.106415;
    else if (-1e38 < valueDouble && valueDouble <= -9979.184524) woeValue = -0.537261;
    else if (-9979.184524 < valueDouble && valueDouble <= -4410.974026) woeValue = -0.371119;
    else if (-4410.974026 < valueDouble && valueDouble <= -1767.818182) woeValue = -0.229848;
    else if (-1767.818182 < valueDouble && valueDouble <= -1432.79485) woeValue = -0.145296;
    else if (-1432.79485 < valueDouble && valueDouble <= -138.2469136) woeValue = -0.020519;
    else if (-138.2469136 < valueDouble && valueDouble <= 12936.600741) woeValue = 0.142947;
    else if (12936.600741 < valueDouble && valueDouble <= 23951.853001) woeValue = 0.157037;
    else if ( valueDouble > 23951.853001) woeValue = 1.051221;
    else woeValue = 0;}else if(ebay_V_7d1Yr_ASP_360all.getName().equals(varName)){if (value == null) woeValue = 0.061344;
    else if (-1e38 < valueDouble && valueDouble <= 0.0516) woeValue = -0.506770;
    else if (0.0516 < valueDouble && valueDouble <= 0.766) woeValue = -0.471198;
    else if (0.766 < valueDouble && valueDouble <= 1.4911) woeValue = -0.094843;
    else if ( valueDouble > 1.4911) woeValue = 0.112080;
    else woeValue = 0;}else if(ebay_dy_snc_sus_min_360all.getName().equals(varName)){if (value == null) woeValue = -0.088854;
    else if (-1e38 < valueDouble && valueDouble <= 93) woeValue = 3.359444;
    else if (93 < valueDouble && valueDouble <= 136) woeValue = 3.234840;
    else if (136 < valueDouble && valueDouble <= 997) woeValue = 2.563041;
    else if (997 < valueDouble && valueDouble <= 1573) woeValue = 1.719908;
    else if (1573 < valueDouble && valueDouble <= 2009) woeValue = 1.318126;
    else if (2009 < valueDouble && valueDouble <= 2101) woeValue = 1.179341;
    else if (2101 < valueDouble && valueDouble <= 2841) woeValue = 0.746184;
    else if ( valueDouble > 2841) woeValue = 0.391853;
    else woeValue = 0;}else if(ebay_sinc_UPIA_360all.getName().equals(varName)){if (value == null) woeValue = -0.104022;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.838306;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.847125;
    else if (2 < valueDouble && valueDouble <= 141) woeValue = 0.402079;
    else if (141 < valueDouble && valueDouble <= 240) woeValue = 0.034447;
    else if ( valueDouble > 240) woeValue = -0.094653;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.424687;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.550982;
    else if (0 < valueDouble && valueDouble <= 8.396928E-16) woeValue = 0.361593;
    else if (8.396928E-16 < valueDouble && valueDouble <= 1.365781E-11) woeValue = 0.449289;
    else if (1.365781E-11 < valueDouble && valueDouble <= 0.0497870684) woeValue = 0.855256;
    else if ( valueDouble > 0.0497870684) woeValue = 1.351499;
    else woeValue = 0;}else if(email_percofletter.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.7058823529) woeValue = 0.361866;
    else if (0.7058823529 < valueDouble && valueDouble <= 0.8518518519) woeValue = 0.231918;
    else if (0.8518518519 < valueDouble && valueDouble <= 0.8846153846) woeValue = -0.033551;
    else if (0.8846153846 < valueDouble && valueDouble <= 0.9230769231) woeValue = -0.158482;
    else if (0.9230769231 < valueDouble && valueDouble <= 0.9705882353) woeValue = -0.354246;
    else if ( valueDouble > 0.9705882353) woeValue = 0.026920;
    else woeValue = 0;}else if(email_percofvowel.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.3913043478) woeValue = -0.065421;
    else if (0.3913043478 < valueDouble && valueDouble <= 0.44) woeValue = 0.102431;
    else if (0.44 < valueDouble && valueDouble <= 0.5) woeValue = 0.123734;
    else if ( valueDouble > 0.5) woeValue = 0.522593;
    else woeValue = 0;}else if(first_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.106947;
    else if ( valueDouble > 0) woeValue = 0.649683;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.329688;
    else if (0 < valueDouble && valueDouble <= 0.0769230769) woeValue = -0.071968;
    else if (0.0769230769 < valueDouble && valueDouble <= 0.1498127341) woeValue = 0.228396;
    else if (0.1498127341 < valueDouble && valueDouble <= 0.1790393013) woeValue = 0.675411;
    else if (0.1790393013 < valueDouble && valueDouble <= 0.3125) woeValue = 0.812736;
    else if (0.3125 < valueDouble && valueDouble <= 0.75) woeValue = 0.896432;
    else if ( valueDouble > 0.75) woeValue = 1.370702;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.758166;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.485373;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.276831;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.017656;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.065420;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.257532;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.431236;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 0.608965;
    else if (8 < valueDouble && valueDouble <= 13) woeValue = 1.207635;
    else if ( valueDouble > 13) woeValue = 2.506260;
    else woeValue = 0;}else if(outstd_iach_count2.getName().equals(varName)){if (value == null) woeValue = 3.359347;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.254105;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.141743;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.605486;
    else if (6 < valueDouble && valueDouble <= 9) woeValue = 1.228196;
    else if ( valueDouble > 9) woeValue = 2.193092;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 7) woeValue = -0.108185;
    else if (7 < valueDouble && valueDouble <= 13) woeValue = -0.004396;
    else if (13 < valueDouble && valueDouble <= 14) woeValue = 0.373536;
    else if (14 < valueDouble && valueDouble <= 16) woeValue = 0.565356;
    else if ( valueDouble > 16) woeValue = 1.009033;
    else woeValue = 0;}else if(pst_hour_created.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.072489;
    else if (0 < valueDouble && valueDouble <= 13) woeValue = -0.047324;
    else if (13 < valueDouble && valueDouble <= 14) woeValue = 0.137143;
    else if (14 < valueDouble && valueDouble <= 22) woeValue = 0.461692;
    else if ( valueDouble > 22) woeValue = 0.156729;
    else woeValue = 0;}else if(r_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.194657;
    else if (0 < valueDouble && valueDouble <= 3.7072) woeValue = -0.256591;
    else if (3.7072 < valueDouble && valueDouble <= 10.658) woeValue = -0.228346;
    else if (10.658 < valueDouble && valueDouble <= 43.2811) woeValue = -0.131665;
    else if (43.2811 < valueDouble && valueDouble <= 199.9036) woeValue = 0.052879;
    else if ( valueDouble > 199.9036) woeValue = 0.466885;
    else woeValue = 0;}else if(ratio_login_failed_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.141340;
    else if (0 < valueDouble && valueDouble <= 0.0833) woeValue = 2.959491;
    else if (0.0833 < valueDouble && valueDouble <= 0.2) woeValue = 1.056615;
    else if (0.2 < valueDouble && valueDouble <= 0.3226) woeValue = 0.401947;
    else if (0.3226 < valueDouble && valueDouble <= 0.4884) woeValue = 0.318572;
    else if ( valueDouble > 0.4884) woeValue = 0.145809;
    else woeValue = 0;}else if(s2r_txnsnt_amt_avg_lst_1_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.041972;
    else if (-1 < valueDouble && valueDouble <= 13.17) woeValue = 0.671122;
    else if ( valueDouble > 13.17) woeValue = 0.998813;
    else woeValue = 0;}else if(s2r_txnsnt_as_max_lst_1_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.036248;
    else if (-1 < valueDouble && valueDouble <= 12.98) woeValue = 0.551267;
    else if ( valueDouble > 12.98) woeValue = 0.954389;
    else woeValue = 0;}else if(s2r_txnsnt_as_min_lst_1_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.036248;
    else if (-1 < valueDouble && valueDouble <= 11.48) woeValue = 0.646939;
    else if ( valueDouble > 11.48) woeValue = 0.903053;
    else woeValue = 0;}else if(s_has_used_vid.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.600354;
    else if ( valueDouble > 0) woeValue = -0.091591;
    else woeValue = 0;}else if(s_outstd_iach_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11176) woeValue = -0.139091;
    else if (11176 < valueDouble && valueDouble <= 19414) woeValue = -0.059114;
    else if (19414 < valueDouble && valueDouble <= 28420) woeValue = -0.015727;
    else if (28420 < valueDouble && valueDouble <= 33509) woeValue = 0.168012;
    else if (33509 < valueDouble && valueDouble <= 53029) woeValue = 0.516951;
    else if (53029 < valueDouble && valueDouble <= 77238) woeValue = 0.595041;
    else if ( valueDouble > 77238) woeValue = 1.774169;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 2037135) woeValue = 0.608753;
    else if (2037135 < valueDouble && valueDouble <= 4313903) woeValue = 0.551043;
    else if (4313903 < valueDouble && valueDouble <= 5135421) woeValue = 0.300855;
    else if (5135421 < valueDouble && valueDouble <= 9719540) woeValue = 0.089190;
    else if (9719540 < valueDouble && valueDouble <= 10727075) woeValue = -0.071851;
    else if (10727075 < valueDouble && valueDouble <= 15204316) woeValue = -0.213946;
    else if (15204316 < valueDouble && valueDouble <= 17643235) woeValue = -0.255897;
    else if ( valueDouble > 17643235) woeValue = -0.443161;
    else woeValue = 0;}else if(s_visitor_id_tof.getName().equals(varName)){if (value == null) woeValue = -0.039603;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.227814;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 1.361299;
    else if (3 < valueDouble && valueDouble <= 14) woeValue = 0.679493;
    else if (14 < valueDouble && valueDouble <= 92) woeValue = 0.295354;
    else if (92 < valueDouble && valueDouble <= 208) woeValue = -0.170305;
    else if (208 < valueDouble && valueDouble <= 375) woeValue = -0.379348;
    else if ( valueDouble > 375) woeValue = -0.653689;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.886513;
    else if ( valueDouble > 0) woeValue = -0.625188;
    else woeValue = 0;}else if(t_bank_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 2.834051;
    else if (-1 < valueDouble && valueDouble <= 16) woeValue = 2.149616;
    else if (16 < valueDouble && valueDouble <= 36) woeValue = 0.979529;
    else if (36 < valueDouble && valueDouble <= 109) woeValue = 0.724958;
    else if (109 < valueDouble && valueDouble <= 150) woeValue = 0.249242;
    else if (150 < valueDouble && valueDouble <= 170) woeValue = 0.186887;
    else if (170 < valueDouble && valueDouble <= 261) woeValue = -0.019755;
    else if (261 < valueDouble && valueDouble <= 431) woeValue = -0.163540;
    else if (431 < valueDouble && valueDouble <= 460) woeValue = -0.521189;
    else if (460 < valueDouble && valueDouble <= 2620) woeValue = -0.596691;
    else if ( valueDouble > 2620) woeValue = -0.690450;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.692127;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.705674;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.291186;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.090667;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.001015;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.238749;
    else if ( valueDouble > 4) woeValue = 0.417075;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.633602;
    else if ( valueDouble > 0) woeValue = -0.079659;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.258731;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 1.066959;
    else if ( valueDouble > 1) woeValue = 1.709324;
    else woeValue = 0;}else if(v21_acct_age_by_cc.getName().equals(varName)){if (Arrays.asList( "NO_CCS"," ","ACCOUNT_ANCIENT").contains(value)) woeValue = -0.031957;
    else if (Arrays.asList( "ACCOUNT_OLD").contains(value)) woeValue = 0.736876;
    else if (Arrays.asList( "ACCOUNT_YOUNG").contains(value)) woeValue = 1.237637;
    else if (Arrays.asList( "ACCOUNT_INFANT","_MISSING_").contains(value)) woeValue = 2.665474;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.541699;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.203907;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.033424;
    else if (Arrays.asList( "NO_EMAILS").contains(value)) woeValue = 0.069214;
    else if (Arrays.asList( "MED","BAD").contains(value)) woeValue = 0.190844;
    else woeValue = 0;}else if(v2_ph_indicative.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "FIXED","FIXED_GEO_MATCH").contains(value)) woeValue = -0.399979;
    else if (Arrays.asList( "NO_PHONES").contains(value)) woeValue = -0.074353;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.033424;
    else if (Arrays.asList( "TWO_SIMILAR","MOBILE","TWO_GEO_MATCH").contains(value)) woeValue = 0.383069;
    else if (Arrays.asList( "OTHER","CORP").contains(value)) woeValue = 0.910405;
    else woeValue = 0;}else if(v3_ip_ad_dist_best.getName().equals(varName)){if (Arrays.asList( "CLOSE_DIST","EXACT_DIST").contains(value)) woeValue = -0.091704;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.033424;
    else if (Arrays.asList( "LOW_DIST").contains(value)) woeValue = 0.050891;
    else if (Arrays.asList( "MED_DIST","MM_ERROR").contains(value)) woeValue = 0.150042;
    else if (Arrays.asList( "ULT_DIST").contains(value)) woeValue = 1.163146;
    else if (Arrays.asList( "HIGH_DIST","_MISSING_").contains(value)) woeValue = 1.781827;
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
    
    coeffMap.put("Intercept",+6.81498503);
    coeffMap.put(t_bank_dof.getName(),-0.71812634);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.46788267);
    coeffMap.put(outstd_iach_count2.getName(),-0.18921347);
    coeffMap.put(num_logins_3_days.getName(),-0.31258320);
    coeffMap.put(p90_dys_return.getName(),-0.21383050);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.15402780);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.72777748);
    coeffMap.put(wach_n_inactive.getName(),-0.54304380);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.43923732);
    coeffMap.put(ratio_login_failed_3_days.getName(),-0.20758961);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.35052005);
    coeffMap.put(ebay_dy_snc_sus_min_360all.getName(),-0.69297070);
    coeffMap.put(avg_ebay_since_bid_360all.getName(),-0.31646876);
    coeffMap.put(CP20WRtAtoBadAcc.getName(),-0.31406480);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.55741860);
    coeffMap.put(s_outstd_iach_amt.getName(),-0.61811116);
    coeffMap.put(ach_prtlamt_age.getName(),-0.15858207);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.37222463);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.23513455);
    coeffMap.put(added_address_lt_14.getName(),-0.39963094);
    coeffMap.put(added_ach_lt_1.getName(),-0.39062037);
    coeffMap.put(v2_ph_indicative.getName(),-0.25504877);
    coeffMap.put(cp_ratio_1w_ato_dol.getName(),-0.35123023);
    coeffMap.put(first_name_lowcase.getName(),-0.44975868);
    coeffMap.put(ncc_failed_ratio.getName(),-0.35921783);
    coeffMap.put(diff_asp.getName(),-0.35481214);
    coeffMap.put(ebay_sinc_UPIA_360all.getName(),-0.87235122);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.40022573);
    coeffMap.put(s_has_used_vid.getName(),+0.23853400);
    coeffMap.put(v36_login_exces_1h.getName(),-0.61803357);
    coeffMap.put(v3_ip_ad_dist_best.getName(),-0.43413418);
    coeffMap.put(v21_acct_age_by_cc.getName(),-0.43222604);
    coeffMap.put(r_cnt_dk_20.getName(),-0.20447779);
    coeffMap.put(email_percofletter.getName(),-0.72108996);
    coeffMap.put(s2r_txnsnt_amt_avg_lst_1_hrs.getName(),+0.58106200);
    coeffMap.put(s_visitor_id_tof.getName(),-0.29580468);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.76264690);
    coeffMap.put(s2r_txnsnt_as_max_lst_1_hrs.getName(),-2.45112382);
    coeffMap.put(s2r_txnsnt_as_min_lst_1_hrs.getName(),+1.67400696);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.65101325);
    coeffMap.put(ebay_V_7d1Yr_ASP_360all.getName(),-1.02940749);
    coeffMap.put(pst_hour_created.getName(),-0.47572455);
    coeffMap.put(email_percofvowel.getName(),-0.62859327);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 875.24678266;
  }

  @Override
  public double getCoeff2() {
    return  -63.58584417;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT12;
  }
  
}