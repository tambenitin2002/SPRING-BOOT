package edu.jsp.constructor_usage;

public class ClassRoom {
 private int classRoomNo;
 private int classRoomCapacity;
 private int floarNo;
public ClassRoom(int classRoomNo, int classRoomCapacity, int floarNo) {
	super();
	this.classRoomNo = classRoomNo;
	this.classRoomCapacity = classRoomCapacity;
	this.floarNo = floarNo;
}
@Override
public String toString() {
	return "ClassRoom [classRoomNo=" + classRoomNo + ", classRoomCapacity=" + classRoomCapacity + ", floarNo=" + floarNo
			+ "]";
}
 
}
