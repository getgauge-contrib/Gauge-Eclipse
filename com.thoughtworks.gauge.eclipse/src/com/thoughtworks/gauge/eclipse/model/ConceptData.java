package com.thoughtworks.gauge.eclipse.model;

import com.thoughtworks.gauge.ConceptInfo;

public class ConceptData {

	private String filePath;
	private Integer lineNumber;

	public ConceptData(ConceptInfo conceptInfo) {
		// TODO Auto-generated constructor stub
		filePath = conceptInfo.getFilePath();
		lineNumber = conceptInfo.getLineNumber();
	}

	public String getFilePath() {
		return filePath;
	}
	
	public Integer getLineNumber() {
		return lineNumber;
	}
}