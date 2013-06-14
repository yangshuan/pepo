if acct_login_cnt_dk_5 = . then wacct_login_cnt_dk_5_s1 =  0.000000;
else if ( -1e38 < acct_login_cnt_dk_5 <= 1.000000002 ) then wacct_login_cnt_dk_5_s1 = -0.666617;
else if ( 1.000000002 < acct_login_cnt_dk_5 <= 1.0000002217 ) then wacct_login_cnt_dk_5_s1 = -0.425251;
else if ( 1.0000002217 < acct_login_cnt_dk_5 <= 1.0167041161 ) then wacct_login_cnt_dk_5_s1 = -0.112600;
else if ( 1.0167041161 < acct_login_cnt_dk_5 <= 1.9996111867 ) then wacct_login_cnt_dk_5_s1 = -0.009675;
else if ( 1.9996111867 < acct_login_cnt_dk_5 <= 3.8279926315 ) then wacct_login_cnt_dk_5_s1 =  0.390086;
else if ( 3.8279926315 < acct_login_cnt_dk_5 <= 5.8542435956 ) then wacct_login_cnt_dk_5_s1 =  0.829543;
else if ( acct_login_cnt_dk_5 > 5.8542435956 ) then wacct_login_cnt_dk_5_s1 =  1.425058;
else wacct_login_cnt_dk_5_s1 = 0;
 
if ato_good_cnt_txn = . then wato_good_cnt_txn_s1 = -0.056563;
else if ( -1e38 < ato_good_cnt_txn <= 0 ) then wato_good_cnt_txn_s1 = -4.000000;
else if ( 0 < ato_good_cnt_txn <= 12 ) then wato_good_cnt_txn_s1 =  0.296782;
else if ( 12 < ato_good_cnt_txn <= 14 ) then wato_good_cnt_txn_s1 =  0.166355;
else if ( 14 < ato_good_cnt_txn <= 76 ) then wato_good_cnt_txn_s1 =  0.142420;
else if ( ato_good_cnt_txn > 76 ) then wato_good_cnt_txn_s1 = -1.058942;
else wato_good_cnt_txn_s1 = 0;
 
if cidr_size = . then wcidr_size_s1 =  0.090834;
else if ( -1e38 < cidr_size <= 4096 ) then wcidr_size_s1 =  1.254184;
else if ( cidr_size > 4096 ) then wcidr_size_s1 = -0.116630;
else wcidr_size_s1 = 0;
 
if ebay_flag = . then webay_flag_s1 =  0.000000;
else if ( -1e38 < ebay_flag <= 0 ) then webay_flag_s1 =  0.598082;
else if ( ebay_flag > 0 ) then webay_flag_s1 = -0.959819;
else webay_flag_s1 = 0;
 
if is_xb = . then wis_xb_s1 =  0.000000;
else if ( -1e38 < is_xb <= 0 ) then wis_xb_s1 = -0.206108;
else if ( is_xb > 0 ) then wis_xb_s1 =  0.434909;
else wis_xb_s1 = 0;
 
if max_cross20wRtAtoCcBadTxn = . then wmax_cross20wRtAtoCcBadTxn_s1 =  0.000000;
else if ( -1e38 < max_cross20wRtAtoCcBadTxn <= 0.0011 ) then wmax_cross20wRtAtoCcBadTxn_s1 = -0.469009;
else if ( 0.0011 < max_cross20wRtAtoCcBadTxn <= 0.0012 ) then wmax_cross20wRtAtoCcBadTxn_s1 = -0.042757;
else if ( 0.0012 < max_cross20wRtAtoCcBadTxn <= 0.0019 ) then wmax_cross20wRtAtoCcBadTxn_s1 =  0.200836;
else if ( max_cross20wRtAtoCcBadTxn > 0.0019 ) then wmax_cross20wRtAtoCcBadTxn_s1 =  1.498454;
else wmax_cross20wRtAtoCcBadTxn_s1 = 0;
 
if payment_transid = . then wpayment_transid_s1 =  0.000000;
else if ( -1e38 < payment_transid <= 74522525957 ) then wpayment_transid_s1 =  0.268711;
else if ( 74522525957 < payment_transid <= 74604658967 ) then wpayment_transid_s1 =  0.077713;
else if ( 74604658967 < payment_transid <= 74739612062 ) then wpayment_transid_s1 =  0.054808;
else if ( 74739612062 < payment_transid <= 75728213558 ) then wpayment_transid_s1 = -0.038117;
else if ( payment_transid > 75728213558 ) then wpayment_transid_s1 = -0.750904;
else wpayment_transid_s1 = 0;
 
