package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg30 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(cp_ratio_4w_appr_dol);
    variables.add(CP20WRtAtoBadTxn);
    variables.add(primaryach_denomination);
    variables.add(ismobile);
    variables.add(ebay_dy_snc_sus_min_360all);
    variables.add(s_ms_cnt_dk_40);
    variables.add(a_rt_dcl_14dys);
    variables.add(last_name_lowcase);
    variables.add(s_rtrn_decay_180d_cnt);
    variables.add(wach_n_authorized);
    variables.add(ach_max_cleared_amt_30days);
    variables.add(ebay_dy_1yr_sus_avg_360all);
    variables.add(ip_conn_type);
    variables.add(v36_soft_activity_d);
    variables.add(ebay_UPIStrike_180d_360all);
    variables.add(days_snc_1st_clrd_ach);
    variables.add(Decline_rate_ccbin);
    variables.add(seen_same_bankid_30d_90d);
    variables.add(ip_dof);
    variables.add(email_MP_dof);
    variables.add(s2r_txnsnt_amt_avg_lst_1_hrs);
    variables.add(num_logins_3_days);
    variables.add(pst_hour_created);
    variables.add(rt_num_rate);
    variables.add(wach_n_inactive);
    variables.add(min_to_s_dof);
    variables.add(s_ratio_avg_dk_320);
    variables.add(is_credit_union);
    variables.add(p90_dys_return);
    variables.add(email_numofnumeric);
    variables.add(v3_ip_ad_dist_best);
    variables.add(outamt_to_max_cleard);
    variables.add(v21_e_dom_score_worst);
    variables.add(added_ach_lt_1);
    variables.add(s_amt_dk_80);


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

    if(CP20WRtAtoBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.336718;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.396676;
    else if (0.0001 < valueDouble && valueDouble <= 0.0002) woeValue = -0.201277;
    else if (0.0002 < valueDouble && valueDouble <= 0.0004) woeValue = -0.199486;
    else if (0.0004 < valueDouble && valueDouble <= 0.0009) woeValue = 0.198880;
    else if (0.0009 < valueDouble && valueDouble <= 0.0023) woeValue = 0.534386;
    else if (0.0023 < valueDouble && valueDouble <= 0.0036) woeValue = 1.130104;
    else if (0.0036 < valueDouble && valueDouble <= 0.0058) woeValue = 1.257027;
    else if ( valueDouble > 0.0058) woeValue = 1.846493;
    else woeValue = 0;}else if(Decline_rate_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.021556;
    else if (-1e38 < valueDouble && valueDouble <= 0.0309505957) woeValue = -0.783048;
    else if (0.0309505957 < valueDouble && valueDouble <= 0.0319335083) woeValue = -0.659830;
    else if (0.0319335083 < valueDouble && valueDouble <= 0.0583378533) woeValue = -0.335323;
    else if (0.0583378533 < valueDouble && valueDouble <= 0.0816326531) woeValue = 0.039589;
    else if (0.0816326531 < valueDouble && valueDouble <= 0.1727457482) woeValue = 0.877450;
    else if ( valueDouble > 0.1727457482) woeValue = 1.604234;
    else woeValue = 0;}else if(a_rt_dcl_14dys.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.070107;
    else if (0 < valueDouble && valueDouble <= 0.051372) woeValue = -0.253843;
    else if (0.051372 < valueDouble && valueDouble <= 0.056238) woeValue = -0.224284;
    else if (0.056238 < valueDouble && valueDouble <= 0.092459) woeValue = -0.080144;
    else if (0.092459 < valueDouble && valueDouble <= 0.101826) woeValue = -0.043991;
    else if ( valueDouble > 0.101826) woeValue = 0.369313;
    else woeValue = 0;}else if(ach_max_cleared_amt_30days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.405292;
    else if (0 < valueDouble && valueDouble <= 182) woeValue = 1.274190;
    else if (182 < valueDouble && valueDouble <= 516) woeValue = 0.310317;
    else if (516 < valueDouble && valueDouble <= 1304) woeValue = 0.119463;
    else if (1304 < valueDouble && valueDouble <= 2585) woeValue = 0.054099;
    else if (2585 < valueDouble && valueDouble <= 4315) woeValue = -0.337551;
    else if (4315 < valueDouble && valueDouble <= 9550) woeValue = -0.502451;
    else if (9550 < valueDouble && valueDouble <= 44838) woeValue = -0.827519;
    else if ( valueDouble > 44838) woeValue = -1.735683;
    else woeValue = 0;}else if(added_ach_lt_1.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.035131;
    else if ( valueDouble > 0) woeValue = 2.850969;
    else woeValue = 0;}else if(cp_ratio_4w_appr_dol.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.6805405148) woeValue = -0.173658;
    else if (0.6805405148 < valueDouble && valueDouble <= 0.7295637966) woeValue = -0.076968;
    else if (0.7295637966 < valueDouble && valueDouble <= 0.8951342197) woeValue = -0.058359;
    else if (0.8951342197 < valueDouble && valueDouble <= 1.8411614059) woeValue = 0.047857;
    else if (1.8411614059 < valueDouble && valueDouble <= 2.2721197541) woeValue = 0.144828;
    else if (2.2721197541 < valueDouble && valueDouble <= 3.2213979551) woeValue = 0.359300;
    else if (3.2213979551 < valueDouble && valueDouble <= 4.5780105965) woeValue = 0.526874;
    else if ( valueDouble > 4.5780105965) woeValue = 0.975832;
    else woeValue = 0;}else if(days_snc_1st_clrd_ach.getName().equals(varName)){if (value == null) woeValue = 3.515068;
    else if (-1e38 < valueDouble && valueDouble <= 21) woeValue = 1.433636;
    else if (21 < valueDouble && valueDouble <= 32) woeValue = 0.939658;
    else if (32 < valueDouble && valueDouble <= 76) woeValue = 0.626003;
    else if (76 < valueDouble && valueDouble <= 92) woeValue = 0.302951;
    else if (92 < valueDouble && valueDouble <= 124) woeValue = 0.192143;
    else if (124 < valueDouble && valueDouble <= 156) woeValue = -0.064309;
    else if (156 < valueDouble && valueDouble <= 188) woeValue = -0.284292;
    else if (188 < valueDouble && valueDouble <= 237) woeValue = -0.299476;
    else if ( valueDouble > 237) woeValue = -0.441189;
    else woeValue = 0;}else if(ebay_UPIStrike_180d_360all.getName().equals(varName)){if (value == null) woeValue = 0.437886;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.358578;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 1.115505;
    else if ( valueDouble > 1) woeValue = 2.257763;
    else woeValue = 0;}else if(ebay_dy_1yr_sus_avg_360all.getName().equals(varName)){if (value == null) woeValue = -0.037720;
    else if ( valueDouble > -1e38) woeValue = 2.761761;
    else woeValue = 0;}else if(ebay_dy_snc_sus_min_360all.getName().equals(varName)){if (value == null) woeValue = -0.095509;
    else if (-1e38 < valueDouble && valueDouble <= 11) woeValue = 4.000000;
    else if (11 < valueDouble && valueDouble <= 151) woeValue = 3.173742;
    else if (151 < valueDouble && valueDouble <= 683) woeValue = 2.883837;
    else if (683 < valueDouble && valueDouble <= 1008) woeValue = 2.491112;
    else if (1008 < valueDouble && valueDouble <= 1707) woeValue = 1.928061;
    else if (1707 < valueDouble && valueDouble <= 2013) woeValue = 1.617442;
    else if (2013 < valueDouble && valueDouble <= 2105) woeValue = 1.280526;
    else if (2105 < valueDouble && valueDouble <= 2703) woeValue = 0.882334;
    else if ( valueDouble > 2703) woeValue = 0.705174;
    else woeValue = 0;}else if(email_MP_dof.getName().equals(varName)){if (value == null) woeValue = 0.385119;
    else if (-1e38 < valueDouble && valueDouble <= 51) woeValue = 1.329426;
    else if (51 < valueDouble && valueDouble <= 291) woeValue = 0.715702;
    else if (291 < valueDouble && valueDouble <= 421) woeValue = 0.292006;
    else if (421 < valueDouble && valueDouble <= 1329) woeValue = 0.091940;
    else if (1329 < valueDouble && valueDouble <= 1651) woeValue = -0.131276;
    else if (1651 < valueDouble && valueDouble <= 2054) woeValue = -0.309324;
    else if (2054 < valueDouble && valueDouble <= 2359) woeValue = -0.468090;
    else if (2359 < valueDouble && valueDouble <= 2752) woeValue = -0.585747;
    else if (2752 < valueDouble && valueDouble <= 3018) woeValue = -0.814108;
    else if (3018 < valueDouble && valueDouble <= 4363) woeValue = -0.967972;
    else if ( valueDouble > 4363) woeValue = -1.022862;
    else woeValue = 0;}else if(email_numofnumeric.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.119256;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 0.257517;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.278206;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = 0.297152;
    else if ( valueDouble > 3) woeValue = 0.616973;
    else woeValue = 0;}else if(ip_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.183498;
    else if (0 < valueDouble && valueDouble <= 2) woeValue = 0.788756;
    else if (2 < valueDouble && valueDouble <= 17) woeValue = 0.574002;
    else if (17 < valueDouble && valueDouble <= 78) woeValue = 0.552568;
    else if (78 < valueDouble && valueDouble <= 104) woeValue = 0.311841;
    else if (104 < valueDouble && valueDouble <= 224) woeValue = 0.234815;
    else if (224 < valueDouble && valueDouble <= 288) woeValue = -0.031774;
    else if (288 < valueDouble && valueDouble <= 658) woeValue = -0.126007;
    else if ( valueDouble > 658) woeValue = -0.419665;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.112950;
    else if ( valueDouble > 0) woeValue = -0.444567;
    else woeValue = 0;}else if(ismobile.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.040864;
    else if ( valueDouble > 0) woeValue = 0.327873;
    else woeValue = 0;}else if(last_name_lowcase.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.072306;
    else if ( valueDouble > 0) woeValue = 0.915684;
    else woeValue = 0;}else if(min_to_s_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0299855491) woeValue = 1.953325;
    else if (0.0299855491 < valueDouble && valueDouble <= 0.0789883268) woeValue = 1.409248;
    else if (0.0789883268 < valueDouble && valueDouble <= 0.1301075269) woeValue = 0.516164;
    else if (0.1301075269 < valueDouble && valueDouble <= 0.1855670103) woeValue = 0.423772;
    else if (0.1855670103 < valueDouble && valueDouble <= 0.3144624167) woeValue = 0.306361;
    else if (0.3144624167 < valueDouble && valueDouble <= 0.7235693501) woeValue = 0.191570;
    else if (0.7235693501 < valueDouble && valueDouble <= 0.9711324944) woeValue = 0.167545;
    else if (0.9711324944 < valueDouble && valueDouble <= 0.9997187852) woeValue = -0.165670;
    else if (0.9997187852 < valueDouble && valueDouble <= 1) woeValue = -0.245550;
    else if ( valueDouble > 1) woeValue = -1.108859;
    else woeValue = 0;}else if(num_logins_3_days.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.899502;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.551711;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = -0.340562;
    else if (2 < valueDouble && valueDouble <= 3) woeValue = -0.112964;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.139629;
    else if (4 < valueDouble && valueDouble <= 5) woeValue = 0.282195;
    else if (5 < valueDouble && valueDouble <= 6) woeValue = 0.627856;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 1.151167;
    else if (8 < valueDouble && valueDouble <= 13) woeValue = 1.360367;
    else if ( valueDouble > 13) woeValue = 2.502470;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.2896752451) woeValue = -0.531533;
    else if (0.2896752451 < valueDouble && valueDouble <= 0.3622797044) woeValue = -0.454437;
    else if (0.3622797044 < valueDouble && valueDouble <= 0.4921356169) woeValue = -0.375516;
    else if (0.4921356169 < valueDouble && valueDouble <= 0.6226495068) woeValue = -0.193459;
    else if (0.6226495068 < valueDouble && valueDouble <= 0.9464049629) woeValue = -0.135351;
    else if (0.9464049629 < valueDouble && valueDouble <= 1.4175186064) woeValue = 0.065779;
    else if (1.4175186064 < valueDouble && valueDouble <= 1.6159848962) woeValue = 0.169674;
    else if (1.6159848962 < valueDouble && valueDouble <= 1.876109589) woeValue = 0.322059;
    else if (1.876109589 < valueDouble && valueDouble <= 2.2232070911) woeValue = 0.595411;
    else if (2.2232070911 < valueDouble && valueDouble <= 2.7187437687) woeValue = 0.718886;
    else if (2.7187437687 < valueDouble && valueDouble <= 3.5024422012) woeValue = 0.863057;
    else if (3.5024422012 < valueDouble && valueDouble <= 4.9757732987) woeValue = 1.196123;
    else if (4.9757732987 < valueDouble && valueDouble <= 8.827184466) woeValue = 1.695484;
    else if ( valueDouble > 8.827184466) woeValue = 2.631076;
    else woeValue = 0;}else if(p90_dys_return.getName().equals(varName)){if (value == null) woeValue = -4.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3) woeValue = 1.059436;
    else if (3 < valueDouble && valueDouble <= 4) woeValue = 0.404323;
    else if ( valueDouble > 4) woeValue = -0.016181;
    else woeValue = 0;}else if(pst_hour_created.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.047695;
    else if (0 < valueDouble && valueDouble <= 13) woeValue = -0.046602;
    else if (13 < valueDouble && valueDouble <= 15) woeValue = 0.141598;
    else if (15 < valueDouble && valueDouble <= 22) woeValue = 0.520095;
    else if ( valueDouble > 22) woeValue = 0.204385;
    else woeValue = 0;}else if(rt_num_rate.getName().equals(varName)){if (value == null) woeValue = 0.259395;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.493598;
    else if (0 < valueDouble && valueDouble <= 0.002) woeValue = -0.928134;
    else if (0.002 < valueDouble && valueDouble <= 0.003) woeValue = -0.833285;
    else if (0.003 < valueDouble && valueDouble <= 0.004) woeValue = -0.547122;
    else if (0.004 < valueDouble && valueDouble <= 0.005) woeValue = -0.533547;
    else if (0.005 < valueDouble && valueDouble <= 0.006) woeValue = -0.527363;
    else if (0.006 < valueDouble && valueDouble <= 0.009) woeValue = -0.268608;
    else if (0.009 < valueDouble && valueDouble <= 0.01) woeValue = -0.074433;
    else if (0.01 < valueDouble && valueDouble <= 0.014) woeValue = 0.033136;
    else if (0.014 < valueDouble && valueDouble <= 0.017) woeValue = 0.517417;
    else if (0.017 < valueDouble && valueDouble <= 0.019) woeValue = 0.598528;
    else if (0.019 < valueDouble && valueDouble <= 0.028) woeValue = 0.983142;
    else if (0.028 < valueDouble && valueDouble <= 0.037) woeValue = 1.115458;
    else if ( valueDouble > 0.037) woeValue = 1.978410;
    else woeValue = 0;}else if(s2r_txnsnt_amt_avg_lst_1_hrs.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.089500;
    else if (-1 < valueDouble && valueDouble <= 12.89) woeValue = 0.800944;
    else if ( valueDouble > 12.89) woeValue = 1.659603;
    else woeValue = 0;}else if(s_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.346130;
    else if (0 < valueDouble && valueDouble <= 1935.0637) woeValue = -0.416039;
    else if (1935.0637 < valueDouble && valueDouble <= 2245.5038) woeValue = -0.293468;
    else if (2245.5038 < valueDouble && valueDouble <= 2611.3098) woeValue = -0.129608;
    else if (2611.3098 < valueDouble && valueDouble <= 6022.5101) woeValue = 0.004335;
    else if (6022.5101 < valueDouble && valueDouble <= 9312.6715) woeValue = 0.127468;
    else if (9312.6715 < valueDouble && valueDouble <= 12321.1798) woeValue = 0.370575;
    else if (12321.1798 < valueDouble && valueDouble <= 17845.5216) woeValue = 0.745830;
    else if (17845.5216 < valueDouble && valueDouble <= 31120.4927) woeValue = 1.125748;
    else if ( valueDouble > 31120.4927) woeValue = 2.147064;
    else woeValue = 0;}else if(s_ms_cnt_dk_40.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.182230;
    else if (0 < valueDouble && valueDouble <= 0.0003) woeValue = -0.634848;
    else if (0.0003 < valueDouble && valueDouble <= 0.0009) woeValue = -0.611445;
    else if (0.0009 < valueDouble && valueDouble <= 0.0048) woeValue = -0.547915;
    else if (0.0048 < valueDouble && valueDouble <= 0.0558) woeValue = -0.515743;
    else if (0.0558 < valueDouble && valueDouble <= 0.2432) woeValue = -0.326499;
    else if (0.2432 < valueDouble && valueDouble <= 0.3388) woeValue = -0.037176;
    else if (0.3388 < valueDouble && valueDouble <= 0.6497) woeValue = 0.086985;
    else if (0.6497 < valueDouble && valueDouble <= 0.8977) woeValue = 0.497479;
    else if (0.8977 < valueDouble && valueDouble <= 1.1969) woeValue = 0.581778;
    else if (1.1969 < valueDouble && valueDouble <= 2.0837) woeValue = 1.364029;
    else if ( valueDouble > 2.0837) woeValue = 2.604785;
    else woeValue = 0;}else if(s_ratio_avg_dk_320.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = 0.337053;
    else if (-2 < valueDouble && valueDouble <= 0.4632) woeValue = -0.239347;
    else if (0.4632 < valueDouble && valueDouble <= 0.8796) woeValue = -0.097318;
    else if (0.8796 < valueDouble && valueDouble <= 0.9334) woeValue = -0.037804;
    else if (0.9334 < valueDouble && valueDouble <= 6.8801) woeValue = 0.052523;
    else if (6.8801 < valueDouble && valueDouble <= 11.2954) woeValue = 0.187742;
    else if ( valueDouble > 11.2954) woeValue = 0.414891;
    else woeValue = 0;}else if(s_rtrn_decay_180d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.059729;
    else if (0 < valueDouble && valueDouble <= 0.0262815294) woeValue = 0.210482;
    else if (0.0262815294 < valueDouble && valueDouble <= 0.4015559612) woeValue = 0.582538;
    else if ( valueDouble > 0.4015559612) woeValue = 1.318201;
    else woeValue = 0;}else if(seen_same_bankid_30d_90d.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.703101;
    else if ( valueDouble > 0) woeValue = -0.501141;
    else woeValue = 0;}else if(v36_soft_activity_d.getName().equals(varName)){if (value == null) woeValue = 0.825284;
    else if (-1e38 < valueDouble && valueDouble <= 4) woeValue = 0.824016;
    else if (4 < valueDouble && valueDouble <= 6) woeValue = 0.631670;
    else if (6 < valueDouble && valueDouble <= 8) woeValue = 0.390547;
    else if (8 < valueDouble && valueDouble <= 9) woeValue = 0.203620;
    else if (9 < valueDouble && valueDouble <= 11) woeValue = 0.153307;
    else if (11 < valueDouble && valueDouble <= 12) woeValue = 0.065704;
    else if (12 < valueDouble && valueDouble <= 13) woeValue = -0.021616;
    else if (13 < valueDouble && valueDouble <= 16) woeValue = -0.237287;
    else if (16 < valueDouble && valueDouble <= 17) woeValue = -0.299515;
    else if ( valueDouble > 17) woeValue = -0.356170;
    else woeValue = 0;}else if(wach_n_authorized.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.438564;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.183548;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.566994;
    else if ( valueDouble > 2) woeValue = 0.774096;
    else woeValue = 0;}else if(wach_n_inactive.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.199619;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = 1.008723;
    else if ( valueDouble > 1) woeValue = 1.322409;
    else woeValue = 0;}else if(ip_conn_type.getName().equals(varName)){if (Arrays.asList( "oc3","satellite","t1").contains(value)) woeValue = -0.736905;
    else if (Arrays.asList( "dialup","broadband").contains(value)) woeValue = -0.106603;
    else if (Arrays.asList("xdsl").contains(value)) woeValue = -0.031611;
    else if (Arrays.asList("cable").contains(value)) woeValue = 0.200088;
    else if (Arrays.asList( "mobile","wireless").contains(value)) woeValue = 0.732392;
    else woeValue = 0;}else if(primaryach_denomination.getName().equals(varName)){if (Arrays.asList( "AUD","CAD").contains(value)) woeValue = 0.000000;
    else if (Arrays.asList( "USD","EUR","GBP").contains(value)) woeValue = -0.005296;
    else if (Arrays.asList(" ").contains(value)) woeValue = 2.600513;
    else woeValue = 0;}else if(v21_e_dom_score_worst.getName().equals(varName)){if (Arrays.asList( "GOOD").contains(value)) woeValue = -0.514182;
    else if (Arrays.asList( "UNKNOWN").contains(value)) woeValue = -0.371994;
    else if (Arrays.asList( "NO_EMAILS").contains(value)) woeValue = 0.001393;
    else if (Arrays.asList(" ").contains(value)) woeValue = 0.145687;
    else if (Arrays.asList( "MED").contains(value)) woeValue = 0.294952;
    else woeValue = 0;}else if(v3_ip_ad_dist_best.getName().equals(varName)){if (Arrays.asList( "EXACT_DIST").contains(value)) woeValue = -0.187122;
    else if (Arrays.asList( "CLOSE_DIST").contains(value)) woeValue = -0.116896;
    else if (Arrays.asList( "MED_DIST").contains(value)) woeValue = 0.119011;
    else if (Arrays.asList( "","LOW_DIST").contains(value)) woeValue = 0.150600;
    else if (Arrays.asList( "MM_ERROR").contains(value)) woeValue = 0.204377;
    else if (Arrays.asList( "HIGH_DIST").contains(value)) woeValue = 0.673892;
    else if (Arrays.asList( "ULT_DIST").contains(value)) woeValue = 1.664359;
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
    
    coeffMap.put("Intercept",+6.41537663);
    coeffMap.put(days_snc_1st_clrd_ach.getName(),-0.52359788);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.29212358);
    coeffMap.put(num_logins_3_days.getName(),-0.28468936);
    coeffMap.put(s_ms_cnt_dk_40.getName(),-0.25551087);
    coeffMap.put(p90_dys_return.getName(),-0.96751681);
    coeffMap.put(s_amt_dk_80.getName(),-0.39503016);
    coeffMap.put(rt_num_rate.getName(),-0.38181355);
    coeffMap.put(seen_same_bankid_30d_90d.getName(),-0.44989386);
    coeffMap.put(CP20WRtAtoBadTxn.getName(),-0.48838615);
    coeffMap.put(email_MP_dof.getName(),-0.42325448);
    coeffMap.put(ebay_UPIStrike_180d_360all.getName(),-0.37314229);
    coeffMap.put(min_to_s_dof.getName(),-0.32036608);
    coeffMap.put(ach_max_cleared_amt_30days.getName(),-0.91721902);
    coeffMap.put(ebay_dy_snc_sus_min_360all.getName(),-0.43558084);
    coeffMap.put(v36_soft_activity_d.getName(),-0.29368977);
    coeffMap.put(wach_n_inactive.getName(),-0.74409241);
    coeffMap.put(s2r_txnsnt_amt_avg_lst_1_hrs.getName(),-0.31417240);
    coeffMap.put(Decline_rate_ccbin.getName(),-0.59510719);
    coeffMap.put(ip_dof.getName(),-0.33193297);
    coeffMap.put(ebay_dy_1yr_sus_avg_360all.getName(),-0.38125480);
    coeffMap.put(added_ach_lt_1.getName(),-0.41355323);
    coeffMap.put(wach_n_authorized.getName(),-0.37921984);
    coeffMap.put(v21_e_dom_score_worst.getName(),-0.41528366);
    coeffMap.put(last_name_lowcase.getName(),-0.43316915);
    coeffMap.put(s_rtrn_decay_180d_cnt.getName(),-0.55021570);
    coeffMap.put(a_rt_dcl_14dys.getName(),-0.43270354);
    coeffMap.put(cp_ratio_4w_appr_dol.getName(),-0.59191347);
    coeffMap.put(ip_conn_type.getName(),-0.68964108);
    coeffMap.put(email_numofnumeric.getName(),-0.59601238);
    coeffMap.put(is_credit_union.getName(),-0.57734199);
    coeffMap.put(v3_ip_ad_dist_best.getName(),-0.56875437);
    coeffMap.put(s_ratio_avg_dk_320.getName(),-0.53685468);
    coeffMap.put(pst_hour_created.getName(),-0.70968481);
    coeffMap.put(primaryach_denomination.getName(),-0.58344860);
    coeffMap.put(ismobile.getName(),-1.12048429);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 842.33979988;
  }

  @Override
  public double getCoeff2() {
    return  -57.46811879;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT30;
  }
  
}