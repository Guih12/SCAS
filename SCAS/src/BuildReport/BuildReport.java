/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildReport;

import Model.Employee;
import Model.Purchase;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author georgeborsato
 */
public class BuildReport {
    
    public void createReportEmployee(List<Employee> employees){
         String path = "rel_func.pdf";
      try{
          Document document = new Document();
          PdfWriter.getInstance(document, new FileOutputStream(path));
          document.open();
          
          Paragraph p = new Paragraph(20);
          Font black = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);
          p.add(Chunk.NEWLINE);
    
          p.add("RELATÓRIO DE FUNCIONÁRIOS");
          p.add(Chunk.NEWLINE);
          p.add(Chunk.NEWLINE);
          p.setFont(new Font(Font.FontFamily.HELVETICA, 36, Font.NORMAL, BaseColor.BLACK));
          p.setAlignment(Element.ALIGN_CENTER);
          
          
          document.add(p);
          
          
          PdfPTable table = new PdfPTable(5);
          table.setWidthPercentage(100);
          
          PdfPCell c1 =  new PdfPCell(new Phrase("Nome", black));
          PdfPCell c2 =  new PdfPCell(new Phrase("Idade", black));
          PdfPCell c3 =  new PdfPCell(new Phrase("Cpf", black));
          PdfPCell c4 =  new PdfPCell(new Phrase("Endereço", black));
          PdfPCell c5 =  new PdfPCell(new Phrase("Telefone", black));
          c1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c3.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c4.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c5.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          
          table.addCell(c1);
          table.addCell(c2);
          table.addCell(c3);
          table.addCell(c4);
          table.addCell(c5);
          table.setHorizontalAlignment(Element.ALIGN_CENTER);
          
          for(Employee em : employees){
              table.addCell("" + em.getName());
              table.addCell("" + em.getAge());
              table.addCell("" + em.getCpf());
              table.addCell("" + em.getAddress());
              table.addCell("" + em.getPhoneNumber());
          }
          
          document.add(table);
          
          Format formatter = new SimpleDateFormat("dd/MM/yyyy");
          
          Paragraph date = new Paragraph(10);
          date.add(Chunk.NEWLINE);
           date.add(Chunk.NEWLINE);
          Date da = new Date();
          date.add(formatter.format(da));
          date.add(Chunk.NEWLINE);
          date.add(Chunk.NEWLINE);
          date.setAlignment(Element.ALIGN_RIGHT);
          
          document.add(date);
          
          document.close();
          
          Desktop.getDesktop().open(new File(path));
          
          
      }catch(Exception exception){
          System.out.println(exception.getMessage());
      }
      
    }
    
    public void createReportPurchase(List<Purchase> purchases){
        String path = "rel_venda.pdf";
        
        try{
          Document document = new Document();
          PdfWriter.getInstance(document, new FileOutputStream(path));
          document.open();
          
          Paragraph p = new Paragraph(20);
          Font black = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);
          p.add(Chunk.NEWLINE);
    
          p.add("RELATÓRIO DE VENDAS");
          p.add(Chunk.NEWLINE);
          p.add(Chunk.NEWLINE);
          p.setFont(new Font(Font.FontFamily.HELVETICA, 36, Font.NORMAL, BaseColor.BLACK));
          p.setAlignment(Element.ALIGN_CENTER);
          
          
          document.add(p);
          
           
          PdfPTable table = new PdfPTable(3);
          table.setWidthPercentage(100);
          
          PdfPCell c1 =  new PdfPCell(new Phrase("Valor Venda", black));
          PdfPCell c2 =  new PdfPCell(new Phrase("Data Venda", black));
          PdfPCell c3 =  new PdfPCell(new Phrase("Tipo Pagamento", black));
         
          c1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          c3.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
          
          
          table.addCell(c1);
          table.addCell(c2);
          table.addCell(c3);
          table.setHorizontalAlignment(Element.ALIGN_CENTER);
          
           Format formatter = new SimpleDateFormat("dd/MM/yyyy");
   
          
          for(Purchase pu : purchases){
              table.addCell("" + pu.getAmount());
              table.addCell("" + formatter.format(pu.getSaleDate()));
              table.addCell("" + pu.getTypePayment());
          }
          
         document.add(table);
         
         document.close();
          
         Desktop.getDesktop().open(new File(path));
            
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
