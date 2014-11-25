package com.model;

import java.io.Serializable;

public class ChartItem implements Serializable{

	private static final long serialVersionUID = -4417466039628009531L;

	private String studyId;
	
	private String text;
	
	private String chartObject;
	
	private String chartType;
	
	private String head;

	public ChartItem() {
		super();
	}

	public ChartItem(String studyId, String text, String chartObject,
			String chartType, String head) {
		super();
		this.studyId = studyId;
		this.text = text;
		this.chartObject = chartObject;
		this.chartType = chartType;
		this.head = head;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
