package com.rang.snippets.file.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Stream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rang.snippets.domain.StarWarsCharacter;
import com.rang.snippets.domain.StarWarsCharacterFixtures;

/**
 * This is a simple example of how to create a Pdf-file using the iText-library.
 * 
 * @author emma@rang-coding.com
 *
 */
public class AdvancedITextPdfWriter {

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

		PdfPTable table = new PdfPTable(new float[] { 2, 1, 1 });
		table.setWidthPercentage(60);
		Stream.of("Name", "Species", "Homeworld").forEach(columnTitle -> {
			PdfPCell header = new PdfPCell();
			header.setBorderWidthBottom((float) 1.5);
			header.setPhrase(new Phrase(columnTitle, FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK)));
			// header.setBorderColor(new BaseColor(156, 194, 227));
			header.setBorderColor(BaseColor.BLACK);
			header.setUseBorderPadding(true);
			table.addCell(header);
		});

		List<StarWarsCharacter> friends = StarWarsCharacterFixtures.getAsList();
		for (StarWarsCharacter friend : friends) {
			writeBestellposition(table, friend);
		}
		document.add(table);

		// Complimentary close
		Paragraph paragraph3 = new Paragraph();
		paragraph3.setFont(FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK));
		paragraph3.add("Viele Grüße!");
		paragraph3.add(Chunk.NEWLINE);
		paragraph3.add("Emma");
		document.add(paragraph3);

		document.close();
	}

	private static void writeBestellposition(PdfPTable table, StarWarsCharacter position) throws DocumentException {
		PdfPCell cPosition = new PdfPCell();
		cPosition.addElement(new Paragraph(String.valueOf(position.getName()),
				FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK)));
		cPosition.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// cPosition.setPaddingLeft(5);
		// cPosition.setBorderColor(new BaseColor(156, 194, 227));
		cPosition.setBorderColor(BaseColor.BLACK);
		table.addCell(cPosition);

		PdfPCell cArt = new PdfPCell();
		Paragraph para = new Paragraph(position.getSpecies(),
				FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK));
		para.setAlignment(Element.ALIGN_RIGHT);
		cArt.addElement(para);
		cArt.setVerticalAlignment(Element.ALIGN_TOP);
		cArt.setHorizontalAlignment(Element.ALIGN_RIGHT);
		// cArt.setBorderColor(new BaseColor(156, 194, 227));
		cArt.setBorderColor(BaseColor.BLACK);
		table.addCell(cArt);

		PdfPCell cMenge = new PdfPCell();
		cMenge.addElement(new Paragraph(position.getHomeworld(),
				FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK)));
		cMenge.setVerticalAlignment(Element.ALIGN_BOTTOM);
		// cMenge.setBorderColor(new BaseColor(156, 194, 227));
		cMenge.setBorderColor(BaseColor.BLACK);
		table.addCell(cMenge);
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
	}

}
