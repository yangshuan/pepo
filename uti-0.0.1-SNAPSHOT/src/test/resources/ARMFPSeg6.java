package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg6 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(email_MP_dof);
    variables.add(ED20WRtCcBadAcc);
    variables.add(Bad_rate_ccbin);
    variables.add(CP4WRtDolBadTxn);
    variables.add(wach_n_checking);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(ebay_UPI_AMT_7d_360all);
    variables.add(acct_cc_d_cnt_dk_160);
    variables.add(v36_login_exces_1h);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(ach_outstd_age);
    variables.add(outstd_iach_count2);
    variables.add(outamt_to_max_cleard);
    variables.add(ip_dof);
    variables.add(Decline_rate_ccbin);
    variables.add(s_v_tx_ratio_num);
    variables.add(s_mp_amt_dk_40);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(billing_shipping_match_level);
    variables.add(max_cross20wRtDclAcc);
    variables.add(ebay_7d_UPI_dk_360all);
    variables.add(added_address_lt_2);
    variables.add(last_name_lowcase);
    variables.add(is_credit_union);
    variables.add(acct_h_s_amt_dk_160);
    variables.add(ebay_ASP_7d_360all);
    variables.add(email_percofnumeric);
    variables.add(v31_ip_hopping_strict);
    variables.add(rt_r8r16_hr);
    variables.add(IP1WRtDolAtoBadTxn);
    variables.add(s_cctrans_complt_amt);
    variables.add(v2_acct_peeking_worst);
    variables.add(cc_num_unknown);
    variables.add(prepaid_bank);
    variables.add(cc_pct_passed_cvv2);
    variables.add(v36_d_sn_prev_login);
    variables.add(s_v_outstd_ratio_num);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(avg_ebay_d_snc_conf_360all);
    variables.add(rt_amt_rate);
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

    if(Bad_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.655730;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.00234375) woeValue = -0.005850;
    else if ( valueDouble > 0.00234375) woeValue = 0.526702;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.461654;
    else if (0 < valueDouble && valueDouble <= 0.0014) woeValue = -0.830387;
    else if (0.0014 < valueDouble && valueDouble <= 0.0016) woeValue = -0.703643;
    else if (0.0016 < valueDouble && valueDouble <= 0.0021) woeValue = -0.578510;
    else if (0.0021 < valueDouble && valueDouble <= 0.0032) woeValue = -0.410658;
    else if (0.0032 < valueDouble && valueDouble <= 0.004) woeValue = -0.096530;
    else if (0.004 < valueDouble && valueDouble <= 0.0053) woeValue = 0.023959;
    else if (0.0053 < valueDouble && valueDouble <= 0.0063) woeValue = 0.171532;
    else if (0.0063 < valueDouble && valueDouble <= 0.0087) woeValue = 0.577551;
    else if (0.0087 < valueDouble && valueDouble <= 0.0105) woeValue = 0.655521;
    else if ( valueDouble > 0.0105) woeValue = 0.867443;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.667978;
    else if (-1e38 < valueDouble && valueDouble <= 0.0183468679) woeValue = -1.703189;
    else if (0.0183468679 < valueDouble && valueDouble <= 0.025794193) woeValue = -1.272147;
    else if (0.025794193 < valueDouble && valueDouble <= 0.0313645334) woeValue = -1.023822;
    else if (0.0313645334 < valueDouble && valueDouble <= 0.0373947842) woeValue = -0.908693;
    else if (0.0373947842 < valueDouble && valueDouble <= 0.0444951922) woeValue = -0.613484;
    else if (0.0444951922 < valueDouble && valueDouble <= 0.0468319559) woeValue = -0.277264;
    else if (0.0468319559 < valueDouble && valueDouble <= 0.0544058369) woeValue = -0.250469;
    else if (0.0544058369 < valueDouble && valueDouble <= 0.0601817369) woeValue = -0.175272;
    else if (0.0601817369 < valueDouble && valueDouble <= 0.0634304207) woeValue = 0.045214;
    else if (0.0634304207 < valueDouble && valueDouble <= 0.0945155821) woeValue = 0.155762;
    else if (0.0945155821 < valueDouble && valueDouble <= 0.0963388755) woeValue = 0.259081;
    else if (0.0963388755 < valueDouble && valueDouble <= 0.1216848674) woeValue = 0.655797;
    else if (0.1216848674 < valueDouble && valueDouble <= 0.2053882726) woeValue = 1.042938;
    else if ( valueDouble > 0.2053882726) woeValue = 1.362096;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.205269;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -0.989358;
    else if (0.0009 < valueDouble && valueDouble <= 0.0012) woeValue = -0.012313;
    else if (0.0012 < valueDouble && valueDouble <= 0.0016) woeValue = 0.057509;
    else if (0.0016 < valueDouble && valueDouble <= 0.002) woeValue = 0.545527;
    else if ( valueDouble > 0.002) woeValue = 1.064511;
    else woeValue = 0;}else if(IP1WRtDolAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.090811;
    else if (0 < valueDouble && valueDouble <= 0.0013) woeValue = -0.019276;
    else if (0.0013 < valueDouble && valueDouble <= 0.0017) woeValue = 0.049380;
    else if ( valueDouble > 0.0017) woeValue = 0.438459;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.403843;
    else if ( valueDouble > 0) woeValue = 0.197426;
    else woeValue = 0;}else if(acct_cc_d_cnt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.323092;
    else if (0 < valueDouble && valueDouble <= 0.0048) woeValue = 1.261267;
    else if (0.0048 < valueDouble && valueDouble <= 0.1348) woeValue = 1.334314;
    else if (0.1348 < valueDouble && valueDouble <= 0.9526) woeValue = 2.162398;
    else if ( valueDouble > 0.9526) woeValue = 2.922125;
    else woeValue = 0;}else if(acct_h_s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.335228;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = 0.517435;
    else if (0.0012 < valueDouble && valueDouble <= 0.0042) woeValue = 0.490283;
    else if (0.0042 < valueDouble && valueDouble <= 0.7024) woeValue = 0.242790;
    else if (0.7024 < valueDouble && valueDouble <= 70.3532) woeValue = 0.031007;
    else if (70.3532 < valueDouble && valueDouble <= 213.0173) woeValue = -0.330090;
    else if (213.0173 < valueDouble && valueDouble <= 268.8728) woeValue = -0.431212;
    else if (268.8728 < valueDouble && valueDouble <= 983.4579) woeValue = -0.459283;
    else if ( valueDouble > 983.4579) woeValue = -0.555775;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11.576379974) woeValue = -0.254706;
    else if (11.576379974 < valueDouble && valueDouble <= 13.120300752) woeValue = -0.105443;
    else if (13.120300752 < valueDouble && valueDouble <= 22.965299685) woeValue = -0.085223;
    else if (22.965299685 < valueDouble && valueDouble <= 39.877906977) woeValue = 0.017604;
    else if (39.877906977 < valueDouble && valueDouble <= 64.993421053) woeValue = 0.125779;
    else if (64.993421053 < valueDouble && valueDouble <= 88.824324324) woeValue = 0.344996;
    else if (88.824324324 < valueDouble && valueDouble <= 130.35365854) woeValue = 0.701069;
    else if (130.35365854 < valueDouble && valueDouble <= 224.33333333) woeValue = 1.063285;
    else if (224.33333333 < valueDouble && valueDouble <= 501.31707317) woeValue = 1.320739;
    else if ( valueDouble > 501.31707317) woeValue = 2.184332;
    else woeValue = 0;}else if(added_address_lt_2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.024875;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.137484;
    else if ( valueDouble > 1) woeValue = 1.145673;
    else woeValue = 0;}else if(avg_ebay_d_snc_conf_360all.getName().equals(varName)){if (value == null) woeValue = 0.090665;
    else if (-1e38 < valueDouble && valueDouble <= 117) woeValue = 0.773071;
    else if (117 < valueDouble && valueDouble <= 223) woeValue = 0.435807;
    else if (223 < valueDouble && valueDouble <= 1477.8333333) woeValue = 0.177611;
    else if (1477.8333333 < valueDouble && valueDouble <= 2031.8) woeValue = -0.052724;
    else if (2031.8 < valueDouble && valueDouble <= 2459.75) woeValue = -0.316654;
    else if (2459.75 < valueDouble && valueDouble <= 3056) woeValue = -0.569102;
    else if ( valueDouble > 3056) woeValue = -0.889743;
    else woeValue = 0;}else if(billing_shipping_match_level.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.562354;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.128038;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.209707;
    else if ( valueDouble > 3) woeValue = -0.411048;
    else woeValue = 0;}else if(cc_num_unknown.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.117340;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.348706;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.915566;
    else if ( valueDouble > 2) woeValue = 1.410602;
    else woeValue = 0;}else if(cc_pct_passed_cvv2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.035768;
    else if (0 < valueDouble && valueDouble <= 0.2352941176) woeValue = -0.045477;
    else if (0.2352941176 < valueDouble && valueDouble <= 0.4) woeValue = -0.314523;
    else if (0.4 < valueDouble && valueDouble <= 0.5) woeValue = -0.780106;
    else if (0.5 < valueDouble && valueDouble <= 0.9230769231) woeValue = -0.789774;
    else if ( valueDouble > 0.9230769231) woeValue = -0.788351;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5255716906) woeValue = -0.289719;
    else if (0.5255716906 < valueDouble && valueDouble <= 0.6334570795) woeValue = -0.253352;
    else if (0.6334570795 < valueDouble && valueDouble <= 0.7724164134) woeValue = -0.137683;
    else if (0.7724164134 < valueDouble && valueDouble <= 1.6161510304) woeValue = 0.096091;
    else if (1.6161510304 < valueDouble && valueDouble <= 2.4831812898) woeValue = 0.128854;
    else if (2.4831812898 < valueDouble && valueDouble <= 2.9796422399) woeValue = 0.332372;
    else if (2.9796422399 < valueDouble && valueDouble <= 3.855141538) woeValue = 0.518565;
    else if ( valueDouble > 3.855141538) woeValue = 0.875306;
    else woeValue = 0;}else if(ebay_7d_UPI_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.326688;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.341355;
    else if (0 < valueDouble && valueDouble <= 4.555241E-21) woeValue = 0.269673;
    else if (4.555241E-21 < valueDouble && valueDouble <= 1.872783E-12) woeValue = 0.616170;
    else if (1.872783E-12 < valueDouble && valueDouble <= 0.0137362129) woeValue = 0.652152;
    else if (0.0137362129 < valueDouble && valueDouble <= 0.2915783179) woeValue = 0.753030;
    else if ( valueDouble > 0.2915783179) woeValue = 1.961667;
    else woeValue = 0;}else if(ebay_ASP_7d_360all.getName().equals(varName)){if (value == null) woeValue = 0.051915;
    else if (-1e38 < valueDouble && valueDouble <= 1.4985) woeValue = -0.925784;
    else if (1.4985 < valueDouble && valueDouble <= 10.8801) woeValue = -0.294319;
    else if (10.8801 < valueDouble && valueDouble <= 36.9867) woeValue = -0.201874;
    else if (36.9867 < valueDouble && valueDouble <= 201.27) woeValue = -0.045239;
    else if (201.27 < valueDouble && valueDouble <= 318.4) woeValue = 0.286069;
    else if ( valueDouble > 318.4) woeValue = 1.055538;
    else woeValue = 0;}else if(ebay_UPI_AMT_7d_360all.getName().equals(varName)){if (value == null) woeValue = 0.326688;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.126381;
    else if ( valueDouble > 0) woeValue = 1.988341;
    else woeValue = 0;}else if(ebay_dy_snc_sus_max_360all.getName().equals(varName)){if (value == null) woeValue = -0.079403;
    else if (-1e38 < valueDouble && valueDouble <= 825) woeValue = 1.732999;
    else if (825 < valueDouble && valueDouble <= 2076) woeValue = 1.203180;
    else if (2076 < valueDouble && valueDouble <= 2899) woeValue = 0.923873;
    else if ( valueDouble > 2899) woeValue = 0.918241;
    else woeValue = 0;}else if(email_MP_dof.getName().equals(varName)){if (value == null) woeValue = 0.237654;
    else if (-1e38 < valueDouble && valueDouble <= 99) woeValue = 0.865920;
    else if (99 < valueDouble && valueDouble <= 238) woeValue = 0.376277;
    else if (238 < valueDouble && valueDouble <= 456) woeValue = 0.302332;
    else if (456 < valueDouble && valueDouble <= 615) woeValue = 0.206745;
    else if (615 < valueDouble && valueDouble <= 1093) woeValue = -0.175756;
    else if (1093 < valueDouble && valueDouble <= 1675) woeValue = -0.335523;
    else if (1675 < valueDouble && valueDouble <= 2735) woeValue = -0.580902;
    else if (2735 < valueDouble && valueDouble <= 3077) woeValue = -0.703279;
    else if (3077 < valueDouble && valueDouble <= 3352) woeValue = -0.871125;
    else if ( valueDouble > 3352) woeValue = -1.046402;
    else woeValue = 0;}else if(email_percofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.094247;
    else if (0 < valueDouble && valueDouble <= 0.1818181818) woeValue = 0.249644;
    else if (0.1818181818 < valueDouble && valueDouble <= 0.5) woeValue = 0.136403;
    else if ( valueDouble > 0.5) woeValue = -0.260414;
    else woeValue = 0;}else if(ip_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = 0.436587;
    else if (4 < valueDouble && valueDouble <= 130) woeValue = 0.174874;
    else if (130 < valueDouble && valueDouble <= 209) woeValue = -0.092362;
    else if (209 < valueDouble && valueDouble <= 274) woeValue = -0.260306;
    else if (274 < valueDouble && valueDouble <= 320) woeValue = -0.334181;
    else if (320 < valueDouble && valueDouble <= 573) woeValue = -0.428232;
    else if (573 < valueDouble && valueDouble <= 1007) woeValue = -0.696829;
    else if ( valueDouble > 1007) woeValue = -1.154399;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.048699;
    else if ( valueDouble > 0) woeValue = -0.362950;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.132621;
    else if ( valueDouble > 0) woeValue = 0.969208;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.029) woeValue = -1.250982;
    else if (0.029 < valueDouble && valueDouble <= 0.0295) woeValue = -0.896363;
    else if (0.0295 < valueDouble && valueDouble <= 0.0299) woeValue = -0.655542;
    else if (0.0299 < valueDouble && valueDouble <= 0.0405) woeValue = -0.454014;
    else if (0.0405 < valueDouble && valueDouble <= 0.0559) woeValue = 0.020591;
    else if (0.0559 < valueDouble && valueDouble <= 0.0701) woeValue = 0.318434;
    else if (0.0701 < valueDouble && valueDouble <= 0.2688) woeValue = 0.669829;
    else if (0.2688 < valueDouble && valueDouble <= 0.4) woeValue = 1.174951;
    else if ( valueDouble > 0.4) woeValue = 1.383457;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.9403862301) woeValue = -0.341440;
    else if (0.9403862301 < valueDouble && valueDouble <= 1.5984761905) woeValue = -0.121186;
    else if (1.5984761905 < valueDouble && valueDouble <= 1.8524488531) woeValue = -0.092288;
    else if (1.8524488531 < valueDouble && valueDouble <= 2.654097646) woeValue = 0.208428;
    else if (2.654097646 < valueDouble && valueDouble <= 3.3371394231) woeValue = 0.690303;
    else if (3.3371394231 < valueDouble && valueDouble <= 4.5099502488) woeValue = 0.898282;
    else if (4.5099502488 < valueDouble && valueDouble <= 6.945) woeValue = 1.170124;
    else if (6.945 < valueDouble && valueDouble <= 15.247476671) woeValue = 1.483571;
    else if ( valueDouble > 15.247476671) woeValue = 2.881536;
    else woeValue = 0;}else if(outstd_iach_count2.getName().equals(varName)){if (value == null) woeValue = 2.467114;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = -0.322266;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.007478;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.222802;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.434928;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 0.921684;
    else if (8 < valueDouble && valueDouble <= 12) woeValue = 1.370964;
    else if ( valueDouble > 12) woeValue = 2.202623;
    else woeValue = 0;}else if(prepaid_bank.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.005155;
    else if ( valueDouble > 0) woeValue = 0.729605;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.221684;
    else if (-1e38 < valueDouble && valueDouble <= 0.0999901584) woeValue = -0.579176;
    else if (0.0999901584 < valueDouble && valueDouble <= 0.1141751042) woeValue = -0.521001;
    else if (0.1141751042 < valueDouble && valueDouble <= 0.2429667519) woeValue = -0.494121;
    else if (0.2429667519 < valueDouble && valueDouble <= 0.6428461182) woeValue = -0.363360;
    else if (0.6428461182 < valueDouble && valueDouble <= 0.9666565164) woeValue = -0.173972;
    else if (0.9666565164 < valueDouble && valueDouble <= 6.7547956631) woeValue = 0.335782;
    else if (6.7547956631 < valueDouble && valueDouble <= 12.559766764) woeValue = 0.543237;
    else if ( valueDouble > 12.559766764) woeValue = 0.695136;
    else woeValue = 0;}else if(rt_amt_rate.getName().equals(varName)){if (value == null) woeValue = -0.133803;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.548098;
    else if (0 < valueDouble && valueDouble <= 0.068) woeValue = -1.463612;
    else if (0.068 < valueDouble && valueDouble <= 0.316) woeValue = -1.052015;
    else if (0.316 < valueDouble && valueDouble <= 0.516) woeValue = -0.945645;
    else if (0.516 < valueDouble && valueDouble <= 0.571) woeValue = -0.885517;
    else if (0.571 < valueDouble && valueDouble <= 0.878) woeValue = -0.703787;
    else if (0.878 < valueDouble && valueDouble <= 0.968) woeValue = -0.236873;
    else if (0.968 < valueDouble && valueDouble <= 1.082) woeValue = -0.108800;
    else if (1.082 < valueDouble && valueDouble <= 1.336) woeValue = -0.094049;
    else if (1.336 < valueDouble && valueDouble <= 1.475) woeValue = 0.007528;
    else if (1.475 < valueDouble && valueDouble <= 2.285) woeValue = 0.458109;
    else if (2.285 < valueDouble && valueDouble <= 2.394) woeValue = 0.567137;
    else if (2.394 < valueDouble && valueDouble <= 3.475) woeValue = 0.775650;
    else if ( valueDouble > 3.475) woeValue = 0.915337;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.062665;
    else if (0 < valueDouble && valueDouble <= 0.159) woeValue = -0.183351;
    else if (0.159 < valueDouble && valueDouble <= 0.5) woeValue = -0.020997;
    else if ( valueDouble > 0.5) woeValue = 0.799466;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.199019;
    else if (0 < valueDouble && valueDouble <= 2165) woeValue = 0.538649;
    else if (2165 < valueDouble && valueDouble <= 4175) woeValue = 0.247849;
    else if (4175 < valueDouble && valueDouble <= 5362) woeValue = 0.178794;
    else if (5362 < valueDouble && valueDouble <= 67673) woeValue = 0.087668;
    else if (67673 < valueDouble && valueDouble <= 134224) woeValue = -0.034079;
    else if (134224 < valueDouble && valueDouble <= 219666) woeValue = -0.183041;
    else if (219666 < valueDouble && valueDouble <= 381433) woeValue = -0.392264;
    else if ( valueDouble > 381433) woeValue = -0.632990;
    else woeValue = 0;}else if(s_mp_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.160297;
    else if (0 < valueDouble && valueDouble <= 767.1346) woeValue = -0.716010;
    else if (767.1346 < valueDouble && valueDouble <= 1428.4261) woeValue = -0.674187;
    else if (1428.4261 < valueDouble && valueDouble <= 2503.8875) woeValue = -0.565245;
    else if (2503.8875 < valueDouble && valueDouble <= 3374.6386) woeValue = -0.473755;
    else if (3374.6386 < valueDouble && valueDouble <= 6813.4088) woeValue = -0.238117;
    else if (6813.4088 < valueDouble && valueDouble <= 11183.727) woeValue = 0.280397;
    else if (11183.727 < valueDouble && valueDouble <= 24754.8658) woeValue = 0.620048;
    else if ( valueDouble > 24754.8658) woeValue = 2.446428;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.130395;
    else if (0 < valueDouble && valueDouble <= 0.0362309579) woeValue = 0.106300;
    else if (0.0362309579 < valueDouble && valueDouble <= 0.2945748283) woeValue = 0.649988;
    else if (0.2945748283 < valueDouble && valueDouble <= 0.6519154363) woeValue = 1.242879;
    else if ( valueDouble > 0.6519154363) woeValue = 1.955919;
    else woeValue = 0;}else if(s_v_outstd_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1967213115) woeValue = -0.441305;
    else if (0.1967213115 < valueDouble && valueDouble <= 0.2461538462) woeValue = -0.313276;
    else if (0.2461538462 < valueDouble && valueDouble <= 0.3314285714) woeValue = -0.284884;
    else if (0.3314285714 < valueDouble && valueDouble <= 0.4971428571) woeValue = 0.056998;
    else if (0.4971428571 < valueDouble && valueDouble <= 0.6666666667) woeValue = 0.396924;
    else if (0.6666666667 < valueDouble && valueDouble <= 0.976744186) woeValue = 0.881131;
    else if (0.976744186 < valueDouble && valueDouble <= 1) woeValue = 0.979746;
    else if (1 < valueDouble && valueDouble <= 1.9545454545) woeValue = 1.349532;
    else if (1.9545454545 < valueDouble && valueDouble <= 3) woeValue = 1.431121;
    else if ( valueDouble > 3) woeValue = 2.574818;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6363636364) woeValue = 2.768050;
    else if (0.6363636364 < valueDouble && valueDouble <= 0.75) woeValue = 1.941870;
    else if (0.75 < valueDouble && valueDouble <= 0.8457943925) woeValue = 1.287818;
    else if (0.8457943925 < valueDouble && valueDouble <= 0.8917975567) woeValue = 0.896458;
    else if (0.8917975567 < valueDouble && valueDouble <= 0.9208633094) woeValue = 0.446537;
    else if (0.9208633094 < valueDouble && valueDouble <= 0.9316239316) woeValue = 0.435509;
    else if (0.9316239316 < valueDouble && valueDouble <= 0.9483870968) woeValue = 0.246299;
    else if (0.9483870968 < valueDouble && valueDouble <= 0.9615384615) woeValue = 0.004020;
    else if (0.9615384615 < valueDouble && valueDouble <= 0.9672131148) woeValue = -0.156663;
    else if ( valueDouble > 0.9672131148) woeValue = -0.515047;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.647762;
    else if ( valueDouble > 0) woeValue = -0.584897;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.629537;
    else if (-1e38 < valueDouble && valueDouble <= 28.899664352) woeValue = -0.267361;
    else if (28.899664352 < valueDouble && valueDouble <= 47.402222222) woeValue = -0.093725;
    else if (47.402222222 < valueDouble && valueDouble <= 57.924953704) woeValue = 0.159280;
    else if (57.924953704 < valueDouble && valueDouble <= 88.885740741) woeValue = 0.366220;
    else if (88.885740741 < valueDouble && valueDouble <= 110.9305787) woeValue = 0.526669;
    else if (110.9305787 < valueDouble && valueDouble <= 145.52409722) woeValue = 0.675101;
    else if ( valueDouble > 145.52409722) woeValue = 0.824121;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = -0.094640;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.573522;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.589237;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.072294;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.424776;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.828482;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 1.102073;
    else if ( valueDouble > 5) woeValue = 2.568785;
    else woeValue = 0;}else if(wach_n_checking.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.260046;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.131744;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.337790;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.836759;
    else if ( valueDouble > 3) woeValue = 1.307177;
    else woeValue = 0;}else if(v2_acct_peeking_worst.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "PEEKING_GOOD"," ").contains(value)) woeValue = -0.092228;
    else if (Arrays.asList( "NO_PEEKING").contains(value)) woeValue = -0.085551;
    else if (Arrays.asList( "PEEKING_EVIL").contains(value)) woeValue = 0.201954;
    else if (Arrays.asList( "PEEKING_MED").contains(value)) woeValue = 0.351036;
    else if (Arrays.asList( "PEEKING_UNKNOWN","PEEKING_BAD","PEEKING_EXCELLENT").contains(value)) woeValue = 0.667919;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0;
    else if (Arrays.asList( "NO_HOPPING"," ").contains(value)) woeValue = -0.197710;
    else if (Arrays.asList( "IP_HOP_1","IP_HOPPING_2").contains(value)) woeValue = 0.343445;
    else if (Arrays.asList( "CITY_HOPPING_2","CTRY_HOPPING_2","STATE_HOPPING_2").contains(value)) woeValue = 1.002323;
    else if (Arrays.asList( "CITY_HOPPING_GT2","IP_HOPPING_GT2","CTRY_HOPPING_GT2").contains(value)) woeValue = 1.474335;
    else if (Arrays.asList( "STATE_HOPPING_EXCESSIVE","CTRY_HOPPING_EXCESSIVE","STATE_HOPPING_GT2").contains(value)) woeValue = 2.593607;
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
    
    coeffMap.put("Intercept",+6.01946446);
    coeffMap.put(acct_cc_d_cnt_dk_160.getName(),-0.31194320);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.35912073);
    coeffMap.put(outstd_iach_count2.getName(),-0.34426179);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.38205256);
    coeffMap.put(s_v_outstd_ratio_num.getName(),-0.24756579);
    coeffMap.put(v36_login_exces_1h.getName(),-0.33226311);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.48395415);
    coeffMap.put(acct_h_s_amt_dk_160.getName(),-0.94350360);
    coeffMap.put(s_mp_amt_dk_40.getName(),-0.23291563);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.36866346);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.33692855);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.38046553);
    coeffMap.put(ach_outstd_age.getName(),-0.23324992);
    coeffMap.put(rt_amt_rate.getName(),-0.35998341);
    coeffMap.put(ebay_7d_UPI_dk_360all.getName(),-0.62888610);
    coeffMap.put(email_MP_dof.getName(),-0.30971226);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.55766828);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.20390258);
    coeffMap.put(billing_shipping_match_level.getName(),-0.56169845);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.47461418);
    coeffMap.put(ebay_UPI_AMT_7d_360all.getName(),+0.18176987);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.89060443);
    coeffMap.put(last_name_lowcase.getName(),-0.48799881);
    coeffMap.put(avg_ebay_d_snc_conf_360all.getName(),-0.32671240);
    coeffMap.put(ebay_dy_snc_sus_max_360all.getName(),-0.44526523);
    coeffMap.put(wach_n_checking.getName(),-0.78324932);
    coeffMap.put(rt_r8r16_hr.getName(),-0.67999786);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.48447206);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.51200636);
    coeffMap.put(cc_num_unknown.getName(),-0.34781745);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.26785725);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.23010238);
    coeffMap.put(ip_dof.getName(),-0.47734336);
    coeffMap.put(Bad_rate_ccbin.getName(),-0.42106618);
    coeffMap.put(ebay_ASP_7d_360all.getName(),-0.53095863);
    coeffMap.put(added_address_lt_2.getName(),-0.38848680);
    coeffMap.put(v2_acct_peeking_worst.getName(),-0.68530108);
    coeffMap.put(cc_pct_passed_cvv2.getName(),-0.49362251);
    coeffMap.put(email_percofnumeric.getName(),-0.54252768);
    coeffMap.put(is_credit_union.getName(),-0.65915497);
    coeffMap.put(IP1WRtDolAtoBadTxn.getName(),-0.65497777);
    coeffMap.put(prepaid_bank.getName(),-0.27670404);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 855.64997008;
  }

  @Override
  public double getCoeff2() {
    return  -59.61211361;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT6;
  }
  
}