package com.example.demo;
 
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
 
@RestController
@EnableAutoConfiguration
public class HostnameExampleApplication {
	
 
    @RequestMapping("/getHostName")
    String home() throws UnknownHostException {
    	 InetAddress inetAddress;
		
			inetAddress = InetAddress.getLocalHost();
			   System.out.println("IP Address:- " + inetAddress.getHostAddress());
		       System.out.println("Host Name:- " + inetAddress.getHostName());
		
		       String HostAddress=inetAddress.getHostAddress();
		       String getHostName="IPAdress:"+inetAddress.getHostAddress()+", \nHostName:"+inetAddress.getHostName();
       // return "Hello World Spring Boot!";
		       return getHostName;
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HostnameExampleApplication.class, args);
    }
    
    
 
}