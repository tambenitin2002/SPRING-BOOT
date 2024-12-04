package edu.jsp.setter_injection;

public class ClassRoom {
   private int classRoomNo;
   private int flour;
public ClassRoom() {
	super();
}
public int getClassRoomNo() {
	return classRoomNo;
}
public void setClassRoomNo(int classRoomNo) {
	this.classRoomNo = classRoomNo;
}
public int getFlour() {
	return flour;
}
public void setFlour(int flour) {
	this.flour = flour;
}
@Override
public String toString() {
	return "ClassRoom [classRoomNo=" + classRoomNo + ", flour=" + flour + "]";
}
   
}
