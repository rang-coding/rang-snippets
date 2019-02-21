package com.rang.snippets.file.pdf;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * This is a simple example of how to create a Pdf-file using the iText-library.
 * 
 * @author emma@rang-coding.com
 *
 */
public class SimpleITextPdfWriter {

	/**
	 * Writes an example Pdf-file to the file system.
	 * 
	 * @param filename Name and location of the file to be written
	 * @throws FileNotFoundException Path cannot be found
	 * @throws DocumentException     Unable to perform operation on {@code Document}
	 */
	public static void writePdfFile(String filename) throws FileNotFoundException, DocumentException {

		Document document = new Document(PageSize.A4);
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
		writer.setPdfVersion(PdfWriter.PDF_VERSION_1_7);
		document.open();

		// Header
		Paragraph paragraph = new Paragraph();
		paragraph.setAlignment(Element.ALIGN_RIGHT);
		paragraph.add(new Chunk("RANG", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, new BaseColor(17, 217, 17))));
		paragraph.add(new Chunk("-coding", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, BaseColor.BLACK)));
		document.add(paragraph);

		document.add(Chunk.NEWLINE);

		// Body
		Paragraph paragraph2 = new Paragraph();
		paragraph2.setAlignment(Element.ALIGN_JUSTIFIED);
		paragraph2.setFont(FontFactory.getFont(FontFactory.HELVETICA, 14, BaseColor.BLACK));
		paragraph2.add("This is an example pdf-file, generated with iText. ");
		paragraph2.add("It contains multiple paragraphs, different fonts, different alignments and german umlauts.");
		document.add(paragraph2);

		document.add(Chunk.NEWLINE);

		// Complimentary close
		Paragraph paragraph3 = new Paragraph();
		paragraph3.setFont(FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK));
		paragraph3.add("Viele Grüße!");
		paragraph3.add(Chunk.NEWLINE);
		paragraph3.add("Emma");
		document.add(paragraph3);

		document.close();
	}

	/**
	 * Creates an example Pdf-document in memory using
	 * {@link ByteArrayOutputStream}.
	 * 
	 * @return Pdf-file as byte-Array
	 * @throws DocumentException Unable to perform operation on {@code Document}
	 */
	public static byte[] createPdfDocument() throws DocumentException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		Document document = new Document();
		PdfWriter.getInstance(document, baos);
		document.open();

		// XXX Your implementation goes here
		document.add(new Chunk("RANG-coding", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, BaseColor.BLACK)));

		document.close();

		return baos.toByteArray();
	}

	/**
	 * Runner demonstrating usage of above methods.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) throws Exception {

		// TODO please adjust to your file system
		String filename = "C:/Temp/RangCoding-iText.pdf";

		writePdfFile(filename);
		System.out.println("Pdf-file written to:  " + filename);
		byte[] pdfDocument = createPdfDocument();
		System.out.println("Pdf-document created: " + pdfDocument.length + "bytes");
		System.out.println("DONE!");
	}

}
