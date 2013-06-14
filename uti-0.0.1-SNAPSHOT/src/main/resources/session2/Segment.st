package com.paypal.risk.idi.models.session;

import static com.paypal.risk.idi.models.session.SessionVariableRepository.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

public class $segment$ extends $abstractsegment${

  @Override
  public List<AbstractBaseVariable> getVariables() {
    
    List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
    
    $variablesadd$

    return variables;
    
  }
  
  @Override
  protected double getWoeValue(String varName, Object value) throws Exception {
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

    $getwoevalue$
	
	else 

		{
			throw new RuntimeException("WOE not available for variable " + varName);
		}
		
		return woeValue;
  }
  
  @Override
  public HashMap<String, Double> getCoeffMap() {
    HashMap<String, Double> coeffMap = new HashMap<String, Double>();
    
    $coeffmap$
    
    return coeffMap;
  }

  @Override
  public double getCoeff1() {
    return $coeff1$;
  }

  @Override
  public double getCoeff2() {
    return  $coeff2$;
  }

  @Override
  public $segmenttype$ getSegmentType() {
    // TODO Auto-generated method stub
    return $segmenttype$.$segmentenum$;
  }
  
}
