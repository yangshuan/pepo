package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg7 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(s_r_amt_dk_80);
    variables.add(is_yodlee_verified);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(prepaid_bank);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(MOA_V_MOALife);
    variables.add(CP4WRtDolBadTxn);
    variables.add(wach_n_authorized);
    variables.add(min_eaby_dof_360all);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(bank_country);
    variables.add(primaryach_denomination);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(s_ratio_avg_dk_320);
    variables.add(s_visitor_id_dof);
    variables.add(s_v_tx_ratio_num);
    variables.add(is_credit_union);
    variables.add(CP20WRtAtoBadTxn);
    variables.add(acct_h_s_amt_dk_160);
    variables.add(v2_ip_bin_ctry_score_worst);
    variables.add(email_MP_sinc_UPI);
    variables.add(n_bdrt_Veri_txn);
    variables.add(rt_YD_add_acc);
    variables.add(num_bank_account_id_90d);
    variables.add(rt_r8r16_hr);
    variables.add(s_ms_cnt_dk_40);
    variables.add(email_MP_V_Pmt_YrMaxASP);
    variables.add(s_v_outstd_ratio_num);
    variables.add(v36_diff_vid_3d);
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

    if(CP20WRtAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.619162;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = -0.500378;
    else if (0.0003 < valueDouble && valueDouble <= 0.0004) woeValue = -0.039814;
    else if (0.0004 < valueDouble && valueDouble <= 0.0009) woeValue = 0.083920;
    else if (0.0009 < valueDouble && valueDouble <= 0.0011) woeValue = 0.133408;
    else if (0.0011 < valueDouble && valueDouble <= 0.0014) woeValue = 0.269233;
    else if (0.0014 < valueDouble && valueDouble <= 0.0018) woeValue = 0.291893;
    else if (0.0018 < valueDouble && valueDouble <= 0.0033) woeValue = 0.616846;
    else if ( valueDouble > 0.0033) woeValue = 1.348367;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.515987;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = -0.844911;
    else if (0.0003 < valueDouble && valueDouble <= 0.0038) woeValue = -0.482754;
    else if (0.0038 < valueDouble && valueDouble <= 0.0041) woeValue = -0.373940;
    else if (0.0041 < valueDouble && valueDouble <= 0.0071) woeValue = -0.150927;
    else if (0.0071 < valueDouble && valueDouble <= 0.0083) woeValue = 0.425564;
    else if (0.0083 < valueDouble && valueDouble <= 0.0235) woeValue = 0.850251;
    else if ( valueDouble > 0.0235) woeValue = 1.064648;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.064312;
    else if ( valueDouble > 0) woeValue = 1.567666;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 1.670709;
    else if (-1e38 < valueDouble && valueDouble <= 0.2093325669) woeValue = -0.262988;
    else if (0.2093325669 < valueDouble && valueDouble <= 0.367649638) woeValue = -0.208690;
    else if (0.367649638 < valueDouble && valueDouble <= 0.4270150721) woeValue = -0.131709;
    else if (0.4270150721 < valueDouble && valueDouble <= 0.9868588385) woeValue = 0.181241;
    else if (0.9868588385 < valueDouble && valueDouble <= 1.4550561798) woeValue = 0.525856;
    else if (1.4550561798 < valueDouble && valueDouble <= 2.1281860926) woeValue = 0.779257;
    else if ( valueDouble > 2.1281860926) woeValue = 1.025900;
    else woeValue = 0;}else if(acct_h_s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 2.400613;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.325635;
    else if (0 < valueDouble && valueDouble <= 0.0004) woeValue = 0.262049;
    else if (0.0004 < valueDouble && valueDouble <= 361.5371) woeValue = 0.115967;
    else if (361.5371 < valueDouble && valueDouble <= 433.7301) woeValue = 0.113696;
    else if (433.7301 < valueDouble && valueDouble <= 823.0272) woeValue = -0.096109;
    else if ( valueDouble > 823.0272) woeValue = -0.250967;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.378174;
    else if (0 < valueDouble && valueDouble <= 1514) woeValue = 0.417423;
    else if (1514 < valueDouble && valueDouble <= 2944) woeValue = -0.096833;
    else if (2944 < valueDouble && valueDouble <= 4103) woeValue = -0.438941;
    else if (4103 < valueDouble && valueDouble <= 13790) woeValue = -0.524718;
    else if (13790 < valueDouble && valueDouble <= 35385) woeValue = -0.670129;
    else if ( valueDouble > 35385) woeValue = -0.908119;
    else woeValue = 0;}else if(bank_country.getName().equals(varName)){if (Arrays.asList( "AU").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "GB").contains(value)) woeValue = -1.417049;
    else if (Arrays.asList( "DE","CA").contains(value)) woeValue = -0.658837;
    else if (Arrays.asList( "US").contains(value)) woeValue = 0.038365;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 1.053429;
    else if (Arrays.asList( "NL").contains(value)) woeValue = 1.397957;
    else if (Arrays.asList( "ES").contains(value)) woeValue = 2.657017;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.195027;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 0.770951;
    else if (1 < valueDouble && valueDouble <= 317) woeValue = 0.743996;
    else if (317 < valueDouble && valueDouble <= 416) woeValue = 0.457443;
    else if ( valueDouble > 416) woeValue = 0.197369;
    else woeValue = 0;}else if(email_MP_V_Pmt_YrMaxASP.getName().equals(varName)){if (value == null) woeValue = 0.338789;
    else if (-1e38 < valueDouble && valueDouble <= 38.769384692) woeValue = -0.393691;
    else if (38.769384692 < valueDouble && valueDouble <= 46.604801464) woeValue = -0.287964;
    else if (46.604801464 < valueDouble && valueDouble <= 100.44574908) woeValue = -0.123105;
    else if (100.44574908 < valueDouble && valueDouble <= 390.98901099) woeValue = -0.053680;
    else if ( valueDouble > 390.98901099) woeValue = 0.634570;
    else woeValue = 0;}else if(email_MP_sinc_UPI.getName().equals(varName)){if (value == null) woeValue = -0.127942;
    else if (-1e38 < valueDouble && valueDouble <= 259) woeValue = 0.498233;
    else if ( valueDouble > 259) woeValue = 1.489045;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.126049;
    else if ( valueDouble > 0) woeValue = -0.939610;
    else woeValue = 0;}else if(is_yodlee_verified.getName().equals(varName)){if (value == null) woeValue = -1.412181;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.055262;
    else if ( valueDouble > 0) woeValue = 0.590583;
    else woeValue = 0;}else if(min_eaby_dof_360all.getName().equals(varName)){if (value == null) woeValue = 0.505974;
    else if (-1e38 < valueDouble && valueDouble <= 106) woeValue = 0.502472;
    else if (106 < valueDouble && valueDouble <= 595) woeValue = 0.485234;
    else if (595 < valueDouble && valueDouble <= 1022) woeValue = 0.276335;
    else if (1022 < valueDouble && valueDouble <= 1875) woeValue = 0.044700;
    else if (1875 < valueDouble && valueDouble <= 1952) woeValue = -0.011965;
    else if (1952 < valueDouble && valueDouble <= 2351) woeValue = -0.358156;
    else if (2351 < valueDouble && valueDouble <= 2612) woeValue = -0.522765;
    else if (2612 < valueDouble && valueDouble <= 2781) woeValue = -0.564696;
    else if (2781 < valueDouble && valueDouble <= 3068) woeValue = -0.693788;
    else if ( valueDouble > 3068) woeValue = -1.049326;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.760016;
    else if (0 < valueDouble && valueDouble <= 0.00006) woeValue = -1.621042;
    else if (0.00006 < valueDouble && valueDouble <= 0.00026) woeValue = -1.144921;
    else if (0.00026 < valueDouble && valueDouble <= 0.00051) woeValue = -0.942532;
    else if (0.00051 < valueDouble && valueDouble <= 0.00082) woeValue = -0.297602;
    else if (0.00082 < valueDouble && valueDouble <= 0.00234) woeValue = 0.259894;
    else if (0.00234 < valueDouble && valueDouble <= 0.00318) woeValue = 0.468569;
    else if (0.00318 < valueDouble && valueDouble <= 0.00773) woeValue = 0.776475;
    else if ( valueDouble > 0.00773) woeValue = 2.107032;
    else woeValue = 0;}else if(num_bank_account_id_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.381422;
    else if ( valueDouble > 1) woeValue = 0.928577;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = -0.995827;
    else if (4 < valueDouble && valueDouble <= 7) woeValue = -0.366031;
    else if (7 < valueDouble && valueDouble <= 11) woeValue = 0.194866;
    else if (11 < valueDouble && valueDouble <= 13) woeValue = 1.082502;
    else if (13 < valueDouble && valueDouble <= 15) woeValue = 2.338878;
    else if ( valueDouble > 15) woeValue = 2.528097;
    else woeValue = 0;}else if(prepaid_bank.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.061023;
    else if ( valueDouble > 0) woeValue = 1.958762;
    else woeValue = 0;}else if(primaryach_denomination.getName().equals(varName)){if (Arrays.asList( "HKD").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ILS").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MXN").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "SGD","AUD").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "GBP").contains(value)) woeValue = -1.443177;
    else if (Arrays.asList( "CAD").contains(value)) woeValue = -0.562078;
    else if (Arrays.asList( "USD").contains(value)) woeValue = 0.041087;
    else if (Arrays.asList(" ").contains(value)) woeValue = 0.166859;
    else if (Arrays.asList( "EUR").contains(value)) woeValue = 0.372053;
    else woeValue = 0;}else if(rt_YD_add_acc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.071608;
    else if (0 < valueDouble && valueDouble <= 0.16376) woeValue = -0.400410;
    else if (0.16376 < valueDouble && valueDouble <= 0.47033) woeValue = -0.261662;
    else if (0.47033 < valueDouble && valueDouble <= 0.55157) woeValue = -0.076074;
    else if (0.55157 < valueDouble && valueDouble <= 0.59033) woeValue = 0.211027;
    else if ( valueDouble > 0.59033) woeValue = 0.917763;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.040228;
    else if (0 < valueDouble && valueDouble <= 0.019) woeValue = 0.376038;
    else if (0.019 < valueDouble && valueDouble <= 0.28) woeValue = 0.155349;
    else if (0.28 < valueDouble && valueDouble <= 0.348) woeValue = -0.272073;
    else if ( valueDouble > 0.348) woeValue = -0.752840;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.568866;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.336576;
    else if (0 < valueDouble && valueDouble <= 0.0117) woeValue = -0.436055;
    else if (0.0117 < valueDouble && valueDouble <= 0.049) woeValue = -0.330420;
    else if (0.049 < valueDouble && valueDouble <= 0.642) woeValue = 0.048338;
    else if (0.642 < valueDouble && valueDouble <= 0.9804) woeValue = 0.440127;
    else if (0.9804 < valueDouble && valueDouble <= 1.0444) woeValue = 0.751304;
    else if (1.0444 < valueDouble && valueDouble <= 1.4829) woeValue = 0.994964;
    else if (1.4829 < valueDouble && valueDouble <= 2.4473) woeValue = 1.002097;
    else if ( valueDouble > 2.4473) woeValue = 2.368110;
    else woeValue = 0;}else if(s_r_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.453586;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.012668;
    else if (0 < valueDouble && valueDouble <= 0.0367) woeValue = -0.117572;
    else if (0.0367 < valueDouble && valueDouble <= 0.0905) woeValue = -0.054982;
    else if (0.0905 < valueDouble && valueDouble <= 37.0601) woeValue = 0.462018;
    else if (37.0601 < valueDouble && valueDouble <= 2633.2717) woeValue = 0.715129;
    else if (2633.2717 < valueDouble && valueDouble <= 6408.9725) woeValue = 1.182589;
    else if ( valueDouble > 6408.9725) woeValue = 1.871656;
    else woeValue = 0;}else if(s_ratio_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = 0.000000;
    else if (-2 < valueDouble && valueDouble <= 0.1298) woeValue = -0.684103;
    else if (0.1298 < valueDouble && valueDouble <= 0.2329) woeValue = -0.588886;
    else if (0.2329 < valueDouble && valueDouble <= 0.3717) woeValue = -0.455992;
    else if (0.3717 < valueDouble && valueDouble <= 0.532) woeValue = -0.165980;
    else if (0.532 < valueDouble && valueDouble <= 0.5677) woeValue = -0.058499;
    else if (0.5677 < valueDouble && valueDouble <= 0.6851) woeValue = 0.118058;
    else if (0.6851 < valueDouble && valueDouble <= 4.852) woeValue = 0.177925;
    else if (4.852 < valueDouble && valueDouble <= 10.7789) woeValue = 0.258709;
    else if ( valueDouble > 10.7789) woeValue = 0.543698;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.301702;
    else if (0 < valueDouble && valueDouble <= 0.0189364495) woeValue = -0.203020;
    else if (0.0189364495 < valueDouble && valueDouble <= 0.2473645805) woeValue = 0.206880;
    else if (0.2473645805 < valueDouble && valueDouble <= 0.8096818256) woeValue = 0.324371;
    else if (0.8096818256 < valueDouble && valueDouble <= 0.9462419322) woeValue = 0.956722;
    else if ( valueDouble > 0.9462419322) woeValue = 0.993060;
    else woeValue = 0;}else if(s_v_outstd_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.119047619) woeValue = -0.223442;
    else if (0.119047619 < valueDouble && valueDouble <= 0.1785714286) woeValue = -0.048141;
    else if (0.1785714286 < valueDouble && valueDouble <= 0.2222222222) woeValue = 0.174241;
    else if (0.2222222222 < valueDouble && valueDouble <= 0.375) woeValue = 0.512232;
    else if (0.375 < valueDouble && valueDouble <= 0.5) woeValue = 0.973308;
    else if ( valueDouble > 0.5) woeValue = 1.474586;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.7855227882) woeValue = 1.589681;
    else if (0.7855227882 < valueDouble && valueDouble <= 0.8678955453) woeValue = 1.133874;
    else if (0.8678955453 < valueDouble && valueDouble <= 0.8887262079) woeValue = 0.595043;
    else if (0.8887262079 < valueDouble && valueDouble <= 0.9495268139) woeValue = 0.494569;
    else if (0.9495268139 < valueDouble && valueDouble <= 0.9729344729) woeValue = 0.407455;
    else if (0.9729344729 < valueDouble && valueDouble <= 0.9761658031) woeValue = -0.008791;
    else if (0.9761658031 < valueDouble && valueDouble <= 0.9875717017) woeValue = -0.369958;
    else if ( valueDouble > 0.9875717017) woeValue = -0.464805;
    else woeValue = 0;}else if(s_visitor_id_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.816404;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.160644;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 0.142511;
    else if (3 < valueDouble && valueDouble <= 11) woeValue = 0.041004;
    else if (11 < valueDouble && valueDouble <= 37) woeValue = -0.200535;
    else if (37 < valueDouble && valueDouble <= 256) woeValue = -0.562169;
    else if (256 < valueDouble && valueDouble <= 296) woeValue = -0.669291;
    else if (296 < valueDouble && valueDouble <= 707) woeValue = -0.773111;
    else if ( valueDouble > 707) woeValue = -1.098945;
    else woeValue = 0;}else if(v2_ip_bin_ctry_score_worst.getName().equals(varName)){if (Arrays.asList( "NO_IPS","_MISSING_","EXCELLENT").contains(value)) woeValue = -3.997904;
    else if (Arrays.asList( "NO_CCS").contains(value)) woeValue = -0.378225;
    else if (Arrays.asList( "MM_ERROR","BAD").contains(value)) woeValue = -0.003628;
    else if (Arrays.asList( "GOOD"," ").contains(value)) woeValue = 0.131969;
    else if (Arrays.asList( "MED").contains(value)) woeValue = 0.249502;
    else if (Arrays.asList( "NO_DATA","EVIL").contains(value)) woeValue = 0.980075;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.305285;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.508430;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.536832;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.444575;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.139945;
    else if (3 < valueDouble && valueDouble <= 6) woeValue = 0.173128;
    else if (6 < valueDouble && valueDouble <= 13) woeValue = 0.501837;
    else if ( valueDouble > 13) woeValue = 1.045363;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.190711;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.414331;
    else if ( valueDouble > 1) woeValue = 0.364837;
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
    
    coeffMap.put("Intercept",+7.86379197);
    coeffMap.put(p90_dys_return.getName(),-0.6034596);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.24333791);
    coeffMap.put(CP20WRtAtoBadTxn.getName(),-0.37988452);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.41972442);
    coeffMap.put(s_r_amt_dk_80.getName(),-0.27414882);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.27594846);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.28636912);
    coeffMap.put(wach_n_authorized.getName(),-1.16367871);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.41580103);
    coeffMap.put(s_visitor_id_dof.getName(),-0.26200888);
    coeffMap.put(min_eaby_dof_360all.getName(),-0.65179254);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.72852993);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-0.92725007);
    coeffMap.put(s_v_outstd_ratio_num.getName(),-0.35520262);
    coeffMap.put(rt_r8r16_hr.getName(),-0.81015443);
    coeffMap.put(MOA_V_MOALife.getName(),-0.77545778);
    coeffMap.put(is_yodlee_verified.getName(),-0.37805475);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.51560032);
    coeffMap.put(num_bank_account_id_90d.getName(),-0.92451672);
    coeffMap.put(email_MP_sinc_UPI.getName(),-0.68615049);
    coeffMap.put(email_MP_V_Pmt_YrMaxASP.getName(),-0.52242247);
    coeffMap.put(is_credit_union.getName(),-0.4256367);
    coeffMap.put(prepaid_bank.getName(),-0.53545606);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.51627391);
    coeffMap.put(s_ratio_avg_dk_320.getName(),-0.80192744);
    coeffMap.put(rt_YD_add_acc.getName(),-0.41553845);
    coeffMap.put(acct_h_s_amt_dk_160.getName(),-0.48917798);
    coeffMap.put(bank_country.getName(),-0.17893986);
    coeffMap.put(v2_ip_bin_ctry_score_worst.getName(),-0.41172061);
    coeffMap.put(primaryach_denomination.getName(),-0.63065117);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 813.83300693;
  }

  @Override
  public double getCoeff2() {
    return  -51.44146491;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT7;
  }
  
}