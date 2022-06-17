package com.hospital.utilis;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.hospital.entities.Bill;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

@Component

public class PdfGenerator {

	
	 private static final String FILE_NAME = "D:\\sts\\hospital\\src\\main\\resources\\pdf\\Bill";

	    public void writeUsingIText(Bill bill) {
	    	long billNo = bill.getBillNo();
	    	String patientFirstName = bill.getPatientFirstName();
	    	String patientLastName = bill.getPatientLastName();
	    	String disease = bill.getDisease();
	    	int age = bill.getAge();
	    	String gender = bill.getGender();
	    	Date billDate = bill.getBillDate();
	    	int fees = bill.getFees();
	    	String doctorFirstName = bill.getDoctorFirstName();
	    	String doctorLastName = bill.getDoctorLastName();
	    	String medicine = bill.getMedicine();
	    	

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME+" "+billNo+".pdf")));

	            //open
	            document.open();

	            Paragraph p1 = new Paragraph();
	            p1.add("Hospital Invoice");
	            p1.setAlignment(Element.ALIGN_CENTER);
	            document.add(p1);

	            Image image = Image.getInstance("D:\\sts\\hospital\\src\\main\\resources\\static\\img\\logo.png");
	            image.setAbsolutePosition(10f, 780f);
	            image.scaleAbsolute(50,50);
	            document.add(image);
	            
	            Paragraph p2 = new Paragraph();
	            p2.add("Bill NO : " +billNo);
	            p2.setAlignment(Element.ALIGN_RIGHT);
	            document.add(p2);
	            
	            document.add( Chunk.NEWLINE );
	            Paragraph p3 = new Paragraph();
	            p3.add("Bill Date : "+billDate+"\n");
	            p3.setAlignment(Element.ALIGN_RIGHT);
	            document.add(p3);
	            document.add( Chunk.NEWLINE );
	            
	            document.add(new LineSeparator());
	            
	            
	            document.add( Chunk.NEWLINE );
	            Paragraph p4 = new Paragraph();
	            p4.add("Doctor Name : "+doctorFirstName+" "+doctorLastName);
	            document.add(p4);

	            document.add( Chunk.NEWLINE );
	            Paragraph p5 = new Paragraph();
	            p5.add("Patient Name : "+patientFirstName+" "+patientLastName);
	            document.add(p5);
	            
	            
	            document.add( Chunk.NEWLINE );
	            Paragraph p6 = new Paragraph();
	            p6.add("Patient Age : "+age);
	            document.add(p6);
	            
	            document.add( Chunk.NEWLINE );
	            Paragraph p7 = new Paragraph();
	            p7.add("Patient Gender : "+gender);
	            document.add(p7);
	        
	            document.add( Chunk.NEWLINE );
	            Paragraph p8 = new Paragraph();
	            p8.add("Disease : "+disease);
	            document.add(p8);
	            
	            document.add( Chunk.NEWLINE );
	            Paragraph p9 = new Paragraph();
	            p9.add("Medicine : "+medicine);
	            document.add(p9);
	            
	            
	            document.add( Chunk.NEWLINE );	            
	            Paragraph p10 = new Paragraph();
	            p10.add("fees : "+fees);
	            document.add(p10);
	            
	            document.add( Chunk.NEWLINE );
	            document.add( Chunk.NEWLINE );
	            document.add( Chunk.NEWLINE );
	            document.add( Chunk.NEWLINE );
	            document.add( Chunk.NEWLINE );
	            
	            
	            document.add(new LineSeparator());
	            	            
	            Paragraph p_footer = new Paragraph();
	            p_footer.add("This is computer generated bill no signature required");
	            document.add(p_footer);

	            //close
	            document.close();

	            System.out.println("Done");
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	    }
	    
}
