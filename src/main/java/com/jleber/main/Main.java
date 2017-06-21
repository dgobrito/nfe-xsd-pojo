package com.jleber.main;

import com.jleber.nfeschema.ObjectFactory;
import com.jleber.nfeschema.TEnviNFe;
import com.jleber.nfeschema.TNFe;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by jleber on 20/06/17.
 */
public class Main {
    public static void main(String[] args) throws JAXBException {


        File file = new File("sefaz.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(TEnviNFe.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();


        TNFe.InfNFe infNFe = new TNFe.InfNFe();
        infNFe.setVersao("versao");
        infNFe.setId("id 1");

        TNFe nfe = new TNFe();
        nfe.setInfNFe(infNFe);

        ObjectFactory factory = new ObjectFactory();
        JAXBElement<TNFe> nFeJaxb = factory.createNFe(nfe);

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(nFeJaxb, file);
        jaxbMarshaller.marshal(nFeJaxb, System.out);

    }
}
