package com.kmc.setters;

public class SetterInjection 
{
	 public String eid;
	 public String ename;
	 
	 
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "SetterInjection [eid=" + eid + ", ename=" + ename + "]";
	}
	

}
