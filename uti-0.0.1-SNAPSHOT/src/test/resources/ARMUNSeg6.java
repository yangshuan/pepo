package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg6 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(email_numofletter);
    variables.add(MOA_V_MOALife);
    variables.add(ED1WRtDolDclTxn);
    variables.add(cc_pct_credit_v2);
    variables.add(v36_login_exces_1h);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(ach_outstd_age);
    variables.add(ip_dof);
    variables.add(Decline_rate_ccbin);
    variables.add(s_mp_amt_dk_40);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(billing_shipping_match_level);
    variables.add(max_cross20wRtDclAcc);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(CP20WRtAtoBadTxn);
    variables.add(last_name_lowcase);
    variables.add(acct_cc_d_cnt_dk_320);
    variables.add(acct_login_cnt_dk_40);
    variables.add(top_bin_amt_pct);
    variables.add(email_MP_sinc_UPI);
    variables.add(n_bdrt_Veri_txn);
    variables.add(v31_ip_hopping_strict);
    variables.add(rt_r8r16_hr);
    variables.add(s_cctrans_complt_amt);
    variables.add(s_ms_cnt_dk_40);
    variables.add(cc_num_unknown);
    variables.add(prepaid_bank);
    variables.add(v36_d_sn_prev_login);
    variables.add(SNR1WRtDolDclTxn);


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

    if(CP20WRtAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0001) woeValue = -0.464730;
    else if (0.0001 < valueDouble && valueDouble <= 0.0003) woeValue = -0.399647;
    else if (0.0003 < valueDouble && valueDouble <= 0.0005) woeValue = -0.076668;
    else if (0.0005 < valueDouble && valueDouble <= 0.0006) woeValue = 0.066973;
    else if (0.0006 < valueDouble && valueDouble <= 0.001) woeValue = 0.252058;
    else if (0.001 < valueDouble && valueDouble <= 0.0012) woeValue = 0.266390;
    else if (0.0012 < valueDouble && valueDouble <= 0.002) woeValue = 0.390246;
    else if (0.002 < valueDouble && valueDouble <= 0.0026) woeValue = 0.649386;
    else if (0.0026 < valueDouble && valueDouble <= 0.0148) woeValue = 0.989301;
    else if ( valueDouble > 0.0148) woeValue = 1.138543;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.415080;
    else if (-1e38 < valueDouble && valueDouble <= 0.0143196785) woeValue = -1.570802;
    else if (0.0143196785 < valueDouble && valueDouble <= 0.0183348708) woeValue = -1.418245;
    else if (0.0183348708 < valueDouble && valueDouble <= 0.0314364387) woeValue = -1.074458;
    else if (0.0314364387 < valueDouble && valueDouble <= 0.037501622) woeValue = -0.906946;
    else if (0.037501622 < valueDouble && valueDouble <= 0.0446330577) woeValue = -0.607016;
    else if (0.0446330577 < valueDouble && valueDouble <= 0.0469251464) woeValue = -0.309207;
    else if (0.0469251464 < valueDouble && valueDouble <= 0.0489566613) woeValue = -0.140970;
    else if (0.0489566613 < valueDouble && valueDouble <= 0.0601817369) woeValue = -0.115355;
    else if (0.0601817369 < valueDouble && valueDouble <= 0.0634475876) woeValue = -0.014166;
    else if (0.0634475876 < valueDouble && valueDouble <= 0.0941192001) woeValue = 0.131277;
    else if (0.0941192001 < valueDouble && valueDouble <= 0.0963388755) woeValue = 0.168265;
    else if (0.0963388755 < valueDouble && valueDouble <= 0.1213973799) woeValue = 0.566807;
    else if (0.1213973799 < valueDouble && valueDouble <= 0.2097670093) woeValue = 0.973044;
    else if ( valueDouble > 0.2097670093) woeValue = 1.333272;
    else woeValue = 0;}else if(ED1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.637428;
    else if (0 < valueDouble && valueDouble <= 0.0243) woeValue = -1.027924;
    else if (0.0243 < valueDouble && valueDouble <= 0.034) woeValue = -0.635003;
    else if (0.034 < valueDouble && valueDouble <= 0.0414) woeValue = -0.616657;
    else if (0.0414 < valueDouble && valueDouble <= 0.0456) woeValue = -0.592855;
    else if (0.0456 < valueDouble && valueDouble <= 0.0523) woeValue = -0.301259;
    else if (0.0523 < valueDouble && valueDouble <= 0.0564) woeValue = -0.257092;
    else if (0.0564 < valueDouble && valueDouble <= 0.0609) woeValue = -0.199358;
    else if (0.0609 < valueDouble && valueDouble <= 0.0643) woeValue = 0.101237;
    else if (0.0643 < valueDouble && valueDouble <= 0.0944) woeValue = 0.117623;
    else if (0.0944 < valueDouble && valueDouble <= 0.1041) woeValue = 0.773561;
    else if ( valueDouble > 0.1041) woeValue = 0.970924;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.037500;
    else if ( valueDouble > 0) woeValue = 0.996813;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 2.357133;
    else if (-1e38 < valueDouble && valueDouble <= 0.5014518303) woeValue = -0.480353;
    else if (0.5014518303 < valueDouble && valueDouble <= 0.6967549009) woeValue = -0.456660;
    else if (0.6967549009 < valueDouble && valueDouble <= 0.760814743) woeValue = -0.251199;
    else if (0.760814743 < valueDouble && valueDouble <= 0.9082644926) woeValue = -0.212876;
    else if (0.9082644926 < valueDouble && valueDouble <= 0.9852190744) woeValue = -0.144798;
    else if (0.9852190744 < valueDouble && valueDouble <= 1.15) woeValue = 0.235779;
    else if (1.15 < valueDouble && valueDouble <= 1.8560036804) woeValue = 0.544777;
    else if (1.8560036804 < valueDouble && valueDouble <= 3.3135135135) woeValue = 0.817411;
    else if (3.3135135135 < valueDouble && valueDouble <= 6.3742008274) woeValue = 1.322558;
    else if ( valueDouble > 6.3742008274) woeValue = 1.968353;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.343471;
    else if ( valueDouble > 0) woeValue = 0.173845;
    else woeValue = 0;}else if(acct_cc_d_cnt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.358129;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = 0.712152;
    else if (0.0001 < valueDouble && valueDouble <= 0.1095) woeValue = 0.948751;
    else if (0.1095 < valueDouble && valueDouble <= 0.5486) woeValue = 1.230084;
    else if (0.5486 < valueDouble && valueDouble <= 1.3076) woeValue = 2.234845;
    else if ( valueDouble > 1.3076) woeValue = 2.813346;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5258) woeValue = 1.257713;
    else if (0.5258 < valueDouble && valueDouble <= 4.6537) woeValue = 0.466244;
    else if (4.6537 < valueDouble && valueDouble <= 29.2472) woeValue = 0.231521;
    else if (29.2472 < valueDouble && valueDouble <= 275.7899) woeValue = 0.113196;
    else if (275.7899 < valueDouble && valueDouble <= 339.0777) woeValue = -0.093574;
    else if (339.0777 < valueDouble && valueDouble <= 944.1529) woeValue = -0.181396;
    else if (944.1529 < valueDouble && valueDouble <= 1601.839) woeValue = -0.350784;
    else if (1601.839 < valueDouble && valueDouble <= 2049.5584) woeValue = -0.365158;
    else if ( valueDouble > 2049.5584) woeValue = -0.536303;
    else woeValue = 0;}else if(acct_login_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.121204;
    else if (0 < valueDouble && valueDouble <= 1.8398) woeValue = -0.562045;
    else if (1.8398 < valueDouble && valueDouble <= 2.5303) woeValue = -0.368883;
    else if (2.5303 < valueDouble && valueDouble <= 3.2333) woeValue = -0.098566;
    else if (3.2333 < valueDouble && valueDouble <= 4.3328) woeValue = 0.148081;
    else if (4.3328 < valueDouble && valueDouble <= 5.8708) woeValue = 0.462138;
    else if (5.8708 < valueDouble && valueDouble <= 7.1394) woeValue = 0.835724;
    else if (7.1394 < valueDouble && valueDouble <= 10.7344) woeValue = 1.371739;
    else if ( valueDouble > 10.7344) woeValue = 2.622533;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11.820976492) woeValue = -0.262763;
    else if (11.820976492 < valueDouble && valueDouble <= 23.571428571) woeValue = -0.065879;
    else if (23.571428571 < valueDouble && valueDouble <= 27.798143852) woeValue = -0.008757;
    else if (27.798143852 < valueDouble && valueDouble <= 41.040229885) woeValue = 0.035749;
    else if (41.040229885 < valueDouble && valueDouble <= 67.037754114) woeValue = 0.235959;
    else if (67.037754114 < valueDouble && valueDouble <= 91.738853503) woeValue = 0.343915;
    else if (91.738853503 < valueDouble && valueDouble <= 136.07438795) woeValue = 0.675412;
    else if (136.07438795 < valueDouble && valueDouble <= 233.73109244) woeValue = 1.030002;
    else if (233.73109244 < valueDouble && valueDouble <= 526.828125) woeValue = 1.368614;
    else if ( valueDouble > 526.828125) woeValue = 2.146003;
    else woeValue = 0;}else if(billing_shipping_match_level.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.568563;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.049593;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.233385;
    else if ( valueDouble > 3) woeValue = -0.426691;
    else woeValue = 0;}else if(cc_num_unknown.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.128760;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.367946;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.890945;
    else if ( valueDouble > 2) woeValue = 1.323539;
    else woeValue = 0;}else if(cc_pct_credit_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0.1935483871) woeValue = 0.364447;
    else if (0.1935483871 < valueDouble && valueDouble <= 0.3125) woeValue = 0.065970;
    else if (0.3125 < valueDouble && valueDouble <= 0.4791666667) woeValue = -0.122455;
    else if (0.4791666667 < valueDouble && valueDouble <= 0.7407407407) woeValue = -0.232895;
    else if (0.7407407407 < valueDouble && valueDouble <= 0.962962963) woeValue = -0.828435;
    else if ( valueDouble > 0.962962963) woeValue = -1.035946;
    else woeValue = 0;}else if(email_MP_sinc_UPI.getName().equals(varName)){if (value == null) woeValue = -0.124161;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 2.089107;
    else if (1 < valueDouble && valueDouble <= 22) woeValue = 1.105212;
    else if (22 < valueDouble && valueDouble <= 290) woeValue = 0.727700;
    else if ( valueDouble > 290) woeValue = 0.296316;
    else woeValue = 0;}else if(email_numofletter.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = -0.203985;
    else if (4 < valueDouble && valueDouble <= 11) woeValue = -0.062198;
    else if (11 < valueDouble && valueDouble <= 16) woeValue = 0.182190;
    else if ( valueDouble > 16) woeValue = 0.452977;
    else woeValue = 0;}else if(ip_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.053554;
    else if (0 < valueDouble && valueDouble <= 130) woeValue = 0.224294;
    else if (130 < valueDouble && valueDouble <= 209) woeValue = -0.004154;
    else if (209 < valueDouble && valueDouble <= 273) woeValue = -0.276133;
    else if (273 < valueDouble && valueDouble <= 318) woeValue = -0.332978;
    else if (318 < valueDouble && valueDouble <= 570) woeValue = -0.389638;
    else if (570 < valueDouble && valueDouble <= 1000) woeValue = -0.702819;
    else if ( valueDouble > 1000) woeValue = -1.125276;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.131389;
    else if ( valueDouble > 0) woeValue = 0.920962;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0289) woeValue = -1.205434;
    else if (0.0289 < valueDouble && valueDouble <= 0.0294) woeValue = -0.989076;
    else if (0.0294 < valueDouble && valueDouble <= 0.0296) woeValue = -0.731590;
    else if (0.0296 < valueDouble && valueDouble <= 0.0397) woeValue = -0.478959;
    else if (0.0397 < valueDouble && valueDouble <= 0.0566) woeValue = 0.039617;
    else if (0.0566 < valueDouble && valueDouble <= 0.0681) woeValue = 0.294808;
    else if (0.0681 < valueDouble && valueDouble <= 0.0706) woeValue = 0.361610;
    else if (0.0706 < valueDouble && valueDouble <= 0.2) woeValue = 0.654935;
    else if (0.2 < valueDouble && valueDouble <= 0.2817) woeValue = 0.722382;
    else if (0.2817 < valueDouble && valueDouble <= 0.4167) woeValue = 1.117730;
    else if ( valueDouble > 0.4167) woeValue = 1.325084;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.193404;
    else if (0 < valueDouble && valueDouble <= 0.00017) woeValue = -0.791673;
    else if (0.00017 < valueDouble && valueDouble <= 0.00035) woeValue = -0.621761;
    else if (0.00035 < valueDouble && valueDouble <= 0.00044) woeValue = -0.324451;
    else if (0.00044 < valueDouble && valueDouble <= 0.00067) woeValue = -0.153502;
    else if (0.00067 < valueDouble && valueDouble <= 0.001) woeValue = 0.119225;
    else if (0.001 < valueDouble && valueDouble <= 0.00165) woeValue = 0.223825;
    else if (0.00165 < valueDouble && valueDouble <= 0.00284) woeValue = 0.297527;
    else if (0.00284 < valueDouble && valueDouble <= 0.01064) woeValue = 0.653134;
    else if ( valueDouble > 0.01064) woeValue = 1.389794;
    else woeValue = 0;}else if(prepaid_bank.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.021529;
    else if ( valueDouble > 0) woeValue = 0.986765;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.238068;
    else if (-1e38 < valueDouble && valueDouble <= 0.099909991) woeValue = -0.539718;
    else if (0.099909991 < valueDouble && valueDouble <= 0.2433286517) woeValue = -0.400818;
    else if (0.2433286517 < valueDouble && valueDouble <= 0.4767463406) woeValue = -0.350684;
    else if (0.4767463406 < valueDouble && valueDouble <= 0.6459125475) woeValue = -0.328795;
    else if (0.6459125475 < valueDouble && valueDouble <= 0.9696029777) woeValue = -0.137472;
    else if (0.9696029777 < valueDouble && valueDouble <= 6.8239247312) woeValue = 0.320633;
    else if (6.8239247312 < valueDouble && valueDouble <= 12.728011826) woeValue = 0.484294;
    else if ( valueDouble > 12.728011826) woeValue = 0.656700;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.128) woeValue = -0.215007;
    else if (0.128 < valueDouble && valueDouble <= 0.502) woeValue = -0.000125;
    else if ( valueDouble > 0.502) woeValue = 0.742653;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1898) woeValue = 0.340236;
    else if (1898 < valueDouble && valueDouble <= 3771) woeValue = 0.253673;
    else if (3771 < valueDouble && valueDouble <= 26670) woeValue = 0.176506;
    else if (26670 < valueDouble && valueDouble <= 109810) woeValue = -0.039960;
    else if (109810 < valueDouble && valueDouble <= 223650) woeValue = -0.134334;
    else if (223650 < valueDouble && valueDouble <= 291211) woeValue = -0.340165;
    else if (291211 < valueDouble && valueDouble <= 387568) woeValue = -0.481235;
    else if ( valueDouble > 387568) woeValue = -0.620139;
    else woeValue = 0;}else if(s_mp_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.172990;
    else if (0 < valueDouble && valueDouble <= 778.6164) woeValue = -0.701968;
    else if (778.6164 < valueDouble && valueDouble <= 1452.8906) woeValue = -0.681540;
    else if (1452.8906 < valueDouble && valueDouble <= 3431.6964) woeValue = -0.483839;
    else if (3431.6964 < valueDouble && valueDouble <= 4715.2854) woeValue = -0.300847;
    else if (4715.2854 < valueDouble && valueDouble <= 6972.6413) woeValue = -0.279979;
    else if (6972.6413 < valueDouble && valueDouble <= 11518.4093) woeValue = 0.163416;
    else if (11518.4093 < valueDouble && valueDouble <= 25550.7094) woeValue = 0.608711;
    else if ( valueDouble > 25550.7094) woeValue = 2.417802;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.126019;
    else if (0 < valueDouble && valueDouble <= 0.0808) woeValue = -0.487372;
    else if (0.0808 < valueDouble && valueDouble <= 0.2826) woeValue = -0.186056;
    else if (0.2826 < valueDouble && valueDouble <= 0.6881) woeValue = -0.032418;
    else if (0.6881 < valueDouble && valueDouble <= 1.1668) woeValue = 0.275223;
    else if (1.1668 < valueDouble && valueDouble <= 1.8952) woeValue = 0.768210;
    else if (1.8952 < valueDouble && valueDouble <= 3.3445) woeValue = 1.739358;
    else if ( valueDouble > 3.3445) woeValue = 2.233370;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0400364924) woeValue = -0.124238;
    else if (0.0400364924 < valueDouble && valueDouble <= 0.3061576344) woeValue = 0.587137;
    else if (0.3061576344 < valueDouble && valueDouble <= 0.6592406302) woeValue = 1.177608;
    else if ( valueDouble > 0.6592406302) woeValue = 2.013270;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.615465;
    else if ( valueDouble > 0) woeValue = -0.553402;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = -0.118303;
    else if (-1e38 < valueDouble && valueDouble <= 0.015) woeValue = 0.709210;
    else if (0.015 < valueDouble && valueDouble <= 0.032) woeValue = 0.189995;
    else if (0.032 < valueDouble && valueDouble <= 0.038) woeValue = 0.022642;
    else if (0.038 < valueDouble && valueDouble <= 0.046) woeValue = -0.075509;
    else if (0.046 < valueDouble && valueDouble <= 0.086) woeValue = -0.115829;
    else if (0.086 < valueDouble && valueDouble <= 0.107) woeValue = -0.189680;
    else if ( valueDouble > 0.107) woeValue = -0.357997;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.900000;
    else if (-1e38 < valueDouble && valueDouble <= 28.953055556) woeValue = -0.265215;
    else if (28.953055556 < valueDouble && valueDouble <= 47.758784722) woeValue = -0.105400;
    else if (47.758784722 < valueDouble && valueDouble <= 58.284456019) woeValue = 0.287618;
    else if (58.284456019 < valueDouble && valueDouble <= 111.39086806) woeValue = 0.438483;
    else if (111.39086806 < valueDouble && valueDouble <= 146.19668981) woeValue = 0.643710;
    else if ( valueDouble > 146.19668981) woeValue = 0.755501;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.590679;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.608480;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.041136;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.421806;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.822706;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 1.120590;
    else if ( valueDouble > 5) woeValue = 2.488149;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList(" ").contains(value)) woeValue = -0.186882;
    else if (Arrays.asList( "NO_HOPPING","_MISSING_").contains(value)) woeValue = -0.186882;
    else if (Arrays.asList( "IP_HOP_1").contains(value)) woeValue = 0.296271;
    else if (Arrays.asList( "IP_HOPPING_2").contains(value)) woeValue = 0.613001;
    else if (Arrays.asList( "CITY_HOPPING_2","CTRY_HOPPING_2","CITY_HOPPING_GT2","STATE_HOPPING_2","IP_HOPPING_GT2","CTRY_HOPPING_GT2").contains(value)) woeValue = 0.999794;
    else if (Arrays.asList( "STATE_HOPPING_EXCESSIVE","CTRY_HOPPING_EXCESSIVE","STATE_HOPPING_GT2").contains(value)) woeValue = 2.525156;
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
    
    coeffMap.put("Intercept",+5.85572181);
    coeffMap.put(MOA_V_MOALife.getName(),-0.53210560);
    coeffMap.put(acct_cc_d_cnt_dk_320.getName(),-0.51095210);
    coeffMap.put(CP20WRtAtoBadTxn.getName(),-0.48089371);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.81717619);
    coeffMap.put(ach_outstd_age.getName(),-0.52942173);
    coeffMap.put(v36_login_exces_1h.getName(),-0.27017746);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.39488717);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.65424865);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.74173103);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.47444396);
    coeffMap.put(email_MP_sinc_UPI.getName(),-0.77152323);
    coeffMap.put(billing_shipping_match_level.getName(),-0.53097455);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.28048010);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.33847693);
    coeffMap.put(s_mp_amt_dk_40.getName(),-0.26852431);
    coeffMap.put(ED1WRtDolDclTxn.getName(),-0.31571151);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.35242145);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.39198018);
    coeffMap.put(last_name_lowcase.getName(),-0.50241149);
    coeffMap.put(cc_num_unknown.getName(),-0.37178672);
    coeffMap.put(rt_r8r16_hr.getName(),-0.39998595);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.31695988);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.32619029);
    coeffMap.put(ip_dof.getName(),-0.54658563);
    coeffMap.put(prepaid_bank.getName(),-0.39437407);
    coeffMap.put(cc_pct_credit_v2.getName(),-0.53207538);
    coeffMap.put(acct_login_cnt_dk_40.getName(),-0.22389626);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.43421908);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.48241889);
    coeffMap.put(top_bin_amt_pct.getName(),-0.17314753);
    coeffMap.put(email_numofletter.getName(),-0.51631220);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 854.26642849;
  }

  @Override
  public double getCoeff2() {
    return  -59.35553199;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT6;
  }
  
}