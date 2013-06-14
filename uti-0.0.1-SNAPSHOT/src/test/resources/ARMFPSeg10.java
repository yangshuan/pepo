package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg10 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(days_snc_last_achtxn);
    variables.add(billing_shipping_state_match);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(IP4WRtCcXbrBadAcc);
    variables.add(v21_ip_ph_geo_worst);
    variables.add(email_MP_7d_UPIamt_dk);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(nach_failed_amt_avg);
    variables.add(txnsnt_amt_min_lst_48_hrs);
    variables.add(s_trans_ip3_tof_t_v2);
    variables.add(s_ach_cleared_count);
    variables.add(CC_CNT);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(num_logins_3_days);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(num_logins_30_days);
    variables.add(c_cc_num_amex);
    variables.add(MOA_V_MOALife);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(seen_same_bankid_90d_ago);
    variables.add(rt_num_rate);
    variables.add(s_amt_dk_5);
    variables.add(email_MP_10d_txn_dk);
    variables.add(ach_dof_age);
    variables.add(s_visitor_id_tof);
    variables.add(rcvr_cc_d_cnt_dk_160);
    variables.add(wach_n_inactive);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(added_ach_lt_1);
    variables.add(email_numofnumeric);
    variables.add(p90_dys_return_nsf);
    variables.add(s_vid_max_dof);
    variables.add(num_phone);
    variables.add(primarycc_dof);
    variables.add(s2r_txnsnt_cnt_stss_lst_72_hrs);
    variables.add(ratio_login_failed_30_days);
    variables.add(ncc_failed_ratio);
    variables.add(nach_amt_max_ratio);


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

    if(CC_CNT.getName().equals(varName)){if (value == null) woeValue = 0.031231;
    else if (-1e38 < valueDouble && valueDouble <= 97457) woeValue = -0.154212;
    else if (97457 < valueDouble && valueDouble <= 286682) woeValue = -0.097320;
    else if (286682 < valueDouble && valueDouble <= 398486) woeValue = 0.334800;
    else if ( valueDouble > 398486) woeValue = 0.389804;
    else woeValue = 0;}else if(IP4WRtCcXbrBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.110460;
    else if (0 < valueDouble && valueDouble <= 0.0011) woeValue = -0.190566;
    else if (0.0011 < valueDouble && valueDouble <= 0.0014) woeValue = -0.143178;
    else if ( valueDouble > 0.0014) woeValue = -0.083612;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.013105;
    else if ( valueDouble > 0) woeValue = 1.904345;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.4249796629) woeValue = -0.108778;
    else if (0.4249796629 < valueDouble && valueDouble <= 0.5534330313) woeValue = 0.007243;
    else if (0.5534330313 < valueDouble && valueDouble <= 0.6128778057) woeValue = 0.093480;
    else if (0.6128778057 < valueDouble && valueDouble <= 0.7933678814) woeValue = 0.197274;
    else if (0.7933678814 < valueDouble && valueDouble <= 0.9345587237) woeValue = 0.474751;
    else if (0.9345587237 < valueDouble && valueDouble <= 1.0977029619) woeValue = 0.861727;
    else if ( valueDouble > 1.0977029619) woeValue = 1.300519;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.324130;
    else if ( valueDouble > 0) woeValue = 0.368844;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 61.9006) woeValue = 1.616041;
    else if (61.9006 < valueDouble && valueDouble <= 164.1115) woeValue = 1.190484;
    else if (164.1115 < valueDouble && valueDouble <= 442.2999) woeValue = 0.885277;
    else if (442.2999 < valueDouble && valueDouble <= 798.4716) woeValue = 0.588225;
    else if (798.4716 < valueDouble && valueDouble <= 1396.3254) woeValue = 0.399992;
    else if (1396.3254 < valueDouble && valueDouble <= 1632.9486) woeValue = 0.257897;
    else if (1632.9486 < valueDouble && valueDouble <= 2620.8688) woeValue = 0.043436;
    else if (2620.8688 < valueDouble && valueDouble <= 2903.3782) woeValue = 0.018339;
    else if (2903.3782 < valueDouble && valueDouble <= 4174.4413) woeValue = -0.103680;
    else if (4174.4413 < valueDouble && valueDouble <= 8660.2154) woeValue = -0.338511;
    else if ( valueDouble > 8660.2154) woeValue = -0.423923;
    else woeValue = 0;}else if(ach_dof_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0018987342) woeValue = 3.126668;
    else if (0.0018987342 < valueDouble && valueDouble <= 0.1823899371) woeValue = 2.592755;
    else if (0.1823899371 < valueDouble && valueDouble <= 0.3501113586) woeValue = 1.163875;
    else if (0.3501113586 < valueDouble && valueDouble <= 0.7042325344) woeValue = 0.261731;
    else if (0.7042325344 < valueDouble && valueDouble <= 0.9748691099) woeValue = -0.253267;
    else if (0.9748691099 < valueDouble && valueDouble <= 0.9986091794) woeValue = -0.442858;
    else if ( valueDouble > 0.9986091794) woeValue = -0.511912;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.044389;
    else if ( valueDouble > 0) woeValue = 1.860413;
    else woeValue = 0;}else if(billing_shipping_state_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.082824;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.303406;
    else if ( valueDouble > 1) woeValue = 0.089054;
    else woeValue = 0;}else if(c_cc_num_amex.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.034421;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.788940;
    else if ( valueDouble > 1) woeValue = 0.408145;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.048605;
    else if (0 < valueDouble && valueDouble <= 5) woeValue = -0.505041;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = -0.457461;
    else if (6 < valueDouble && valueDouble <= 10) woeValue = -0.314468;
    else if (10 < valueDouble && valueDouble <= 11) woeValue = -0.272146;
    else if (11 < valueDouble && valueDouble <= 14) woeValue = -0.204425;
    else if (14 < valueDouble && valueDouble <= 18) woeValue = 0.035990;
    else if (18 < valueDouble && valueDouble <= 21) woeValue = 0.201534;
    else if (21 < valueDouble && valueDouble <= 24) woeValue = 0.391731;
    else if (24 < valueDouble && valueDouble <= 28) woeValue = 0.517926;
    else if (28 < valueDouble && valueDouble <= 56) woeValue = 0.930136;
    else if ( valueDouble > 56) woeValue = 1.544977;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.603417;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.164221;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.538661;
    else if ( valueDouble > 1) woeValue = 1.023273;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.037802;
    else if (-1e38 < valueDouble && valueDouble <= 1683) woeValue = 1.119599;
    else if (1683 < valueDouble && valueDouble <= 2228) woeValue = 0.917359;
    else if (2228 < valueDouble && valueDouble <= 2551.2) woeValue = 0.395390;
    else if (2551.2 < valueDouble && valueDouble <= 3479) woeValue = 0.159348;
    else if (3479 < valueDouble && valueDouble <= 3654) woeValue = -0.149093;
    else if ( valueDouble > 3654) woeValue = -1.238433;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.067696;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 1.384942;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = 0.848520;
    else if (4 < valueDouble && valueDouble <= 14) woeValue = 0.452565;
    else if (14 < valueDouble && valueDouble <= 394) woeValue = 0.204102;
    else if ( valueDouble > 394) woeValue = -0.031884;
    else woeValue = 0;}else if(email_MP_10d_txn_dk.getName().equals(varName)){if (value == null) woeValue = 0.479276;
    else if (-1e38 < valueDouble && valueDouble <= 0.0042990783) woeValue = 0.541418;
    else if (0.0042990783 < valueDouble && valueDouble <= 0.0608176404) woeValue = 0.329850;
    else if (0.0608176404 < valueDouble && valueDouble <= 0.2332595866) woeValue = -0.000419;
    else if (0.2332595866 < valueDouble && valueDouble <= 0.697231426) woeValue = -0.167123;
    else if (0.697231426 < valueDouble && valueDouble <= 1.1454261452) woeValue = -0.275621;
    else if (1.1454261452 < valueDouble && valueDouble <= 1.3789971608) woeValue = -0.431771;
    else if (1.3789971608 < valueDouble && valueDouble <= 1.5106524752) woeValue = -0.503163;
    else if (1.5106524752 < valueDouble && valueDouble <= 2.1455830022) woeValue = -0.630677;
    else if (2.1455830022 < valueDouble && valueDouble <= 3.0562602681) woeValue = -0.695239;
    else if (3.0562602681 < valueDouble && valueDouble <= 5.6108141925) woeValue = -0.824115;
    else if ( valueDouble > 5.6108141925) woeValue = -0.952130;
    else woeValue = 0;}else if(email_MP_7d_UPIamt_dk.getName().equals(varName)){if (value == null) woeValue = 0.479276;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.338014;
    else if (0 < valueDouble && valueDouble <= 8.969178E-18) woeValue = 0.060266;
    else if (8.969178E-18 < valueDouble && valueDouble <= 0.9919650468) woeValue = 0.292414;
    else if ( valueDouble > 0.9919650468) woeValue = 0.492886;
    else woeValue = 0;}else if(email_numofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.071606;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = 0.280094;
    else if ( valueDouble > 4) woeValue = 0.021106;
    else woeValue = 0;}else if(nach_amt_max_ratio.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0250240995) woeValue = -0.218186;
    else if (0.0250240995 < valueDouble && valueDouble <= 0.0397096699) woeValue = -0.214202;
    else if (0.0397096699 < valueDouble && valueDouble <= 0.0595118689) woeValue = -0.180961;
    else if (0.0595118689 < valueDouble && valueDouble <= 0.1576198766) woeValue = -0.051067;
    else if (0.1576198766 < valueDouble && valueDouble <= 0.2883651051) woeValue = 0.221090;
    else if (0.2883651051 < valueDouble && valueDouble <= 0.4644717022) woeValue = 0.315920;
    else if (0.4644717022 < valueDouble && valueDouble <= 0.8492834225) woeValue = 0.559899;
    else if ( valueDouble > 0.8492834225) woeValue = 0.932642;
    else woeValue = 0;}else if(nach_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = -0.094250;
    else if (-1e38 < valueDouble && valueDouble <= 419) woeValue = 1.013407;
    else if (419 < valueDouble && valueDouble <= 1917) woeValue = 0.856195;
    else if (1917 < valueDouble && valueDouble <= 6218) woeValue = 0.558775;
    else if (6218 < valueDouble && valueDouble <= 39309.666667) woeValue = 0.390246;
    else if ( valueDouble > 39309.666667) woeValue = -0.059093;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.002480;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.180421;
    else if (0 < valueDouble && valueDouble <= 0.0078328982) woeValue = -0.977780;
    else if (0.0078328982 < valueDouble && valueDouble <= 0.0374331551) woeValue = -0.401009;
    else if (0.0374331551 < valueDouble && valueDouble <= 0.0588235294) woeValue = 0.097843;
    else if (0.0588235294 < valueDouble && valueDouble <= 0.2307692308) woeValue = 0.249443;
    else if (0.2307692308 < valueDouble && valueDouble <= 0.5) woeValue = 0.461790;
    else if ( valueDouble > 0.5) woeValue = 0.789638;
    else woeValue = 0;}else if(num_logins_30_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.702796;
    else if (0 < valueDouble && valueDouble <= 35) woeValue = -0.089161;
    else if (35 < valueDouble && valueDouble <= 75) woeValue = 0.067160;
    else if ( valueDouble > 75) woeValue = 1.034112;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.096912;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = -0.214095;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = -0.066278;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.126365;
    else if (6 < valueDouble && valueDouble <= 9) woeValue = 0.173876;
    else if (9 < valueDouble && valueDouble <= 14) woeValue = 0.455784;
    else if ( valueDouble > 14) woeValue = 1.273094;
    else woeValue = 0;}else if(num_phone.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.272541;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.102770;
    else if ( valueDouble > 1) woeValue = 0.164833;
    else woeValue = 0;}else if(p90_dys_return_nsf.getName().equals(varName)){if (value == null) woeValue = -1.654798;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = 0.720770;
    else if ( valueDouble > 3) woeValue = -0.106930;
    else woeValue = 0;}else if(primarycc_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.017216;
    else if (-1 < valueDouble && valueDouble <= 21) woeValue = 1.419719;
    else if (21 < valueDouble && valueDouble <= 81) woeValue = 0.724133;
    else if (81 < valueDouble && valueDouble <= 140) woeValue = 0.400798;
    else if (140 < valueDouble && valueDouble <= 337) woeValue = 0.185873;
    else if (337 < valueDouble && valueDouble <= 781) woeValue = -0.008152;
    else if (781 < valueDouble && valueDouble <= 1366) woeValue = -0.225138;
    else if (1366 < valueDouble && valueDouble <= 2152) woeValue = -0.463531;
    else if ( valueDouble > 2152) woeValue = -0.615132;
    else woeValue = 0;}else if(ratio_login_failed_30_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.035567;
    else if (0 < valueDouble && valueDouble <= 0.2143) woeValue = -0.091775;
    else if (0.2143 < valueDouble && valueDouble <= 0.25) woeValue = 0.202398;
    else if (0.25 < valueDouble && valueDouble <= 0.4884) woeValue = 0.302942;
    else if ( valueDouble > 0.4884) woeValue = 0.936980;
    else woeValue = 0;}else if(rcvr_cc_d_cnt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.327540;
    else if (0 < valueDouble && valueDouble <= 0.0008) woeValue = -0.612416;
    else if (0.0008 < valueDouble && valueDouble <= 2.0536) woeValue = -0.313811;
    else if (2.0536 < valueDouble && valueDouble <= 2.5127) woeValue = -0.105029;
    else if (2.5127 < valueDouble && valueDouble <= 9.385) woeValue = 0.061527;
    else if (9.385 < valueDouble && valueDouble <= 20.8543) woeValue = 0.358861;
    else if (20.8543 < valueDouble && valueDouble <= 932.1726) woeValue = 0.421241;
    else if ( valueDouble > 932.1726) woeValue = 0.946211;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0.103372;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.422307;
    else if (0 < valueDouble && valueDouble <= 0.003) woeValue = -0.614625;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -0.566881;
    else if (0.004 < valueDouble && valueDouble <= 0.006) woeValue = -0.304418;
    else if (0.006 < valueDouble && valueDouble <= 0.01) woeValue = -0.143908;
    else if (0.01 < valueDouble && valueDouble <= 0.012) woeValue = 0.086696;
    else if (0.012 < valueDouble && valueDouble <= 0.015) woeValue = 0.202032;
    else if (0.015 < valueDouble && valueDouble <= 0.024) woeValue = 0.797941;
    else if ( valueDouble > 0.024) woeValue = 0.917030;
    else woeValue = 0;}else if(s2r_txnsnt_cnt_stss_lst_72_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.073643;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.156572;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.559590;
    else if ( valueDouble > 2) woeValue = 1.301943;
    else woeValue = 0;}else if(s_ach_cleared_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 33) woeValue = 0.605829;
    else if (33 < valueDouble && valueDouble <= 39) woeValue = 0.409794;
    else if (39 < valueDouble && valueDouble <= 60) woeValue = 0.347324;
    else if (60 < valueDouble && valueDouble <= 81) woeValue = 0.181018;
    else if (81 < valueDouble && valueDouble <= 88) woeValue = 0.103844;
    else if (88 < valueDouble && valueDouble <= 92) woeValue = 0.098200;
    else if (92 < valueDouble && valueDouble <= 138) woeValue = -0.069891;
    else if (138 < valueDouble && valueDouble <= 145) woeValue = -0.235317;
    else if (145 < valueDouble && valueDouble <= 153) woeValue = -0.411643;
    else if (153 < valueDouble && valueDouble <= 203) woeValue = -0.419444;
    else if (203 < valueDouble && valueDouble <= 233) woeValue = -0.438971;
    else if (233 < valueDouble && valueDouble <= 304) woeValue = -0.537211;
    else if (304 < valueDouble && valueDouble <= 633) woeValue = -0.820644;
    else if ( valueDouble > 633) woeValue = -1.976605;
    else woeValue = 0;}else if(s_amt_dk_5.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.128804;
    else if (0 < valueDouble && valueDouble <= 7.2107) woeValue = -0.486705;
    else if (7.2107 < valueDouble && valueDouble <= 91.958) woeValue = -0.234603;
    else if (91.958 < valueDouble && valueDouble <= 164.1556) woeValue = -0.058621;
    else if (164.1556 < valueDouble && valueDouble <= 3256.6137) woeValue = -0.035728;
    else if (3256.6137 < valueDouble && valueDouble <= 6948.6065) woeValue = 0.016447;
    else if (6948.6065 < valueDouble && valueDouble <= 12349.5959) woeValue = 0.173952;
    else if ( valueDouble > 12349.5959) woeValue = 1.035368;
    else woeValue = 0;}else if(s_trans_ip3_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 10454914) woeValue = 0.125920;
    else if (10454914 < valueDouble && valueDouble <= 17885820) woeValue = -0.033442;
    else if (17885820 < valueDouble && valueDouble <= 32058488) woeValue = -0.149873;
    else if (32058488 < valueDouble && valueDouble <= 119858097) woeValue = -0.278336;
    else if ( valueDouble > 119858097) woeValue = -0.517548;
    else woeValue = 0;}else if(s_vid_max_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 261) woeValue = 1.019232;
    else if (261 < valueDouble && valueDouble <= 712) woeValue = 0.315341;
    else if (712 < valueDouble && valueDouble <= 1180) woeValue = 0.060416;
    else if (1180 < valueDouble && valueDouble <= 1570) woeValue = 0.002183;
    else if (1570 < valueDouble && valueDouble <= 1873) woeValue = -0.032885;
    else if (1873 < valueDouble && valueDouble <= 2242) woeValue = -0.119689;
    else if (2242 < valueDouble && valueDouble <= 2533) woeValue = -0.194062;
    else if ( valueDouble > 2533) woeValue = -0.319597;
    else woeValue = 0;}else if(s_visitor_id_tof.getName().equals(varName)){if (value == null) woeValue = -0.047229;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.503298;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.552082;
    else if (1 < valueDouble && valueDouble <= 23) woeValue = 0.500112;
    else if (23 < valueDouble && valueDouble <= 307) woeValue = 0.114218;
    else if (307 < valueDouble && valueDouble <= 940) woeValue = -0.154912;
    else if ( valueDouble > 940) woeValue = -0.518589;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 2.053006;
    else if ( valueDouble > 0) woeValue = -0.405151;
    else woeValue = 0;}else if(seen_same_bankid_90d_ago.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 2.426884;
    else if ( valueDouble > 0) woeValue = -0.382847;
    else woeValue = 0;}else if(txnsnt_amt_min_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.066903;
    else if (-1 < valueDouble && valueDouble <= 5) woeValue = 1.092520;
    else if (5 < valueDouble && valueDouble <= 13.33) woeValue = 0.731750;
    else if ( valueDouble > 13.33) woeValue = 0.691477;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.446116;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.997990;
    else if ( valueDouble > 1) woeValue = 1.489094;
    else woeValue = 0;}else if(v21_ip_ph_geo_worst.getName().equals(varName)){if (Arrays.asList( "STATE_MATCH","MM_ERROR","COUNTRY_MATCH").contains(value)) woeValue = -0.039078;
    else if (Arrays.asList( "NO_MATCH"," ","NO_PHONES","OTHER").contains(value)) woeValue = 0.140294;
    else if (Arrays.asList( "CITY_MATCH").contains(value)) woeValue = 1.051297;
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
    
    coeffMap.put("Intercept",+8.75177017);
    coeffMap.put(ach_dof_age.getName(),-0.65649967);
    coeffMap.put(seen_same_bankid_90d_ago.getName(),-0.24063003);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.43954403);
    coeffMap.put(wach_n_inactive.getName(),-0.70850357);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.61192407);
    coeffMap.put(email_MP_10d_txn_dk.getName(),-0.29853504);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.35154474);
    coeffMap.put(rt_num_rate.getName(),-0.44937673);
    coeffMap.put(num_logins_3_days.getName(),-0.34886711);
    coeffMap.put(s_ach_cleared_count.getName(),-0.42359398);
    coeffMap.put(email_MP_7d_UPIamt_dk.getName(),-0.15805010);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.41241378);
    coeffMap.put(num_logins_30_days.getName(),-0.28104126);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.49544529);
    coeffMap.put(p90_dys_return_nsf.getName(),-0.74546492);
    coeffMap.put(MOA_V_MOALife.getName(),-0.63559520);
    coeffMap.put(s_amt_dk_5.getName(),-0.61728513);
    coeffMap.put(rcvr_cc_d_cnt_dk_160.getName(),-0.38006991);
    coeffMap.put(added_ach_lt_1.getName(),-0.41622904);
    coeffMap.put(nach_amt_max_ratio.getName(),-0.37851240);
    coeffMap.put(s2r_txnsnt_cnt_stss_lst_72_hrs.getName(),-0.17614107);
    coeffMap.put(s_vid_max_dof.getName(),-0.78832060);
    coeffMap.put(nach_failed_amt_avg.getName(),-0.70885845);
    coeffMap.put(txnsnt_amt_min_lst_48_hrs.getName(),-0.45631197);
    coeffMap.put(primarycc_dof.getName(),-0.57098898);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-0.77969301);
    coeffMap.put(ratio_login_failed_30_days.getName(),-0.45228358);
    coeffMap.put(ncc_failed_ratio.getName(),-0.46209865);
    coeffMap.put(s_trans_ip3_tof_t_v2.getName(),-0.87025657);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.92994023);
    coeffMap.put(c_cc_num_amex.getName(),-0.35909163);
    coeffMap.put(billing_shipping_state_match.getName(),-0.70928643);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.26485403);
    coeffMap.put(s_visitor_id_tof.getName(),-0.68603565);
    coeffMap.put(email_numofnumeric.getName(),-0.75326906);
    coeffMap.put(num_phone.getName(),-1.12159940);
    coeffMap.put(v21_ip_ph_geo_worst.getName(),-0.56714237);
    coeffMap.put(IP4WRtCcXbrBadAcc.getName(),-1.04631034);
    coeffMap.put(CC_CNT.getName(),-0.77309592);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 834.98856799;
  }

  @Override
  public double getCoeff2() {
    return  -56.15894887;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT10;
  }
  
}