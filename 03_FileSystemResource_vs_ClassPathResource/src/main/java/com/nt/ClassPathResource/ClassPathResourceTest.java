package com.nt.ClassPathResource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.PersonInfoTest;

public class ClassPathResourceTest {

	public static void main(String[] args) {
		/**
		 * Here both way is specify to configure spring Bean configuration file with FileSystemResource
		 * But it is not industry standard to use FileSystemResource to configure Spring Bean configuration file
		 */
		//internally uses java.io.files to hold the name and location of configuration file
		//relative path 
		//FileSystemResource fsr=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//absolute Path
	//	FileSystemResource fsr=new FileSystemResource("E:\\IT Lang. Videos and photos\\7) Spring Stack\\Excercises\\03_ClassPathResource_vs_FileSystemResource\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		
		/**
		 * Industry standard is ClassPathResource to configure spring Bean Configuration file
		 */
		//in this below approach we already configure build path (classpath ) for configuration file
		//and we just have to provide name of spring bean configuration file name
		//THIS IS NOT RECOMMONDED APPROACH
		//ClassPathResource cpr1=new ClassPathResource("applicationContext.xml");
		
		/**
		 * In this approach already upto src/main/java path is register we just have to
		 * provide package name and file name and THIS APPROACH IS RECOMMENDED IN
		 * INDUSTRY
		 */
		ClassPathResource cpr=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		
		//creating spring  bean factory
		XmlBeanFactory factory=new XmlBeanFactory(cpr);
		
		//reading the bean id and first search in IOC container inMemoryMetaData and then spring bean configurion file
		Object obj=factory.getBean("pf");
		
		PersonInfoTest pi=(PersonInfoTest)obj;
		String msg=pi.getPersonInfo("Akshay");
		System.out.println(msg);
		
	}

}
