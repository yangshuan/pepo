if NumOfIP4s = . then wNumOfIP4s_s2 =  0.432173;
else if ( -1e38 < NumOfIP4s <= 2 ) then wNumOfIP4s_s2 =  0.553762;
else if ( 2 < NumOfIP4s <= 3 ) then wNumOfIP4s_s2 =  0.130672;
else if ( 3 < NumOfIP4s <= 6 ) then wNumOfIP4s_s2 = -0.085352;
else if ( 6 < NumOfIP4s <= 11 ) then wNumOfIP4s_s2 = -0.432353;
else if ( 11 < NumOfIP4s <= 13 ) then wNumOfIP4s_s2 = -0.794323;
else if ( 13 < NumOfIP4s <= 18 ) then wNumOfIP4s_s2 = -1.126937;
else if ( 18 < NumOfIP4s <= 22 ) then wNumOfIP4s_s2 = -1.127172;
else if ( 22 < NumOfIP4s <= 29 ) then wNumOfIP4s_s2 = -1.156533;
else if ( NumOfIP4s > 29 ) then wNumOfIP4s_s2 = -1.627278;
else wNumOfIP4s_s2 = 0;
 
if RADD_TIMEZONE_3_2 = . then wRADD_TIMEZONE_3_2_s2 = -0.216897;
else if ( -1e38 < RADD_TIMEZONE_3_2 <= -5 ) then wRADD_TIMEZONE_3_2_s2 =  0.255351;
else if ( -5 < RADD_TIMEZONE_3_2 <= 0 ) then wRADD_TIMEZONE_3_2_s2 =  0.596195;
else if ( 0 < RADD_TIMEZONE_3_2 <= 13 ) then wRADD_TIMEZONE_3_2_s2 =  1.144881;
else if ( RADD_TIMEZONE_3_2 > 13 ) then wRADD_TIMEZONE_3_2_s2 = -0.083213;
else wRADD_TIMEZONE_3_2_s2 = 0;
 
if RADD_TIMEZONE_3_3 = . then wRADD_TIMEZONE_3_3_s2 = -0.102465;
else if ( -1e38 < RADD_TIMEZONE_3_3 <= -5 ) then wRADD_TIMEZONE_3_3_s2 =  0.805630;
else if ( -5 < RADD_TIMEZONE_3_3 <= -4 ) then wRADD_TIMEZONE_3_3_s2 =  0.850898;
else if ( -4 < RADD_TIMEZONE_3_3 <= 1 ) then wRADD_TIMEZONE_3_3_s2 =  1.850645;
else if ( 1 < RADD_TIMEZONE_3_3 <= 13 ) then wRADD_TIMEZONE_3_3_s2 =  1.950565;
else if ( RADD_TIMEZONE_3_3 > 13 ) then wRADD_TIMEZONE_3_3_s2 =  0.308973;
else wRADD_TIMEZONE_3_3_s2 = 0;
 
if RADD_TIMEZONE_PCT_3_3 = . then wRADD_TIMEZONE_PCT_3_3_s2 =  0.231394;
else if ( -1e38 < RADD_TIMEZONE_PCT_3_3 <= 0 ) then wRADD_TIMEZONE_PCT_3_3_s2 = -0.139558;
else if ( RADD_TIMEZONE_PCT_3_3 > 0 ) then wRADD_TIMEZONE_PCT_3_3_s2 =  1.887901;
else wRADD_TIMEZONE_PCT_3_3_s2 = 0;
 
if acct_login_f_cnt_dk_160 = . then wacct_login_f_cnt_dk_160_s2 =  0.000000;
else if ( -1e38 < acct_login_f_cnt_dk_160 <= 0 ) then wacct_login_f_cnt_dk_160_s2 =  0.249146;
else if ( 0 < acct_login_f_cnt_dk_160 <= 2.9737928316 ) then wacct_login_f_cnt_dk_160_s2 = -0.188609;
else if ( 2.9737928316 < acct_login_f_cnt_dk_160 <= 4.3932891439 ) then wacct_login_f_cnt_dk_160_s2 = -0.149775;
else if ( 4.3932891439 < acct_login_f_cnt_dk_160 <= 5.9996892481 ) then wacct_login_f_cnt_dk_160_s2 =  0.127128;
else if ( acct_login_f_cnt_dk_160 > 5.9996892481 ) then wacct_login_f_cnt_dk_160_s2 =  0.253462;
else wacct_login_f_cnt_dk_160_s2 = 0;
 
