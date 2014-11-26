package com.model;

import java.io.Serializable;

public class ChartItem implements Serializable{

	private static final long serialVersionUID = -4417466039628009531L;

	private String studyId;
	
	private String chartText;
	
	private String chartObject;
	
	private String chartType;
	
	private String head;
	
	private boolean other;

	public ChartItem() {
		super();
	}



	public ChartItem(String studyId, String chartText, String chartObject,
			String chartType, String head, boolean other) {
		super();
		this.studyId = studyId;
		this.chartText = chartText;
		this.chartObject = chartObject;
		this.chartType = chartType;
		this.head = head;
		this.other = other;
	}


	public ChartItem(String studyId, String chartText, String chartObject,
			String chartType, String head) {
		super();
		this.studyId = studyId;
		this.chartText = chartText;
		this.chartObject = chartObject;
		this.chartType = chartType;
		this.head = head;
	}

	public boolean isOther() {
		return other;
	}


	public void setOther(boolean other) {
		this.other = other;
	}


	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}


	public String getChartText() {
		return chartText;
	}

	public void setChartText(String chartText) {
		this.chartText = chartText;
	}

	public String getChartObject() {
		return chartObject;
	}

	public void setChartObject(String chartObject) {
		this.chartObject = chartObject;
	}

	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}
	
}
