package com.gilvano;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXBExample {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setName("Gilvano");
		customer.setAge(32);
		customer.setId(100);

		try {
			File file = new File("C:\\file.xml");

			JAXBContext jaxbcontext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbcontext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
