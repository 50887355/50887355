package com.springdc;


public abstract interface BaseService<T> {
	public abstract ResultVO<T> query();
}
