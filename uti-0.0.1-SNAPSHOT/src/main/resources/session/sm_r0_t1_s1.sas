if SNR1wRtDolDclTxn = . then wSNR1wRtDolDclTxn_s1 =  0.000000;
else if ( -1e38 < SNR1wRtDolDclTxn <= 0 ) then wSNR1wRtDolDclTxn_s1 = -0.105449;
else if ( 0 < SNR1wRtDolDclTxn <= 0.0655 ) then wSNR1wRtDolDclTxn_s1 =  0.089438;
else if ( SNR1wRtDolDclTxn > 0.0655 ) then wSNR1wRtDolDclTxn_s1 =  0.798008;
else wSNR1wRtDolDclTxn_s1 = 0;
 
if ip_asp_spoof_txns = . then wip_asp_spoof_txns_s1 =  0.000000;
else if ( -1e38 < ip_asp_spoof_txns <= 0 ) then wip_asp_spoof_txns_s1 = -0.119505;
else if ( 0 < ip_asp_spoof_txns <= 2787.0833 ) then wip_asp_spoof_txns_s1 =  1.659303;
else if ( 2787.0833 < ip_asp_spoof_txns <= 11766 ) then wip_asp_spoof_txns_s1 =  1.415797;
else if ( ip_asp_spoof_txns > 11766 ) then wip_asp_spoof_txns_s1 =  0.841029;
else wip_asp_spoof_txns_s1 = 0;
 
if login_VIDMatch = . then wlogin_VIDMatch_s1 =  0.000000;
else if ( -1e38 < login_VIDMatch <= 0 ) then wlogin_VIDMatch_s1 =  0.209014;
else if ( 0 < login_VIDMatch <= 1 ) then wlogin_VIDMatch_s1 = -0.134574;
else if ( login_VIDMatch > 1 ) then wlogin_VIDMatch_s1 =  1.153454;
else wlogin_VIDMatch_s1 = 0;
 
if max_cross20wRtDclAcc = . then wmax_cross20wRtDclAcc_s1 =  0.000000;
else if ( -1e38 < max_cross20wRtDclAcc <= 0.025 ) then wmax_cross20wRtDclAcc_s1 = -1.021755;
else if ( 0.025 < max_cross20wRtDclAcc <= 0.0283 ) then wmax_cross20wRtDclAcc_s1 = -0.340624;
else if ( 0.0283 < max_cross20wRtDclAcc <= 0.0299 ) then wmax_cross20wRtDclAcc_s1 = -0.176481;
else if ( 0.0299 < max_cross20wRtDclAcc <= 0.0364 ) then wmax_cross20wRtDclAcc_s1 = -0.098116;
else if ( 0.0364 < max_cross20wRtDclAcc <= 0.069 ) then wmax_cross20wRtDclAcc_s1 = -0.038997;
else if ( 0.069 < max_cross20wRtDclAcc <= 0.5 ) then wmax_cross20wRtDclAcc_s1 =  0.316717;
else if ( max_cross20wRtDclAcc > 0.5 ) then wmax_cross20wRtDclAcc_s1 =  0.932663;
else wmax_cross20wRtDclAcc_s1 = 0;
 
if radd_max_pmt_s_3 = . then wradd_max_pmt_s_3_s1 =  0.853290;
else if ( -1e38 < radd_max_pmt_s_3 <= 10.7 ) then wradd_max_pmt_s_3_s1 =  0.653211;
else if ( 10.7 < radd_max_pmt_s_3 <= 49.99 ) then wradd_max_pmt_s_3_s1 =  0.262126;
else if ( 49.99 < radd_max_pmt_s_3 <= 213.4 ) then wradd_max_pmt_s_3_s1 =  0.043156;
else if ( 213.4 < radd_max_pmt_s_3 <= 1558.85 ) then wradd_max_pmt_s_3_s1 = -0.203081;
else if ( radd_max_pmt_s_3 > 1558.85 ) then wradd_max_pmt_s_3_s1 = -0.544985;
else wradd_max_pmt_s_3_s1 = 0;
 
if radd_timezone_3_2 = . then wradd_timezone_3_2_s1 = -0.199666;
else if ( -1e38 < radd_timezone_3_2 <= -800 ) then wradd_timezone_3_2_s1 = -0.326895;
else if ( -800 < radd_timezone_3_2 <= 0 ) then wradd_timezone_3_2_s1 =  0.355722;
else if ( 0 < radd_timezone_3_2 <= 700 ) then wradd_timezone_3_2_s1 =  0.806779;
else if ( 700 < radd_timezone_3_2 <= 1200 ) then wradd_timezone_3_2_s1 =  0.956686;
else if ( radd_timezone_3_2 > 1200 ) then wradd_timezone_3_2_s1 =  0.394738;
else wradd_timezone_3_2_s1 = 0;
 
if vid_asp_spoof_txns = . then wvid_asp_spoof_txns_s1 =  0.000000;
else if ( -1e38 < vid_asp_spoof_txns <= 0 ) then wvid_asp_spoof_txns_s1 = -0.090233;
else if ( vid_asp_spoof_txns > 0 ) then wvid_asp_spoof_txns_s1 =  3.219727;
else wvid_asp_spoof_txns_s1 = 0;
 
intercept = 1;
new_score = 
+   (8.28081368    *Intercept                                  )
-   (0.81097483    *wvid_asp_spoof_txns_s1                     )
-   (0.66459787    *wSNR1wRtDolDclTxn_s1                       )
-   (0.67072359    *wip_asp_spoof_txns_s1                      )
-   (0.94047141    *wlogin_VIDMatch_s1                         )
-   (0.75361744    *wmax_cross20wRtDclAcc_s1                   )
-   (1.07276365    *wradd_max_pmt_s_3_s1                       )
-   (0.81960731    *wradd_timezone_3_2_s1                      )
;

align_new_score = int(846.32476716  + -57.71364319  * new_score);
