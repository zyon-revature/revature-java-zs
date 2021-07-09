package com.revature.adventure;

import socket.Condition;
import socket.Description;

public class Thing implements Condition, Description{
	protected String condition;
	protected String shortDescription;
	protected String longDescription;
	
	@Override
	public String getCondition() {return this.condition;}
	@Override
	public void setConditon(String txt) {this.condition = txt;}
	
	@Override
	public String getShortDescription() {return this.shortDescription;}
	public void setShortDescription(String txt) {this.shortDescription = txt;}
	
	@Override
	public String getLongDescription() {return this.longDescription;}
	public void setLongDescription(String txt) {this.longDescription = txt;}
}
