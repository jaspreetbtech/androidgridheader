package com.example.headerlistview;
 

public class Model {
	private boolean isGroupHeader = false;
	public String title,counter;
	int icon;
	public Model(String title)
	{
		this.title = title;
		isGroupHeader = true;
	}
	public Model(int icon, String title, String counter) {
		super();
		this.icon = icon;
		this.title = title;
		this.counter = counter;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCounter() {
		return counter;
	}
	public void setCounter(String counter) {
		this.counter = counter;
	}
	
	public boolean isGroupHeader() {
		return isGroupHeader;
	}
	public void setGroupHeader(boolean isGroupHeader) {
		this.isGroupHeader = isGroupHeader;
	}


}
