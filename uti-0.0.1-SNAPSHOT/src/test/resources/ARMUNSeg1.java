package com.paypal.risk.idi.models.arm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.arm.ARMVariableRepository.*;

public class ARMUNSeg1 extends ARMUNAbstractSegment{

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    variables.add(s_ms_cnt_dk_20);
    variables.add(PC_LT50K_Income_CCBIN);
    variables.add(nall_failed_ratio);
    variables.add(r_ratio_avg_dk_40);
    variables.add(s_mobile_decay_1d_cnt);
    variables.add(ip_nb_cnt_pst_1y);
    variables.add(cc_pct_credit_v2);
    variables.add(a_bdrt_txn);
    variables.add(pmt_amt_usd);
    variables.add(Declined_asp_ccbin);
    variables.add(acct_cc_d_amt_dk_80);
    variables.add(max_cross20wRtDclAcc);
    variables.add(prtlamt_to_max_sent_30);
    variables.add(rcvr_cc_d_amt_dk_160);
    variables.add(outamt_to_max_cleard);
    variables.add(s_v_tx_ratio_num);
    variables.add(IP4WRtDolBadTxn);
    variables.add(acct_h_s_cnt_dk_160);
    variables.add(max_txn_amt_ccbin);
    variables.add(is_credit_union);
    variables.add(s_visitor_id_dof);
    variables.add(s_amt_dk_10);
    variables.add(s_rtrn_decay_90d_cnt);
    variables.add(email_MP_7d_UPIA_dk);
    variables.add(s_mp_amt_dk_20);
    variables.add(seconds_since_last_return);
    variables.add(v36_d_sn_prev_login);
    variables.add(ED20WRtCcBadAcc);
    variables.add(vid_nb_cnt_pst_1y);
    variables.add(s_cctrans_complt_amt);


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

