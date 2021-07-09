package com.revature.adventure;

import socket.Interactable;

public class Item implements Interactable{
	protected String name, action; 
	protected boolean removeable;
	protected boolean interactive;
	
	public Item() {
		this.name = "No name";
		this.action = "None";
		this.interactive = true;
		this.removeable = false;
	}
	
	public Item(String name, String action) {
		this.name = name;
		this.action = action;
		this.interactive = true;
		this.removeable = false;
		
	}
	
	public Item(String name, String action, boolean canRemove) {
		this.name = name;
		this.action = action;
		this.interactive = true;
		this.removeable = canRemove;
		
	}
	
	
	public void remove() {
		this.removeable = false;
	}
	
	public boolean isRemoveAble() {
		return this.removeable;
	}

	@Override
	public boolean isInteractable() {
		return this.interactive;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void commitInteraction(String actionTaken) {
		if(isInteractable()== true) {
			
			System.out.println("Action taken: " + actionTaken + "\n");
			return;
		}else{
			System.out.println("Not interactive!");
		}
		return;
		
	}
	
}
