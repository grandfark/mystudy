package com.kosa.quiz;

public class GiftVO {
	String g_name;
	int g_no;
	int g_start;
	int g_end;
	
	
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public int getG_no() {
		return g_no;
	}
	public void setG_no(int g_no) {
		this.g_no = g_no;
	}
	public int getG_start() {
		return g_start;
	}
	public void setG_start(int g_start) {
		this.g_start = g_start;
	}
	public int getG_end() {
		return g_end;
	}
	public void setG_end(int g_end) {
		this.g_end = g_end;
	}
	
	@Override
	public String toString() {
		return "gi [ g_name ="+g_name+", g_no = "+g_no+", g_start = "+g_start+", g_end = "+g_end+" ]";
	}
	
}