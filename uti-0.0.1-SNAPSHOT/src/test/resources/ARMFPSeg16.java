package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg16 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(ebay_sinc_UPI_360all);
    variables.add(min_to_max_ach_tof);
    variables.add(MOA_V_MOALife);
    variables.add(n_bdrt_txn);
    variables.add(outamt_to_avg_cleard);
    variables.add(pst_hour_created);
    variables.add(s_v_tx_ratio_num);
    variables.add(ipr_ratio_4w_ato_dol);
    variables.add(v35_ip_conn_type);
    variables.add(t_bank_confirm_dof);
    variables.add(c_cc_pct_passed_verification);
    variables.add(s_ach_faild_2nd_count);
    variables.add(VID1WRtDolCcXbrBadTxn);
    variables.add(v36_soft_activity_d);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(CP4WRtAtoBadAcc);
    variables.add(v2_ip_conn_type_old);
    variables.add(s_amt_dk_80);
    variables.add(acct_login_cnt_dk_20);
    variables.add(n_dist_bankid_30d_180d);
    variables.add(s2r_txnsnt_amt_stsd_lst_1_hrs);
    variables.add(ED1WRtDolDclTxn);
    variables.add(rt_num_rate);
    variables.add(email_MP_GMB_1Y);
    variables.add(IP4WRtDolBadTxn);
    variables.add(email_numofconsonant);
    variables.add(ebay_UPIStrikeAMT_180d_360all);
    variables.add(num_bank_routing_number);
    variables.add(cc_pct_debit);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.249228;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -0.195486;
    else if (0.0009 < valueDouble && valueDouble <= 0.0016) woeValue = -0.147149;
    else if (0.0016 < valueDouble && valueDouble <= 0.0033) woeValue = 0.769037;
    else if ( valueDouble > 0.0033) woeValue = 0.915388;
    else woeValue = 0;}else if(ED1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.157986;
    else if (0 < valueDouble && valueDouble <= 0.04) woeValue = -1.326509;
    else if (0.04 < valueDouble && valueDouble <= 0.0554) woeValue = -0.948462;
    else if (0.0554 < valueDouble && valueDouble <= 0.0622) woeValue = -0.382456;
    else if (0.0622 < valueDouble && valueDouble <= 0.0817) woeValue = -0.143144;
    else if ( valueDouble > 0.0817) woeValue = 0.515659;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.167457;
    else if (0 < valueDouble && valueDouble <= 0.0058) woeValue = 0.028301;
    else if ( valueDouble > 0.0058) woeValue = 1.155724;
    else woeValue = 0;}else if(MOA_V_MOALife.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6037300129) woeValue = -0.718892;
    else if (0.6037300129 < valueDouble && valueDouble <= 0.6626614464) woeValue = -0.304613;
    else if (0.6626614464 < valueDouble && valueDouble <= 0.7307914596) woeValue = -0.253072;
    else if (0.7307914596 < valueDouble && valueDouble <= 0.9291071429) woeValue = 1.336669;
    else if (0.9291071429 < valueDouble && valueDouble <= 1.0395663957) woeValue = 1.938453;
    else if (1.0395663957 < valueDouble && valueDouble <= 1.2192401241) woeValue = 2.075389;
    else if ( valueDouble > 1.2192401241) woeValue = 2.194415;
    else woeValue = 0;}else if(VID1WRtDolCcXbrBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.221247;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = 0.115265;
    else if ( valueDouble > 0.002) woeValue = -0.589790;
    else woeValue = 0;}else if(acct_login_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.310290;
    else if (0 < valueDouble && valueDouble <= 1.1376) woeValue = -0.806673;
    else if (1.1376 < valueDouble && valueDouble <= 3.1699) woeValue = -0.253269;
    else if (3.1699 < valueDouble && valueDouble <= 6.8775) woeValue = 0.870968;
    else if ( valueDouble > 6.8775) woeValue = 2.513034;
    else woeValue = 0;}else if(c_cc_pct_passed_verification.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.191419;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.5714285714) woeValue = -0.619538;
    else if (0.5714285714 < valueDouble && valueDouble <= 0.9615384615) woeValue = -0.064114;
    else if ( valueDouble > 0.9615384615) woeValue = 0.021088;
    else woeValue = 0;}else if(cc_pct_debit.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.288333;
    else if (0 < valueDouble && valueDouble <= 0.1176470588) woeValue = -0.173886;
    else if ( valueDouble > 0.1176470588) woeValue = 2.061966;
    else woeValue = 0;}else if(ebay_UPIStrikeAMT_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.768286;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.388921;
    else if (0 < valueDouble && valueDouble <= 28.94) woeValue = -0.198436;
    else if ( valueDouble > 28.94) woeValue = 2.392933;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.059163;
    else if (-1e38 < valueDouble && valueDouble <= 812) woeValue = -1.885670;
    else if ( valueDouble > 812) woeValue = 1.155829;
    else woeValue = 0;}else if(ebay_sinc_UPI_360all.getName().equals(varName)){if (value == null) woeValue = -0.207486;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 3.332723;
    else if (1 < valueDouble && valueDouble <= 422) woeValue = 0.335325;
    else if (422 < valueDouble && valueDouble <= 526) woeValue = -0.545826;
    else if ( valueDouble > 526) woeValue = -1.719173;
    else woeValue = 0;}else if(email_MP_GMB_1Y.getName().equals(varName)){if (value == null) woeValue = 0.277720;
    else if (-1e38 < valueDouble && valueDouble <= 11.59) woeValue = 0.212348;
    else if (11.59 < valueDouble && valueDouble <= 2833.1354) woeValue = -0.011699;
    else if (2833.1354 < valueDouble && valueDouble <= 3625.33) woeValue = -0.479662;
    else if (3625.33 < valueDouble && valueDouble <= 15399.73) woeValue = -2.636551;
    else if ( valueDouble > 15399.73) woeValue = -3.616293;
    else woeValue = 0;}else if(email_numofconsonant.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5) woeValue = -0.167799;
    else if (5 < valueDouble && valueDouble <= 10) woeValue = 0.036216;
    else if ( valueDouble > 10) woeValue = 1.412056;
    else woeValue = 0;}else if(ipr_ratio_4w_ato_dol.getName().equals(varName)){if (value == null) woeValue = -0.055989;
    else if (-1e38 < valueDouble && valueDouble <= 0.0053483202) woeValue = 3.849934;
    else if (0.0053483202 < valueDouble && valueDouble <= 1.028340081) woeValue = -0.143927;
    else if ( valueDouble > 1.028340081) woeValue = -1.012516;
    else woeValue = 0;}else if(min_to_max_ach_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0490935053) woeValue = 2.105126;
    else if (0.0490935053 < valueDouble && valueDouble <= 0.2147234936) woeValue = 1.119130;
    else if (0.2147234936 < valueDouble && valueDouble <= 0.9896110996) woeValue = -0.013740;
    else if (0.9896110996 < valueDouble && valueDouble <= 0.9999993692) woeValue = -1.066901;
    else if ( valueDouble > 0.9999993692) woeValue = -0.291342;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.00985) woeValue = -0.899022;
    else if (0.00985 < valueDouble && valueDouble <= 0.02256) woeValue = 0.375246;
    else if ( valueDouble > 0.02256) woeValue = 1.238378;
    else woeValue = 0;}else if(n_dist_bankid_30d_180d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.484040;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.432983;
    else if ( valueDouble > 1) woeValue = 0.160761;
    else woeValue = 0;}else if(num_bank_routing_number.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.234279;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = 0.256383;
    else if ( valueDouble > 3) woeValue = 0.673163;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 11.99132605) woeValue = -0.611952;
    else if (11.99132605 < valueDouble && valueDouble <= 14.120257275) woeValue = -0.083116;
    else if (14.120257275 < valueDouble && valueDouble <= 23.694629121) woeValue = 1.572855;
    else if ( valueDouble > 23.694629121) woeValue = 3.011913;
    else woeValue = 0;}else if(pst_hour_created.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 5) woeValue = 1.090020;
    else if (5 < valueDouble && valueDouble <= 15) woeValue = -0.030403;
    else if (15 < valueDouble && valueDouble <= 22) woeValue = -0.323658;
    else if ( valueDouble > 22) woeValue = -1.006513;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = -0.650744;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.171531;
    else if (0 < valueDouble && valueDouble <= 0.003) woeValue = -1.415023;
    else if (0.003 < valueDouble && valueDouble <= 0.011) woeValue = -0.335340;
    else if (0.011 < valueDouble && valueDouble <= 0.025) woeValue = 0.514360;
    else if (0.025 < valueDouble && valueDouble <= 0.027) woeValue = 0.914042;
    else if ( valueDouble > 0.027) woeValue = 1.041227;
    else woeValue = 0;}else if(s2r_txnsnt_amt_stsd_lst_1_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.014199;
    else if ( valueDouble > -1) woeValue = 2.071441;
    else woeValue = 0;}else if(s_ach_faild_2nd_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.027227;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.513866;
    else if ( valueDouble > 2) woeValue = -1.674722;
    else woeValue = 0;}else if(s_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 10802.4574) woeValue = -0.400798;
    else if (10802.4574 < valueDouble && valueDouble <= 14319.9335) woeValue = 0.004882;
    else if (14319.9335 < valueDouble && valueDouble <= 62408.8858) woeValue = 0.882275;
    else if ( valueDouble > 62408.8858) woeValue = 2.229629;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.8407407407) woeValue = 2.526606;
    else if (0.8407407407 < valueDouble && valueDouble <= 0.8867102397) woeValue = 2.368423;
    else if (0.8867102397 < valueDouble && valueDouble <= 0.9610091743) woeValue = 0.887330;
    else if (0.9610091743 < valueDouble && valueDouble <= 0.9827505828) woeValue = -0.342929;
    else if (0.9827505828 < valueDouble && valueDouble <= 0.9893522626) woeValue = -0.504924;
    else if (0.9893522626 < valueDouble && valueDouble <= 0.9929506546) woeValue = -1.234081;
    else if (0.9929506546 < valueDouble && valueDouble <= 0.9970674487) woeValue = -1.487296;
    else if (0.9970674487 < valueDouble && valueDouble <= 0.9997765363) woeValue = -2.245530;
    else if ( valueDouble > 0.9997765363) woeValue = -1.030823;
    else woeValue = 0;}else if(t_bank_confirm_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 147) woeValue = 2.667600;
    else if (147 < valueDouble && valueDouble <= 1036) woeValue = 0.492837;
    else if (1036 < valueDouble && valueDouble <= 1284) woeValue = -0.653777;
    else if (1284 < valueDouble && valueDouble <= 2496) woeValue = -1.007476;
    else if ( valueDouble > 2496) woeValue = -1.287329;
    else woeValue = 0;}else if(v36_soft_activity_d.getName().equals(varName)){if (value == null) woeValue = 0.686917;
    else if (-1e38 < valueDouble && valueDouble <= 39) woeValue = 1.021711;
    else if (39 < valueDouble && valueDouble <= 43) woeValue = 0.848238;
    else if (43 < valueDouble && valueDouble <= 47) woeValue = 0.297845;
    else if (47 < valueDouble && valueDouble <= 120) woeValue = 0.051678;
    else if (120 < valueDouble && valueDouble <= 140) woeValue = -0.706422;
    else if (140 < valueDouble && valueDouble <= 178) woeValue = -1.306017;
    else if (178 < valueDouble && valueDouble <= 191) woeValue = -1.986463;
    else if ( valueDouble > 191) woeValue = -2.088657;
    else woeValue = 0;}else if(v2_ip_conn_type_old.getName().equals(varName)){if (Arrays.asList( "MIL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "_MISSING_","DIALUP").contains(value)) woeValue = -2.242100;
    else if (Arrays.asList( "EDU","SAT").contains(value)) woeValue = -1.159960;
    else if (Arrays.asList( "","PRIV","AOL","GOV").contains(value)) woeValue = -0.645579;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.340898;
    else if (Arrays.asList( "BROADBAND","PUBLIC","CORP","WIRELESS").contains(value)) woeValue = -0.095856;
    else if (Arrays.asList( "ISP").contains(value)) woeValue = 0.941835;
    else woeValue = 0;}else if(v35_ip_conn_type.getName().equals(varName)){if (Arrays.asList( "CORP_ISP","GOV_ISP","ISPBIZ","TRAVEL","_MISSING_","HOSTING_ISP").contains(value)) woeValue = -2.569572;
    else if (Arrays.asList( "CORP","UNKNOWN","TRAVEL_ISP","NO_DATA"," ","HOSTING","GOVERNMENT","TRAVEL_OTHER").contains(value)) woeValue = -1.051072;
    else if (Arrays.asList( "EDU").contains(value)) woeValue = -0.571396;
    else if (Arrays.asList( "MILITARY","EDU_ISP","AOL").contains(value)) woeValue = -0.280129;
    else if (Arrays.asList( "ISP").contains(value)) woeValue = 0.014789;
    else if (Arrays.asList( "MOBILE","MIL_ISP").contains(value)) woeValue = 0.930496;
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
    
    coeffMap.put("Intercept",+6.78404794);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.54479747);
    coeffMap.put(t_bank_confirm_dof.getName(),-0.62707669);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.32462100);
    coeffMap.put(MOA_V_MOALife.getName(),-0.52184190);
    coeffMap.put(acct_login_cnt_dk_20.getName(),-0.28329180);
    coeffMap.put(cc_pct_debit.getName(),-0.41290841);
    coeffMap.put(v36_soft_activity_d.getName(),-0.42704854);
    coeffMap.put(ebay_UPIStrikeAMT_180d_360all.getName(),-0.42857197);
    coeffMap.put(s_amt_dk_80.getName(),-0.31344392);
    coeffMap.put(rt_num_rate.getName(),-0.65450103);
    coeffMap.put(min_to_max_ach_tof.getName(),-0.28413424);
    coeffMap.put(num_bank_routing_number.getName(),-1.62955902);
    coeffMap.put(ED1WRtDolDclTxn.getName(),-0.40050970);
    coeffMap.put(ebay_sinc_UPI_360all.getName(),-0.37621316);
    coeffMap.put(ipr_ratio_4w_ato_dol.getName(),-0.54103902);
    coeffMap.put(v2_ip_conn_type_old.getName(),-0.68875751);
    coeffMap.put(email_MP_GMB_1Y.getName(),-0.79269929);
    coeffMap.put(n_dist_bankid_30d_180d.getName(),-0.65326446);
    coeffMap.put(pst_hour_created.getName(),-0.40856710);
    coeffMap.put(CP4WRtAtoBadAcc.getName(),-0.44241262);
    coeffMap.put(v35_ip_conn_type.getName(),-0.59974831);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.77976132);
    coeffMap.put(n_bdrt_txn.getName(),-0.64682674);
    coeffMap.put(email_numofconsonant.getName(),-0.68798438);
    coeffMap.put(VID1WRtDolCcXbrBadTxn.getName(),-0.58804757);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-0.56401806);
    coeffMap.put(c_cc_pct_passed_verification.getName(),-0.70176107);
    coeffMap.put(s_ach_faild_2nd_count.getName(),-1.44123837);
    coeffMap.put(s2r_txnsnt_amt_stsd_lst_1_hrs.getName(),-0.83462301);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 857.07611741;
  }

  @Override
  public double getCoeff2() {
    return  -55.84664239;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT16;
  }
  
}