if asn_amt_dk_2 = . then wasn_amt_dk_2_s2 =  0.608921;
else if ( -1e38 < asn_amt_dk_2 <= -38947600.11 ) then wasn_amt_dk_2_s2 = -0.427669;
else if ( -38947600.11 < asn_amt_dk_2 <= -9354278.424 ) then wasn_amt_dk_2_s2 = -0.403955;
else if ( -9354278.424 < asn_amt_dk_2 <= -6657261.247 ) then wasn_amt_dk_2_s2 = -0.207701;
else if ( -6657261.247 < asn_amt_dk_2 <= -2741786.606 ) then wasn_amt_dk_2_s2 =  0.169520;
else if ( -2741786.606 < asn_amt_dk_2 <= -2008964.229 ) then wasn_amt_dk_2_s2 =  0.360591;
else if ( -2008964.229 < asn_amt_dk_2 <= -979602.8072 ) then wasn_amt_dk_2_s2 =  0.584194;
else if ( -979602.8072 < asn_amt_dk_2 <= -356221.4439 ) then wasn_amt_dk_2_s2 =  0.809341;
else if ( -356221.4439 < asn_amt_dk_2 <= -91532.91167 ) then wasn_amt_dk_2_s2 =  1.048527;
else if ( -91532.91167 < asn_amt_dk_2 <= -30375.73882 ) then wasn_amt_dk_2_s2 =  1.058505;
else if ( asn_amt_dk_2 > -30375.73882 ) then wasn_amt_dk_2_s2 =  1.131639;
else wasn_amt_dk_2_s2 = 0;
 
if asn_inf_cidr_rate = . then wasn_inf_cidr_rate_s2 =  0.000000;
else if ( -1e38 < asn_inf_cidr_rate <= 112.3595 ) then wasn_inf_cidr_rate_s2 = -0.781864;
else if ( 112.3595 < asn_inf_cidr_rate <= 331.5881 ) then wasn_inf_cidr_rate_s2 = -0.746214;
else if ( 331.5881 < asn_inf_cidr_rate <= 415.0943 ) then wasn_inf_cidr_rate_s2 = -0.683336;
else if ( 415.0943 < asn_inf_cidr_rate <= 553.6332 ) then wasn_inf_cidr_rate_s2 = -0.380406;
else if ( 553.6332 < asn_inf_cidr_rate <= 567.3758 ) then wasn_inf_cidr_rate_s2 = -0.105260;
else if ( 567.3758 < asn_inf_cidr_rate <= 707.8039 ) then wasn_inf_cidr_rate_s2 =  0.086032;
else if ( 707.8039 < asn_inf_cidr_rate <= 1265.8227 ) then wasn_inf_cidr_rate_s2 =  0.098334;
else if ( 1265.8227 < asn_inf_cidr_rate <= 4846.4163 ) then wasn_inf_cidr_rate_s2 =  0.234765;
else if ( asn_inf_cidr_rate > 4846.4163 ) then wasn_inf_cidr_rate_s2 =  0.768797;
else wasn_inf_cidr_rate_s2 = 0;
 
if ato_good_sum_amt_txn = . then wato_good_sum_amt_txn_s2 =  0.087928;
else if ( -1e38 < ato_good_sum_amt_txn <= -1231427 ) then wato_good_sum_amt_txn_s2 = -1.644593;
else if ( -1231427 < ato_good_sum_amt_txn <= -261463 ) then wato_good_sum_amt_txn_s2 = -0.840020;
else if ( -261463 < ato_good_sum_amt_txn <= -42882 ) then wato_good_sum_amt_txn_s2 = -0.662203;
else if ( -42882 < ato_good_sum_amt_txn <= -38773 ) then wato_good_sum_amt_txn_s2 = -0.493577;
else if ( -38773 < ato_good_sum_amt_txn <= -1250 ) then wato_good_sum_amt_txn_s2 = -0.343253;
else if ( ato_good_sum_amt_txn > -1250 ) then wato_good_sum_amt_txn_s2 = -0.114678;
else wato_good_sum_amt_txn_s2 = 0;
 
