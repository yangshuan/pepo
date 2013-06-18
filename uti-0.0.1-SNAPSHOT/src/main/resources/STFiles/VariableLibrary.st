package $package$;

import static com.paypal.risk.idi.models.nn.NNModelUtilityFunction.*;
import static com.paypal.risk.idi.models.nn.ato.ATONNVariableRepository.*;

import java.util.Arrays;
import java.util.Map;

import com.paypal.risk.idi.variables.NullValue;

public class $model$VariableLibrary implements ATONNVariableLibrary{
  
  private static $model$VariableLibrary self = new $model$VariableLibrary();
  
  public static $model$VariableLibrary getInstance() {
    return self;
  }
  
  private ATONNSeg1VariableLibrary() {
    
  }
  
  public void execute(Map<String,Object> context) throws Exception {
    buildWoeStringVariables(context);
    buildZScaleDoubleVariables(context);
    
  }
  
  private void buildZScaleDoubleVariables(Map<String,Object> context) {
    $VarList:{context.put("$it.output$", normalizeVariableReplaceByMean(context.get($it.name$.getName()),$it.params$));
    }$
  }

  private void buildWoeStringVariables(Map<String,Object> context) throws Exception {
  
    
    context.put(WCOUN_ARTYCONSISTENCYENUM_SR.getName() + "_sr",getWoeValue(WCOUN_ARTYCONSISTENCYENUM_SR.getName(),context.get(WCOUN_ARTYCONSISTENCYENUM_SR.getName())));
    context.put(WCP_DELTA_1W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WCP_DELTA_1W_APPR_PERTXN_C_SR.getName(),context.get(WCP_DELTA_1W_APPR_PERTXN_C_SR.getName())));
    context.put(WCP_D_A_20W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WCP_D_A_20W_APPR_PERTXN_C_SR.getName(),context.get(WCP_D_A_20W_APPR_PERTXN_C_SR.getName())));
    context.put(WCP_DELTA_4W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WCP_DELTA_4W_APPR_PERTXN_C_SR.getName(),context.get(WCP_DELTA_4W_APPR_PERTXN_C_SR.getName())));
    context.put(WIPR__A_20W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WIPR__A_20W_APPR_PERTXN_C_SR.getName(),context.get(WIPR__A_20W_APPR_PERTXN_C_SR.getName())));
    context.put(WIPR__TA_4W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WIPR__TA_4W_APPR_PERTXN_C_SR.getName(),context.get(WIPR__TA_4W_APPR_PERTXN_C_SR.getName())));
    context.put(WSNR__A_20W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WSNR__A_20W_APPR_PERTXN_C_SR.getName(),context.get(WSNR__A_20W_APPR_PERTXN_C_SR.getName())));
    context.put(WSNR__TA_4W_APPR_PERTXN_C_SR.getName() + "_sr",getWoeValue(WSNR__TA_4W_APPR_PERTXN_C_SR.getName(),context.get(WSNR__TA_4W_APPR_PERTXN_C_SR.getName())));
    context.put(WV21_ACCT_AGE_BY_CC_SR.getName() + "_sr",getWoeValue(WV21_ACCT_AGE_BY_CC_SR.getName(),context.get(WV21_ACCT_AGE_BY_CC_SR.getName())));
    context.put(WV21_AD_BOGUS_ANY_SR.getName() + "_sr",getWoeValue(WV21_AD_BOGUS_ANY_SR.getName(),context.get(WV21_AD_BOGUS_ANY_SR.getName())));
    context.put(WV21_CC_NAME_BOGUS_ANY_SR.getName() + "_sr",getWoeValue(WV21_CC_NAME_BOGUS_ANY_SR.getName(),context.get(WV21_CC_NAME_BOGUS_ANY_SR.getName())));
    context.put(WV21_E_BOGUS_ANY_SR.getName() + "_sr",getWoeValue(WV21_E_BOGUS_ANY_SR.getName(),context.get(WV21_E_BOGUS_ANY_SR.getName())));
    context.put(WV21__THNICITY_MATCH_BEST_SR.getName() + "_sr",getWoeValue(WV21__THNICITY_MATCH_BEST_SR.getName(),context.get(WV21__THNICITY_MATCH_BEST_SR.getName())));
    context.put(WV21__SAME_VID_DIFF_WORST_SR.getName() + "_sr",getWoeValue(WV21__SAME_VID_DIFF_WORST_SR.getName(),context.get(WV21__SAME_VID_DIFF_WORST_SR.getName())));
    context.put(WV21_IP_SIMILARITY_BEST_SR.getName() + "_sr",getWoeValue(WV21_IP_SIMILARITY_BEST_SR.getName(),context.get(WV21_IP_SIMILARITY_BEST_SR.getName())));
    context.put(WV21_NAME_BOGUS_ANY_SR.getName() + "_sr",getWoeValue(WV21_NAME_BOGUS_ANY_SR.getName(),context.get(WV21_NAME_BOGUS_ANY_SR.getName())));
    context.put(WV21_PH_BOGUS_ANY_SR.getName() + "_sr",getWoeValue(WV21_PH_BOGUS_ANY_SR.getName(),context.get(WV21_PH_BOGUS_ANY_SR.getName())));
    context.put(WV2_ACCT_IP_NEW_CTRY_SR.getName() + "_sr",getWoeValue(WV2_ACCT_IP_NEW_CTRY_SR.getName(),context.get(WV2_ACCT_IP_NEW_CTRY_SR.getName())));
    context.put(WV2_A_TX_EVENTS_WITHIN_10_SR.getName() + "_sr",getWoeValue(WV2_A_TX_EVENTS_WITHIN_10_SR.getName(),context.get(WV2_A_TX_EVENTS_WITHIN_10_SR.getName())));
    context.put(WV2_ACCT_PEEKING_WORST_SR.getName() + "_sr",getWoeValue(WV2_ACCT_PEEKING_WORST_SR.getName(),context.get(WV2_ACCT_PEEKING_WORST_SR.getName())));
    context.put(WV2_B_T_RATIO_TO_NET_3D_W_SR.getName() + "_sr",getWoeValue(WV2_B_T_RATIO_TO_NET_3D_W_SR.getName(),context.get(WV2_B_T_RATIO_TO_NET_3D_W_SR.getName())));
    context.put(WV2_C_IN_CTRY_MATCH_WORST_SR.getName() + "_sr",getWoeValue(WV2_C_IN_CTRY_MATCH_WORST_SR.getName(),context.get(WV2_C_IN_CTRY_MATCH_WORST_SR.getName())));
    context.put(WV2_E_IP_EQ_INDICATIVE_SR.getName() + "_sr",getWoeValue(WV2_E_IP_EQ_INDICATIVE_SR.getName(),context.get(WV2_E_IP_EQ_INDICATIVE_SR.getName())));
    context.put(WV2_I_IN_CTRY_SCORE_WORST_SR.getName() + "_sr",getWoeValue(WV2_I_IN_CTRY_SCORE_WORST_SR.getName(),context.get(WV2_I_IN_CTRY_SCORE_WORST_SR.getName())));
    context.put(WV2_IP_NET_SCORE_WORST_SR.getName() + "_sr",getWoeValue(WV2_IP_NET_SCORE_WORST_SR.getName(),context.get(WV2_IP_NET_SCORE_WORST_SR.getName())));
    context.put(WV31_IP_COUNTRY_MATCH_SR.getName() + "_sr",getWoeValue(WV31_IP_COUNTRY_MATCH_SR.getName(),context.get(WV31_IP_COUNTRY_MATCH_SR.getName())));
    context.put(WV31_IP_HOPPING_SR.getName() + "_sr",getWoeValue(WV31_IP_HOPPING_SR.getName(),context.get(WV31_IP_HOPPING_SR.getName())));
    context.put(WV31_IP_HOPPING_STRICT_SR.getName() + "_sr",getWoeValue(WV31_IP_HOPPING_STRICT_SR.getName(),context.get(WV31_IP_HOPPING_STRICT_SR.getName())));
    context.put(WV35_IP_CONN_TYPE_SR.getName() + "_sr",getWoeValue(WV35_IP_CONN_TYPE_SR.getName(),context.get(WV35_IP_CONN_TYPE_SR.getName())));
    context.put(WV35__PING_LAT_INDICATIVE_SR.getName() + "_sr",getWoeValue(WV35__PING_LAT_INDICATIVE_SR.getName(),context.get(WV35__PING_LAT_INDICATIVE_SR.getName())));
    context.put(WV35_IP_PH_GEO_WORST_SR.getName() + "_sr",getWoeValue(WV35_IP_PH_GEO_WORST_SR.getName(),context.get(WV35_IP_PH_GEO_WORST_SR.getName())));
    context.put(WV35_THIRD_PARTY_PATTERNS_SR.getName() + "_sr",getWoeValue(WV35_THIRD_PARTY_PATTERNS_SR.getName(),context.get(WV35_THIRD_PARTY_PATTERNS_SR.getName())));
    context.put(WV3_IP_AD_DIST_3D_WORST_SR.getName() + "_sr",getWoeValue(WV3_IP_AD_DIST_3D_WORST_SR.getName(),context.get(WV3_IP_AD_DIST_3D_WORST_SR.getName())));
    context.put(WV3_IP_AD_DIST_BEST_SR.getName() + "_sr",getWoeValue(WV3_IP_AD_DIST_BEST_SR.getName(),context.get(WV3_IP_AD_DIST_BEST_SR.getName())));
    context.put(WV3_IP_AD_DIST_INDICATIVE_SR.getName() + "_sr",getWoeValue(WV3_IP_AD_DIST_INDICATIVE_SR.getName(),context.get(WV3_IP_AD_DIST_INDICATIVE_SR.getName())));
    context.put(WV3_T_DUSTRY_ARS_CATEGORY_SR.getName() + "_sr",getWoeValue(WV3_T_DUSTRY_ARS_CATEGORY_SR.getName(),context.get(WV3_T_DUSTRY_ARS_CATEGORY_SR.getName())));
  }



  private double getWoeValue(String varName, Object value) {
    if (value instanceof NullValue) {
      value = null;
    }
    
    double woeValue = 0;
    
    return woeValue;
  }
}
