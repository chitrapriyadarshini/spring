package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Studentconfig;
import model.Student;

public class StudentTest {
	public static void main(String args[])
	{
ApplicationContext context=new AnnotationConfigApplicationContext(Studentconfig.class);
Student student=(Student)context.getBean(Student.class);

student.setAge(19);
student.setName("xyz");

System.out.println(student);


}
}
