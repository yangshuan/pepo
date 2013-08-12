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
    $VarList:{context.put("$it.output$", normalizeVariableReplaceByMean(context.get($it.name$),$it.params$));
    }$
  }

  private void buildWoeStringVariables(Map<String,Object> context) throws Exception {
    $variables.keys:{k | context.put("$k$", getWoeValue($variables.(k)$.getName(),context.get($variables.(k)$.getName())));
    }$
  }



  private double getWoeValue(String varName, Object value) {
  
    double valueDouble = 0;
    if (value instanceof NullValue) {
      value = null;
    }else if (value instanceof Number)
      valueDouble = ((Number)value).doubleValue();
    double woeValue = 0;
    
    $woe$
    
    return woeValue;
  }
}
