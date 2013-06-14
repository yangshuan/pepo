package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg3 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(outamt_to_avg_cleard);
    variables.add(s_cc_s_amt_dk_160);
    variables.add(nall_failed_amt_avg);
    variables.add(email_MP_dof);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(a_bdrt_txn);
    variables.add(max_cross20wRtDclAcc);
    variables.add(n_rt_dcl_14dys);
    variables.add(days_snc_last_achtxn);
    variables.add(Decline_rate_ccbin);
    variables.add(s_v_tx_ratio_num);
    variables.add(v2_e_un_indicative);
    variables.add(ebay_7d_UPIAamt_dk_360all);
    variables.add(acct_cc_d_amt_dk_10);
    variables.add(s_ach_max_cleared_amt);
    variables.add(cc_num_visa);
    variables.add(acct_login_cnt_dk_10);
    variables.add(wach_n_inactive);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(s_amt_dk_10);
    variables.add(s_rtrn_decay_90d_cnt);
    variables.add(v3_account_age);
    variables.add(is_credit_union);
    variables.add(v36_rtn_ad_dist);
    variables.add(v36_d_sn_prev_login);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(v31_ip_hopping_strict);
    variables.add(s_cctrans_complt_amt);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(ip_rtn_avg_amt_pst_1y);


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

    if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.652689;
    else if (-1e38 < valueDouble && valueDouble <= 0.0169457333) woeValue = -1.804876;
    else if (0.0169457333 < valueDouble && valueDouble <= 0.0230735606) woeValue = -1.576684;
    else if (0.0230735606 < valueDouble && valueDouble <= 0.0442119773) woeValue = -0.756792;
    else if (0.0442119773 < valueDouble && valueDouble <= 0.04646337) woeValue = -0.629490;
    else if (0.04646337 < valueDouble && valueDouble <= 0.0580654876) woeValue = -0.195701;
    else if (0.0580654876 < valueDouble && valueDouble <= 0.0751737559) woeValue = 0.029177;
    else if (0.0751737559 < valueDouble && valueDouble <= 0.0986107948) woeValue = 0.349855;
    else if (0.0986107948 < valueDouble && valueDouble <= 0.1155247803) woeValue = 0.806289;
    else if (0.1155247803 < valueDouble && valueDouble <= 0.1291306558) woeValue = 0.831756;
    else if (0.1291306558 < valueDouble && valueDouble <= 0.1464497041) woeValue = 0.990701;
    else if ( valueDouble > 0.1464497041) woeValue = 1.458242;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.058635;
    else if ( valueDouble > 0) woeValue = 1.488853;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = -0.185839;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.339066;
    else if ( valueDouble > 0) woeValue = 0.054380;
    else woeValue = 0;}else if(a_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.156738;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.330355;
    else if (0.0001 < valueDouble && valueDouble <= 0.0019) woeValue = -0.084487;
    else if (0.0019 < valueDouble && valueDouble <= 0.00892) woeValue = 0.057528;
    else if (0.00892 < valueDouble && valueDouble <= 0.03) woeValue = 0.765764;
    else if ( valueDouble > 0.03) woeValue = 1.534619;
    else woeValue = 0;}else if(acct_cc_d_amt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.174294;
    else if (0 < valueDouble && valueDouble <= 107.3654) woeValue = 2.518127;
    else if ( valueDouble > 107.3654) woeValue = 1.998192;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.156381;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = 0.033813;
    else if (0.0001 < valueDouble && valueDouble <= 0.0909) woeValue = -0.568528;
    else if (0.0909 < valueDouble && valueDouble <= 613.1331) woeValue = -1.027823;
    else if ( valueDouble > 613.1331) woeValue = -1.813585;
    else woeValue = 0;}else if(acct_login_cnt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.687770;
    else if (0 < valueDouble && valueDouble <= 1.9976) woeValue = -0.389938;
    else if (1.9976 < valueDouble && valueDouble <= 2.9936) woeValue = -0.213640;
    else if (2.9936 < valueDouble && valueDouble <= 6.9184) woeValue = -0.078340;
    else if ( valueDouble > 6.9184) woeValue = 0.668434;
    else woeValue = 0;}else if(cc_num_visa.getName().equals(varName)){if (value == null) woeValue = -0.435069;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.615644;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 0.001372;
    else if (3 < valueDouble && valueDouble <= 6) woeValue = 0.269218;
    else if (6 < valueDouble && valueDouble <= 7) woeValue = 0.621406;
    else if ( valueDouble > 7) woeValue = 0.709782;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = -0.435069;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.402337;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.120087;
    else if (0 < valueDouble && valueDouble <= 106) woeValue = -0.584777;
    else if (106 < valueDouble && valueDouble <= 240) woeValue = -0.479716;
    else if (240 < valueDouble && valueDouble <= 297) woeValue = -0.210416;
    else if (297 < valueDouble && valueDouble <= 333) woeValue = 0.033754;
    else if (333 < valueDouble && valueDouble <= 531) woeValue = 0.274287;
    else if (531 < valueDouble && valueDouble <= 668) woeValue = 0.478113;
    else if ( valueDouble > 668) woeValue = 0.705246;
    else woeValue = 0;}else if(ebay_7d_UPIAamt_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.261860;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.218621;
    else if (0 < valueDouble && valueDouble <= 3.078097E-25) woeValue = 0.367366;
    else if (3.078097E-25 < valueDouble && valueDouble <= 4.232436E-12) woeValue = 0.422944;
    else if ( valueDouble > 4.232436E-12) woeValue = 0.615335;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.212925;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.533852;
    else if (0 < valueDouble && valueDouble <= 8.976042E-20) woeValue = 0.624388;
    else if (8.976042E-20 < valueDouble && valueDouble <= 4.336317E-12) woeValue = 0.820956;
    else if ( valueDouble > 4.336317E-12) woeValue = 1.254592;
    else woeValue = 0;}else if(email_MP_dof.getName().equals(varName)){if (value == null) woeValue = 0.212025;
    else if (-1e38 < valueDouble && valueDouble <= 1568) woeValue = 0.263780;
    else if (1568 < valueDouble && valueDouble <= 1642) woeValue = 0.099375;
    else if (1642 < valueDouble && valueDouble <= 2261) woeValue = -0.113930;
    else if (2261 < valueDouble && valueDouble <= 2890) woeValue = -0.367049;
    else if (2890 < valueDouble && valueDouble <= 3047) woeValue = -0.426045;
    else if (3047 < valueDouble && valueDouble <= 3122) woeValue = -0.504853;
    else if (3122 < valueDouble && valueDouble <= 4769) woeValue = -0.981959;
    else if ( valueDouble > 4769) woeValue = -1.665656;
    else woeValue = 0;}else if(ip_rtn_avg_amt_pst_1y.getName().equals(varName)){if (value == null) woeValue = -0.031011;
    else if (-1e38 < valueDouble && valueDouble <= 3085.7909424) woeValue = 0.725475;
    else if (3085.7909424 < valueDouble && valueDouble <= 5619.5936953) woeValue = 0.142493;
    else if (5619.5936953 < valueDouble && valueDouble <= 7363) woeValue = 0.058975;
    else if (7363 < valueDouble && valueDouble <= 31097.4) woeValue = -0.447180;
    else if ( valueDouble > 31097.4) woeValue = -0.911791;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.067186;
    else if ( valueDouble > 0) woeValue = -0.466682;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = -0.185839;
    else if (-1e38 < valueDouble && valueDouble <= 0.0284) woeValue = -1.026863;
    else if (0.0284 < valueDouble && valueDouble <= 0.0301) woeValue = -0.713702;
    else if (0.0301 < valueDouble && valueDouble <= 0.0322) woeValue = -0.671329;
    else if (0.0322 < valueDouble && valueDouble <= 0.0373) woeValue = -0.639637;
    else if (0.0373 < valueDouble && valueDouble <= 0.0402) woeValue = -0.234015;
    else if (0.0402 < valueDouble && valueDouble <= 0.0519) woeValue = -0.195658;
    else if (0.0519 < valueDouble && valueDouble <= 0.0591) woeValue = 0.096395;
    else if (0.0591 < valueDouble && valueDouble <= 0.0743) woeValue = 0.426675;
    else if (0.0743 < valueDouble && valueDouble <= 0.25) woeValue = 0.991856;
    else if ( valueDouble > 0.25) woeValue = 1.202723;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.142267;
    else if (0 < valueDouble && valueDouble <= 0.009901) woeValue = -0.222474;
    else if (0.009901 < valueDouble && valueDouble <= 0.022158) woeValue = -0.190213;
    else if (0.022158 < valueDouble && valueDouble <= 0.142056) woeValue = 0.063576;
    else if (0.142056 < valueDouble && valueDouble <= 0.238731) woeValue = 0.472945;
    else if ( valueDouble > 0.238731) woeValue = 1.593470;
    else woeValue = 0;}else if(nall_failed_amt_avg.getName().equals(varName)){if (value == null) woeValue = 0.057589;
    else if (-1e38 < valueDouble && valueDouble <= 1289.2793904) woeValue = 0.211125;
    else if (1289.2793904 < valueDouble && valueDouble <= 2600) woeValue = 0.166449;
    else if (2600 < valueDouble && valueDouble <= 10728.263158) woeValue = -0.055804;
    else if (10728.263158 < valueDouble && valueDouble <= 89345.714286) woeValue = -0.164917;
    else if ( valueDouble > 89345.714286) woeValue = -0.527441;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 7.9658471773) woeValue = -0.035509;
    else if (7.9658471773 < valueDouble && valueDouble <= 20.851104707) woeValue = 0.080493;
    else if ( valueDouble > 20.851104707) woeValue = 1.004702;
    else woeValue = 0;}else if(s_ach_max_cleared_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 2599) woeValue = 0.628562;
    else if (2599 < valueDouble && valueDouble <= 4916) woeValue = 0.201337;
    else if (4916 < valueDouble && valueDouble <= 11698) woeValue = 0.060338;
    else if (11698 < valueDouble && valueDouble <= 49999) woeValue = -0.193369;
    else if (49999 < valueDouble && valueDouble <= 109320) woeValue = -0.233937;
    else if ( valueDouble > 109320) woeValue = -0.314243;
    else woeValue = 0;}else if(s_amt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.101931;
    else if (0 < valueDouble && valueDouble <= 9032.8416) woeValue = 0.055102;
    else if (9032.8416 < valueDouble && valueDouble <= 18081.4076) woeValue = 0.212836;
    else if ( valueDouble > 18081.4076) woeValue = 1.141569;
    else woeValue = 0;}else if(s_cc_s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.006308;
    else if (0 < valueDouble && valueDouble <= 0.0005) woeValue = 0.501207;
    else if (0.0005 < valueDouble && valueDouble <= 4508.7973) woeValue = 0.051481;
    else if ( valueDouble > 4508.7973) woeValue = -0.359375;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.047325;
    else if (0 < valueDouble && valueDouble <= 1812) woeValue = 0.262243;
    else if (1812 < valueDouble && valueDouble <= 8496) woeValue = 0.198420;
    else if (8496 < valueDouble && valueDouble <= 308818) woeValue = 0.024653;
    else if (308818 < valueDouble && valueDouble <= 762535) woeValue = -0.192585;
    else if (762535 < valueDouble && valueDouble <= 1637160) woeValue = -0.518670;
    else if ( valueDouble > 1637160) woeValue = -0.983117;
    else woeValue = 0;}else if(s_rtrn_decay_90d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.149839;
    else if (0 < valueDouble && valueDouble <= 0.0003771718) woeValue = 0.471820;
    else if (0.0003771718 < valueDouble && valueDouble <= 0.0191376661) woeValue = 1.088411;
    else if (0.0191376661 < valueDouble && valueDouble <= 0.0734528841) woeValue = 1.315397;
    else if ( valueDouble > 0.0734528841) woeValue = 1.640115;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6652892562) woeValue = 2.081531;
    else if (0.6652892562 < valueDouble && valueDouble <= 0.75) woeValue = 1.793225;
    else if (0.75 < valueDouble && valueDouble <= 0.8928571429) woeValue = 1.097852;
    else if (0.8928571429 < valueDouble && valueDouble <= 0.9309090909) woeValue = 0.797999;
    else if (0.9309090909 < valueDouble && valueDouble <= 0.9473684211) woeValue = 0.484138;
    else if (0.9473684211 < valueDouble && valueDouble <= 0.9763779528) woeValue = 0.209098;
    else if (0.9763779528 < valueDouble && valueDouble <= 0.9848484848) woeValue = -0.196945;
    else if (0.9848484848 < valueDouble && valueDouble <= 0.9887387387) woeValue = -0.370844;
    else if ( valueDouble > 0.9887387387) woeValue = -0.622877;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.065975;
    else if (-1e38 < valueDouble && valueDouble <= 5.9868981481) woeValue = -0.253614;
    else if (5.9868981481 < valueDouble && valueDouble <= 15.390266204) woeValue = 0.202788;
    else if (15.390266204 < valueDouble && valueDouble <= 292.11310185) woeValue = 0.267199;
    else if ( valueDouble > 292.11310185) woeValue = 0.674838;
    else woeValue = 0;}else if(v3_account_age.getName().equals(varName)){if (value == null) woeValue = -0.310379;
    else if (-1e38 < valueDouble && valueDouble <= 1303.842419) woeValue = 0.524520;
    else if (1303.842419 < valueDouble && valueDouble <= 1503.0719213) woeValue = 0.447342;
    else if (1503.0719213 < valueDouble && valueDouble <= 1766.8998727) woeValue = -0.073750;
    else if (1766.8998727 < valueDouble && valueDouble <= 2172.660162) woeValue = -0.193881;
    else if (2172.660162 < valueDouble && valueDouble <= 2606.9129167) woeValue = -0.218500;
    else if (2606.9129167 < valueDouble && valueDouble <= 3075.4376389) woeValue = -0.432057;
    else if (3075.4376389 < valueDouble && valueDouble <= 4236.4597917) woeValue = -0.656197;
    else if ( valueDouble > 4236.4597917) woeValue = -0.863233;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = -0.435069;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.071508;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 1.000235;
    else if ( valueDouble > 3) woeValue = 1.375223;
    else woeValue = 0;}else if(v2_e_un_indicative.getName().equals(varName)){if (Arrays.asList( "_MISSING_","NAME_MATCH").contains(value)) woeValue = -0.437240;
    else if (Arrays.asList(" ").contains(value)) woeValue = -0.310218;
    else if (Arrays.asList( "CRAPPY").contains(value)) woeValue = 0.114764;
    else if (Arrays.asList( "NO_EMAILS","OTHER").contains(value)) woeValue = 0.167469;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "CITY_HOPPING_GT2","CITY_HOPPING_2","_MISSING_"," ","NO_HOPPING").contains(value)) woeValue = -0.196965;
    else if (Arrays.asList( "STATE_HOPPING_EXCESSIVE","IP_HOP_1").contains(value)) woeValue = 0.255128;
    else if (Arrays.asList( "CTRY_HOPPING_EXCESSIVE","STATE_HOPPING_2").contains(value)) woeValue = 0.370942;
    else if (Arrays.asList( "CTRY_HOPPING_2","CTRY_HOPPING_GT2","IP_HOPPING_2","STATE_HOPPING_GT2","IP_HOPPING_GT2").contains(value)) woeValue = 1.020453;
    else woeValue = 0;}else if(v36_rtn_ad_dist.getName().equals(varName)){if (Arrays.asList( "_MISSING_","LOW_MISMATCH","VIRTUAL_MULTI_CTRY","MATCH").contains(value)) woeValue = -0.945827;
    else if (Arrays.asList( "HIGH_MISMATCH","VIRTUAL_SAME_CTRY"," ").contains(value)) woeValue = -0.347388;
    else if (Arrays.asList( "NO_NEW_BANK").contains(value)) woeValue = 0.181651;
    else if (Arrays.asList( "SUSP_NO_DATA","SUSP_SAME_CTRY").contains(value)) woeValue = 0.361814;
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
    
    coeffMap.put("Intercept",+4.27517908);
    coeffMap.put(wach_n_inactive.getName(),-0.97297216);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.36306458);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.49150090);
    coeffMap.put(acct_cc_d_amt_dk_10.getName(),-0.39445633);
    coeffMap.put(acct_login_cnt_dk_10.getName(),-0.60269728);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.48999464);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.36615557);
    coeffMap.put(v3_account_age.getName(),-0.68659116);
    coeffMap.put(s_rtrn_decay_90d_cnt.getName(),-0.18222612);
    coeffMap.put(email_MP_dof.getName(),-0.21152768);
    coeffMap.put(v36_rtn_ad_dist.getName(),-1.18742332);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.42012820);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.53250687);
    coeffMap.put(ebay_7d_UPIAamt_dk_360all.getName(),-0.39116864);
    coeffMap.put(a_bdrt_txn.getName(),-0.45469761);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.39144216);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.63047317);
    coeffMap.put(cc_num_visa.getName(),-0.57788440);
    coeffMap.put(s_ach_max_cleared_amt.getName(),-0.38865226);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.32188159);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.99432854);
    coeffMap.put(v2_e_un_indicative.getName(),-0.52349538);
    coeffMap.put(s_amt_dk_10.getName(),-0.67095719);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.68493515);
    coeffMap.put(ip_rtn_avg_amt_pst_1y.getName(),-0.75938468);
    coeffMap.put(is_credit_union.getName(),-0.59230187);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.61805621);
    coeffMap.put(s_cc_s_amt_dk_160.getName(),-1.26458509);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.68275176);
    coeffMap.put(nall_failed_amt_avg.getName(),-0.82048986);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 856.51465973;
  }

  @Override
  public double getCoeff2() {
    return  -61.40040409;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT3;
  }
  
}