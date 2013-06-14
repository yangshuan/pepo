package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg50 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v31_ip_shipping_billing_match);
    variables.add(ismobile);
    variables.add(outstd_iach_count2);
    variables.add(nach_failed_amt_avg);
    variables.add(cc_pct_passed_cvv2);
    variables.add(txnsnt_cnt_lst_24_hrs);
    variables.add(wach_n_authorized);
    variables.add(v31_ip_hopping_strict);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(last_name_lowcase);
    variables.add(a_rt_dcl_14dys);
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(ebay_dy_1yr_sus_avg_360all);
    variables.add(v36_d_sn_prev_login);
    variables.add(v2_e_ip_eq_indicative);
    variables.add(num_logins_3_days);
    variables.add(p90_dys_return);
    variables.add(v21_e_dom_score_worst);
    variables.add(cp_ratio_20w_ato_dol);
    variables.add(s_mp_amt_dk_20);
    variables.add(ratio_max);
    variables.add(s2r_txnsnt_cnt_stss_lst_48_hrs);
    variables.add(seen_same_bankid_90d_ago);
    variables.add(s_cc_s_amt_dk_80);
    variables.add(s_c_fso_match);
    variables.add(v3_browser_lang_match);
    variables.add(ebay_V_7d1Yr_ASP_360all);
    variables.add(CP4WRtDolBadTxn);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(n_bdrt_txn);
    variables.add(IP4WRtDolBadTxn);
    variables.add(Decline_rate_amt_ccbin);
    variables.add(added_ach_lt_1);
    variables.add(added_address_lt_7);
    variables.add(outamt_to_max_cleard);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.351089;
    else if (0 < valueDouble && valueDouble <= 0.0028) woeValue = -0.431712;
    else if (0.0028 < valueDouble && valueDouble <= 0.0033) woeValue = -0.287082;
    else if (0.0033 < valueDouble && valueDouble <= 0.0052) woeValue = -0.179221;
    else if (0.0052 < valueDouble && valueDouble <= 0.008) woeValue = -0.030564;
    else if (0.008 < valueDouble && valueDouble <= 0.0116) woeValue = 0.225315;
    else if (0.0116 < valueDouble && valueDouble <= 0.0194) woeValue = 0.510709;
    else if (0.0194 < valueDouble && valueDouble <= 0.0238) woeValue = 0.738090;
    else if ( valueDouble > 0.0238) woeValue = 1.748340;
    else woeValue = 0;}else if(Decline_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.025514;
    else if (-1e38 < valueDouble && valueDouble <= 0.0703588078) woeValue = -0.390630;
    else if (0.0703588078 < valueDouble && valueDouble <= 0.0925571576) woeValue = -0.347468;
    else if (0.0925571576 < valueDouble && valueDouble <= 0.1322682174) woeValue = -0.132780;
    else if (0.1322682174 < valueDouble && valueDouble <= 0.1405709322) woeValue = 0.045602;
    else if (0.1405709322 < valueDouble && valueDouble <= 0.1566202577) woeValue = 0.168140;
    else if (0.1566202577 < valueDouble && valueDouble <= 0.2687283293) woeValue = 0.298319;
    else if ( valueDouble > 0.2687283293) woeValue = 0.532067;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0059) woeValue = -0.143694;
    else if ( valueDouble > 0.0059) woeValue = 0.369280;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.009723;
    else if ( valueDouble > 0) woeValue = 1.665305;
    else woeValue = 0;}else if(a_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.160148;
    else if (0 < valueDouble && valueDouble <= 0.062712) woeValue = -0.242244;
    else if ( valueDouble > 0.062712) woeValue = 0.136565;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.066341;
    else if ( valueDouble > 0) woeValue = 1.573961;
    else woeValue = 0;}else if(added_address_lt_7.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.004777;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.022345;
    else if ( valueDouble > 2) woeValue = 1.006674;
    else woeValue = 0;}else if(cc_pct_passed_cvv2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.276658;
    else if (0 < valueDouble && valueDouble <= 0.2972972973) woeValue = 0.250081;
    else if (0.2972972973 < valueDouble && valueDouble <= 0.9047619048) woeValue = -0.039003;
    else if ( valueDouble > 0.9047619048) woeValue = -0.341773;
    else woeValue = 0;}else if(cp_ratio_20w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.284581;
    else if (-1e38 < valueDouble && valueDouble <= 0.4536833242) woeValue = -0.014810;
    else if ( valueDouble > 0.4536833242) woeValue = 0.347419;
    else woeValue = 0;}else if(ebay_V_7d1Yr_ASP_360all.getName().equals(varName)){if (value == null) woeValue = 0.059413;
    else if (-1e38 < valueDouble && valueDouble <= 0.6619) woeValue = -0.190556;
    else if (0.6619 < valueDouble && valueDouble <= 0.822) woeValue = -0.388170;
    else if ( valueDouble > 0.822) woeValue = -0.474727;
    else woeValue = 0;}else if(ebay_dy_1yr_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.035435;
    else if ( valueDouble > -1e38) woeValue = 2.254687;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.059775;
    else if (-1e38 < valueDouble && valueDouble <= 254) woeValue = 3.470395;
    else if (254 < valueDouble && valueDouble <= 357) woeValue = 2.561942;
    else if (357 < valueDouble && valueDouble <= 1227.5) woeValue = 1.826046;
    else if (1227.5 < valueDouble && valueDouble <= 2753) woeValue = 0.801994;
    else if (2753 < valueDouble && valueDouble <= 3333) woeValue = 0.049637;
    else if ( valueDouble > 3333) woeValue = -0.468306;
    else woeValue = 0;}else if(ismobile.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.033798;
    else if ( valueDouble > 0) woeValue = 0.450169;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.018602;
    else if ( valueDouble > 0) woeValue = 0.633364;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.077831;
    else if (0 < valueDouble && valueDouble <= 0.00045) woeValue = -0.680178;
    else if (0.00045 < valueDouble && valueDouble <= 0.00061) woeValue = -0.355110;
    else if (0.00061 < valueDouble && valueDouble <= 0.00318) woeValue = 0.096757;
    else if ( valueDouble > 0.00318) woeValue = 0.187082;
    else woeValue = 0;}else if(nach_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = -0.047407;
    else if (-1e38 < valueDouble && valueDouble <= 1464) woeValue = 1.153804;
    else if (1464 < valueDouble && valueDouble <= 1532) woeValue = 0.997018;
    else if (1532 < valueDouble && valueDouble <= 1780) woeValue = 0.822827;
    else if (1780 < valueDouble && valueDouble <= 57546.5) woeValue = 0.661119;
    else if ( valueDouble > 57546.5) woeValue = 0.184739;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.620961;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.314839;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = -0.213714;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.174727;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.066586;
    else if (5 < valueDouble && valueDouble <= 15) woeValue = 0.190657;
    else if ( valueDouble > 15) woeValue = 1.563334;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1.1807925026) woeValue = -0.189518;
    else if (1.1807925026 < valueDouble && valueDouble <= 1.9576796036) woeValue = -0.140169;
    else if (1.9576796036 < valueDouble && valueDouble <= 4.2837060703) woeValue = 0.124944;
    else if (4.2837060703 < valueDouble && valueDouble <= 5.6077812829) woeValue = 0.773425;
    else if (5.6077812829 < valueDouble && valueDouble <= 17.372614108) woeValue = 1.000206;
    else if ( valueDouble > 17.372614108) woeValue = 1.622299;
    else woeValue = 0;}else if(outstd_iach_count2.getName().equals(varName)){if (value == null) woeValue = 0.551037;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.556689;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.512051;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.160768;
    else if (4 < valueDouble && valueDouble <= 9) woeValue = 1.456275;
    else if ( valueDouble > 9) woeValue = 1.853666;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = 2.118149;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.252481;
    else if ( valueDouble > 4) woeValue = -0.007178;
    else woeValue = 0;}else if(ratio_max.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.119395;
    else if (-1 < valueDouble && valueDouble <= 0.4729102167) woeValue = -0.071968;
    else if (0.4729102167 < valueDouble && valueDouble <= 0.6094845361) woeValue = 0.129836;
    else if ( valueDouble > 0.6094845361) woeValue = 0.738773;
    else woeValue = 0;}else if(s2r_txnsnt_cnt_stss_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.120369;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.324146;
    else if ( valueDouble > 1) woeValue = 2.507209;
    else woeValue = 0;}else if(s_c_fso_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.007206;
    else if ( valueDouble > 0) woeValue = 1.884590;
    else woeValue = 0;}else if(s_cc_s_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.043070;
    else if (0 < valueDouble && valueDouble <= 2496.1051) woeValue = 0.491787;
    else if ( valueDouble > 2496.1051) woeValue = 0.195690;
    else woeValue = 0;}else if(s_mp_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.185905;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 539.5593) woeValue = -0.607143;
    else if (539.5593 < valueDouble && valueDouble <= 1170.0509) woeValue = -0.596190;
    else if (1170.0509 < valueDouble && valueDouble <= 2212.1561) woeValue = -0.378336;
    else if (2212.1561 < valueDouble && valueDouble <= 9372.3391) woeValue = -0.362717;
    else if ( valueDouble > 9372.3391) woeValue = 0.335377;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 14043592) woeValue = 0.203745;
    else if ( valueDouble > 14043592) woeValue = -0.172948;
    else woeValue = 0;}else if(seen_same_bankid_90d_ago.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.991364;
    else if ( valueDouble > 0) woeValue = -0.339901;
    else woeValue = 0;}else if(txnsnt_cnt_lst_24_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.118865;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.922814;
    else if ( valueDouble > 1) woeValue = 3.267221;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.522584;
    else if (-1e38 < valueDouble && valueDouble <= 338.78516204) woeValue = -0.169142;
    else if ( valueDouble > 338.78516204) woeValue = 0.777417;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.140467;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.103375;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.401453;
    else if ( valueDouble > 2) woeValue = 0.605986;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.577024;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.202703;
    else if (Arrays.asList( "NO_EMAILS","MED"," ").contains(value)) woeValue = 0.097654;
    else woeValue = 0;}else if(v2_e_ip_eq_indicative.getName().equals(varName)){if (Arrays.asList( "NO_EMAILS","BOTH_CONTROLLED","EQUAL_ISP","EQUAL_CONTROLLED").contains(value)) woeValue = -0.386460;
    else if (Arrays.asList( "BOTH_ISP").contains(value)) woeValue = -0.267500;
    else if (Arrays.asList( "NONE"," ").contains(value)) woeValue = 0.164824;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "CITY_HOPPING_2","NO_HOPPING").contains(value)) woeValue = -0.181214;
    else if (Arrays.asList( "IP_HOP_1","CTRY_HOPPING_2").contains(value)) woeValue = 0.061380;
    else if (Arrays.asList( "IP_HOPPING_2","CTRY_HOPPING_GT2","CITY_HOPPING_GT2","IP_HOPPING_GT2","STATE_HOPPING_GT2","STATE_HOPPING_2","STATE_HOPPING_EXCESSIVE"," ").contains(value)) woeValue = 0.865274;
    else if (Arrays.asList( "CTRY_HOPPING_EXCESSIVE").contains(value)) woeValue = 1.699781;
    else woeValue = 0;}else if(v31_ip_shipping_billing_match.getName().equals(varName)){if (Arrays.asList( "FULL_CTRY_MATCH").contains(value)) woeValue = -0.318100;
    else if (Arrays.asList( "NO_GEO_AD_MATCH").contains(value)) woeValue = -0.316088;
    else if (Arrays.asList( "ALL_DIFF","FULL_MATCH","SHIP_MATCH_BILL_BUT_IP_DIFF").contains(value)) woeValue = 0.303987;
    else if (Arrays.asList( "BILL_MATCH_IP_BUT_SHIP_DIFF").contains(value)) woeValue = 0.478730;
    else if (Arrays.asList( "SHIP_AD_NULL","FULL_MATCH_CTRY_MISTAKE","SHIP_MATCH_IP_BUT_BILL_DIFF"," ").contains(value)) woeValue = 0.621106;
    else if (Arrays.asList( "NO_GEO_AD_DIFF").contains(value)) woeValue = 0.000000;
    else woeValue = 0;}else if(v3_browser_lang_match.getName().equals(varName)){if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MATCH").contains(value)) woeValue = -0.076827;
    else if (Arrays.asList( "NO_LANG","JOKER_MISMATCH","JOKER","JOKER_MATCH","STRONG_MATCH","MANY_LANGS"," ").contains(value)) woeValue = 0.054759;
    else if (Arrays.asList( "BAD","MISMATCH").contains(value)) woeValue = 2.053654;
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
    
    coeffMap.put("Intercept",+4.84921874);
    coeffMap.put(p90_dys_return.getName(),-1.02483595);
    coeffMap.put(outstd_iach_count2.getName(),-0.34926761);
    coeffMap.put(txnsnt_cnt_lst_24_hrs.getName(),-0.38854419);
    coeffMap.put(seen_same_bankid_90d_ago.getName(),-0.77830007);
    coeffMap.put(num_logins_3_days.getName(),-0.41020041);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.62969240);
    coeffMap.put(s2r_txnsnt_cnt_stss_lst_48_hrs.getName(),-0.23666549);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.46459541);
    coeffMap.put(v31_ip_shipping_billing_match.getName(),-0.25141449);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-0.52585971);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.55738884);
    coeffMap.put(added_ach_lt_1.getName(),-0.63246760);
    coeffMap.put(ebay_dy_1yr_sus_avg_360all.getName(),-0.62266475);
    coeffMap.put(cp_ratio_20w_ato_dol.getName(),-0.42417340);
    coeffMap.put(s_mp_amt_dk_20.getName(),-0.65267665);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.44010462);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.54481819);
    coeffMap.put(v2_e_ip_eq_indicative.getName(),-0.47883707);
    coeffMap.put(n_bdrt_txn.getName(),-0.74992677);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.77769194);
    coeffMap.put(nach_failed_amt_avg.getName(),-0.84110600);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.57622848);
    coeffMap.put(a_rt_dcl_14dys.getName(),-0.52549266);
    coeffMap.put(ratio_max.getName(),-0.71979225);
    coeffMap.put(wach_n_authorized.getName(),-0.51171086);
    coeffMap.put(s_cc_s_amt_dk_80.getName(),-0.93178801);
    coeffMap.put(Decline_rate_amt_ccbin.getName(),-0.98466281);
    coeffMap.put(cc_pct_passed_cvv2.getName(),-0.88635210);
    coeffMap.put(ebay_V_7d1Yr_ASP_360all.getName(),-0.78119353);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.55298574);
    coeffMap.put(ismobile.getName(),-0.79451259);
    coeffMap.put(v3_browser_lang_match.getName(),-0.98134774);
    coeffMap.put(s_c_fso_match.getName(),-0.71909272);
    coeffMap.put(last_name_lowcase.getName(),-1.06526511);
    coeffMap.put(added_address_lt_7.getName(),-0.84239702);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 871.22220873;
  }

  @Override
  public double getCoeff2() {
    return  -65.36608763;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT50;
  }
  
}