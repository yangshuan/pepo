package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg9 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(r_ratio_max_dk_320);
    variables.add(ip_avg_dk_160);
    variables.add(added_address_lt_7);
    variables.add(s_c_address_match);
    variables.add(CP4WRtDolBadTxn);
    variables.add(added_phone_lt_1);
    variables.add(s_rtrn_decay_5d_cnt);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_avg_dk_320);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(n_bdrt_Veri_txn);
    variables.add(acct_login_cnt_dk_20);
    variables.add(Decline_rate_ccbin);
    variables.add(n_ebay_lnkd_360all);
    variables.add(days_snc_last_achtxn);
    variables.add(outamt_to_max_cleard);
    variables.add(dy30_sum_hcnt);
    variables.add(is_MERCHANT_PULL);
    variables.add(max_ach_tof);
    variables.add(min_to_max_ach_tof);
    variables.add(v3_account_age_sm);
    variables.add(first_ach_txn_dof);
    variables.add(s_v_tx_ratio_num);
    variables.add(ach_outstd_age);
    variables.add(s_ms_cnt_dk_40);
    variables.add(wach_n_inactive);
    variables.add(v21_e_dom_score_worst);
    variables.add(v36_diff_vid_3d);
    variables.add(email_MP_d_snc_conf);
    variables.add(ratio_max);
    variables.add(dy30_sum_hsum);
    variables.add(ip_ratio_max_dk_40);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.380787;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -0.657912;
    else if (0.0009 < valueDouble && valueDouble <= 0.0015) woeValue = -0.557267;
    else if (0.0015 < valueDouble && valueDouble <= 0.0025) woeValue = -0.400310;
    else if (0.0025 < valueDouble && valueDouble <= 0.0041) woeValue = -0.257704;
    else if (0.0041 < valueDouble && valueDouble <= 0.0052) woeValue = -0.132757;
    else if (0.0052 < valueDouble && valueDouble <= 0.0088) woeValue = -0.032515;
    else if (0.0088 < valueDouble && valueDouble <= 0.0096) woeValue = 0.070263;
    else if (0.0096 < valueDouble && valueDouble <= 0.0105) woeValue = 0.249476;
    else if (0.0105 < valueDouble && valueDouble <= 0.0146) woeValue = 0.360860;
    else if ( valueDouble > 0.0146) woeValue = 1.215540;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.150493;
    else if (-1e38 < valueDouble && valueDouble <= 0.0240767349) woeValue = -0.552464;
    else if (0.0240767349 < valueDouble && valueDouble <= 0.0315757204) woeValue = -0.308678;
    else if (0.0315757204 < valueDouble && valueDouble <= 0.0561131564) woeValue = 0.058305;
    else if (0.0561131564 < valueDouble && valueDouble <= 0.1238624874) woeValue = 0.217928;
    else if (0.1238624874 < valueDouble && valueDouble <= 0.1715051302) woeValue = 0.779478;
    else if (0.1715051302 < valueDouble && valueDouble <= 0.1781256192) woeValue = 1.075911;
    else if ( valueDouble > 0.1781256192) woeValue = 1.554979;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.016179;
    else if ( valueDouble > 0) woeValue = 1.851946;
    else woeValue = 0;}else if(acct_login_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1.7415) woeValue = -0.357539;
    else if (1.7415 < valueDouble && valueDouble <= 2.9557) woeValue = -0.183222;
    else if (2.9557 < valueDouble && valueDouble <= 4.122) woeValue = -0.182202;
    else if (4.122 < valueDouble && valueDouble <= 4.9774) woeValue = -0.009912;
    else if (4.9774 < valueDouble && valueDouble <= 7.961) woeValue = 0.471960;
    else if ( valueDouble > 7.961) woeValue = 1.739332;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 21.782798834) woeValue = -0.100746;
    else if (21.782798834 < valueDouble && valueDouble <= 54.55) woeValue = 0.370817;
    else if (54.55 < valueDouble && valueDouble <= 88.656462585) woeValue = 0.399841;
    else if ( valueDouble > 88.656462585) woeValue = 1.298089;
    else woeValue = 0;}else if(added_address_lt_7.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.195024;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.060113;
    else if ( valueDouble > 2) woeValue = 1.264030;
    else woeValue = 0;}else if(added_phone_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.010538;
    else if ( valueDouble > 0) woeValue = 1.023340;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.751945;
    else if (0 < valueDouble && valueDouble <= 200) woeValue = -0.740283;
    else if (200 < valueDouble && valueDouble <= 242) woeValue = -0.664710;
    else if (242 < valueDouble && valueDouble <= 287) woeValue = -0.586023;
    else if (287 < valueDouble && valueDouble <= 298) woeValue = -0.397050;
    else if (298 < valueDouble && valueDouble <= 353) woeValue = -0.191715;
    else if (353 < valueDouble && valueDouble <= 456) woeValue = 0.030099;
    else if (456 < valueDouble && valueDouble <= 663) woeValue = 0.201056;
    else if ( valueDouble > 663) woeValue = 0.560851;
    else woeValue = 0;}else if(dy30_sum_hcnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.015727;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.827818;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.512078;
    else if (2 < valueDouble && valueDouble <= 5) woeValue = 0.653816;
    else if ( valueDouble > 5) woeValue = 1.701002;
    else woeValue = 0;}else if(dy30_sum_hsum.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.015727;
    else if (0 < valueDouble && valueDouble <= 26739) woeValue = -0.308429;
    else if ( valueDouble > 26739) woeValue = 0.906054;
    else woeValue = 0;}else if(email_MP_d_snc_conf.getName().equals(varName)){if (value == null) woeValue = 0.238653;
    else if (-1e38 < valueDouble && valueDouble <= 554) woeValue = 0.144579;
    else if (554 < valueDouble && valueDouble <= 2729) woeValue = -0.323387;
    else if (2729 < valueDouble && valueDouble <= 3748) woeValue = -0.515863;
    else if ( valueDouble > 3748) woeValue = -0.712839;
    else woeValue = 0;}else if(first_ach_txn_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.700205;
    else if (-1 < valueDouble && valueDouble <= 5) woeValue = 1.086276;
    else if ( valueDouble > 5) woeValue = -0.129707;
    else woeValue = 0;}else if(ip_avg_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.108314;
    else if (-1 < valueDouble && valueDouble <= 228.5249) woeValue = 0.543604;
    else if (228.5249 < valueDouble && valueDouble <= 418.5122) woeValue = 0.299840;
    else if (418.5122 < valueDouble && valueDouble <= 1559.7302) woeValue = 0.296474;
    else if (1559.7302 < valueDouble && valueDouble <= 7294.4709) woeValue = -0.112556;
    else if ( valueDouble > 7294.4709) woeValue = -0.242656;
    else woeValue = 0;}else if(ip_ratio_max_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.080654;
    else if (-1 < valueDouble && valueDouble <= 0.0179) woeValue = 0.621656;
    else if (0.0179 < valueDouble && valueDouble <= 1.0164) woeValue = 0.212426;
    else if ( valueDouble > 1.0164) woeValue = -0.252147;
    else woeValue = 0;}else if(is_MERCHANT_PULL.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.175515;
    else if ( valueDouble > 0) woeValue = 1.797855;
    else woeValue = 0;}else if(max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 111289735) woeValue = 0.126687;
    else if (111289735 < valueDouble && valueDouble <= 122283108) woeValue = -0.239248;
    else if (122283108 < valueDouble && valueDouble <= 135951090) woeValue = -0.343670;
    else if (135951090 < valueDouble && valueDouble <= 166206873) woeValue = -0.383663;
    else if ( valueDouble > 166206873) woeValue = -0.493843;
    else woeValue = 0;}else if(min_to_max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 3.053525;
    else if (-1 < valueDouble && valueDouble <= 0.9999996842) woeValue = 0.297256;
    else if ( valueDouble > 0.9999996842) woeValue = -0.191514;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.300567;
    else if (0 < valueDouble && valueDouble <= 0.00016) woeValue = -1.112946;
    else if (0.00016 < valueDouble && valueDouble <= 0.00047) woeValue = -0.616553;
    else if (0.00047 < valueDouble && valueDouble <= 0.00056) woeValue = -0.406394;
    else if (0.00056 < valueDouble && valueDouble <= 0.00313) woeValue = 0.039270;
    else if (0.00313 < valueDouble && valueDouble <= 0.00847) woeValue = 0.249919;
    else if (0.00847 < valueDouble && valueDouble <= 0.00929) woeValue = 0.912429;
    else if (0.00929 < valueDouble && valueDouble <= 0.0102) woeValue = 0.914272;
    else if ( valueDouble > 0.0102) woeValue = 1.190124;
    else woeValue = 0;}else if(n_ebay_lnkd_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.408544;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.345088;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.008706;
    else if ( valueDouble > 2) woeValue = 0.741085;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6876227898) woeValue = -0.236520;
    else if (0.6876227898 < valueDouble && valueDouble <= 1.7509677419) woeValue = -0.234248;
    else if (1.7509677419 < valueDouble && valueDouble <= 4.529219006) woeValue = 0.111409;
    else if (4.529219006 < valueDouble && valueDouble <= 6.1344922232) woeValue = 0.601112;
    else if (6.1344922232 < valueDouble && valueDouble <= 20.908424908) woeValue = 1.339627;
    else if ( valueDouble > 20.908424908) woeValue = 1.560475;
    else woeValue = 0;}else if(r_ratio_max_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = 0.000000;
    else if (-2 < valueDouble && valueDouble <= 0.6538) woeValue = -0.234017;
    else if ( valueDouble > 0.6538) woeValue = 0.241947;
    else woeValue = 0;}else if(ratio_max.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.040027;
    else if (-1 < valueDouble && valueDouble <= 0.4818518519) woeValue = -0.070323;
    else if (0.4818518519 < valueDouble && valueDouble <= 0.8862559242) woeValue = 0.197841;
    else if ( valueDouble > 0.8862559242) woeValue = 1.257987;
    else woeValue = 0;}else if(s_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 265.5043) woeValue = 0.540207;
    else if (265.5043 < valueDouble && valueDouble <= 1544) woeValue = 0.434859;
    else if (1544 < valueDouble && valueDouble <= 4777) woeValue = -0.097301;
    else if (4777 < valueDouble && valueDouble <= 16890.389) woeValue = -0.241582;
    else if (16890.389 < valueDouble && valueDouble <= 37293.7367) woeValue = -0.374052;
    else if ( valueDouble > 37293.7367) woeValue = -0.517779;
    else woeValue = 0;}else if(s_c_address_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.009969;
    else if ( valueDouble > 0) woeValue = 1.929545;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.226191;
    else if (0 < valueDouble && valueDouble <= 0.1529) woeValue = -0.484337;
    else if (0.1529 < valueDouble && valueDouble <= 0.5589) woeValue = -0.199902;
    else if (0.5589 < valueDouble && valueDouble <= 0.9966) woeValue = 0.644887;
    else if (0.9966 < valueDouble && valueDouble <= 2.5591) woeValue = 0.922556;
    else if ( valueDouble > 2.5591) woeValue = 2.974655;
    else woeValue = 0;}else if(s_rtrn_decay_5d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.070757;
    else if ( valueDouble > 0) woeValue = 0.980681;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 14033163) woeValue = 0.187222;
    else if (14033163 < valueDouble && valueDouble <= 99808335) woeValue = -0.104975;
    else if (99808335 < valueDouble && valueDouble <= 121649046) woeValue = -0.460150;
    else if ( valueDouble > 121649046) woeValue = -0.533804;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6373626374) woeValue = 1.751520;
    else if (0.6373626374 < valueDouble && valueDouble <= 0.928057554) woeValue = 1.057802;
    else if (0.928057554 < valueDouble && valueDouble <= 0.9452054795) woeValue = 0.420252;
    else if (0.9452054795 < valueDouble && valueDouble <= 0.9803278689) woeValue = 0.027770;
    else if (0.9803278689 < valueDouble && valueDouble <= 0.9980276134) woeValue = -0.064591;
    else if ( valueDouble > 0.9980276134) woeValue = -0.146807;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.969509;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.969509;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.301764;
    else if ( valueDouble > 2) woeValue = 0.051201;
    else woeValue = 0;}else if(v3_account_age_sm.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0001736111) woeValue = 0.245079;
    else if (0.0001736111 < valueDouble && valueDouble <= 362.98430556) woeValue = 0.037531;
    else if (362.98430556 < valueDouble && valueDouble <= 404.43684028) woeValue = -0.237477;
    else if (404.43684028 < valueDouble && valueDouble <= 1083.1764236) woeValue = -0.250919;
    else if ( valueDouble > 1083.1764236) woeValue = -0.598160;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.306545;
    else if ( valueDouble > 0) woeValue = 1.011643;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList(" ").contains(value)) woeValue = 0;
    else if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.749339;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.170357;
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
    
    coeffMap.put("Intercept",+4.12243855);
    coeffMap.put(min_to_max_ach_tof.getName(),-0.85075177);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.80304955);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.74787724);
    coeffMap.put(s_c_address_match.getName(),-0.86359462);
    coeffMap.put(is_MERCHANT_PULL.getName(),-0.63846557);
    coeffMap.put(s_rtrn_decay_5d_cnt.getName(),-1.10368023);
    coeffMap.put(max_ach_tof.getName(),-1.52095139);
    coeffMap.put(wach_n_inactive.getName(),-0.79383876);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.87454264);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.86364015);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.53847685);
    coeffMap.put(ip_avg_dk_160.getName(),-1.22949304);
    coeffMap.put(email_MP_d_snc_conf.getName(),-0.62711959);
    coeffMap.put(acct_login_cnt_dk_20.getName(),-0.41611751);
    coeffMap.put(v3_account_age_sm.getName(),-1.29765096);
    coeffMap.put(n_ebay_lnkd_360all.getName(),-0.40582427);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.39484072);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.24419284);
    coeffMap.put(added_address_lt_7.getName(),-0.81379988);
    coeffMap.put(first_ach_txn_dof.getName(),-0.49789203);
    coeffMap.put(ach_outstd_age.getName(),-0.34337085);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.28951359);
    coeffMap.put(s_avg_dk_320.getName(),-0.68065914);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.13838276);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.69265402);
    coeffMap.put(added_phone_lt_1.getName(),-0.58856315);
    coeffMap.put(dy30_sum_hcnt.getName(),-0.28381363);
    coeffMap.put(ip_ratio_max_dk_40.getName(),-0.93496276);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.23322150);
    coeffMap.put(dy30_sum_hsum.getName(),-0.45142918);
    coeffMap.put(ratio_max.getName(),-0.14017260);
    coeffMap.put(r_ratio_max_dk_320.getName(),-0.47548430);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 810.44166881;
  }

  @Override
  public double getCoeff2() {
    return  -54.19754308;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT9;
  }
  
}