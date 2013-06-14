package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg11 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(num_logins_failed_14_days);
    variables.add(seen_same_bankid_30d_ago);
    variables.add(rcvr_cc_d_amt_dk_5);
    variables.add(snr_ratio_4w_uaa_dol);
    variables.add(r_ratio_avg_dk_160);
    variables.add(s_vid_min_tof);
    variables.add(s_trans_ip3_tof_t_v2);
    variables.add(s_ach_cleared_count);
    variables.add(ebay_5d_amt_dk_360all);
    variables.add(s_ach_max_cleared_amt);
    variables.add(seconds_since_last_return);
    variables.add(s_amt_dk_20);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(outamt_to_avg_cleard);
    variables.add(Declined_asp_ccbin);
    variables.add(min_eaby_dof_360all);
    variables.add(CP4WRtDolBadTxn);
    variables.add(email_MP_7d_UPIamt_dk);
    variables.add(acct_txnsnt_tsnclst_dg);
    variables.add(num_spoof_url_30day);
    variables.add(n_bdrt_txn);
    variables.add(num_logins_3_days);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.322305;
    else if (0 < valueDouble && valueDouble <= 0.0025) woeValue = -0.581679;
    else if (0.0025 < valueDouble && valueDouble <= 0.0033) woeValue = -0.472273;
    else if (0.0033 < valueDouble && valueDouble <= 0.0071) woeValue = -0.162602;
    else if (0.0071 < valueDouble && valueDouble <= 0.0077) woeValue = -0.012975;
    else if (0.0077 < valueDouble && valueDouble <= 0.0247) woeValue = 0.537814;
    else if ( valueDouble > 0.0247) woeValue = 0.856403;
    else woeValue = 0;}else if(Declined_asp_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.324313;
    else if (-1e38 < valueDouble && valueDouble <= 7571.8514334) woeValue = 1.686743;
    else if (7571.8514334 < valueDouble && valueDouble <= 9017.988024) woeValue = 1.318669;
    else if (9017.988024 < valueDouble && valueDouble <= 12487.814545) woeValue = 1.020253;
    else if (12487.814545 < valueDouble && valueDouble <= 16648.876385) woeValue = 0.105313;
    else if (16648.876385 < valueDouble && valueDouble <= 22267.986128) woeValue = -0.226707;
    else if ( valueDouble > 22267.986128) woeValue = -1.049568;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.048147;
    else if ( valueDouble > 0) woeValue = 2.465700;
    else woeValue = 0;}else if(acct_txnsnt_tsnclst_dg.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.708730;
    else if (-1 < valueDouble && valueDouble <= 137843) woeValue = 1.110610;
    else if (137843 < valueDouble && valueDouble <= 237738) woeValue = 0.510761;
    else if (237738 < valueDouble && valueDouble <= 9615579) woeValue = 0.154851;
    else if (9615579 < valueDouble && valueDouble <= 10880395) woeValue = 0.071436;
    else if ( valueDouble > 10880395) woeValue = -0.102919;
    else woeValue = 0;}else if(ebay_5d_amt_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.375710;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.027057;
    else if (0 < valueDouble && valueDouble <= 2.0869117E-7) woeValue = 0.616325;
    else if (2.0869117E-7 < valueDouble && valueDouble <= 4.4109755E-6) woeValue = 0.532488;
    else if (4.4109755E-6 < valueDouble && valueDouble <= 0.0000422503) woeValue = 0.377670;
    else if (0.0000422503 < valueDouble && valueDouble <= 0.921618092) woeValue = 0.147428;
    else if (0.921618092 < valueDouble && valueDouble <= 3.4666427066) woeValue = -0.146920;
    else if (3.4666427066 < valueDouble && valueDouble <= 6.9811352505) woeValue = -0.353378;
    else if ( valueDouble > 6.9811352505) woeValue = -0.545575;
    else woeValue = 0;}else if(email_MP_7d_UPIamt_dk.getName().equals(varName)){if (value == null) woeValue = 0.526968;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.671887;
    else if (0 < valueDouble && valueDouble <= 1.1404262687) woeValue = 0.284830;
    else if ( valueDouble > 1.1404262687) woeValue = 0.077919;
    else woeValue = 0;}else if(min_eaby_dof_360all.getName().equals(varName)){if (value == null) woeValue = 0.375710;
    else if (-1e38 < valueDouble && valueDouble <= 286) woeValue = 0.581947;
    else if (286 < valueDouble && valueDouble <= 968) woeValue = 0.561297;
    else if (968 < valueDouble && valueDouble <= 1537) woeValue = 0.275590;
    else if (1537 < valueDouble && valueDouble <= 1660) woeValue = 0.116588;
    else if (1660 < valueDouble && valueDouble <= 1850) woeValue = -0.142620;
    else if (1850 < valueDouble && valueDouble <= 2311) woeValue = -0.207779;
    else if (2311 < valueDouble && valueDouble <= 3122) woeValue = -0.472756;
    else if (3122 < valueDouble && valueDouble <= 3405) woeValue = -0.987713;
    else if (3405 < valueDouble && valueDouble <= 4367) woeValue = -1.139943;
    else if ( valueDouble > 4367) woeValue = -1.740885;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.131469;
    else if (0 < valueDouble && valueDouble <= 0.00015) woeValue = -1.436295;
    else if (0.00015 < valueDouble && valueDouble <= 0.00052) woeValue = -1.140145;
    else if (0.00052 < valueDouble && valueDouble <= 0.00328) woeValue = -0.284187;
    else if (0.00328 < valueDouble && valueDouble <= 0.00772) woeValue = 0.447014;
    else if (0.00772 < valueDouble && valueDouble <= 0.00871) woeValue = 1.312737;
    else if ( valueDouble > 0.00871) woeValue = 1.344613;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.704626;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.346761;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = -0.290029;
    else if (4 < valueDouble && valueDouble <= 13) woeValue = 0.185544;
    else if (13 < valueDouble && valueDouble <= 24) woeValue = 1.432004;
    else if ( valueDouble > 24) woeValue = 1.826056;
    else woeValue = 0;}else if(num_logins_failed_14_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.199259;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.123718;
    else if ( valueDouble > 1) woeValue = 1.039088;
    else woeValue = 0;}else if(num_spoof_url_30day.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.018337;
    else if ( valueDouble > 0) woeValue = 1.764982;
    else woeValue = 0;}else if(outamt_to_avg_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1.8637548443) woeValue = -0.373082;
    else if (1.8637548443 < valueDouble && valueDouble <= 3.1514056468) woeValue = -0.355400;
    else if (3.1514056468 < valueDouble && valueDouble <= 6.7127300452) woeValue = -0.023616;
    else if (6.7127300452 < valueDouble && valueDouble <= 12.378368386) woeValue = 0.662121;
    else if (12.378368386 < valueDouble && valueDouble <= 16.130917166) woeValue = 1.604119;
    else if (16.130917166 < valueDouble && valueDouble <= 26.049909643) woeValue = 1.649173;
    else if ( valueDouble > 26.049909643) woeValue = 1.751869;
    else woeValue = 0;}else if(r_ratio_avg_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.154) woeValue = -0.605832;
    else if (0.154 < valueDouble && valueDouble <= 0.3773) woeValue = -0.387642;
    else if (0.3773 < valueDouble && valueDouble <= 0.5837) woeValue = -0.243534;
    else if (0.5837 < valueDouble && valueDouble <= 1.095) woeValue = -0.240605;
    else if ( valueDouble > 1.095) woeValue = 0.309089;
    else woeValue = 0;}else if(rcvr_cc_d_amt_dk_5.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.397430;
    else if (0 < valueDouble && valueDouble <= 271288.1842) woeValue = 0.397210;
    else if (271288.1842 < valueDouble && valueDouble <= 551248.5637) woeValue = -0.568080;
    else if ( valueDouble > 551248.5637) woeValue = -0.823574;
    else woeValue = 0;}else if(s_ach_cleared_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 30) woeValue = 0.243705;
    else if (30 < valueDouble && valueDouble <= 302) woeValue = 0.026678;
    else if (302 < valueDouble && valueDouble <= 475) woeValue = -0.197002;
    else if ( valueDouble > 475) woeValue = -1.737940;
    else woeValue = 0;}else if(s_ach_max_cleared_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 6637) woeValue = 0.940823;
    else if (6637 < valueDouble && valueDouble <= 16390) woeValue = 0.316066;
    else if (16390 < valueDouble && valueDouble <= 22083) woeValue = 0.103934;
    else if (22083 < valueDouble && valueDouble <= 63041) woeValue = -0.080053;
    else if (63041 < valueDouble && valueDouble <= 82930) woeValue = -0.225458;
    else if (82930 < valueDouble && valueDouble <= 90248) woeValue = -0.455805;
    else if ( valueDouble > 90248) woeValue = -0.748921;
    else woeValue = 0;}else if(s_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3902.8134) woeValue = -0.170926;
    else if (3902.8134 < valueDouble && valueDouble <= 9634.5338) woeValue = 0.089165;
    else if (9634.5338 < valueDouble && valueDouble <= 13802.7001) woeValue = 0.343316;
    else if (13802.7001 < valueDouble && valueDouble <= 24192.6562) woeValue = 1.033653;
    else if ( valueDouble > 24192.6562) woeValue = 1.940660;
    else woeValue = 0;}else if(s_trans_ip3_tof_t_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 54496799) woeValue = 0.050795;
    else if (54496799 < valueDouble && valueDouble <= 59706935) woeValue = -0.447244;
    else if ( valueDouble > 59706935) woeValue = -0.488472;
    else woeValue = 0;}else if(s_vid_min_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 11) woeValue = 0.352270;
    else if (11 < valueDouble && valueDouble <= 15) woeValue = 0.209761;
    else if (15 < valueDouble && valueDouble <= 256) woeValue = -0.238786;
    else if ( valueDouble > 256) woeValue = -0.498915;
    else woeValue = 0;}else if(seconds_since_last_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.661597;
    else if (-1 < valueDouble && valueDouble <= 7931635) woeValue = 0.391611;
    else if (7931635 < valueDouble && valueDouble <= 17312854) woeValue = 0.156761;
    else if ( valueDouble > 17312854) woeValue = -0.260650;
    else woeValue = 0;}else if(seen_same_bankid_30d_ago.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.357860;
    else if ( valueDouble > 0) woeValue = -0.104591;
    else woeValue = 0;}else if(snr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.136379;
    else if (-1e38 < valueDouble && valueDouble <= 0.0365580654) woeValue = 0.133677;
    else if (0.0365580654 < valueDouble && valueDouble <= 0.0668672433) woeValue = 0.566932;
    else if (0.0668672433 < valueDouble && valueDouble <= 2.7359725937) woeValue = 0.760666;
    else if ( valueDouble > 2.7359725937) woeValue = 2.364108;
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
    
    coeffMap.put("Intercept",+5.65602092);
    coeffMap.put(Declined_asp_ccbin.getName(),-0.43795282);
    coeffMap.put(s_amt_dk_20.getName(),-0.36594785);
    coeffMap.put(snr_ratio_4w_uaa_dol.getName(),-0.67194988);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.23688962);
    coeffMap.put(seen_same_bankid_30d_ago.getName(),-0.35774680);
    coeffMap.put(acct_txnsnt_tsnclst_dg.getName(),-0.18129307);
    coeffMap.put(min_eaby_dof_360all.getName(),-0.54957369);
    coeffMap.put(outamt_to_avg_cleard.getName(),-0.67025269);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.73167575);
    coeffMap.put(ebay_5d_amt_dk_360all.getName(),-0.44035384);
    coeffMap.put(seconds_since_last_return.getName(),-0.95420255);
    coeffMap.put(n_bdrt_txn.getName(),-0.50055743);
    coeffMap.put(email_MP_7d_UPIamt_dk.getName(),-0.52620726);
    coeffMap.put(num_logins_failed_14_days.getName(),-0.49159418);
    coeffMap.put(s_ach_max_cleared_amt.getName(),-0.89888520);
    coeffMap.put(s_trans_ip3_tof_t_v2.getName(),-0.38159652);
    coeffMap.put(s_ach_cleared_count.getName(),-0.94177942);
    coeffMap.put(num_logins_3_days.getName(),-0.43700424);
    coeffMap.put(r_ratio_avg_dk_160.getName(),-0.87830874);
    coeffMap.put(s_vid_min_tof.getName(),-0.14795013);
    coeffMap.put(rcvr_cc_d_amt_dk_5.getName(),-0.60687321);
    coeffMap.put(num_spoof_url_30day.getName(),-0.35639967);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 868.79651683;
  }

  @Override
  public double getCoeff2() {
    return  -62.89913201;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT11;
  }
  
}