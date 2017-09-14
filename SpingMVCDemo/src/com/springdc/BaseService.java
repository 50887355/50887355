package com.springdc;


public abstract interface BaseService<T> {
	public abstract BeanResult<T> query();
	public abstract String queryString();
}
