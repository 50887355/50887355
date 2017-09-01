package com.springdc;


public interface BaseService<T> {
	public abstract ResultVO<T> query();
}
