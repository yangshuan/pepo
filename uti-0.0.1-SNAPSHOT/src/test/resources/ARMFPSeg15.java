package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMFPSeg15 extends ARMFPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(s_c_fso_match);
    variables.add(days_snc_last_achtxn);
    variables.add(SNR20WRtAtoBadTxn);
    variables.add(pst_hour_created);
    variables.add(s_vid_min_tof);
    variables.add(ach_d_since_latest);
    variables.add(ebay_UPI_AMT_180d_360all);
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(t_bank_dof);
    variables.add(v36_login_exces_10m);
    variables.add(nall_failed_ratio);
    variables.add(ncc_failed_amt_ratio);
    variables.add(n_bdrt_txn);
    variables.add(SNR1WRtDolDclTxn);
    variables.add(CP4WRtDolBadTxn);
    variables.add(seen_same_bankid_30d_ago);
    variables.add(ebay_dy_snc_sus_avg_360all);
    variables.add(IPR20WRtDolAtoBadTxn);
    variables.add(cc_pct_credit_v2);
    variables.add(s_mp_amt_dk_320);
    variables.add(v2_ip_conn_type_old);
    variables.add(wach_n_inactive);
    variables.add(Decline_rate_ccbin);
    variables.add(primarycc_dof);
    variables.add(txnsnt_amt_stss_max_lst_72_hrs);
    variables.add(cc_decline_5d_dk__cnt);
    variables.add(billing_shipping_mismatch);
    variables.add(prtlamt_to_max_sent_30);


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
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.307749;
    else if (0 < valueDouble && valueDouble <= 0.0006) woeValue = -1.468034;
    else if (0.0006 < valueDouble && valueDouble <= 0.0031) woeValue = -0.633524;
    else if (0.0031 < valueDouble && valueDouble <= 0.004) woeValue = -0.576778;
    else if (0.004 < valueDouble && valueDouble <= 0.0056) woeValue = -0.298983;
    else if (0.0056 < valueDouble && valueDouble <= 0.0066) woeValue = 0.183588;
    else if (0.0066 < valueDouble && valueDouble <= 0.0372) woeValue = 0.641668;
    else if ( valueDouble > 0.0372) woeValue = 1.413754;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0239326448) woeValue = -1.828379;
    else if (0.0239326448 < valueDouble && valueDouble <= 0.0418655098) woeValue = -1.549207;
    else if (0.0418655098 < valueDouble && valueDouble <= 0.0520957228) woeValue = -1.131348;
    else if (0.0520957228 < valueDouble && valueDouble <= 0.061051629) woeValue = -0.894603;
    else if (0.061051629 < valueDouble && valueDouble <= 0.1040252841) woeValue = -0.268702;
    else if (0.1040252841 < valueDouble && valueDouble <= 0.2074263764) woeValue = 0.430652;
    else if (0.2074263764 < valueDouble && valueDouble <= 0.2857142857) woeValue = 1.799729;
    else if ( valueDouble > 0.2857142857) woeValue = 2.532498;
    else woeValue = 0;}else if(IPR20WRtDolAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0019) woeValue = 0.926062;
    else if ( valueDouble > 0.0019) woeValue = -0.230775;
    else woeValue = 0;}else if(SNR1WRtDolDclTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.430682;
    else if ( valueDouble > 0) woeValue = 0.071356;
    else woeValue = 0;}else if(SNR20WRtAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.216159;
    else if ( valueDouble > 0) woeValue = 0.122950;
    else woeValue = 0;}else if(ach_d_since_latest.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 217) woeValue = -0.939518;
    else if ( valueDouble > 217) woeValue = 1.505176;
    else woeValue = 0;}else if(billing_shipping_mismatch.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.353186;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -1.703215;
    else if ( valueDouble > 1) woeValue = 0.519735;
    else woeValue = 0;}else if(cc_decline_5d_dk__cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.437952;
    else if (0 < valueDouble && valueDouble <= 9.724053E-28) woeValue = 0.928462;
    else if (9.724053E-28 < valueDouble && valueDouble <= 8.407943E-15) woeValue = 1.280149;
    else if (8.407943E-15 < valueDouble && valueDouble <= 0.2181965107) woeValue = 1.594867;
    else if ( valueDouble > 0.2181965107) woeValue = 2.572991;
    else woeValue = 0;}else if(cc_pct_credit_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.6666666667) woeValue = 1.863650;
    else if (0.6666666667 < valueDouble && valueDouble <= 0.9333333333) woeValue = 0.822215;
    else if ( valueDouble > 0.9333333333) woeValue = -0.684963;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2895396514) woeValue = -0.722238;
    else if (0.2895396514 < valueDouble && valueDouble <= 0.5517760698) woeValue = -0.475474;
    else if (0.5517760698 < valueDouble && valueDouble <= 2.5618819092) woeValue = 0.032962;
    else if (2.5618819092 < valueDouble && valueDouble <= 6.3708985968) woeValue = 0.737251;
    else if ( valueDouble > 6.3708985968) woeValue = 1.361510;
    else woeValue = 0;}else if(days_snc_last_achtxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.813170;
    else if (0 < valueDouble && valueDouble <= 285) woeValue = -0.622136;
    else if (285 < valueDouble && valueDouble <= 398) woeValue = -0.284899;
    else if ( valueDouble > 398) woeValue = 0.075792;
    else woeValue = 0;}else if(ebay_UPI_AMT_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.780456;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.532665;
    else if ( valueDouble > 0) woeValue = 1.191023;
    else woeValue = 0;}else if(ebay_dy_snc_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.014763;
    else if (-1e38 < valueDouble && valueDouble <= 763) woeValue = 1.526299;
    else if (763 < valueDouble && valueDouble <= 1975) woeValue = 0.929682;
    else if (1975 < valueDouble && valueDouble <= 3091.6) woeValue = -0.045277;
    else if ( valueDouble > 3091.6) woeValue = -4.000000;
    else woeValue = 0;}else if(n_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.00027) woeValue = -2.270211;
    else if (0.00027 < valueDouble && valueDouble <= 0.00444) woeValue = -0.806368;
    else if (0.00444 < valueDouble && valueDouble <= 0.00855) woeValue = -0.130716;
    else if ( valueDouble > 0.00855) woeValue = 1.472047;
    else woeValue = 0;}else if(nall_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.233499;
    else if (0 < valueDouble && valueDouble <= 0.0089285714) woeValue = -1.422914;
    else if (0.0089285714 < valueDouble && valueDouble <= 0.0208333333) woeValue = -0.925881;
    else if (0.0208333333 < valueDouble && valueDouble <= 0.0990990991) woeValue = -0.596235;
    else if (0.0990990991 < valueDouble && valueDouble <= 0.3272727273) woeValue = -0.210876;
    else if (0.3272727273 < valueDouble && valueDouble <= 7.75) woeValue = 1.160185;
    else if ( valueDouble > 7.75) woeValue = 2.118736;
    else woeValue = 0;}else if(ncc_failed_amt_ratio.getName().equals(varName)){if (value == null) woeValue = -0.471313;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.934749;
    else if (0 < valueDouble && valueDouble <= 0.0061266654) woeValue = -1.389012;
    else if (0.0061266654 < valueDouble && valueDouble <= 0.0301385579) woeValue = -0.782329;
    else if (0.0301385579 < valueDouble && valueDouble <= 0.0434555012) woeValue = -0.478452;
    else if (0.0434555012 < valueDouble && valueDouble <= 0.0593421854) woeValue = -0.259763;
    else if (0.0593421854 < valueDouble && valueDouble <= 0.1187903289) woeValue = -0.259763;
    else if (0.1187903289 < valueDouble && valueDouble <= 0.1624951378) woeValue = -0.090686;
    else if (0.1624951378 < valueDouble && valueDouble <= 0.2611279691) woeValue = -0.063287;
    else if (0.2611279691 < valueDouble && valueDouble <= 0.6720279296) woeValue = 1.076190;
    else if (0.6720279296 < valueDouble && valueDouble <= 0.992268787) woeValue = 1.766314;
    else if ( valueDouble > 0.992268787) woeValue = 3.492061;
    else woeValue = 0;}else if(primarycc_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 897) woeValue = 0.148003;
    else if (897 < valueDouble && valueDouble <= 1075) woeValue = -0.574891;
    else if (1075 < valueDouble && valueDouble <= 1245) woeValue = -1.289382;
    else if (1245 < valueDouble && valueDouble <= 2838) woeValue = -1.693238;
    else if ( valueDouble > 2838) woeValue = -2.171631;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0393475071) woeValue = -0.964048;
    else if (0.0393475071 < valueDouble && valueDouble <= 0.2398) woeValue = -0.584496;
    else if (0.2398 < valueDouble && valueDouble <= 0.899979996) woeValue = 0.009425;
    else if (0.899979996 < valueDouble && valueDouble <= 7.3311489734) woeValue = 0.234652;
    else if ( valueDouble > 7.3311489734) woeValue = 1.244522;
    else woeValue = 0;}else if(pst_hour_created.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 20) woeValue = -0.048367;
    else if (20 < valueDouble && valueDouble <= 22) woeValue = 0.574788;
    else if ( valueDouble > 22) woeValue = -0.754459;
    else woeValue = 0;}else if(s_c_fso_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.013467;
    else if ( valueDouble > 0) woeValue = 1.216144;
    else woeValue = 0;}else if(s_mp_amt_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.333048;
    else if (0 < valueDouble && valueDouble <= 1.7512) woeValue = -0.035114;
    else if (1.7512 < valueDouble && valueDouble <= 11.9089) woeValue = -0.280095;
    else if (11.9089 < valueDouble && valueDouble <= 5772.4067) woeValue = -0.954935;
    else if ( valueDouble > 5772.4067) woeValue = -1.137427;
    else woeValue = 0;}else if(s_vid_min_tof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 293) woeValue = -0.083960;
    else if ( valueDouble > 293) woeValue = 0.356145;
    else woeValue = 0;}else if(seen_same_bankid_30d_ago.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.169848;
    else if ( valueDouble > 0) woeValue = -0.551456;
    else woeValue = 0;}else if(t_bank_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 1869) woeValue = 0.107813;
    else if ( valueDouble > 1869) woeValue = -1.488834;
    else woeValue = 0;}else if(txnsnt_amt_stss_max_lst_72_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.187652;
    else if (-1 < valueDouble && valueDouble <= 1.61) woeValue = 0.132457;
    else if (1.61 < valueDouble && valueDouble <= 26.38) woeValue = 1.122721;
    else if ( valueDouble > 26.38) woeValue = 2.424790;
    else woeValue = 0;}else if(v36_login_exces_10m.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.852914;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.662674;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.337724;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = 0.131760;
    else if ( valueDouble > 4) woeValue = 2.484033;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.179782;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.889061;
    else if ( valueDouble > 1) woeValue = 1.877252;
    else woeValue = 0;}else if(v2_ip_conn_type_old.getName().equals(varName)){if (Arrays.asList( "AOL","SAT","DIALUP").contains(value)) woeValue = -1.399566;
    else if (Arrays.asList( "PUBLIC","EDU","GOV","UNKNOWN","ISP","CORP","BROADBAND"," ").contains(value)) woeValue = 0.003769;
    else if (Arrays.asList( "PRIV","WIRELESS").contains(value)) woeValue = 0.454325;
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
    
    coeffMap.put("Intercept",+3.71397201);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.33088035);
    coeffMap.put(ncc_failed_amt_ratio.getName(),-0.22508559);
    coeffMap.put(wach_n_inactive.getName(),-0.61869096);
    coeffMap.put(ach_d_since_latest.getName(),-0.81353343);
    coeffMap.put(t_bank_dof.getName(),-0.70235389);
    coeffMap.put(cc_pct_credit_v2.getName(),-0.26352659);
    coeffMap.put(cc_decline_5d_dk__cnt.getName(),-0.44829949);
    coeffMap.put(nall_failed_ratio.getName(),-0.32148970);
    coeffMap.put(v36_login_exces_10m.getName(),-0.40677281);
    coeffMap.put(seen_same_bankid_30d_ago.getName(),-0.47932185);
    coeffMap.put(primarycc_dof.getName(),-0.26601134);
    coeffMap.put(n_bdrt_txn.getName(),-0.48029810);
    coeffMap.put(ebay_UPI_AMT_180d_360all.getName(),-0.25359856);
    coeffMap.put(txnsnt_amt_stss_max_lst_72_hrs.getName(),-0.25763525);
    coeffMap.put(IPR20WRtDolAtoBadTxn.getName(),-0.74133937);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.45682910);
    coeffMap.put(days_snc_last_achtxn.getName(),-0.55274905);
    coeffMap.put(s_mp_amt_dk_320.getName(),-0.46679796);
    coeffMap.put(billing_shipping_mismatch.getName(),-0.36699092);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-0.82587026);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.92418971);
    coeffMap.put(ebay_dy_snc_sus_avg_360all.getName(),-1.07918073);
    coeffMap.put(pst_hour_created.getName(),-0.77135340);
    coeffMap.put(SNR1WRtDolDclTxn.getName(),-1.39816402);
    coeffMap.put(v2_ip_conn_type_old.getName(),-1.11094530);
    coeffMap.put(SNR20WRtAtoBadTxn.getName(),-1.38079079);
    coeffMap.put(s_c_fso_match.getName(),-0.68611017);
    coeffMap.put(s_vid_min_tof.getName(),-1.68901140);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 843.38669608;
  }

  @Override
  public double getCoeff2() {
    return  -57.14509517;
  }

  @Override
  public ARMFPSegmentType getSegmentType() {
    return ARMFPSegmentType.ARMFP_SEGMENT15;
  }
  
}