package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg5 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(primaryach_country);
    variables.add(cc_num_failed_verification);
    variables.add(yodlee_iav_bal);
    variables.add(cp_ratio_1w_appr_dol);
    variables.add(IS_SCHEDULED_PAYMENT);
    variables.add(v3_debug_last_fso_time_diff);
    variables.add(email_MP_ASP_1Y);
    variables.add(wach_n_authorized);
    variables.add(ip_d_sic_max_nb_fst_dt);
    variables.add(acct_h_s_cnt_dk_80);
    variables.add(ip_ratio_max_dk_80);
    variables.add(is_yodlee_verified);
    variables.add(n_bdrt_Veri_txn);
    variables.add(primarycc_dof);
    variables.add(num_logins_30_days);
    variables.add(s_amt_dk_5);
    variables.add(outamt_to_max_cleard);
    variables.add(Decline_rate_amt_ccbin);
    variables.add(v3_transaction_ars_category);
    variables.add(max_cross20wRtAtoCcBadAcc);


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

    if(Decline_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = -0.140201;
    else if (-1e38 < valueDouble && valueDouble <= 0.0367495642) woeValue = -1.024614;
    else if (0.0367495642 < valueDouble && valueDouble <= 0.0581752111) woeValue = -0.687432;
    else if (0.0581752111 < valueDouble && valueDouble <= 0.1159991276) woeValue = -0.415823;
    else if (0.1159991276 < valueDouble && valueDouble <= 0.1539792771) woeValue = 0.071925;
    else if ( valueDouble > 0.1539792771) woeValue = 1.108855;
    else woeValue = 0;}else if(IS_SCHEDULED_PAYMENT.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.094840;
    else if ( valueDouble > 0) woeValue = 2.011358;
    else woeValue = 0;}else if(acct_h_s_cnt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.154858;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.687887;
    else if (0 < valueDouble && valueDouble <= 0.0061) woeValue = 1.209859;
    else if ( valueDouble > 0.0061) woeValue = 1.794905;
    else woeValue = 0;}else if(cc_num_failed_verification.getName().equals(varName)){if (value == null) woeValue = -0.080170;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -0.145212;
    else if ( valueDouble > 2) woeValue = 0.936533;
    else woeValue = 0;}else if(cp_ratio_1w_appr_dol.getName().equals(varName)){if (value == null) woeValue = -0.913176;
    else if (-1e38 < valueDouble && valueDouble <= 0.2137027953) woeValue = -0.583399;
    else if (0.2137027953 < valueDouble && valueDouble <= 2.0815221536) woeValue = -0.194357;
    else if (2.0815221536 < valueDouble && valueDouble <= 4.2509680165) woeValue = 0.734720;
    else if ( valueDouble > 4.2509680165) woeValue = 1.299593;
    else woeValue = 0;}else if(email_MP_ASP_1Y.getName().equals(varName)){if (value == null) woeValue = 0.173556;
    else if (-1e38 < valueDouble && valueDouble <= 7.4893) woeValue = 0.677742;
    else if (7.4893 < valueDouble && valueDouble <= 13.6078) woeValue = 0.159955;
    else if (13.6078 < valueDouble && valueDouble <= 35.6365) woeValue = -0.309947;
    else if (35.6365 < valueDouble && valueDouble <= 374.124) woeValue = -0.591429;
    else if ( valueDouble > 374.124) woeValue = -0.696792;
    else woeValue = 0;}else if(ip_d_sic_max_nb_fst_dt.getName().equals(varName)){if (value == null) woeValue = -0.040615;
    else if (-1e38 < valueDouble && valueDouble <= -5) woeValue = 2.077291;
    else if (-5 < valueDouble && valueDouble <= 2) woeValue = 0.767015;
    else if (2 < valueDouble && valueDouble <= 4) woeValue = 0.538151;
    else if (4 < valueDouble && valueDouble <= 328) woeValue = -0.234273;
    else if ( valueDouble > 328) woeValue = -0.653474;
    else woeValue = 0;}else if(ip_ratio_max_dk_80.getName().equals(varName)){if (value == null) woeValue = 1.032165;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = -0.230129;
    else if (-2 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0.0107) woeValue = -0.682332;
    else if (0.0107 < valueDouble && valueDouble <= 0.9998) woeValue = -0.174582;
    else if (0.9998 < valueDouble && valueDouble <= 18.7441) woeValue = 0.070472;
    else if ( valueDouble > 18.7441) woeValue = 0.888690;
    else woeValue = 0;}else if(is_yodlee_verified.getName().equals(varName)){if (value == null) woeValue = -1.293388;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.016944;
    else if ( valueDouble > 0) woeValue = 0.599830;
    else woeValue = 0;}else if(max_cross20wRtAtoCcBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0008) woeValue = -1.093142;
    else if (0.0008 < valueDouble && valueDouble <= 0.0009) woeValue = -0.872008;
    else if (0.0009 < valueDouble && valueDouble <= 0.0011) woeValue = -0.630264;
    else if (0.0011 < valueDouble && valueDouble <= 0.0026) woeValue = -0.356742;
    else if (0.0026 < valueDouble && valueDouble <= 0.0238) woeValue = 0.652875;
    else if ( valueDouble > 0.0238) woeValue = 1.593871;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.582582;
    else if (0 < valueDouble && valueDouble <= 0.00042) woeValue = -1.283787;
    else if (0.00042 < valueDouble && valueDouble <= 0.00066) woeValue = -0.205026;
    else if (0.00066 < valueDouble && valueDouble <= 0.00095) woeValue = 0.046047;
    else if (0.00095 < valueDouble && valueDouble <= 0.00875) woeValue = 0.532750;
    else if ( valueDouble > 0.00875) woeValue = 1.862727;
    else woeValue = 0;}else if(num_logins_30_days.getName().equals(varName)){if (value == null) woeValue = -0.080170;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.880807;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.746895;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.624542;
    else if (2 < valueDouble && valueDouble <= 5) woeValue = -0.318806;
    else if (5 < valueDouble && valueDouble <= 10) woeValue = -0.040728;
    else if (10 < valueDouble && valueDouble <= 17) woeValue = 0.334231;
    else if (17 < valueDouble && valueDouble <= 26) woeValue = 0.600235;
    else if ( valueDouble > 26) woeValue = 0.878193;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0168800931) woeValue = -0.419808;
    else if (0.0168800931 < valueDouble && valueDouble <= 0.3161586001) woeValue = -0.234097;
    else if (0.3161586001 < valueDouble && valueDouble <= 0.7077639752) woeValue = -0.052340;
    else if (0.7077639752 < valueDouble && valueDouble <= 2.9475504323) woeValue = 0.251376;
    else if ( valueDouble > 2.9475504323) woeValue = 1.334792;
    else woeValue = 0;}else if(primaryach_country.getName().equals(varName)){if (Arrays.asList( "MX").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "AU").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "CA").contains(value)) woeValue = -1.026814;
    else if (Arrays.asList( "DE").contains(value)) woeValue = -0.826776;
    else if (Arrays.asList( "","GB").contains(value)) woeValue = -0.316025;
    else if (Arrays.asList( "US").contains(value)) woeValue = 0.029038;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 0.611011;
    else if (Arrays.asList( "NL").contains(value)) woeValue = 1.426491;
    else if (Arrays.asList( "ES").contains(value)) woeValue = 2.247863;
    else woeValue = 0;}else if(primarycc_dof.getName().equals(varName)){if (value == null) woeValue = -0.080170;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.059370;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.450643;
    else if (0 < valueDouble && valueDouble <= 81) woeValue = 0.577861;
    else if (81 < valueDouble && valueDouble <= 1066) woeValue = 0.039497;
    else if (1066 < valueDouble && valueDouble <= 1584) woeValue = -0.443412;
    else if (1584 < valueDouble && valueDouble <= 2693) woeValue = -0.797042;
    else if ( valueDouble > 2693) woeValue = -1.180660;
    else woeValue = 0;}else if(s_amt_dk_5.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.053795;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.237798;
    else if (0 < valueDouble && valueDouble <= 3.4171) woeValue = -0.235323;
    else if (3.4171 < valueDouble && valueDouble <= 69.0356) woeValue = -0.005597;
    else if (69.0356 < valueDouble && valueDouble <= 13368.5145) woeValue = 0.351899;
    else if ( valueDouble > 13368.5145) woeValue = 1.397320;
    else woeValue = 0;}else if(v3_debug_last_fso_time_diff.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 320) woeValue = -0.471935;
    else if ( valueDouble > 320) woeValue = 0.295215;
    else woeValue = 0;}else if(v3_transaction_ars_category.getName().equals(varName)){if (Arrays.asList( "ME_adult only").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_agriculture equipment","ME_animals collectibles","ME_antiques","ME_art","ME_breweriana, beer & barware","ME_camping, hiking","ME_children's wear","ME_clocks collectibles","ME_cycling","ME_dance","ME_diving","ME_equestrian","ME_exercise & fitness","ME_fishing","ME_flowers","ME_food & drink","ME_home appliances","ME_hunting").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_industrial supply & mro").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_luggage","ME_medical & lab equipment","ME_metaphysical","ME_mobility & disability","ME_nutrition","ME_office","ME_optometry","ME_parties, occasions","ME_printing & graphic arts equipm","ME_printing & personalization","ME_restaurant equipment","ME_retail & services equipment","ME_safety & security","ME_sailing","ME_shipping equipment","ME_soccer, football & rugby","ME_software","ME_stamps","ME_telephones","ME_therapies","ME_travel","ME_uniforms","ME_wedding","TI_adults","TI_baby","TI_coins","TI_get-rich","TI_music-instruments","TI_variety","_MISSING_","ME_motorcycles","ME_cards","TI_arts-n-craft","ME_pottery & glass").contains(value)) woeValue = -2.632934;
    else if (Arrays.asList( "TI_pet-supplies","TI_nutritional-supp","ME_shoes","TI_music-videos","ME_toys","ME_sport").contains(value)) woeValue = -1.286175;
    else if (Arrays.asList( "ME_pet supplies").contains(value)) woeValue = -1.216521;
    else if (Arrays.asList( "ME_arts & crafts","TI_health","ME_music","ME_cameras","TI_cameras","ME_books","ME_game consoles & accessories","ME_vehicle parts","ME_collectibles","ME_home & garden","TI_sports-equip","ME_models & kits","TI_computer-hardware","ME_golf","ME_clothing","ME_computers","ME_consumer electronics","ME_baby","ME_watches","ME_other","TI_travel","ME_costumes","TI_electronics","TI_food-n-drink","TI_houseware","ME_furniture","ME_film & tv","ME_diy & construction").contains(value)) woeValue = -0.844565;
    else if (Arrays.asList( "TI_auto-parts","ME_pharmacy","TI_fashion","TI_cosmetics","TI_jewelry","TI_non-profit").contains(value)) woeValue = -0.506650;
    else if (Arrays.asList( "ME_scanners, printers & supplies","TI_garden-equip").contains(value)) woeValue = -0.423867;
    else if (Arrays.asList( "ME_cell phones & pdas","ME_nondistinct").contains(value)) woeValue = -0.402234;
    else if (Arrays.asList( "ME_networking","ME_unknown","TI_books"," ","ME_womenswear","ME_coins","ME_menswear","TI_cellphones","ME_tickets","ME_video games","TI_education","ME_jewellery","TI_website-services","TI_photography","ME_accessories","NO_DATA","TI_toys","TI_tickets","ME_cars","TI_performers","TI_furniture","TI_office-supplies").contains(value)) woeValue = -0.064305;
    else if (Arrays.asList( "TI_memorabilia").contains(value)) woeValue = 0.284626;
    else if (Arrays.asList( "TI_software").contains(value)) woeValue = 0.323924;
    else if (Arrays.asList( "TI_offline-services","ME_electrical & test equipment","ME_tattoos & body art","TI_telecom","TI_airlines").contains(value)) woeValue = 0.407684;
    else if (Arrays.asList( "TI_gaming").contains(value)) woeValue = 0.803287;
    else if (Arrays.asList( "TI_dg","ME_kitchen","TI_online-services","ME_beauty","TI_hosting","ME_boats","ME_memorabilia").contains(value)) woeValue = 1.312517;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = -0.080170;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.718053;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.484783;
    else if ( valueDouble > 1) woeValue = -0.236553;
    else woeValue = 0;}else if(yodlee_iav_bal.getName().equals(varName)){if (value == null) woeValue = -0.002214;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 67248) woeValue = 1.128458;
    else if ( valueDouble > 67248) woeValue = -0.451002;
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
    
    coeffMap.put("Intercept",+7.20651594);
    coeffMap.put(wach_n_authorized.getName(),-1.4641719);
    coeffMap.put(num_logins_30_days.getName(),-0.34549818);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.34016662);
    coeffMap.put(max_cross20wRtAtoCcBadAcc.getName(),-0.5369069);
    coeffMap.put(Decline_rate_amt_ccbin.getName(),-0.42159519);
    coeffMap.put(acct_h_s_cnt_dk_80.getName(),-0.91011125);
    coeffMap.put(cp_ratio_1w_appr_dol.getName(),-0.7004408);
    coeffMap.put(is_yodlee_verified.getName(),-0.72718713);
    coeffMap.put(IS_SCHEDULED_PAYMENT.getName(),-0.7630547);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.45988921);
    coeffMap.put(s_amt_dk_5.getName(),-0.97270953);
    coeffMap.put(v3_debug_last_fso_time_diff.getName(),-0.63742758);
    coeffMap.put(email_MP_ASP_1Y.getName(),-0.61045354);
    coeffMap.put(yodlee_iav_bal.getName(),-0.69556804);
    coeffMap.put(primarycc_dof.getName(),-0.81911764);
    coeffMap.put(cc_num_failed_verification.getName(),-0.73886831);
    coeffMap.put(ip_ratio_max_dk_80.getName(),-1.23538189);
    coeffMap.put(ip_d_sic_max_nb_fst_dt.getName(),-0.6351684);
    coeffMap.put(v3_transaction_ars_category.getName(),-0.47185053);
    coeffMap.put(primaryach_country.getName(),-1.08781385);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 833.15445079;
  }

  @Override
  public double getCoeff2() {
    return  -57.42690525;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT5;
  }
  
}