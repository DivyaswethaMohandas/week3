package org.student;

import org.department.Department;

public class Student extends Department  {
	//studentName(),studentDept(),studentId()
 public void studentName() {
	 System.out.println("Student Name- Divya ---comes from Student Class");
 }
 public void studentDept() {
	 System.out.println("Student department -IT ---comes from Student Class");
 }
 public void studentId() {
	 System.out.println("studentId- 01 ---comes from Student Class");
 }
 
 public static void main(String[] args) {
	 Student dd= new Student();
	 dd.collegeName();
	 dd.collegeCode();
	 dd.collegeRank();
	 dd.deptName();
	 dd.studentName();
	 dd.studentDept();
	 dd.studentId();
 }
 
}
