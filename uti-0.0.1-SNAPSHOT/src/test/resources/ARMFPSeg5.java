package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg5 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(asp);
    variables.add(v36_cc_bin_indc);
    variables.add(ip_nb_cnt_pst_1y);
    variables.add(cc_num_failed_verification);
    variables.add(MOA_V_MOALife);
    variables.add(nall_failed_amt_avg);
    variables.add(ebay_5d_amt_dk_360all);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_ms_amt_dk_20);
    variables.add(ip_ratio_4w_appr_dol);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(acct_h_s_amt_dk_160);
    variables.add(rcvr_cc_d_amt_dk_160);
    variables.add(ED4WRtAtoBadAcc);
    variables.add(n_ebay_lnkd_360all);
    variables.add(v35_ph_indicative);
    variables.add(ratio_asp);
    variables.add(s_v_tx_ratio_num);
    variables.add(IP4WRtDolBadTxn);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(v2_ph_indicative);
    variables.add(c_cc_pct_inactive);
    variables.add(billing_shipping_mismatch);
    variables.add(nach_amt_max_ratio);
    variables.add(v3_account_age_sm);
    variables.add(t_bank_dof);
    variables.add(max_cross20wRtDclAcc);
    variables.add(s_amt_dk_10);
    variables.add(alias_max_dof);
    variables.add(Approved_asp_ccbin);
    variables.add(num_phone);
    variables.add(acct_cc_d_cnt_dk_320);
    variables.add(is_credit_union);
    variables.add(email_MP_sinc_UPI);
    variables.add(ip_cnt_dk_20);
    variables.add(rt_r8r16_hr);
    variables.add(IP1WRtDolAtoBadTxn);
    variables.add(seconds_since_last_return);
    variables.add(s_v_outstd_ratio_num);
    variables.add(v36_d_sn_prev_login);
    variables.add(ebay_UPIA_AMT_180d_360all);
    variables.add(email_MP_GMB_1Y);


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

    if(Approved_asp_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.411095;
    else if (-1e38 < valueDouble && valueDouble <= 2567.6111111) woeValue = 1.035832;
    else if (2567.6111111 < valueDouble && valueDouble <= 2684.6242446) woeValue = 0.942678;
    else if (2684.6242446 < valueDouble && valueDouble <= 3298.0586124) woeValue = 0.411765;
    else if (3298.0586124 < valueDouble && valueDouble <= 4655.1691617) woeValue = 0.116397;
    else if (4655.1691617 < valueDouble && valueDouble <= 6291.6509735) woeValue = -0.103522;
    else if (6291.6509735 < valueDouble && valueDouble <= 6715.3479606) woeValue = -0.595525;
    else if ( valueDouble > 6715.3479606) woeValue = -0.737941;
    else woeValue = 0;}else if(ED4WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = -0.228708;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.194087;
    else if (0 < valueDouble && valueDouble <= 0.0005) woeValue = 0.219962;
    else if (0.0005 < valueDouble && valueDouble <= 0.0007) woeValue = 0.107632;
    else if ( valueDouble > 0.0007) woeValue = -0.057501;
    else woeValue = 0;}else if(IP1WRtDolAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.228708;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.054335;
    else if (0 < valueDouble && valueDouble <= 0.0014) woeValue = -0.074731;
    else if ( valueDouble > 0.0014) woeValue = 0.153047;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.228708;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.050020;
    else if (0 < valueDouble && valueDouble <= 0.0013) woeValue = -0.710749;
    else if (0.0013 < valueDouble && valueDouble <= 0.0054) woeValue = -0.329622;
    else if (0.0054 < valueDouble && valueDouble <= 0.0055) woeValue = -0.230005;
    else if (0.0055 < valueDouble && valueDouble <= 0.0058) woeValue = 0.026042;
    else if (0.0058 < valueDouble && valueDouble <= 0.0156) woeValue = 0.178445;
    else if ( valueDouble > 0.0156) woeValue = 1.251878;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.027275;
    else if ( valueDouble > 0) woeValue = 0.796608;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5319720041) woeValue = -0.221935;
    else if (0.5319720041 < valueDouble && valueDouble <= 0.7373816744) woeValue = 0.042885;
    else if (0.7373816744 < valueDouble && valueDouble <= 0.9848484848) woeValue = 0.217761;
    else if (0.9848484848 < valueDouble && valueDouble <= 1.4674128282) woeValue = 1.209716;
    else if ( valueDouble > 1.4674128282) woeValue = 1.859884;
    else woeValue = 0;}else if(acct_cc_d_cnt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.615031;
    else if (0 < valueDouble && valueDouble <= 0.0018) woeValue = 0.389493;
    else if (0.0018 < valueDouble && valueDouble <= 0.0245) woeValue = 0.394362;
    else if (0.0245 < valueDouble && valueDouble <= 0.3432) woeValue = 0.796825;
    else if (0.3432 < valueDouble && valueDouble <= 0.6188) woeValue = 1.163069;
    else if (0.6188 < valueDouble && valueDouble <= 2.2777) woeValue = 1.548006;
    else if ( valueDouble > 2.2777) woeValue = 1.646480;
    else woeValue = 0;}else if(acct_h_s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0.017) woeValue = 2.691188;
    else if (0.017 < valueDouble && valueDouble <= 0.2099) woeValue = 1.212345;
    else if (0.2099 < valueDouble && valueDouble <= 1.1627) woeValue = 1.129159;
    else if (1.1627 < valueDouble && valueDouble <= 20.5037) woeValue = 0.727561;
    else if (20.5037 < valueDouble && valueDouble <= 51.0357) woeValue = 0.581898;
    else if (51.0357 < valueDouble && valueDouble <= 75.9976) woeValue = 0.347168;
    else if (75.9976 < valueDouble && valueDouble <= 147.6134) woeValue = 0.322234;
    else if (147.6134 < valueDouble && valueDouble <= 194.3449) woeValue = 0.169452;
    else if (194.3449 < valueDouble && valueDouble <= 998.6968) woeValue = -0.084682;
    else if (998.6968 < valueDouble && valueDouble <= 1286.926) woeValue = -0.095358;
    else if (1286.926 < valueDouble && valueDouble <= 1808.6386) woeValue = -0.454932;
    else if (1808.6386 < valueDouble && valueDouble <= 19435.9724) woeValue = -0.622469;
    else if (19435.9724 < valueDouble && valueDouble <= 51589.2044) woeValue = -1.203895;
    else if ( valueDouble > 51589.2044) woeValue = -1.899657;
    else woeValue = 0;}else if(alias_max_dof.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 315) woeValue = 1.218562;
    else if (315 < valueDouble && valueDouble <= 846) woeValue = 0.585178;
    else if (846 < valueDouble && valueDouble <= 1240) woeValue = 0.345552;
    else if (1240 < valueDouble && valueDouble <= 1513) woeValue = 0.185680;
    else if (1513 < valueDouble && valueDouble <= 1701) woeValue = 0.090142;
    else if (1701 < valueDouble && valueDouble <= 2186) woeValue = 0.005976;
    else if (2186 < valueDouble && valueDouble <= 3607) woeValue = -0.319241;
    else if (3607 < valueDouble && valueDouble <= 3752) woeValue = -0.538302;
    else if ( valueDouble > 3752) woeValue = -0.591275;
    else woeValue = 0;}else if(asp.getName().equals(varName)){if (value == null) woeValue = -0.296211;
    else if (-1e38 < valueDouble && valueDouble <= 421.37138744) woeValue = -0.882302;
    else if (421.37138744 < valueDouble && valueDouble <= 635.42468908) woeValue = -0.661207;
    else if (635.42468908 < valueDouble && valueDouble <= 724.2) woeValue = -0.614764;
    else if (724.2 < valueDouble && valueDouble <= 20349.956522) woeValue = 0.109485;
    else if ( valueDouble > 20349.956522) woeValue = 0.430727;
    else woeValue = 0;}else if(billing_shipping_mismatch.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.466853;
    else if ( valueDouble > 0) woeValue = 0.704727;
    else woeValue = 0;}else if(c_cc_pct_inactive.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.537691;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.184662;
    else if (0 < valueDouble && valueDouble <= 0.6666666667) woeValue = -0.469643;
    else if (0.6666666667 < valueDouble && valueDouble <= 0.96) woeValue = -0.280156;
    else if ( valueDouble > 0.96) woeValue = -0.060092;
    else woeValue = 0;}else if(cc_num_failed_verification.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.171877;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.016831;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = 0.210718;
    else if ( valueDouble > 4) woeValue = 0.723932;
    else woeValue = 0;}else if(ebay_5d_amt_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.652330;
    else if (0 < valueDouble && valueDouble <= 0.0000754908) woeValue = 0.602541;
    else if (0.0000754908 < valueDouble && valueDouble <= 0.0024546798) woeValue = 0.447051;
    else if (0.0024546798 < valueDouble && valueDouble <= 0.0269223859) woeValue = 0.312620;
    else if (0.0269223859 < valueDouble && valueDouble <= 0.1545831257) woeValue = 0.266382;
    else if (0.1545831257 < valueDouble && valueDouble <= 5.8742184814) woeValue = -0.196412;
    else if ( valueDouble > 5.8742184814) woeValue = -0.452715;
    else woeValue = 0;}else if(ebay_UPIA_AMT_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.126756;
    else if (0 < valueDouble && valueDouble <= 6) woeValue = -0.108762;
    else if (6 < valueDouble && valueDouble <= 189.5882) woeValue = 0.117752;
    else if (189.5882 < valueDouble && valueDouble <= 470.99) woeValue = 0.415493;
    else if ( valueDouble > 470.99) woeValue = 0.766495;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.097367;
    else if (-1e38 < valueDouble && valueDouble <= 55) woeValue = 3.112230;
    else if (55 < valueDouble && valueDouble <= 397) woeValue = 1.217174;
    else if (397 < valueDouble && valueDouble <= 1506.5) woeValue = 0.980353;
    else if (1506.5 < valueDouble && valueDouble <= 2447.9565217) woeValue = 0.537574;
    else if (2447.9565217 < valueDouble && valueDouble <= 3166) woeValue = 0.157908;
    else if ( valueDouble > 3166) woeValue = -1.355550;
    else woeValue = 0;}else if(email_MP_GMB_1Y.getName().equals(varName)){if (value == null) woeValue = 0.321188;
    else if (-1e38 < valueDouble && valueDouble <= 16.09) woeValue = 0.496546;
    else if (16.09 < valueDouble && valueDouble <= 178.63) woeValue = 0.249298;
    else if (178.63 < valueDouble && valueDouble <= 495.31) woeValue = 0.090545;
    else if (495.31 < valueDouble && valueDouble <= 3454.2158) woeValue = -0.313685;
    else if ( valueDouble > 3454.2158) woeValue = -0.867457;
    else woeValue = 0;}else if(email_MP_sinc_UPI.getName().equals(varName)){if (value == null) woeValue = -0.116312;
    else if (-1e38 < valueDouble && valueDouble <= 24) woeValue = 0.772040;
    else if (24 < valueDouble && valueDouble <= 167) woeValue = 0.508057;
    else if (167 < valueDouble && valueDouble <= 377) woeValue = 0.091347;
    else if ( valueDouble > 377) woeValue = -0.417394;
    else woeValue = 0;}else if(ip_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.027852;
    else if (0 < valueDouble && valueDouble <= 0.8928) woeValue = -0.312405;
    else if (0.8928 < valueDouble && valueDouble <= 2.1303) woeValue = -0.044166;
    else if (2.1303 < valueDouble && valueDouble <= 3.771) woeValue = 0.198223;
    else if ( valueDouble > 3.771) woeValue = 0.641633;
    else woeValue = 0;}else if(ip_nb_cnt_pst_1y.getName().equals(varName)){if (value == null) woeValue = -0.024435;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.500467;
    else if (0 < valueDouble && valueDouble <= 269) woeValue = 0.370377;
    else if (269 < valueDouble && valueDouble <= 807) woeValue = 0.834591;
    else if ( valueDouble > 807) woeValue = 1.182553;
    else woeValue = 0;}else if(ip_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 1.404035;
    else if (-1e38 < valueDouble && valueDouble <= 0.1257903625) woeValue = -0.384918;
    else if (0.1257903625 < valueDouble && valueDouble <= 0.8957924628) woeValue = -0.333673;
    else if (0.8957924628 < valueDouble && valueDouble <= 0.963707426) woeValue = 0.028713;
    else if (0.963707426 < valueDouble && valueDouble <= 1.6304223669) woeValue = 0.123156;
    else if (1.6304223669 < valueDouble && valueDouble <= 3.1134593993) woeValue = 0.238184;
    else if (3.1134593993 < valueDouble && valueDouble <= 3.8145143609) woeValue = 0.352448;
    else if (3.8145143609 < valueDouble && valueDouble <= 11.393886591) woeValue = 0.488765;
    else if ( valueDouble > 11.393886591) woeValue = 1.074766;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.045155;
    else if ( valueDouble > 0) woeValue = -0.244692;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = -0.228708;
    else if (-1e38 < valueDouble && valueDouble <= 0.0288) woeValue = -0.790054;
    else if (0.0288 < valueDouble && valueDouble <= 0.0291) woeValue = -0.777523;
    else if (0.0291 < valueDouble && valueDouble <= 0.0299) woeValue = -0.693586;
    else if (0.0299 < valueDouble && valueDouble <= 0.0328) woeValue = -0.608658;
    else if (0.0328 < valueDouble && valueDouble <= 0.0391) woeValue = -0.433968;
    else if (0.0391 < valueDouble && valueDouble <= 0.0406) woeValue = -0.182154;
    else if (0.0406 < valueDouble && valueDouble <= 0.0529) woeValue = -0.157772;
    else if (0.0529 < valueDouble && valueDouble <= 0.0555) woeValue = 0.151913;
    else if (0.0555 < valueDouble && valueDouble <= 0.0579) woeValue = 0.158514;
    else if (0.0579 < valueDouble && valueDouble <= 0.1249) woeValue = 0.326211;
    else if (0.1249 < valueDouble && valueDouble <= 0.2222) woeValue = 0.595304;
    else if ( valueDouble > 0.2222) woeValue = 1.071579;
    else woeValue = 0;}else if(n_ebay_lnkd_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.204241;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.129368;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.189662;
    else if (3 < valueDouble && valueDouble <= 6) woeValue = 0.438854;
    else if ( valueDouble > 6) woeValue = 1.045110;
    else woeValue = 0;}else if(nach_amt_max_ratio.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 0.0299993617) woeValue = -0.431828;
    else if (0.0299993617 < valueDouble && valueDouble <= 0.0435202492) woeValue = -0.246369;
    else if (0.0435202492 < valueDouble && valueDouble <= 0.0965861514) woeValue = -0.234337;
    else if (0.0965861514 < valueDouble && valueDouble <= 0.1751944331) woeValue = 0.041871;
    else if (0.1751944331 < valueDouble && valueDouble <= 0.2423869579) woeValue = 0.243384;
    else if (0.2423869579 < valueDouble && valueDouble <= 0.4692307692) woeValue = 0.362246;
    else if (0.4692307692 < valueDouble && valueDouble <= 0.6136011539) woeValue = 0.985325;
    else if (0.6136011539 < valueDouble && valueDouble <= 0.9261477046) woeValue = 1.056690;
    else if ( valueDouble > 0.9261477046) woeValue = 1.947989;
    else woeValue = 0;}else if(nall_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = 0.320234;
    else if (-1e38 < valueDouble && valueDouble <= 641.11725664) woeValue = 0.445395;
    else if (641.11725664 < valueDouble && valueDouble <= 11718.52) woeValue = -0.064540;
    else if ( valueDouble > 11718.52) woeValue = -0.167305;
    else woeValue = 0;}else if(num_phone.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.069046;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.069393;
    else if ( valueDouble > 4) woeValue = 0.589604;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.585838;
    else if (-1e38 < valueDouble && valueDouble <= 0.0180379747) woeValue = -1.114307;
    else if (0.0180379747 < valueDouble && valueDouble <= 0.0852857143) woeValue = -0.878440;
    else if (0.0852857143 < valueDouble && valueDouble <= 0.2331768388) woeValue = -0.567077;
    else if (0.2331768388 < valueDouble && valueDouble <= 0.2932261058) woeValue = -0.287795;
    else if (0.2932261058 < valueDouble && valueDouble <= 0.6327406499) woeValue = -0.249393;
    else if (0.6327406499 < valueDouble && valueDouble <= 0.8295638126) woeValue = -0.169017;
    else if (0.8295638126 < valueDouble && valueDouble <= 0.9123913043) woeValue = 0.172314;
    else if (0.9123913043 < valueDouble && valueDouble <= 7.633) woeValue = 0.520217;
    else if ( valueDouble > 7.633) woeValue = 1.641762;
    else woeValue = 0;}else if(ratio_asp.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.296211;
    else if (-1 < valueDouble && valueDouble <= 0.0640374215) woeValue = -0.629194;
    else if (0.0640374215 < valueDouble && valueDouble <= 0.573234525) woeValue = -0.246647;
    else if (0.573234525 < valueDouble && valueDouble <= 0.6355260599) woeValue = -0.122813;
    else if (0.6355260599 < valueDouble && valueDouble <= 0.6663444187) woeValue = -0.073810;
    else if (0.6663444187 < valueDouble && valueDouble <= 1.3410429216) woeValue = 0.004012;
    else if (1.3410429216 < valueDouble && valueDouble <= 2.3217209567) woeValue = 0.141012;
    else if (2.3217209567 < valueDouble && valueDouble <= 2.9052698416) woeValue = 0.906025;
    else if (2.9052698416 < valueDouble && valueDouble <= 4.1081049529) woeValue = 1.031541;
    else if ( valueDouble > 4.1081049529) woeValue = 1.473041;
    else woeValue = 0;}else if(rcvr_cc_d_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.317287;
    else if (0 < valueDouble && valueDouble <= 0.0067) woeValue = -0.789615;
    else if (0.0067 < valueDouble && valueDouble <= 385.0679) woeValue = -0.731427;
    else if (385.0679 < valueDouble && valueDouble <= 2202.9629) woeValue = -0.606489;
    else if (2202.9629 < valueDouble && valueDouble <= 7953.195) woeValue = -0.590291;
    else if (7953.195 < valueDouble && valueDouble <= 20546.6844) woeValue = -0.348750;
    else if (20546.6844 < valueDouble && valueDouble <= 50881.1667) woeValue = -0.227285;
    else if (50881.1667 < valueDouble && valueDouble <= 126906.2965) woeValue = -0.005232;
    else if (126906.2965 < valueDouble && valueDouble <= 1547059.3768) woeValue = 0.593273;
    else if ( valueDouble > 1547059.3768) woeValue = 1.401727;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.021) woeValue = -0.633739;
    else if (0.021 < valueDouble && valueDouble <= 0.042) woeValue = -0.389184;
    else if (0.042 < valueDouble && valueDouble <= 0.507) woeValue = -0.043959;
    else if ( valueDouble > 0.507) woeValue = 0.631145;
    else woeValue = 0;}else if(s_amt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.260342;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -0.820875;
    else if (0.002 < valueDouble && valueDouble <= 0.0286) woeValue = -0.539423;
    else if (0.0286 < valueDouble && valueDouble <= 3.2451) woeValue = -0.495305;
    else if (3.2451 < valueDouble && valueDouble <= 1536.9246) woeValue = -0.401322;
    else if (1536.9246 < valueDouble && valueDouble <= 1874.1511) woeValue = -0.384663;
    else if (1874.1511 < valueDouble && valueDouble <= 4176.3254) woeValue = -0.166881;
    else if (4176.3254 < valueDouble && valueDouble <= 9370.3745) woeValue = 0.192588;
    else if (9370.3745 < valueDouble && valueDouble <= 27004.0232) woeValue = 0.811700;
    else if ( valueDouble > 27004.0232) woeValue = 1.819430;
    else woeValue = 0;}else if(s_ms_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.018976;
    else if (0 < valueDouble && valueDouble <= 15.5921) woeValue = -0.366250;
    else if (15.5921 < valueDouble && valueDouble <= 278.4704) woeValue = -0.272941;
    else if (278.4704 < valueDouble && valueDouble <= 1512.7153) woeValue = -0.201789;
    else if (1512.7153 < valueDouble && valueDouble <= 3004.3976) woeValue = -0.135450;
    else if (3004.3976 < valueDouble && valueDouble <= 4418.9939) woeValue = 0.131339;
    else if (4418.9939 < valueDouble && valueDouble <= 7171.3833) woeValue = 0.395109;
    else if (7171.3833 < valueDouble && valueDouble <= 14715.4817) woeValue = 0.996898;
    else if ( valueDouble > 14715.4817) woeValue = 1.905942;
    else woeValue = 0;}else if(s_v_outstd_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.08125) woeValue = -0.133785;
    else if (0.08125 < valueDouble && valueDouble <= 0.095890411) woeValue = 0.386049;
    else if (0.095890411 < valueDouble && valueDouble <= 0.1210653753) woeValue = 0.438965;
    else if (0.1210653753 < valueDouble && valueDouble <= 0.1732776618) woeValue = 1.063246;
    else if ( valueDouble > 0.1732776618) woeValue = 1.724597;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.7721179625) woeValue = 2.017739;
    else if (0.7721179625 < valueDouble && valueDouble <= 0.8597560976) woeValue = 1.145825;
    else if (0.8597560976 < valueDouble && valueDouble <= 0.8733333333) woeValue = 0.914548;
    else if (0.8733333333 < valueDouble && valueDouble <= 0.9005736138) woeValue = 0.665356;
    else if (0.9005736138 < valueDouble && valueDouble <= 0.9066666667) woeValue = 0.630042;
    else if (0.9066666667 < valueDouble && valueDouble <= 0.9121212121) woeValue = 0.163640;
    else if (0.9121212121 < valueDouble && valueDouble <= 0.9389978214) woeValue = 0.153500;
    else if (0.9389978214 < valueDouble && valueDouble <= 0.9448818898) woeValue = -0.045108;
    else if (0.9448818898 < valueDouble && valueDouble <= 0.9719101124) woeValue = -0.055938;
    else if (0.9719101124 < valueDouble && valueDouble <= 0.9791666667) woeValue = -0.345240;
    else if (0.9791666667 < valueDouble && valueDouble <= 0.984) woeValue = -0.853029;
    else if (0.984 < valueDouble && valueDouble <= 0.9882352941) woeValue = -0.994504;
    else if (0.9882352941 < valueDouble && valueDouble <= 0.9957983193) woeValue = -1.160297;
    else if ( valueDouble > 0.9957983193) woeValue = -1.440601;
    else woeValue = 0;}else if(seconds_since_last_return.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.646727;
    else if (-1 < valueDouble && valueDouble <= 2880683) woeValue = 1.366727;
    else if (2880683 < valueDouble && valueDouble <= 3206526) woeValue = 0.795571;
    else if (3206526 < valueDouble && valueDouble <= 8181730) woeValue = 0.738715;
    else if (8181730 < valueDouble && valueDouble <= 15583759) woeValue = 0.053220;
    else if ( valueDouble > 15583759) woeValue = -0.258851;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.897221;
    else if ( valueDouble > 0) woeValue = -0.238018;
    else woeValue = 0;}else if(t_bank_dof.getName().equals(varName)){if (value == null) woeValue = -0.256967;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 2.071951;
    else if (-1 < valueDouble && valueDouble <= 305) woeValue = 0.461892;
    else if (305 < valueDouble && valueDouble <= 1516) woeValue = -0.119566;
    else if (1516 < valueDouble && valueDouble <= 2123) woeValue = -0.175190;
    else if (2123 < valueDouble && valueDouble <= 2924) woeValue = -0.457682;
    else if ( valueDouble > 2924) woeValue = -0.514385;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.386058;
    else if (-1e38 < valueDouble && valueDouble <= 23.198761574) woeValue = -0.230611;
    else if (23.198761574 < valueDouble && valueDouble <= 27.929513889) woeValue = 0.057823;
    else if (27.929513889 < valueDouble && valueDouble <= 33.495428241) woeValue = 0.453187;
    else if (33.495428241 < valueDouble && valueDouble <= 55.318472222) woeValue = 0.554171;
    else if ( valueDouble > 55.318472222) woeValue = 0.742577;
    else woeValue = 0;}else if(v3_account_age_sm.getName().equals(varName)){if (value == null) woeValue = -0.079079;
    else if (-1e38 < valueDouble && valueDouble <= 346.45645833) woeValue = 0.254701;
    else if (346.45645833 < valueDouble && valueDouble <= 384.33519676) woeValue = 0.032697;
    else if (384.33519676 < valueDouble && valueDouble <= 913.81958333) woeValue = -0.115436;
    else if (913.81958333 < valueDouble && valueDouble <= 1348.9234722) woeValue = -0.510657;
    else if ( valueDouble > 1348.9234722) woeValue = -0.722194;
    else woeValue = 0;}else if(v2_ph_indicative.getName().equals(varName)){if (Arrays.asList( "_MISSING_","CORP").contains(value)) woeValue = -0.457443;
    else if (Arrays.asList( "MOBILE_GEO_MATCH","MOBILE","NO_PHONES").contains(value)) woeValue = -0.102492;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.079079;
    else if (Arrays.asList( "TWO_SIMILAR","TWO_GEO_MATCH","FIXED_GEO_MATCH","OTHER_GEO_MATCH","FIXED").contains(value)) woeValue = 0.070264;
    else if (Arrays.asList( "TOLLFREE").contains(value)) woeValue = 0.535344;
    else if (Arrays.asList( "OTHER").contains(value)) woeValue = 1.250135;
    else if (Arrays.asList( "RESHIPPER").contains(value)) woeValue = 0.000000;
    else woeValue = 0;}else if(v35_ph_indicative.getName().equals(varName)){if (Arrays.asList( "_MISSING_","OTHER").contains(value)) woeValue = -0.668827;
    else if (Arrays.asList( "CORP","FIXED").contains(value)) woeValue = -0.322299;
    else if (Arrays.asList( "NO_PHONES"," ","FIXED_GEO_MATCH").contains(value)) woeValue = -0.069890;
    else if (Arrays.asList( "TWO_GEO_MATCH","TWO_SIMILAR","MOBILE","MOBILE_GEO_MATCH").contains(value)) woeValue = 0.107940;
    else if (Arrays.asList( "TOLLFREE").contains(value)) woeValue = 0.777278;
    else if (Arrays.asList( "RESHIPPER").contains(value)) woeValue = 0.000000;
    else woeValue = 0;}else if(v36_cc_bin_indc.getName().equals(varName)){if (Arrays.asList( "EXCESSIVE_BINS","EXCESSIVE_CCS","MATCH_MANY_CCS","_MISSING_","SINGLE_CC_NEW_ISSUER","NO_CCS").contains(value)) woeValue = -0.227901;
    else if (Arrays.asList( "MATCH_FEW_CCS").contains(value)) woeValue = -0.176742;
    else if (Arrays.asList( "","NO_NEW_CCS","CONSISTENT").contains(value)) woeValue = -0.007380;
    else if (Arrays.asList( "MAJOR_MISMATCH","MINOR_MISMATCH").contains(value)) woeValue = 0.636311;
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
    
    coeffMap.put("Intercept",+5.91881906);
    coeffMap.put(acct_h_s_amt_dk_160.getName(),-0.83064184);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.38129322);
    coeffMap.put(acct_cc_d_cnt_dk_320.getName(),-0.47968733);
    coeffMap.put(t_bank_dof.getName(),-0.92500090);
    coeffMap.put(seconds_since_last_return.getName(),-0.54641526);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.42505683);
    coeffMap.put(billing_shipping_mismatch.getName(),-0.62666599);
    coeffMap.put(nach_amt_max_ratio.getName(),-0.07089195);
    coeffMap.put(s_amt_dk_10.getName(),-0.31997823);
    coeffMap.put(MOA_V_MOALife.getName(),-0.44101036);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.22375331);
    coeffMap.put(s_ms_amt_dk_20.getName(),-0.23806837);
    coeffMap.put(rcvr_cc_d_amt_dk_160.getName(),-0.20975083);
    coeffMap.put(ip_ratio_4w_appr_dol.getName(),-0.64092591);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.39831956);
    coeffMap.put(ebay_5d_amt_dk_360all.getName(),-0.39445033);
    coeffMap.put(Approved_asp_ccbin.getName(),-0.67531290);
    coeffMap.put(ratio_asp.getName(),-0.27249111);
    coeffMap.put(alias_max_dof.getName(),-0.22161871);
    coeffMap.put(s_v_outstd_ratio_num.getName(),-0.52128854);
    coeffMap.put(c_cc_pct_inactive.getName(),-0.32863221);
    coeffMap.put(email_MP_GMB_1Y.getName(),-0.69809746);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.60161895);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-0.47008428);
    coeffMap.put(ip_cnt_dk_20.getName(),-0.36262587);
    coeffMap.put(v3_account_age_sm.getName(),-0.39917680);
    coeffMap.put(n_ebay_lnkd_360all.getName(),-0.31682918);
    coeffMap.put(rt_r8r16_hr.getName(),-0.68725851);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.86667860);
    coeffMap.put(email_MP_sinc_UPI.getName(),-0.72299203);
    coeffMap.put(asp.getName(),-0.46968493);
    coeffMap.put(ebay_UPIA_AMT_180d_360all.getName(),-0.89551087);
    coeffMap.put(cc_num_failed_verification.getName(),-0.63879474);
    coeffMap.put(ip_nb_cnt_pst_1y.getName(),-0.49345997);
    coeffMap.put(num_phone.getName(),-0.80308875);
    coeffMap.put(v2_ph_indicative.getName(),-0.54169513);
    coeffMap.put(nall_failed_amt_avg.getName(),-0.22176038);
    coeffMap.put(v36_cc_bin_indc.getName(),-0.50701986);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.76265274);
    coeffMap.put(v35_ph_indicative.getName(),-0.83000800);
    coeffMap.put(ED4WRtAtoBadAcc.getName(),-1.10079348);
    coeffMap.put(is_credit_union.getName(),-1.10123128);
    coeffMap.put(IP1WRtDolAtoBadTxn.getName(),-0.57762831);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 825.40034058;
  }

  @Override
  public double getCoeff2() {
    return  -51.85482933;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT5;
  }
  
}