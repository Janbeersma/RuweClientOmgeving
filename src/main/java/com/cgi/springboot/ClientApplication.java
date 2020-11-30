package com.cgi.springboot;

import Components.PrepForPostAndPost;
import Components.XMLtoPOJOmarshaller;
import XMLPOJOs.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

@SpringBootApplication
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		XMLtoPOJOmarshaller xmLtoPOJOmarshaller = new XMLtoPOJOmarshaller();
		try {
			Message unmarshalledXMLmessage = xmLtoPOJOmarshaller.marshalintoClass();
			PrepForPostAndPost prepForPostAndPost = new PrepForPostAndPost();
			prepForPostAndPost.PrepAndPost(unmarshalledXMLmessage);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}
}
