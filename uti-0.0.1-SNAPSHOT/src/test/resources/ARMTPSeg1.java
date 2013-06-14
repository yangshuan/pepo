package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg1 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(email_MP_days_sus_1yr_acct);
    variables.add(num_BUFS_30d);
    variables.add(p90_dys_return);
    variables.add(rt_r8r16_hr);
    variables.add(a_bdrt_txn);
    variables.add(v3_ip_ad_dist_best);
    variables.add(acct_cc_d_cnt_dk_160);
    variables.add(v3_debug_browser_lang);
    variables.add(ach_outstd_age);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(snr_delta_20w_appr_pertxn_c);
    variables.add(n_rt_dcl_14dys);
    variables.add(days_snc_1st_clrd_ach);
    variables.add(CP4WRtCcBadTxn);
    variables.add(pst_hour_created);
    variables.add(prtlamt_to_avg_faild);
    variables.add(v3_debug_last_bcn_time_diff);
    variables.add(IP4WRtDolBadTxn);
    variables.add(v3_transaction_ars_category);
    variables.add(life_time_failure_cnt);
    variables.add(email_numofvowel);
    variables.add(v31_ip_hopping_strict);
    variables.add(ebay_5d_txn_dk_360all);
    variables.add(billing_country);
    variables.add(ratio_max);


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

    if(CP4WRtCcBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.128711;
    else if (0 < valueDouble && valueDouble <= 0.001) woeValue = -0.392792;
    else if (0.001 < valueDouble && valueDouble <= 0.0013) woeValue = 0.390953;
    else if ( valueDouble > 0.0013) woeValue = 0.759639;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.583378;
    else if (0 < valueDouble && valueDouble <= 0.0052) woeValue = -2.025591;
    else if (0.0052 < valueDouble && valueDouble <= 0.0055) woeValue = -0.258864;
    else if (0.0055 < valueDouble && valueDouble <= 0.122) woeValue = 0.516271;
    else if (0.122 < valueDouble && valueDouble <= 0.5152) woeValue = 0.562378;
    else if ( valueDouble > 0.5152) woeValue = 0.832899;
    else woeValue = 0;}else if(a_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.173457;
    else if (0 < valueDouble && valueDouble <= 0.00004) woeValue = -3.517379;
    else if (0.00004 < valueDouble && valueDouble <= 0.00013) woeValue = -2.771563;
    else if (0.00013 < valueDouble && valueDouble <= 0.0067) woeValue = -0.727282;
    else if (0.0067 < valueDouble && valueDouble <= 0.01434) woeValue = 0.111232;
    else if (0.01434 < valueDouble && valueDouble <= 0.12157) woeValue = 1.296357;
    else if ( valueDouble > 0.12157) woeValue = 2.342307;
    else woeValue = 0;}else if(acct_cc_d_cnt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.2282) woeValue = -0.909581;
    else if ( valueDouble > 0.2282) woeValue = 0.532317;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.732264;
    else if (0 < valueDouble && valueDouble <= 760) woeValue = -0.245929;
    else if (760 < valueDouble && valueDouble <= 1598) woeValue = -0.802203;
    else if (1598 < valueDouble && valueDouble <= 5742) woeValue = -1.114709;
    else if (5742 < valueDouble && valueDouble <= 54874) woeValue = -2.207164;
    else if ( valueDouble > 54874) woeValue = -4.000000;
    else woeValue = 0;}else if(ach_outstd_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.3474729242) woeValue = -0.642609;
    else if (0.3474729242 < valueDouble && valueDouble <= 0.4510108865) woeValue = -0.441370;
    else if (0.4510108865 < valueDouble && valueDouble <= 3.4581911263) woeValue = -0.423327;
    else if (3.4581911263 < valueDouble && valueDouble <= 41.685714286) woeValue = -0.099356;
    else if (41.685714286 < valueDouble && valueDouble <= 426.2244898) woeValue = 0.543362;
    else if (426.2244898 < valueDouble && valueDouble <= 791.11290323) woeValue = 0.647948;
    else if ( valueDouble > 791.11290323) woeValue = 1.094325;
    else woeValue = 0;}else if(billing_country.getName().equals(varName)){if (Arrays.asList( "GP").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "IL").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "MX").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "RE").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ZA").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "GB","CA").contains(value)) woeValue = -1.895098;
    else if (Arrays.asList( "DE","NL","US").contains(value)) woeValue = -0.384853;
    else if (Arrays.asList( "AU").contains(value)) woeValue = -0.304920;
    else if (Arrays.asList(" ").contains(value)) woeValue = 0.789251;
    else if (Arrays.asList( "FR").contains(value)) woeValue = 2.120173;
    else if (Arrays.asList( "ES").contains(value)) woeValue = 2.280810;
    else woeValue = 0;}else if(days_snc_1st_clrd_ach.getName().equals(varName)){if (value == null) woeValue = 1.174528;
    else if (-1e38 < valueDouble && valueDouble <= 30) woeValue = -1.115552;
    else if (30 < valueDouble && valueDouble <= 147) woeValue = -0.971354;
    else if ( valueDouble > 147) woeValue = 0.329753;
    else woeValue = 0;}else if(ebay_5d_txn_dk_360all.getName().equals(varName)){if (value == null) woeValue = 0.448246;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.257355;
    else if (0 < valueDouble && valueDouble <= 5.809283E-23) woeValue = 2.825680;
    else if (5.809283E-23 < valueDouble && valueDouble <= 0.0497870684) woeValue = -0.108043;
    else if (0.0497870684 < valueDouble && valueDouble <= 2.5151973322) woeValue = -0.526178;
    else if (2.5151973322 < valueDouble && valueDouble <= 4.7577093619) woeValue = -1.594039;
    else if (4.7577093619 < valueDouble && valueDouble <= 16.009295669) woeValue = -1.708545;
    else if ( valueDouble > 16.009295669) woeValue = -2.824231;
    else woeValue = 0;}else if(email_MP_days_sus_1yr_acct.getName().equals(varName)){if (value == null) woeValue = 0.197099;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.606393;
    else if ( valueDouble > 0) woeValue = 2.066256;
    else woeValue = 0;}else if(email_numofvowel.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = -0.358281;
    else if ( valueDouble > 4) woeValue = 0.567838;
    else woeValue = 0;}else if(life_time_failure_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.265416;
    else if (0 < valueDouble && valueDouble <= 0.0003713331) woeValue = -2.644916;
    else if (0.0003713331 < valueDouble && valueDouble <= 0.0004807692) woeValue = -1.888974;
    else if (0.0004807692 < valueDouble && valueDouble <= 0.0005334756) woeValue = -1.101035;
    else if (0.0005334756 < valueDouble && valueDouble <= 0.0018109381) woeValue = -0.737472;
    else if (0.0018109381 < valueDouble && valueDouble <= 0.0020048115) woeValue = -0.677053;
    else if (0.0020048115 < valueDouble && valueDouble <= 0.002221235) woeValue = -0.586020;
    else if (0.002221235 < valueDouble && valueDouble <= 0.0029736619) woeValue = -0.412331;
    else if (0.0029736619 < valueDouble && valueDouble <= 0.0032679739) woeValue = -0.011961;
    else if ( valueDouble > 0.0032679739) woeValue = 0.405307;
    else woeValue = 0;}else if(n_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.080479;
    else if (0 < valueDouble && valueDouble <= 0.05) woeValue = -1.286665;
    else if (0.05 < valueDouble && valueDouble <= 0.058296) woeValue = -0.875143;
    else if (0.058296 < valueDouble && valueDouble <= 0.102941) woeValue = -0.383839;
    else if (0.102941 < valueDouble && valueDouble <= 0.201681) woeValue = 0.074481;
    else if (0.201681 < valueDouble && valueDouble <= 0.666667) woeValue = 1.291227;
    else if ( valueDouble > 0.666667) woeValue = 2.371751;
    else woeValue = 0;}else if(num_BUFS_30d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.163484;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = -2.415863;
    else if ( valueDouble > 2) woeValue = -0.072185;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 10) woeValue = -0.323207;
    else if (10 < valueDouble && valueDouble <= 13) woeValue = 1.046747;
    else if (13 < valueDouble && valueDouble <= 14) woeValue = 1.818479;
    else if ( valueDouble > 14) woeValue = 2.342451;
    else woeValue = 0;}else if(prtlamt_to_avg_faild.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1663765934) woeValue = -0.766997;
    else if (0.1663765934 < valueDouble && valueDouble <= 0.2304987915) woeValue = -0.366462;
    else if (0.2304987915 < valueDouble && valueDouble <= 0.2542119926) woeValue = -0.220432;
    else if (0.2542119926 < valueDouble && valueDouble <= 0.6257070751) woeValue = -0.039589;
    else if (0.6257070751 < valueDouble && valueDouble <= 1.4588334386) woeValue = 0.007124;
    else if ( valueDouble > 1.4588334386) woeValue = 0.313936;
    else woeValue = 0;}else if(pst_hour_created.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 1) woeValue = 0.820477;
    else if (1 < valueDouble && valueDouble <= 11) woeValue = 0.235681;
    else if (11 < valueDouble && valueDouble <= 22) woeValue = -0.610767;
    else if ( valueDouble > 22) woeValue = -0.227247;
    else woeValue = 0;}else if(ratio_max.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.308550;
    else if (-1 < valueDouble && valueDouble <= 0.0017667845) woeValue = -1.774783;
    else if (0.0017667845 < valueDouble && valueDouble <= 0.0081362278) woeValue = -0.925892;
    else if (0.0081362278 < valueDouble && valueDouble <= 0.0115759221) woeValue = -0.602185;
    else if ( valueDouble > 0.0115759221) woeValue = 0.208529;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.128743;
    else if (0 < valueDouble && valueDouble <= 0.015) woeValue = 2.395592;
    else if (0.015 < valueDouble && valueDouble <= 0.348) woeValue = -0.698277;
    else if ( valueDouble > 0.348) woeValue = -3.035404;
    else woeValue = 0;}else if(snr_delta_20w_appr_pertxn_c.getName().equals(varName)){if (Arrays.asList(" ").contains(value)) woeValue = -0.466384;
    else if (Arrays.asList( "s1","s0","s2").contains(value)) woeValue = -0.182406;
    else if (Arrays.asList("sm").contains(value)) woeValue = 0.688695;
    else if (Arrays.asList("s3").contains(value)) woeValue = 0.727841;
    else woeValue = 0;}else if(v31_ip_hopping_strict.getName().equals(varName)){if (Arrays.asList( "CITY_HOPPING_GT2","STATE_HOPPING_2","STATE_HOPPING_EXCESSIVE","NO_HOPPING").contains(value)) woeValue = -0.212138;
    else if (Arrays.asList( "IP_HOP_1").contains(value)) woeValue = -0.162060;
    else if (Arrays.asList(" ").contains(value)) woeValue = 0.039404;
    else if (Arrays.asList( "CTRY_HOPPING_EXCESSIVE","CITY_HOPPING_2","STATE_HOPPING_GT2","IP_HOPPING_2","CTRY_HOPPING_2").contains(value)) woeValue = 1.113715;
    else if (Arrays.asList( "IP_HOPPING_GT2","CTRY_HOPPING_GT2").contains(value)) woeValue = 3.517719;
    else woeValue = 0;}else if(v3_debug_browser_lang.getName().equals(varName)){if (Arrays.asList( "bg-BG,bg;q=0.8","de,de-DE;q=0.9,en;q=0.8").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "de-DE, en-US","de-DE,de;q=0.8,en-US;q=0.6,en;q=0.4,en-GB;q=0.2").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "de-de,de;q=0.5","en,nl;q=0.8,en-US;q=0.6","en-AU","en-AU, en-US","en-CA","en-CA, en-US","en-GB, en-US","en-GB,en;q=0.5","en-GB,en;q=0.9","en-US,en","en-US,en;q=0.8,en-GB;q=0.6","en-US,en;q=0.8,fr-CA;q=0.6,fr;q=0.4","en-US,en;q=0.8,fr-CA;q=0.6,fr;q=0.4,en-CA;q=0.2","en-US,en;q=0.8,nl;q=0.6","en-au","en-au,de;q=0.8,de-de;q=0.5,en-us;q=0.3","en-ca","en-us,en","en-us,en;q=0.500","en-us,en;q=0.7,nl;q=0.3","en_US, en;q=0.8","es,ca;q=0.8","es,gl;q=0.8","es-MX","es-es,en;q=0.8,es;q=0.5,en-us;q=0.3","es-es,en;q=0.9,de;q=0.8,fr;q=0.6,ca;q=0.5,it;q=0.4","et,et-ee;q=0.8,en-us;q=0.5,en;q=0.3","fr-CA","fr-ca","gd,en-gb;q=0.7,en;q=0.3","hu-hu,hu;q=0.8,en-us;q=0.5,en;q=0.3","ko-KR","ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4","lt,en-us;q=0.8,en;q=0.6,ru;q=0.4,pl;q=0.2","nl,en-US;q=0.8,en;q=0.6","nl-NL,nl;q=0.8,en-US;q=0.6,en;q=0.4","nl-nl","pl","pl,en-us;q=0.7,en;q=0.3","pl-PL","pt-PT","ro-RO,ro;q=0.8,en-US;q=0.6,en;q=0.4","ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4","ru-ru,ru;q=0.8,en-us;q=0.5,en;q=0.3","th-TH,en-GB;q=0.5","tr","zh-CN","zh-CN,zh;q=0.8","zh-TW,zh;q=0.8,en-US;q=0.6,en;q=0.4","zh-cn,zh;q=0.5","de-de","en-GB,en-US;q=0.8,en;q=0.6","en-GB").contains(value)) woeValue = -2.859446;
    else if (Arrays.asList("en-gb").contains(value)) woeValue = -2.425197;
    else if (Arrays.asList( "de","en-gb,en;q=0.5","de-de,de;q=0.8,en-us;q=0.5,en;q=0.3","de-DE,de;q=0.9,en;q=0.8","fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3","de-DE,de;q=0.8,en-US;q=0.6,en;q=0.4","en-US","fr","en-us","fr-FR","en-US,en;q=0.9","fr-fr","empty").contains(value)) woeValue = -0.089071;
    else if (Arrays.asList( "","en","nl-NL","en-us,en;q=0.5","es,en;q=0.8","de-DE","en-US,en;q=0.8","es-ES, en-US").contains(value)) woeValue = 0.522766;
    else if (Arrays.asList( "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4","es-ES,es;q=0.8","es-es","nl","nl,en-us;q=0.7,en;q=0.3","es","es-ES","es-es,es;q=0.8,en-us;q=0.5,en;q=0.3","ca,en-us;q=0.7,en;q=0.3","es,es-ES;q=0.5","ar-iq","ca","en-US,*","en-US,en;q=0.8,es-419;q=0.6,es;q=0.4").contains(value)) woeValue = 2.614985;
    else woeValue = 0;}else if(v3_debug_last_bcn_time_diff.getName().equals(varName)){if (value == null) woeValue = -0.286480;
    else if (-1e38 < valueDouble && valueDouble <= 6) woeValue = 1.366082;
    else if (6 < valueDouble && valueDouble <= 152343) woeValue = 0.128630;
    else if (152343 < valueDouble && valueDouble <= 27646381) woeValue = 0.103959;
    else if (27646381 < valueDouble && valueDouble <= 37528858) woeValue = -0.572637;
    else if (37528858 < valueDouble && valueDouble <= 42790417) woeValue = -0.861438;
    else if ( valueDouble > 42790417) woeValue = -1.711123;
    else woeValue = 0;}else if(v3_ip_ad_dist_best.getName().equals(varName)){if (Arrays.asList( "_MISSING_","LOW_DIST","EXACT_DIST","CLOSE_DIST","MED_DIST","ULT_DIST").contains(value)) woeValue = -0.301779;
    else if (Arrays.asList( "","HIGH_DIST").contains(value)) woeValue = 0.142698;
    else if (Arrays.asList( "MM_ERROR").contains(value)) woeValue = 1.567826;
    else woeValue = 0;}else if(v3_transaction_ars_category.getName().equals(varName)){if (Arrays.asList( "ME_adult only").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_agriculture equipment").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_animals collectibles").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_cars").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_children's wear").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_costumes").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_diving","ME_electrical & test equipment","ME_equestrian").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_exercise & fitness","ME_flowers","ME_food & drink","ME_golf","ME_hunting","ME_luggage","ME_medical & lab equipment","ME_mobility & disability","ME_optometry","ME_printing & graphic arts equipm","ME_printing & personalization","ME_restaurant equipment","ME_retail & services equipment","ME_stamps","ME_telephones","ME_therapies","ME_tickets","ME_travel","TI_adults","TI_baby","TI_furniture","TI_nutritional-supp","TI_photography","TI_tickets","TI_non-profit","ME_coins","TI_houseware","TI_jewelry","ME_pottery & glass","TI_garden-equip","TI_arts-n-craft").contains(value)) woeValue = -3.833484;
    else if (Arrays.asList( "TI_memorabilia","TI_education","ME_menswear","ME_shipping equipment","TI_performers","ME_industrial supply & mro","ME_film & tv","TI_variety","ME_accessories","ME_models & kits","TI_health","ME_parties, occasions","ME_arts & crafts","ME_other","ME_pharmacy","ME_art","TI_books","ME_nondistinct","ME_home appliances","ME_antiques","ME_networking","TI_music-instruments","ME_scanners, printers & supplies","ME_pet supplies","TI_gaming","TI_telecom","ME_toys","ME_game consoles & accessories","ME_home & garden","TI_cosmetics","ME_books","TI_website-services","ME_jewellery","ME_wedding","ME_collectibles","TI_get-rich","TI_office-supplies","ME_soccer, football & rugby","ME_watches","ME_womenswear","ME_tattoos & body art","TI_fashion","ME_nutrition","ME_cell phones & pdas","ME_software","ME_clothing","ME_motorcycles","ME_metaphysical","TI_offline-services","ME_shoes","TI_cellphones","ME_memorabilia","TI_coins","ME_music").contains(value)) woeValue = -1.218061;
    else if (Arrays.asList( "NO_DATA","TI_computer-hardware","ME_consumer electronics","ME_computers","ME_beauty","TI_music-videos"," ","ME_unknown","TI_hosting","TI_travel","ME_cameras","TI_dg","TI_airlines","ME_vehicle parts","ME_sport","TI_electronics","ME_diy & construction","ME_kitchen","ME_baby").contains(value)) woeValue = 0.048695;
    else if (Arrays.asList( "TI_sports-equip").contains(value)) woeValue = 1.087651;
    else if (Arrays.asList( "TI_toys","TI_food-n-drink","ME_cards","TI_auto-parts","ME_video games").contains(value)) woeValue = 1.267595;
    else if (Arrays.asList( "TI_software","TI_pet-supplies","ME_cycling","ME_office","ME_furniture","TI_cameras").contains(value)) woeValue = 1.790840;
    else if (Arrays.asList( "TI_online-services","ME_fishing","ME_camping, hiking","ME_vouchers, coupons, gcs").contains(value)) woeValue = 2.708094;
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
    
    coeffMap.put("Intercept",+4.64471496);
    coeffMap.put(ebay_5d_txn_dk_360all.getName(),-0.53962684);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-0.34358912);
    coeffMap.put(days_snc_1st_clrd_ach.getName(),-0.6829199);
    coeffMap.put(n_rt_dcl_14dys.getName(),-0.11584317);
    coeffMap.put(a_bdrt_txn.getName(),-0.76505023);
    coeffMap.put(p90_dys_return.getName(),-0.08321435);
    coeffMap.put(email_MP_days_sus_1yr_acct.getName(),-0.58016261);
    coeffMap.put(rt_r8r16_hr.getName(),-0.66760344);
    coeffMap.put(life_time_failure_cnt.getName(),-0.84269885);
    coeffMap.put(num_BUFS_30d.getName(),-0.7560089);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.48705043);
    coeffMap.put(pst_hour_created.getName(),-0.89346982);
    coeffMap.put(email_numofvowel.getName(),-0.51059008);
    coeffMap.put(ach_outstd_age.getName(),-0.90067513);
    coeffMap.put(acct_cc_d_cnt_dk_160.getName(),-1.04528253);
    coeffMap.put(CP4WRtCcBadTxn.getName(),-1.10632953);
    coeffMap.put(ratio_max.getName(),-0.76849413);
    coeffMap.put(v3_debug_last_bcn_time_diff.getName(),-0.9357346);
    coeffMap.put(prtlamt_to_avg_faild.getName(),-0.78604725);
    coeffMap.put(billing_country.getName(),-0.42262921);
    coeffMap.put(v3_transaction_ars_category.getName(),-0.70844191);
    coeffMap.put(v31_ip_hopping_strict.getName(),-0.47561329);
    coeffMap.put(v3_ip_ad_dist_best.getName(),-0.65178285);
    coeffMap.put(v3_debug_browser_lang.getName(),-0.32334663);
    coeffMap.put(snr_delta_20w_appr_pertxn_c.getName(),-0.82816159);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 849.26499208;
  }

  @Override
  public double getCoeff2() {
    return  -60.65647853;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT1;
  }
  
}