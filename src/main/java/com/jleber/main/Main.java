package com.jleber.main;

import com.jleber.nfeschema.TEnviNFe;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by jleber on 20/06/17.
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        TEnviNFe tEnviNFe = new TEnviNFe();
        tEnviNFe.setVersao("1.0.0");

        File file = new File("sefaz.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(TEnviNFe.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();


        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(tEnviNFe, file);
        jaxbMarshaller.marshal(tEnviNFe, System.out);

    }
}
