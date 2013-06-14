package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg4 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(s_trans_ip2_tof_t_v2);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(cc_pct_credit_v2);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(is_yodlee_verified);
    variables.add(s_c_address_match);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(max_cross20wRtDclAcc);
    variables.add(ach_prtlamt_age);
    variables.add(txnsnt_cnt_lst_24_hrs);
    variables.add(n_ebay_lnkd_360all);
    variables.add(num_logins_1_days);
    variables.add(outamt_to_max_cleard);
    variables.add(min_to_max_ach_tof);
    variables.add(s_v_tx_ratio_num);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(billing_shipping_city_match);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(rt_num_rate);
    variables.add(MOC_V_MOCLife);
    variables.add(s_amt_dk_20);
    variables.add(top_bin_amt_pct);
    variables.add(n_bdrt_Veri_txn);
    variables.add(IP1WRtDolAtoBadTxn);
    variables.add(email_numofvowely);
    variables.add(v36_d_sn_prev_login);
    variables.add(email_MP_10d_txn_dk);
    variables.add(s_cctrans_complt_amt);
    variables.add(p90_dys_return);


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

    if(IP1WRtDolAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.191624;
    else if (0 < valueDouble && valueDouble <= 0.0014) woeValue = 0.086434;
    else if ( valueDouble > 0.0014) woeValue = 0.273633;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.057515;
    else if ( valueDouble > 0) woeValue = 1.421239;
    else woeValue = 0;}else if(MOC_V_MOCLife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6862745098) woeValue = -0.197506;
    else if (0.6862745098 < valueDouble && valueDouble <= 0.8) woeValue = 0.284872;
    else if (0.8 < valueDouble && valueDouble <= 1.0294117647) woeValue = 0.595918;
    else if (1.0294117647 < valueDouble && valueDouble <= 1.2571428571) woeValue = 1.093614;
    else if ( valueDouble > 1.2571428571) woeValue = 1.746619;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 37.2051) woeValue = 1.304887;
    else if (37.2051 < valueDouble && valueDouble <= 197.7206) woeValue = 1.031686;
    else if (197.7206 < valueDouble && valueDouble <= 311.7331) woeValue = 0.905310;
    else if (311.7331 < valueDouble && valueDouble <= 448.9149) woeValue = 0.679585;
    else if (448.9149 < valueDouble && valueDouble <= 606.7958) woeValue = 0.538908;
    else if (606.7958 < valueDouble && valueDouble <= 966.3272) woeValue = 0.386589;
    else if (966.3272 < valueDouble && valueDouble <= 1164.7061) woeValue = 0.302445;
    else if (1164.7061 < valueDouble && valueDouble <= 1379.6411) woeValue = 0.165550;
    else if (1379.6411 < valueDouble && valueDouble <= 1852.9485) woeValue = 0.027677;
    else if (1852.9485 < valueDouble && valueDouble <= 3615.2297) woeValue = -0.144548;
    else if (3615.2297 < valueDouble && valueDouble <= 3970.6829) woeValue = -0.232448;
    else if (3970.6829 < valueDouble && valueDouble <= 4738.6324) woeValue = -0.295660;
    else if ( valueDouble > 4738.6324) woeValue = -0.296353;
    else woeValue = 0;}else if(ach_prtlamt_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2552322614) woeValue = -0.311763;
    else if (0.2552322614 < valueDouble && valueDouble <= 0.988551299) woeValue = -0.263779;
    else if (0.988551299 < valueDouble && valueDouble <= 1.4148257241) woeValue = -0.183404;
    else if (1.4148257241 < valueDouble && valueDouble <= 1.9420544337) woeValue = -0.151621;
    else if (1.9420544337 < valueDouble && valueDouble <= 2.8257790368) woeValue = -0.024864;
    else if (2.8257790368 < valueDouble && valueDouble <= 3.5359361136) woeValue = -0.018904;
    else if (3.5359361136 < valueDouble && valueDouble <= 5.395221843) woeValue = 0.103921;
    else if (5.395221843 < valueDouble && valueDouble <= 6.4483111566) woeValue = 0.282634;
    else if (6.4483111566 < valueDouble && valueDouble <= 7.9750173491) woeValue = 0.402568;
    else if (7.9750173491 < valueDouble && valueDouble <= 10.406021898) woeValue = 0.801038;
    else if (10.406021898 < valueDouble && valueDouble <= 26.643454039) woeValue = 1.178115;
    else if ( valueDouble > 26.643454039) woeValue = 1.602027;
    else woeValue = 0;}else if(billing_shipping_city_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.627820;
    else if ( valueDouble > 1) woeValue = 0.833827;
    else woeValue = 0;}else if(cc_pct_credit_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.;
    else if (-1 < valueDouble && valueDouble <= 0.1666666667) woeValue = 0.408844;
    else if (0.1666666667 < valueDouble && valueDouble <= 0.32) woeValue = 0.139211;
    else if (0.32 < valueDouble && valueDouble <= 0.48) woeValue = 0.004485;
    else if (0.48 < valueDouble && valueDouble <= 0.5714285714) woeValue = -0.160037;
    else if (0.5714285714 < valueDouble && valueDouble <= 0.6551724138) woeValue = -0.338739;
    else if (0.6551724138 < valueDouble && valueDouble <= 0.8333333333) woeValue = -0.377548;
    else if (0.8333333333 < valueDouble && valueDouble <= 0.9677419355) woeValue = -0.472590;
    else if ( valueDouble > 0.9677419355) woeValue = -0.843430;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.4602952119) woeValue = -0.286374;
    else if (0.4602952119 < valueDouble && valueDouble <= 0.6459921126) woeValue = -0.079332;
    else if (0.6459921126 < valueDouble && valueDouble <= 0.7542138495) woeValue = -0.042639;
    else if (0.7542138495 < valueDouble && valueDouble <= 1.2909842483) woeValue = 0.052212;
    else if (1.2909842483 < valueDouble && valueDouble <= 2.071567412) woeValue = 0.166143;
    else if (2.071567412 < valueDouble && valueDouble <= 2.8401295517) woeValue = 0.171495;
    else if (2.8401295517 < valueDouble && valueDouble <= 3.6059949514) woeValue = 0.289282;
    else if (3.6059949514 < valueDouble && valueDouble <= 5.4990068236) woeValue = 0.419562;
    else if ( valueDouble > 5.4990068236) woeValue = 1.030420;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.149824;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 1.676480;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = 0.937006;
    else if (3 < valueDouble && valueDouble <= 48) woeValue = 0.545499;
    else if (48 < valueDouble && valueDouble <= 77) woeValue = 0.512060;
    else if (77 < valueDouble && valueDouble <= 109) woeValue = 0.473838;
    else if (109 < valueDouble && valueDouble <= 257) woeValue = 0.358706;
    else if ( valueDouble > 257) woeValue = 0.192661;
    else woeValue = 0;}else if(email_MP_10d_txn_dk.getName().equals(varName)){if (value == null) woeValue = 0.522277;
    else if (-1e38 < valueDouble && valueDouble <= 0.0000192962) woeValue = 0.551394;
    else if (0.0000192962 < valueDouble && valueDouble <= 0.0071450613) woeValue = 0.433014;
    else if (0.0071450613 < valueDouble && valueDouble <= 0.0160219251) woeValue = 0.220704;
    else if (0.0160219251 < valueDouble && valueDouble <= 0.0314307506) woeValue = 0.211995;
    else if (0.0314307506 < valueDouble && valueDouble <= 0.0550390829) woeValue = 0.161595;
    else if (0.0550390829 < valueDouble && valueDouble <= 0.0890932595) woeValue = 0.043700;
    else if (0.0890932595 < valueDouble && valueDouble <= 0.1345113786) woeValue = -0.058041;
    else if (0.1345113786 < valueDouble && valueDouble <= 0.6048078308) woeValue = -0.226056;
    else if (0.6048078308 < valueDouble && valueDouble <= 0.7009862921) woeValue = -0.349638;
    else if (0.7009862921 < valueDouble && valueDouble <= 1.0989651714) woeValue = -0.404856;
    else if ( valueDouble > 1.0989651714) woeValue = -0.693289;
    else woeValue = 0;}else if(email_numofvowely.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.119640;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.060712;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.048202;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.085565;
    else if (6 < valueDouble && valueDouble <= 7) woeValue = 0.139282;
    else if ( valueDouble > 7) woeValue = 0.473729;
    else woeValue = 0;}else if(is_yodlee_verified.getName().equals(varName)){if (value == null) woeValue = -1.000261;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.129336;
    else if ( valueDouble > 0) woeValue = 0.520945;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0286) woeValue = -1.062465;
    else if (0.0286 < valueDouble && valueDouble <= 0.0293) woeValue = -0.848900;
    else if (0.0293 < valueDouble && valueDouble <= 0.0341) woeValue = -0.567320;
    else if (0.0341 < valueDouble && valueDouble <= 0.0395) woeValue = -0.400858;
    else if (0.0395 < valueDouble && valueDouble <= 0.0408) woeValue = -0.202225;
    else if (0.0408 < valueDouble && valueDouble <= 0.0556) woeValue = 0.006842;
    else if (0.0556 < valueDouble && valueDouble <= 0.0585) woeValue = 0.262386;
    else if (0.0585 < valueDouble && valueDouble <= 0.061) woeValue = 0.429744;
    else if (0.061 < valueDouble && valueDouble <= 0.0726) woeValue = 0.440508;
    else if (0.0726 < valueDouble && valueDouble <= 0.0813) woeValue = 0.547954;
    else if ( valueDouble > 0.0813) woeValue = 0.952535;
    else woeValue = 0;}else if(min_to_max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0.040101985) woeValue = 1.545508;
    else if (0.040101985 < valueDouble && valueDouble <= 0.0963673381) woeValue = 0.566509;
    else if (0.0963673381 < valueDouble && valueDouble <= 0.1548771521) woeValue = 0.447419;
    else if (0.1548771521 < valueDouble && valueDouble <= 0.3275588605) woeValue = 0.271100;
    else if (0.3275588605 < valueDouble && valueDouble <= 0.5137561534) woeValue = 0.045660;
    else if (0.5137561534 < valueDouble && valueDouble <= 0.9999999598) woeValue = 0.007048;
    else if ( valueDouble > 0.9999999598) woeValue = -0.142410;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.086099;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.720706;
    else if (0.0001 < valueDouble && valueDouble <= 0.00034) woeValue = -0.536683;
    else if (0.00034 < valueDouble && valueDouble <= 0.00045) woeValue = -0.431762;
    else if (0.00045 < valueDouble && valueDouble <= 0.00099) woeValue = 0.063807;
    else if (0.00099 < valueDouble && valueDouble <= 0.00125) woeValue = 0.278522;
    else if (0.00125 < valueDouble && valueDouble <= 0.00214) woeValue = 0.297148;
    else if (0.00214 < valueDouble && valueDouble <= 0.00629) woeValue = 0.428839;
    else if ( valueDouble > 0.00629) woeValue = 1.023677;
    else woeValue = 0;}else if(n_ebay_lnkd_360all.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.648058;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.210823;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.099547;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.201644;
    else if (3 < valueDouble && valueDouble <= 5) woeValue = 0.540867;
    else if ( valueDouble > 5) woeValue = 0.946864;
    else woeValue = 0;}else if(num_logins_1_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.785670;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.704591;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.461446;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.270329;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.039941;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.060775;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.392330;
    else if (6 < valueDouble && valueDouble <= 9) woeValue = 0.556396;
    else if ( valueDouble > 9) woeValue = 2.257917;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5577554559) woeValue = -0.290398;
    else if (0.5577554559 < valueDouble && valueDouble <= 0.6216878125) woeValue = -0.199287;
    else if (0.6216878125 < valueDouble && valueDouble <= 0.7) woeValue = -0.155054;
    else if (0.7 < valueDouble && valueDouble <= 0.7995246165) woeValue = -0.074638;
    else if (0.7995246165 < valueDouble && valueDouble <= 0.9255) woeValue = -0.010304;
    else if (0.9255 < valueDouble && valueDouble <= 1.0914653465) woeValue = 0.212027;
    else if (1.0914653465 < valueDouble && valueDouble <= 1.3505521472) woeValue = 0.322052;
    else if (1.3505521472 < valueDouble && valueDouble <= 1.8129161119) woeValue = 0.806638;
    else if (1.8129161119 < valueDouble && valueDouble <= 3.0105942828) woeValue = 1.118987;
    else if ( valueDouble > 3.0105942828) woeValue = 2.945078;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = -0.591655;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = -0.249709;
    else if (5 < valueDouble && valueDouble <= 9) woeValue = 0.055488;
    else if ( valueDouble > 9) woeValue = 0.792057;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.805373;
    else if (-1e38 < valueDouble && valueDouble <= 0.0453778528) woeValue = -0.530201;
    else if (0.0453778528 < valueDouble && valueDouble <= 0.0606002309) woeValue = -0.412626;
    else if (0.0606002309 < valueDouble && valueDouble <= 0.0966666667) woeValue = -0.308143;
    else if (0.0966666667 < valueDouble && valueDouble <= 0.3320309956) woeValue = -0.255543;
    else if (0.3320309956 < valueDouble && valueDouble <= 0.4485981308) woeValue = -0.231605;
    else if (0.4485981308 < valueDouble && valueDouble <= 0.8035075371) woeValue = -0.148938;
    else if (0.8035075371 < valueDouble && valueDouble <= 0.9830350918) woeValue = 0.061647;
    else if (0.9830350918 < valueDouble && valueDouble <= 6.6839199448) woeValue = 0.497593;
    else if ( valueDouble > 6.6839199448) woeValue = 0.776392;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.796437;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -1.441410;
    else if (0.002 < valueDouble && valueDouble <= 0.003) woeValue = -1.118626;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -0.881208;
    else if (0.004 < valueDouble && valueDouble <= 0.007) woeValue = -0.732641;
    else if (0.007 < valueDouble && valueDouble <= 0.008) woeValue = -0.597029;
    else if (0.008 < valueDouble && valueDouble <= 0.009) woeValue = -0.428506;
    else if (0.009 < valueDouble && valueDouble <= 0.01) woeValue = -0.276318;
    else if (0.01 < valueDouble && valueDouble <= 0.014) woeValue = 0.237451;
    else if (0.014 < valueDouble && valueDouble <= 0.015) woeValue = 0.398165;
    else if (0.015 < valueDouble && valueDouble <= 0.017) woeValue = 0.442920;
    else if (0.017 < valueDouble && valueDouble <= 0.018) woeValue = 0.476690;
    else if (0.018 < valueDouble && valueDouble <= 0.021) woeValue = 0.605711;
    else if (0.021 < valueDouble && valueDouble <= 0.023) woeValue = 0.646358;
    else if (0.023 < valueDouble && valueDouble <= 0.025) woeValue = 0.775755;
    else if (0.025 < valueDouble && valueDouble <= 0.029) woeValue = 0.826199;
    else if ( valueDouble > 0.029) woeValue = 1.369475;
    else woeValue = 0;}else if(s_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.641162;
    else if (0 < valueDouble && valueDouble <= 428.2041) woeValue = -0.488247;
    else if (428.2041 < valueDouble && valueDouble <= 1878.7634) woeValue = -0.464887;
    else if (1878.7634 < valueDouble && valueDouble <= 2513.4903) woeValue = -0.373340;
    else if (2513.4903 < valueDouble && valueDouble <= 4816.8533) woeValue = -0.255558;
    else if (4816.8533 < valueDouble && valueDouble <= 7163.1505) woeValue = -0.105061;
    else if (7163.1505 < valueDouble && valueDouble <= 9137.3715) woeValue = 0.015425;
    else if (9137.3715 < valueDouble && valueDouble <= 12213.1943) woeValue = 0.211641;
    else if (12213.1943 < valueDouble && valueDouble <= 18217.0318) woeValue = 0.315080;
    else if (18217.0318 < valueDouble && valueDouble <= 35601.1028) woeValue = 0.745788;
    else if ( valueDouble > 35601.1028) woeValue = 2.600574;
    else woeValue = 0;}else if(s_c_address_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.009085;
    else if ( valueDouble > 0) woeValue = 1.088026;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.189929;
    else if (0 < valueDouble && valueDouble <= 37313) woeValue = 0.425568;
    else if (37313 < valueDouble && valueDouble <= 63501) woeValue = 0.101736;
    else if (63501 < valueDouble && valueDouble <= 115635) woeValue = -0.001326;
    else if (115635 < valueDouble && valueDouble <= 435143) woeValue = -0.134975;
    else if (435143 < valueDouble && valueDouble <= 669450) woeValue = -0.282445;
    else if (669450 < valueDouble && valueDouble <= 876367) woeValue = -0.330454;
    else if (876367 < valueDouble && valueDouble <= 1878468) woeValue = -0.544189;
    else if ( valueDouble > 1878468) woeValue = -0.556143;
    else woeValue = 0;}else if(s_trans_ip2_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 17384510) woeValue = 0.352512;
    else if (17384510 < valueDouble && valueDouble <= 41942912) woeValue = 0.084464;
    else if (41942912 < valueDouble && valueDouble <= 75432279) woeValue = -0.228589;
    else if (75432279 < valueDouble && valueDouble <= 100711103) woeValue = -0.309507;
    else if (100711103 < valueDouble && valueDouble <= 125465027) woeValue = -0.464090;
    else if ( valueDouble > 125465027) woeValue = -0.579486;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.8842105263) woeValue = 2.412772;
    else if (0.8842105263 < valueDouble && valueDouble <= 0.9202657807) woeValue = 1.209546;
    else if (0.9202657807 < valueDouble && valueDouble <= 0.9371584699) woeValue = 0.970014;
    else if (0.9371584699 < valueDouble && valueDouble <= 0.9483695652) woeValue = 0.808657;
    else if (0.9483695652 < valueDouble && valueDouble <= 0.9620689655) woeValue = 0.714224;
    else if (0.9620689655 < valueDouble && valueDouble <= 0.9670164918) woeValue = 0.535389;
    else if (0.9670164918 < valueDouble && valueDouble <= 0.9745649264) woeValue = 0.420235;
    else if (0.9745649264 < valueDouble && valueDouble <= 0.9818181818) woeValue = 0.252584;
    else if (0.9818181818 < valueDouble && valueDouble <= 0.9837398374) woeValue = 0.142692;
    else if (0.9837398374 < valueDouble && valueDouble <= 0.9854497354) woeValue = -0.048876;
    else if (0.9854497354 < valueDouble && valueDouble <= 0.9869236063) woeValue = -0.104227;
    else if (0.9869236063 < valueDouble && valueDouble <= 0.9895452169) woeValue = -0.227525;
    else if (0.9895452169 < valueDouble && valueDouble <= 0.9927007299) woeValue = -0.272558;
    else if (0.9927007299 < valueDouble && valueDouble <= 0.9944674965) woeValue = -0.504062;
    else if ( valueDouble > 0.9944674965) woeValue = -0.544283;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = -0.232262;
    else if (-1e38 < valueDouble && valueDouble <= 0.016) woeValue = 0.546600;
    else if (0.016 < valueDouble && valueDouble <= 0.024) woeValue = 0.255768;
    else if (0.024 < valueDouble && valueDouble <= 0.036) woeValue = 0.251716;
    else if (0.036 < valueDouble && valueDouble <= 0.046) woeValue = -0.079803;
    else if (0.046 < valueDouble && valueDouble <= 0.066) woeValue = -0.109735;
    else if (0.066 < valueDouble && valueDouble <= 0.072) woeValue = -0.133420;
    else if (0.072 < valueDouble && valueDouble <= 0.104) woeValue = -0.278622;
    else if ( valueDouble > 0.104) woeValue = -0.496146;
    else woeValue = 0;}else if(txnsnt_cnt_lst_24_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.151233;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.478414;
    else if ( valueDouble > 1) woeValue = 2.159484;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.719288;
    else if (-1e38 < valueDouble && valueDouble <= 9.8397800926) woeValue = -0.329128;
    else if (9.8397800926 < valueDouble && valueDouble <= 11.283263889) woeValue = -0.308450;
    else if (11.283263889 < valueDouble && valueDouble <= 15.183888889) woeValue = -0.117321;
    else if (15.183888889 < valueDouble && valueDouble <= 21.2909375) woeValue = 0.086456;
    else if (21.2909375 < valueDouble && valueDouble <= 25.903680556) woeValue = 0.218012;
    else if (25.903680556 < valueDouble && valueDouble <= 31.570393519) woeValue = 0.505729;
    else if (31.570393519 < valueDouble && valueDouble <= 40.401944444) woeValue = 0.631109;
    else if ( valueDouble > 40.401944444) woeValue = 0.719191;
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
    
    coeffMap.put("Intercept",+7.89056046);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.53194524);
    coeffMap.put(billing_shipping_city_match.getName(),-0.37790306);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.79201408);
    coeffMap.put(s_amt_dk_20.getName(),-0.41806277);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.65150785);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.75640728);
    coeffMap.put(is_yodlee_verified.getName(),-0.24489423);
    coeffMap.put(txnsnt_cnt_lst_24_hrs.getName(),-0.36799770);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.56303173);
    coeffMap.put(ach_prtlamt_age.getName(),-0.51757637);
    coeffMap.put(num_logins_1_days.getName(),-0.40041135);
    coeffMap.put(min_to_max_ach_tof.getName(),-0.99471421);
    coeffMap.put(MOC_V_MOCLife.getName(),-0.47585960);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.93661001);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.34865939);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.62657305);
    coeffMap.put(rt_num_rate.getName(),-0.43100174);
    coeffMap.put(cc_pct_credit_v2.getName(),-0.53932880);
    coeffMap.put(email_MP_10d_txn_dk.getName(),-0.24277393);
    coeffMap.put(p90_dys_return.getName(),-1.00352705);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.17263688);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.30952515);
    coeffMap.put(top_bin_amt_pct.getName(),-0.32419237);
    coeffMap.put(s_trans_ip2_tof_t_v2.getName(),-0.51140821);
    coeffMap.put(n_ebay_lnkd_360all.getName(),-0.32843348);
    coeffMap.put(s_c_address_match.getName(),-0.72801007);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.29625413);
    coeffMap.put(IP1WRtDolAtoBadTxn.getName(),-0.47904286);
    coeffMap.put(email_numofvowely.getName(),-0.28112252);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 820.89655592;
  }

  @Override
  public double getCoeff2() {
    return  -54.76593894;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT4;
  }
  
}