if radd_max_pmt_s_3 = . then wradd_max_pmt_s_3_s1 =  1.138862;
else if ( -1e38 < radd_max_pmt_s_3 <= 12.52 ) then wradd_max_pmt_s_3_s1 =  0.528399;
else if ( 12.52 < radd_max_pmt_s_3 <= 52.25 ) then wradd_max_pmt_s_3_s1 =  0.288489;
else if ( 52.25 < radd_max_pmt_s_3 <= 171.99 ) then wradd_max_pmt_s_3_s1 = -0.008282;
else if ( 171.99 < radd_max_pmt_s_3 <= 1350.41 ) then wradd_max_pmt_s_3_s1 = -0.188818;
else if ( radd_max_pmt_s_3 > 1350.41 ) then wradd_max_pmt_s_3_s1 = -0.530086;
else wradd_max_pmt_s_3_s1 = 0;
 
if radd_n_ip_1_pct_v2 = . then wradd_n_ip_1_pct_v2_s1 =  0.000000;
else if ( -1e38 < radd_n_ip_1_pct_v2 <= -10000 ) then wradd_n_ip_1_pct_v2_s1 =  0.036243;
else if ( -10000 < radd_n_ip_1_pct_v2 <= -1 ) then wradd_n_ip_1_pct_v2_s1 = -0.139822;
else if ( -1 < radd_n_ip_1_pct_v2 <= 0.16 ) then wradd_n_ip_1_pct_v2_s1 = -0.218106;
else if ( 0.16 < radd_n_ip_1_pct_v2 <= 1 ) then wradd_n_ip_1_pct_v2_s1 =  0.148128;
else if ( radd_n_ip_1_pct_v2 > 1 ) then wradd_n_ip_1_pct_v2_s1 =  0.818119;
else wradd_n_ip_1_pct_v2_s1 = 0;
 
if radd_n_vid_s_0 = . then wradd_n_vid_s_0_s1 =  0.000000;
else if ( -1e38 < radd_n_vid_s_0 <= 0 ) then wradd_n_vid_s_0_s1 = -0.401315;
else if ( 0 < radd_n_vid_s_0 <= 1 ) then wradd_n_vid_s_0_s1 = -0.187532;
else if ( 1 < radd_n_vid_s_0 <= 2 ) then wradd_n_vid_s_0_s1 =  0.608230;
else if ( 2 < radd_n_vid_s_0 <= 3 ) then wradd_n_vid_s_0_s1 =  0.878151;
else if ( radd_n_vid_s_0 > 3 ) then wradd_n_vid_s_0_s1 =  0.995612;
else wradd_n_vid_s_0_s1 = 0;
 
if session_score = . then wsession_score_s1 =  0.000000;
else if ( -1e38 < session_score <= 327.66907978 ) then wsession_score_s1 = -0.607737;
else if ( 327.66907978 < session_score <= 344.88540354 ) then wsession_score_s1 = -0.197470;
else if ( 344.88540354 < session_score <= 352.49739664 ) then wsession_score_s1 =  0.102565;
else if ( 352.49739664 < session_score <= 393.75716959 ) then wsession_score_s1 =  0.131294;
else if ( 393.75716959 < session_score <= 437.58567298 ) then wsession_score_s1 =  0.627459;
else if ( session_score > 437.58567298 ) then wsession_score_s1 =  1.727667;
else wsession_score_s1 = 0;
 
if snr4wRtAtoBadTxn = . then wsnr4wRtAtoBadTxn_s1 =  0.000000;
else if ( -1e38 < snr4wRtAtoBadTxn <= 0.0005 ) then wsnr4wRtAtoBadTxn_s1 = -0.024122;
else if ( 0.0005 < snr4wRtAtoBadTxn <= 0.0006 ) then wsnr4wRtAtoBadTxn_s1 =  0.006893;
else if ( snr4wRtAtoBadTxn > 0.0006 ) then wsnr4wRtAtoBadTxn_s1 =  2.781115;
else wsnr4wRtAtoBadTxn_s1 = 0;
 
if usd_amount = . then wusd_amount_s1 =  0.000000;
else if ( -1e38 < usd_amount <= -39900 ) then wusd_amount_s1 =  1.476259;
else if ( -39900 < usd_amount <= -4777 ) then wusd_amount_s1 =  0.206531;
else if ( -4777 < usd_amount <= -820 ) then wusd_amount_s1 = -0.075897;
else if ( -820 < usd_amount <= -485 ) then wusd_amount_s1 = -0.270224;
else if ( usd_amount > -485 ) then wusd_amount_s1 = -0.543649;
else wusd_amount_s1 = 0;
 
