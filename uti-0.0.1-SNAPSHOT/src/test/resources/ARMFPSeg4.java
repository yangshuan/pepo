package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg4 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(added_phone_lt_30);
    variables.add(txnsnt_amt_stss_lst_24_hrs);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(s_trans_ip3_tof_t_v2);
    variables.add(s_vid_max_dof);
    variables.add(acct_h_s_cnt_dk_10);
    variables.add(CP4WRtDolBadTxn);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(PC_LT30K_Income_CCBIN);
    variables.add(outstd_iach_amt2);
    variables.add(ratio_login_failed_30_days);
    variables.add(max_cross20wRtDclAcc);
    variables.add(Decline_rate_ccbin);
    variables.add(ebay_V_7d1Yr_ASP_360all);
    variables.add(outamt_to_max_cleard);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(s_v_tx_ratio_num);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(IP4WRtDolBadTxn);
    variables.add(s_mp_amt_dk_80);
    variables.add(rt_num_rate);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(MOC_V_MOCLife);
    variables.add(wach_n_inactive);
    variables.add(is_credit_union);
    variables.add(email_numofconsonant);
    variables.add(s_r_amt_dk_40);
    variables.add(s_mobile_decay_5d_cnt);
    variables.add(ip_cnt_dk_20);
    variables.add(seconds_since_last_return);
    variables.add(cc_pct_unknown);
    variables.add(v36_d_sn_prev_login);
    variables.add(cc_pct_debit);
    variables.add(s_cctrans_complt_amt);
    variables.add(n_dist_bankid_30d_180d);
    variables.add(num_accounts_w_vid);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(ebay_dy_snc_sus_min_360all);


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

    if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.513493;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.613859;
    else if (0 < valueDouble && valueDouble <= 0.0007) woeValue = -0.755365;
    else if (0.0007 < valueDouble && valueDouble <= 0.0019) woeValue = -0.603370;
    else if (0.0019 < valueDouble && valueDouble <= 0.0023) woeValue = -0.452044;
    else if (0.0023 < valueDouble && valueDouble <= 0.0025) woeValue = -0.365856;
    else if (0.0025 < valueDouble && valueDouble <= 0.003) woeValue = -0.360314;
    else if (0.003 < valueDouble && valueDouble <= 0.0039) woeValue = -0.196478;
    else if (0.0039 < valueDouble && valueDouble <= 0.0043) woeValue = -0.121821;
    else if (0.0043 < valueDouble && valueDouble <= 0.0047) woeValue = -0.062233;
    else if (0.0047 < valueDouble && valueDouble <= 0.0059) woeValue = 0.195051;
    else if (0.0059 < valueDouble && valueDouble <= 0.0089) woeValue = 0.585844;
    else if ( valueDouble > 0.0089) woeValue = 0.846770;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.307246;
    else if (-1e38 < valueDouble && valueDouble <= 0.0186087727) woeValue = -1.145997;
    else if (0.0186087727 < valueDouble && valueDouble <= 0.0256811776) woeValue = -1.019758;
    else if (0.0256811776 < valueDouble && valueDouble <= 0.0337864404) woeValue = -0.795353;
    else if (0.0337864404 < valueDouble && valueDouble <= 0.0408819809) woeValue = -0.644459;
    else if (0.0408819809 < valueDouble && valueDouble <= 0.0445599057) woeValue = -0.318232;
    else if (0.0445599057 < valueDouble && valueDouble <= 0.0535613739) woeValue = -0.196934;
    else if (0.0535613739 < valueDouble && valueDouble <= 0.0550962824) woeValue = -0.032710;
    else if (0.0550962824 < valueDouble && valueDouble <= 0.0602472701) woeValue = 0.046072;
    else if (0.0602472701 < valueDouble && valueDouble <= 0.075646738) woeValue = 0.188990;
    else if (0.075646738 < valueDouble && valueDouble <= 0.0777201872) woeValue = 0.250041;
    else if (0.0777201872 < valueDouble && valueDouble <= 0.1022811409) woeValue = 0.540540;
    else if (0.1022811409 < valueDouble && valueDouble <= 0.1727153476) woeValue = 0.579558;
    else if ( valueDouble > 0.1727153476) woeValue = 0.846708;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.513493;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.124171;
    else if (0 < valueDouble && valueDouble <= 0.0005) woeValue = -0.501862;
    else if (0.0005 < valueDouble && valueDouble <= 0.0058) woeValue = 0.079243;
    else if ( valueDouble > 0.0058) woeValue = 0.933814;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.059972;
    else if ( valueDouble > 0) woeValue = 1.466109;
    else woeValue = 0;}else if(MOC_V_MOCLife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6666666667) woeValue = -0.201358;
    else if (0.6666666667 < valueDouble && valueDouble <= 0.796875) woeValue = 0.470062;
    else if (0.796875 < valueDouble && valueDouble <= 1) woeValue = 0.518555;
    else if (1 < valueDouble && valueDouble <= 1.2461538462) woeValue = 1.174914;
    else if ( valueDouble > 1.2461538462) woeValue = 1.584052;
    else woeValue = 0;}else if(PC_LT30K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = -0.282674;
    else if (-1e38 < valueDouble && valueDouble <= 0.0158172232) woeValue = -0.960993;
    else if (0.0158172232 < valueDouble && valueDouble <= 0.0179834906) woeValue = -0.839165;
    else if (0.0179834906 < valueDouble && valueDouble <= 0.021169119) woeValue = -0.813098;
    else if (0.021169119 < valueDouble && valueDouble <= 0.0226486316) woeValue = -0.788524;
    else if (0.0226486316 < valueDouble && valueDouble <= 0.0237129485) woeValue = -0.759215;
    else if (0.0237129485 < valueDouble && valueDouble <= 0.0278558651) woeValue = -0.259331;
    else if (0.0278558651 < valueDouble && valueDouble <= 0.0349107836) woeValue = -0.084561;
    else if (0.0349107836 < valueDouble && valueDouble <= 0.0366919045) woeValue = -0.061504;
    else if (0.0366919045 < valueDouble && valueDouble <= 0.0514018692) woeValue = 0.122504;
    else if (0.0514018692 < valueDouble && valueDouble <= 0.0705346985) woeValue = 0.271297;
    else if (0.0705346985 < valueDouble && valueDouble <= 0.0817084494) woeValue = 0.581274;
    else if ( valueDouble > 0.0817084494) woeValue = 1.208868;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = -0.513493;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.464199;
    else if (0 < valueDouble && valueDouble <= 0.0631) woeValue = 1.714273;
    else if ( valueDouble > 0.0631) woeValue = 0.473372;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 37.3389) woeValue = 1.457570;
    else if (37.3389 < valueDouble && valueDouble <= 199.3413) woeValue = 1.163705;
    else if (199.3413 < valueDouble && valueDouble <= 315.136) woeValue = 0.984837;
    else if (315.136 < valueDouble && valueDouble <= 453.9056) woeValue = 0.758570;
    else if (453.9056 < valueDouble && valueDouble <= 612.9994) woeValue = 0.598914;
    else if (612.9994 < valueDouble && valueDouble <= 975.1339) woeValue = 0.421025;
    else if (975.1339 < valueDouble && valueDouble <= 1176.6171) woeValue = 0.321313;
    else if (1176.6171 < valueDouble && valueDouble <= 1866.1916) woeValue = 0.094101;
    else if (1866.1916 < valueDouble && valueDouble <= 3631.1572) woeValue = -0.170143;
    else if (3631.1572 < valueDouble && valueDouble <= 4756.5534) woeValue = -0.322266;
    else if ( valueDouble > 4756.5534) woeValue = -0.350348;
    else woeValue = 0;}else if(acct_h_s_cnt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.266916;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.683570;
    else if (0.0001 < valueDouble && valueDouble <= 0.4327) woeValue = -0.586638;
    else if (0.4327 < valueDouble && valueDouble <= 0.9993) woeValue = -0.486958;
    else if (0.9993 < valueDouble && valueDouble <= 1.7645) woeValue = -0.320112;
    else if ( valueDouble > 1.7645) woeValue = 1.382323;
    else woeValue = 0;}else if(added_phone_lt_30.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.014703;
    else if ( valueDouble > 0) woeValue = 0.664833;
    else woeValue = 0;}else if(cc_pct_debit.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.608677;
    else if (0 < valueDouble && valueDouble <= 0.1785714286) woeValue = -0.425079;
    else if (0.1785714286 < valueDouble && valueDouble <= 0.25) woeValue = -0.250594;
    else if (0.25 < valueDouble && valueDouble <= 0.4210526316) woeValue = -0.165761;
    else if (0.4210526316 < valueDouble && valueDouble <= 0.4782608696) woeValue = -0.090491;
    else if (0.4782608696 < valueDouble && valueDouble <= 0.6666666667) woeValue = 0.043696;
    else if (0.6666666667 < valueDouble && valueDouble <= 0.962962963) woeValue = 0.191608;
    else if ( valueDouble > 0.962962963) woeValue = 0.398254;
    else woeValue = 0;}else if(cc_pct_unknown.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.119276;
    else if (0 < valueDouble && valueDouble <= 0.25) woeValue = 0.146700;
    else if (0.25 < valueDouble && valueDouble <= 0.5) woeValue = 0.497659;
    else if ( valueDouble > 0.5) woeValue = 0.988665;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = -0.484166;
    else if (-1e38 < valueDouble && valueDouble <= 0.48558768) woeValue = -0.289752;
    else if (0.48558768 < valueDouble && valueDouble <= 0.7771380296) woeValue = 0.004014;
    else if (0.7771380296 < valueDouble && valueDouble <= 1.2817329029) woeValue = 0.091616;
    else if (1.2817329029 < valueDouble && valueDouble <= 2.0510183153) woeValue = 0.124575;
    else if (2.0510183153 < valueDouble && valueDouble <= 2.7969648792) woeValue = 0.181293;
    else if (2.7969648792 < valueDouble && valueDouble <= 3.5416666667) woeValue = 0.185188;
    else if (3.5416666667 < valueDouble && valueDouble <= 5.3645943376) woeValue = 0.374001;
    else if ( valueDouble > 5.3645943376) woeValue = 0.920746;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.634740;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.143210;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.746145;
    else if ( valueDouble > 1) woeValue = 1.470553;
    else woeValue = 0;}else if(ebay_V_7d1Yr_ASP_360all.getName().equals(varName)){if (value == null) woeValue = 0.346102;
    else if (-1e38 < valueDouble && valueDouble <= 0.8776) woeValue = -0.764254;
    else if (0.8776 < valueDouble && valueDouble <= 1.7811) woeValue = -0.463898;
    else if (1.7811 < valueDouble && valueDouble <= 2.8621) woeValue = -0.140403;
    else if (2.8621 < valueDouble && valueDouble <= 3.5538) woeValue = -0.104014;
    else if ( valueDouble > 3.5538) woeValue = 0.174874;
    else woeValue = 0;}else if(ebay_dy_snc_sus_min_360all.getName().equals(varName)){if (value == null) woeValue = -0.066409;
    else if (-1e38 < valueDouble && valueDouble <= 51) woeValue = 2.200006;
    else if (51 < valueDouble && valueDouble <= 228) woeValue = 1.908928;
    else if (228 < valueDouble && valueDouble <= 335) woeValue = 1.777477;
    else if (335 < valueDouble && valueDouble <= 667) woeValue = 1.316162;
    else if (667 < valueDouble && valueDouble <= 1054) woeValue = 1.206417;
    else if (1054 < valueDouble && valueDouble <= 1170) woeValue = 1.155852;
    else if (1170 < valueDouble && valueDouble <= 1593) woeValue = 0.892960;
    else if (1593 < valueDouble && valueDouble <= 1712) woeValue = 0.741642;
    else if (1712 < valueDouble && valueDouble <= 2170) woeValue = 0.497947;
    else if (2170 < valueDouble && valueDouble <= 2817) woeValue = 0.448611;
    else if ( valueDouble > 2817) woeValue = 0.002249;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.140408;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 1.795253;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = 0.966380;
    else if (3 < valueDouble && valueDouble <= 49) woeValue = 0.530200;
    else if (49 < valueDouble && valueDouble <= 77) woeValue = 0.494056;
    else if (77 < valueDouble && valueDouble <= 110) woeValue = 0.420157;
    else if (110 < valueDouble && valueDouble <= 257) woeValue = 0.315545;
    else if ( valueDouble > 257) woeValue = 0.151380;
    else woeValue = 0;}else if(email_numofconsonant.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 2) woeValue = -0.185905;
    else if (2 < valueDouble && valueDouble <= 8) woeValue = -0.018954;
    else if (8 < valueDouble && valueDouble <= 10) woeValue = 0.250883;
    else if ( valueDouble > 10) woeValue = 0.380795;
    else woeValue = 0;}else if(ip_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.144781;
    else if (0 < valueDouble && valueDouble <= 0.4422) woeValue = -0.437399;
    else if (0.4422 < valueDouble && valueDouble <= 0.9219) woeValue = -0.416713;
    else if (0.9219 < valueDouble && valueDouble <= 1.1054) woeValue = -0.298263;
    else if (1.1054 < valueDouble && valueDouble <= 2.2253) woeValue = -0.191802;
    else if (2.2253 < valueDouble && valueDouble <= 3.2105) woeValue = 0.118723;
    else if (3.2105 < valueDouble && valueDouble <= 5.3222) woeValue = 0.352992;
    else if ( valueDouble > 5.3222) woeValue = 1.001599;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.059050;
    else if ( valueDouble > 0) woeValue = -0.437334;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = -0.513493;
    else if (-1e38 < valueDouble && valueDouble <= 0.0279) woeValue = -1.251760;
    else if (0.0279 < valueDouble && valueDouble <= 0.0286) woeValue = -1.063009;
    else if (0.0286 < valueDouble && valueDouble <= 0.029) woeValue = -0.978749;
    else if (0.029 < valueDouble && valueDouble <= 0.0295) woeValue = -0.734932;
    else if (0.0295 < valueDouble && valueDouble <= 0.031) woeValue = -0.655062;
    else if (0.031 < valueDouble && valueDouble <= 0.0339) woeValue = -0.552825;
    else if (0.0339 < valueDouble && valueDouble <= 0.0392) woeValue = -0.372641;
    else if (0.0392 < valueDouble && valueDouble <= 0.0406) woeValue = -0.261383;
    else if (0.0406 < valueDouble && valueDouble <= 0.0504) woeValue = -0.149053;
    else if (0.0504 < valueDouble && valueDouble <= 0.0583) woeValue = 0.188581;
    else if (0.0583 < valueDouble && valueDouble <= 0.0606) woeValue = 0.429605;
    else if (0.0606 < valueDouble && valueDouble <= 0.0718) woeValue = 0.486065;
    else if (0.0718 < valueDouble && valueDouble <= 0.08) woeValue = 0.635280;
    else if ( valueDouble > 0.08) woeValue = 0.982903;
    else woeValue = 0;}else if(n_dist_bankid_30d_180d.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.541939;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.664192;
    else if ( valueDouble > 1) woeValue = 0.802120;
    else woeValue = 0;}else if(num_accounts_w_vid.getName().equals(varName)){if (value == null) woeValue = 0.586567;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.298647;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.117328;
    else if ( valueDouble > 1) woeValue = 0.214816;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.788) woeValue = -0.293582;
    else if (0.788 < valueDouble && valueDouble <= 0.91) woeValue = -0.138070;
    else if (0.91 < valueDouble && valueDouble <= 1.0711566092) woeValue = 0.052990;
    else if (1.0711566092 < valueDouble && valueDouble <= 1.3250394253) woeValue = 0.170211;
    else if (1.3250394253 < valueDouble && valueDouble <= 1.7757688214) woeValue = 0.660418;
    else if (1.7757688214 < valueDouble && valueDouble <= 2.9377981301) woeValue = 1.056210;
    else if ( valueDouble > 2.9377981301) woeValue = 3.023144;
    else woeValue = 0;}else if(outstd_iach_amt2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 26150) woeValue = -0.227209;
    else if (26150 < valueDouble && valueDouble <= 29999) woeValue = -0.210249;
    else if (29999 < valueDouble && valueDouble <= 35048) woeValue = -0.039268;
    else if (35048 < valueDouble && valueDouble <= 42165) woeValue = -0.023195;
    else if (42165 < valueDouble && valueDouble <= 52614) woeValue = 0.177672;
    else if (52614 < valueDouble && valueDouble <= 70891) woeValue = 0.592710;
    else if (70891 < valueDouble && valueDouble <= 113639) woeValue = 0.882825;
    else if ( valueDouble > 113639) woeValue = 2.470169;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.633258;
    else if (-1e38 < valueDouble && valueDouble <= 0.0452201448) woeValue = -0.614805;
    else if (0.0452201448 < valueDouble && valueDouble <= 0.0603367633) woeValue = -0.439697;
    else if (0.0603367633 < valueDouble && valueDouble <= 0.0960164835) woeValue = -0.295659;
    else if (0.0960164835 < valueDouble && valueDouble <= 0.3288180236) woeValue = -0.264697;
    else if (0.3288180236 < valueDouble && valueDouble <= 0.4440589766) woeValue = -0.232051;
    else if (0.4440589766 < valueDouble && valueDouble <= 0.7983394539) woeValue = -0.198640;
    else if (0.7983394539 < valueDouble && valueDouble <= 0.9722488038) woeValue = 0.050827;
    else if (0.9722488038 < valueDouble && valueDouble <= 6.5162601626) woeValue = 0.506168;
    else if ( valueDouble > 6.5162601626) woeValue = 0.715960;
    else woeValue = 0;}else if(ratio_login_failed_30_days.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.085229;
    else if (0 < valueDouble && valueDouble <= 0.4259) woeValue = 0.073102;
    else if (0.4259 < valueDouble && valueDouble <= 0.5) woeValue = 0.235065;
    else if ( valueDouble > 0.5) woeValue = 0.626039;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = -0.253468;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.800096;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -1.529809;
    else if (0.002 < valueDouble && valueDouble <= 0.003) woeValue = -1.159796;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -0.898647;
    else if (0.004 < valueDouble && valueDouble <= 0.006) woeValue = -0.823314;
    else if (0.006 < valueDouble && valueDouble <= 0.007) woeValue = -0.652952;
    else if (0.007 < valueDouble && valueDouble <= 0.008) woeValue = -0.447703;
    else if (0.008 < valueDouble && valueDouble <= 0.01) woeValue = -0.313979;
    else if (0.01 < valueDouble && valueDouble <= 0.014) woeValue = 0.175683;
    else if (0.014 < valueDouble && valueDouble <= 0.016) woeValue = 0.352181;
    else if (0.016 < valueDouble && valueDouble <= 0.019) woeValue = 0.500292;
    else if (0.019 < valueDouble && valueDouble <= 0.023) woeValue = 0.678960;
    else if (0.023 < valueDouble && valueDouble <= 0.028) woeValue = 0.886284;
    else if (0.028 < valueDouble && valueDouble <= 0.033) woeValue = 0.899185;
    else if ( valueDouble > 0.033) woeValue = 1.608794;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.102054;
    else if (0 < valueDouble && valueDouble <= 62012) woeValue = 0.369223;
    else if (62012 < valueDouble && valueDouble <= 432840) woeValue = -0.086154;
    else if (432840 < valueDouble && valueDouble <= 529076) woeValue = -0.335483;
    else if (529076 < valueDouble && valueDouble <= 759039) woeValue = -0.359516;
    else if (759039 < valueDouble && valueDouble <= 874105) woeValue = -0.388608;
    else if (874105 < valueDouble && valueDouble <= 1869198) woeValue = -0.582791;
    else if ( valueDouble > 1869198) woeValue = -0.624172;
    else woeValue = 0;}else if(s_mobile_decay_5d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.152781;
    else if (0 < valueDouble && valueDouble <= 0.0000348796) woeValue = 0.533016;
    else if (0.0000348796 < valueDouble && valueDouble <= 0.0002796738) woeValue = 0.234047;
    else if (0.0002796738 < valueDouble && valueDouble <= 0.0015326981) woeValue = 0.203249;
    else if (0.0015326981 < valueDouble && valueDouble <= 0.0061421289) woeValue = 0.111386;
    else if ( valueDouble > 0.0061421289) woeValue = -0.171823;
    else woeValue = 0;}else if(s_mp_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.619375;
    else if (0 < valueDouble && valueDouble <= 24424.4556) woeValue = -0.353182;
    else if (24424.4556 < valueDouble && valueDouble <= 42776.4928) woeValue = -0.005720;
    else if ( valueDouble > 42776.4928) woeValue = 1.738292;
    else woeValue = 0;}else if(s_r_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.163747;
    else if (0 < valueDouble && valueDouble <= 192.9077) woeValue = -0.201066;
    else if (192.9077 < valueDouble && valueDouble <= 475.2792) woeValue = -0.024350;
    else if (475.2792 < valueDouble && valueDouble <= 2188.8723) woeValue = 0.269157;
    else if (2188.8723 < valueDouble && valueDouble <= 6144.0215) woeValue = 0.724927;
    else if ( valueDouble > 6144.0215) woeValue = 2.327582;
    else woeValue = 0;}else if(s_trans_ip3_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 13111177) woeValue = 0.216711;
    else if (13111177 < valueDouble && valueDouble <= 19686284) woeValue = 0.020784;
    else if (19686284 < valueDouble && valueDouble <= 21721882) woeValue = -0.072308;
    else if (21721882 < valueDouble && valueDouble <= 42533766) woeValue = -0.093848;
    else if (42533766 < valueDouble && valueDouble <= 85798065) woeValue = -0.432955;
    else if (85798065 < valueDouble && valueDouble <= 99753408) woeValue = -0.496021;
    else if (99753408 < valueDouble && valueDouble <= 143053250) woeValue = -0.782008;
    else if ( valueDouble > 143053250) woeValue = -0.901641;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.8858695652) woeValue = 2.530409;
    else if (0.8858695652 < valueDouble && valueDouble <= 0.9214285714) woeValue = 1.148791;
    else if (0.9214285714 < valueDouble && valueDouble <= 0.9381188119) woeValue = 1.097327;
    else if (0.9381188119 < valueDouble && valueDouble <= 0.9629483642) woeValue = 0.752720;
    else if (0.9629483642 < valueDouble && valueDouble <= 0.9718151071) woeValue = 0.482624;
    else if (0.9718151071 < valueDouble && valueDouble <= 0.9823151125) woeValue = 0.245680;
    else if (0.9823151125 < valueDouble && valueDouble <= 0.9841269841) woeValue = 0.156820;
    else if (0.9841269841 < valueDouble && valueDouble <= 0.9872860636) woeValue = -0.070503;
    else if (0.9872860636 < valueDouble && valueDouble <= 0.992) woeValue = -0.273712;
    else if (0.992 < valueDouble && valueDouble <= 0.9929549902) woeValue = -0.340734;
    else if (0.9929549902 < valueDouble && valueDouble <= 0.9946808511) woeValue = -0.503602;
    else if (0.9946808511 < valueDouble && valueDouble <= 0.9962546816) woeValue = -0.637199;
    else if ( valueDouble > 0.9962546816) woeValue = -0.606532;
    else woeValue = 0;}else if(s_vid_max_dof.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 297) woeValue = 2.010616;
    else if (297 < valueDouble && valueDouble <= 442) woeValue = 1.074613;
    else if (442 < valueDouble && valueDouble <= 559) woeValue = 0.803704;
    else if (559 < valueDouble && valueDouble <= 673) woeValue = 0.729669;
    else if (673 < valueDouble && valueDouble <= 795) woeValue = 0.620281;
    else if (795 < valueDouble && valueDouble <= 1176) woeValue = 0.487394;
    else if (1176 < valueDouble && valueDouble <= 1428) woeValue = 0.350308;
    else if (1428 < valueDouble && valueDouble <= 1716) woeValue = 0.130032;
    else if (1716 < valueDouble && valueDouble <= 1787) woeValue = 0.071726;
    else if (1787 < valueDouble && valueDouble <= 1986) woeValue = -0.095233;
    else if (1986 < valueDouble && valueDouble <= 2302) woeValue = -0.137108;
    else if (2302 < valueDouble && valueDouble <= 2548) woeValue = -0.250074;
    else if (2548 < valueDouble && valueDouble <= 2603) woeValue = -0.325928;
    else if (2603 < valueDouble && valueDouble <= 2980) woeValue = -0.472308;
    else if (2980 < valueDouble && valueDouble <= 3278) woeValue = -0.573991;
    else if (3278 < valueDouble && valueDouble <= 3697) woeValue = -0.636278;
    else if (3697 < valueDouble && valueDouble <= 3816) woeValue = -0.661179;
    else if (3816 < valueDouble && valueDouble <= 3949) woeValue = -0.810700;
    else if (3949 < valueDouble && valueDouble <= 4336) woeValue = -0.919106;
    else if ( valueDouble > 4336) woeValue = -0.962236;
    else woeValue = 0;}else if(seconds_since_last_return.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.036936;
    else if (-1 < valueDouble && valueDouble <= 10466440) woeValue = 1.620258;
    else if ( valueDouble > 10466440) woeValue = 0.754184;
    else woeValue = 0;}else if(txnsnt_amt_stss_lst_24_hrs.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.137005;
    else if (-1 < valueDouble && valueDouble <= 8) woeValue = 0.264163;
    else if (8 < valueDouble && valueDouble <= 25.12) woeValue = 0.462713;
    else if ( valueDouble > 25.12) woeValue = 2.234735;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.617434;
    else if (-1e38 < valueDouble && valueDouble <= 11.106736111) woeValue = -0.362524;
    else if (11.106736111 < valueDouble && valueDouble <= 14.985729167) woeValue = -0.121675;
    else if (14.985729167 < valueDouble && valueDouble <= 21.003645833) woeValue = 0.029751;
    else if (21.003645833 < valueDouble && valueDouble <= 25.477708333) woeValue = 0.159027;
    else if (25.477708333 < valueDouble && valueDouble <= 31.058460648) woeValue = 0.523754;
    else if (31.058460648 < valueDouble && valueDouble <= 39.845555556) woeValue = 0.668271;
    else if ( valueDouble > 39.845555556) woeValue = 0.777716;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = -0.088956;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.896575;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.880992;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.977830;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 1.077188;
    else if ( valueDouble > 3) woeValue = 1.283168;
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
    
    coeffMap.put("Intercept",+8.06183451);
    coeffMap.put(wach_n_inactive.getName(),-0.94095053);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.40907074);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.45858164);
    coeffMap.put(rt_num_rate.getName(),-0.31786678);
    coeffMap.put(s_vid_max_dof.getName(),-0.68858569);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.25084742);
    coeffMap.put(s_r_amt_dk_40.getName(),-0.19409508);
    coeffMap.put(outstd_iach_amt2.getName(),-0.40879567);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.36216108);
    coeffMap.put(n_dist_bankid_30d_180d.getName(),-1.10210823);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.38759092);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.11074512);
    coeffMap.put(s_mp_amt_dk_80.getName(),-0.19858091);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-0.69133145);
    coeffMap.put(PC_LT30K_Income_CCBIN.getName(),-0.34693388);
    coeffMap.put(txnsnt_amt_stss_lst_24_hrs.getName(),-0.25752366);
    coeffMap.put(acct_h_s_cnt_dk_10.getName(),-0.34925690);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.47194085);
    coeffMap.put(ebay_V_7d1Yr_ASP_360all.getName(),-0.43153087);
    coeffMap.put(ip_cnt_dk_20.getName(),-0.26804759);
    coeffMap.put(MOC_V_MOCLife.getName(),-0.53088288);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.61509216);
    coeffMap.put(cc_pct_debit.getName(),-0.59972885);
    coeffMap.put(num_accounts_w_vid.getName(),-0.60135865);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.30891992);
    coeffMap.put(cc_pct_unknown.getName(),-0.50032441);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.27522205);
    coeffMap.put(s_trans_ip3_tof_t_v2.getName(),-0.41291452);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.59446881);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.46282254);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.73810892);
    coeffMap.put(ebay_dy_snc_sus_min_360all.getName(),-0.39703115);
    coeffMap.put(s_mobile_decay_5d_cnt.getName(),-0.38972093);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.42374089);
    coeffMap.put(seconds_since_last_return.getName(),-0.42377092);
    coeffMap.put(is_credit_union.getName(),-1.01073406);
    coeffMap.put(ratio_login_failed_30_days.getName(),-0.45239003);
    coeffMap.put(added_phone_lt_30.getName(),-0.65318818);
    coeffMap.put(email_numofconsonant.getName(),-0.62898512);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 821.08388979;
  }

  @Override
  public double getCoeff2() {
    return  -54.25013202;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT4;
  }
  
}