if ato_log_phone_primary_set004 = . then wato_log_phone_primar_t004_s2 =  0.000000;
else if ( -1e38 < ato_log_phone_primary_set004 <= 0 ) then wato_log_phone_primar_t004_s2 =  0.016162;
else if ( 0 < ato_log_phone_primary_set004 <= 1 ) then wato_log_phone_primar_t004_s2 = -0.366367;
else if ( ato_log_phone_primary_set004 > 1 ) then wato_log_phone_primar_t004_s2 =  0.377276;
else wato_log_phone_primar_t004_s2 = 0;
 
if c_cat = . then wc_cat_s2 =  0.000000;
else if ( -1e38 < c_cat <= 0 ) then wc_cat_s2 =  0.637030;
else if ( 0 < c_cat <= 10 ) then wc_cat_s2 =  0.036630;
else if ( 10 < c_cat <= 58 ) then wc_cat_s2 = -0.020174;
else if ( 58 < c_cat <= 74 ) then wc_cat_s2 = -0.112022;
else if ( 74 < c_cat <= 91 ) then wc_cat_s2 = -0.243250;
else if ( 91 < c_cat <= 96 ) then wc_cat_s2 = -0.934123;
else if ( c_cat > 96 ) then wc_cat_s2 = -1.325402;
else wc_cat_s2 = 0;
 
if cc_control_txn = . then wcc_control_txn_s2 =  0.000000;
else if ( -1e38 < cc_control_txn <= 0 ) then wcc_control_txn_s2 = -0.012610;
else if ( cc_control_txn > 0 ) then wcc_control_txn_s2 =  0.945100;
else wcc_control_txn_s2 = 0;
 
if cc_control_user = . then wcc_control_user_s2 =  0.000000;
else if ( -1e38 < cc_control_user <= 0 ) then wcc_control_user_s2 = -0.021410;
else if ( cc_control_user > 0 ) then wcc_control_user_s2 =  1.263657;
else wcc_control_user_s2 = 0;
 
if cidr_inf_rate = . then wcidr_inf_rate_s2 =  0.000000;
else if ( -1e38 < cidr_inf_rate <= 0.0166 ) then wcidr_inf_rate_s2 = -1.062686;
else if ( 0.0166 < cidr_inf_rate <= 0.2861 ) then wcidr_inf_rate_s2 = -0.527777;
else if ( 0.2861 < cidr_inf_rate <= 0.4386 ) then wcidr_inf_rate_s2 = -0.167130;
else if ( 0.4386 < cidr_inf_rate <= 0.4577 ) then wcidr_inf_rate_s2 = -0.089400;
else if ( 0.4577 < cidr_inf_rate <= 0.6866 ) then wcidr_inf_rate_s2 =  0.292896;
else if ( 0.6866 < cidr_inf_rate <= 10.0708 ) then wcidr_inf_rate_s2 =  0.454048;
else if ( cidr_inf_rate > 10.0708 ) then wcidr_inf_rate_s2 =  1.265381;
else wcidr_inf_rate_s2 = 0;
 
if ebay_flag = . then webay_flag_s2 =  0.000000;
else if ( -1e38 < ebay_flag <= 0 ) then webay_flag_s2 =  0.534795;
else if ( ebay_flag > 0 ) then webay_flag_s2 = -0.779801;
else webay_flag_s2 = 0;
 
if fso_num_spoof_txns = . then wfso_num_spoof_txns_s2 = -0.344689;
else if ( -1e38 < fso_num_spoof_txns <= 0 ) then wfso_num_spoof_txns_s2 =  0.024428;
else if ( fso_num_spoof_txns > 0 ) then wfso_num_spoof_txns_s2 =  2.440797;
else wfso_num_spoof_txns_s2 = 0;
 
