package com.thoughtworks.gauge.eclipse.project;

import com.thoughtworks.gauge.ConceptInfo;

public class Concept {

	private String filePath;
	private Integer lineNumber;

	public Concept(ConceptInfo conceptInfo) {
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
