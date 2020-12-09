package com.cgi.springboot;

import Components.PrepForPostAndPost;
import Components.XMLtoPOJOmarshaller;
import XMLPOJOs.EnumProfileSequence;
import XMLPOJOs.Message;
import XMLPOJOs.PortingRequestSequenceV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		XMLtoPOJOmarshaller xmLtoPOJOmarshaller = new XMLtoPOJOmarshaller();
		try {
			Message unmarshalledXMLmessage = xmLtoPOJOmarshaller.marshalintoClass();
//			List<PortingRequestSequenceV2> lijstje = unmarshalledXMLmessage.getBody().getPortingrequest().getV2().getRepeats().getSeq();
//			PortingRequestSequenceV2 seq = lijstje.get(0);
//			List<EnumProfileSequence> enumlist = seq.getRepeats().getSeq();
//			EnumProfileSequence enumseq = enumlist.get(0);
//			System.out.println(enumseq.getProfileid());
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
