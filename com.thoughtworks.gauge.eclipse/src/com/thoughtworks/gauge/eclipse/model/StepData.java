package com.thoughtworks.gauge.eclipse.model;

import com.thoughtworks.gauge.StepValue;

public class StepData {
	private String stepAnnotationText;
	private int parameterCount;

	public StepData(StepValue stepValue) {
		stepAnnotationText = stepValue.getStepAnnotationText();
		parameterCount = stepValue.getParamCount();		
	}
	
	public String getStepAnnotationText() {
		return stepAnnotationText;
	}
	
	public int getParameterCount() {
		return parameterCount;
	}
}