if ip20wRtDolAtoBadTxn = . then wip20wRtDolAtoBadTxn_s2 =  0.000000;
else if ( -1e38 < ip20wRtDolAtoBadTxn <= 0 ) then wip20wRtDolAtoBadTxn_s2 = -0.330564;
else if ( 0 < ip20wRtDolAtoBadTxn <= 0.0004 ) then wip20wRtDolAtoBadTxn_s2 = -0.687785;
else if ( 0.0004 < ip20wRtDolAtoBadTxn <= 0.0016 ) then wip20wRtDolAtoBadTxn_s2 = -0.428869;
else if ( 0.0016 < ip20wRtDolAtoBadTxn <= 0.0017 ) then wip20wRtDolAtoBadTxn_s2 =  0.352975;
else if ( ip20wRtDolAtoBadTxn > 0.0017 ) then wip20wRtDolAtoBadTxn_s2 =  1.590070;
else wip20wRtDolAtoBadTxn_s2 = 0;
 
if ip4wRtCcXbrBadTxn = . then wip4wRtCcXbrBadTxn_s2 =  0.000000;
else if ( -1e38 < ip4wRtCcXbrBadTxn <= 0 ) then wip4wRtCcXbrBadTxn_s2 = -0.166618;
else if ( 0 < ip4wRtCcXbrBadTxn <= 0.0007 ) then wip4wRtCcXbrBadTxn_s2 =  0.144550;
else if ( ip4wRtCcXbrBadTxn > 0.0007 ) then wip4wRtCcXbrBadTxn_s2 =  0.270019;
else wip4wRtCcXbrBadTxn_s2 = 0;
 
if ip_login_f_cnt_dk_5 = . then wip_login_f_cnt_dk_5_s2 = -4.000000;
else if ( -1e38 < ip_login_f_cnt_dk_5 <= 0 ) then wip_login_f_cnt_dk_5_s2 = -0.372454;
else if ( 0 < ip_login_f_cnt_dk_5 <= 1.0000018188 ) then wip_login_f_cnt_dk_5_s2 = -0.282790;
else if ( 1.0000018188 < ip_login_f_cnt_dk_5 <= 2.0045280462 ) then wip_login_f_cnt_dk_5_s2 =  0.025274;
else if ( 2.0045280462 < ip_login_f_cnt_dk_5 <= 2.6984573347 ) then wip_login_f_cnt_dk_5_s2 =  0.294893;
else if ( 2.6984573347 < ip_login_f_cnt_dk_5 <= 3.1671238945 ) then wip_login_f_cnt_dk_5_s2 =  0.406931;
else if ( 3.1671238945 < ip_login_f_cnt_dk_5 <= 4.9935619767 ) then wip_login_f_cnt_dk_5_s2 =  0.508036;
else if ( 4.9935619767 < ip_login_f_cnt_dk_5 <= 7.8709292875 ) then wip_login_f_cnt_dk_5_s2 =  0.964891;
else if ( ip_login_f_cnt_dk_5 > 7.8709292875 ) then wip_login_f_cnt_dk_5_s2 =  2.021943;
else wip_login_f_cnt_dk_5_s2 = 0;
 
if ip_login_s_cnt_dk_160 = . then wip_login_s_cnt_dk_160_s2 = -4.000000;
else if ( -1e38 < ip_login_s_cnt_dk_160 <= 0 ) then wip_login_s_cnt_dk_160_s2 = -4.000000;
else if ( 0 < ip_login_s_cnt_dk_160 <= 1.9397544487 ) then wip_login_s_cnt_dk_160_s2 = -0.696717;
else if ( 1.9397544487 < ip_login_s_cnt_dk_160 <= 1.9958860207 ) then wip_login_s_cnt_dk_160_s2 = -0.500674;
else if ( 1.9958860207 < ip_login_s_cnt_dk_160 <= 2.990888894 ) then wip_login_s_cnt_dk_160_s2 = -0.302256;
else if ( 2.990888894 < ip_login_s_cnt_dk_160 <= 3.9832897632 ) then wip_login_s_cnt_dk_160_s2 =  0.029196;
else if ( 3.9832897632 < ip_login_s_cnt_dk_160 <= 5.9093891514 ) then wip_login_s_cnt_dk_160_s2 =  0.167162;
else if ( 5.9093891514 < ip_login_s_cnt_dk_160 <= 7.7692597712 ) then wip_login_s_cnt_dk_160_s2 =  0.331022;
else if ( 7.7692597712 < ip_login_s_cnt_dk_160 <= 9.1891266196 ) then wip_login_s_cnt_dk_160_s2 =  0.627209;
else if ( ip_login_s_cnt_dk_160 > 9.1891266196 ) then wip_login_s_cnt_dk_160_s2 =  0.723631;
else wip_login_s_cnt_dk_160_s2 = 0;
 
