package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg1 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(return_lt_30d_cnt);
    variables.add(v36_login_exces_10m);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(r_ratio_max_dk_320);
    variables.add(rt_r8r16_hr);
    variables.add(CP4WRtAtoBadAcc);
    variables.add(nall_failed_ratio);
    variables.add(asp);
    variables.add(v2_ad_type_indicative);
    variables.add(cc_pct_credit_v2);
    variables.add(ip_nb_cnt_pst_1y);
    variables.add(v3_ip_ad_dist_best);
    variables.add(acct_cc_d_amt_dk_80);
    variables.add(outstd_iach_amt2);
    variables.add(rcvr_cc_d_amt_dk_160);
    variables.add(Decline_rate_ccbin);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(outamt_to_max_cleard);
    variables.add(s_v_tx_ratio_num);
    variables.add(ipr_ratio_4w_uaa_dol);
    variables.add(is_credit_union);
    variables.add(acct_h_s_cnt_dk_320);
    variables.add(email_MP_7d_UPIA_dk);
    variables.add(num_logins_3_days);
    variables.add(Bad_rate_amt_ccbin);
    variables.add(txnsnt_amt_stss_max_lst_48_hrs);
    variables.add(top_bin_amt_pct);
    variables.add(snr_ratio_4w_uaa_dol);
    variables.add(s_mp_amt_dk_20);
    variables.add(seconds_since_last_return);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(v36_tx_cnt_in_last_1d);
    variables.add(cc_num_unknown);
    variables.add(ED20WRtCcBadAcc);
    variables.add(CP4WRtDclTxn);
    variables.add(v36_diff_vid_3d);
    variables.add(ebay_dy_snc_sus_min_360all);
    variables.add(s_v_outstd_ratio_num);
    variables.add(s_cctrans_complt_amt);
    variables.add(ncc_failed_amt_avg);
    variables.add(PC_LT30K_Income_CCBIN);


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

    if(Bad_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.083406;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0000248992) woeValue = -1.56430;
    else if (0.0000248992 < valueDouble && valueDouble <= 0.0019645187) woeValue = 0.034350;
    else if (0.0019645187 < valueDouble && valueDouble <= 0.00408309) woeValue = 0.151571;
    else if (0.00408309 < valueDouble && valueDouble <= 0.0053935679) woeValue = 0.514884;
    else if ( valueDouble > 0.0053935679) woeValue = 0.660323;
    else woeValue = 0;}else if(CP4WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = -0.723282;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.287061;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -0.415196;
    else if (0.0002 < valueDouble && valueDouble <= 0.0009) woeValue = 0.244031;
    else if (0.0009 < valueDouble && valueDouble <= 0.0016) woeValue = 0.275351;
    else if (0.0016 < valueDouble && valueDouble <= 0.0029) woeValue = 0.495734;
    else if (0.0029 < valueDouble && valueDouble <= 0.0034) woeValue = 0.532462;
    else if (0.0034 < valueDouble && valueDouble <= 0.0046) woeValue = 0.632824;
    else if (0.0046 < valueDouble && valueDouble <= 0.0091) woeValue = 0.677345;
    else if ( valueDouble > 0.0091) woeValue = 0.881503;
    else woeValue = 0;}else if(CP4WRtDclTxn.getName().equals(varName)){if (value == null) woeValue = -0.723282;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.252094;
    else if (0 < valueDouble && valueDouble <= 0.0244) woeValue = -0.504665;
    else if (0.0244 < valueDouble && valueDouble <= 0.0275) woeValue = -0.356627;
    else if (0.0275 < valueDouble && valueDouble <= 0.0316) woeValue = -0.312118;
    else if (0.0316 < valueDouble && valueDouble <= 0.0331) woeValue = -0.135683;
    else if (0.0331 < valueDouble && valueDouble <= 0.0437) woeValue = 0.012079;
    else if (0.0437 < valueDouble && valueDouble <= 0.0632) woeValue = 0.043163;
    else if (0.0632 < valueDouble && valueDouble <= 0.0744) woeValue = 0.254775;
    else if (0.0744 < valueDouble && valueDouble <= 0.1032) woeValue = 0.535726;
    else if (0.1032 < valueDouble && valueDouble <= 0.2609) woeValue = 0.796319;
    else if ( valueDouble > 0.2609) woeValue = 1.499571;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.068168;
    else if (-1e38 < valueDouble && valueDouble <= 0.0197946946) woeValue = -1.410125;
    else if (0.0197946946 < valueDouble && valueDouble <= 0.0325135411) woeValue = -1.196999;
    else if (0.0325135411 < valueDouble && valueDouble <= 0.0499908425) woeValue = -0.470027;
    else if (0.0499908425 < valueDouble && valueDouble <= 0.0670339761) woeValue = -0.439599;
    else if (0.0670339761 < valueDouble && valueDouble <= 0.0735033708) woeValue = 0.038130;
    else if (0.0735033708 < valueDouble && valueDouble <= 0.1502470113) woeValue = 0.067524;
    else if (0.1502470113 < valueDouble && valueDouble <= 0.232480035) woeValue = 0.977572;
    else if ( valueDouble > 0.232480035) woeValue = 1.171555;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = -0.723282;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.171632;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -0.750719;
    else if (0.0009 < valueDouble && valueDouble <= 0.001) woeValue = -0.555538;
    else if (0.001 < valueDouble && valueDouble <= 0.0013) woeValue = 0.045667;
    else if (0.0013 < valueDouble && valueDouble <= 0.0015) woeValue = 0.404575;
    else if ( valueDouble > 0.0015) woeValue = 0.589606;
    else woeValue = 0;}else if(PC_LT30K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.118491;
    else if (-1e38 < valueDouble && valueDouble <= 0.0219414894) woeValue = -0.972529;
    else if (0.0219414894 < valueDouble && valueDouble <= 0.0315789474) woeValue = -0.289471;
    else if (0.0315789474 < valueDouble && valueDouble <= 0.0705346985) woeValue = -0.195628;
    else if (0.0705346985 < valueDouble && valueDouble <= 0.0897332255) woeValue = 0.280953;
    else if (0.0897332255 < valueDouble && valueDouble <= 0.0944444444) woeValue = 0.903010;
    else if ( valueDouble > 0.0944444444) woeValue = 1.309444;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = -0.723282;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.415027;
    else if (0 < valueDouble && valueDouble <= 0.065) woeValue = 0.131440;
    else if (0.065 < valueDouble && valueDouble <= 0.0664) woeValue = 0.197827;
    else if (0.0664 < valueDouble && valueDouble <= 0.1554) woeValue = 0.355841;
    else if (0.1554 < valueDouble && valueDouble <= 0.5519) woeValue = 0.437028;
    else if (0.5519 < valueDouble && valueDouble <= 0.9995) woeValue = 1.229260;
    else if ( valueDouble > 0.9995) woeValue = 1.793310;
    else woeValue = 0;}else if(acct_cc_d_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.612280;
    else if (0 < valueDouble && valueDouble <= 0.0117) woeValue = 0.122929;
    else if (0.0117 < valueDouble && valueDouble <= 477.5772) woeValue = 0.576986;
    else if (477.5772 < valueDouble && valueDouble <= 1706.8788) woeValue = 0.755124;
    else if (1706.8788 < valueDouble && valueDouble <= 7493.4647) woeValue = 0.846169;
    else if (7493.4647 < valueDouble && valueDouble <= 23102.8366) woeValue = 1.604330;
    else if ( valueDouble > 23102.8366) woeValue = 1.819686;
    else woeValue = 0;}else if(acct_h_s_cnt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.482612;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = 0.807776;
    else if (0.0002 < valueDouble && valueDouble <= 0.0051) woeValue = 0.739316;
    else if (0.0051 < valueDouble && valueDouble <= 0.2017) woeValue = 0.271605;
    else if (0.2017 < valueDouble && valueDouble <= 0.8651) woeValue = -0.189622;
    else if (0.8651 < valueDouble && valueDouble <= 1.4751) woeValue = -0.517933;
    else if ( valueDouble > 1.4751) woeValue = -0.897460;
    else woeValue = 0;}else if(asp.getName().equals(varName)){if (value == null) woeValue = -0.086543;
    else if (-1e38 < valueDouble && valueDouble <= 399.73137255) woeValue = -0.897658;
    else if (399.73137255 < valueDouble && valueDouble <= 762.87217004) woeValue = -0.693091;
    else if (762.87217004 < valueDouble && valueDouble <= 2538.5882353) woeValue = -0.038006;
    else if (2538.5882353 < valueDouble && valueDouble <= 13678.667401) woeValue = 0.178242;
    else if ( valueDouble > 13678.667401) woeValue = 0.428192;
    else woeValue = 0;}else if(cc_num_unknown.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.128271;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.264277;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.505150;
    else if ( valueDouble > 3) woeValue = 0.718496;
    else woeValue = 0;}else if(cc_pct_credit_v2.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.311148;
    else if (0 < valueDouble && valueDouble <= 0.12) woeValue = 0.860344;
    else if (0.12 < valueDouble && valueDouble <= 0.25) woeValue = -0.030504;
    else if (0.25 < valueDouble && valueDouble <= 0.9714285714) woeValue = -0.431511;
    else if ( valueDouble > 0.9714285714) woeValue = -1.156453;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.599409;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.185590;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.216408;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.258280;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.383674;
    else if ( valueDouble > 3) woeValue = 0.876588;
    else woeValue = 0;}else if(ebay_dy_snc_sus_min_360all.getName().equals(varName)){if (value == null) woeValue = -0.121930;
    else if (-1e38 < valueDouble && valueDouble <= 16) woeValue = 2.003118;
    else if (16 < valueDouble && valueDouble <= 114) woeValue = 1.285178;
    else if (114 < valueDouble && valueDouble <= 458) woeValue = 1.105632;
    else if (458 < valueDouble && valueDouble <= 1636) woeValue = 0.766789;
    else if (1636 < valueDouble && valueDouble <= 2698) woeValue = 0.036900;
    else if ( valueDouble > 2698) woeValue = -0.571616;
    else woeValue = 0;}else if(email_MP_7d_UPIA_dk.getName().equals(varName)){if (value == null) woeValue = 0.427241;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.537112;
    else if (0 < valueDouble && valueDouble <= 3.8575E-22) woeValue = -1.544967;
    else if (3.8575E-22 < valueDouble && valueDouble <= 1.7121602E-7) woeValue = -0.485064;
    else if (1.7121602E-7 < valueDouble && valueDouble <= 0.0005149563) woeValue = -0.357656;
    else if (0.0005149563 < valueDouble && valueDouble <= 0.9988239435) woeValue = -0.103737;
    else if (0.9988239435 < valueDouble && valueDouble <= 1.8141740979) woeValue = -0.020226;
    else if ( valueDouble > 1.8141740979) woeValue = 1.786747;
    else woeValue = 0;}else if(ip_nb_cnt_pst_1y.getName().equals(varName)){if (value == null) woeValue = 0.059127;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.905969;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.073820;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.084058;
    else if (2 < valueDouble && valueDouble <= 617) woeValue = 0.127046;
    else if ( valueDouble > 617) woeValue = 0.547840;
    else woeValue = 0;}else if(ipr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0051107934) woeValue = -1.064092;
    else if (0.0051107934 < valueDouble && valueDouble <= 0.0098731344) woeValue = -1.017572;
    else if (0.0098731344 < valueDouble && valueDouble <= 0.0138999835) woeValue = -0.882600;
    else if (0.0138999835 < valueDouble && valueDouble <= 0.0490884827) woeValue = -0.636137;
    else if (0.0490884827 < valueDouble && valueDouble <= 0.2518593218) woeValue = -0.026050;
    else if (0.2518593218 < valueDouble && valueDouble <= 0.2748791465) woeValue = 0.225284;
    else if (0.2748791465 < valueDouble && valueDouble <= 3.4153846154) woeValue = 0.304652;
    else if ( valueDouble > 3.4153846154) woeValue = 1.026788;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.067654;
    else if ( valueDouble > 0) woeValue = -0.458607;
    else woeValue = 0;}else if(nall_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.492323;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.742651;
    else if (0 < valueDouble && valueDouble <= 0.018134715) woeValue = -1.490341;
    else if (0.018134715 < valueDouble && valueDouble <= 0.044386423) woeValue = -1.140768;
    else if (0.044386423 < valueDouble && valueDouble <= 0.2013888889) woeValue = -0.838850;
    else if (0.2013888889 < valueDouble && valueDouble <= 0.3333333333) woeValue = -0.471367;
    else if (0.3333333333 < valueDouble && valueDouble <= 0.5309734513) woeValue = -0.318938;
    else if (0.5309734513 < valueDouble && valueDouble <= 0.8448275862) woeValue = -0.209407;
    else if (0.8448275862 < valueDouble && valueDouble <= 2.1081081081) woeValue = -0.046907;
    else if (2.1081081081 < valueDouble && valueDouble <= 5.380952381) woeValue = 0.108111;
    else if ( valueDouble > 5.380952381) woeValue = 0.533263;
    else woeValue = 0;}else if(ncc_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = -0.495062;
    else if (-1e38 < valueDouble && valueDouble <= 2695.0666667) woeValue = 0.429830;
    else if (2695.0666667 < valueDouble && valueDouble <= 64464) woeValue = -0.097320;
    else if ( valueDouble > 64464) woeValue = -0.281554;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.437364;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.674602;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.544712;
    else if (3 < valueDouble && valueDouble <= 5) woeValue = -0.447112;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = -0.086998;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = -0.075176;
    else if (8 < valueDouble && valueDouble <= 9) woeValue = -0.039841;
    else if (9 < valueDouble && valueDouble <= 11) woeValue = 0.272468;
    else if (11 < valueDouble && valueDouble <= 14) woeValue = 0.342707;
    else if (14 < valueDouble && valueDouble <= 17) woeValue = 0.922544;
    else if (17 < valueDouble && valueDouble <= 23) woeValue = 1.395229;
    else if (23 < valueDouble && valueDouble <= 35) woeValue = 1.813946;
    else if ( valueDouble > 35) woeValue = 2.337484;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 2.126724;
    else if (-1e38 < valueDouble && valueDouble <= 0.2038591605) woeValue = -0.890989;
    else if (0.2038591605 < valueDouble && valueDouble <= 0.3990907294) woeValue = -0.814116;
    else if (0.3990907294 < valueDouble && valueDouble <= 0.7244005642) woeValue = -0.558610;
    else if (0.7244005642 < valueDouble && valueDouble <= 0.9659726104) woeValue = -0.338097;
    else if (0.9659726104 < valueDouble && valueDouble <= 1.7768534601) woeValue = -0.005113;
    else if (1.7768534601 < valueDouble && valueDouble <= 2.1033157875) woeValue = 0.301369;
    else if (2.1033157875 < valueDouble && valueDouble <= 2.5996331499) woeValue = 0.415083;
    else if (2.5996331499 < valueDouble && valueDouble <= 3.3945042391) woeValue = 0.789550;
    else if (3.3945042391 < valueDouble && valueDouble <= 8.4991243433) woeValue = 1.229965;
    else if ( valueDouble > 8.4991243433) woeValue = 2.819104;
    else woeValue = 0;}else if(outstd_iach_amt2.getName().equals(varName)){if (value == null) woeValue = 1.239197;
    else if (-1e38 < valueDouble && valueDouble <= 480) woeValue = -0.670013;
    else if (480 < valueDouble && valueDouble <= 17999) woeValue = -0.521164;
    else if (17999 < valueDouble && valueDouble <= 20193) woeValue = -0.171090;
    else if (20193 < valueDouble && valueDouble <= 22697) woeValue = -0.086469;
    else if (22697 < valueDouble && valueDouble <= 30105) woeValue = 0.056110;
    else if (30105 < valueDouble && valueDouble <= 44055) woeValue = 0.381831;
    else if (44055 < valueDouble && valueDouble <= 56300) woeValue = 0.888680;
    else if (56300 < valueDouble && valueDouble <= 77037) woeValue = 1.159779;
    else if (77037 < valueDouble && valueDouble <= 125099) woeValue = 1.529299;
    else if ( valueDouble > 125099) woeValue = 2.242291;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.144393;
    else if (-1e38 < valueDouble && valueDouble <= 0.0897110194) woeValue = -0.463819;
    else if (0.0897110194 < valueDouble && valueDouble <= 0.1890959282) woeValue = -0.414451;
    else if (0.1890959282 < valueDouble && valueDouble <= 0.2379392496) woeValue = -0.321985;
    else if (0.2379392496 < valueDouble && valueDouble <= 0.3263214286) woeValue = -0.166781;
    else if (0.3263214286 < valueDouble && valueDouble <= 0.7226666667) woeValue = -0.063343;
    else if (0.7226666667 < valueDouble && valueDouble <= 0.971042471) woeValue = 0.129552;
    else if (0.971042471 < valueDouble && valueDouble <= 6.702057067) woeValue = 0.587340;
    else if ( valueDouble > 6.702057067) woeValue = 1.031797;
    else woeValue = 0;}else if(r_ratio_max_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0.0494) woeValue = -0.278096;
    else if (0.0494 < valueDouble && valueDouble <= 0.2576) woeValue = -0.267237;
    else if (0.2576 < valueDouble && valueDouble <= 0.7143) woeValue = -0.030695;
    else if ( valueDouble > 0.7143) woeValue = 0.206864;
    else woeValue = 0;}else if(rcvr_cc_d_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.287152;
    else if (0 < valueDouble && valueDouble <= 1863.8332) woeValue = -0.423262;
    else if (1863.8332 < valueDouble && valueDouble <= 9707.3777) woeValue = -0.394677;
    else if (9707.3777 < valueDouble && valueDouble <= 29458.7859) woeValue = -0.164779;
    else if (29458.7859 < valueDouble && valueDouble <= 84438.2658) woeValue = 0.156697;
    else if (84438.2658 < valueDouble && valueDouble <= 183562.9356) woeValue = 0.329100;
    else if (183562.9356 < valueDouble && valueDouble <= 2672739.0221) woeValue = 0.651879;
    else if ( valueDouble > 2672739.0221) woeValue = 1.532022;
    else woeValue = 0;}else if(return_lt_30d_cnt.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.290499;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.227882;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.122750;
    else if (2 < valueDouble && valueDouble <= 5) woeValue = 0.659058;
    else if (5 < valueDouble && valueDouble <= 10) woeValue = 1.186923;
    else if ( valueDouble > 10) woeValue = 1.930143;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.190450;
    else if (0 < valueDouble && valueDouble <= 0.477) woeValue = 0.034726;
    else if ( valueDouble > 0.477) woeValue = 1.174741;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.312614;
    else if (0 < valueDouble && valueDouble <= 706) woeValue = 1.420592;
    else if (706 < valueDouble && valueDouble <= 6819) woeValue = 0.639776;
    else if (6819 < valueDouble && valueDouble <= 19882) woeValue = 0.456929;
    else if (19882 < valueDouble && valueDouble <= 50968) woeValue = 0.327756;
    else if (50968 < valueDouble && valueDouble <= 72426) woeValue = 0.051934;
    else if (72426 < valueDouble && valueDouble <= 110144) woeValue = -0.124835;
    else if (110144 < valueDouble && valueDouble <= 163241) woeValue = -0.428685;
    else if (163241 < valueDouble && valueDouble <= 2904927) woeValue = -0.592840;
    else if ( valueDouble > 2904927) woeValue = -1.100119;
    else woeValue = 0;}else if(s_mp_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.0365563;
    else if (0 < valueDouble && valueDouble <= 1307.0465) woeValue = -0.876172;
    else if (1307.0465 < valueDouble && valueDouble <= 2085.545) woeValue = -0.677463;
    else if (2085.545 < valueDouble && valueDouble <= 3285.3007) woeValue = -0.663008;
    else if (3285.3007 < valueDouble && valueDouble <= 4191.7487) woeValue = -0.574344;
    else if (4191.7487 < valueDouble && valueDouble <= 5436.1592) woeValue = -0.521272;
    else if (5436.1592 < valueDouble && valueDouble <= 10427.0828) woeValue = -0.150706;
    else if (10427.0828 < valueDouble && valueDouble <= 32075.8171) woeValue = 0.568925;
    else if ( valueDouble > 32075.8171) woeValue = 1.901766;
    else woeValue = 0;}else if(s_v_outstd_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -0.001669449) woeValue = -4.000000;
    else if (-0.001669449 < valueDouble && valueDouble <= 0.066539924) woeValue = -0.449667;
    else if (0.066539924 < valueDouble && valueDouble <= 0.1333333333) woeValue = -0.392470;
    else if (0.1333333333 < valueDouble && valueDouble <= 0.1764705882) woeValue = -0.133713;
    else if (0.1764705882 < valueDouble && valueDouble <= 0.3333333333) woeValue = 0.086928;
    else if (0.3333333333 < valueDouble && valueDouble <= 0.3975903614) woeValue = 0.650637;
    else if (0.3975903614 < valueDouble && valueDouble <= 0.5555555556) woeValue = 0.696164;
    else if (0.5555555556 < valueDouble && valueDouble <= 0.8125) woeValue = 1.048315;
    else if (0.8125 < valueDouble && valueDouble <= 1) woeValue = 1.095166;
    else if (1 < valueDouble && valueDouble <= 1.9666666667) woeValue = 1.789864;
    else if ( valueDouble > 1.9666666667) woeValue = 2.375650;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.3325183374) woeValue = 3.133063;
    else if (0.3325183374 < valueDouble && valueDouble <= 0.4805194805) woeValue = 2.170903;
    else if (0.4805194805 < valueDouble && valueDouble <= 0.5497835498) woeValue = 1.284736;
    else if (0.5497835498 < valueDouble && valueDouble <= 0.599469496) woeValue = 1.186492;
    else if (0.599469496 < valueDouble && valueDouble <= 0.7101910828) woeValue = 0.933973;
    else if (0.7101910828 < valueDouble && valueDouble <= 0.7446808511) woeValue = 0.486039;
    else if (0.7446808511 < valueDouble && valueDouble <= 0.8197969543) woeValue = 0.079589;
    else if (0.8197969543 < valueDouble && valueDouble <= 0.8888888889) woeValue = -0.418336;
    else if (0.8888888889 < valueDouble && valueDouble <= 0.9101123596) woeValue = -0.836707;
    else if (0.9101123596 < valueDouble && valueDouble <= 0.9428571429) woeValue = -0.978062;
    else if ( valueDouble > 0.9428571429) woeValue = -1.184840;
    else woeValue = 0;}else if(seconds_since_last_return.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.842982;
    else if (-1 < valueDouble && valueDouble <= 68163) woeValue = 1.670921;
    else if (68163 < valueDouble && valueDouble <= 127671) woeValue = 1.475940;
    else if (127671 < valueDouble && valueDouble <= 291253) woeValue = 1.204785;
    else if (291253 < valueDouble && valueDouble <= 380864) woeValue = 0.417606;
    else if (380864 < valueDouble && valueDouble <= 477345) woeValue = 0.274779;
    else if ( valueDouble > 477345) woeValue = -0.064775;
    else woeValue = 0;}else if(snr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.099559;
    else if (-1e38 < valueDouble && valueDouble <= 0.0579411765) woeValue = 0.164881;
    else if (0.0579411765 < valueDouble && valueDouble <= 0.2338283646) woeValue = 0.476936;
    else if (0.2338283646 < valueDouble && valueDouble <= 0.3493451911) woeValue = 0.611020;
    else if (0.3493451911 < valueDouble && valueDouble <= 1.1178444798) woeValue = 0.757328;
    else if (1.1178444798 < valueDouble && valueDouble <= 1.9952114924) woeValue = 0.942186;
    else if ( valueDouble > 1.9952114924) woeValue = 1.832060;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = -0.086543;
    else if (-1e38 < valueDouble && valueDouble <= 0.015) woeValue = 0.604347;
    else if (0.015 < valueDouble && valueDouble <= 0.029) woeValue = 0.164652;
    else if (0.029 < valueDouble && valueDouble <= 0.032) woeValue = 0.116925;
    else if (0.032 < valueDouble && valueDouble <= 0.033) woeValue = 0.049352;
    else if (0.033 < valueDouble && valueDouble <= 0.141) woeValue = -0.075664;
    else if (0.141 < valueDouble && valueDouble <= 0.166) woeValue = -0.208178;
    else if ( valueDouble > 0.166) woeValue = -0.229791;
    else woeValue = 0;}else if(txnsnt_amt_stss_max_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = -0.469439;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.076310;
    else if (-1 < valueDouble && valueDouble <= 9.99) woeValue = -0.116133;
    else if (9.99 < valueDouble && valueDouble <= 24.99) woeValue = 0.220177;
    else if (24.99 < valueDouble && valueDouble <= 49.99) woeValue = 0.934001;
    else if ( valueDouble > 49.99) woeValue = 1.588997;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.647227;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.153661;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.318013;
    else if (3 < valueDouble && valueDouble <= 9) woeValue = -0.161235;
    else if (9 < valueDouble && valueDouble <= 10) woeValue = 0.150065;
    else if ( valueDouble > 10) woeValue = 0.250087;
    else woeValue = 0;}else if(v36_login_exces_10m.getName().equals(varName)){if (value == null) woeValue = -0.305154;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.366992;
    else if ( valueDouble > 0) woeValue = -0.094187;
    else woeValue = 0;}else if(v36_tx_cnt_in_last_1d.getName().equals(varName)){if (value == null) woeValue = -0.305252;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = -0.271393;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.058452;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.328744;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 0.708914;
    else if (8 < valueDouble && valueDouble <= 10) woeValue = 1.009340;
    else if ( valueDouble > 10) woeValue = 1.738292;
    else woeValue = 0;}else if(v2_ad_type_indicative.getName().equals(varName)){if (Arrays.asList( "EDU","_MISSING_","CRAPPY","RESHIPPER","HOTEL","MIL").contains(value)) woeValue = -1.622968;
    else if (Arrays.asList( "CONTROLLED"," ").contains(value)) woeValue = -0.328908;
    else if (Arrays.asList( "OTHER").contains(value)) woeValue = 0.008633;
    else if (Arrays.asList( "NO_CCS").contains(value)) woeValue = 0.099556;
    else woeValue = 0;}else if(v3_ip_ad_dist_best.getName().equals(varName)){if (Arrays.asList( "_MISSING_"," ").contains(value)) woeValue = -0.293023;
    else if (Arrays.asList( "MED_DIST","CLOSE_DIST").contains(value)) woeValue = -0.118913;
    else if (Arrays.asList( "LOW_DIST","EXACT_DIST").contains(value)) woeValue = 0.080274;
    else if (Arrays.asList( "MM_ERROR","HIGH_DIST","ULT_DIST").contains(value)) woeValue = 0.315679;
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
    
    coeffMap.put("Intercept",+2.98400308);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.24212926);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.22580685);
    coeffMap.put(acct_h_s_cnt_dk_320.getName(),-0.79988632);
    coeffMap.put(outstd_iach_amt2.getName(),-0.37427606);
    coeffMap.put(num_logins_3_days.getName(),-0.13475894);
    coeffMap.put(s_mp_amt_dk_20.getName(),-0.13765322);
    coeffMap.put(acct_cc_d_amt_dk_80.getName(),-0.37814256);
    coeffMap.put(s_v_outstd_ratio_num.getName(),-0.34125934);
    coeffMap.put(seconds_since_last_return.getName(),-0.83498669);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.41260703);
    coeffMap.put(v36_tx_cnt_in_last_1d.getName(),-0.27500395);
    coeffMap.put(return_lt_30d_cnt.getName(),-0.31540901);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.23163146);
    coeffMap.put(PC_LT30K_Income_CCBIN.getName(),-0.41905605);
    coeffMap.put(nall_failed_ratio.getName(),-0.43756949);
    coeffMap.put(email_MP_7d_UPIA_dk.getName(),-0.28915602);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.06732547);
    coeffMap.put(CP4WRtDclTxn.getName(),-0.26835780);
    coeffMap.put(cc_pct_credit_v2.getName(),-0.39340337);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.72340285);
    coeffMap.put(CP4WRtAtoBadAcc.getName(),-0.40349121);
    coeffMap.put(rcvr_cc_d_amt_dk_160.getName(),-0.38184549);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.63083616);
    coeffMap.put(rt_r8r16_hr.getName(),-0.26298481);
    coeffMap.put(ebay_dy_snc_sus_min_360all.getName(),-0.59773809);
    coeffMap.put(txnsnt_amt_stss_max_lst_48_hrs.getName(),-0.14329378);
    coeffMap.put(ncc_failed_amt_avg.getName(),-0.38801125);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.24907985);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.40406967);
    coeffMap.put(snr_ratio_4w_uaa_dol.getName(),-0.27748144);
    coeffMap.put(ip_nb_cnt_pst_1y.getName(),-0.59155497);
    coeffMap.put(cc_num_unknown.getName(),-0.20932235);
    coeffMap.put(asp.getName(),-0.58140155);
    coeffMap.put(Bad_rate_amt_ccbin.getName(),-0.29042959);
    coeffMap.put(r_ratio_max_dk_320.getName(),-0.72646687);
    coeffMap.put(v36_login_exces_10m.getName(),-1.03888789);
    coeffMap.put(is_credit_union.getName(),-0.53471282);
    coeffMap.put(top_bin_amt_pct.getName(),-0.12491162);
    coeffMap.put(ipr_ratio_4w_uaa_dol.getName(),-0.30026458);
    coeffMap.put(v3_ip_ad_dist_best.getName(),-0.21942286);
    coeffMap.put(v2_ad_type_indicative.getName(),-0.18697114);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 849.58035655;
  }

  @Override
  public double getCoeff2() {
    return  -58.30139586;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT1;
  }
  
}