    if(Declined_asp_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 3561.024253) woeValue = 0.995340;
    else if (3561.024253 < valueDouble && valueDouble <= 3922.9205081) woeValue = 0.474006;
    else if (3922.9205081 < valueDouble && valueDouble <= 4164.1590335) woeValue = 0.349119;
    else if (4164.1590335 < valueDouble && valueDouble <= 4765.3005464) woeValue = 0.239131;
    else if (4765.3005464 < valueDouble && valueDouble <= 11018.031882) woeValue = -0.112164;
    else if (11018.031882 < valueDouble && valueDouble <= 13730.098322) woeValue = -0.485030;
    else if ( valueDouble > 13730.098322) woeValue = -0.797388;
    else woeValue = 0;}else if(ED20WRtCcBadAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.001) woeValue = -0.498010;
    else if (0.001 < valueDouble && valueDouble <= 0.0015) woeValue = 0.083661;
    else if ( valueDouble > 0.0015) woeValue = 0.572988;
    else woeValue = 0;}else if(IP4WRtDolBadTxn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.3816) woeValue = -0.065264;
    else if (0.3816 < valueDouble && valueDouble <= 0.6905) woeValue = 0.359092;
    else if ( valueDouble > 0.6905) woeValue = 0.693903;
    else woeValue = 0;}else if(PC_LT50K_Income_CCBIN.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0489197609) woeValue = -0.909939;
    else if (0.0489197609 < valueDouble && valueDouble <= 0.0996996997) woeValue = -0.239749;
    else if (0.0996996997 < valueDouble && valueDouble <= 0.1137724551) woeValue = -0.145300;
    else if (0.1137724551 < valueDouble && valueDouble <= 0.1388739946) woeValue = 0.168156;
    else if (0.1388739946 < valueDouble && valueDouble <= 0.1485148515) woeValue = 0.870860;
    else if (0.1485148515 < valueDouble && valueDouble <= 0.1720536271) woeValue = 1.122807;
    else if ( valueDouble > 0.1720536271) woeValue = 1.570573;
    else woeValue = 0;}else if(a_bdrt_txn.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.331475;
    else if (0 < valueDouble && valueDouble <= 0.00086) woeValue = -0.444532;
    else if (0.00086 < valueDouble && valueDouble <= 0.00109) woeValue = -0.310864;
    else if (0.00109 < valueDouble && valueDouble <= 0.04587) woeValue = 0.171369;
    else if (0.04587 < valueDouble && valueDouble <= 0.13053) woeValue = 1.158552;
    else if ( valueDouble > 0.13053) woeValue = 2.595858;
    else woeValue = 0;}else if(acct_cc_d_amt_dk_80.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.619797;
    else if (0 < valueDouble && valueDouble <= 0.0001) woeValue = -0.041586;
    else if (0.0001 < valueDouble && valueDouble <= 0.0127) woeValue = 0.270859;
    else if (0.0127 < valueDouble && valueDouble <= 251.8822) woeValue = 0.537823;
    else if (251.8822 < valueDouble && valueDouble <= 489.3864) woeValue = 0.592335;
    else if (489.3864 < valueDouble && valueDouble <= 1723.5263) woeValue = 0.705855;
    else if (1723.5263 < valueDouble && valueDouble <= 7677.546) woeValue = 0.857659;
    else if (7677.546 < valueDouble && valueDouble <= 23292.1404) woeValue = 1.606325;
    else if ( valueDouble > 23292.1404) woeValue = 1.816917;
    else woeValue = 0;}else if(acct_h_s_cnt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.284773;
    else if (0 < valueDouble && valueDouble <= 0.0039) woeValue = 0.401408;
    else if (0.0039 < valueDouble && valueDouble <= 0.0321) woeValue = -0.029695;
    else if (0.0321 < valueDouble && valueDouble <= 0.3032) woeValue = -0.273173;
    else if (0.3032 < valueDouble && valueDouble <= 1.5006) woeValue = -0.727997;
    else if ( valueDouble > 1.5006) woeValue = -0.895572;
    else woeValue = 0;}else if(cc_pct_credit_v2.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = 0.000000;
    else if (-1 < valueDouble && valueDouble <= 0.12) woeValue = 0.313289;
    else if (0.12 < valueDouble && valueDouble <= 0.25) woeValue = -0.060377;
    else if (0.25 < valueDouble && valueDouble <= 0.5) woeValue = -0.388812;
    else if (0.5 < valueDouble && valueDouble <= 0.9714285714) woeValue = -0.522355;
    else if ( valueDouble > 0.9714285714) woeValue = -1.151872;
    else woeValue = 0;}else if(email_MP_7d_UPIA_dk.getName().equals(varName)){if (value == null) woeValue = 0.422992;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.544219;
    else if (0 < valueDouble && valueDouble <= 0.0005940355) woeValue = -0.429081;
    else if (0.0005940355 < valueDouble && valueDouble <= 1.8157670836) woeValue = -0.109631;
    else if ( valueDouble > 1.8157670836) woeValue = 1.857098;
    else woeValue = 0;}else if(ip_nb_cnt_pst_1y.getName().equals(varName)){if (value == null) woeValue = 0.060131;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.908089;
    else if (0 < valueDouble && valueDouble <= 1) woeValue = -0.073245;
    else if (1 < valueDouble && valueDouble <= 2) woeValue = 0.055295;
    else if ( valueDouble > 2) woeValue = 0.156818;
    else woeValue = 0;}else if(is_credit_union.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.068705;
    else if ( valueDouble > 0) woeValue = -0.468022;
    else woeValue = 0;}else if(max_cross20wRtDclAcc.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.0353) woeValue = -0.604274;
    else if (0.0353 < valueDouble && valueDouble <= 0.0489) woeValue = -0.301923;
    else if (0.0489 < valueDouble && valueDouble <= 0.0533) woeValue = -0.135670;
    else if (0.0533 < valueDouble && valueDouble <= 0.0926) woeValue = 0.112919;
    else if (0.0926 < valueDouble && valueDouble <= 0.2497) woeValue = 0.375314;
    else if (0.2497 < valueDouble && valueDouble <= 0.3333) woeValue = 0.544564;
    else if (0.3333 < valueDouble && valueDouble <= 0.6154) woeValue = 0.833750;
    else if ( valueDouble > 0.6154) woeValue = 1.764880;
    else woeValue = 0;}else if(max_txn_amt_ccbin.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 500314) woeValue = 0.175329;
    else if (500314 < valueDouble && valueDouble <= 993789) woeValue = -0.009392;
    else if (993789 < valueDouble && valueDouble <= 1097571) woeValue = -0.064861;
    else if (1097571 < valueDouble && valueDouble <= 3643506) woeValue = -0.221150;
    else if ( valueDouble > 3643506) woeValue = -0.564166;
    else woeValue = 0;}else if(nall_failed_ratio.getName().equals(varName)){if (value == null) woeValue = 0.496701;
    else if (-1e38 < valueDouble && valueDouble <= 0.2) woeValue = -0.942451;
    else if (0.2 < valueDouble && valueDouble <= 0.3333333333) woeValue = -0.470654;
    else if (0.3333333333 < valueDouble && valueDouble <= 0.5217391304) woeValue = -0.354106;
    else if (0.5217391304 < valueDouble && valueDouble <= 0.8333333333) woeValue = -0.194739;
    else if (0.8333333333 < valueDouble && valueDouble <= 2.081300813) woeValue = -0.022836;
    else if ( valueDouble > 2.081300813) woeValue = 0.356898;
    else woeValue = 0;}else if(outamt_to_max_cleard.getName().equals(varName)){if (value == null) woeValue = 2.135799;
    else if (-1e38 < valueDouble && valueDouble <= 0.1548595708) woeValue = -0.895631;
    else if (0.1548595708 < valueDouble && valueDouble <= 0.2016806723) woeValue = -0.850740;
    else if (0.2016806723 < valueDouble && valueDouble <= 0.3955609736) woeValue = -0.798454;
    else if (0.3955609736 < valueDouble && valueDouble <= 0.7199424046) woeValue = -0.546320;
    else if (0.7199424046 < valueDouble && valueDouble <= 0.9613562471) woeValue = -0.357532;
    else if (0.9613562471 < valueDouble && valueDouble <= 1.7753786328) woeValue = -0.016016;
    else if (1.7753786328 < valueDouble && valueDouble <= 2.1038593655) woeValue = 0.393266;
    else if (2.1038593655 < valueDouble && valueDouble <= 2.6010404162) woeValue = 0.414350;
    else if (2.6010404162 < valueDouble && valueDouble <= 3.4015444015) woeValue = 0.716179;
    else if (3.4015444015 < valueDouble && valueDouble <= 8.5526974148) woeValue = 1.220474;
    else if ( valueDouble > 8.5526974148) woeValue = 2.834489;
    else woeValue = 0;}else if(pmt_amt_usd.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 595) woeValue = -0.559918;
    else if (595 < valueDouble && valueDouble <= 649) woeValue = -0.508984;
    else if (649 < valueDouble && valueDouble <= 789) woeValue = -0.465536;
    else if (789 < valueDouble && valueDouble <= 2915) woeValue = -0.092900;
    else if (2915 < valueDouble && valueDouble <= 3952) woeValue = -0.003055;
    else if (3952 < valueDouble && valueDouble <= 4717) woeValue = 0.076830;
    else if (4717 < valueDouble && valueDouble <= 7250) woeValue = 0.136608;
    else if (7250 < valueDouble && valueDouble <= 12048) woeValue = 0.389406;
    else if (12048 < valueDouble && valueDouble <= 15580) woeValue = 0.607312;
    else if (15580 < valueDouble && valueDouble <= 21495) woeValue = 0.619333;
    else if (21495 < valueDouble && valueDouble <= 36505) woeValue = 0.898672;
    else if ( valueDouble > 36505) woeValue = 1.230266;
    else woeValue = 0;}else if(prtlamt_to_max_sent_30.getName().equals(varName)){if (value == null) woeValue = 0.320804;
    else if (-1e38 < valueDouble && valueDouble <= 0.0798973729) woeValue = -0.477944;
    else if (0.0798973729 < valueDouble && valueDouble <= 0.1890012642) woeValue = -0.405310;
    else if (0.1890012642 < valueDouble && valueDouble <= 0.237955762) woeValue = -0.355301;
    else if (0.237955762 < valueDouble && valueDouble <= 0.3262556145) woeValue = -0.174742;
    else if (0.3262556145 < valueDouble && valueDouble <= 0.6617270789) woeValue = -0.085205;
    else if (0.6617270789 < valueDouble && valueDouble <= 0.9712062257) woeValue = 0.097623;
    else if (0.9712062257 < valueDouble && valueDouble <= 6.7110862262) woeValue = 0.561850;
    else if ( valueDouble > 6.7110862262) woeValue = 0.993931;
    else woeValue = 0;}else if(r_ratio_avg_dk_40.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= -2) woeValue = 0.000000;
    else if (-2 < valueDouble && valueDouble <= 0.545) woeValue = -0.552219;
    else if (0.545 < valueDouble && valueDouble <= 0.6786) woeValue = -0.306528;
    else if (0.6786 < valueDouble && valueDouble <= 0.9973) woeValue = -0.159097;
    else if (0.9973 < valueDouble && valueDouble <= 1.288) woeValue = -0.019637;
    else if (1.288 < valueDouble && valueDouble <= 2.3015) woeValue = 0.191823;
    else if (2.3015 < valueDouble && valueDouble <= 3.4218) woeValue = 0.305654;
    else if (3.4218 < valueDouble && valueDouble <= 5.0444) woeValue = 0.559939;
    else if ( valueDouble > 5.0444) woeValue = 0.586887;
    else woeValue = 0;}else if(rcvr_cc_d_amt_dk_160.getName().equals(varName)){if (value == null) woeValue = 0;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.306032;
    else if (0 < valueDouble && valueDouble <= 0.0005) woeValue = -0.519534;
    else if (0.0005 < valueDouble && valueDouble <= 1888.7806) woeValue = -0.409055;
    else if (1888.7806 < valueDouble && valueDouble <= 9807.6748) woeValue = -0.396153;
    else if (9807.6748 < valueDouble && valueDouble <= 34899.0444) woeValue = -0.138769;
    else if (34899.0444 < valueDouble && valueDouble <= 183028.6156) woeValue = 0.202008;
    else if (183028.6156 < valueDouble && valueDouble <= 2682990.8837) woeValue = 0.610534;
    else if ( valueDouble > 2682990.8837) woeValue = 1.507957;
    else woeValue = 0;}else if(s_amt_dk_10.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.196445;
    else if (0 < valueDouble && valueDouble <= 0.0009) woeValue = -0.629020;
    else if (0.0009 < valueDouble && valueDouble <= 694.6345) woeValue = -0.485035;
    else if (694.6345 < valueDouble && valueDouble <= 1522.0085) woeValue = -0.342615;
    else if (1522.0085 < valueDouble && valueDouble <= 3670.901) woeValue = -0.233456;
    else if (3670.901 < valueDouble && valueDouble <= 6676.128) woeValue = 0.067996;
    else if (6676.128 < valueDouble && valueDouble <= 11203.7951) woeValue = 0.472071;
    else if (11203.7951 < valueDouble && valueDouble <= 15691.5672) woeValue = 0.718156;
    else if (15691.5672 < valueDouble && valueDouble <= 23771.0108) woeValue = 1.106788;
    else if (23771.0108 < valueDouble && valueDouble <= 45814.1798) woeValue = 1.624245;
    else if ( valueDouble > 45814.1798) woeValue = 2.311783;
    else woeValue = 0;}else if(s_cctrans_complt_amt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 1.521606;
    else if (0 < valueDouble && valueDouble <= 1059) woeValue = 0.962262;
    else if (1059 < valueDouble && valueDouble <= 7510) woeValue = 0.628319;
    else if (7510 < valueDouble && valueDouble <= 45810) woeValue = 0.385023;
    else if (45810 < valueDouble && valueDouble <= 51818) woeValue = 0.198736;
    else if (51818 < valueDouble && valueDouble <= 81614) woeValue = 0.020277;
    else if (81614 < valueDouble && valueDouble <= 111816) woeValue = -0.127099;
    else if (111816 < valueDouble && valueDouble <= 180759) woeValue = -0.455088;
    else if (180759 < valueDouble && valueDouble <= 216992) woeValue = -0.462280;
    else if (216992 < valueDouble && valueDouble <= 2940284) woeValue = -0.596576;
    else if ( valueDouble > 2940284) woeValue = -1.142206;
    else woeValue = 0;}else if(s_mobile_decay_1d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.000000;
    else if (0 < valueDouble && valueDouble <= 0.0062433497) woeValue = -0.312809;
    else if (0.0062433497 < valueDouble && valueDouble <= 0.587139346) woeValue = -0.300930;
    else if ( valueDouble > 0.587139346) woeValue = 0.874230;
    else woeValue = 0;}else if(s_mp_amt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.347105;
    else if (0 < valueDouble && valueDouble <= 1328.2968) woeValue = -0.880529;
    else if (1328.2968 < valueDouble && valueDouble <= 2646.5596) woeValue = -0.670589;
    else if (2646.5596 < valueDouble && valueDouble <= 4255.657) woeValue = -0.595496;
    else if (4255.657 < valueDouble && valueDouble <= 5518.7693) woeValue = -0.552524;
    else if (5518.7693 < valueDouble && valueDouble <= 7406.6241) woeValue = -0.134374;
    else if (7406.6241 < valueDouble && valueDouble <= 10583.6732) woeValue = -0.017622;
    else if (10583.6732 < valueDouble && valueDouble <= 16543.5119) woeValue = 0.573379;
    else if (16543.5119 < valueDouble && valueDouble <= 32518.4144) woeValue = 0.602860;
    else if ( valueDouble > 32518.4144) woeValue = 1.890433;
    else woeValue = 0;}else if(s_ms_cnt_dk_20.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.315029;
    else if (0 < valueDouble && valueDouble <= 0.0013) woeValue = -0.620314;
    else if (0.0013 < valueDouble && valueDouble <= 0.2187) woeValue = -0.258777;
    else if (0.2187 < valueDouble && valueDouble <= 0.6928) woeValue = 0.013206;
    else if (0.6928 < valueDouble && valueDouble <= 0.9833) woeValue = 0.207160;
    else if (0.9833 < valueDouble && valueDouble <= 1.3012) woeValue = 0.366496;
    else if (1.3012 < valueDouble && valueDouble <= 1.779) woeValue = 0.628622;
    else if (1.779 < valueDouble && valueDouble <= 2.2554) woeValue = 0.801988;
    else if (2.2554 < valueDouble && valueDouble <= 3.3059) woeValue = 0.955142;
    else if (3.3059 < valueDouble && valueDouble <= 5.6858) woeValue = 1.488471;
    else if ( valueDouble > 5.6858) woeValue = 2.438394;
    else woeValue = 0;}else if(s_rtrn_decay_90d_cnt.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -0.394947;
    else if (0 < valueDouble && valueDouble <= 0.0000695462) woeValue = -1.312669;
    else if (0.0000695462 < valueDouble && valueDouble <= 0.0241801744) woeValue = -0.534553;
    else if (0.0241801744 < valueDouble && valueDouble <= 0.0721296066) woeValue = -0.269215;
    else if (0.0721296066 < valueDouble && valueDouble <= 1.8908472037) woeValue = -0.260944;
    else if (1.8908472037 < valueDouble && valueDouble <= 2.6845326835) woeValue = 0.185714;
    else if (2.6845326835 < valueDouble && valueDouble <= 3.70216651) woeValue = 0.290266;
    else if (3.70216651 < valueDouble && valueDouble <= 9.8267913027) woeValue = 0.491634;
    else if (9.8267913027 < valueDouble && valueDouble <= 15.729329891) woeValue = 1.296104;
    else if ( valueDouble > 15.729329891) woeValue = 1.331832;
    else woeValue = 0;}else if(s_v_tx_ratio_num.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0.3325183374) woeValue = 3.180164;
    else if (0.3325183374 < valueDouble && valueDouble <= 0.4807692308) woeValue = 2.142734;
    else if (0.4807692308 < valueDouble && valueDouble <= 0.55) woeValue = 1.323167;
    else if (0.55 < valueDouble && valueDouble <= 0.599469496) woeValue = 1.218972;
    else if (0.599469496 < valueDouble && valueDouble <= 0.7099236641) woeValue = 0.950580;
    else if (0.7099236641 < valueDouble && valueDouble <= 0.756097561) woeValue = 0.399306;
    else if (0.756097561 < valueDouble && valueDouble <= 0.8196202532) woeValue = 0.052346;
    else if (0.8196202532 < valueDouble && valueDouble <= 0.8888888889) woeValue = -0.413324;
    else if (0.8888888889 < valueDouble && valueDouble <= 0.9107142857) woeValue = -0.841066;
    else if (0.9107142857 < valueDouble && valueDouble <= 0.9165424739) woeValue = -0.858476;
    else if (0.9165424739 < valueDouble && valueDouble <= 0.9433701657) woeValue = -0.999679;
    else if ( valueDouble > 0.9433701657) woeValue = -1.166789;
    else woeValue = 0;}else if(s_visitor_id_dof.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = 0.241185;
    else if (0 < valueDouble && valueDouble <= 10) woeValue = 0.490183;
    else if (10 < valueDouble && valueDouble <= 87) woeValue = -0.218020;
    else if (87 < valueDouble && valueDouble <= 301) woeValue = -0.711711;
    else if (301 < valueDouble && valueDouble <= 531) woeValue = -0.944798;
    else if ( valueDouble > 531) woeValue = -1.025311;
    else woeValue = 0;}else if(seconds_since_last_return.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= -1) woeValue = -0.839719;
    else if (-1 < valueDouble && valueDouble <= 63417) woeValue = 1.664917;
    else if (63417 < valueDouble && valueDouble <= 204037) woeValue = 1.307923;
    else if (204037 < valueDouble && valueDouble <= 288085) woeValue = 1.209436;
    else if (288085 < valueDouble && valueDouble <= 376821) woeValue = 0.505290;
    else if (376821 < valueDouble && valueDouble <= 471389) woeValue = 0.233240;
    else if ( valueDouble > 471389) woeValue = -0.082420;
    else woeValue = 0;}else if(v36_d_sn_prev_login.getName().equals(varName)){if (value == null) woeValue = 0.808255;
    else if (-1e38 < valueDouble && valueDouble <= 26.026400463) woeValue = -0.236982;
    else if (26.026400463 < valueDouble && valueDouble <= 42.927002315) woeValue = 0.000711;
    else if (42.927002315 < valueDouble && valueDouble <= 58.653981481) woeValue = 0.165051;
    else if ( valueDouble > 58.653981481) woeValue = 0.325033;
    else woeValue = 0;}else if(vid_nb_cnt_pst_1y.getName().equals(varName)){if (value == null) woeValue = 0.000000;
    else if (-1e38 < valueDouble && valueDouble <= 0) woeValue = -1.100094;
    else if ( valueDouble > 0) woeValue = 0.500626;
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
    
    coeffMap.put("Intercept",+2.88751067);
    coeffMap.put(outamt_to_max_cleard.getName(),-0.35964499);
    coeffMap.put(s_v_tx_ratio_num.getName(),-0.25071912);
    coeffMap.put(seconds_since_last_return.getName(),-0.77496493);
    coeffMap.put(acct_h_s_cnt_dk_160.getName(),-0.86079203);
    coeffMap.put(s_ms_cnt_dk_20.getName(),-0.37355279);
    coeffMap.put(a_bdrt_txn.getName(),-0.36601307);
    coeffMap.put(s_mp_amt_dk_20.getName(),-0.28181036);
    coeffMap.put(prtlamt_to_max_sent_30.getName(),-0.52510226);
    coeffMap.put(PC_LT50K_Income_CCBIN.getName(),-0.33615758);
    coeffMap.put(acct_cc_d_amt_dk_80.getName(),-0.37038277);
    coeffMap.put(rcvr_cc_d_amt_dk_160.getName(),-0.56029483);
    coeffMap.put(nall_failed_ratio.getName(),-0.42606936);
    coeffMap.put(s_cctrans_complt_amt.getName(),-0.42596213);
    coeffMap.put(cc_pct_credit_v2.getName(),-0.46382276);
    coeffMap.put(email_MP_7d_UPIA_dk.getName(),-0.34732134);
    coeffMap.put(s_visitor_id_dof.getName(),-0.40932661);
    coeffMap.put(v36_d_sn_prev_login.getName(),-0.41581988);
    coeffMap.put(pmt_amt_usd.getName(),-0.31489382);
    coeffMap.put(max_cross20wRtDclAcc.getName(),-0.32056548);
    coeffMap.put(ED20WRtCcBadAcc.getName(),-0.47420066);
    coeffMap.put(is_credit_union.getName(),-0.44485971);
    coeffMap.put(ip_nb_cnt_pst_1y.getName(),-0.68413166);
    coeffMap.put(s_rtrn_decay_90d_cnt.getName(),-0.57074612);
    coeffMap.put(s_amt_dk_10.getName(),-0.22207434);
    coeffMap.put(IP4WRtDolBadTxn.getName(),-0.81823655);
    coeffMap.put(Declined_asp_ccbin.getName(),-0.30517588);
    coeffMap.put(max_txn_amt_ccbin.getName(),-0.31350229);
    coeffMap.put(s_mobile_decay_1d_cnt.getName(),-0.16426454);
    coeffMap.put(r_ratio_avg_dk_40.getName(),-0.40258770);
    coeffMap.put(vid_nb_cnt_pst_1y.getName(),-0.67931243);

    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return 843.2598602;
  }

  @Override
  public double getCoeff2() {
    return  -56.74787317;
  }

  @Override
  public ARMUNSegmentType getSegmentType() {
    return ARMUNSegmentType.ARMUN_SEGMENT1;
  }
  
}