if ip_ms_max_dk_2 = . then wip_ms_max_dk_2_s2 = -4.000000;
else if ( -1e38 < ip_ms_max_dk_2 <= -32532 ) then wip_ms_max_dk_2_s2 =  1.151204;
else if ( -32532 < ip_ms_max_dk_2 <= -19498.70219 ) then wip_ms_max_dk_2_s2 =  0.925275;
else if ( -19498.70219 < ip_ms_max_dk_2 <= -5736.027777 ) then wip_ms_max_dk_2_s2 =  0.506978;
else if ( -5736.027777 < ip_ms_max_dk_2 <= -4555 ) then wip_ms_max_dk_2_s2 =  0.323270;
else if ( -4555 < ip_ms_max_dk_2 <= -3320.203784 ) then wip_ms_max_dk_2_s2 =  0.167752;
else if ( -3320.203784 < ip_ms_max_dk_2 <= -2769 ) then wip_ms_max_dk_2_s2 =  0.136290;
else if ( -2769 < ip_ms_max_dk_2 <= -1601 ) then wip_ms_max_dk_2_s2 = -0.319556;
else if ( -1601 < ip_ms_max_dk_2 <= -1479 ) then wip_ms_max_dk_2_s2 = -0.401947;
else if ( -1479 < ip_ms_max_dk_2 <= -0.907984675 ) then wip_ms_max_dk_2_s2 = -0.501857;
else if ( -0.907984675 < ip_ms_max_dk_2 <= 0 ) then wip_ms_max_dk_2_s2 = -0.086885;
else if ( ip_ms_max_dk_2 > 0 ) then wip_ms_max_dk_2_s2 = -4.000000;
else wip_ms_max_dk_2_s2 = 0;
 
if max_cross20wRtAtoCcBadAcc = . then wmax_cross20wRtAtoCcBadAcc_s2 =  0.000000;
else if ( -1e38 < max_cross20wRtAtoCcBadAcc <= 0.0025 ) then wmax_cross20wRtAtoCcBadAcc_s2 = -0.074108;
else if ( max_cross20wRtAtoCcBadAcc > 0.0025 ) then wmax_cross20wRtAtoCcBadAcc_s2 =  1.611174;
else wmax_cross20wRtAtoCcBadAcc_s2 = 0;
 
if max_cross20wRtDclAcc = . then wmax_cross20wRtDclAcc_s2 =  0.000000;
else if ( -1e38 < max_cross20wRtDclAcc <= 0.0587 ) then wmax_cross20wRtDclAcc_s2 = -0.071194;
else if ( 0.0587 < max_cross20wRtDclAcc <= 0.0769 ) then wmax_cross20wRtDclAcc_s2 = -0.010179;
else if ( 0.0769 < max_cross20wRtDclAcc <= 0.1111 ) then wmax_cross20wRtDclAcc_s2 =  0.128185;
else if ( 0.1111 < max_cross20wRtDclAcc <= 0.1993 ) then wmax_cross20wRtDclAcc_s2 =  0.626769;
else if ( 0.1993 < max_cross20wRtDclAcc <= 0.3333 ) then wmax_cross20wRtDclAcc_s2 =  0.799320;
else if ( max_cross20wRtDclAcc > 0.3333 ) then wmax_cross20wRtDclAcc_s2 =  0.831482;
else wmax_cross20wRtDclAcc_s2 = 0;
 
