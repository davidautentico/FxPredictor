package drosa.experimental.zznbrum;

import java.util.Calendar;

import drosa.utils.DateUtils;

public class TrendClass {

	long millisIndex1 = 0;//fecha index1
	long millisIndex2 = 0;//fecha index2	
	long millisOpen = 0;//fecha de definicion de trend
	int size=0;
	int sizeClose=0;
	double factor = 0;
	int mode=0;
	
	
	public long getMillisOpen() {
		return millisOpen;
	}
	public void setMillisOpen(long millisOpen) {
		this.millisOpen = millisOpen;
	}
	public long getMillisIndex1() {
		return millisIndex1;
	}
	public void setMillisIndex1(long millisIndex1) {
		this.millisIndex1 = millisIndex1;
	}
	public long getMillisIndex2() {
		return millisIndex2;
	}
	public void setMillisIndex2(long millisIndex2) {
		this.millisIndex2 = millisIndex2;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getSizeClose() {
		return sizeClose;
	}
	public void setSizeClose(int sizeClose) {
		this.sizeClose = sizeClose;
	}
	

}