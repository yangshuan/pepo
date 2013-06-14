package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg6 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v35_counterparty_account_age);
    variables.add(MOA_V_MOALife);
    variables.add(CP4WRtDolBadTxn);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(Decline_rate_buffccbin);
    variables.add(is_yodlee_verified);
    variables.add(wach_n_authorized);
    variables.add(min_ebay_since_bought_360all);
    variables.add(v3_account_age);
    variables.add(snr_delta_20w_appr_pertxn_c);
    variables.add(v31_ip_shipping_billing_match);
    variables.add(s_ach_failed_ratio_new);
    variables.add(CP20WRtAtoBadAcc);
    variables.add(s_v_tx_ratio_num);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(counterparty_consistency_numeric);
    variables.add(cc_decline_30d_dk__cnt);
    variables.add(v2_ph_indicative);
    variables.add(MOC_V_MOCLife);
    variables.add(rt_num_rate);
    variables.add(a_bdrt_Veri_txn);
    variables.add(s_ratio_avg_dk_20);
    variables.add(v2_ip_bin_ctry_score_worst);
    variables.add(rt_YD_add_acc);
    variables.add(top_bin_amt_pct);
    variables.add(s_r_amt_dk_40);
    variables.add(n_dist_bankid_30d_180d);
    variables.add(s_ms_cnt_dk_40);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(v36_tx_cnt_in_last_1d);
    variables.add(max_cross20wRtAtoCcBadTxn);
    variables.add(s_iach_completed_count);
    variables.add(v36_diff_vid_3d);
    variables.add(p90_dys_return);
    variables.add(primaryach_country);


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

    if(CP20WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.656525;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = -0.508235;
    else if (0.0003 < valueDouble && valueDouble <= 0.0004) woeValue = -0.322932;
    else if (0.0004 < valueDouble && valueDouble <= 0.0011) woeValue = 0.147857;
    else if (0.0011 < valueDouble && valueDouble <= 0.0015) woeValue = 0.164572;
    else if (0.0015 < valueDouble && valueDouble <= 0.0021) woeValue = 0.295464;
    else if (0.0021 < valueDouble && valueDouble <= 0.0072) woeValue = 1.212541;
    else if ( valueDouble > 0.0072) woeValue = 1.675650;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.563709;
    else if (0 < valueDouble && valueDouble <= 0.0019) woeValue = -0.797138;
    else if (0.0019 < valueDouble && valueDouble <= 0.0023) woeValue = -0.735609;
    else if (0.0023 < valueDouble && valueDouble <= 0.0036) woeValue = -0.476421;
    else if (0.0036 < valueDouble && valueDouble <= 0.0043) woeValue = -0.416259;
    else if (0.0043 < valueDouble && valueDouble <= 0.0051) woeValue = -0.250217;
    else if (0.0051 < valueDouble && valueDouble <= 0.0062) woeValue = -0.134870;
    else if (0.0062 < valueDouble && valueDouble <= 0.0068) woeValue = 0.331674;
    else if (0.0068 < valueDouble && valueDouble <= 0.008) woeValue = 0.580002;
    else if (0.008 < valueDouble && valueDouble <= 0.0087) woeValue = 0.622434;
    else if (0.0087 < valueDouble && valueDouble <= 0.0175) woeValue = 0.810208;
    else if ( valueDouble > 0.0175) woeValue = 1.170322;
    else woeValue = 0;}else if(Decline_rate_buffccbin.getName().equals(varName)){if (value == null) woeValue = -0.103164;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.845305;
    else if (0 < valueDouble && valueDouble <= 0.0952380952) woeValue = -0.750525;
    else if (0.0952380952 < valueDouble && valueDouble <= 0.375538329) woeValue = -0.414520;
    else if (0.375538329 < valueDouble && valueDouble <= 0.4117647059) woeValue = -0.045743;
    else if (0.4117647059 < valueDouble && valueDouble <= 0.431372549) woeValue = -0.037227;
    else if (0.431372549 < valueDouble && valueDouble <= 0.6001154068) woeValue = 0.234590;
    else if (0.6001154068 < valueDouble && valueDouble <= 0.6326530612) woeValue = 0.537701;
    else if ( valueDouble > 0.6326530612) woeValue = 0.800497;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0483053732) woeValue = -0.532967;
    else if (0.0483053732 < valueDouble && valueDouble <= 0.1016758486) woeValue = -0.479454;
    else if (0.1016758486 < valueDouble && valueDouble <= 0.1338276737) woeValue = -0.406305;
    else if (0.1338276737 < valueDouble && valueDouble <= 0.1849556276) woeValue = -0.327183;
    else if (0.1849556276 < valueDouble && valueDouble <= 0.197321395) woeValue = -0.279966;
    else if (0.197321395 < valueDouble && valueDouble <= 0.2550909471) woeValue = -0.153542;
    else if (0.2550909471 < valueDouble && valueDouble <= 0.2912923923) woeValue = -0.043730;
    else if (0.2912923923 < valueDouble && valueDouble <= 0.3118664758) woeValue = -0.012045;
    else if (0.3118664758 < valueDouble && valueDouble <= 0.4199772985) woeValue = 0.220617;
    else if (0.4199772985 < valueDouble && valueDouble <= 0.4999931599) woeValue = 0.386777;
    else if (0.4999931599 < valueDouble && valueDouble <= 0.6936864015) woeValue = 0.486499;
    else if (0.6936864015 < valueDouble && valueDouble <= 1.139748025) woeValue = 0.841393;
    else if ( valueDouble > 1.139748025) woeValue = 1.814268;
    else woeValue = 0;}else if(MOC_V_MOCLife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.25) woeValue = -0.275604;
    else if (0.25 < valueDouble && valueDouble <= 0.4) woeValue = -0.218326;
    else if (0.4 < valueDouble && valueDouble <= 0.5) woeValue = -0.144326;
    else if (0.5 < valueDouble && valueDouble <= 0.6) woeValue = 0.095585;
    else if (0.6 < valueDouble && valueDouble <= 0.6666666667) woeValue = 0.175137;
    else if (0.6666666667 < valueDouble && valueDouble <= 1) woeValue = 0.456306;
    else if ( valueDouble > 1) woeValue = 1.533419;
    else woeValue = 0;}else if(a_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.576278;
    else if (0 < valueDouble && valueDouble <= 0.00007) woeValue = -0.768366;
    else if (0.00007 < valueDouble && valueDouble <= 0.00038) woeValue = -0.456729;
    else if (0.00038 < valueDouble && valueDouble <= 0.00059) woeValue = -0.297834;
    else if (0.00059 < valueDouble && valueDouble <= 0.00285) woeValue = 0.066731;
    else if (0.00285 < valueDouble && valueDouble <= 0.00364) woeValue = 0.333758;
    else if (0.00364 < valueDouble && valueDouble <= 0.00786) woeValue = 0.786073;
    else if (0.00786 < valueDouble && valueDouble <= 0.0215) woeValue = 1.438239;
    else if ( valueDouble > 0.0215) woeValue = 1.928955;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.793462;
    else if (0 < valueDouble && valueDouble <= 133) woeValue = 1.234746;
    else if (133 < valueDouble && valueDouble <= 1040) woeValue = 0.437271;
    else if (1040 < valueDouble && valueDouble <= 1310) woeValue = 0.376641;
    else if (1310 < valueDouble && valueDouble <= 1547) woeValue = 0.347152;
    else if (1547 < valueDouble && valueDouble <= 2227) woeValue = 0.161174;
    else if (2227 < valueDouble && valueDouble <= 4543) woeValue = 0.023966;
    else if (4543 < valueDouble && valueDouble <= 17999) woeValue = -0.271514;
    else if ( valueDouble > 17999) woeValue = -0.460743;
    else woeValue = 0;}else if(cc_decline_30d_dk__cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.166672;
    else if (0 < valueDouble && valueDouble <= 0.0002245337) woeValue = 0.224658;
    else if (0.0002245337 < valueDouble && valueDouble <= 0.0093438416) woeValue = 0.286994;
    else if (0.0093438416 < valueDouble && valueDouble <= 0.7475656766) woeValue = 0.745100;
    else if ( valueDouble > 0.7475656766) woeValue = 1.325486;
    else woeValue = 0;}else if(counterparty_consistency_numeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 1.647498;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.386350;
    else if (0 < valueDouble && valueDouble <= 59) woeValue = 0.806228;
    else if (59 < valueDouble && valueDouble <= 90) woeValue = 0.574591;
    else if (90 < valueDouble && valueDouble <= 257) woeValue = 0.474281;
    else if (257 < valueDouble && valueDouble <= 493) woeValue = 0.155844;
    else if (493 < valueDouble && valueDouble <= 646) woeValue = 0.031021;
    else if ( valueDouble > 646) woeValue = -0.183738;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5837150533) woeValue = -0.271398;
    else if (0.5837150533 < valueDouble && valueDouble <= 0.7138065353) woeValue = -0.249473;
    else if (0.7138065353 < valueDouble && valueDouble <= 1.1389735645) woeValue = -0.065099;
    else if (1.1389735645 < valueDouble && valueDouble <= 1.3452893226) woeValue = 0.092107;
    else if (1.3452893226 < valueDouble && valueDouble <= 2.0138585264) woeValue = 0.232139;
    else if (2.0138585264 < valueDouble && valueDouble <= 2.7096984357) woeValue = 0.269568;
    else if (2.7096984357 < valueDouble && valueDouble <= 5.0285363967) woeValue = 0.602370;
    else if ( valueDouble > 5.0285363967) woeValue = 1.330582;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.573119;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.487188;
    else if ( valueDouble > 0) woeValue = 0.375551;
    else woeValue = 0;}else if(is_yodlee_verified.getName().equals(varName)){if (value == null) woeValue = -1.389293;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if ( valueDouble > 0) woeValue = 0.945994;
    else woeValue = 0;}else if(max_cross20wRtAtoCcBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0009) woeValue = -1.326877;
    else if (0.0009 < valueDouble && valueDouble <= 0.001) woeValue = -0.934767;
    else if (0.001 < valueDouble && valueDouble <= 0.0011) woeValue = -0.768623;
    else if (0.0011 < valueDouble && valueDouble <= 0.0012) woeValue = -0.490899;
    else if (0.0012 < valueDouble && valueDouble <= 0.0015) woeValue = -0.219153;
    else if (0.0015 < valueDouble && valueDouble <= 0.0017) woeValue = -0.166768;
    else if (0.0017 < valueDouble && valueDouble <= 0.0028) woeValue = -0.024131;
    else if (0.0028 < valueDouble && valueDouble <= 0.0031) woeValue = 0.064159;
    else if (0.0031 < valueDouble && valueDouble <= 0.0034) woeValue = 0.362207;
    else if (0.0034 < valueDouble && valueDouble <= 0.0128) woeValue = 0.806825;
    else if ( valueDouble > 0.0128) woeValue = 0.973899;
    else woeValue = 0;}else if(min_ebay_since_bought_360all.getName().equals(varName)){if (value == null) woeValue = 0.818384;
    else if (-1e38 < valueDouble && valueDouble <= 148) woeValue = 1.163520;
    else if (148 < valueDouble && valueDouble <= 261) woeValue = 0.694728;
    else if (261 < valueDouble && valueDouble <= 657) woeValue = 0.529694;
    else if (657 < valueDouble && valueDouble <= 1481) woeValue = 0.275106;
    else if (1481 < valueDouble && valueDouble <= 1718) woeValue = 0.024421;
    else if (1718 < valueDouble && valueDouble <= 2194) woeValue = -0.087619;
    else if (2194 < valueDouble && valueDouble <= 2543) woeValue = -0.224803;
    else if (2543 < valueDouble && valueDouble <= 2882) woeValue = -0.400573;
    else if ( valueDouble > 2882) woeValue = -0.711257;
    else woeValue = 0;}else if(n_dist_bankid_30d_180d.getName().equals(varName)){if (value == null) woeValue = 0.709458;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.390818;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.438131;
    else if ( valueDouble > 1) woeValue = 0.762657;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = -0.941881;
    else if (4 < valueDouble && valueDouble <= 7) woeValue = -0.240665;
    else if (7 < valueDouble && valueDouble <= 10) woeValue = 0.569229;
    else if (10 < valueDouble && valueDouble <= 12) woeValue = 0.575114;
    else if (12 < valueDouble && valueDouble <= 16) woeValue = 1.950355;
    else if ( valueDouble > 16) woeValue = 2.765594;
    else woeValue = 0;}else if(primaryach_country.getName().equals(varName)){if (Arrays.asList( "AU").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "GB").contains(value)) woeValue = -1.170077;
    else if (Arrays.asList( "DE").contains(value)) woeValue = -0.581229;
    else if (Arrays.asList( "","CA").contains(value)) woeValue = 0.127966;
    else if (Arrays.asList( "US").contains(value)) woeValue = 0.206123;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 0.308484;
    else if (Arrays.asList( "NL","MX").contains(value)) woeValue = 2.084036;
    else if (Arrays.asList( "ES","IL").contains(value)) woeValue = 2.748072;
    else woeValue = 0;}else if(rt_YD_add_acc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.180338;
    else if (0 < valueDouble && valueDouble <= 0.46809) woeValue = -0.028867;
    else if (0.46809 < valueDouble && valueDouble <= 0.51775) woeValue = 0.078246;
    else if (0.51775 < valueDouble && valueDouble <= 0.53726) woeValue = 0.314783;
    else if (0.53726 < valueDouble && valueDouble <= 0.62221) woeValue = 0.521844;
    else if ( valueDouble > 0.62221) woeValue = 0.927581;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0.096619;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.817408;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -1.645353;
    else if (0.002 < valueDouble && valueDouble <= 0.003) woeValue = -1.339850;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -1.209532;
    else if (0.004 < valueDouble && valueDouble <= 0.008) woeValue = -0.750825;
    else if (0.008 < valueDouble && valueDouble <= 0.009) woeValue = -0.559108;
    else if (0.009 < valueDouble && valueDouble <= 0.024) woeValue = 0.410467;
    else if (0.024 < valueDouble && valueDouble <= 0.031) woeValue = 0.787340;
    else if ( valueDouble > 0.031) woeValue = 1.265264;
    else woeValue = 0;}else if(s_ach_failed_ratio_new.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.101652;
    else if (0 < valueDouble && valueDouble <= 0.0028409091) woeValue = -0.636565;
    else if (0.0028409091 < valueDouble && valueDouble <= 0.0047770701) woeValue = -0.267937;
    else if (0.0047770701 < valueDouble && valueDouble <= 0.0098920863) woeValue = 0.116946;
    else if (0.0098920863 < valueDouble && valueDouble <= 0.0188501414) woeValue = 0.332884;
    else if (0.0188501414 < valueDouble && valueDouble <= 0.0277777778) woeValue = 1.017241;
    else if ( valueDouble > 0.0277777778) woeValue = 1.293227;
    else woeValue = 0;}else if(s_iach_completed_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 31) woeValue = 1.088727;
    else if (31 < valueDouble && valueDouble <= 40) woeValue = 0.712595;
    else if (40 < valueDouble && valueDouble <= 59) woeValue = 0.502995;
    else if (59 < valueDouble && valueDouble <= 82) woeValue = 0.186503;
    else if (82 < valueDouble && valueDouble <= 110) woeValue = 0.069552;
    else if (110 < valueDouble && valueDouble <= 190) woeValue = -0.051377;
    else if (190 < valueDouble && valueDouble <= 201) woeValue = -0.086752;
    else if (201 < valueDouble && valueDouble <= 213) woeValue = -0.098091;
    else if (213 < valueDouble && valueDouble <= 1627) woeValue = -0.373715;
    else if ( valueDouble > 1627) woeValue = -1.893707;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.799886;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.486098;
    else if (0 < valueDouble && valueDouble <= 0.0286) woeValue = -0.404834;
    else if (0.0286 < valueDouble && valueDouble <= 0.1451) woeValue = -0.266471;
    else if (0.1451 < valueDouble && valueDouble <= 0.184) woeValue = -0.190516;
    else if (0.184 < valueDouble && valueDouble <= 0.6535) woeValue = -0.123075;
    else if (0.6535 < valueDouble && valueDouble <= 0.9194) woeValue = 0.113060;
    else if (0.9194 < valueDouble && valueDouble <= 0.999) woeValue = 0.278625;
    else if (0.999 < valueDouble && valueDouble <= 1.4917) woeValue = 0.826279;
    else if (1.4917 < valueDouble && valueDouble <= 2.0143) woeValue = 1.008002;
    else if (2.0143 < valueDouble && valueDouble <= 3.4066) woeValue = 1.392615;
    else if ( valueDouble > 3.4066) woeValue = 2.132602;
    else woeValue = 0;}else if(s_r_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.538357;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.087936;
    else if (0 < valueDouble && valueDouble <= 2.2932) woeValue = -0.083673;
    else if (2.2932 < valueDouble && valueDouble <= 61.0582) woeValue = 0.106595;
    else if (61.0582 < valueDouble && valueDouble <= 185.975) woeValue = 0.438645;
    else if (185.975 < valueDouble && valueDouble <= 453.0983) woeValue = 0.633796;
    else if (453.0983 < valueDouble && valueDouble <= 953.6675) woeValue = 0.768347;
    else if (953.6675 < valueDouble && valueDouble <= 1973.6608) woeValue = 0.935998;
    else if (1973.6608 < valueDouble && valueDouble <= 4979.7241) woeValue = 1.554739;
    else if ( valueDouble > 4979.7241) woeValue = 2.097640;
    else woeValue = 0;}else if(s_ratio_avg_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1905) woeValue = -0.566183;
    else if (0.1905 < valueDouble && valueDouble <= 0.22) woeValue = -0.502276;
    else if (0.22 < valueDouble && valueDouble <= 0.3481) woeValue = -0.455172;
    else if (0.3481 < valueDouble && valueDouble <= 0.4903) woeValue = -0.241057;
    else if (0.4903 < valueDouble && valueDouble <= 0.7805) woeValue = -0.149276;
    else if (0.7805 < valueDouble && valueDouble <= 0.9288) woeValue = -0.055171;
    else if (0.9288 < valueDouble && valueDouble <= 10.3973) woeValue = 0.191437;
    else if (10.3973 < valueDouble && valueDouble <= 18.0481) woeValue = 0.240672;
    else if ( valueDouble > 18.0481) woeValue = 0.780297;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.117294;
    else if (0 < valueDouble && valueDouble <= 0.0892185174) woeValue = 0.480247;
    else if (0.0892185174 < valueDouble && valueDouble <= 0.5515212296) woeValue = 0.490306;
    else if ( valueDouble > 0.5515212296) woeValue = 1.211713;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.9032074936) woeValue = 1.848085;
    else if (0.9032074936 < valueDouble && valueDouble <= 0.9332566168) woeValue = 1.021610;
    else if (0.9332566168 < valueDouble && valueDouble <= 0.9482758621) woeValue = 0.804818;
    else if (0.9482758621 < valueDouble && valueDouble <= 0.9577039275) woeValue = 0.660150;
    else if (0.9577039275 < valueDouble && valueDouble <= 0.9775280899) woeValue = 0.526720;
    else if (0.9775280899 < valueDouble && valueDouble <= 0.9864457831) woeValue = 0.250012;
    else if (0.9864457831 < valueDouble && valueDouble <= 0.9880184332) woeValue = -0.021238;
    else if (0.9880184332 < valueDouble && valueDouble <= 0.9894736842) woeValue = -0.143489;
    else if (0.9894736842 < valueDouble && valueDouble <= 0.9919632606) woeValue = -0.190613;
    else if (0.9919632606 < valueDouble && valueDouble <= 0.9930394432) woeValue = -0.347625;
    else if ( valueDouble > 0.9930394432) woeValue = -0.360821;
    else woeValue = 0;}else if(snr_delta_20w_appr_pertxn_c.getName().equals(varName)){if (Arrays.asList("s0").contains(value)) woeValue = -0.219702;
    else if (Arrays.asList( "s1"," ").contains(value)) woeValue = 0.241328;
    else if (Arrays.asList("s2").contains(value)) woeValue = 0.512155;
    else if (Arrays.asList("sm").contains(value)) woeValue = 0.895034;
    else if (Arrays.asList("s3").contains(value)) woeValue = 1.042942;
    else woeValue = 0;}else if(top_bin_amt_pct.getName().equals(varName)){if (value == null) woeValue = 0.130337;
    else if (-1e38 < valueDouble && valueDouble <= 0.016) woeValue = 0.996126;
    else if (0.016 < valueDouble && valueDouble <= 0.024) woeValue = 0.049941;
    else if (0.024 < valueDouble && valueDouble <= 0.033) woeValue = -0.033210;
    else if (0.033 < valueDouble && valueDouble <= 0.037) woeValue = -0.151505;
    else if ( valueDouble > 0.037) woeValue = -0.285107;
    else woeValue = 0;}else if(v2_ip_bin_ctry_score_worst.getName().equals(varName)){if (Arrays.asList( "NO_DATA","_MISSING_","EXCELLENT").contains(value)) woeValue = -3.649824;
    else if (Arrays.asList( "MM_ERROR").contains(value)) woeValue = -0.693855;
    else if (Arrays.asList( "MED","NO_CCS").contains(value)) woeValue = -0.126840;
    else if (Arrays.asList( "GOOD"," ","BAD").contains(value)) woeValue = 0.081667;
    else if (Arrays.asList( "EVIL").contains(value)) woeValue = 0.437461;
    else woeValue = 0;}else if(v2_ph_indicative.getName().equals(varName)){if (Arrays.asList( "RESHIPPER").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "_MISSING_").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "OTHER","TWO_SIMILAR").contains(value)) woeValue = -0.729023;
    else if (Arrays.asList( "FIXED").contains(value)) woeValue = -0.443454;
    else if (Arrays.asList( "FIXED_GEO_MATCH").contains(value)) woeValue = -0.170670;
    else if (Arrays.asList( "NO_PHONES").contains(value)) woeValue = -0.142982;
    else if (Arrays.asList( "CORP","TWO_GEO_MATCH"," ","TOLLFREE").contains(value)) woeValue = 0.269318;
    else if (Arrays.asList( "MOBILE_GEO_MATCH","MOBILE","OTHER_GEO_MATCH").contains(value)) woeValue = 0.521941;
    else woeValue = 0;}else if(v31_ip_shipping_billing_match.getName().equals(varName)){if (Arrays.asList( "NO_GEO_AD_DIFF","_MISSING_","NO_GEO_AD_MATCH").contains(value)) woeValue = -1.205634;
    else if (Arrays.asList( "FULL_CTRY_MATCH").contains(value)) woeValue = -0.592808;
    else if (Arrays.asList( "SHIP_MATCH_IP_BUT_BILL_DIFF").contains(value)) woeValue = -0.582093;
    else if (Arrays.asList( "FULL_MATCH").contains(value)) woeValue = -0.511583;
    else if (Arrays.asList( "FULL_MATCH_CTRY_MISTAKE","SHIP_MATCH_BILL_BUT_IP_DIFF","BILL_MATCH_IP_BUT_SHIP_DIFF"," ").contains(value)) woeValue = 0.221952;
    else if (Arrays.asList( "SHIP_AD_NULL","ALL_DIFF").contains(value)) woeValue = 0.874003;
    else woeValue = 0;}else if(v35_counterparty_account_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 103.62540509) woeValue = 0.886304;
    else if (103.62540509 < valueDouble && valueDouble <= 1191.6913542) woeValue = 0.355698;
    else if (1191.6913542 < valueDouble && valueDouble <= 2923.7072338) woeValue = -0.269560;
    else if (2923.7072338 < valueDouble && valueDouble <= 4032.1521528) woeValue = -0.680081;
    else if (4032.1521528 < valueDouble && valueDouble <= 4283.0230671) woeValue = -0.726196;
    else if ( valueDouble > 4283.0230671) woeValue = -0.855912;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.343406;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.930881;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.281873;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.247369;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.217015;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.112786;
    else if (4 < valueDouble && valueDouble <= 8) woeValue = 0.125377;
    else if (8 < valueDouble && valueDouble <= 9) woeValue = 0.166650;
    else if ( valueDouble > 9) woeValue = 0.455771;
    else woeValue = 0;}else if(v36_tx_cnt_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.166454;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = -0.073884;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.222114;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.522285;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 0.843997;
    else if ( valueDouble > 8) woeValue = 1.359298;
    else woeValue = 0;}else if(v3_account_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 355.56961806) woeValue = 1.096709;
    else if (355.56961806 < valueDouble && valueDouble <= 598.87630787) woeValue = 0.729332;
    else if (598.87630787 < valueDouble && valueDouble <= 881.95664352) woeValue = 0.521616;
    else if (881.95664352 < valueDouble && valueDouble <= 1123.8442245) woeValue = 0.346942;
    else if (1123.8442245 < valueDouble && valueDouble <= 1399.4580324) woeValue = 0.154981;
    else if (1399.4580324 < valueDouble && valueDouble <= 1967.4591898) woeValue = 0.142444;
    else if (1967.4591898 < valueDouble && valueDouble <= 2488.9572801) woeValue = -0.232676;
    else if (2488.9572801 < valueDouble && valueDouble <= 4145.6764468) woeValue = -0.424824;
    else if ( valueDouble > 4145.6764468) woeValue = -0.562121;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = 0.709458;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.133693;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.413208;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.093021;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.046966;
    else if ( valueDouble > 3) woeValue = 0.442619;
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
    
    coeffMap.put("Intercept",+9.41165066);
    coeffMap.put(p90_dys_return.getName(),-0.6636773);
    coeffMap.put(CP20WRtAtoBadAcc.getName(),-0.20131488);
    coeffMap.put(s_r_amt_dk_40.getName(),-0.34782011);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.22755902);
    coeffMap.put(a_bdrt_Veri_txn.getName(),-0.21202109);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.21868114);
    coeffMap.put(max_cross20wRtAtoCcBadTxn.getName(),-0.24186884);
    coeffMap.put(rt_num_rate.getName(),-0.31825063);
    coeffMap.put(MOA_V_MOALife.getName(),-0.47240415);
    coeffMap.put(is_yodlee_verified.getName(),-0.6654769);
    coeffMap.put(wach_n_authorized.getName(),-1.48961688);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.34029241);
    coeffMap.put(min_ebay_since_bought_360all.getName(),-0.26461651);
    coeffMap.put(counterparty_consistency_numeric.getName(),-0.14616484);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.28719229);
    coeffMap.put(MOC_V_MOCLife.getName(),-0.23078289);
    coeffMap.put(n_dist_bankid_30d_180d.getName(),-0.36883737);
    coeffMap.put(s_iach_completed_count.getName(),-0.4481464);
    coeffMap.put(v3_account_age.getName(),-0.37532084);
    coeffMap.put(Decline_rate_buffccbin.getName(),-0.14062732);
    coeffMap.put(v35_counterparty_account_age.getName(),-0.31969655);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-1.07786546);
    coeffMap.put(cc_decline_30d_dk__cnt.getName(),-0.35049271);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.45679069);
    coeffMap.put(v36_tx_cnt_in_last_1d.getName(),-0.4452781);
    coeffMap.put(s_ach_failed_ratio_new.getName(),-0.1992137);
    coeffMap.put(top_bin_amt_pct.getName(),-0.36533159);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.12905687);
    coeffMap.put(s_ratio_avg_dk_20.getName(),-0.52487618);
    coeffMap.put(rt_YD_add_acc.getName(),-0.57437816);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.38543798);
    coeffMap.put(primaryach_country.getName(),-0.30936878);
    coeffMap.put(v31_ip_shipping_billing_match.getName(),-0.1286107);
    coeffMap.put(snr_delta_20w_appr_pertxn_c.getName(),-0.44730517);
    coeffMap.put(v2_ip_bin_ctry_score_worst.getName(),-0.61416875);
    coeffMap.put(v2_ph_indicative.getName(),-0.19446559);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 819.97310239;
  }

  @Override
  public double getCoeff2() {
    return  -52.78261852;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT6;
  }
  
}