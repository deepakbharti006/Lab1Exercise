package com.cg.lab1.annotation.prob2;

public class Sbu {

private String sbuId;
private String sbuName;
private String sbuHead;

public String getsbuId() {
	return sbuId;
}

public void setsbuId(String sbuId) {
	this.sbuId = sbuId;
}

public String getsbuName() {
	return sbuName;
}

public void setsbuName(String sbuName) {
	this.sbuName = sbuName;
}

public String getsbuHead() {
	return sbuHead;
}

public void setsbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}

public Sbu(String sbuId,String sbuName, String sbuHead) {
	super();
	this.sbuId = sbuId;
	this.sbuName = sbuName;
	this.sbuHead = sbuHead;
}
public Sbu() {
	
}

}