if max_cross4wRtDclAcc = . then wmax_cross4wRtDclAcc_s2 =  0.000000;
else if ( -1e38 < max_cross4wRtDclAcc <= 0.0677 ) then wmax_cross4wRtDclAcc_s2 = -0.066580;
else if ( 0.0677 < max_cross4wRtDclAcc <= 0.111 ) then wmax_cross4wRtDclAcc_s2 =  0.018478;
else if ( max_cross4wRtDclAcc > 0.111 ) then wmax_cross4wRtDclAcc_s2 =  1.000470;
else wmax_cross4wRtDclAcc_s2 = 0;
 
if radd_n_ip_0 = . then wradd_n_ip_0_s2 =  0.000000;
else if ( -1e38 < radd_n_ip_0 <= -1 ) then wradd_n_ip_0_s2 = -0.693313;
else if ( -1 < radd_n_ip_0 <= 1 ) then wradd_n_ip_0_s2 =  0.189314;
else if ( 1 < radd_n_ip_0 <= 2 ) then wradd_n_ip_0_s2 =  0.659284;
else if ( 2 < radd_n_ip_0 <= 3 ) then wradd_n_ip_0_s2 =  0.950856;
else if ( radd_n_ip_0 > 3 ) then wradd_n_ip_0_s2 =  1.543584;
else wradd_n_ip_0_s2 = 0;
 
if session_score = . then wsession_score_s2 =  0.000000;
else if ( -1e38 < session_score <= 312.49460603 ) then wsession_score_s2 = -1.370634;
else if ( 312.49460603 < session_score <= 372.41937892 ) then wsession_score_s2 = -0.991508;
else if ( 372.41937892 < session_score <= 429.74115853 ) then wsession_score_s2 = -0.333774;
else if ( 429.74115853 < session_score <= 483.22724654 ) then wsession_score_s2 = -0.141965;
else if ( 483.22724654 < session_score <= 523.53010686 ) then wsession_score_s2 =  0.002330;
else if ( 523.53010686 < session_score <= 537.45795508 ) then wsession_score_s2 =  0.176978;
else if ( 537.45795508 < session_score <= 543.07539849 ) then wsession_score_s2 =  0.311889;
else if ( 543.07539849 < session_score <= 548.76774683 ) then wsession_score_s2 =  0.472352;
else if ( 548.76774683 < session_score <= 564.28861316 ) then wsession_score_s2 =  0.503496;
else if ( 564.28861316 < session_score <= 579.35642079 ) then wsession_score_s2 =  0.524269;
else if ( session_score > 579.35642079 ) then wsession_score_s2 =  2.001238;
else wsession_score_s2 = 0;
 
if usd_amount = . then wusd_amount_s2 =  0.000000;
else if ( -1e38 < usd_amount <= -43815 ) then wusd_amount_s2 =  1.805342;
else if ( -43815 < usd_amount <= -26395 ) then wusd_amount_s2 =  1.169100;
else if ( -26395 < usd_amount <= -19468 ) then wusd_amount_s2 =  0.920937;
else if ( -19468 < usd_amount <= -9321 ) then wusd_amount_s2 =  0.435736;
else if ( -9321 < usd_amount <= -4676 ) then wusd_amount_s2 =  0.416853;
else if ( -4676 < usd_amount <= -2851 ) then wusd_amount_s2 =  0.027790;
else if ( -2851 < usd_amount <= -1941 ) then wusd_amount_s2 = -0.443991;
else if ( -1941 < usd_amount <= -965 ) then wusd_amount_s2 = -0.667394;
else if ( usd_amount > -965 ) then wusd_amount_s2 = -0.752304;
else wusd_amount_s2 = 0;
 
if vid1wRtDolCcXbrBadTxn = . then wvid1wRtDolCcXbrBadTxn_s2 =  0.000000;
else if ( -1e38 < vid1wRtDolCcXbrBadTxn <= 0 ) then wvid1wRtDolCcXbrBadTxn_s2 = -0.762257;
else if ( 0 < vid1wRtDolCcXbrBadTxn <= 0.0019 ) then wvid1wRtDolCcXbrBadTxn_s2 =  0.055234;
else if ( 0.0019 < vid1wRtDolCcXbrBadTxn <= 0.0023 ) then wvid1wRtDolCcXbrBadTxn_s2 = -1.043632;
else if ( vid1wRtDolCcXbrBadTxn > 0.0023 ) then wvid1wRtDolCcXbrBadTxn_s2 =  4.000000;
else wvid1wRtDolCcXbrBadTxn_s2 = 0;
 
