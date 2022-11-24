package com.nag.service;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
public class PdfService {

    private Logger logger = LoggerFactory.getLogger(PdfService.class);

    public ByteArrayInputStream genratePdf(){
        logger.info("PDF Generation Started");

        String title= "Sanket's Word";
        String context= "I am Sanket, you are welcomed in my Empire";

        ByteArrayOutputStream out = new  ByteArrayOutputStream();

        Document document = new Document();

        PdfWriter.getInstance(document,out);

        document.open();
        Font titlefont= FontFactory.getFont(FontFactory.HELVETICA_BOLD,25);
        Paragraph titlepara= new Paragraph(title,titlefont);

        document.add(titlepara);

        Font contextfont= FontFactory.getFont(FontFactory.HELVETICA,18);
        Paragraph contextpara= new Paragraph(context,contextfont);
        document.add(contextpara);

        document.close();

        return new ByteArrayInputStream(out.toByteArray());
    }

}
