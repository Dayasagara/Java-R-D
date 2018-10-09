package com.daya.MappingStream;

import java.util.List;

public class PartDetails {

	private int detailId;
	private List<String> parts;
	
	public PartDetails(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}

	public int getDetailId() {
		return detailId;
	}

	public List<String> getParts() {
		return parts;
	}
}
