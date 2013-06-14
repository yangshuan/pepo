package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg4 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(num_logins_14_days);
    variables.add(email_MP_days_snc_sus_acct);
    variables.add(yodlee_iav_bal);
    variables.add(sum_failed_bufs_30d);
    variables.add(is_local);
    variables.add(s_pmts_rcvd_amt);
    variables.add(vid_ratio_20w_allbad_dol);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(Bad_rate_ccbin);
    variables.add(s_amt_dk_160);
    variables.add(s_ach_failed_total_amt);
    variables.add(n_ach_out_avg);
    variables.add(v36_login_exces_1h);
    variables.add(s_ach_faild_2nd_amt);
    variables.add(s_ach_failed_ratio_new);
    variables.add(last_name_lowcase);
    variables.add(snr_zscr_4w_appr_pertxn);
    variables.add(ebay_dy_1yr_sus_avg_360all);
    variables.add(email_MP_UPI_AMT_180d);
    variables.add(return_lt_14d_cnt);
    variables.add(s_ach_clrd_snc_last_return);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(max_txn_amt_ccbin);
    variables.add(a_bdrt_Veri_txn);
    variables.add(billing_country);
    variables.add(s_cctrans_denied_count);
    variables.add(ebay_7d_UPIamt_dk_360all);
    variables.add(v3_transaction_ars_category);
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

    if(Bad_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.199100;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0001738526) woeValue = -0.448076;
    else if (0.0001738526 < valueDouble && valueDouble <= 0.0005255082) woeValue = -0.406132;
    else if ( valueDouble > 0.0005255082) woeValue = 0.253703;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.078331;
    else if ( valueDouble > 0) woeValue = 1.706266;
    else woeValue = 0;}else if(a_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.118246;
    else if (0 < valueDouble && valueDouble <= 0.00047) woeValue = -1.160382;
    else if (0.00047 < valueDouble && valueDouble <= 0.00161) woeValue = -0.497619;
    else if (0.00161 < valueDouble && valueDouble <= 0.01467) woeValue = 0.468970;
    else if ( valueDouble > 0.01467) woeValue = 1.865452;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.893558;
    else if (0 < valueDouble && valueDouble <= 512) woeValue = 0.986495;
    else if (512 < valueDouble && valueDouble <= 1980) woeValue = -0.077931;
    else if (1980 < valueDouble && valueDouble <= 29294) woeValue = -0.906104;
    else if ( valueDouble > 29294) woeValue = -1.935255;
    else woeValue = 0;}else if(billing_country.getName().equals(varName)){if (Arrays.asList( "BR","GF","GP").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "HK","IL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MQ").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MX").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "RE").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ZA","AU").contains(value)) woeValue = -3.437272;
    else if (Arrays.asList( "CA","GB").contains(value)) woeValue = -1.084659;
    else if (Arrays.asList( "DE","US").contains(value)) woeValue = -0.687510;
    else if (Arrays.asList(" ").contains(value)) woeValue = 0.164370;
    else if (Arrays.asList( "NL").contains(value)) woeValue = 1.212005;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 1.778959;
    else if (Arrays.asList( "ES").contains(value)) woeValue = 2.764738;
    else woeValue = 0;}else if(ebay_7d_UPIamt_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.847969;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.626952;
    else if (0 < valueDouble && valueDouble <= 7.007082E-29) woeValue = 0.873281;
    else if ( valueDouble > 7.007082E-29) woeValue = 0.238968;
    else woeValue = 0;}else if(ebay_dy_1yr_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.096478;
    else if ( valueDouble > -1e38) woeValue = 1.212769;
    else woeValue = 0;}else if(email_MP_UPI_AMT_180d.getName().equals(varName)){if (value == null) woeValue = 0.383213;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.657977;
    else if (0 < valueDouble && valueDouble <= 14.99) woeValue = 1.016391;
    else if (14.99 < valueDouble && valueDouble <= 533.0517) woeValue = 0.019460;
    else if ( valueDouble > 533.0517) woeValue = -0.245888;
    else woeValue = 0;}else if(email_MP_days_snc_sus_acct.getName().equals(varName)){if (value == null) woeValue = -0.060739;
    else if (-1e38 < valueDouble && valueDouble <= 139) woeValue = 3.200095;
    else if (139 < valueDouble && valueDouble <= 234) woeValue = 1.048890;
    else if ( valueDouble > 234) woeValue = -2.893192;
    else woeValue = 0;}else if(is_local.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.830247;
    else if ( valueDouble > 0) woeValue = -1.134695;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = -0.665913;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.113242;
    else if ( valueDouble > 0) woeValue = 1.102423;
    else woeValue = 0;}else if(max_txn_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.179035;
    else if (-1e38 < valueDouble && valueDouble <= 147817) woeValue = 0.472818;
    else if (147817 < valueDouble && valueDouble <= 311328) woeValue = 0.436430;
    else if (311328 < valueDouble && valueDouble <= 487796) woeValue = 0.226491;
    else if (487796 < valueDouble && valueDouble <= 1816349) woeValue = -0.872991;
    else if (1816349 < valueDouble && valueDouble <= 2906514) woeValue = -2.116304;
    else if ( valueDouble > 2906514) woeValue = -3.506570;
    else woeValue = 0;}else if(n_ach_out_avg.getName().equals(varName)){if (value == null) woeValue = 2.023818;
    else if (-1e38 < valueDouble && valueDouble <= 161.86666667) woeValue = -0.886657;
    else if (161.86666667 < valueDouble && valueDouble <= 611.5) woeValue = -0.726467;
    else if (611.5 < valueDouble && valueDouble <= 752.5) woeValue = -0.304698;
    else if (752.5 < valueDouble && valueDouble <= 3744.5) woeValue = -0.029792;
    else if ( valueDouble > 3744.5) woeValue = 0.177670;
    else woeValue = 0;}else if(num_logins_14_days.getName().equals(varName)){if (value == null) woeValue = -0.665913;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.835335;
    else if (0 < valueDouble && valueDouble <= 24) woeValue = -0.178448;
    else if (24 < valueDouble && valueDouble <= 30) woeValue = 0.318644;
    else if (30 < valueDouble && valueDouble <= 51) woeValue = 0.531264;
    else if ( valueDouble > 51) woeValue = 0.610915;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 7) woeValue = -0.677571;
    else if (7 < valueDouble && valueDouble <= 11) woeValue = 0.169081;
    else if (11 < valueDouble && valueDouble <= 15) woeValue = 2.214734;
    else if ( valueDouble > 15) woeValue = 2.808126;
    else woeValue = 0;}else if(return_lt_14d_cnt.getName().equals(varName)){if (value == null) woeValue = -0.665913;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.056829;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.304254;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.060933;
    else if ( valueDouble > 2) woeValue = 1.196575;
    else woeValue = 0;}else if(s_ach_clrd_snc_last_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.603016;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 1.382575;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.395827;
    else if (2 < valueDouble && valueDouble <= 5) woeValue = -0.236773;
    else if (5 < valueDouble && valueDouble <= 10) woeValue = -0.390382;
    else if ( valueDouble > 10) woeValue = -1.305890;
    else woeValue = 0;}else if(s_ach_faild_2nd_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -3772) woeValue = 1.455149;
    else if (-3772 < valueDouble && valueDouble <= 0) woeValue = -0.109587;
    else if ( valueDouble > 0) woeValue = 0.837033;
    else woeValue = 0;}else if(s_ach_failed_ratio_new.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.815817;
    else if (0 < valueDouble && valueDouble <= 0.0007501875) woeValue = -4.000000;
    else if (0.0007501875 < valueDouble && valueDouble <= 0.0302752294) woeValue = -1.223785;
    else if (0.0302752294 < valueDouble && valueDouble <= 0.0432900433) woeValue = -0.854978;
    else if (0.0432900433 < valueDouble && valueDouble <= 0.1845238095) woeValue = -0.453613;
    else if (0.1845238095 < valueDouble && valueDouble <= 0.1944444444) woeValue = -0.026810;
    else if (0.1944444444 < valueDouble && valueDouble <= 0.2371134021) woeValue = 0.320920;
    else if (0.2371134021 < valueDouble && valueDouble <= 0.3125) woeValue = 0.590848;
    else if (0.3125 < valueDouble && valueDouble <= 0.435483871) woeValue = 1.018865;
    else if (0.435483871 < valueDouble && valueDouble <= 0.5168539326) woeValue = 1.632531;
    else if ( valueDouble > 0.5168539326) woeValue = 1.888874;
    else woeValue = 0;}else if(s_ach_failed_total_amt.getName().equals(varName)){if (value == null) woeValue = -1.802572;
    else if (-1e38 < valueDouble && valueDouble <= 312937) woeValue = 0.074418;
    else if (312937 < valueDouble && valueDouble <= 503743) woeValue = -0.782600;
    else if ( valueDouble > 503743) woeValue = -0.943096;
    else woeValue = 0;}else if(s_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = -0.851573;
    else if (-1e38 < valueDouble && valueDouble <= 34696.7887) woeValue = -0.096803;
    else if (34696.7887 < valueDouble && valueDouble <= 52318.1212) woeValue = -0.031519;
    else if (52318.1212 < valueDouble && valueDouble <= 115622.4601) woeValue = 0.781466;
    else if ( valueDouble > 115622.4601) woeValue = 1.126098;
    else woeValue = 0;}else if(s_cctrans_denied_count.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.061024;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.911320;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.786302;
    else if (2 < valueDouble && valueDouble <= 6) woeValue = -0.657651;
    else if (6 < valueDouble && valueDouble <= 21) woeValue = -0.021764;
    else if (21 < valueDouble && valueDouble <= 60) woeValue = 0.355207;
    else if ( valueDouble > 60) woeValue = 1.163509;
    else woeValue = 0;}else if(s_pmts_rcvd_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.177560;
    else if (0 < valueDouble && valueDouble <= 388096) woeValue = 0.129602;
    else if ( valueDouble > 388096) woeValue = -0.964798;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0079599438) woeValue = -1.439477;
    else if (0.0079599438 < valueDouble && valueDouble <= 0.1696707608) woeValue = -0.679018;
    else if (0.1696707608 < valueDouble && valueDouble <= 2.1219575209) woeValue = -0.116814;
    else if (2.1219575209 < valueDouble && valueDouble <= 4.2715252513) woeValue = 0.110476;
    else if (4.2715252513 < valueDouble && valueDouble <= 15.260026253) woeValue = 0.306106;
    else if ( valueDouble > 15.260026253) woeValue = 1.044301;
    else woeValue = 0;}else if(snr_zscr_4w_appr_pertxn.getName().equals(varName)){if (value == null) woeValue = 0.622083;
    else if (-1e38 < valueDouble && valueDouble <= 1.2684989429) woeValue = -0.260818;
    else if (1.2684989429 < valueDouble && valueDouble <= 1.5577324554) woeValue = -0.135268;
    else if (1.5577324554 < valueDouble && valueDouble <= 2.0921180668) woeValue = -0.017049;
    else if (2.0921180668 < valueDouble && valueDouble <= 6.9983444777) woeValue = 0.130718;
    else if ( valueDouble > 6.9983444777) woeValue = 0.685007;
    else woeValue = 0;}else if(sum_failed_bufs_30d.getName().equals(varName)){if (value == null) woeValue = 0.107578;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.429087;
    else if (0 < valueDouble && valueDouble <= 464) woeValue = 2.165985;
    else if (464 < valueDouble && valueDouble <= 33633) woeValue = -0.198249;
    else if ( valueDouble > 33633) woeValue = -3.883951;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.212908;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.224514;
    else if (1 < valueDouble && valueDouble <= 3) woeValue = -0.100114;
    else if ( valueDouble > 3) woeValue = 0.891577;
    else woeValue = 0;}else if(v3_transaction_ars_category.getName().equals(varName)){if (Arrays.asList( "ME_agriculture equipment","ME_badges/ patches","ME_breweriana, beer & barware","ME_camping, hiking","ME_children's wear","ME_dance").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_diving","ME_flowers","ME_home appliances","ME_hunting","ME_kitchen","ME_pottery & glass","ME_printing & graphic arts equipm","ME_retail & services equipment","ME_safety & security","ME_sailing","ME_shipping equipment","ME_soccer, football & rugby","ME_tickets","ME_travel","ME_uniforms","TI_adults","_MISSING_","ME_food & drink").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_books","TI_nutritional-supp","TI_baby","ME_memorabilia","ME_furniture","ME_golf","ME_fishing","TI_performers","TI_music-instruments","ME_adult only","TI_photography","ME_cards","ME_antiques","ME_cycling","ME_music","ME_motorcycles","ME_parties, occasions","ME_models & kits","TI_get-rich","TI_office-supplies","ME_industrial supply & mro","ME_cars","ME_pharmacy","TI_airlines","ME_watches","TI_arts-n-craft","ME_optometry","ME_telephones","TI_garden-equip","ME_costumes","TI_jewelry","ME_exercise & fitness","ME_luggage","ME_restaurant equipment","TI_telecom","ME_cameras","ME_menswear","ME_arts & crafts","ME_mobility & disability","ME_medical & lab equipment","ME_vouchers, coupons, gcs","TI_books","TI_tickets","TI_health","ME_film & tv","TI_non-profit","ME_therapies","ME_nutrition","TI_sports-equip","ME_metaphysical").contains(value)) woeValue = -1.723652;
    else if (Arrays.asList( "ME_womenswear").contains(value)) woeValue = -1.024701;
    else if (Arrays.asList( "ME_toys","ME_electrical & test equipment","ME_coins","ME_clothing","ME_baby","TI_houseware","TI_travel","ME_computers","ME_wedding","TI_toys","ME_cell phones & pdas","TI_memorabilia","ME_vehicle parts","ME_home & garden","ME_printing & personalization","ME_consumer electronics").contains(value)) woeValue = -0.441577;
    else if (Arrays.asList( "","ME_animals collectibles","TI_auto-parts","ME_beauty","TI_offline-services").contains(value)) woeValue = -0.187438;
    else if (Arrays.asList( "TI_music-videos","TI_fashion","TI_gaming").contains(value)) woeValue = 0.026192;
    else if (Arrays.asList( "NO_DATA","ME_unknown","ME_nondistinct","ME_collectibles","TI_computer-hardware","TI_cameras","TI_cellphones","TI_pet-supplies","TI_dg","ME_video games","ME_diy & construction","ME_sport","ME_accessories","TI_electronics","TI_website-services","ME_networking","ME_other","ME_jewellery","TI_food-n-drink","ME_game consoles & accessories","TI_cosmetics","ME_shoes","ME_software","ME_scanners, printers & supplies").contains(value)) woeValue = 0.107350;
    else if (Arrays.asList( "TI_online-services","TI_hosting","ME_office","ME_stamps","ME_pet supplies","TI_variety").contains(value)) woeValue = 1.149612;
    else if (Arrays.asList( "TI_software","TI_education","TI_coins","TI_furniture","ME_boats","ME_art","ME_tattoos & body art","ME_equestrian").contains(value)) woeValue = 1.615140;
    else woeValue = 0;}else if(vid_ratio_20w_allbad_dol.getName().equals(varName)){if (value == null) woeValue = -0.395281;
    else if (-1e38 < valueDouble && valueDouble <= 0.0282368032) woeValue = -1.553783;
    else if (0.0282368032 < valueDouble && valueDouble <= 0.0867698514) woeValue = -0.401882;
    else if (0.0867698514 < valueDouble && valueDouble <= 0.174970636) woeValue = -0.046434;
    else if (0.174970636 < valueDouble && valueDouble <= 1.5212896028) woeValue = 0.107584;
    else if (1.5212896028 < valueDouble && valueDouble <= 3.8622718643) woeValue = 0.388647;
    else if ( valueDouble > 3.8622718643) woeValue = 0.628989;
    else woeValue = 0;}else if(yodlee_iav_bal.getName().equals(varName)){if (value == null) woeValue = 0.175625;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.257662;
    else if (0 < valueDouble && valueDouble <= 59) woeValue = -2.876242;
    else if ( valueDouble > 59) woeValue = -0.743161;
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
    
    coeffMap.put("Intercept",+5.77890867);
    coeffMap.put(p90_dys_return.getName(),-0.28394996);
    coeffMap.put(a_bdrt_Veri_txn.getName(),-0.44860171);
    coeffMap.put(is_local.getName(),-0.2868797);
    coeffMap.put(s_ach_failed_ratio_new.getName(),-0.22329631);
    coeffMap.put(s_ach_clrd_snc_last_return.getName(),-0.5641645);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-0.55606807);
    coeffMap.put(max_txn_amt_ccbin.getName(),-0.42933993);
    coeffMap.put(ebay_7d_UPIamt_dk_360all.getName(),-0.38030127);
    coeffMap.put(email_MP_UPI_AMT_180d.getName(),-0.44408606);
    coeffMap.put(s_cctrans_denied_count.getName(),-0.37127279);
    coeffMap.put(sum_failed_bufs_30d.getName(),-1.04003937);
    coeffMap.put(yodlee_iav_bal.getName(),-0.51705377);
    coeffMap.put(email_MP_days_snc_sus_acct.getName(),-0.44803138);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-1.16127881);
    coeffMap.put(last_name_lowcase.getName(),-0.45833103);
    coeffMap.put(snr_zscr_4w_appr_pertxn.getName(),-0.64931031);
    coeffMap.put(s_pmts_rcvd_amt.getName(),-0.81263552);
    coeffMap.put(n_ach_out_avg.getName(),-0.52442341);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.38088083);
    coeffMap.put(return_lt_14d_cnt.getName(),-0.82659086);
    coeffMap.put(num_logins_14_days.getName(),-0.4390518);
    coeffMap.put(v36_login_exces_1h.getName(),-0.77399095);
    coeffMap.put(ebay_dy_1yr_sus_avg_360all.getName(),-0.58316915);
    coeffMap.put(s_ach_failed_total_amt.getName(),-1.08093068);
    coeffMap.put(s_amt_dk_160.getName(),-0.93413469);
    coeffMap.put(vid_ratio_20w_allbad_dol.getName(),-0.63456003);
    coeffMap.put(Bad_rate_ccbin.getName(),-0.75903839);
    coeffMap.put(s_ach_faild_2nd_amt.getName(),-1.28475303);
    coeffMap.put(billing_country.getName(),-0.29555634);
    coeffMap.put(v3_transaction_ars_category.getName(),-0.57177256);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 816.09607926;
  }

  @Override
  public double getCoeff2() {
    return  -49.79538175;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT4;
  }
  
}