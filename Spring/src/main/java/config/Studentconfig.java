package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Student;

@Configuration
public class Studentconfig {

	@Bean(initMethod="init",destroyMethod="destroy")
	public Student student()
	{
		return new Student();
	}
}
