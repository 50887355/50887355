package com.springdc;

import java.util.List;

public class ResultVO<T> {
	private List<T> resultlist;

	public List<T> getResultlist() {
		return resultlist;
	}

	public void setResultlist(List<T> resultlist) {
		this.resultlist = resultlist;
	}
	
	
}
