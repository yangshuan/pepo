package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg7 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(ip_ratio_4w_appr_dol);
    variables.add(email_numofletter);
    variables.add(added_address_lt_14);
    variables.add(ach_dof_age);
    variables.add(ncc_failed_ratio);
    variables.add(MOA_V_MOALife);
    variables.add(cc_num_credit);
    variables.add(email_MP_since_bought);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(CP4WRtAtoBadAcc);
    variables.add(days_snc_1st_clrd_ach);
    variables.add(ip_amt_dk_20);
    variables.add(acct_h_v_cnt_dk_40);
    variables.add(s_outstd_iach_amt);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(acct_h_s_amt_dk_320);
    variables.add(num_logins_failed_14_days);
    variables.add(email_numofnumeric);
    variables.add(cp_ratio_20w_ato_dol);
    variables.add(life_time_failure_cnt);
    variables.add(v36_d_sn_prev_login);
    variables.add(ebay_5d_txn_dk_360all);
    variables.add(r_ratio_avg_dk_160);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(IP4WRtDolBadTxn);
    variables.add(num_logins_7_days);
    variables.add(s_rtrn_decay_30d_cnt);


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

    if(CP4WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0001) woeValue = -0.264873;
    else if (0.0001 < valueDouble && valueDouble <= 0.0005) woeValue = 0.095745;
    else if (0.0005 < valueDouble && valueDouble <= 0.0009) woeValue = 0.141281;
    else if (0.0009 < valueDouble && valueDouble <= 0.0038) woeValue = 0.306315;
    else if (0.0038 < valueDouble && valueDouble <= 0.0053) woeValue = 1.085497;
    else if ( valueDouble > 0.0053) woeValue = 1.333119;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0058) woeValue = -0.038112;
    else if (0.0058 < valueDouble && valueDouble <= 0.5967) woeValue = 0.137997;
    else if ( valueDouble > 0.5967) woeValue = 0.689472;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.047064;
    else if ( valueDouble > 0) woeValue = 2.154674;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.821891;
    else if (-1e38 < valueDouble && valueDouble <= 0.1054489301) woeValue = -0.723406;
    else if (0.1054489301 < valueDouble && valueDouble <= 0.1713146064) woeValue = -0.590985;
    else if (0.1713146064 < valueDouble && valueDouble <= 0.2141503207) woeValue = -0.348584;
    else if (0.2141503207 < valueDouble && valueDouble <= 0.2654299703) woeValue = -0.255733;
    else if (0.2654299703 < valueDouble && valueDouble <= 0.4434503247) woeValue = -0.155376;
    else if (0.4434503247 < valueDouble && valueDouble <= 0.6825513755) woeValue = -0.046649;
    else if (0.6825513755 < valueDouble && valueDouble <= 0.8272560723) woeValue = 0.147896;
    else if (0.8272560723 < valueDouble && valueDouble <= 1.0019367334) woeValue = 0.689785;
    else if (1.0019367334 < valueDouble && valueDouble <= 1.068309993) woeValue = 0.880729;
    else if (1.068309993 < valueDouble && valueDouble <= 1.3156296517) woeValue = 0.923817;
    else if (1.3156296517 < valueDouble && valueDouble <= 1.5516910683) woeValue = 1.004657;
    else if (1.5516910683 < valueDouble && valueDouble <= 3.1404255319) woeValue = 1.055024;
    else if ( valueDouble > 3.1404255319) woeValue = 1.420189;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.018) woeValue = -0.456689;
    else if (0.018 < valueDouble && valueDouble <= 0.0652) woeValue = 0.165018;
    else if (0.0652 < valueDouble && valueDouble <= 0.2647) woeValue = 0.215602;
    else if (0.2647 < valueDouble && valueDouble <= 0.7149) woeValue = 0.390135;
    else if ( valueDouble > 0.7149) woeValue = 1.595415;
    else woeValue = 0;}else if(acct_h_s_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.917045;
    else if (0 < valueDouble && valueDouble <= 0.0114) woeValue = 0.602501;
    else if (0.0114 < valueDouble && valueDouble <= 2.4628) woeValue = 0.285515;
    else if (2.4628 < valueDouble && valueDouble <= 40.5876) woeValue = 0.172655;
    else if (40.5876 < valueDouble && valueDouble <= 358.9959) woeValue = 0.150971;
    else if (358.9959 < valueDouble && valueDouble <= 2033.4183) woeValue = -0.199600;
    else if (2033.4183 < valueDouble && valueDouble <= 2996.1536) woeValue = -0.463353;
    else if ( valueDouble > 2996.1536) woeValue = -0.786276;
    else woeValue = 0;}else if(acct_h_v_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.014241;
    else if (0 < valueDouble && valueDouble <= 0.0085) woeValue = -0.274692;
    else if (0.0085 < valueDouble && valueDouble <= 0.1474) woeValue = 0.062850;
    else if ( valueDouble > 0.1474) woeValue = 1.177323;
    else woeValue = 0;}else if(ach_dof_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 1.815126;
    else if (-1 < valueDouble && valueDouble <= 0.4029975021) woeValue = 0.455521;
    else if (0.4029975021 < valueDouble && valueDouble <= 0.9982718894) woeValue = 0.264643;
    else if ( valueDouble > 0.9982718894) woeValue = -0.206691;
    else woeValue = 0;}else if(added_address_lt_14.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.055965;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.049319;
    else if ( valueDouble > 1) woeValue = 0.713135;
    else woeValue = 0;}else if(cc_num_credit.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.011307;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.199564;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = 0.185860;
    else if ( valueDouble > 4) woeValue = 0.472128;
    else woeValue = 0;}else if(cp_ratio_20w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.302559;
    else if (-1e38 < valueDouble && valueDouble <= 0.0549872283) woeValue = -0.672933;
    else if (0.0549872283 < valueDouble && valueDouble <= 0.0712282923) woeValue = -0.515152;
    else if (0.0712282923 < valueDouble && valueDouble <= 0.0882552531) woeValue = -0.440867;
    else if (0.0882552531 < valueDouble && valueDouble <= 0.101106621) woeValue = -0.418262;
    else if (0.101106621 < valueDouble && valueDouble <= 0.188269697) woeValue = -0.165510;
    else if (0.188269697 < valueDouble && valueDouble <= 0.4117647059) woeValue = 0.012956;
    else if (0.4117647059 < valueDouble && valueDouble <= 0.8243261007) woeValue = 0.314295;
    else if (0.8243261007 < valueDouble && valueDouble <= 2.1781508593) woeValue = 0.523845;
    else if (2.1781508593 < valueDouble && valueDouble <= 4.3946809037) woeValue = 0.630942;
    else if ( valueDouble > 4.3946809037) woeValue = 0.657563;
    else woeValue = 0;}else if(days_snc_1st_clrd_ach.getName().equals(varName)){if (value == null) woeValue = 1.853009;
    else if (-1e38 < valueDouble && valueDouble <= 94) woeValue = 0.692271;
    else if (94 < valueDouble && valueDouble <= 231) woeValue = 0.345199;
    else if (231 < valueDouble && valueDouble <= 617) woeValue = -0.059516;
    else if (617 < valueDouble && valueDouble <= 793) woeValue = -0.202682;
    else if (793 < valueDouble && valueDouble <= 964) woeValue = -0.345447;
    else if (964 < valueDouble && valueDouble <= 1215) woeValue = -0.604536;
    else if ( valueDouble > 1215) woeValue = -0.957882;
    else woeValue = 0;}else if(ebay_5d_txn_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.628515;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.434215;
    else if (0 < valueDouble && valueDouble <= 0.0000111955) woeValue = 0.480696;
    else if (0.0000111955 < valueDouble && valueDouble <= 0.0119870079) woeValue = -0.165026;
    else if (0.0119870079 < valueDouble && valueDouble <= 1.015305002) woeValue = -0.355899;
    else if (1.015305002 < valueDouble && valueDouble <= 3.0028203567) woeValue = -0.760404;
    else if ( valueDouble > 3.0028203567) woeValue = -0.961329;
    else woeValue = 0;}else if(email_MP_since_bought.getName().equals(varName)){if (value == null) woeValue = 0.278641;
    else if (-1e38 < valueDouble && valueDouble <= 52) woeValue = 1.566603;
    else if (52 < valueDouble && valueDouble <= 490) woeValue = 0.384176;
    else if (490 < valueDouble && valueDouble <= 555) woeValue = 0.377301;
    else if (555 < valueDouble && valueDouble <= 2288) woeValue = -0.139532;
    else if (2288 < valueDouble && valueDouble <= 2952) woeValue = -0.721045;
    else if (2952 < valueDouble && valueDouble <= 3227) woeValue = -0.878852;
    else if (3227 < valueDouble && valueDouble <= 3770) woeValue = -1.042505;
    else if ( valueDouble > 3770) woeValue = -1.899381;
    else woeValue = 0;}else if(email_numofletter.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5) woeValue = -0.145445;
    else if (5 < valueDouble && valueDouble <= 16) woeValue = 0.008271;
    else if ( valueDouble > 16) woeValue = 0.439151;
    else woeValue = 0;}else if(email_numofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.068160;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 0.043407;
    else if ( valueDouble > 3) woeValue = 0.367460;
    else woeValue = 0;}else if(ip_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.079970;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.398624;
    else if (0.0001 < valueDouble && valueDouble <= 0.1948) woeValue = -0.325254;
    else if (0.1948 < valueDouble && valueDouble <= 849.0654) woeValue = -0.166836;
    else if (849.0654 < valueDouble && valueDouble <= 4597.713) woeValue = 0.043173;
    else if (4597.713 < valueDouble && valueDouble <= 5809.7536) woeValue = 0.061100;
    else if (5809.7536 < valueDouble && valueDouble <= 9793.0454) woeValue = 0.183748;
    else if (9793.0454 < valueDouble && valueDouble <= 73097.2056) woeValue = 0.435940;
    else if ( valueDouble > 73097.2056) woeValue = 0.770014;
    else woeValue = 0;}else if(ip_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 1.673657;
    else if (-1e38 < valueDouble && valueDouble <= 0.1628429815) woeValue = -0.384201;
    else if (0.1628429815 < valueDouble && valueDouble <= 0.3051482059) woeValue = -0.220847;
    else if (0.3051482059 < valueDouble && valueDouble <= 0.8353603063) woeValue = -0.112532;
    else if (0.8353603063 < valueDouble && valueDouble <= 2.8117096611) woeValue = 0.102057;
    else if (2.8117096611 < valueDouble && valueDouble <= 4.2603815937) woeValue = 0.370689;
    else if (4.2603815937 < valueDouble && valueDouble <= 9.7676190476) woeValue = 0.444186;
    else if ( valueDouble > 9.7676190476) woeValue = 0.968159;
    else woeValue = 0;}else if(life_time_failure_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0004574565) woeValue = -1.398948;
    else if (0.0004574565 < valueDouble && valueDouble <= 0.0006024096) woeValue = -0.604451;
    else if (0.0006024096 < valueDouble && valueDouble <= 0.0013169447) woeValue = -0.516043;
    else if (0.0013169447 < valueDouble && valueDouble <= 0.0031695721) woeValue = -0.411439;
    else if (0.0031695721 < valueDouble && valueDouble <= 0.0050697085) woeValue = -0.273670;
    else if (0.0050697085 < valueDouble && valueDouble <= 0.0079681275) woeValue = -0.185347;
    else if (0.0079681275 < valueDouble && valueDouble <= 0.02) woeValue = 0.043541;
    else if (0.02 < valueDouble && valueDouble <= 0.03125) woeValue = 0.210566;
    else if (0.03125 < valueDouble && valueDouble <= 0.0612244898) woeValue = 1.073758;
    else if ( valueDouble > 0.0612244898) woeValue = 1.157187;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = -0.150872;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.268570;
    else if (0 < valueDouble && valueDouble <= 0.0949367089) woeValue = -0.331131;
    else if (0.0949367089 < valueDouble && valueDouble <= 0.1338912134) woeValue = -0.158015;
    else if (0.1338912134 < valueDouble && valueDouble <= 0.1470588235) woeValue = 0.130757;
    else if (0.1470588235 < valueDouble && valueDouble <= 0.3) woeValue = 0.188072;
    else if (0.3 < valueDouble && valueDouble <= 0.3580246914) woeValue = 0.372860;
    else if (0.3580246914 < valueDouble && valueDouble <= 0.3823529412) woeValue = 0.560324;
    else if (0.3823529412 < valueDouble && valueDouble <= 0.5704387991) woeValue = 0.669249;
    else if ( valueDouble > 0.5704387991) woeValue = 0.970693;
    else woeValue = 0;}else if(num_logins_7_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.838367;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = -0.304254;
    else if (4 < valueDouble && valueDouble <= 7) woeValue = -0.179574;
    else if (7 < valueDouble && valueDouble <= 11) woeValue = 0.010181;
    else if (11 < valueDouble && valueDouble <= 14) woeValue = 0.025807;
    else if (14 < valueDouble && valueDouble <= 16) woeValue = 0.127721;
    else if (16 < valueDouble && valueDouble <= 44) woeValue = 0.662937;
    else if ( valueDouble > 44) woeValue = 1.123504;
    else woeValue = 0;}else if(num_logins_failed_14_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.172241;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.089032;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.242859;
    else if (2 < valueDouble && valueDouble <= 5) woeValue = 0.653596;
    else if ( valueDouble > 5) woeValue = 1.171417;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.410432;
    else if (-1e38 < valueDouble && valueDouble <= 0.0475890325) woeValue = -0.714119;
    else if (0.0475890325 < valueDouble && valueDouble <= 0.375) woeValue = -0.560543;
    else if (0.375 < valueDouble && valueDouble <= 0.8327421555) woeValue = -0.095263;
    else if (0.8327421555 < valueDouble && valueDouble <= 0.9047619048) woeValue = 0.127341;
    else if (0.9047619048 < valueDouble && valueDouble <= 0.9721325586) woeValue = 0.406352;
    else if (0.9721325586 < valueDouble && valueDouble <= 3.0174605865) woeValue = 0.452121;
    else if ( valueDouble > 3.0174605865) woeValue = 0.573557;
    else woeValue = 0;}else if(r_ratio_avg_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0.6079) woeValue = -0.363496;
    else if (0.6079 < valueDouble && valueDouble <= 0.9566) woeValue = -0.160532;
    else if (0.9566 < valueDouble && valueDouble <= 1.9282) woeValue = 0.030070;
    else if (1.9282 < valueDouble && valueDouble <= 3.1089) woeValue = 0.396468;
    else if (3.1089 < valueDouble && valueDouble <= 4.3475) woeValue = 0.593013;
    else if ( valueDouble > 4.3475) woeValue = 0.833192;
    else woeValue = 0;}else if(s_outstd_iach_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 877) woeValue = -0.214592;
    else if (877 < valueDouble && valueDouble <= 10527) woeValue = -0.195162;
    else if (10527 < valueDouble && valueDouble <= 13703) woeValue = -0.003861;
    else if (13703 < valueDouble && valueDouble <= 24093) woeValue = 0.186074;
    else if (24093 < valueDouble && valueDouble <= 27931) woeValue = 0.530657;
    else if (27931 < valueDouble && valueDouble <= 51252) woeValue = 0.646131;
    else if (51252 < valueDouble && valueDouble <= 83448) woeValue = 1.101217;
    else if ( valueDouble > 83448) woeValue = 1.606376;
    else woeValue = 0;}else if(s_rtrn_decay_30d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.977284;
    else if (0 < valueDouble && valueDouble <= 1.0606378383) woeValue = -0.171752;
    else if (1.0606378383 < valueDouble && valueDouble <= 1.638907522) woeValue = -0.030780;
    else if (1.638907522 < valueDouble && valueDouble <= 3.7625345602) woeValue = 0.241308;
    else if ( valueDouble > 3.7625345602) woeValue = 1.268195;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.275770;
    else if (-1e38 < valueDouble && valueDouble <= 25.999479167) woeValue = -0.136031;
    else if (25.999479167 < valueDouble && valueDouble <= 54.279189815) woeValue = 0.086444;
    else if (54.279189815 < valueDouble && valueDouble <= 122.03488426) woeValue = 0.429948;
    else if ( valueDouble > 122.03488426) woeValue = 0.769913;
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
    
    coeffMap.put("Intercept",+3.36838907);
    coeffMap.put(days_snc_1st_clrd_ach.getName(),-0.40656204);
    coeffMap.put(life_time_failure_cnt.getName(),-1.03361117);
    coeffMap.put(acct_h_s_amt_dk_320.getName(),-1.03498358);
    coeffMap.put(ip_ratio_4w_appr_dol.getName(),-0.30117326);
    coeffMap.put(CP4WRtAtoBadAcc.getName(),-0.55350864);
    coeffMap.put(ach_dof_age.getName(),-0.90363479);
    coeffMap.put(MOA_V_MOALife.getName(),-0.31108877);
    coeffMap.put(ebay_5d_txn_dk_360all.getName(),-0.42806797);
    coeffMap.put(ncc_failed_ratio.getName(),-0.56347626);
    coeffMap.put(num_logins_7_days.getName(),-0.28409632);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.42498864);
    coeffMap.put(email_numofnumeric.getName(),-1.29935482);
    coeffMap.put(ip_amt_dk_20.getName(),-0.27594758);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.50913273);
    coeffMap.put(acct_h_v_cnt_dk_40.getName(),-0.44774067);
    coeffMap.put(email_numofletter.getName(),-1.20257610);
    coeffMap.put(cc_num_credit.getName(),-1.20988738);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.71255424);
    coeffMap.put(s_outstd_iach_amt.getName(),-0.65612741);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.29463361);
    coeffMap.put(s_rtrn_decay_30d_cnt.getName(),-0.52500474);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.51341201);
    coeffMap.put(num_logins_failed_14_days.getName(),-0.43712943);
    coeffMap.put(cp_ratio_20w_ato_dol.getName(),-0.32245005);
    coeffMap.put(email_MP_since_bought.getName(),-0.38015849);
    coeffMap.put(added_address_lt_14.getName(),-0.66543179);
    coeffMap.put(r_ratio_avg_dk_160.getName(),-0.25421553);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 842.43029526;
  }

  @Override
  public double getCoeff2() {
    return  -56.43019085;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT7;
  }
  
}