if vid_login_s_cnt_dk_2 = . then wvid_login_s_cnt_dk_2_s2 =  0.000000;
else if ( -1e38 < vid_login_s_cnt_dk_2 <= 1.8423403635 ) then wvid_login_s_cnt_dk_2_s2 = -0.464110;
else if ( 1.8423403635 < vid_login_s_cnt_dk_2 <= 1.9197610578 ) then wvid_login_s_cnt_dk_2_s2 = -0.170804;
else if ( 1.9197610578 < vid_login_s_cnt_dk_2 <= 1.9569180047 ) then wvid_login_s_cnt_dk_2_s2 =  0.128344;
else if ( 1.9569180047 < vid_login_s_cnt_dk_2 <= 2.8787287209 ) then wvid_login_s_cnt_dk_2_s2 =  0.450341;
else if ( 2.8787287209 < vid_login_s_cnt_dk_2 <= 4.1622434567 ) then wvid_login_s_cnt_dk_2_s2 =  1.042097;
else if ( vid_login_s_cnt_dk_2 > 4.1622434567 ) then wvid_login_s_cnt_dk_2_s2 =  2.412624;
else wvid_login_s_cnt_dk_2_s2 = 0;
 
if vid_num_spoof_txns = . then wvid_num_spoof_txns_s2 =  0.000000;
else if ( -1e38 < vid_num_spoof_txns <= 0 ) then wvid_num_spoof_txns_s2 = -0.014131;
else if ( vid_num_spoof_txns > 0 ) then wvid_num_spoof_txns_s2 =  3.577903;
else wvid_num_spoof_txns_s2 = 0;
 
if flow_from_country in (  'AD', 'AG', 'AI', 'AL', 'AM', 'AN', 'AO', 'AW', 'BA', 'BB', 'BF', 'BG', 'BM', 'BN', 'BS', 'BW', 'BZ', 'CD', 'CN', 'CR', 'CV', 'DM', 'DZ', 'FK', 'FO', 'GF', 'GI', 'GL', 'GM', 'GP', 'GT', 'GY', 'HN', 'JM', 'KE', 'KG', 'KH', 'KN',
'KY', 'KZ', 'LA', 'LC', 'MA', 'MG', 'MN', 'MQ', 'MT', 'MV', 'MZ', 'NA', 'NC', 'NI', 'OM', 'PF', 'PG', 'SC', 'SH', 'SM', 'SN', 'SR', 'TC', 'TN', 'TZ', 'UG', 'VC', 'VG', 'VU', 'WF', 'YE', 'YT', 'ZM', 'FI', 'UA', 'CZ', 'HU', 'HR', 'DE' ) then
wflow_from_country_s2 = -1.063938;
 