if flow_from_country in ( 'AD' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'AE' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'AG' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'AI', 'AN' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'AO', 'AW' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'AZ' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BA' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BB' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BH' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BM' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BN' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BO' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BS' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BW' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'BZ' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'CK', 'CL' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'CN' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'CZ' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'DM' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'DO' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'DZ', 'EC' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'EE' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'FJ' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'FK', 'FM', 'FO' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'GD' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'GF', 'GI' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'GL' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in ( 'GM', 'GP' ) then wflow_from_country_s1 =  0.000000;
else if flow_from_country in (  'GT', 'GY', 'HN', 'HR', 'HU', 'IS', 'JM', 'JO', 'KG', 'KH', 'KN', 'KR', 'KW', 'KY', 'KZ', 'LA', 'LC', 'LI', 'LK', 'LU', 'LV', 'MA', 'MN', 'MQ', 'MT', 'MU', 'MV', 'MW', 'MZ', 'NA', 'NC', 'NE', 'NI', 'OM', 'PA', 'PE', 'PF',
'PG', 'PL', 'PW', 'QA', 'RE', 'SA', 'SC', 'SG', 'SI', 'SM', 'SN', 'SR', 'SV', 'SZ', 'TC', 'TJ', 'TM', 'TN', 'TR', 'TT', 'TV', 'TW', 'TZ', 'UA', 'UG', 'UY', 'VC', 'VE', 'VG', 'VN', 'WF', 'YE', 'YT', 'ZA', 'ZM', 'RU', 'AT', 'DE', 'BE', 'SE', 'AU', 'DK',
'PR', 'GB', 'IT', 'FI', 'IL', 'PT', 'HK', 'MX', 'IE' ) then wflow_from_country_s1 = -0.454784;
 
else if flow_from_country in ( 'US', 'C2', 'CH', 'CA', 'GR', 'BG', 'FR', 'TH', 'ID', 'SK', 'NZ', 'CY', 'NL', 'ES' ) then wflow_from_country_s1 =  0.235373;
else if flow_from_country in ( 'JP', 'NO' ) then wflow_from_country_s1 =  0.917139;
else if flow_from_country in ( 'BR', 'LT' ) then wflow_from_country_s1 =  1.050863;
else if flow_from_country in ( 'PH', 'IN', 'CO', 'CR', 'MY', 'AR' ) then wflow_from_country_s1 =  1.759136;
else if flow_from_country in ( 'RO', 'AM', 'AL', 'KE' ) then wflow_from_country_s1 =  2.425722;
else wflow_from_country_s1 = 0;
 
 
if funding_source = 'elv' then wfunding_source_s1 =  0.000000;
else if funding_source = 'meft' then wfunding_source_s1 =  0.000000;
else if funding_source = 'bc' then wfunding_source_s1 = -0.910542;
else if funding_source in ( 'balance', 'cc' ) then wfunding_source_s1 = -0.010730;
else if funding_source in ( 'iach', 'uach' ) then wfunding_source_s1 =  0.026525;
else if funding_source = 'echeck' then wfunding_source_s1 =  1.996601;
else wfunding_source_s1 = 0;
 
 
intercept = 1;
new_score = 
+   (9.94441013    *Intercept                                  )
-   (0.96508058    *webay_flag_s1                              )
-   (0.76735808    *wacct_login_cnt_dk_5_s1                    )
-   (0.85834463    *wato_good_cnt_txn_s1                       )
-   (0.53318497    *wcidr_size_s1                              )
-   (0.57495068    *wflow_from_country_s1                      )
-   (0.77190330    *wfunding_source_s1                         )
-   (0.78498480    *wis_xb_s1                                  )
-   (0.74245966    *wmax_cross20wRtAtoCcBadTxn_s1              )
-   (1.09844406    *wpayment_transid_s1                        )
-   (0.76692915    *wradd_max_pmt_s_3_s1                       )
-   (0.84218792    *wradd_n_ip_1_pct_v2_s1                     )
-   (0.58389376    *wradd_n_vid_s_0_s1                         )
-   (0.43540523    *wsession_score_s1                          )
-   (0.62144183    *wsnr4wRtAtoBadTxn_s1                       )
-   (0.84447111    *wusd_amount_s1                             )
;

align_new_score = int(846.28372117  + -57.7085978  * new_score);
