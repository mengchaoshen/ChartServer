package com.model;

import java.io.Serializable;
import java.util.List;

public class AnnounJson implements Serializable{

	private static final long serialVersionUID = -9021880601007041393L;
	
	private List<Announcement> annList;

	public List<Announcement> getAnnList() {
		return annList;
	}

	public void setAnnList(List<Announcement> annList) {
		this.annList = annList;
	}

}
