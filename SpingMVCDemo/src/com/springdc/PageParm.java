package com.springdc;

public class PageParm
{
  private int page;
  private int pagesize;
  private String sortname;
  private String sortorder;
  private String filter;
  private String datainfoid;
  private String operaterid;

  public int getPage()
  {
    return this.page;
  }
  public void setPage(int page) {
    this.page = page;
  }
  public int getPagesize() {
    return this.pagesize;
  }
  public void setPagesize(int pagesize) {
    this.pagesize = pagesize;
  }
  public String getSortname() {
    return this.sortname;
  }
  public void setSortname(String sortname) {
    this.sortname = sortname;
  }
  public String getSortorder() {
    return this.sortorder;
  }
  public void setSortorder(String sortorder) {
    this.sortorder = sortorder;
  }
  public String getFilter() {
    return this.filter;
  }
  public void setFilter(String filter) {
    this.filter = filter;
  }
  public String getDatainfoid() {
    return this.datainfoid;
  }
  public void setDatainfoid(String datainfoid) {
    this.datainfoid = datainfoid;
  }
  public String getOperaterid() {
    return this.operaterid;
  }
  public void setOperaterid(String operaterid) {
    this.operaterid = operaterid;
  }
}