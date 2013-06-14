package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg5 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(acct_txnsnt_tsnclst_dg);
    variables.add(sum_failed_bufs_30d);
    variables.add(MOA_V_MOALife);
    variables.add(s_pmts_rcvd_amt);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(CP4WRtDolBadTxn);
    variables.add(s_avg_dk_320);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(PC_LT50K_Income_CCBIN);
    variables.add(wach_n_authorized);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(acct_h_s_amt_dk_160);
    variables.add(v35_sent_amt_usd_in_last_1d);
    variables.add(n_ebay_lnkd_360all);
    variables.add(s_v_tx_ratio_num);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(cc_decline_30d_dk__cnt);
    variables.add(nach_amt_max_ratio);
    variables.add(billing_shipping_zip_match);
    variables.add(MOC_V_MOCLife);
    variables.add(num_logins_3_days);
    variables.add(rt_num_rate);
    variables.add(wach_n_inactive);
    variables.add(s_rtrn_decay_90d_cnt);
    variables.add(v3_account_age);
    variables.add(is_credit_union);
    variables.add(rt_r8r16_hr);
    variables.add(top_bin_amt_pct);
    variables.add(s_ms_cnt_dk_40);
    variables.add(email_MP_10d_txn_dk);
    variables.add(v36_d_sn_prev_login);
    variables.add(ebay_dy_snc_sus_min_360all);
    variables.add(v2_ip_bin_ctry_score_worst);
    variables.add(s_outstd_iach_amt_orig);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.396220;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -0.647334;
    else if (0.002 < valueDouble && valueDouble <= 0.0036) woeValue = -0.376731;
    else if (0.0036 < valueDouble && valueDouble <= 0.0053) woeValue = -0.040467;
    else if (0.0053 < valueDouble && valueDouble <= 0.0064) woeValue = 0.109692;
    else if (0.0064 < valueDouble && valueDouble <= 0.012) woeValue = 0.526675;
    else if ( valueDouble > 0.012) woeValue = 0.728574;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.039243;
    else if ( valueDouble > 0) woeValue = 1.062014;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2436579468) woeValue = -0.182653;
    else if (0.2436579468 < valueDouble && valueDouble <= 0.4539998006) woeValue = -0.179486;
    else if (0.4539998006 < valueDouble && valueDouble <= 0.4974707832) woeValue = -0.017586;
    else if (0.4974707832 < valueDouble && valueDouble <= 0.6807658918) woeValue = 0.053105;
    else if (0.6807658918 < valueDouble && valueDouble <= 0.7709913723) woeValue = 0.148859;
    else if (0.7709913723 < valueDouble && valueDouble <= 1.0143723221) woeValue = 0.581958;
    else if (1.0143723221 < valueDouble && valueDouble <= 1.5100211558) woeValue = 1.022975;
    else if ( valueDouble > 1.5100211558) woeValue = 1.483952;
    else woeValue = 0;}else if(MOC_V_MOCLife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.8333333333) woeValue = -0.048081;
    else if (0.8333333333 < valueDouble && valueDouble <= 1) woeValue = -0.010140;
    else if (1 < valueDouble && valueDouble <= 1.3888888889) woeValue = 0.515410;
    else if ( valueDouble > 1.3888888889) woeValue = 0.791469;
    else woeValue = 0;}else if(PC_LT50K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.231873;
    else if (-1e38 < valueDouble && valueDouble <= 0.0415355074) woeValue = -0.867126;
    else if (0.0415355074 < valueDouble && valueDouble <= 0.0516206483) woeValue = -0.428162;
    else if (0.0516206483 < valueDouble && valueDouble <= 0.0580152672) woeValue = -0.248521;
    else if (0.0580152672 < valueDouble && valueDouble <= 0.0642927794) woeValue = -0.175773;
    else if (0.0642927794 < valueDouble && valueDouble <= 0.0717844291) woeValue = -0.089833;
    else if (0.0717844291 < valueDouble && valueDouble <= 0.0816993464) woeValue = -0.031226;
    else if (0.0816993464 < valueDouble && valueDouble <= 0.0999026696) woeValue = 0.127777;
    else if (0.0999026696 < valueDouble && valueDouble <= 0.1335180055) woeValue = 0.196064;
    else if (0.1335180055 < valueDouble && valueDouble <= 0.1423874557) woeValue = 0.464685;
    else if ( valueDouble > 0.1423874557) woeValue = 0.715205;
    else woeValue = 0;}else if(acct_h_s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0077) woeValue = 2.657446;
    else if (0.0077 < valueDouble && valueDouble <= 0.114) woeValue = 1.445092;
    else if (0.114 < valueDouble && valueDouble <= 0.6569) woeValue = 1.192278;
    else if (0.6569 < valueDouble && valueDouble <= 7.3927) woeValue = 1.003772;
    else if (7.3927 < valueDouble && valueDouble <= 24.7857) woeValue = 0.788156;
    else if (24.7857 < valueDouble && valueDouble <= 56.0429) woeValue = 0.554118;
    else if (56.0429 < valueDouble && valueDouble <= 150.9392) woeValue = 0.166231;
    else if (150.9392 < valueDouble && valueDouble <= 198.7115) woeValue = 0.100585;
    else if (198.7115 < valueDouble && valueDouble <= 1126.727) woeValue = -0.200581;
    else if (1126.727 < valueDouble && valueDouble <= 1818.1234) woeValue = -0.603891;
    else if (1818.1234 < valueDouble && valueDouble <= 2517.7671) woeValue = -0.623223;
    else if (2517.7671 < valueDouble && valueDouble <= 3840.22) woeValue = -0.674227;
    else if (3840.22 < valueDouble && valueDouble <= 23424.9876) woeValue = -0.709836;
    else if (23424.9876 < valueDouble && valueDouble <= 52391.8862) woeValue = -0.778199;
    else if ( valueDouble > 52391.8862) woeValue = -1.270219;
    else woeValue = 0;}else if(acct_txnsnt_tsnclst_dg.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.337954;
    else if (-1 < valueDouble && valueDouble <= 1245) woeValue = 1.175828;
    else if (1245 < valueDouble && valueDouble <= 70279) woeValue = 0.792401;
    else if (70279 < valueDouble && valueDouble <= 186239) woeValue = 0.219813;
    else if (186239 < valueDouble && valueDouble <= 13128285) woeValue = 0.061152;
    else if (13128285 < valueDouble && valueDouble <= 32216382) woeValue = -0.052483;
    else if (32216382 < valueDouble && valueDouble <= 45304033) woeValue = -0.281558;
    else if ( valueDouble > 45304033) woeValue = -0.568360;
    else woeValue = 0;}else if(billing_shipping_zip_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.223007;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.444887;
    else if ( valueDouble > 1) woeValue = 0.572775;
    else woeValue = 0;}else if(cc_decline_30d_dk__cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.619046;
    else if (0 < valueDouble && valueDouble <= 0.0003407386) woeValue = -0.298543;
    else if (0.0003407386 < valueDouble && valueDouble <= 0.0047569125) woeValue = -0.131714;
    else if (0.0047569125 < valueDouble && valueDouble <= 0.0187608953) woeValue = 0.132293;
    else if (0.0187608953 < valueDouble && valueDouble <= 0.1333797025) woeValue = 0.379965;
    else if (0.1333797025 < valueDouble && valueDouble <= 0.7035328088) woeValue = 0.581564;
    else if (0.7035328088 < valueDouble && valueDouble <= 0.9249232653) woeValue = 0.952786;
    else if (0.9249232653 < valueDouble && valueDouble <= 1.2859345296) woeValue = 1.051693;
    else if (1.2859345296 < valueDouble && valueDouble <= 3.7123057789) woeValue = 1.242668;
    else if ( valueDouble > 3.7123057789) woeValue = 1.904612;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.053609;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.150264;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.712092;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = 1.096549;
    else if ( valueDouble > 3) woeValue = 1.108481;
    else woeValue = 0;}else if(ebay_dy_snc_sus_min_360all.getName().equals(varName)){if (value == null) woeValue = -0.091498;
    else if (-1e38 < valueDouble && valueDouble <= 255) woeValue = 2.007459;
    else if (255 < valueDouble && valueDouble <= 318) woeValue = 1.793597;
    else if (318 < valueDouble && valueDouble <= 734) woeValue = 0.970427;
    else if (734 < valueDouble && valueDouble <= 1738) woeValue = 0.722645;
    else if (1738 < valueDouble && valueDouble <= 2346) woeValue = 0.409303;
    else if (2346 < valueDouble && valueDouble <= 2834) woeValue = 0.137459;
    else if (2834 < valueDouble && valueDouble <= 3157) woeValue = -0.063586;
    else if ( valueDouble > 3157) woeValue = -0.264743;
    else woeValue = 0;}else if(email_MP_10d_txn_dk.getName().equals(varName)){if (value == null) woeValue = 0.261745;
    else if (-1e38 < valueDouble && valueDouble <= 0.0000224904) woeValue = 0.645254;
    else if (0.0000224904 < valueDouble && valueDouble <= 0.0006079223) woeValue = 0.497766;
    else if (0.0006079223 < valueDouble && valueDouble <= 0.0390254069) woeValue = 0.440652;
    else if (0.0390254069 < valueDouble && valueDouble <= 0.0613379479) woeValue = 0.239399;
    else if (0.0613379479 < valueDouble && valueDouble <= 0.3306103756) woeValue = -0.109421;
    else if (0.3306103756 < valueDouble && valueDouble <= 1.0718710148) woeValue = -0.425292;
    else if (1.0718710148 < valueDouble && valueDouble <= 32.566187808) woeValue = -0.537024;
    else if ( valueDouble > 32.566187808) woeValue = -0.675994;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.050933;
    else if ( valueDouble > 0) woeValue = -0.295810;
    else woeValue = 0;}else if(n_ebay_lnkd_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.053609;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.237127;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.128451;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.238024;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.441031;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.463554;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.728606;
    else if ( valueDouble > 6) woeValue = 0.830476;
    else woeValue = 0;}else if(nach_amt_max_ratio.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0130942925) woeValue = -0.470201;
    else if (0.0130942925 < valueDouble && valueDouble <= 0.0237607359) woeValue = -0.211787;
    else if (0.0237607359 < valueDouble && valueDouble <= 0.0473592233) woeValue = -0.185306;
    else if (0.0473592233 < valueDouble && valueDouble <= 0.0778151024) woeValue = -0.138796;
    else if (0.0778151024 < valueDouble && valueDouble <= 0.1048906391) woeValue = -0.064918;
    else if (0.1048906391 < valueDouble && valueDouble <= 0.1994840929) woeValue = 0.017029;
    else if (0.1994840929 < valueDouble && valueDouble <= 0.2855902778) woeValue = 0.230140;
    else if (0.2855902778 < valueDouble && valueDouble <= 0.6428571429) woeValue = 0.601825;
    else if (0.6428571429 < valueDouble && valueDouble <= 0.98) woeValue = 0.944721;
    else if ( valueDouble > 0.98) woeValue = 1.552533;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.817554;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.503914;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = -0.339353;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = -0.051211;
    else if (5 < valueDouble && valueDouble <= 20) woeValue = 0.306754;
    else if ( valueDouble > 20) woeValue = 1.353337;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.523678;
    else if (-1e38 < valueDouble && valueDouble <= 0.0111329203) woeValue = -0.947554;
    else if (0.0111329203 < valueDouble && valueDouble <= 0.0263328297) woeValue = -0.902189;
    else if (0.0263328297 < valueDouble && valueDouble <= 0.0501602564) woeValue = -0.770864;
    else if (0.0501602564 < valueDouble && valueDouble <= 0.1209056604) woeValue = -0.604565;
    else if (0.1209056604 < valueDouble && valueDouble <= 0.240039383) woeValue = -0.517009;
    else if (0.240039383 < valueDouble && valueDouble <= 0.2823529412) woeValue = -0.292003;
    else if (0.2823529412 < valueDouble && valueDouble <= 0.4863455809) woeValue = -0.186657;
    else if (0.4863455809 < valueDouble && valueDouble <= 0.9594496741) woeValue = -0.052860;
    else if (0.9594496741 < valueDouble && valueDouble <= 2.9335740072) woeValue = 0.460486;
    else if ( valueDouble > 2.9335740072) woeValue = 0.788707;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = -0.156223;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.564902;
    else if (0 < valueDouble && valueDouble <= 0.001) woeValue = -1.209001;
    else if (0.001 < valueDouble && valueDouble <= 0.002) woeValue = -1.173999;
    else if (0.002 < valueDouble && valueDouble <= 0.005) woeValue = -0.653601;
    else if (0.005 < valueDouble && valueDouble <= 0.008) woeValue = -0.449529;
    else if (0.008 < valueDouble && valueDouble <= 0.009) woeValue = -0.192547;
    else if (0.009 < valueDouble && valueDouble <= 0.013) woeValue = 0.207085;
    else if (0.013 < valueDouble && valueDouble <= 0.02) woeValue = 0.295305;
    else if (0.02 < valueDouble && valueDouble <= 0.028) woeValue = 0.617757;
    else if ( valueDouble > 0.028) woeValue = 0.930794;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.166946;
    else if (0 < valueDouble && valueDouble <= 0.011) woeValue = 0.675557;
    else if ( valueDouble > 0.011) woeValue = 0.120717;
    else woeValue = 0;}else if(s_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11508.1579) woeValue = -0.014682;
    else if (11508.1579 < valueDouble && valueDouble <= 25880.3074) woeValue = 0.270046;
    else if ( valueDouble > 25880.3074) woeValue = 0.322591;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.059771;
    else if (0 < valueDouble && valueDouble <= 0.0468) woeValue = -0.388727;
    else if (0.0468 < valueDouble && valueDouble <= 0.2807) woeValue = -0.182844;
    else if (0.2807 < valueDouble && valueDouble <= 0.8579) woeValue = -0.133871;
    else if (0.8579 < valueDouble && valueDouble <= 1.5527) woeValue = 0.152270;
    else if (1.5527 < valueDouble && valueDouble <= 2.0019) woeValue = 0.316990;
    else if (2.0019 < valueDouble && valueDouble <= 2.8683) woeValue = 0.320623;
    else if (2.8683 < valueDouble && valueDouble <= 4.9667) woeValue = 0.951184;
    else if ( valueDouble > 4.9667) woeValue = 1.605166;
    else woeValue = 0;}else if(s_outstd_iach_amt_orig.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.126079;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.245572;
    else if (0 < valueDouble && valueDouble <= 12452) woeValue = -0.379734;
    else if (12452 < valueDouble && valueDouble <= 23568) woeValue = -0.164720;
    else if (23568 < valueDouble && valueDouble <= 37427) woeValue = 0.033410;
    else if (37427 < valueDouble && valueDouble <= 88300) woeValue = 0.313939;
    else if ( valueDouble > 88300) woeValue = 1.105158;
    else woeValue = 0;}else if(s_pmts_rcvd_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.129901;
    else if (0 < valueDouble && valueDouble <= 878) woeValue = 0.721621;
    else if (878 < valueDouble && valueDouble <= 319333) woeValue = 0.031005;
    else if ( valueDouble > 319333) woeValue = -0.200210;
    else woeValue = 0;}else if(s_rtrn_decay_90d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.317729;
    else if (0 < valueDouble && valueDouble <= 0.0005337489) woeValue = -0.765302;
    else if (0.0005337489 < valueDouble && valueDouble <= 0.1210975457) woeValue = -0.373924;
    else if (0.1210975457 < valueDouble && valueDouble <= 0.2573214777) woeValue = -0.157537;
    else if (0.2573214777 < valueDouble && valueDouble <= 0.3558189185) woeValue = -0.117397;
    else if (0.3558189185 < valueDouble && valueDouble <= 0.648344341) woeValue = 0.092832;
    else if (0.648344341 < valueDouble && valueDouble <= 1.1304106599) woeValue = 0.406833;
    else if (1.1304106599 < valueDouble && valueDouble <= 1.6073872805) woeValue = 0.553046;
    else if ( valueDouble > 1.6073872805) woeValue = 0.869497;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 20829067) woeValue = 0.209453;
    else if (20829067 < valueDouble && valueDouble <= 63647651) woeValue = -0.040641;
    else if ( valueDouble > 63647651) woeValue = -0.289077;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.7777777778) woeValue = 1.734451;
    else if (0.7777777778 < valueDouble && valueDouble <= 0.8203125) woeValue = 1.057507;
    else if (0.8203125 < valueDouble && valueDouble <= 0.84375) woeValue = 1.021609;
    else if (0.84375 < valueDouble && valueDouble <= 0.8594771242) woeValue = 0.706074;
    else if (0.8594771242 < valueDouble && valueDouble <= 0.9099378882) woeValue = 0.612093;
    else if (0.9099378882 < valueDouble && valueDouble <= 0.9401709402) woeValue = 0.270265;
    else if (0.9401709402 < valueDouble && valueDouble <= 0.9698113208) woeValue = -0.123207;
    else if (0.9698113208 < valueDouble && valueDouble <= 0.9787234043) woeValue = -0.399586;
    else if (0.9787234043 < valueDouble && valueDouble <= 0.9837758112) woeValue = -0.537754;
    else if (0.9837758112 < valueDouble && valueDouble <= 0.9898477157) woeValue = -0.612406;
    else if (0.9898477157 < valueDouble && valueDouble <= 0.9966178129) woeValue = -1.049587;
    else if (0.9966178129 < valueDouble && valueDouble <= 0.9998405866) woeValue = -1.869683;
    else if ( valueDouble > 0.9998405866) woeValue = -1.094455;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.768589;
    else if ( valueDouble > 0) woeValue = -0.166149;
    else woeValue = 0;}else if(sum_failed_bufs_30d.getName().equals(varName)){if (value == null) woeValue = -0.016296;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 613) woeValue = 0.679088;
    else if (613 < valueDouble && valueDouble <= 48326) woeValue = 1.358032;
    else if ( valueDouble > 48326) woeValue = 3.243679;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = -0.177902;
    else if (-1e38 < valueDouble && valueDouble <= 0.015) woeValue = 0.573873;
    else if (0.015 < valueDouble && valueDouble <= 0.028) woeValue = 0.249364;
    else if (0.028 < valueDouble && valueDouble <= 0.032) woeValue = 0.201368;
    else if (0.032 < valueDouble && valueDouble <= 0.038) woeValue = 0.187212;
    else if (0.038 < valueDouble && valueDouble <= 0.081) woeValue = -0.206446;
    else if ( valueDouble > 0.081) woeValue = -0.454506;
    else woeValue = 0;}else if(v35_sent_amt_usd_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 140.99) woeValue = -0.154569;
    else if (140.99 < valueDouble && valueDouble <= 261) woeValue = 0.346509;
    else if (261 < valueDouble && valueDouble <= 758.28) woeValue = 0.833630;
    else if ( valueDouble > 758.28) woeValue = 1.321455;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.309945;
    else if (-1e38 < valueDouble && valueDouble <= 0.0014351852) woeValue = -0.255500;
    else if (0.0014351852 < valueDouble && valueDouble <= 15.185972222) woeValue = -0.234466;
    else if (15.185972222 < valueDouble && valueDouble <= 17.898912037) woeValue = -0.026143;
    else if (17.898912037 < valueDouble && valueDouble <= 25.23568287) woeValue = 0.015533;
    else if (25.23568287 < valueDouble && valueDouble <= 37.14650463) woeValue = 0.377232;
    else if (37.14650463 < valueDouble && valueDouble <= 48.191342593) woeValue = 0.610573;
    else if (48.191342593 < valueDouble && valueDouble <= 64.735532407) woeValue = 0.740389;
    else if ( valueDouble > 64.735532407) woeValue = 0.795620;
    else woeValue = 0;}else if(v3_account_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 345.28170139) woeValue = 1.168539;
    else if (345.28170139 < valueDouble && valueDouble <= 1119.308044) woeValue = 0.429244;
    else if (1119.308044 < valueDouble && valueDouble <= 1488.207662) woeValue = 0.331093;
    else if (1488.207662 < valueDouble && valueDouble <= 1682.9262731) woeValue = 0.027881;
    else if (1682.9262731 < valueDouble && valueDouble <= 1994.8723611) woeValue = -0.093604;
    else if (1994.8723611 < valueDouble && valueDouble <= 3079.80625) woeValue = -0.179813;
    else if (3079.80625 < valueDouble && valueDouble <= 3680.1575) woeValue = -0.281490;
    else if ( valueDouble > 3680.1575) woeValue = -0.487253;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 2.241236;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.472577;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.276984;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.057254;
    else if ( valueDouble > 3) woeValue = 0.143487;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.626227;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.184345;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.446164;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.553685;
    else if ( valueDouble > 3) woeValue = 0.945158;
    else woeValue = 0;}else if(v2_ip_bin_ctry_score_worst.getName().equals(varName)){if (Arrays.asList( "NO_CCS","EXCELLENT").contains(value)) woeValue = -0.912831;
    else if (Arrays.asList( "","MED","GOOD","BAD","EVIL").contains(value)) woeValue = 0.043547;
    else if (Arrays.asList( "NO_DATA","MM_ERROR","_MISSING_").contains(value)) woeValue = 0.978104;
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
    
    coeffMap.put("Intercept",+5.87275840);
    coeffMap.put(wach_n_authorized.getName(),-0.92663454);
    coeffMap.put(acct_h_s_amt_dk_160.getName(),-0.81210491);
    coeffMap.put(cc_decline_30d_dk__cnt.getName(),-0.59538877);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.33964966);
    coeffMap.put(s_rtrn_decay_90d_cnt.getName(),-0.81992983);
    coeffMap.put(num_logins_3_days.getName(),-0.39544739);
    coeffMap.put(wach_n_inactive.getName(),-0.73782539);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.76172818);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.31518887);
    coeffMap.put(rt_num_rate.getName(),-0.38411704);
    coeffMap.put(billing_shipping_zip_match.getName(),-0.29335982);
    coeffMap.put(email_MP_10d_txn_dk.getName(),-0.43604715);
    coeffMap.put(nach_amt_max_ratio.getName(),-0.33786118);
    coeffMap.put(MOA_V_MOALife.getName(),-0.70038015);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.33410259);
    coeffMap.put(v3_account_age.getName(),-0.88056630);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.34983411);
    coeffMap.put(v35_sent_amt_usd_in_last_1d.getName(),-0.29284863);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.44621533);
    coeffMap.put(s_outstd_iach_amt_orig.getName(),-0.47665165);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.25034146);
    coeffMap.put(PC_LT50K_Income_CCBIN.getName(),-0.68327073);
    coeffMap.put(ebay_dy_snc_sus_min_360all.getName(),-0.28045339);
    coeffMap.put(acct_txnsnt_tsnclst_dg.getName(),-0.32732463);
    coeffMap.put(n_ebay_lnkd_360all.getName(),-0.39496450);
    coeffMap.put(top_bin_amt_pct.getName(),-0.52608117);
    coeffMap.put(rt_r8r16_hr.getName(),-1.05902355);
    coeffMap.put(v2_ip_bin_ctry_score_worst.getName(),-0.70679449);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.58180856);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.78717414);
    coeffMap.put(MOC_V_MOCLife.getName(),-0.77845412);
    coeffMap.put(s_pmts_rcvd_amt.getName(),-0.58865331);
    coeffMap.put(sum_failed_bufs_30d.getName(),-0.45597706);
    coeffMap.put(is_credit_union.getName(),-0.78171630);
    coeffMap.put(s_avg_dk_320.getName(),-1.21045720);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 813.33057933;
  }

  @Override
  public double getCoeff2() {
    return  -49.91078824;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT5;
  }
  
}