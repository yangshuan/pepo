package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg2 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(snr_ratio_20w_ato_dol);
    variables.add(max_cross4wRtDclAcc);
    variables.add(s_ms_amt_dk_40);
    variables.add(v36_login_exces_1h);
    variables.add(s_pmts_sent_count);
    variables.add(email_numofletter);
    variables.add(CP4WRtDolBadTxn);
    variables.add(wach_n_checking);
    variables.add(last_name_lowcase);
    variables.add(billing_shipping_state_match);
    variables.add(n_rt_dcl_14dys);
    variables.add(ach_outstd_age);
    variables.add(max_cross20wRtDclAcc);
    variables.add(ncc_failed_ratio);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(Decline_rate_ccbin);
    variables.add(primaryach_checking);
    variables.add(s_mp_amt_dk_40);
    variables.add(ipr_ratio_4w_uaa_dol);
    variables.add(VID1WRtDolCcXbrBadTxn);
    variables.add(v2_e_ip_eq_indicative);
    variables.add(n_bdrt_bp_txn);
    variables.add(Bad_rate_amt_ccbin);
    variables.add(added_address_lt_2);
    variables.add(num_bank_account_id_90d);
    variables.add(email_percofvowely);
    variables.add(cc_pct_unknown);
    variables.add(ED20WRtCcBadAcc);
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

    if(Bad_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.980051;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.897172;
    else if (0 < valueDouble && valueDouble <= 0.0003158665) woeValue = -0.451718;
    else if (0.0003158665 < valueDouble && valueDouble <= 0.0051222677) woeValue = 0.002140;
    else if ( valueDouble > 0.0051222677) woeValue = 1.248350;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.448928;
    else if (0 < valueDouble && valueDouble <= 0.0007) woeValue = -1.124640;
    else if (0.0007 < valueDouble && valueDouble <= 0.001) woeValue = -0.982697;
    else if (0.001 < valueDouble && valueDouble <= 0.0033) woeValue = -0.612651;
    else if (0.0033 < valueDouble && valueDouble <= 0.0043) woeValue = -0.284454;
    else if (0.0043 < valueDouble && valueDouble <= 0.006) woeValue = 0.192985;
    else if (0.006 < valueDouble && valueDouble <= 0.0079) woeValue = 0.475313;
    else if (0.0079 < valueDouble && valueDouble <= 0.017) woeValue = 0.784771;
    else if ( valueDouble > 0.017) woeValue = 1.157474;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = -1.140755;
    else if (-1e38 < valueDouble && valueDouble <= 0.0436284727) woeValue = -1.629393;
    else if (0.0436284727 < valueDouble && valueDouble <= 0.0502646154) woeValue = -1.150307;
    else if (0.0502646154 < valueDouble && valueDouble <= 0.0545585919) woeValue = -0.799070;
    else if (0.0545585919 < valueDouble && valueDouble <= 0.075502008) woeValue = -0.484621;
    else if (0.075502008 < valueDouble && valueDouble <= 0.0985915493) woeValue = -0.328540;
    else if (0.0985915493 < valueDouble && valueDouble <= 0.1393322734) woeValue = 0.490752;
    else if (0.1393322734 < valueDouble && valueDouble <= 0.2031659129) woeValue = 1.598884;
    else if (0.2031659129 < valueDouble && valueDouble <= 0.2419765234) woeValue = 1.750111;
    else if ( valueDouble > 0.2419765234) woeValue = 2.497711;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.239765;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -1.416137;
    else if (0.0009 < valueDouble && valueDouble <= 0.0011) woeValue = -0.242558;
    else if (0.0011 < valueDouble && valueDouble <= 0.0021) woeValue = 0.079132;
    else if ( valueDouble > 0.0021) woeValue = 1.862572;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.864627;
    else if (0 < valueDouble && valueDouble <= 0.0651) woeValue = -0.188924;
    else if (0.0651 < valueDouble && valueDouble <= 0.0712) woeValue = 0.167316;
    else if (0.0712 < valueDouble && valueDouble <= 0.6935) woeValue = 1.413862;
    else if ( valueDouble > 0.6935) woeValue = 1.681201;
    else woeValue = 0;}else if(VID1WRtDolCcXbrBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0012) woeValue = -0.385261;
    else if (0.0012 < valueDouble && valueDouble <= 0.0013) woeValue = -0.283835;
    else if (0.0013 < valueDouble && valueDouble <= 0.0016) woeValue = -0.008054;
    else if (0.0016 < valueDouble && valueDouble <= 0.0027) woeValue = 0.212665;
    else if ( valueDouble > 0.0027) woeValue = 0.498760;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.324959;
    else if (-1e38 < valueDouble && valueDouble <= 1.9867549669) woeValue = -0.665986;
    else if (1.9867549669 < valueDouble && valueDouble <= 8.9884615385) woeValue = -0.598189;
    else if (8.9884615385 < valueDouble && valueDouble <= 10.339734121) woeValue = -0.591061;
    else if (10.339734121 < valueDouble && valueDouble <= 68.322981366) woeValue = -0.430163;
    else if (68.322981366 < valueDouble && valueDouble <= 200) woeValue = -0.207015;
    else if (200 < valueDouble && valueDouble <= 254) woeValue = -0.112555;
    else if (254 < valueDouble && valueDouble <= 333.32222222) woeValue = -0.033582;
    else if (333.32222222 < valueDouble && valueDouble <= 823.78723404) woeValue = 0.603259;
    else if (823.78723404 < valueDouble && valueDouble <= 1206.3414634) woeValue = 0.789807;
    else if (1206.3414634 < valueDouble && valueDouble <= 3119.1176471) woeValue = 1.165782;
    else if (3119.1176471 < valueDouble && valueDouble <= 5785.5) woeValue = 1.727901;
    else if (5785.5 < valueDouble && valueDouble <= 14625) woeValue = 1.914082;
    else if ( valueDouble > 14625) woeValue = 2.289485;
    else woeValue = 0;}else if(added_address_lt_2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.189786;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.200984;
    else if ( valueDouble > 1) woeValue = 1.117771;
    else woeValue = 0;}else if(billing_shipping_state_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.336494;
    else if ( valueDouble > 1) woeValue = 0.684221;
    else woeValue = 0;}else if(cc_pct_unknown.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.091594;
    else if (0 < valueDouble && valueDouble <= 0.1578947368) woeValue = -0.613337;
    else if (0.1578947368 < valueDouble && valueDouble <= 0.4705882353) woeValue = 0.696823;
    else if (0.4705882353 < valueDouble && valueDouble <= 0.9285714286) woeValue = 0.989807;
    else if ( valueDouble > 0.9285714286) woeValue = 0.092915;
    else woeValue = 0;}else if(cp_ratio_20w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.477084;
    else if (-1e38 < valueDouble && valueDouble <= 0.0677578651) woeValue = -0.114982;
    else if (0.0677578651 < valueDouble && valueDouble <= 0.6690875377) woeValue = 0.248415;
    else if (0.6690875377 < valueDouble && valueDouble <= 1.525862069) woeValue = 0.263903;
    else if (1.525862069 < valueDouble && valueDouble <= 3.7396155876) woeValue = 0.471405;
    else if (3.7396155876 < valueDouble && valueDouble <= 5.1614583333) woeValue = 0.984974;
    else if ( valueDouble > 5.1614583333) woeValue = 1.109631;
    else woeValue = 0;}else if(email_numofletter.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = -0.589745;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.271958;
    else if (4 < valueDouble && valueDouble <= 14) woeValue = -0.036199;
    else if ( valueDouble > 14) woeValue = 0.587980;
    else woeValue = 0;}else if(email_percofvowely.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.095441;
    else if (0 < valueDouble && valueDouble <= 0.4666666667) woeValue = 0.078326;
    else if (0.4666666667 < valueDouble && valueDouble <= 0.5555555556) woeValue = -0.810282;
    else if ( valueDouble > 0.5555555556) woeValue = -1.259947;
    else woeValue = 0;}else if(ipr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.125686;
    else if (-1e38 < valueDouble && valueDouble <= 0.0249154964) woeValue = -1.056511;
    else if (0.0249154964 < valueDouble && valueDouble <= 0.1473750537) woeValue = -0.297304;
    else if (0.1473750537 < valueDouble && valueDouble <= 4.9431578947) woeValue = 0.991644;
    else if (4.9431578947 < valueDouble && valueDouble <= 7.7130697211) woeValue = 1.661083;
    else if (7.7130697211 < valueDouble && valueDouble <= 15.918697348) woeValue = 1.949178;
    else if ( valueDouble > 15.918697348) woeValue = 1.962502;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.210718;
    else if ( valueDouble > 0) woeValue = 0.720820;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0.0281) woeValue = -1.880014;
    else if (0.0281 < valueDouble && valueDouble <= 0.0341) woeValue = -1.012608;
    else if (0.0341 < valueDouble && valueDouble <= 0.0569) woeValue = -0.316606;
    else if (0.0569 < valueDouble && valueDouble <= 0.0706) woeValue = -0.283627;
    else if (0.0706 < valueDouble && valueDouble <= 0.095) woeValue = 0.116288;
    else if (0.095 < valueDouble && valueDouble <= 0.3634) woeValue = 1.000019;
    else if ( valueDouble > 0.3634) woeValue = 1.807681;
    else woeValue = 0;}else if(max_cross4wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = -0.313081;
    else if (-1e38 < valueDouble && valueDouble <= 0.0305) woeValue = -1.434142;
    else if (0.0305 < valueDouble && valueDouble <= 0.035) woeValue = -0.829256;
    else if (0.035 < valueDouble && valueDouble <= 0.0698) woeValue = -0.421384;
    else if (0.0698 < valueDouble && valueDouble <= 0.0746) woeValue = -0.094709;
    else if (0.0746 < valueDouble && valueDouble <= 0.1667) woeValue = 0.579002;
    else if (0.1667 < valueDouble && valueDouble <= 0.8571) woeValue = 1.222308;
    else if ( valueDouble > 0.8571) woeValue = 2.259329;
    else woeValue = 0;}else if(n_bdrt_bp_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.331194;
    else if (0 < valueDouble && valueDouble <= 0.00238) woeValue = -1.696830;
    else if (0.00238 < valueDouble && valueDouble <= 0.00459) woeValue = -0.912535;
    else if (0.00459 < valueDouble && valueDouble <= 0.00936) woeValue = -0.156768;
    else if (0.00936 < valueDouble && valueDouble <= 0.03887) woeValue = 0.008556;
    else if (0.03887 < valueDouble && valueDouble <= 0.05828) woeValue = 0.496427;
    else if (0.05828 < valueDouble && valueDouble <= 0.12397) woeValue = 2.069677;
    else if ( valueDouble > 0.12397) woeValue = 2.307170;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.759935;
    else if (0 < valueDouble && valueDouble <= 0.01542) woeValue = -1.344858;
    else if (0.01542 < valueDouble && valueDouble <= 0.020408) woeValue = -0.816400;
    else if (0.020408 < valueDouble && valueDouble <= 0.035398) woeValue = -0.462979;
    else if (0.035398 < valueDouble && valueDouble <= 0.042589) woeValue = -0.174458;
    else if (0.042589 < valueDouble && valueDouble <= 0.128) woeValue = -0.064020;
    else if (0.128 < valueDouble && valueDouble <= 0.157993) woeValue = 0.359170;
    else if (0.157993 < valueDouble && valueDouble <= 0.264808) woeValue = 1.472852;
    else if (0.264808 < valueDouble && valueDouble <= 0.5) woeValue = 2.130424;
    else if (0.5 < valueDouble && valueDouble <= 0.783333) woeValue = 2.972741;
    else if ( valueDouble > 0.783333) woeValue = 4.000000;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.298072;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.361232;
    else if (0 < valueDouble && valueDouble <= 0.0142857143) woeValue = -3.335686;
    else if (0.0142857143 < valueDouble && valueDouble <= 0.0357142857) woeValue = -1.815291;
    else if (0.0357142857 < valueDouble && valueDouble <= 0.0625) woeValue = -0.951614;
    else if (0.0625 < valueDouble && valueDouble <= 0.496328928) woeValue = 0.181700;
    else if (0.496328928 < valueDouble && valueDouble <= 0.5897435897) woeValue = 1.874551;
    else if (0.5897435897 < valueDouble && valueDouble <= 0.9964243147) woeValue = 2.315934;
    else if ( valueDouble > 0.9964243147) woeValue = 2.749342;
    else woeValue = 0;}else if(num_bank_account_id_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.231543;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 1.035887;
    else if ( valueDouble > 2) woeValue = 2.634346;
    else woeValue = 0;}else if(primaryach_checking.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.347899;
    else if ( valueDouble > 0) woeValue = -0.024649;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.383363472) woeValue = -0.403418;
    else if (0.383363472 < valueDouble && valueDouble <= 0.452573087) woeValue = 0.164445;
    else if (0.452573087 < valueDouble && valueDouble <= 1.8738461538) woeValue = 0.214658;
    else if (1.8738461538 < valueDouble && valueDouble <= 8.6827386692) woeValue = 0.317478;
    else if ( valueDouble > 8.6827386692) woeValue = 0.975598;
    else woeValue = 0;}else if(s_mp_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.108087;
    else if (0 < valueDouble && valueDouble <= 2740.4563) woeValue = -0.878167;
    else if (2740.4563 < valueDouble && valueDouble <= 7338.8981) woeValue = -0.084320;
    else if (7338.8981 < valueDouble && valueDouble <= 14292.9011) woeValue = 0.043517;
    else if (14292.9011 < valueDouble && valueDouble <= 22349.8837) woeValue = 0.694545;
    else if (22349.8837 < valueDouble && valueDouble <= 44051.1967) woeValue = 1.313642;
    else if ( valueDouble > 44051.1967) woeValue = 2.210973;
    else woeValue = 0;}else if(s_ms_amt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.643071;
    else if (0 < valueDouble && valueDouble <= 0.048) woeValue = -0.703890;
    else if (0.048 < valueDouble && valueDouble <= 828.212) woeValue = -0.313513;
    else if (828.212 < valueDouble && valueDouble <= 7421.4741) woeValue = 0.539291;
    else if (7421.4741 < valueDouble && valueDouble <= 11239.1182) woeValue = 1.202281;
    else if (11239.1182 < valueDouble && valueDouble <= 20350.7804) woeValue = 1.527200;
    else if (20350.7804 < valueDouble && valueDouble <= 48525.4944) woeValue = 2.222592;
    else if ( valueDouble > 48525.4944) woeValue = 2.885841;
    else woeValue = 0;}else if(s_pmts_sent_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.707937;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.572239;
    else if (0 < valueDouble && valueDouble <= 113) woeValue = 0.136831;
    else if (113 < valueDouble && valueDouble <= 142) woeValue = 0.116051;
    else if (142 < valueDouble && valueDouble <= 276) woeValue = -0.367330;
    else if ( valueDouble > 276) woeValue = -0.502617;
    else woeValue = 0;}else if(snr_ratio_20w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.349781;
    else if (-1e38 < valueDouble && valueDouble <= 0.0306714002) woeValue = -0.447881;
    else if (0.0306714002 < valueDouble && valueDouble <= 0.413718084) woeValue = 0.156137;
    else if (0.413718084 < valueDouble && valueDouble <= 0.656169083) woeValue = 0.449855;
    else if (0.656169083 < valueDouble && valueDouble <= 2.3506340105) woeValue = 0.545251;
    else if (2.3506340105 < valueDouble && valueDouble <= 3.1135039417) woeValue = 0.838222;
    else if (3.1135039417 < valueDouble && valueDouble <= 4.3332095197) woeValue = 1.054828;
    else if ( valueDouble > 4.3332095197) woeValue = 1.372729;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.213213;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.630490;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.731058;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.349714;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.237167;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.895410;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 1.092229;
    else if (5 < valueDouble && valueDouble <= 7) woeValue = 1.298857;
    else if (7 < valueDouble && valueDouble <= 10) woeValue = 1.874111;
    else if ( valueDouble > 10) woeValue = 2.777183;
    else woeValue = 0;}else if(v36_tx_cnt_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.213213;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = -0.594361;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.375263;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.124947;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.148197;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.425733;
    else if (5 < valueDouble && valueDouble <= 7) woeValue = 0.688645;
    else if (7 < valueDouble && valueDouble <= 9) woeValue = 0.799077;
    else if (9 < valueDouble && valueDouble <= 15) woeValue = 2.200409;
    else if ( valueDouble > 15) woeValue = 2.393357;
    else woeValue = 0;}else if(wach_n_checking.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.292641;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.167662;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.661236;
    else if ( valueDouble > 2) woeValue = 1.265619;
    else woeValue = 0;}else if(v2_e_ip_eq_indicative.getName().equals(varName)){if (Arrays.asList( "_MISSING_","EQUAL_ISP","BOTH_ISP").contains(value)) woeValue = -1.676352;
    else if (Arrays.asList( "EQUAL_CONTROLLED").contains(value)) woeValue = -0.925779;
    else if (Arrays.asList( "NONE").contains(value)) woeValue = 0.114974;
    else if (Arrays.asList( "BOTH_CONTROLLED"," ","NO_EMAILS").contains(value)) woeValue = 0.231797;
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
    
    coeffMap.put("Intercept",+3.02865639);
    coeffMap.put(ncc_failed_ratio.getName(),-0.50039231);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.46019512);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.42577769);
    coeffMap.put(s_ms_amt_dk_40.getName(),-0.36047882);
    coeffMap.put(v36_tx_cnt_in_last_1d.getName(),-0.40888359);
    coeffMap.put(max_cross4wRtDclAcc.getName(),-0.18139264);
    coeffMap.put(v36_login_exces_1h.getName(),-0.38028890);
    coeffMap.put(n_bdrt_bp_txn.getName(),-0.49423594);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.31092269);
    coeffMap.put(ach_outstd_age.getName(),-0.29633135);
    coeffMap.put(s_mp_amt_dk_40.getName(),-0.32647984);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.42811792);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-0.15036259);
    coeffMap.put(billing_shipping_state_match.getName(),-0.36724521);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.15801104);
    coeffMap.put(num_bank_account_id_90d.getName(),-0.63249045);
    coeffMap.put(v2_e_ip_eq_indicative.getName(),-0.47691303);
    coeffMap.put(snr_ratio_20w_ato_dol.getName(),-0.45333482);
    coeffMap.put(cp_ratio_20w_ato_dol.getName(),-0.48458433);
    coeffMap.put(ipr_ratio_4w_uaa_dol.getName(),-0.49216945);
    coeffMap.put(last_name_lowcase.getName(),-0.81753189);
    coeffMap.put(added_address_lt_2.getName(),-0.57128497);
    coeffMap.put(Bad_rate_amt_ccbin.getName(),-0.44767067);
    coeffMap.put(wach_n_checking.getName(),-0.27799332);
    coeffMap.put(cc_pct_unknown.getName(),-0.39313789);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.57639227);
    coeffMap.put(s_pmts_sent_count.getName(),-0.55445636);
    coeffMap.put(VID1WRtDolCcXbrBadTxn.getName(),-0.54598537);
    coeffMap.put(email_percofvowely.getName(),-0.67502379);
    coeffMap.put(email_numofletter.getName(),-0.64385404);
    coeffMap.put(primaryach_checking.getName(),-0.46352022);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 844.52233999;
  }

  @Override
  public double getCoeff2() {
    return  -55.56884951;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT2;
  }
  
}