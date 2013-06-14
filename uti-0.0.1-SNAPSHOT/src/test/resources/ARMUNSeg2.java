package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg2 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(yodlee_iav_bal);
    variables.add(v36_login_exces_1h);
    variables.add(CP4WRtDolBadTxn);
    variables.add(is_tail);
    variables.add(fullname_lowcase);
    variables.add(n_rt_dcl_14dys);
    variables.add(ach_outstd_age);
    variables.add(max_cross20wRtDclAcc);
    variables.add(c_dof);
    variables.add(ip_avg_dk_10);
    variables.add(s_mp_amt_dk_80);
    variables.add(Decline_rate_ccbin);
    variables.add(IP4WRtDolBadTxn);
    variables.add(primaryach_checking);
    variables.add(c_cc_num_ss);
    variables.add(ipr_ratio_4w_uaa_dol);
    variables.add(s_ratio_avg_dk_320);
    variables.add(email_numofvowel);
    variables.add(Bad_rate_amt_ccbin);
    variables.add(txnsnt_amt_stss_avg_lst_4_hrs);
    variables.add(num_bank_account_id_90d);
    variables.add(CP1WRtDolAtoBadTxn);
    variables.add(email_MP_7d_UPI_dk);
    variables.add(v36_diff_vid_3d);
    variables.add(cp_ratio_20w_ato_dol);
    variables.add(v36_tx_cnt_in_last_1d);
    variables.add(SNR1WRtDolDclTxn);


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

    if(Bad_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.945877;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.847329;
    else if (0 < valueDouble && valueDouble <= 0.0003086351) woeValue = -0.422382;
    else if (0.0003086351 < valueDouble && valueDouble <= 0.004670214) woeValue = -0.013672;
    else if (0.004670214 < valueDouble && valueDouble <= 0.0052138179) woeValue = 0.182581;
    else if ( valueDouble > 0.0052138179) woeValue = 1.350222;
    else woeValue = 0;}else if(CP1WRtDolAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.365275;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -0.011375;
    else if (0.0002 < valueDouble && valueDouble <= 0.0077) woeValue = 0.383172;
    else if ( valueDouble > 0.0077) woeValue = 1.566345;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0033) woeValue = -0.549335;
    else if (0.0033 < valueDouble && valueDouble <= 0.004) woeValue = -0.349906;
    else if (0.004 < valueDouble && valueDouble <= 0.0061) woeValue = 0.149537;
    else if (0.0061 < valueDouble && valueDouble <= 0.0067) woeValue = 0.405945;
    else if (0.0067 < valueDouble && valueDouble <= 0.008) woeValue = 0.468095;
    else if (0.008 < valueDouble && valueDouble <= 0.0122) woeValue = 0.538353;
    else if (0.0122 < valueDouble && valueDouble <= 0.0144) woeValue = 1.199472;
    else if ( valueDouble > 0.0144) woeValue = 1.217484;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -1.134067;
    else if (-1e38 < valueDouble && valueDouble <= 0.0433115739) woeValue = -1.510703;
    else if (0.0433115739 < valueDouble && valueDouble <= 0.0500644264) woeValue = -1.101325;
    else if (0.0500644264 < valueDouble && valueDouble <= 0.0542493529) woeValue = -0.846199;
    else if (0.0542493529 < valueDouble && valueDouble <= 0.0683007169) woeValue = -0.517403;
    else if (0.0683007169 < valueDouble && valueDouble <= 0.0799129961) woeValue = -0.420420;
    else if (0.0799129961 < valueDouble && valueDouble <= 0.098136646) woeValue = -0.262585;
    else if (0.098136646 < valueDouble && valueDouble <= 0.1393557984) woeValue = 0.512863;
    else if (0.1393557984 < valueDouble && valueDouble <= 0.2055749129) woeValue = 1.549581;
    else if (0.2055749129 < valueDouble && valueDouble <= 0.2419765234) woeValue = 1.686955;
    else if (0.2419765234 < valueDouble && valueDouble <= 0.4034481071) woeValue = 2.344564;
    else if ( valueDouble > 0.4034481071) woeValue = 2.658938;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0114) woeValue = -0.073079;
    else if ( valueDouble > 0.0114) woeValue = 1.426682;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.845685;
    else if (0 < valueDouble && valueDouble <= 0.0651) woeValue = -0.125789;
    else if (0.0651 < valueDouble && valueDouble <= 0.078) woeValue = 0.152048;
    else if (0.078 < valueDouble && valueDouble <= 0.7199) woeValue = 1.375068;
    else if ( valueDouble > 0.7199) woeValue = 1.646569;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.877478;
    else if (-1e38 < valueDouble && valueDouble <= 1.4811083123) woeValue = -0.706823;
    else if (1.4811083123 < valueDouble && valueDouble <= 9.3482142857) woeValue = -0.601873;
    else if (9.3482142857 < valueDouble && valueDouble <= 71.9375) woeValue = -0.443896;
    else if (71.9375 < valueDouble && valueDouble <= 106.92592593) woeValue = -0.332140;
    else if (106.92592593 < valueDouble && valueDouble <= 211.82) woeValue = -0.077330;
    else if (211.82 < valueDouble && valueDouble <= 354.80769231) woeValue = 0.023523;
    else if (354.80769231 < valueDouble && valueDouble <= 906.25) woeValue = 0.541188;
    else if (906.25 < valueDouble && valueDouble <= 2112.75) woeValue = 1.076258;
    else if (2112.75 < valueDouble && valueDouble <= 3483.3333333) woeValue = 1.199138;
    else if (3483.3333333 < valueDouble && valueDouble <= 6641.8809524) woeValue = 1.778116;
    else if (6641.8809524 < valueDouble && valueDouble <= 17567.5) woeValue = 1.920814;
    else if ( valueDouble > 17567.5) woeValue = 2.343474;
    else woeValue = 0;}else if(c_cc_num_ss.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.042899;
    else if ( valueDouble > 0) woeValue = -0.864671;
    else woeValue = 0;}else if(c_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 15) woeValue = 1.860497;
    else if (15 < valueDouble && valueDouble <= 145) woeValue = 0.293418;
    else if (145 < valueDouble && valueDouble <= 1500) woeValue = 0.160918;
    else if (1500 < valueDouble && valueDouble <= 2705) woeValue = -0.234731;
    else if ( valueDouble > 2705) woeValue = -0.410537;
    else woeValue = 0;}else if(cp_ratio_20w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.488686;
    else if (-1e38 < valueDouble && valueDouble <= 0.0699976201) woeValue = -0.105669;
    else if (0.0699976201 < valueDouble && valueDouble <= 1.1462861581) woeValue = 0.247535;
    else if (1.1462861581 < valueDouble && valueDouble <= 1.5551272195) woeValue = 0.301642;
    else if (1.5551272195 < valueDouble && valueDouble <= 3.0264256944) woeValue = 0.472260;
    else if (3.0264256944 < valueDouble && valueDouble <= 5.3944071945) woeValue = 0.795650;
    else if ( valueDouble > 5.3944071945) woeValue = 1.133128;
    else woeValue = 0;}else if(email_MP_7d_UPI_dk.getName().equals(varName)){if (value == null) woeValue = 0.286826;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.558253;
    else if (0 < valueDouble && valueDouble <= 0.0002413817) woeValue = -0.388702;
    else if ( valueDouble > 0.0002413817) woeValue = 0.654178;
    else woeValue = 0;}else if(email_numofvowel.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.180418;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.480654;
    else if (1 < valueDouble && valueDouble <= 4) woeValue = -0.141336;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.405793;
    else if ( valueDouble > 6) woeValue = 0.431748;
    else woeValue = 0;}else if(fullname_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.174219;
    else if ( valueDouble > 0) woeValue = 0.392134;
    else woeValue = 0;}else if(ip_avg_dk_10.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.584682;
    else if (-1 < valueDouble && valueDouble <= 768) woeValue = -0.373659;
    else if (768 < valueDouble && valueDouble <= 1750) woeValue = -0.292161;
    else if (1750 < valueDouble && valueDouble <= 2491) woeValue = 0.036506;
    else if (2491 < valueDouble && valueDouble <= 12500.0001) woeValue = 0.206531;
    else if (12500.0001 < valueDouble && valueDouble <= 48599.8038) woeValue = 0.392276;
    else if ( valueDouble > 48599.8038) woeValue = 0.803555;
    else woeValue = 0;}else if(ipr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.124790;
    else if (-1e38 < valueDouble && valueDouble <= 0.0256791496) woeValue = -1.044841;
    else if (0.0256791496 < valueDouble && valueDouble <= 0.1508777391) woeValue = -0.256204;
    else if (0.1508777391 < valueDouble && valueDouble <= 0.170502063) woeValue = 0.128640;
    else if (0.170502063 < valueDouble && valueDouble <= 5.2060332763) woeValue = 1.039721;
    else if (5.2060332763 < valueDouble && valueDouble <= 8.1416707377) woeValue = 1.733685;
    else if ( valueDouble > 8.1416707377) woeValue = 1.955565;
    else woeValue = 0;}else if(is_tail.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.117706;
    else if ( valueDouble > 0) woeValue = 0.554452;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0281) woeValue = -1.880681;
    else if (0.0281 < valueDouble && valueDouble <= 0.0351) woeValue = -0.937610;
    else if (0.0351 < valueDouble && valueDouble <= 0.0465) woeValue = -0.330453;
    else if (0.0465 < valueDouble && valueDouble <= 0.0695) woeValue = -0.288932;
    else if (0.0695 < valueDouble && valueDouble <= 0.0884) woeValue = 0.093717;
    else if (0.0884 < valueDouble && valueDouble <= 0.2856) woeValue = 0.969641;
    else if (0.2856 < valueDouble && valueDouble <= 0.5556) woeValue = 1.393154;
    else if ( valueDouble > 0.5556) woeValue = 1.708711;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.765566;
    else if (0 < valueDouble && valueDouble <= 0.020478) woeValue = -1.011121;
    else if (0.020478 < valueDouble && valueDouble <= 0.034483) woeValue = -0.421538;
    else if (0.034483 < valueDouble && valueDouble <= 0.044248) woeValue = -0.290500;
    else if (0.044248 < valueDouble && valueDouble <= 0.129032) woeValue = -0.036937;
    else if (0.129032 < valueDouble && valueDouble <= 0.16443) woeValue = 0.370692;
    else if (0.16443 < valueDouble && valueDouble <= 0.307692) woeValue = 1.394907;
    else if (0.307692 < valueDouble && valueDouble <= 0.590909) woeValue = 2.440586;
    else if (0.590909 < valueDouble && valueDouble <= 0.8) woeValue = 3.306285;
    else if ( valueDouble > 0.8) woeValue = 4.000000;
    else woeValue = 0;}else if(num_bank_account_id_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.230256;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 1.035520;
    else if ( valueDouble > 2) woeValue = 2.630843;
    else woeValue = 0;}else if(primaryach_checking.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.340224;
    else if ( valueDouble > 0) woeValue = -0.035825;
    else woeValue = 0;}else if(s_mp_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.783008;
    else if (0 < valueDouble && valueDouble <= 3488.5172) woeValue = -0.731280;
    else if (3488.5172 < valueDouble && valueDouble <= 6646.702) woeValue = -0.622005;
    else if (6646.702 < valueDouble && valueDouble <= 14517.4182) woeValue = 0.147718;
    else if (14517.4182 < valueDouble && valueDouble <= 20026.8403) woeValue = 0.318518;
    else if (20026.8403 < valueDouble && valueDouble <= 31219.7988) woeValue = 0.707796;
    else if (31219.7988 < valueDouble && valueDouble <= 57750.8337) woeValue = 1.199389;
    else if ( valueDouble > 57750.8337) woeValue = 2.021488;
    else woeValue = 0;}else if(s_ratio_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.488230;
    else if (-1 < valueDouble && valueDouble <= 0.0601) woeValue = -0.563106;
    else if (0.0601 < valueDouble && valueDouble <= 0.4913) woeValue = -0.239406;
    else if (0.4913 < valueDouble && valueDouble <= 0.6052) woeValue = -0.055786;
    else if (0.6052 < valueDouble && valueDouble <= 0.7981) woeValue = 0.044450;
    else if (0.7981 < valueDouble && valueDouble <= 0.9407) woeValue = 0.297802;
    else if ( valueDouble > 0.9407) woeValue = 0.505481;
    else woeValue = 0;}else if(txnsnt_amt_stss_avg_lst_4_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.170201;
    else if (-1 < valueDouble && valueDouble <= 10) woeValue = 2.337844;
    else if ( valueDouble > 10) woeValue = 2.396397;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 1.077943;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.077943;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.560355;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = -0.094909;
    else if (4 < valueDouble && valueDouble <= 9) woeValue = 0.051151;
    else if ( valueDouble > 9) woeValue = 0.588571;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.612107;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.721586;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.359041;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.214231;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.880364;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 1.065168;
    else if (5 < valueDouble && valueDouble <= 7) woeValue = 1.270702;
    else if (7 < valueDouble && valueDouble <= 10) woeValue = 1.875467;
    else if ( valueDouble > 10) woeValue = 2.744773;
    else woeValue = 0;}else if(v36_tx_cnt_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = -0.566482;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.352513;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.116081;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.091570;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.441989;
    else if (5 < valueDouble && valueDouble <= 7) woeValue = 0.614540;
    else if (7 < valueDouble && valueDouble <= 10) woeValue = 0.936972;
    else if ( valueDouble > 10) woeValue = 2.398594;
    else woeValue = 0;}else if(yodlee_iav_bal.getName().equals(varName)){if (value == null) woeValue = 0.310614;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.939843;
    else if ( valueDouble > 0) woeValue = -1.909545;
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
    
    coeffMap.put("Intercept",+2.87065255);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.58012116);
    coeffMap.put(v36_tx_cnt_in_last_1d.getName(),-0.19152602);
    coeffMap.put(ach_outstd_age.getName(),-0.62678341);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.54160940);
    coeffMap.put(CP1WRtDolAtoBadTxn.getName(),-0.26357112);
    coeffMap.put(num_bank_account_id_90d.getName(),-0.91896459);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.45736227);
    coeffMap.put(v36_login_exces_1h.getName(),-0.44919705);
    coeffMap.put(ipr_ratio_4w_uaa_dol.getName(),-0.62675311);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.77540879);
    coeffMap.put(cp_ratio_20w_ato_dol.getName(),-0.57920712);
    coeffMap.put(Bad_rate_amt_ccbin.getName(),-0.62708645);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.40740871);
    coeffMap.put(s_ratio_avg_dk_320.getName(),-0.50417307);
    coeffMap.put(email_MP_7d_UPI_dk.getName(),-0.55902110);
    coeffMap.put(c_dof.getName(),-0.49661048);
    coeffMap.put(is_tail.getName(),-0.83611507);
    coeffMap.put(txnsnt_amt_stss_avg_lst_4_hrs.getName(),-0.09505392);
    coeffMap.put(s_mp_amt_dk_80.getName(),-0.52416303);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.19929697);
    coeffMap.put(primaryach_checking.getName(),-0.23086746);
    coeffMap.put(fullname_lowcase.getName(),-0.84017014);
    coeffMap.put(c_cc_num_ss.getName(),-0.52379605);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.43260941);
    coeffMap.put(email_numofvowel.getName(),-0.35976869);
    coeffMap.put(yodlee_iav_bal.getName(),-0.84671251);
    coeffMap.put(ip_avg_dk_10.getName(),-0.34660906);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 861.10474214;
  }

  @Override
  public double getCoeff2() {
    return  -57.94507918;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT2;
  }
  
}