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
    $variables:{context.put($it$.getName() + "_woe", getWoeValue($it$.getName(),context,get($it$.getName())));
    }$
  }



  private double getWoeValue(String varName, Object value) {
    if (value instanceof NullValue) {
      value = null;
    }
    
    double woeValue = 0;
    
    return woeValue;
  }
}
