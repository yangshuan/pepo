package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg3 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(max_IPR20wRtAtoCcBadTxn);
    variables.add(IP4WRtCcXbrBadTxn);
    variables.add(Decline_rate_amt_ccbin);
    variables.add(p90_dys_return);
    variables.add(Bad_rate_ccbin);
    variables.add(ach_dof_age);
    variables.add(v36_login_exces_1h);
    variables.add(max_CP4wRtAtoCcBadTxn);
    variables.add(cc_decline_30d_dk__cnt);
    variables.add(s_v_tx_ratio_dollar);
    variables.add(v35_sent_amt_usd_in_last_1d);
    variables.add(num_logins_30_days);
    variables.add(added_ach_lt_30);
    variables.add(ncc_failed_ratio);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(days_snc_1st_clrd_ach);
    variables.add(nach_last_return_age);
    variables.add(v3_transaction_ars_category);
    variables.add(vid_ratio_4w_ato_dol);
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(s2r_txnsnt_cnt_stss_lst_48_hrs);
    variables.add(cc_pct_passed_verification);
    variables.add(a_bdrt_Veri_txn);
    variables.add(s_visitor_id_tof);
    variables.add(ip_max_dk_10);
    variables.add(email_username_match);
    variables.add(v36_diff_vid_3d);
    variables.add(email_MP_d_snc_conf);
    variables.add(ED20WRtCcBadAcc);
    variables.add(s_outstd_iach_amt_orig);


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

    if(Bad_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.339619;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0003015636) woeValue = -1.010474;
    else if (0.0003015636 < valueDouble && valueDouble <= 0.0007877168) woeValue = -0.308024;
    else if (0.0007877168 < valueDouble && valueDouble <= 0.0016401226) woeValue = 0.046695;
    else if (0.0016401226 < valueDouble && valueDouble <= 0.0019847447) woeValue = 0.302207;
    else if (0.0019847447 < valueDouble && valueDouble <= 0.0024936412) woeValue = 0.549213;
    else if ( valueDouble > 0.0024936412) woeValue = 0.987461;
    else woeValue = 0;}else if(Decline_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.336503;
    else if (-1e38 < valueDouble && valueDouble <= 0.0367126734) woeValue = -1.047117;
    else if (0.0367126734 < valueDouble && valueDouble <= 0.0716169606) woeValue = -0.887999;
    else if (0.0716169606 < valueDouble && valueDouble <= 0.1167700989) woeValue = -0.535668;
    else if (0.1167700989 < valueDouble && valueDouble <= 0.1204579979) woeValue = -0.453834;
    else if (0.1204579979 < valueDouble && valueDouble <= 0.1599011259) woeValue = -0.148109;
    else if (0.1599011259 < valueDouble && valueDouble <= 0.1903420026) woeValue = 0.390959;
    else if (0.1903420026 < valueDouble && valueDouble <= 0.2277096416) woeValue = 0.695257;
    else if (0.2277096416 < valueDouble && valueDouble <= 0.4060590585) woeValue = 1.283359;
    else if ( valueDouble > 0.4060590585) woeValue = 1.585313;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = -0.219778;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.484002;
    else if (0 < valueDouble && valueDouble <= 0.0004) woeValue = -1.196730;
    else if (0.0004 < valueDouble && valueDouble <= 0.0012) woeValue = -0.206497;
    else if ( valueDouble > 0.0012) woeValue = 0.457349;
    else woeValue = 0;}else if(IP4WRtCcXbrBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.219778;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.190812;
    else if (0 < valueDouble && valueDouble <= 0.0013) woeValue = -0.011039;
    else if (0.0013 < valueDouble && valueDouble <= 0.0016) woeValue = 0.148574;
    else if ( valueDouble > 0.0016) woeValue = 1.704158;
    else woeValue = 0;}else if(a_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.750531;
    else if (0 < valueDouble && valueDouble <= 0.00006) woeValue = -1.382776;
    else if (0.00006 < valueDouble && valueDouble <= 0.00016) woeValue = -0.756970;
    else if (0.00016 < valueDouble && valueDouble <= 0.00124) woeValue = -0.274613;
    else if (0.00124 < valueDouble && valueDouble <= 0.00501) woeValue = 0.516461;
    else if (0.00501 < valueDouble && valueDouble <= 0.01294) woeValue = 0.645377;
    else if (0.01294 < valueDouble && valueDouble <= 0.01593) woeValue = 1.272994;
    else if ( valueDouble > 0.01593) woeValue = 1.467794;
    else woeValue = 0;}else if(ach_dof_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 1.459182;
    else if (-1 < valueDouble && valueDouble <= 0.0900594732) woeValue = -0.685901;
    else if (0.0900594732 < valueDouble && valueDouble <= 0.2429906542) woeValue = -0.526795;
    else if (0.2429906542 < valueDouble && valueDouble <= 0.2988505747) woeValue = -0.419808;
    else if (0.2988505747 < valueDouble && valueDouble <= 0.5912162162) woeValue = 0.039858;
    else if (0.5912162162 < valueDouble && valueDouble <= 0.8895705521) woeValue = 0.045859;
    else if ( valueDouble > 0.8895705521) woeValue = 0.046134;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.045562;
    else if (0 < valueDouble && valueDouble <= 1547) woeValue = 0.023097;
    else if (1547 < valueDouble && valueDouble <= 5348) woeValue = -0.588165;
    else if ( valueDouble > 5348) woeValue = -0.953052;
    else woeValue = 0;}else if(added_ach_lt_30.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.087758;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.022727;
    else if ( valueDouble > 1) woeValue = 2.451080;
    else woeValue = 0;}else if(cc_decline_30d_dk__cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.115417;
    else if (0 < valueDouble && valueDouble <= 0.0000126217) woeValue = -1.774378;
    else if (0.0000126217 < valueDouble && valueDouble <= 0.0053642969) woeValue = -1.066843;
    else if (0.0053642969 < valueDouble && valueDouble <= 0.1965638295) woeValue = -0.062940;
    else if (0.1965638295 < valueDouble && valueDouble <= 0.8357008475) woeValue = 0.547761;
    else if (0.8357008475 < valueDouble && valueDouble <= 2.062262476) woeValue = 0.738822;
    else if ( valueDouble > 2.062262476) woeValue = 1.725561;
    else woeValue = 0;}else if(cc_pct_passed_verification.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.348915;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.065420;
    else if (0 < valueDouble && valueDouble <= 0.1818181818) woeValue = 1.256479;
    else if (0.1818181818 < valueDouble && valueDouble <= 0.3636363636) woeValue = 0.160821;
    else if (0.3636363636 < valueDouble && valueDouble <= 0.5) woeValue = -0.108012;
    else if (0.5 < valueDouble && valueDouble <= 0.6) woeValue = -0.420953;
    else if (0.6 < valueDouble && valueDouble <= 0.9285714286) woeValue = -0.646079;
    else if ( valueDouble > 0.9285714286) woeValue = -0.545978;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = -0.217088;
    else if (-1e38 < valueDouble && valueDouble <= 0.6675260534) woeValue = -0.289853;
    else if (0.6675260534 < valueDouble && valueDouble <= 0.7464794922) woeValue = -0.214473;
    else if (0.7464794922 < valueDouble && valueDouble <= 0.9152392804) woeValue = -0.106901;
    else if (0.9152392804 < valueDouble && valueDouble <= 1.8109433962) woeValue = 0.062547;
    else if (1.8109433962 < valueDouble && valueDouble <= 3.3708744891) woeValue = 0.477662;
    else if (3.3708744891 < valueDouble && valueDouble <= 4.9525774308) woeValue = 0.814009;
    else if ( valueDouble > 4.9525774308) woeValue = 1.486689;
    else woeValue = 0;}else if(days_snc_1st_clrd_ach.getName().equals(varName)){if (value == null) woeValue = 2.106774;
    else if (-1e38 < valueDouble && valueDouble <= 129) woeValue = -0.386145;
    else if (129 < valueDouble && valueDouble <= 285) woeValue = 0.098391;
    else if ( valueDouble > 285) woeValue = 1.205020;
    else woeValue = 0;}else if(email_MP_d_snc_conf.getName().equals(varName)){if (value == null) woeValue = 0.446015;
    else if (-1e38 < valueDouble && valueDouble <= 18) woeValue = 1.214777;
    else if (18 < valueDouble && valueDouble <= 60) woeValue = 0.376602;
    else if (60 < valueDouble && valueDouble <= 189) woeValue = -0.178785;
    else if (189 < valueDouble && valueDouble <= 222) woeValue = -0.379913;
    else if (222 < valueDouble && valueDouble <= 2321) woeValue = -0.615965;
    else if (2321 < valueDouble && valueDouble <= 2849) woeValue = -0.995844;
    else if ( valueDouble > 2849) woeValue = -1.836628;
    else woeValue = 0;}else if(email_username_match.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.267693;
    else if ( valueDouble > 0) woeValue = -0.391460;
    else woeValue = 0;}else if(ip_max_dk_10.getName().equals(varName)){if (value == null) woeValue = 0.459550;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.005391;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = -0.463140;
    else if (0 < valueDouble && valueDouble <= 0.3258) woeValue = -0.446758;
    else if (0.3258 < valueDouble && valueDouble <= 12.7132) woeValue = -0.435434;
    else if (12.7132 < valueDouble && valueDouble <= 189.7139) woeValue = -0.204621;
    else if (189.7139 < valueDouble && valueDouble <= 645.6983) woeValue = -0.171306;
    else if (645.6983 < valueDouble && valueDouble <= 997.9723) woeValue = -0.004929;
    else if (997.9723 < valueDouble && valueDouble <= 7561.0117) woeValue = 0.421489;
    else if ( valueDouble > 7561.0117) woeValue = 0.793257;
    else woeValue = 0;}else if(max_CP4wRtAtoCcBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.219778;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.352046;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -0.550107;
    else if (0.0002 < valueDouble && valueDouble <= 0.0003) woeValue = -0.436962;
    else if (0.0003 < valueDouble && valueDouble <= 0.0012) woeValue = -0.115493;
    else if (0.0012 < valueDouble && valueDouble <= 0.0016) woeValue = 0.298573;
    else if (0.0016 < valueDouble && valueDouble <= 0.0031) woeValue = 0.597554;
    else if ( valueDouble > 0.0031) woeValue = 1.393695;
    else woeValue = 0;}else if(max_IPR20wRtAtoCcBadTxn.getName().equals(varName)){if (value == null) woeValue = -0.219778;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.091467;
    else if (0 < valueDouble && valueDouble <= 0.0007) woeValue = -0.939771;
    else if (0.0007 < valueDouble && valueDouble <= 0.0009) woeValue = -0.758411;
    else if (0.0009 < valueDouble && valueDouble <= 0.0139) woeValue = -0.199847;
    else if ( valueDouble > 0.0139) woeValue = 1.225268;
    else woeValue = 0;}else if(nach_last_return_age.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -0.058823529) woeValue = 1.498652;
    else if (-0.058823529 < valueDouble && valueDouble <= -0.02) woeValue = 0.176302;
    else if (-0.02 < valueDouble && valueDouble <= -0.001754386) woeValue = 0.088674;
    else if (-0.001754386 < valueDouble && valueDouble <= -0.000611995) woeValue = -0.093911;
    else if (-0.000611995 < valueDouble && valueDouble <= -0.000423012) woeValue = -0.457433;
    else if ( valueDouble > -0.000423012) woeValue = -0.975452;
    else woeValue = 0;}else if(ncc_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.252542;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.401144;
    else if (0 < valueDouble && valueDouble <= 0.0049019608) woeValue = -3.787771;
    else if (0.0049019608 < valueDouble && valueDouble <= 0.0104895105) woeValue = -1.574690;
    else if (0.0104895105 < valueDouble && valueDouble <= 0.0374331551) woeValue = -1.150032;
    else if (0.0374331551 < valueDouble && valueDouble <= 0.0831826401) woeValue = -0.692772;
    else if (0.0831826401 < valueDouble && valueDouble <= 0.2207792208) woeValue = 0.141006;
    else if (0.2207792208 < valueDouble && valueDouble <= 0.350877193) woeValue = 0.501897;
    else if ( valueDouble > 0.350877193) woeValue = 1.634091;
    else woeValue = 0;}else if(num_logins_30_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.636296;
    else if (0 < valueDouble && valueDouble <= 26) woeValue = -0.343856;
    else if (26 < valueDouble && valueDouble <= 31) woeValue = -0.019067;
    else if (31 < valueDouble && valueDouble <= 52) woeValue = 0.237441;
    else if (52 < valueDouble && valueDouble <= 80) woeValue = 0.744028;
    else if (80 < valueDouble && valueDouble <= 118) woeValue = 0.746229;
    else if ( valueDouble > 118) woeValue = 1.211881;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = -0.982035;
    else if (4 < valueDouble && valueDouble <= 7) woeValue = -0.274818;
    else if (7 < valueDouble && valueDouble <= 13) woeValue = 0.320751;
    else if (13 < valueDouble && valueDouble <= 15) woeValue = 1.447650;
    else if (15 < valueDouble && valueDouble <= 16) woeValue = 1.710544;
    else if ( valueDouble > 16) woeValue = 2.514579;
    else woeValue = 0;}else if(s2r_txnsnt_cnt_stss_lst_48_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.246269;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.641644;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 1.341850;
    else if ( valueDouble > 2) woeValue = 2.217203;
    else woeValue = 0;}else if(s_outstd_iach_amt_orig.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.414771;
    else if (0 < valueDouble && valueDouble <= 2815) woeValue = -0.327258;
    else if (2815 < valueDouble && valueDouble <= 8240) woeValue = -0.070365;
    else if (8240 < valueDouble && valueDouble <= 12725) woeValue = 0.521121;
    else if (12725 < valueDouble && valueDouble <= 33704) woeValue = 0.557044;
    else if (33704 < valueDouble && valueDouble <= 46102) woeValue = 0.673565;
    else if (46102 < valueDouble && valueDouble <= 71758) woeValue = 0.767215;
    else if ( valueDouble > 71758) woeValue = 1.410661;
    else woeValue = 0;}else if(s_v_tx_ratio_dollar.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.5331125533) woeValue = 1.989133;
    else if (0.5331125533 < valueDouble && valueDouble <= 0.6846991728) woeValue = 0.656874;
    else if (0.6846991728 < valueDouble && valueDouble <= 0.9098948108) woeValue = 0.352520;
    else if (0.9098948108 < valueDouble && valueDouble <= 0.9314569662) woeValue = 0.106544;
    else if (0.9314569662 < valueDouble && valueDouble <= 1) woeValue = -0.160475;
    else if ( valueDouble > 1) woeValue = -4.000000;
    else woeValue = 0;}else if(s_visitor_id_tof.getName().equals(varName)){if (value == null) woeValue = -0.080493;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.152890;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = 1.734746;
    else if (4 < valueDouble && valueDouble <= 17) woeValue = 1.489977;
    else if (17 < valueDouble && valueDouble <= 567) woeValue = -0.363151;
    else if ( valueDouble > 567) woeValue = -1.188086;
    else woeValue = 0;}else if(v35_sent_amt_usd_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 4.93) woeValue = -0.884977;
    else if (4.93 < valueDouble && valueDouble <= 5.69) woeValue = -0.710191;
    else if (5.69 < valueDouble && valueDouble <= 28.75) woeValue = -0.454786;
    else if (28.75 < valueDouble && valueDouble <= 69.97) woeValue = -0.321359;
    else if (69.97 < valueDouble && valueDouble <= 98.67) woeValue = 0.250763;
    else if (98.67 < valueDouble && valueDouble <= 107.76) woeValue = 0.502215;
    else if (107.76 < valueDouble && valueDouble <= 172.08) woeValue = 0.513621;
    else if (172.08 < valueDouble && valueDouble <= 302.5) woeValue = 0.649675;
    else if (302.5 < valueDouble && valueDouble <= 413.56) woeValue = 0.688228;
    else if (413.56 < valueDouble && valueDouble <= 644.74) woeValue = 1.017614;
    else if ( valueDouble > 644.74) woeValue = 1.524273;
    else woeValue = 0;}else if(v36_diff_vid_3d.getName().equals(varName)){if (value == null) woeValue = 0.689289;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.257523;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.320566;
    else if (3 < valueDouble && valueDouble <= 7) woeValue = -0.135412;
    else if (7 < valueDouble && valueDouble <= 9) woeValue = 0.318244;
    else if ( valueDouble > 9) woeValue = 0.729186;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -25) woeValue = -0.005003;
    else if (-25 < valueDouble && valueDouble <= 0) woeValue = 0.587381;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.580436;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.152545;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.196502;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.667594;
    else if ( valueDouble > 4) woeValue = 1.654598;
    else woeValue = 0;}else if(v3_transaction_ars_category.getName().equals(varName)){if (Arrays.asList( "ME_animals collectibles").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_boats").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_breweriana, beer & barware","ME_comics","ME_dance","ME_diving","ME_hunting","ME_industrial supply & mro").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_medical & lab equipment","ME_nutrition","ME_optometry","ME_postcards","ME_printing & graphic arts equipm","ME_printing & personalization","ME_running","ME_stamps","ME_tickets","ME_travel","ME_vouchers, coupons, gcs","ME_wedding","TI_photography","_MISSING_","ME_shipping equipment","ME_retail & services equipment","ME_golf","ME_soccer, football & rugby","ME_fishing","ME_kitchen","ME_books","ME_adult only","ME_parties, occasions").contains(value)) woeValue = -1.922952;
    else if (Arrays.asList( "ME_models & kits","ME_arts & crafts","ME_electrical & test equipment","ME_antiques","TI_music-instruments").contains(value)) woeValue = -1.553614;
    else if (Arrays.asList( "TI_health","ME_motorcycles","TI_garden-equip","ME_pottery & glass","TI_books","ME_restaurant equipment","ME_accessories","ME_consumer electronics","TI_sports-equip","TI_office-supplies","TI_non-profit","ME_cards","ME_costumes","TI_baby","ME_camping, hiking","TI_nutritional-supp","TI_arts-n-craft","ME_cycling","TI_furniture","ME_software","ME_memorabilia","ME_office","TI_tickets","ME_toys","ME_cameras","ME_home appliances","ME_jewellery","TI_pet-supplies","ME_metaphysical","ME_cars","ME_flowers","ME_nondistinct","ME_baby","ME_furniture","ME_cell phones & pdas","TI_coins","TI_jewelry","ME_luggage","ME_film & tv","ME_scanners, printers & supplies","ME_pharmacy","ME_music","ME_vehicle parts","ME_home & garden","ME_womenswear","ME_children's wear","TI_cosmetics","ME_beauty","ME_sport","ME_menswear","ME_computers").contains(value)) woeValue = -0.810632;
    else if (Arrays.asList( "TI_performers","TI_education","TI_fashion").contains(value)) woeValue = -0.502745;
    else if (Arrays.asList( "TI_auto-parts","ME_food & drink","ME_art","ME_exercise & fitness","ME_pet supplies","ME_watches","TI_variety","ME_diy & construction","TI_houseware","ME_game consoles & accessories","TI_adults","ME_shoes","ME_video games","ME_mobility & disability","ME_unknown","ME_telephones","ME_other","ME_equestrian").contains(value)) woeValue = -0.344786;
    else if (Arrays.asList( "TI_travel","NO_DATA","TI_telecom").contains(value)) woeValue = -0.082192;
    else if (Arrays.asList( "TI_memorabilia","TI_website-services","ME_tattoos & body art","TI_toys","TI_offline-services","TI_electronics","TI_cameras","ME_clothing"," ","ME_agriculture equipment").contains(value)) woeValue = 0.111394;
    else if (Arrays.asList( "TI_gaming","ME_networking","TI_music-videos","TI_airlines","ME_collectibles","TI_computer-hardware","ME_therapies","TI_food-n-drink","ME_coins").contains(value)) woeValue = 0.629573;
    else if (Arrays.asList( "TI_dg","TI_hosting","ME_badges/ patches","TI_cellphones").contains(value)) woeValue = 1.060732;
    else if (Arrays.asList( "TI_get-rich","TI_software").contains(value)) woeValue = 1.792941;
    else if (Arrays.asList( "TI_online-services").contains(value)) woeValue = 1.894057;
    else woeValue = 0;}else if(vid_ratio_4w_ato_dol.getName().equals(varName)){if (value == null) woeValue = 0.421033;
    else if (-1e38 < valueDouble && valueDouble <= 0.1078376732) woeValue = -0.453790;
    else if (0.1078376732 < valueDouble && valueDouble <= 0.7827264927) woeValue = -0.040199;
    else if (0.7827264927 < valueDouble && valueDouble <= 1.1318432003) woeValue = 0.044456;
    else if (1.1318432003 < valueDouble && valueDouble <= 2.6088405667) woeValue = 0.305161;
    else if ( valueDouble > 2.6088405667) woeValue = 0.950768;
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
    
    coeffMap.put("Intercept",+7.02300977);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-0.80544157);
    coeffMap.put(p90_dys_return.getName(),-0.6768907);
    coeffMap.put(days_snc_1st_clrd_ach.getName(),-0.49322574);
    coeffMap.put(a_bdrt_Veri_txn.getName(),-0.47378848);
    coeffMap.put(v36_login_exces_1h.getName(),-0.45216921);
    coeffMap.put(ncc_failed_ratio.getName(),-0.21558464);
    coeffMap.put(Decline_rate_amt_ccbin.getName(),-0.39110951);
    coeffMap.put(max_CP4wRtAtoCcBadTxn.getName(),-0.46931157);
    coeffMap.put(s2r_txnsnt_cnt_stss_lst_48_hrs.getName(),-0.29013086);
    coeffMap.put(email_MP_d_snc_conf.getName(),-0.32926484);
    coeffMap.put(v35_sent_amt_usd_in_last_1d.getName(),-0.36586954);
    coeffMap.put(num_logins_30_days.getName(),-0.38409436);
    coeffMap.put(s_outstd_iach_amt_orig.getName(),-0.63632464);
    coeffMap.put(Bad_rate_ccbin.getName(),-0.59730188);
    coeffMap.put(v36_diff_vid_3d.getName(),-0.32152631);
    coeffMap.put(cc_decline_30d_dk__cnt.getName(),-0.36193866);
    coeffMap.put(s_v_tx_ratio_dollar.getName(),-0.3878632);
    coeffMap.put(ip_max_dk_10.getName(),-0.49970535);
    coeffMap.put(ach_dof_age.getName(),-1.02019199);
    coeffMap.put(nach_last_return_age.getName(),-0.41164215);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-0.39811724);
    coeffMap.put(IP4WRtCcXbrBadTxn.getName(),-0.45528959);
    coeffMap.put(s_visitor_id_tof.getName(),-0.52295493);
    coeffMap.put(added_ach_lt_30.getName(),-0.63486849);
    coeffMap.put(vid_ratio_4w_ato_dol.getName(),-0.6057497);
    coeffMap.put(max_IPR20wRtAtoCcBadTxn.getName(),-0.65661121);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.84049948);
    coeffMap.put(email_username_match.getName(),-0.71922529);
    coeffMap.put(cc_pct_passed_verification.getName(),-1.05569277);
    coeffMap.put(v3_transaction_ars_category.getName(),-0.54703811);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 851.64592534;
  }

  @Override
  public double getCoeff2() {
    return  -59.42939798;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT3;
  }
  
}