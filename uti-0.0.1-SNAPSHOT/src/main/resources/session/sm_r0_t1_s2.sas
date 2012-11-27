if SNR1wRtDolDclTxn = . then wSNR1wRtDolDclTxn_s2 =  0.000000;
else if ( -1e38 < SNR1wRtDolDclTxn <= 0 ) then wSNR1wRtDolDclTxn_s2 = -0.615209;
else if ( SNR1wRtDolDclTxn > 0 ) then wSNR1wRtDolDclTxn_s2 =  0.340480;
else wSNR1wRtDolDclTxn_s2 = 0;
 
if ip_asp_spoof_txns = . then wip_asp_spoof_txns_s2 =  0.000000;
else if ( -1e38 < ip_asp_spoof_txns <= 0 ) then wip_asp_spoof_txns_s2 = -0.082598;
else if ( 0 < ip_asp_spoof_txns <= 10071.5 ) then wip_asp_spoof_txns_s2 =  1.180183;
else if ( 10071.5 < ip_asp_spoof_txns <= 25275 ) then wip_asp_spoof_txns_s2 =  0.988370;
else if ( ip_asp_spoof_txns > 25275 ) then wip_asp_spoof_txns_s2 =  0.553010;
else wip_asp_spoof_txns_s2 = 0;
 
if login_VIDMatch = . then wlogin_VIDMatch_s2 =  0.000000;
else if ( -1e38 < login_VIDMatch <= 0 ) then wlogin_VIDMatch_s2 = -0.068324;
else if ( login_VIDMatch > 0 ) then wlogin_VIDMatch_s2 =  0.199318;
else wlogin_VIDMatch_s2 = 0;
 
if max_cross20wRtDclAcc = . then wmax_cross20wRtDclAcc_s2 =  0.000000;
else if ( -1e38 < max_cross20wRtDclAcc <= 0.0296 ) then wmax_cross20wRtDclAcc_s2 = -1.211759;
else if ( 0.0296 < max_cross20wRtDclAcc <= 0.1303 ) then wmax_cross20wRtDclAcc_s2 = -0.108053;
else if ( 0.1303 < max_cross20wRtDclAcc <= 0.1667 ) then wmax_cross20wRtDclAcc_s2 =  0.172623;
else if ( max_cross20wRtDclAcc > 0.1667 ) then wmax_cross20wRtDclAcc_s2 =  0.895130;
else wmax_cross20wRtDclAcc_s2 = 0;
 
if radd_max_pmt_s_3 = . then wradd_max_pmt_s_3_s2 =  0.213877;
else if ( -1e38 < radd_max_pmt_s_3 <= 138.73 ) then wradd_max_pmt_s_3_s2 =  0.104664;
else if ( 138.73 < radd_max_pmt_s_3 <= 561.36 ) then wradd_max_pmt_s_3_s2 = -0.209494;
else if ( 561.36 < radd_max_pmt_s_3 <= 1082.01 ) then wradd_max_pmt_s_3_s2 = -0.588154;
else if ( radd_max_pmt_s_3 > 1082.01 ) then wradd_max_pmt_s_3_s2 = -0.911076;
else wradd_max_pmt_s_3_s2 = 0;
 
if radd_timezone_3_2 = . then wradd_timezone_3_2_s2 = -0.778868;
else if ( -1e38 < radd_timezone_3_2 <= -800 ) then wradd_timezone_3_2_s2 = -1.290216;
else if ( -800 < radd_timezone_3_2 <= 0 ) then wradd_timezone_3_2_s2 =  0.815104;
else if ( 0 < radd_timezone_3_2 <= 200 ) then wradd_timezone_3_2_s2 =  1.100776;
else if ( 200 < radd_timezone_3_2 <= 1200 ) then wradd_timezone_3_2_s2 =  1.807910;
else if ( radd_timezone_3_2 > 1200 ) then wradd_timezone_3_2_s2 =  2.221751;
else wradd_timezone_3_2_s2 = 0;
 
intercept = 1;
new_score = 
+   (5.40450689    *Intercept                                  )
-   (1.14762943    *wradd_timezone_3_2_s2                      )
-   (1.07454278    *wSNR1wRtDolDclTxn_s2                       )
-   (0.66058828    *wip_asp_spoof_txns_s2                      )
-   (1.41558319    *wlogin_VIDMatch_s2                         )
-   (1.01836670    *wmax_cross20wRtDclAcc_s2                   )
-   (1.31053604    *wradd_max_pmt_s_3_s2                       )
;

align_new_score = int(846.27108436  + -57.70548355  * new_score);
