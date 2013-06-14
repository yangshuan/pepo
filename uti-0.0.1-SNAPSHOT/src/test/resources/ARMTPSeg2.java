package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMTPSeg2 extends ARMTPAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(v36_login_exces_1h);
    variables.add(ip_ratio_4w_appr_dol);
    variables.add(CP4WRtDolBadTxn);
    variables.add(CC_CNT);
    variables.add(is_tail);
    variables.add(ED4WRtAtoBadAcc);
    variables.add(v35_sent_amt_usd_in_last_1d);
    variables.add(PC_STUDENT_CCBIN);
    variables.add(c_dof);
    variables.add(max_cross20wRtAtoCcBadAcc);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(Decline_rate_ccbin);
    variables.add(s_v_tx_ratio_num);
    variables.add(v3_transaction_ars_category);
    variables.add(PC_PREPAID_CCBIN);
    variables.add(t_bank_dof);
    variables.add(email_MP_7d_UPIA_dk);
    variables.add(v3_account_age_sm);
    variables.add(cp_zscr_20w_appr_pertxn);
    variables.add(n_bdrt_bp_txn);
    variables.add(txnsnt_amt_max_lst_24_hrs);
    variables.add(Bad_rate_amt_ccbin);
    variables.add(rt_r8r16_hr);
    variables.add(snr_ratio_4w_uaa_dol);
    variables.add(n_bdrt_Veri_txn);
    variables.add(num_logins_7_days);
    variables.add(v36_cc_new_card_cnt_last_60d);
    variables.add(v2_beacon_lat_ratio_to_net_worst);
    variables.add(s_outstd_iach_amt_orig);
    variables.add(a_rt_dcl_14dys);


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

    if(Bad_rate_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.390553;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.023752;
    else if (0 < valueDouble && valueDouble <= 1.5812286E-6) woeValue = -4.000000;
    else if (1.5812286E-6 < valueDouble && valueDouble <= 0.0016086595) woeValue = -0.477478;
    else if (0.0016086595 < valueDouble && valueDouble <= 0.0026892411) woeValue = -0.282853;
    else if (0.0026892411 < valueDouble && valueDouble <= 0.0044153138) woeValue = -0.141075;
    else if (0.0044153138 < valueDouble && valueDouble <= 0.004916157) woeValue = 0.874508;
    else if ( valueDouble > 0.004916157) woeValue = 1.685493;
    else woeValue = 0;}else if(CC_CNT.getName().equals(varName)){if (value == null) woeValue = 0.389580;
    else if (-1e38 < valueDouble && valueDouble <= 80897) woeValue = 0.585943;
    else if (80897 < valueDouble && valueDouble <= 360721) woeValue = -0.276144;
    else if (360721 < valueDouble && valueDouble <= 5326978) woeValue = -0.806851;
    else if ( valueDouble > 5326978) woeValue = -3.594061;
    else woeValue = 0;}else if(CP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.458269;
    else if (0 < valueDouble && valueDouble <= 0.0005) woeValue = -1.307700;
    else if (0.0005 < valueDouble && valueDouble <= 0.0018) woeValue = -0.865692;
    else if (0.0018 < valueDouble && valueDouble <= 0.0041) woeValue = -0.485323;
    else if (0.0041 < valueDouble && valueDouble <= 0.0052) woeValue = -0.102791;
    else if (0.0052 < valueDouble && valueDouble <= 0.0085) woeValue = 0.357285;
    else if (0.0085 < valueDouble && valueDouble <= 0.0096) woeValue = 0.410569;
    else if ( valueDouble > 0.0096) woeValue = 0.917209;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.388537;
    else if (-1e38 < valueDouble && valueDouble <= 0.0505585235) woeValue = -0.918925;
    else if (0.0505585235 < valueDouble && valueDouble <= 0.0837844555) woeValue = -0.730590;
    else if (0.0837844555 < valueDouble && valueDouble <= 0.0867605042) woeValue = -0.354755;
    else if (0.0867605042 < valueDouble && valueDouble <= 0.1162582455) woeValue = -0.020656;
    else if (0.1162582455 < valueDouble && valueDouble <= 0.1394846501) woeValue = 1.008587;
    else if (0.1394846501 < valueDouble && valueDouble <= 0.1472077886) woeValue = 1.118980;
    else if (0.1472077886 < valueDouble && valueDouble <= 0.2208638957) woeValue = 1.165402;
    else if ( valueDouble > 0.2208638957) woeValue = 1.383309;
    else woeValue = 0;}else if(ED4WRtAtoBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.266776;
    else if (0 < valueDouble && valueDouble <= 0.0002) woeValue = -1.404623;
    else if (0.0002 < valueDouble && valueDouble <= 0.0013) woeValue = -0.104935;
    else if ( valueDouble > 0.0013) woeValue = 1.275397;
    else woeValue = 0;}else if(PC_PREPAID_CCBIN.getName().equals(varName)){if (value == null) woeValue = 0.389580;
    else if (-1e38 < valueDouble && valueDouble <= 0.0006854562) woeValue = -2.190242;
    else if (0.0006854562 < valueDouble && valueDouble <= 0.0008959235) woeValue = -1.321565;
    else if (0.0008959235 < valueDouble && valueDouble <= 0.0012019231) woeValue = -0.560564;
    else if (0.0012019231 < valueDouble && valueDouble <= 0.0018885224) woeValue = 0.010521;
    else if (0.0018885224 < valueDouble && valueDouble <= 0.0023854962) woeValue = 0.322649;
    else if ( valueDouble > 0.0023854962) woeValue = 0.473741;
    else woeValue = 0;}else if(PC_STUDENT_CCBIN.getName().equals(varName)){if (value == null) woeValue = 0.389580;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.992173;
    else if (0 < valueDouble && valueDouble <= 0.0300623936) woeValue = -0.094099;
    else if ( valueDouble > 0.0300623936) woeValue = -1.068453;
    else woeValue = 0;}else if(a_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.097916;
    else if (0 < valueDouble && valueDouble <= 0.002116) woeValue = -1.686060;
    else if (0.002116 < valueDouble && valueDouble <= 0.014632) woeValue = -1.255630;
    else if (0.014632 < valueDouble && valueDouble <= 0.02614) woeValue = -0.683464;
    else if (0.02614 < valueDouble && valueDouble <= 0.029507) woeValue = -0.664367;
    else if (0.029507 < valueDouble && valueDouble <= 0.065037) woeValue = -0.132274;
    else if (0.065037 < valueDouble && valueDouble <= 0.096829) woeValue = 0.113054;
    else if (0.096829 < valueDouble && valueDouble <= 0.153294) woeValue = 0.354429;
    else if (0.153294 < valueDouble && valueDouble <= 0.533321) woeValue = 0.611200;
    else if ( valueDouble > 0.533321) woeValue = 2.799752;
    else woeValue = 0;}else if(c_dof.getName().equals(varName)){if (value == null) woeValue = 0.284278;
    else if (-1e38 < valueDouble && valueDouble <= 58) woeValue = 1.390565;
    else if (58 < valueDouble && valueDouble <= 1136) woeValue = -0.018012;
    else if (1136 < valueDouble && valueDouble <= 3816) woeValue = -0.061264;
    else if ( valueDouble > 3816) woeValue = -0.770414;
    else woeValue = 0;}else if(cp_zscr_20w_appr_pertxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1222437712) woeValue = -0.283699;
    else if (0.1222437712 < valueDouble && valueDouble <= 0.4144117049) woeValue = -0.216010;
    else if (0.4144117049 < valueDouble && valueDouble <= 1.0598250051) woeValue = -0.095722;
    else if (1.0598250051 < valueDouble && valueDouble <= 2.0559807223) woeValue = 0.189228;
    else if (2.0559807223 < valueDouble && valueDouble <= 4.5776181588) woeValue = 1.043674;
    else if ( valueDouble > 4.5776181588) woeValue = 1.310691;
    else woeValue = 0;}else if(email_MP_7d_UPIA_dk.getName().equals(varName)){if (value == null) woeValue = 0.385227;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.826792;
    else if (0 < valueDouble && valueDouble <= 1.018123E-18) woeValue = -1.278780;
    else if (1.018123E-18 < valueDouble && valueDouble <= 5.4169029E-7) woeValue = -0.778832;
    else if (5.4169029E-7 < valueDouble && valueDouble <= 0.0656644909) woeValue = -0.527398;
    else if (0.0656644909 < valueDouble && valueDouble <= 0.3658956424) woeValue = 0.224451;
    else if ( valueDouble > 0.3658956424) woeValue = 0.476425;
    else woeValue = 0;}else if(ip_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.1015176607) woeValue = -0.776554;
    else if (0.1015176607 < valueDouble && valueDouble <= 0.8167410371) woeValue = -0.329315;
    else if (0.8167410371 < valueDouble && valueDouble <= 3.4063926941) woeValue = 0.071662;
    else if (3.4063926941 < valueDouble && valueDouble <= 6.755712621) woeValue = 0.588985;
    else if (6.755712621 < valueDouble && valueDouble <= 9.5867574923) woeValue = 0.913446;
    else if ( valueDouble > 9.5867574923) woeValue = 1.204827;
    else woeValue = 0;}else if(is_tail.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.297280;
    else if ( valueDouble > 0) woeValue = 0.735782;
    else woeValue = 0;}else if(max_cross20wRtAtoCcBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0006) woeValue = -1.176699;
    else if (0.0006 < valueDouble && valueDouble <= 0.0008) woeValue = -0.497293;
    else if (0.0008 < valueDouble && valueDouble <= 0.0017) woeValue = -0.287313;
    else if (0.0017 < valueDouble && valueDouble <= 0.0019) woeValue = 0.034588;
    else if (0.0019 < valueDouble && valueDouble <= 0.0049) woeValue = 0.178120;
    else if ( valueDouble > 0.0049) woeValue = 0.731141;
    else woeValue = 0;}else if(n_bdrt_Veri_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.943834;
    else if (0 < valueDouble && valueDouble <= 0.00004) woeValue = -3.986831;
    else if (0.00004 < valueDouble && valueDouble <= 0.0003) woeValue = -1.943073;
    else if (0.0003 < valueDouble && valueDouble <= 0.00038) woeValue = -1.625591;
    else if (0.00038 < valueDouble && valueDouble <= 0.00045) woeValue = -1.611450;
    else if (0.00045 < valueDouble && valueDouble <= 0.00056) woeValue = -1.548294;
    else if (0.00056 < valueDouble && valueDouble <= 0.00083) woeValue = -0.026735;
    else if (0.00083 < valueDouble && valueDouble <= 0.00171) woeValue = 0.242397;
    else if (0.00171 < valueDouble && valueDouble <= 0.00201) woeValue = 0.386211;
    else if (0.00201 < valueDouble && valueDouble <= 0.00812) woeValue = 0.579489;
    else if (0.00812 < valueDouble && valueDouble <= 0.0168) woeValue = 1.186948;
    else if ( valueDouble > 0.0168) woeValue = 2.762908;
    else woeValue = 0;}else if(n_bdrt_bp_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.757550;
    else if (0 < valueDouble && valueDouble <= 0.00305) woeValue = -0.820978;
    else if (0.00305 < valueDouble && valueDouble <= 0.00772) woeValue = 0.047162;
    else if (0.00772 < valueDouble && valueDouble <= 0.10837) woeValue = 0.561890;
    else if ( valueDouble > 0.10837) woeValue = 2.438577;
    else woeValue = 0;}else if(num_logins_7_days.getName().equals(varName)){if (value == null) woeValue = 0.291097;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.356646;
    else if (0 < valueDouble && valueDouble <= 3) woeValue = -0.449374;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = -0.306235;
    else if (4 < valueDouble && valueDouble <= 8) woeValue = -0.225744;
    else if (8 < valueDouble && valueDouble <= 17) woeValue = 0.073398;
    else if (17 < valueDouble && valueDouble <= 42) woeValue = 0.965238;
    else if ( valueDouble > 42) woeValue = 1.374769;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.099984;
    else if (-1e38 < valueDouble && valueDouble <= 0.0118464852) woeValue = -2.041052;
    else if (0.0118464852 < valueDouble && valueDouble <= 0.0418293094) woeValue = -1.019126;
    else if (0.0418293094 < valueDouble && valueDouble <= 0.4300088784) woeValue = -0.341192;
    else if (0.4300088784 < valueDouble && valueDouble <= 6.5223063973) woeValue = 0.079914;
    else if ( valueDouble > 6.5223063973) woeValue = 0.974684;
    else woeValue = 0;}else if(rt_r8r16_hr.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.095591;
    else if (0 < valueDouble && valueDouble <= 0.024) woeValue = 2.444726;
    else if (0.024 < valueDouble && valueDouble <= 0.312) woeValue = -0.170689;
    else if ( valueDouble > 0.312) woeValue = -0.967369;
    else woeValue = 0;}else if(s_outstd_iach_amt_orig.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -24) woeValue = -4.000000;
    else if (-24 < valueDouble && valueDouble <= 0) woeValue = -0.127308;
    else if (0 < valueDouble && valueDouble <= 606) woeValue = -1.157239;
    else if (606 < valueDouble && valueDouble <= 3128) woeValue = -0.030156;
    else if (3128 < valueDouble && valueDouble <= 21063) woeValue = 0.123179;
    else if (21063 < valueDouble && valueDouble <= 50344) woeValue = 0.770604;
    else if ( valueDouble > 50344) woeValue = 1.308148;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.396116;
    else if (-1e38 < valueDouble && valueDouble <= 0.1428571429) woeValue = 2.085248;
    else if (0.1428571429 < valueDouble && valueDouble <= 0.7071823204) woeValue = 0.924815;
    else if (0.7071823204 < valueDouble && valueDouble <= 0.8636363636) woeValue = -0.219160;
    else if ( valueDouble > 0.8636363636) woeValue = -0.885664;
    else woeValue = 0;}else if(snr_ratio_4w_uaa_dol.getName().equals(varName)){if (value == null) woeValue = -0.212285;
    else if (-1e38 < valueDouble && valueDouble <= 0.0517038778) woeValue = -0.675207;
    else if (0.0517038778 < valueDouble && valueDouble <= 1.2355147059) woeValue = -0.060723;
    else if (1.2355147059 < valueDouble && valueDouble <= 1.4826444701) woeValue = 0.967092;
    else if (1.4826444701 < valueDouble && valueDouble <= 2.3801679012) woeValue = 1.113522;
    else if (2.3801679012 < valueDouble && valueDouble <= 3.5105435815) woeValue = 1.260643;
    else if (3.5105435815 < valueDouble && valueDouble <= 5.4907963086) woeValue = 1.502690;
    else if ( valueDouble > 5.4907963086) woeValue = 1.913475;
    else woeValue = 0;}else if(t_bank_dof.getName().equals(varName)){if (value == null) woeValue = 0.291097;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 1.019491;
    else if (-1 < valueDouble && valueDouble <= 0) woeValue = 0.581046;
    else if (0 < valueDouble && valueDouble <= 4) woeValue = 0.678159;
    else if (4 < valueDouble && valueDouble <= 10) woeValue = 0.245333;
    else if (10 < valueDouble && valueDouble <= 66) woeValue = -0.047439;
    else if (66 < valueDouble && valueDouble <= 1123) woeValue = -0.469992;
    else if (1123 < valueDouble && valueDouble <= 1813) woeValue = -1.039329;
    else if ( valueDouble > 1813) woeValue = -1.784322;
    else woeValue = 0;}else if(txnsnt_amt_max_lst_24_hrs.getName().equals(varName)){if (value == null) woeValue = 0.291097;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.125846;
    else if (-1 < valueDouble && valueDouble <= 12.18) woeValue = 1.015270;
    else if ( valueDouble > 12.18) woeValue = 1.867706;
    else woeValue = 0;}else if(v2_beacon_lat_ratio_to_net_worst.getName().equals(varName)){if (Arrays.asList( "_MISSING_","HIGH","MED","NO_LAT").contains(value)) woeValue = -0.223704;
    else if (Arrays.asList( "","LOW").contains(value)) woeValue = 0.340777;
    else if (Arrays.asList( "ULT").contains(value)) woeValue = 1.918313;
    else woeValue = 0;}else if(v35_sent_amt_usd_in_last_1d.getName().equals(varName)){if (value == null) woeValue = 0.232144;
    else if (-1e38 < valueDouble && valueDouble <= 2.41) woeValue = -0.854251;
    else if (2.41 < valueDouble && valueDouble <= 17.97) woeValue = -0.418768;
    else if (17.97 < valueDouble && valueDouble <= 48.53) woeValue = -0.377218;
    else if (48.53 < valueDouble && valueDouble <= 144.34) woeValue = -0.089512;
    else if (144.34 < valueDouble && valueDouble <= 212.39) woeValue = 0.214583;
    else if (212.39 < valueDouble && valueDouble <= 310.93) woeValue = 0.372271;
    else if (310.93 < valueDouble && valueDouble <= 532) woeValue = 0.812350;
    else if (532 < valueDouble && valueDouble <= 835.94) woeValue = 1.173375;
    else if ( valueDouble > 835.94) woeValue = 1.923578;
    else woeValue = 0;}else if(v36_cc_new_card_cnt_last_60d.getName().equals(varName)){if (value == null) woeValue = 0.174295;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.251795;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.151518;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.954843;
    else if ( valueDouble > 2) woeValue = 2.026105;
    else woeValue = 0;}else if(v36_login_exces_1h.getName().equals(varName)){if (value == null) woeValue = 0.174295;
    else if (-1e38 < valueDouble && valueDouble <= -25) woeValue = -0.112062;
    else if (-25 < valueDouble && valueDouble <= 0) woeValue = 0.343347;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.425330;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.199210;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.277355;
    else if (3 < valueDouble && valueDouble <= 6) woeValue = 0.922699;
    else if ( valueDouble > 6) woeValue = 1.747395;
    else woeValue = 0;}else if(v3_account_age_sm.getName().equals(varName)){if (value == null) woeValue = 0.232144;
    else if (-1e38 < valueDouble && valueDouble <= 22.000439815) woeValue = 0.394561;
    else if (22.000439815 < valueDouble && valueDouble <= 99.604895833) woeValue = -0.187588;
    else if (99.604895833 < valueDouble && valueDouble <= 341.45165509) woeValue = -0.574987;
    else if (341.45165509 < valueDouble && valueDouble <= 941.83892361) woeValue = -1.311352;
    else if ( valueDouble > 941.83892361) woeValue = -1.811448;
    else woeValue = 0;}else if(v3_transaction_ars_category.getName().equals(varName)){if (Arrays.asList( "ME_animals collectibles").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_badges/ patches").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_bags","ME_breweriana, beer & barware").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_camping, hiking").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_clocks collectibles").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_dance").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_diving").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_flowers").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_hunting").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_metaphysical").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "ME_nutrition","ME_printing & personalization","ME_restaurant equipment","ME_safety & security","ME_sailing","ME_therapies","ME_uniforms","ME_vouchers, coupons, gcs","ME_wedding","TI_adults","_MISSING_","ME_industrial supply & mro","TI_education","ME_shipping equipment","TI_office-supplies","ME_art").contains(value)) woeValue = -2.890582;
    else if (Arrays.asList( "ME_golf").contains(value)) woeValue = -2.394594;
    else if (Arrays.asList( "TI_furniture","ME_scanners, printers & supplies","ME_cycling","ME_baby","ME_agriculture equipment","ME_parties, occasions").contains(value)) woeValue = -2.107064;
    else if (Arrays.asList( "TI_non-profit","ME_motorcycles","ME_equestrian","ME_exercise & fitness","ME_arts & crafts","ME_home appliances","ME_game consoles & accessories","ME_costumes","ME_children's wear","ME_collectibles","ME_home & garden","ME_fishing","ME_menswear","ME_tattoos & body art","ME_clothing","ME_sport").contains(value)) woeValue = -1.521588;
    else if (Arrays.asList( "TI_books","TI_houseware","ME_cars").contains(value)) woeValue = -1.350720;
    else if (Arrays.asList( "ME_jewellery").contains(value)) woeValue = -1.293865;
    else if (Arrays.asList( "ME_diy & construction","ME_boats","TI_music-videos","TI_jewelry","TI_arts-n-craft","ME_adult only","TI_baby","TI_garden-equip","ME_pottery & glass").contains(value)) woeValue = -1.230076;
    else if (Arrays.asList( "TI_memorabilia","ME_shoes","ME_antiques","ME_music","ME_optometry","TI_sports-equip","ME_cameras","TI_tickets","ME_accessories","ME_film & tv","ME_office","TI_nutritional-supp").contains(value)) woeValue = -1.059722;
    else if (Arrays.asList( "ME_womenswear","ME_memorabilia","TI_auto-parts","ME_pharmacy","ME_luggage","ME_furniture","ME_coins","ME_kitchen","TI_pet-supplies","ME_software","TI_telecom","ME_models & kits","TI_photography","TI_computer-hardware","TI_performers","ME_soccer, football & rugby","ME_cards","ME_nondistinct","ME_travel","ME_networking","TI_website-services","ME_pet supplies","ME_retail & services equipment","ME_food & drink","ME_other","ME_video games","ME_cell phones & pdas","ME_telephones","TI_health","TI_music-instruments","ME_toys","ME_consumer electronics","TI_travel","ME_electrical & test equipment").contains(value)) woeValue = -0.470349;
    else if (Arrays.asList( "TI_fashion","ME_medical & lab equipment","ME_mobility & disability").contains(value)) woeValue = -0.158795;
    else if (Arrays.asList( "NO_DATA","TI_food-n-drink","TI_offline-services","ME_computers","ME_unknown","ME_vehicle parts","ME_watches","TI_get-rich").contains(value)) woeValue = 0.015634;
    else if (Arrays.asList( "","TI_toys","ME_books","ME_tickets","ME_printing & graphic arts equipm","TI_cellphones","TI_cosmetics").contains(value)) woeValue = 0.324729;
    else if (Arrays.asList( "TI_dg","TI_electronics","TI_cameras","TI_gaming","TI_software","TI_online-services","ME_beauty","TI_variety","TI_coins","TI_hosting","TI_airlines").contains(value)) woeValue = 0.989657;
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
    
    coeffMap.put("Intercept",+5.64320537);
    coeffMap.put(n_bdrt_Veri_txn.getName(),-0.33772742);
    coeffMap.put(a_rt_dcl_14dys.getName(),-0.30984184);
    coeffMap.put(n_bdrt_bp_txn.getName(),-0.41444022);
    coeffMap.put(rt_r8r16_hr.getName(),-0.79558758);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.29154243);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.52760639);
    coeffMap.put(CC_CNT.getName(),-0.28047115);
    coeffMap.put(PC_PREPAID_CCBIN.getName(),-0.24190939);
    coeffMap.put(CP4WRtDolBadTxn.getName(),-0.53838849);
    coeffMap.put(v35_sent_amt_usd_in_last_1d.getName(),-0.17291486);
    coeffMap.put(Bad_rate_amt_ccbin.getName(),-0.32150658);
    coeffMap.put(v36_login_exces_1h.getName(),-0.48629459);
    coeffMap.put(v3_account_age_sm.getName(),-0.37292667);
    coeffMap.put(email_MP_7d_UPIA_dk.getName(),-0.35993587);
    coeffMap.put(t_bank_dof.getName(),-0.42797989);
    coeffMap.put(snr_ratio_4w_uaa_dol.getName(),-0.36070296);
    coeffMap.put(num_logins_7_days.getName(),-0.44259458);
    coeffMap.put(ip_ratio_4w_appr_dol.getName(),-0.34460722);
    coeffMap.put(is_tail.getName(),-0.22331162);
    coeffMap.put(txnsnt_amt_max_lst_24_hrs.getName(),-0.47384279);
    coeffMap.put(max_cross20wRtAtoCcBadAcc.getName(),-0.46465662);
    coeffMap.put(cp_zscr_20w_appr_pertxn.getName(),-0.4698996);
    coeffMap.put(ED4WRtAtoBadAcc.getName(),-0.71638699);
    coeffMap.put(v36_cc_new_card_cnt_last_60d.getName(),-0.77744923);
    coeffMap.put(s_outstd_iach_amt_orig.getName(),-0.4576003);
    coeffMap.put(PC_STUDENT_CCBIN.getName(),-0.3614507);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.5670525);
    coeffMap.put(c_dof.getName(),-0.49321395);
    coeffMap.put(v3_transaction_ars_category.getName(),-0.54870225);
    coeffMap.put(v2_beacon_lat_ratio_to_net_worst.getName(),-0.75417882);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 849.59918859;
  }

  @Override
  public double getCoeff2() {
    return  -61.75659923;
  }

  @Override
  public ARMTPSegmentType getSegmentType() {
    return ARMTPSegmentType.ARMTP_SEGMENT2;
  }
  
}