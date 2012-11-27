package com.paypal.risk.idi.models.ato;

import java.util.*;

import com.paypal.risk.idi.variables.AbstractBaseVariable;
import com.paypal.risk.idi.variables.NullValue;

import static com.paypal.risk.idi.models.ato.ATOVariableRepository.*;

public class $class$ extends ATOFullAbstractSegment{
	
	public $class$(ATOSegmentType segType) {
		super(segType);
	}

	@Override
	public List<AbstractBaseVariable> getVariables() {
		
		List<AbstractBaseVariable> variables = new ArrayList<AbstractBaseVariable>();
		
		$vars:{v|variables.add($v$);
}$

		return variables;
		
	}
	
	@Override
	protected double getWoeValue(String varName, Object value, Map<String, Object> context) throws Exception {
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
		
		$woe:{block|$block$
}$
		{
			throw new RuntimeException("WOE not available for variable " + varName);
		}
		
		return woeValue;
	}
	
	@Override
	public HashMap<String, Double> getCoeffMap() {
		HashMap<String, Double> coeffMap = new HashMap<String, Double>();
		
		$scorecard:{entry|coeffMap.put($entry.key$, $entry.value$);
}$
		
		return coeffMap;
	}
	
}













