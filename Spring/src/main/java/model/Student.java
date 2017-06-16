package model;

public class Student {
private String name;
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private int age;
public Student(){
}
public Student(String name,int age)
{
	super();
	this.name=name;
	this.age=age;
}
public void init()
{
	 System.out.println("The init methood is called");
}
public void destroy()
{
	System.out.println("The destroy ethod is called");
}
}