else if flow_from_country in ( 'PR', 'LU', 'EE', 'LK', 'RU' ) then wflow_from_country_s2 = -0.687849;
else if flow_from_country in ( 'AU', 'IT', 'NO', 'GR' ) then wflow_from_country_s2 = -0.499945;
else if flow_from_country in ( 'PT', 'CO' ) then wflow_from_country_s2 = -0.251771;
else if flow_from_country in ( 'VE', 'CY', 'AZ' ) then wflow_from_country_s2 = -0.181847;
else if flow_from_country in ( 'IE', 'GB', 'PL', 'TW', 'MU', 'ES', 'AT', 'LV', 'QA', 'SV' ) then wflow_from_country_s2 = -0.115218;
else if flow_from_country in ( 'SE' ) then wflow_from_country_s2 =  0.028211;
else if flow_from_country in ( 'CL' ) then wflow_from_country_s2 =  0.097204;
else if flow_from_country in ( 'RO', 'AR', 'NL', 'MY', 'SK', 'DO', 'PA', 'US' ) then wflow_from_country_s2 =  0.216658;
else if flow_from_country in ( 'SI', 'PE', 'FR', 'DK', 'TH', 'PH', 'CH', 'TR' ) then wflow_from_country_s2 =  0.307564;
else if flow_from_country in ( 'MX' ) then wflow_from_country_s2 =  0.431595;
else if flow_from_country in ( 'CA', 'IS', 'C2', 'JO', 'IL', 'RE', 'NZ', 'BE', 'TT', 'SA', 'ZA' ) then wflow_from_country_s2 =  0.513410;
else if flow_from_country in ( 'BR', 'ID', 'EC', 'KW', 'LT', 'BO', 'AE' ) then wflow_from_country_s2 =  0.863479;
else if flow_from_country in ( 'KR', 'HK', 'JP', 'VN' ) then wflow_from_country_s2 =  1.472096;
else if flow_from_country in ( 'UY', 'SG', 'BH' ) then wflow_from_country_s2 =  1.998863;
else if flow_from_country in ( 'IN' ) then wflow_from_country_s2 =  2.331304;
else if flow_from_country in ( 'FJ', 'GD' ) then wflow_from_country_s2 =  0.000000;
else wflow_from_country_s2 = 0;
 
 
if funding_source = 'elv' then wfunding_source_s2 =  0.000000;
else if funding_source = 'meft' then wfunding_source_s2 =  0.000000;
else if funding_source = 'bc' then wfunding_source_s2 = -0.381820;
else if funding_source in ( 'iach', 'balance' ) then wfunding_source_s2 = -0.272707;
else if funding_source = 'cc' then wfunding_source_s2 =  0.202582;
else if funding_source = 'uach' then wfunding_source_s2 =  0.766735;
else if funding_source = 'echeck' then wfunding_source_s2 =  1.370435;
else wfunding_source_s2 = 0;
 
 
intercept = 1;
new_score = 
+   (7.53580422    *Intercept                                  )
-   (0.71066796    *wNumOfIP4s_s2                              )
-   (1.10872181    *wRADD_TIMEZONE_3_2_s2                      )
-   (0.36140523    *wRADD_TIMEZONE_3_3_s2                      )
-   (0.22983741    *wRADD_TIMEZONE_PCT_3_3_s2                  )
-   (0.70540428    *wacct_login_f_cnt_dk_160_s2                )
-   (0.26221401    *wasn_amt_dk_2_s2                           )
-   (0.53079541    *wasn_inf_cidr_rate_s2                      )
-   (0.91337572    *wato_good_sum_amt_txn_s2                   )
-   (0.96096230    *wato_log_phone_primar_t004_s2              )
-   (0.64636479    *wc_cat_s2                                  )
-   (0.63030168    *wcc_control_txn_s2                         )
-   (0.84844727    *wcc_control_user_s2                        )
-   (0.14070600    *wcidr_inf_rate_s2                          )
-   (0.83479068    *webay_flag_s2                              )
-   (0.43031743    *wflow_from_country_s2                      )
-   (0.33249166    *wfso_num_spoof_txns_s2                     )
-   (0.27518801    *wfunding_source_s2                         )
-   (0.28120868    *wip20wRtDolAtoBadTxn_s2                    )
-   (1.90846711    *wip4wRtCcXbrBadTxn_s2                      )
-   (0.62052185    *wip_login_f_cnt_dk_5_s2                    )
-   (0.53761934    *wip_login_s_cnt_dk_160_s2                  )
-   (0.57787559    *wip_ms_max_dk_2_s2                         )
-   (0.26973849    *wmax_cross20wRtAtoCcBadAcc_s2              )
-   (0.57182498    *wmax_cross20wRtDclAcc_s2                   )
-   (0.64080399    *wmax_cross4wRtDclAcc_s2                    )
-   (1.07592609    *wradd_n_ip_0_s2                            )
-   (0.45773648    *wsession_score_s2                          )
-   (0.69490862    *wusd_amount_s2                             )
-   (1.29847203    *wvid1wRtDolCcXbrBadTxn_s2                  )
-   (0.73331865    *wvid_login_s_cnt_dk_2_s2                   )
-   (0.25395798    *wvid_num_spoof_txns_s2                     )
;

align_new_score = int(846.26729279  + -57.70534168  * new_score);
