package com.paypal.risk.idi.models.session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebay.kernel.logger.LogLevel;
import com.ebay.kernel.logger.Logger;
import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.models.Segment;
import com.paypal.risk.idi.models.ModelException;

public abstract class $abstractsegment$ implements Segment{
  
  protected static Logger logger = Logger.getInstance($abstractsegment$.class);
  
  public static final double INTERCEPT = 1;
  
  @Override
  public Double calculateScore(Map<String, Object> context)
      throws ModelException {
    
    List<AbstractBaseVariable> variables = getVariables();
    Map<String, Double> coeffMap = getCoeffMap();
    
    try{
      Double score = 0.0;
      Double align_score = 0.0;
      if (coeffMap != null && coeffMap.get("Intercept") != null) {
        score += INTERCEPT * coeffMap.get("Intercept");
      }
      for (AbstractBaseVariable variable : variables) {
        if (variable == null) continue;
        Object value = null;
        try {
          //System.err.println("We're now executing: " + variable.getName());
          value = variable.execute(context);
          //System.err.println("The value of " + variable.getName() + "is: " + value.toString());
        }
        catch (Exception e) {
          logger.log(LogLevel.ERROR, "Error executing variable " + 
              variable.getName(), e);
        }
        
        Double woeValue = getWoeValue(variable.getName(), value);
        context.put(variable.getName() + "_woe", woeValue);
        
        Double coeff = coeffMap.get(variable.getName());
        if (coeff == null)
          coeff = 0D;
        score += (woeValue * coeff);

      }
      align_score = getCoeff1() + getCoeff2() * score;
      if (align_score < 50D)
        align_score = 50D;
      else if (align_score > 999D)
        align_score = 999D;
      
      return align_score;
    }catch(Exception e){
      throw new ModelException(e);
    }
    
    
  }
  
  public abstract double getCoeff1();

  public abstract double getCoeff2();
  
  @Override
  public String getName() {
    return getSegmentType().getName();
  }

  /**
   * Returns the coefficient value
   * 
   * @return
   */
  public abstract HashMap<String, Double> getCoeffMap();
  
  /**
   * Returns the segment type
   * 
   * @return
   */
  public abstract $segmenttype$ getSegmentType();

  /**
   * Returns the list of variables applicable to this segment
   * 
   * @return
   */
  public abstract List<AbstractBaseVariable> getVariables();
  
  /**
   * Applies woe to variable value and returns the woe value
   * 
   * @param varName
   * @param value
   * @return
   */
  protected abstract double getWoeValue(String varName, Object value)
    throws Exception;
}
