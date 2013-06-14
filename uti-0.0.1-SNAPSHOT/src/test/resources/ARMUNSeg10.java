package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg10 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(seen_same_bankid_30d_90d);
    variables.add(ipr_ratio_4w_ato_dol);
    variables.add(s_v_tx_ratio_num);
    variables.add(txnsnt_amt_stss_min_lst_48_hrs);
    variables.add(primaryach_verify_saving);
    variables.add(v35_sf_classifier);
    variables.add(v36_diff_vid_3d);
    variables.add(s_vid_min_tof);
    variables.add(CP20WRtAtoBadTxn);
    variables.add(s_ach_cleared_amt);
    variables.add(ebay_5d_amt_dk_360all);
    variables.add(flow_from_country);
    variables.add(max_price);
    variables.add(s_has_used_vid);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(CP4WRtDolBadTxn);
    variables.add(MOA_V_MOALife);
    variables.add(email_MP_since_bought);
    variables.add(num_address_states);
    variables.add(rt_num_rate);
    variables.add(email_numofvowely);
    variables.add(is_credit_union);
    variables.add(s_r_amt_dk_160);
    variables.add(v35_ph_indicative);
    variables.add(primaryach_dof);
    variables.add(added_ach_lt_1);
    variables.add(max_cross20wRtDclAcc);
    variables.add(s_amt_dk_10);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(acct_login_cnt_dk_80);
    variables.add(s_c_fso_match);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.446281;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -0.366516;
    else if (0.0002 < valueDouble && valueDouble <= 0.0003) woeValue = -0.128661;
    else if (0.0003 < valueDouble && valueDouble <= 0.0004) woeValue = 0.249034;
    else if (0.0004 < valueDouble && valueDouble <= 0.0019) woeValue = 0.404158;
    else if (0.0019 < valueDouble && valueDouble <= 0.0031) woeValue = 0.828552;
    else if (0.0031 < valueDouble && valueDouble <= 0.0041) woeValue = 1.242434;
    else if (0.0041 < valueDouble && valueDouble <= 0.0075) woeValue = 1.292562;
    else if ( valueDouble > 0.0075) woeValue = 1.504945;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.316140;
    else if (0 < valueDouble && valueDouble <= 0.0016) woeValue = -0.646737;
    else if (0.0016 < valueDouble && valueDouble <= 0.0029) woeValue = -0.485283;
    else if (0.0029 < valueDouble && valueDouble <= 0.0032) woeValue = -0.415784;
    else if (0.0032 < valueDouble && valueDouble <= 0.0043) woeValue = -0.244369;
    else if (0.0043 < valueDouble && valueDouble <= 0.0057) woeValue = -0.116863;
    else if (0.0057 < valueDouble && valueDouble <= 0.0081) woeValue = -0.036886;
    else if (0.0081 < valueDouble && valueDouble <= 0.0099) woeValue = 0.231608;
    else if (0.0099 < valueDouble && valueDouble <= 0.0141) woeValue = 0.719828;
    else if (0.0141 < valueDouble && valueDouble <= 0.0172) woeValue = 0.844850;
    else if (0.0172 < valueDouble && valueDouble <= 0.0307) woeValue = 0.906953;
    else if ( valueDouble > 0.0307) woeValue = 1.197472;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.025172;
    else if ( valueDouble > 0) woeValue = 2.477501;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1488088879) woeValue = -0.273578;
    else if (0.1488088879 < valueDouble && valueDouble <= 0.1923630182) woeValue = -0.238286;
    else if (0.1923630182 < valueDouble && valueDouble <= 0.2647487737) woeValue = -0.192576;
    else if (0.2647487737 < valueDouble && valueDouble <= 0.3028256131) woeValue = -0.120363;
    else if (0.3028256131 < valueDouble && valueDouble <= 0.3743772155) woeValue = 0.012608;
    else if (0.3743772155 < valueDouble && valueDouble <= 0.4036283226) woeValue = 0.195946;
    else if (0.4036283226 < valueDouble && valueDouble <= 0.474413739) woeValue = 0.267222;
    else if (0.474413739 < valueDouble && valueDouble <= 0.6331833844) woeValue = 0.368118;
    else if (0.6331833844 < valueDouble && valueDouble <= 0.7149727643) woeValue = 0.472440;
    else if (0.7149727643 < valueDouble && valueDouble <= 1.1251808225) woeValue = 0.870380;
    else if ( valueDouble > 1.1251808225) woeValue = 1.530445;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.148679;
    else if ( valueDouble > 0) woeValue = 0.200860;
    else woeValue = 0;}else if(acct_login_cnt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4.5947) woeValue = -0.148505;
    else if (4.5947 < valueDouble && valueDouble <= 5.6216) woeValue = 0.171310;
    else if (5.6216 < valueDouble && valueDouble <= 6.5006) woeValue = 0.344960;
    else if (6.5006 < valueDouble && valueDouble <= 7.8826) woeValue = 0.471486;
    else if (7.8826 < valueDouble && valueDouble <= 11.0015) woeValue = 1.136603;
    else if ( valueDouble > 11.0015) woeValue = 1.762159;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.024911;
    else if ( valueDouble > 0) woeValue = 1.404855;
    else woeValue = 0;}else if(ebay_5d_amt_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.718072;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.121568;
    else if (0 < valueDouble && valueDouble <= 0.0004198074) woeValue = 0.617441;
    else if (0.0004198074 < valueDouble && valueDouble <= 0.0091548217) woeValue = 0.292257;
    else if (0.0091548217 < valueDouble && valueDouble <= 0.1497061476) woeValue = 0.154450;
    else if (0.1497061476 < valueDouble && valueDouble <= 0.7957358899) woeValue = 0.022101;
    else if (0.7957358899 < valueDouble && valueDouble <= 5.0681471183) woeValue = -0.296839;
    else if (5.0681471183 < valueDouble && valueDouble <= 9.1858440377) woeValue = -0.383175;
    else if ( valueDouble > 9.1858440377) woeValue = -0.662697;
    else woeValue = 0;}else if(email_MP_since_bought.getName().equals(varName)){if (value == null) woeValue = 0.603936;
    else if (-1e38 < valueDouble && valueDouble <= 249) woeValue = 1.497824;
    else if (249 < valueDouble && valueDouble <= 757) woeValue = 0.466648;
    else if (757 < valueDouble && valueDouble <= 1122) woeValue = 0.463464;
    else if (1122 < valueDouble && valueDouble <= 1698) woeValue = 0.147630;
    else if (1698 < valueDouble && valueDouble <= 1794) woeValue = -0.001198;
    else if (1794 < valueDouble && valueDouble <= 2048) woeValue = -0.006043;
    else if (2048 < valueDouble && valueDouble <= 2539) woeValue = -0.243532;
    else if (2539 < valueDouble && valueDouble <= 2618) woeValue = -0.390398;
    else if (2618 < valueDouble && valueDouble <= 2847) woeValue = -0.471928;
    else if (2847 < valueDouble && valueDouble <= 2920) woeValue = -0.599656;
    else if (2920 < valueDouble && valueDouble <= 3660) woeValue = -0.788530;
    else if (3660 < valueDouble && valueDouble <= 3711) woeValue = -1.021000;
    else if (3711 < valueDouble && valueDouble <= 3828) woeValue = -1.028659;
    else if (3828 < valueDouble && valueDouble <= 4129) woeValue = -1.163416;
    else if ( valueDouble > 4129) woeValue = -1.353306;
    else woeValue = 0;}else if(email_numofvowely.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.362354;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = -0.017520;
    else if (4 < valueDouble && valueDouble <= 7) woeValue = 0.074819;
    else if ( valueDouble > 7) woeValue = 0.468164;
    else woeValue = 0;}else if(ipr_ratio_4w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.035716;
    else if (-1e38 < valueDouble && valueDouble <= 0.0368293195) woeValue = 0.113227;
    else if (0.0368293195 < valueDouble && valueDouble <= 15.861965491) woeValue = 0.435128;
    else if ( valueDouble > 15.861965491) woeValue = 0.754432;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.091702;
    else if ( valueDouble > 0) woeValue = -0.360172;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.029) woeValue = -0.628781;
    else if (0.029 < valueDouble && valueDouble <= 0.0292) woeValue = -0.317979;
    else if (0.0292 < valueDouble && valueDouble <= 0.0369) woeValue = -0.108492;
    else if (0.0369 < valueDouble && valueDouble <= 0.0448) woeValue = 0.261654;
    else if (0.0448 < valueDouble && valueDouble <= 0.0493) woeValue = 0.472438;
    else if (0.0493 < valueDouble && valueDouble <= 0.0538) woeValue = 0.520374;
    else if (0.0538 < valueDouble && valueDouble <= 0.0813) woeValue = 1.087990;
    else if ( valueDouble > 0.0813) woeValue = 1.210565;
    else woeValue = 0;}else if(max_price.getName().equals(varName)){if (value == null) woeValue = 0.309274;
    else if (-1e38 < valueDouble && valueDouble <= 457459) woeValue = -0.076650;
    else if ( valueDouble > 457459) woeValue = 0.617956;
    else woeValue = 0;}else if(num_address_states.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.092760;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.122440;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = 0.172745;
    else if ( valueDouble > 4) woeValue = 0.998314;
    else woeValue = 0;}else if(primaryach_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 52) woeValue = 2.650077;
    else if (52 < valueDouble && valueDouble <= 135) woeValue = 1.765348;
    else if (135 < valueDouble && valueDouble <= 210) woeValue = 1.097461;
    else if (210 < valueDouble && valueDouble <= 278) woeValue = 0.679673;
    else if (278 < valueDouble && valueDouble <= 347) woeValue = 0.458134;
    else if (347 < valueDouble && valueDouble <= 668) woeValue = 0.261146;
    else if (668 < valueDouble && valueDouble <= 912) woeValue = -0.010848;
    else if (912 < valueDouble && valueDouble <= 1078) woeValue = -0.221622;
    else if (1078 < valueDouble && valueDouble <= 1970) woeValue = -0.305681;
    else if (1970 < valueDouble && valueDouble <= 2575) woeValue = -0.992369;
    else if (2575 < valueDouble && valueDouble <= 2692) woeValue = -1.111463;
    else if ( valueDouble > 2692) woeValue = -1.288151;
    else woeValue = 0;}else if(primaryach_verify_saving.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.027650;
    else if ( valueDouble > 0) woeValue = 4.000000;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.738897;
    else if (-1e38 < valueDouble && valueDouble <= 0.0984360118) woeValue = -0.459506;
    else if (0.0984360118 < valueDouble && valueDouble <= 0.1878585086) woeValue = -0.387216;
    else if (0.1878585086 < valueDouble && valueDouble <= 0.2358977628) woeValue = -0.202805;
    else if (0.2358977628 < valueDouble && valueDouble <= 0.3164159265) woeValue = -0.185053;
    else if (0.3164159265 < valueDouble && valueDouble <= 0.4201183432) woeValue = -0.104961;
    else if (0.4201183432 < valueDouble && valueDouble <= 0.4866137669) woeValue = -0.098792;
    else if (0.4866137669 < valueDouble && valueDouble <= 0.9008805031) woeValue = 0.043943;
    else if (0.9008805031 < valueDouble && valueDouble <= 7.1526104418) woeValue = 0.256321;
    else if ( valueDouble > 7.1526104418) woeValue = 0.501925;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0.265618;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.529278;
    else if (0 < valueDouble && valueDouble <= 0.003) woeValue = -0.990305;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -0.878625;
    else if (0.004 < valueDouble && valueDouble <= 0.005) woeValue = -0.613779;
    else if (0.005 < valueDouble && valueDouble <= 0.006) woeValue = -0.571265;
    else if (0.006 < valueDouble && valueDouble <= 0.008) woeValue = -0.345819;
    else if (0.008 < valueDouble && valueDouble <= 0.009) woeValue = -0.294423;
    else if (0.009 < valueDouble && valueDouble <= 0.015) woeValue = 0.078441;
    else if (0.015 < valueDouble && valueDouble <= 0.019) woeValue = 0.834224;
    else if (0.019 < valueDouble && valueDouble <= 0.024) woeValue = 0.921499;
    else if (0.024 < valueDouble && valueDouble <= 0.031) woeValue = 1.052293;
    else if (0.031 < valueDouble && valueDouble <= 0.038) woeValue = 1.279584;
    else if ( valueDouble > 0.038) woeValue = 1.429737;
    else woeValue = 0;}else if(s_ach_cleared_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 71816) woeValue = 1.404682;
    else if (71816 < valueDouble && valueDouble <= 93819) woeValue = 1.003721;
    else if (93819 < valueDouble && valueDouble <= 158456) woeValue = 0.752012;
    else if (158456 < valueDouble && valueDouble <= 226659) woeValue = 0.531161;
    else if (226659 < valueDouble && valueDouble <= 255412) woeValue = 0.199334;
    else if (255412 < valueDouble && valueDouble <= 316442) woeValue = 0.117006;
    else if (316442 < valueDouble && valueDouble <= 399974) woeValue = -0.225455;
    else if (399974 < valueDouble && valueDouble <= 437988) woeValue = -0.245324;
    else if (437988 < valueDouble && valueDouble <= 991750) woeValue = -0.340485;
    else if (991750 < valueDouble && valueDouble <= 1339008) woeValue = -0.467574;
    else if ( valueDouble > 1339008) woeValue = -0.684065;
    else woeValue = 0;}else if(s_amt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.127711;
    else if (0 < valueDouble && valueDouble <= 0.962) woeValue = -0.436174;
    else if (0.962 < valueDouble && valueDouble <= 99.4666) woeValue = -0.338821;
    else if (99.4666 < valueDouble && valueDouble <= 391.5823) woeValue = -0.140443;
    else if (391.5823 < valueDouble && valueDouble <= 1083.59) woeValue = -0.061872;
    else if (1083.59 < valueDouble && valueDouble <= 1357.8222) woeValue = 0.053415;
    else if (1357.8222 < valueDouble && valueDouble <= 2767.3422) woeValue = 0.070018;
    else if (2767.3422 < valueDouble && valueDouble <= 3549.5989) woeValue = 0.133804;
    else if (3549.5989 < valueDouble && valueDouble <= 16124.6598) woeValue = 0.387415;
    else if ( valueDouble > 16124.6598) woeValue = 1.285246;
    else woeValue = 0;}else if(s_c_fso_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.029605;
    else if ( valueDouble > 0) woeValue = 3.619695;
    else woeValue = 0;}else if(s_has_used_vid.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.052068;
    else if ( valueDouble > 0) woeValue = -0.213428;
    else woeValue = 0;}else if(s_r_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.332967;
    else if (0 < valueDouble && valueDouble <= 1.7852) woeValue = 0.062575;
    else if (1.7852 < valueDouble && valueDouble <= 2521.1122) woeValue = 0.224533;
    else if (2521.1122 < valueDouble && valueDouble <= 3941.151) woeValue = 0.453094;
    else if (3941.151 < valueDouble && valueDouble <= 6955.4466) woeValue = 0.616571;
    else if (6955.4466 < valueDouble && valueDouble <= 16927.7109) woeValue = 1.230264;
    else if ( valueDouble > 16927.7109) woeValue = 2.105209;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.140985;
    else if (0 < valueDouble && valueDouble <= 0.0029610178) woeValue = 0.414390;
    else if (0.0029610178 < valueDouble && valueDouble <= 0.0172298642) woeValue = 0.588796;
    else if (0.0172298642 < valueDouble && valueDouble <= 0.0586640685) woeValue = 0.637506;
    else if (0.0586640685 < valueDouble && valueDouble <= 0.1675305413) woeValue = 0.643854;
    else if (0.1675305413 < valueDouble && valueDouble <= 0.4465271229) woeValue = 0.910183;
    else if ( valueDouble > 0.4465271229) woeValue = 1.263688;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.9079754601) woeValue = 2.211817;
    else if (0.9079754601 < valueDouble && valueDouble <= 0.9430693069) woeValue = 1.340111;
    else if (0.9430693069 < valueDouble && valueDouble <= 0.9753846154) woeValue = 0.814198;
    else if (0.9753846154 < valueDouble && valueDouble <= 0.9866666667) woeValue = 0.635993;
    else if (0.9866666667 < valueDouble && valueDouble <= 0.9893992933) woeValue = 0.345591;
    else if ( valueDouble > 0.9893992933) woeValue = -0.259680;
    else woeValue = 0;}else if(s_vid_min_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.091758;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.387745;
    else if (2 < valueDouble && valueDouble <= 151) woeValue = 0.067441;
    else if (151 < valueDouble && valueDouble <= 443) woeValue = -0.333177;
    else if ( valueDouble > 443) woeValue = -0.558369;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.881614;
    else if ( valueDouble > 0) woeValue = -0.318730;
    else woeValue = 0;}else if(txnsnt_amt_stss_min_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.122643;
    else if ( valueDouble > -1) woeValue = 1.211384;
    else woeValue = 0;}else if(v35_sf_classifier.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.9534574307) woeValue = 1.120682;
    else if (0.9534574307 < valueDouble && valueDouble <= 0.9758208478) woeValue = 1.043736;
    else if (0.9758208478 < valueDouble && valueDouble <= 0.9812613276) woeValue = 0.738615;
    else if (0.9812613276 < valueDouble && valueDouble <= 0.9911740573) woeValue = 0.513381;
    else if (0.9911740573 < valueDouble && valueDouble <= 0.9924400556) woeValue = 0.402858;
    else if (0.9924400556 < valueDouble && valueDouble <= 0.9934543827) woeValue = 0.283710;
    else if (0.9934543827 < valueDouble && valueDouble <= 0.9942850634) woeValue = 0.265199;
    else if (0.9942850634 < valueDouble && valueDouble <= 0.9964731625) woeValue = 0.167999;
    else if (0.9964731625 < valueDouble && valueDouble <= 0.9978907371) woeValue = -0.056584;
    else if (0.9978907371 < valueDouble && valueDouble <= 0.9980755446) woeValue = -0.107521;
    else if (0.9980755446 < valueDouble && valueDouble <= 0.9985432697) woeValue = -0.274724;
    else if (0.9985432697 < valueDouble && valueDouble <= 0.9994900079) woeValue = -0.328788;
    else if (0.9994900079 < valueDouble && valueDouble <= 0.9997643549) woeValue = -0.455803;
    else if (0.9997643549 < valueDouble && valueDouble <= 0.9998652647) woeValue = -0.513388;
    else if (0.9998652647 < valueDouble && valueDouble <= 0.9999575502) woeValue = -0.581019;
    else if ( valueDouble > 0.9999575502) woeValue = -0.734520;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.302744;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.235279;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.187535;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.067182;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.015281;
    else if ( valueDouble > 4) woeValue = 0.138121;
    else woeValue = 0;}else if(flow_from_country.getName().equals(varName)){if (Arrays.asList( "DE").contains(value)) woeValue = -0.340270;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 0.196708;
    else if (Arrays.asList( "NL").contains(value)) woeValue = 1.518175;
    else if (Arrays.asList( "ES").contains(value)) woeValue = 1.745252;
    else woeValue = 0;}else if(v35_ph_indicative.getName().equals(varName)){if (Arrays.asList( "ACCESS_NUMBER","MOBILE_GEO_MATCH","TOLLFREE","FIXED","TWO_SIMILAR").contains(value)) woeValue = -0.440837;
    else if (Arrays.asList( "OTHER").contains(value)) woeValue = -0.136579;
    else if (Arrays.asList( "NO_PHONES").contains(value)) woeValue = -0.082610;
    else if (Arrays.asList( "TWO_GEO_MATCH","CORP"," ").contains(value)) woeValue = 0.145256;
    else if (Arrays.asList( "FIXED_GEO_MATCH").contains(value)) woeValue = 0.312247;
    else if (Arrays.asList( "MOBILE").contains(value)) woeValue = 0.591513;
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
    
    coeffMap.put("Intercept",+8.26162555);
    coeffMap.put(flow_from_country.getName(),-0.40826600);
    coeffMap.put(primaryach_dof.getName(),-0.59042132);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-1.17860512);
    coeffMap.put(MOA_V_MOALife.getName(),-0.53307530);
    coeffMap.put(s_r_amt_dk_160.getName(),-0.33515167);
    coeffMap.put(s_c_fso_match.getName(),-0.61308147);
    coeffMap.put(s_ach_cleared_amt.getName(),-0.71484260);
    coeffMap.put(CP20WRtAtoBadTxn.getName(),-0.29245108);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.37812993);
    coeffMap.put(acct_login_cnt_dk_80.getName(),-0.64717976);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.91100683);
    coeffMap.put(ebay_5d_amt_dk_360all.getName(),-0.11193040);
    coeffMap.put(added_ach_lt_1.getName(),-1.12859845);
    coeffMap.put(max_price.getName(),-0.71546078);
    coeffMap.put(s_amt_dk_10.getName(),-0.49681210);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.15420355);
    coeffMap.put(email_MP_since_bought.getName(),-0.40268516);
    coeffMap.put(v35_sf_classifier.getName(),-0.26274845);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.29533987);
    coeffMap.put(s_vid_min_tof.getName(),-0.87262944);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-1.10881862);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.64093577);
    coeffMap.put(email_numofvowely.getName(),-1.07454722);
    coeffMap.put(is_credit_union.getName(),-0.77366212);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.26001226);
    coeffMap.put(v35_ph_indicative.getName(),-0.24650203);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.32862582);
    coeffMap.put(txnsnt_amt_stss_min_lst_48_hrs.getName(),-0.23495698);
    coeffMap.put(rt_num_rate.getName(),-0.17372135);
    coeffMap.put(s_has_used_vid.getName(),-0.20009846);
    coeffMap.put(ipr_ratio_4w_ato_dol.getName(),-0.45687491);
    coeffMap.put(num_address_states.getName(),-0.22851844);
    coeffMap.put(primaryach_verify_saving.getName(),-0.14141452);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 807.85048343;
  }

  @Override
  public double getCoeff2() {
    return  -52.87335071;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT10;
  }
  
}