package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg3 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v36_login_exces_10m);
    variables.add(ebay_sinc_UPI_360all);
    variables.add(outamt_to_avg_cleard);
    variables.add(ncc_failed_amt_ratio);
    variables.add(s_vid_min_dof);
    variables.add(email_MP_dof);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(CP4WRtDolBadTxn);
    variables.add(max_cross20wRtDclAcc);
    variables.add(n_rt_dcl_14dys);
    variables.add(s_pmts_rcvd_count);
    variables.add(nach_last_return_age);
    variables.add(days_snc_last_achtxn);
    variables.add(Decline_rate_ccbin);
    variables.add(v31_ip_country_match);
    variables.add(n_bdrt_txn);
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(cc_num_visa);
    variables.add(acct_cc_d_cnt_dk_20);
    variables.add(wach_n_inactive);
    variables.add(s_visitor_id_tof);
    variables.add(is_credit_union);
    variables.add(alias_max_dof);
    variables.add(s_rtrn_decay_30d_cnt);
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

    if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.615860;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = -0.820161;
    else if (0.0012 < valueDouble && valueDouble <= 0.0028) woeValue = -0.562217;
    else if (0.0028 < valueDouble && valueDouble <= 0.0059) woeValue = -0.091626;
    else if (0.0059 < valueDouble && valueDouble <= 0.0065) woeValue = 0.287219;
    else if (0.0065 < valueDouble && valueDouble <= 0.0122) woeValue = 0.756256;
    else if (0.0122 < valueDouble && valueDouble <= 0.0134) woeValue = 1.058458;
    else if ( valueDouble > 0.0134) woeValue = 1.203161;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.620970;
    else if (-1e38 < valueDouble && valueDouble <= 0.0169050553) woeValue = -1.741100;
    else if (0.0169050553 < valueDouble && valueDouble <= 0.0230458129) woeValue = -1.478263;
    else if (0.0230458129 < valueDouble && valueDouble <= 0.0240151757) woeValue = -1.244195;
    else if (0.0240151757 < valueDouble && valueDouble <= 0.0442125586) woeValue = -0.726204;
    else if (0.0442125586 < valueDouble && valueDouble <= 0.04646337) woeValue = -0.654901;
    else if (0.04646337 < valueDouble && valueDouble <= 0.0580654876) woeValue = -0.216718;
    else if (0.0580654876 < valueDouble && valueDouble <= 0.0677327445) woeValue = 0.028940;
    else if (0.0677327445 < valueDouble && valueDouble <= 0.0752510925) woeValue = 0.117451;
    else if (0.0752510925 < valueDouble && valueDouble <= 0.0986368639) woeValue = 0.332400;
    else if (0.0986368639 < valueDouble && valueDouble <= 0.115780446) woeValue = 0.807248;
    else if (0.115780446 < valueDouble && valueDouble <= 0.1464497041) woeValue = 0.929540;
    else if ( valueDouble > 0.1464497041) woeValue = 1.419634;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.060768;
    else if ( valueDouble > 0) woeValue = 1.502805;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.320693;
    else if ( valueDouble > 0) woeValue = 0.049456;
    else woeValue = 0;}else if(acct_cc_d_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.174631;
    else if ( valueDouble > 0) woeValue = 2.183998;
    else woeValue = 0;}else if(alias_max_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1297) woeValue = 0.508026;
    else if (1297 < valueDouble && valueDouble <= 1563) woeValue = 0.352369;
    else if (1563 < valueDouble && valueDouble <= 1761) woeValue = -0.047662;
    else if (1761 < valueDouble && valueDouble <= 2604) woeValue = -0.230166;
    else if (2604 < valueDouble && valueDouble <= 3071) woeValue = -0.420930;
    else if (3071 < valueDouble && valueDouble <= 4234) woeValue = -0.659933;
    else if ( valueDouble > 4234) woeValue = -0.908143;
    else woeValue = 0;}else if(cc_num_visa.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.606380;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.008899;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.248118;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.248859;
    else if (6 < valueDouble && valueDouble <= 7) woeValue = 0.579377;
    else if ( valueDouble > 7) woeValue = 0.677199;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5850143578) woeValue = -0.093610;
    else if (0.5850143578 < valueDouble && valueDouble <= 1.5295242673) woeValue = -0.019221;
    else if (1.5295242673 < valueDouble && valueDouble <= 2.5318793963) woeValue = 0.117616;
    else if ( valueDouble > 2.5318793963) woeValue = 0.312067;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.219955;
    else if (0 < valueDouble && valueDouble <= 68) woeValue = -0.565555;
    else if (68 < valueDouble && valueDouble <= 239) woeValue = -0.517050;
    else if (239 < valueDouble && valueDouble <= 297) woeValue = -0.262378;
    else if (297 < valueDouble && valueDouble <= 333) woeValue = -0.012613;
    else if (333 < valueDouble && valueDouble <= 531) woeValue = 0.259598;
    else if (531 < valueDouble && valueDouble <= 669) woeValue = 0.458961;
    else if ( valueDouble > 669) woeValue = 0.664767;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.168332;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 181) woeValue = 1.008161;
    else if (181 < valueDouble && valueDouble <= 357) woeValue = 0.829736;
    else if ( valueDouble > 357) woeValue = 0.548298;
    else woeValue = 0;}else if(email_MP_dof.getName().equals(varName)){if (value == null) woeValue = 0.208483;
    else if (-1e38 < valueDouble && valueDouble <= 1571) woeValue = 0.268100;
    else if (1571 < valueDouble && valueDouble <= 1645) woeValue = 0.073934;
    else if (1645 < valueDouble && valueDouble <= 2887) woeValue = -0.233396;
    else if (2887 < valueDouble && valueDouble <= 3046) woeValue = -0.455618;
    else if (3046 < valueDouble && valueDouble <= 3122) woeValue = -0.521331;
    else if (3122 < valueDouble && valueDouble <= 4770) woeValue = -0.948476;
    else if ( valueDouble > 4770) woeValue = -1.667121;
    else woeValue = 0;}else if(ip_rtn_avg_amt_pst_1y.getName().equals(varName)){if (value == null) woeValue = -0.031683;
    else if (-1e38 < valueDouble && valueDouble <= 3068) woeValue = 0.740325;
    else if (3068 < valueDouble && valueDouble <= 3448.6666667) woeValue = 0.336462;
    else if (3448.6666667 < valueDouble && valueDouble <= 7284) woeValue = 0.083055;
    else if (7284 < valueDouble && valueDouble <= 31069.142857) woeValue = -0.465357;
    else if ( valueDouble > 31069.142857) woeValue = -0.834997;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.067140;
    else if ( valueDouble > 0) woeValue = -0.472704;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0284) woeValue = -1.053570;
    else if (0.0284 < valueDouble && valueDouble <= 0.0304) woeValue = -0.715165;
    else if (0.0304 < valueDouble && valueDouble <= 0.0318) woeValue = -0.694296;
    else if (0.0318 < valueDouble && valueDouble <= 0.0376) woeValue = -0.626129;
    else if (0.0376 < valueDouble && valueDouble <= 0.039) woeValue = -0.310452;
    else if (0.039 < valueDouble && valueDouble <= 0.05) woeValue = -0.128275;
    else if (0.05 < valueDouble && valueDouble <= 0.0593) woeValue = 0.072599;
    else if (0.0593 < valueDouble && valueDouble <= 0.0751) woeValue = 0.423852;
    else if (0.0751 < valueDouble && valueDouble <= 0.2653) woeValue = 0.970053;
    else if ( valueDouble > 0.2653) woeValue = 1.179711;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.181807;
    else if (0 < valueDouble && valueDouble <= 0.00014) woeValue = -0.706217;
    else if (0.00014 < valueDouble && valueDouble <= 0.00039) woeValue = -0.317977;
    else if (0.00039 < valueDouble && valueDouble <= 0.00107) woeValue = -0.073634;
    else if (0.00107 < valueDouble && valueDouble <= 0.00266) woeValue = 0.087053;
    else if (0.00266 < valueDouble && valueDouble <= 0.01235) woeValue = 0.668414;
    else if ( valueDouble > 0.01235) woeValue = 1.605061;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.170514;
    else if (0 < valueDouble && valueDouble <= 0.009785) woeValue = -0.224615;
    else if (0.009785 < valueDouble && valueDouble <= 0.01875) woeValue = -0.170669;
    else if (0.01875 < valueDouble && valueDouble <= 0.022909) woeValue = -0.167171;
    else if (0.022909 < valueDouble && valueDouble <= 0.036741) woeValue = 0.032283;
    else if (0.036741 < valueDouble && valueDouble <= 0.139053) woeValue = 0.147379;
    else if (0.139053 < valueDouble && valueDouble <= 0.248945) woeValue = 0.468845;
    else if ( valueDouble > 0.248945) woeValue = 1.592573;
    else woeValue = 0;}else if(nach_last_return_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3755.9676758) woeValue = -0.030658;
    else if ( valueDouble > 3755.9676758) woeValue = 1.517472;
    else woeValue = 0;}else if(ncc_failed_amt_ratio.getName().equals(varName)){if (value == null) woeValue = -0.132734;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.619327;
    else if (0 < valueDouble && valueDouble <= 0.0044282975) woeValue = -0.602377;
    else if (0.0044282975 < valueDouble && valueDouble <= 0.0238073194) woeValue = -0.018807;
    else if (0.0238073194 < valueDouble && valueDouble <= 0.0574164261) woeValue = 0.315567;
    else if (0.0574164261 < valueDouble && valueDouble <= 0.1991176226) woeValue = 0.548638;
    else if (0.1991176226 < valueDouble && valueDouble <= 0.8460818465) woeValue = 1.034652;
    else if ( valueDouble > 0.8460818465) woeValue = 1.682975;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5.0161550889) woeValue = -0.041578;
    else if (5.0161550889 < valueDouble && valueDouble <= 8.014441368) woeValue = 0.021827;
    else if (8.014441368 < valueDouble && valueDouble <= 21.098531882) woeValue = 0.082852;
    else if ( valueDouble > 21.098531882) woeValue = 1.080119;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.134860;
    else if (0 < valueDouble && valueDouble <= 214) woeValue = 0.731057;
    else if (214 < valueDouble && valueDouble <= 7441) woeValue = 0.176764;
    else if (7441 < valueDouble && valueDouble <= 312642) woeValue = 0.019399;
    else if (312642 < valueDouble && valueDouble <= 782154) woeValue = -0.215756;
    else if ( valueDouble > 782154) woeValue = -0.603603;
    else woeValue = 0;}else if(s_pmts_rcvd_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.051794;
    else if (0 < valueDouble && valueDouble <= 5) woeValue = 0.070619;
    else if (5 < valueDouble && valueDouble <= 50) woeValue = 0.013291;
    else if (50 < valueDouble && valueDouble <= 530) woeValue = -0.324584;
    else if ( valueDouble > 530) woeValue = -0.712838;
    else woeValue = 0;}else if(s_rtrn_decay_30d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.145712;
    else if (0 < valueDouble && valueDouble <= 4.304859E-11) woeValue = 0.489090;
    else if (4.304859E-11 < valueDouble && valueDouble <= 4.5541789E-6) woeValue = 1.080771;
    else if (4.5541789E-6 < valueDouble && valueDouble <= 0.000171056) woeValue = 1.206863;
    else if ( valueDouble > 0.000171056) woeValue = 1.665104;
    else woeValue = 0;}else if(s_vid_min_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.214196;
    else if (0 < valueDouble && valueDouble <= 6) woeValue = 0.027515;
    else if (6 < valueDouble && valueDouble <= 307) woeValue = 0.199899;
    else if ( valueDouble > 307) woeValue = 0.348209;
    else woeValue = 0;}else if(s_visitor_id_tof.getName().equals(varName)){if (value == null) woeValue = 0.033590;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.033590;
    else if (0 < valueDouble && valueDouble <= 49) woeValue = 0.200050;
    else if (49 < valueDouble && valueDouble <= 135) woeValue = -0.352305;
    else if ( valueDouble > 135) woeValue = -0.901353;
    else woeValue = 0;}else if(v36_login_exces_10m.getName().equals(varName)){if (value == null) woeValue = -0.121250;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = -0.038512;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.717260;
    else if ( valueDouble > 4) woeValue = 1.258350;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.002205;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = 0.959406;
    else if ( valueDouble > 3) woeValue = 1.339779;
    else woeValue = 0;}else if(v31_ip_country_match.getName().equals(varName)){if (Arrays.asList(" ").contains(value)) woeValue = -0.052005;
    else if (Arrays.asList( "NO_NEW_CTRY_MATCH_SINGLE_CTRY_ACCT","NEW_CTRY_MATCH").contains(value)) woeValue = -0.015387;
    else if (Arrays.asList( "NO_NEW_CTRY_WEAK_MATCH").contains(value)) woeValue = 0.371555;
    else if (Arrays.asList( "NEW_CTRY_MISMATCH","NO_NEW_CTRY_MISMATCH").contains(value)) woeValue = 1.464833;
    else woeValue = -0.052005;}
	
	else 

		{
			throw new RuntimeException("WOE not available for variable " + varName);
		}
		
		return woeValue;
  }
  
  @Override
  public HashMap<String, Double> getCoeffMap() {
    HashMap<String, Double> coeffMap = new HashMap<String, Double>();
    
    coeffMap.put("Intercept",+4.20508581);
    coeffMap.put(acct_cc_d_cnt_dk_20.getName(),-0.41115315);
    coeffMap.put(wach_n_inactive.getName(),-0.95540366);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.64592276);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.50050957);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.46032695);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.83196535);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.51509916);
    coeffMap.put(alias_max_dof.getName(),-0.74212290);
    coeffMap.put(s_rtrn_decay_30d_cnt.getName(),-0.06059978);
    coeffMap.put(n_bdrt_txn.getName(),-0.33889212);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-1.19788492);
    coeffMap.put(s_vid_min_dof.getName(),-0.88273828);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-1.35702895);
    coeffMap.put(cc_num_visa.getName(),-0.59291826);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.54463267);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.85818909);
    coeffMap.put(s_visitor_id_tof.getName(),-0.71723293);
    coeffMap.put(ip_rtn_avg_amt_pst_1y.getName(),-0.69128302);
    coeffMap.put(v36_login_exces_10m.getName(),-0.60419413);
    coeffMap.put(is_credit_union.getName(),-0.68428054);
    coeffMap.put(s_pmts_rcvd_count.getName(),-1.09226786);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.71626419);
    coeffMap.put(email_MP_dof.getName(),-0.30160545);
    coeffMap.put(v31_ip_country_match.getName(),-0.64545487);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.28420912);
    coeffMap.put(nach_last_return_age.getName(),-0.44460486);
    coeffMap.put(ncc_failed_amt_ratio.getName(),-0.37301773);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 845.89012642;
  }

  @Override
  public double getCoeff2() {
    return  -60.69098455;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT3;
  }
  
}