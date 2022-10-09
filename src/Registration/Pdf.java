/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author 01957
 */
public class Pdf extends JFrame{
     validatiocheck circle = new validatiocheck();
     int assetsumm = 0;
      int paymentsum = 0;
       Font aa2au2 = new Font(Font.FontFamily.TIMES_ROMAN, 12 );
     Font aa2au1 = new Font(Font.FontFamily.HELVETICA, 11 );
     float[] share4 = new float[]{20f,4f,10f};
    Font tat = new Font(Font.FontFamily.HELVETICA, 10 );
    Font tat2 = new Font(Font.FontFamily.HELVETICA, 8,Font.UNDERLINE );
     Font aa2vs = new Font(Font.FontFamily.HELVETICA, 10 );
     IncomeAssessee ic = new IncomeAssessee();
     Font aa2v = new Font(Font.FontFamily.HELVETICA,12f, Font.UNDERLINE );
       Font aa2amu = new Font(Font.FontFamily.HELVETICA, 11 );
     Font CUSTOM_FONT = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD  );
                             String tic="D:\\soft\\sqljdbc_9.4.0.0_enu\\sqljdbc_9.4\\enu\\pdf file\\itext5\\sathiko.ttf";
                           //FontSelector selector=new FontSelector();
                           BaseFont base=BaseFont.createFont(tic,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
                           Font bradley=new Font(base,12f);
                           Font bradley1=new Font(base,12f);
                           String headers="D:\\soft\\sqljdbc_9.4.0.0_enu\\sqljdbc_9.4\\enu\\pdf file\\itext5\\header.ttf";
                           BaseFont headerf=BaseFont.createFont(tic,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
    public PdfPTable body4sftdm;
   public PdfPTable body1;
     public PdfPTable body4ss = new PdfPTable(4);
    SimpleBottomLine simpleBottomLine=new SimpleBottomLine();
    validatiocheck vlength = new validatiocheck();
     int lentgthnull, oth=0,othd;
     double ar,br,crk;
     //gap calculate
     double[] regu=new double[4];
     double [] incom=new double[4];

JButton EXIT;
LocalDateTime cyear = LocalDateTime.now();
int currentyear = (cyear.getYear());

long TIN;
int vis3 = 0;
int[] totalasset = new int[11];
JMenuBar bar = new JMenuBar();
JMenu menu = new JMenu();
JMenuItem itemregistration = new JMenuItem("Registration");
JMenuItem itemassetliability = new JMenuItem("AssetLiability");
JMenuItem iteminvestmentf = new JMenuItem("Investment");
JMenuItem itemhouseproperty = new JMenuItem("HouseProperty");
JMenuItem itemincomeassee = new JMenuItem("TaxCount");
JMenuItem itemsalary = new JMenuItem("Salary(Income)");
JMenuItem itemtaxcredit = new JMenuItem("Family Expense");
JMenuBar bar4 = new JMenuBar();
JMenu menu4 = new JMenu();
JMenuItem itemregistration4 = new JMenuItem("Registration");
JMenuItem itemassetliability4 = new JMenuItem("AssetLiability");
JMenuItem iteminvestmentf4 = new JMenuItem("Investment");
JMenuItem itemhouseproperty4 = new JMenuItem("HouseProperty");
JMenuItem itemincomeassee4 = new JMenuItem("TaxCount");
JMenuItem itemsalary4 = new JMenuItem("Salary(Income)");
JMenuItem itemtaxcredit4 = new JMenuItem("Family Expense");
ArrayList<Integer> TaxPayment = new ArrayList<Integer>();
String[] salary1 = new String[17];
String[] houseproperty = new String[17];
String[] taxdibate = new String[17];
String[] familyexpense = new String[17];
String[] registrationreturn = new String[21];
String[] assetliabilityreturn = new String[21];
String[] taxcount = new String[21];
int sumsalary = 0, taxfreeincome = 0, housepropertysum = 0, taxsum = 0, taxpaymentsum = 0;
double taxpayable = 0;
double sum1_9 = 0;
ArrayList<Integer> taxpayment = new ArrayList();
double[] leftpart = new double[9];
double[] rightpart = new double[10];
databaseConnection conn = new databaseConnection();
validatiocheck ch = new validatiocheck();
long text;
JTable table = new JTable();
   public class SimpleBottomLine implements PdfPCellEvent {
                        public void cellLayout(PdfPCell cell, Rectangle position, PdfContentByte[] canvas) {
                     // TODO Auto-generated method stub
                     PdfContentByte cb1 = canvas[PdfPTable.LINECANVAS];
                     cb1.saveState();
                     cb1.setLineCap(PdfContentByte.LINE_CAP_ROUND);
                     cb1.setLineDash(0, 5, 1);
                     
                     cb1.moveTo(position.getLeft(), position.getBottom());
                     cb1.lineTo(position.getRight(), position.getBottom());
                     cb1.stroke();
                     cb1.restoreState();
             }
 
         }

    public Pdf() throws DocumentException, ClassNotFoundException, SQLException, JSONException, IOException
    {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test"); 
   /// pdfc();
    }
    public PdfPTable ticc() throws DocumentException
    {
          PdfPTable tick = new PdfPTable(4);
          
                    PdfPCell[][] tickcell = new PdfPCell[4][4];
                     float[] columnWidths = new float[]{5f, 10f,5f,15f};
                    tick.setWidths(columnWidths);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==0)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Self"));  
                                }
                                if(j==1)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Universal Self"));  
                                }
                                if(j==2)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Normal"));  
                                }
                                if(j==3)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph(" "));
                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
                                   tickcell[i][j].disableBorderSide(1);//TOP
                                    tickcell[i][j].disableBorderSide(2);//BOTTOM
                                     //tickcell[i][j].disableBorderSide(4);//LEFT
                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               tick.addCell(tickcell[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);
                            }
                        }
                         tick.setWidthPercentage(95);
                        return tick;
    }
    public PdfPTable instruction() throws DocumentException
    {
       Font tat = new Font(Font.FontFamily.HELVETICA,8f );
        Font tat2 = new Font(Font.FontFamily.HELVETICA, 8,Font.UNDERLINE );
                          PdfPTable pdfPTabletaxcountass2vF1 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF1 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF1 = new float[]{3f,30f};
                         
                           Font aa2vF1 = new Font(Font.FontFamily.HELVETICA,10f, Font.BOLD );
                    pdfPTabletaxcountass2vF1.setWidths(columnWidthsassesseass122vF1);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF1[i][j] = new PdfPCell(new Paragraph("(1)",aa2vF1));
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF1[i][j] = new PdfPCell(new Paragraph("This return of income shall be signed and verified by the individual assessee or paerson as prescribed u/s 75 of the income tax ordinace ,1984.",tat)); 
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF1.addCell(pdfPCelltaxcountass12vF1[i][j]);
                            }
                        }
                      //  document.add(pdfPTabletaxcountass2vF1);
                        //2
                          PdfPTable pdfPTabletaxcountass2vF2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF2 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF2 = new float[]{3f,30f};
                         
                           Font aa2vF2 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF2.setWidths(columnWidthsassesseass122vF2);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF2[i][j] = new PdfPCell(new Paragraph("(2)",aa2vF1));
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF2[i][j] = new PdfPCell(new Paragraph("Enclose where applicable:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF2.addCell(pdfPCelltaxcountass12vF2[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF2);
                        //2s
                        String [][] l2=
                        {
                            {""," (a)","Salary statement for salary income;Bank statement for interest;Certificate"
                                + "for interest on saving instruments; Rent agrement receipts of municipal tax & land revenue, statement of house property loan interest,insurence premium for house property income;statement of Professional income as per IT Rule-8; Copy of assessment/income statement & balance sheet for partnership income;"
                                + "Documents of capital gain; Dividend warrant for dividend income ;Statement of other income;Documents in support of investments in savings certificate,LIP,DPS,Zakat,stock/share etc"},
                            {""," (b)","Statement of income and expenditure; Manufacturing A/C ,trading & Profit & Loss A/C and Balance sheet"},
                            {""," (c)","Depreciation chart claiming depreciation as per THIRD SHEDULE of the income Tax Ordinace,1984;"},
                            {""," (d)","Computation of income accotding to income tax law;"},
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF2s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF2s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF2s = new float[]{3f,2f,28f};
                         
                           Font aa2vF2s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF2s.setWidths(columnWidthsassesseass122vF2s);
                        for (int i = 0; i < l2.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                             
                                    pdfPCelltaxcountass12vF2s[i][j] = new PdfPCell(new Paragraph(l2[i][j],tat)); 
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l2.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF2s.addCell(pdfPCelltaxcountass12vF2s[i][j]);
                            }
                        }
                      //  document.add(pdfPTabletaxcountass2vF2s);
                        //3
                          PdfPTable pdfPTabletaxcountass2vF3 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF3 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF3 = new float[]{3f,30f};
                         
                           Font aa2vF3 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF3.setWidths(columnWidthsassesseass122vF3);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF3[i][j] = new PdfPCell(new Paragraph("(3)",aa2vF1));
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF3[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF3[i][j] = new PdfPCell(new Paragraph("Enclose separate statement for:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF3[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF3.addCell(pdfPCelltaxcountass12vF3[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF3);
                        //3s
                        String [][] l3=
                        {
                            {""," (a)","any income of the spouse of the assessee(if she/he is not an assessee),minor children and dependan"},
                            {""," (b)","tax exempted /tax free income"},
                            //{""," (c)","Depreciation chart claiming depreciation as per THIRD SHEDULE of the income Tax Ordinace,1984;"},
                            
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF3s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF3s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF3s = new float[]{3f,2f,28f};
                         
                           Font aa2vF3s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF3s.setWidths(columnWidthsassesseass122vF3s);
                        for (int i = 0; i < l3.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                                    pdfPCelltaxcountass12vF3s[i][j] = new PdfPCell(new Paragraph(l3[i][j],tat)); 
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l3.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF3s.addCell(pdfPCelltaxcountass12vF3s[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF3s);
                        
                         //4
                          PdfPTable pdfPTabletaxcountass2vF4 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF4 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF4 = new float[]{3f,30f};
                         
                           Font aa2vF4 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF4.setWidths(columnWidthsassesseass122vF4);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF4[i][j] = new PdfPCell(new Paragraph("(4)",aa2vF1));
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF4[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF4[i][j] = new PdfPCell(new Paragraph("Fulfillment of the condition laid down in rule-38 is mandatory for submission of a return under 'Self Assessment'",tat)); 
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF4[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF4.addCell(pdfPCelltaxcountass12vF4[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF4);
                        //5
                          PdfPTable pdfPTabletaxcountass2vF5 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF5 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF5 = new float[]{3f,30f};
                         
                           Font aa2vF5 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF5.setWidths(columnWidthsassesseass122vF5);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF5[i][j] = new PdfPCell(new Paragraph("(5)",aa2vF1));
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF5[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF5[i][j] = new PdfPCell(new Paragraph("Documents furnished to support the declaration should be signed by by the assessee or his /her authorized representative",tat)); 
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF5[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF5.addCell(pdfPCelltaxcountass12vF5[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF5);
                        //6
                          PdfPTable pdfPTabletaxcountass2vF6 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF6 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF6 = new float[]{3f,30f};
                         
                           Font aa2vF6 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF6.setWidths(columnWidthsassesseass122vF6);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF6[i][j] = new PdfPCell(new Paragraph("(6)",aa2vF1));
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF6[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF6[i][j] = new PdfPCell(new Paragraph("The assessee shall submit his/her photograph with return after every five year",tat)); 
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF6[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF6.addCell(pdfPCelltaxcountass12vF6[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF6);
                         //7
                          PdfPTable pdfPTabletaxcountass2vF7 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF7 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF7 = new float[]{3f,30f};
                         
                           Font aa2vF7 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF7.setWidths(columnWidthsassesseass122vF7);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF7[i][j] = new PdfPCell(new Paragraph("(7)",aa2vF1));
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF7[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF7[i][j] = new PdfPCell(new Paragraph("Furnished the following information:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF7[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF7.addCell(pdfPCelltaxcountass12vF7[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF7);
                        //3s
                        String [][] l7=
                        {
                            {""," (a)","Name,address & TIN of the partners if the assessee is a firm"},
                            {""," (b)","Name of firm address & TIN if the assesseee is a partner"},
                            {""," (c)","Name of the company,address & TIN if the assessee is director"},
                            
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF7s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF7s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF7s = new float[]{3f,2f,28f};
                         
                           Font aa2vF7s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF7s.setWidths(columnWidthsassesseass122vF7s);
                        for (int i = 0; i < l7.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                                    pdfPCelltaxcountass12vF7s[i][j] = new PdfPCell(new Paragraph(l7[i][j],tat)); 
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l7.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF7s.addCell(pdfPCelltaxcountass12vF7s[i][j]);
                            }
                        }
                      //  document.add(pdfPTabletaxcountass2vF7s);
                         //8
                          PdfPTable pdfPTabletaxcountass2vF8 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF8 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF8 = new float[]{3f,30f};
                         
                           Font aa2vF8 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF8.setWidths(columnWidthsassesseass122vF8);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF8[i][j] = new PdfPCell(new Paragraph("(8)",aa2vF1));
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF8[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF8[i][j] = new PdfPCell(new Paragraph("Assets & Liabilities of self , spouse(if she/he is not an assessee),minor children and dependant(s) to be shown in the IT-10B",tat)); 
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF8[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF8.addCell(pdfPCelltaxcountass12vF8[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF8);
                         //9
                          PdfPTable pdfPTabletaxcountass2vF9 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF9 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF9 = new float[]{3f,30f};
                         
                           Font aa2vF9 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF9.setWidths(columnWidthsassesseass122vF9);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF9[i][j] = new PdfPCell(new Paragraph("(9)",aa2vF1));
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF9[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF9[i][j] = new PdfPCell(new Paragraph("Signature is mandatory for all the assessee or his/her authorized representative. For individual, signature is also mandatory in IT-10B & IT-10BB)",tat)); 
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF9[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF9.addCell(pdfPCelltaxcountass12vF9[i][j]);
                            }
                        }
                       // document.add(pdfPTabletaxcountass2vF9);
                         //10
                          PdfPTable pdfPTabletaxcountass2vF10 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF10 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF10 = new float[]{3f,30f};
                         
                           Font aa2vF10 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF10.setWidths(columnWidthsassesseass122vF10);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF10[i][j] = new PdfPCell(new Paragraph("(10)",aa2vF1));
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF10[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF10[i][j] = new PdfPCell(new Paragraph("If needed Please Use Seperate sheet",tat)); 
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF10[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF10.addCell(pdfPCelltaxcountass12vF10[i][j]);
                            }
                        }
                         PdfPTable lasbody = new PdfPTable(1);
                        PdfPCell[][] lasbodyc = new PdfPCell[14][1];
                         
                   
                        for (int i = 0; i < 14; i++) {
                            for (int j = 0; j < 1; j++) {
                               if(i==0)
                                {
                                    lasbodyc[i][j] = new PdfPCell(new Paragraph("Instruction",tat2)); 
                                  //lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                   //lasbodyc[i][j].disableBorderSide(4);
                                  //lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==1)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF1); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                   //lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==2)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF2); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                   //lasbodyc[i][j].disableBorderSide(4);
                                  //lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==3)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF2s); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                   //lasbodyc[i][j].disableBorderSide(4);
                                  //lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==4)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF3); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                   //lasbodyc[i][j].disableBorderSide(4);
                                  //lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==5)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF3s); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                  // lasbodyc[i][j].disableBorderSide(4);
                                  //lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==6)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF4); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                  // lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==7)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF5); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                  // lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==8)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF6); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                 //  lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==9)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF7); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                 //  lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==10)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF7s); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                 //  lasbodyc[i][j].disableBorderSide(4);
                                 /// lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==11)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF8); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                 //  lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==12)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF9); 
                                  lasbodyc[i][j].disableBorderSide(1);
                               lasbodyc[i][j].disableBorderSide(2);
                                //   lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                               if(i==13)
                                {
                                    lasbodyc[i][j] = new PdfPCell(pdfPTabletaxcountass2vF10); 
                                  lasbodyc[i][j].disableBorderSide(1);
                              // lasbodyc[i][j].disableBorderSide(2);
                                  // lasbodyc[i][j].disableBorderSide(4);
                                 // lasbodyc[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <14; i++) {
                            for (int j = 0; j <1; j++) {
                               lasbody.addCell(lasbodyc[i][j]);
                            }
                        }
                        
                        lasbody.setWidthPercentage(95);
                   return lasbody;          
    }
    public PdfPTable registration(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException, DocumentException
    {
         String namee = "", amountt = "";
         //registration part
                    registrationreturn = conn.RegistrationReturn(text);
                    JSONObject jsonObject;
                    jsonObject = new JSONObject(registrationreturn[11]);
                    String ggh = jsonObject.getString("whname");
                    jsonObject = new JSONObject(ggh);
                    namee = jsonObject.getString("name");
                    amountt = jsonObject.getString("TIN");

                    String[][] dataRegistration = {
                        {"Name", "Detail"},
                        {"Type", registrationreturn[0]},
                        {"Name", registrationreturn[1]},
                        {"NID", registrationreturn[2]},
                        {"UTIN", registrationreturn[3]},
                        {"TIN", registrationreturn[4]},
                        {"Circle", registrationreturn[5]},
                        {"Taxes Zone", registrationreturn[6]},
                        {"Assessment year", registrationreturn[7]},
                        {"Residential status", registrationreturn[8]},
                        {"Status", registrationreturn[9]},
                        {"Name of the employer/business(where applicable)", registrationreturn[10]},
                        {"Wife/Husband's name(If assessee,please mention TIN),", "Name   :" + namee},
                        {" ", "TIN       :" + amountt},
                        {"Father name", registrationreturn[12]},
                        {"Mother name", registrationreturn[13]},
                        {"Date of Birth", registrationreturn[14]},
                        {"Present Address", registrationreturn[15]},
                        {"Permanent Address", registrationreturn[16]},
                        {"Office/Business Telephone Number", registrationreturn[17]},
                        {"Residential Telephone Number", registrationreturn[18]},
                        {"Vat registration number,if any", registrationreturn[19]},
                        {"Photo", registrationreturn[20]}
                    };
                     //1
                        PdfPTable body1 = new PdfPTable(4);
                    PdfPCell[][] bodyl1 = new PdfPCell[4][4];
                     float[] columnWidths1 = new float[]{3f, 15f,30f,2f};
                    body1.setWidths(columnWidths1);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   bodyl1[i][j] = new PdfPCell(new Paragraph("  1")); 
                                   bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                   bodyl1[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   bodyl1[i][j] = new PdfPCell(new Paragraph("Name of the Assessee:")); 
                                    bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     bodyl1[i][j]= new PdfPCell(new Paragraph(registrationreturn[1], bradley));
                                      bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                    bodyl1[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   bodyl1[i][j] = new PdfPCell(new Paragraph(" "));
                                    bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==2)
                                {
                                  // body1.addCell(bodyl1[i][j]).setBackgroundColor(BaseColor.GRAY);
                                    body1.addCell(bodyl1[i][j]);
                                }
                                else
                                {
                                  body1.addCell(bodyl1[i][j]);   
                                }
                              
                            }
                        }
                        
                        //body2
                        PdfPTable body2 = new PdfPTable(4);
                    PdfPCell[][] body21 = new PdfPCell[4][4];
                     float[] columnWidths2 = new float[]{3f, 15f,30f,2f};//3f, 15f,30f,2f
                    body2.setWidths(columnWidths2);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body21[i][j] = new PdfPCell(new Paragraph("  2")); 
                                   body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body21[i][j] = new PdfPCell(new Paragraph("National ID No(if any):")); 
                                    body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body21[i][j]= new PdfPCell(new Paragraph(registrationreturn[2]));
                                      body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                    body21[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body21[i][j] = new PdfPCell(new Paragraph(" "));
                                    body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body2.addCell(body21[i][j]);
                            }
                        }
                        
                         //body 3 er subtable
                         PdfPTable body3sub = new PdfPTable(12);
                    PdfPCell[][] body31sub = new PdfPCell[12][12];
                     float[] columnWidths3sub = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body3sub.setWidths(columnWidths3sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body31sub[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[3].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body3sub.addCell(body31sub[i][j]);
                            }
                        }
                        
                         //body3
                        PdfPTable body3 = new PdfPTable(4);
                    PdfPCell[][] body31 = new PdfPCell[4][4];
                     float[] columnWidths3 = new float[]{3f, 15f,25f,15f};
                    body3.setWidths(columnWidths3);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body31[i][j] = new PdfPCell(new Paragraph("  3")); 
                                   body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body31[i][j] = new PdfPCell(new Paragraph("UTIN(if any):")); 
                                    body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body31[i][j]= new PdfPCell(body3sub);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body31[i][j] = new PdfPCell(new Paragraph(" "));
                                    body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body3.addCell(body31[i][j]);
                            }
                        }
                       
                        
                         //body 3 er subtable
                         PdfPTable body4sub = new PdfPTable(12);
                    PdfPCell[][] body41sub = new PdfPCell[12][12];
                     float[] columnWidths4sub = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body4sub.setWidths(columnWidths4sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body41sub[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[4].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body4sub.addCell(body41sub[i][j]);
                            }
                        }
                        
                         //body4
                        PdfPTable body4 = new PdfPTable(4);
                    PdfPCell[][] body41 = new PdfPCell[4][4];
                     float[] columnWidths4 = new float[]{3f, 15f,25f,15f};
                    body4.setWidths(columnWidths4);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41[i][j] = new PdfPCell(new Paragraph("  4")); 
                                   body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41[i][j] = new PdfPCell(new Paragraph("TIN:")); 
                                    body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body41[i][j]= new PdfPCell(body4sub);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41[i][j] = new PdfPCell(new Paragraph(" "));
                                    body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4.addCell(body41[i][j]);
                            }
                        }
                       //5
                       
                        PdfPTable body5 = new PdfPTable(6);
                    PdfPCell[][] body51 = new PdfPCell[5][6];
                     float[] columnWidths5 = new float[]{3f, 5f,10f,7f,10f,2f};
                    body5.setWidths(columnWidths5);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph("  5")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph("(a) Circle:")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body51[i][j] = new PdfPCell(new Paragraph(""+registrationreturn[5]+"(Salary)", bradley)); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                    body51[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body51[i][j] = new PdfPCell(new Paragraph("(b) Taxes Zone:")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                 if(j==4)
                                {
                                   
                                   body51[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[6]+"", bradley)); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                   body51[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                if(j==5)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                 
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body5.addCell(body51[i][j]);
                            }
                        }
                        
                        //6
                       
                        PdfPTable body6 = new PdfPTable(7);
                    PdfPCell[][] body61 = new PdfPCell[7][7];
                     float[] columnWidths6 = new float[]{10f, 4f,12f,1f,6f,1f,3f};
                    body6.setWidths(columnWidths6);
                  int nesty=Integer.parseInt(registrationreturn[7].substring(2, 4))+1;
                  String xf=registrationreturn[7].substring(0, 4).concat("-").concat(Integer.toString(nesty));
                  System.out.print(xf);
                   System.out.print(registrationreturn[7].length());
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body61[i][j] = new PdfPCell(new Paragraph("  6    Assessment Year:")); 
                                   body61[i][j].disableBorderSide(1);
                                   body61[i][j].disableBorderSide(2);
                                   body61[i][j].disableBorderSide(4);
                                   body61[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body61[i][j] = new PdfPCell(new Paragraph(xf)); 
                                   body61[i][j].disableBorderSide(1);
                                   body61[i][j].disableBorderSide(2);
                                   body61[i][j].disableBorderSide(4);
                                   body61[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body61[i][j] = new PdfPCell(new Paragraph("7   Residential Status: Resident")); 
                                   body61[i][j].disableBorderSide(1);
                                   body61[i][j].disableBorderSide(2);
                                   body61[i][j].disableBorderSide(4);
                                   body61[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                               
                                 if(j==3)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body61[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                               
                                  if(j==4)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body61[i][j] = new PdfPCell(new Paragraph("/Non-resident")); 
                                   body61[i][j].disableBorderSide(1);
                                   body61[i][j].disableBorderSide(2);
                                   body61[i][j].disableBorderSide(4);
                                   body61[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                                 if(j==5)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body61[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                  if(j==6)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body61[i][j] = new PdfPCell(new Paragraph(" "));
                                     body61[i][j].disableBorderSide(1);
                                   body61[i][j].disableBorderSide(2);
                                   body61[i][j].disableBorderSide(4);
                                   body61[i][j].disableBorderSide(8);
                                  
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                               body6.addCell(body61[i][j]);
                            }
                        }
                        
                        
                        //7
                       
                        PdfPTable body7 = new PdfPTable(9);
                    PdfPCell[][] body71 = new PdfPCell[8][9];
                     float[] columnWidths7 = new float[]{11f, 1f,3f,1f,12f,1f,12f,1f,5f};
                    body7.setWidths(columnWidths7);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body71[i][j] = new PdfPCell(new Paragraph("  7    Status:Individual")); 
                                   body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                                                   
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Firm")); 
                                   body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                               
                                 if(j==3)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                               
                                  if(j==4)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Association of Persions")); 
                                  body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                                 if(j==5)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                  if(j==6)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Hindu Undivided Family")); 
                                  body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                }
                                if(j==7)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                if(j==8)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                      body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                               body7.addCell(body71[i][j]);
                            }
                        }
                        
                         //8
                       
                        PdfPTable body8 = new PdfPTable(3);
                    PdfPCell[][] body81 = new PdfPCell[2][3];
                     float[] columnWidths8 = new float[]{28f, 20f,2f};
                    body8.setWidths(columnWidths8);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph("  8    Name of the employer/business(where applicable):")); 
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph(" "+ registrationreturn[10]+"", bradley)); 
                                   ar=registrationreturn[10].length();
                                   br=20* 2;
                                   crk=ar/br;
                                  regu[0]=Math.ceil(crk)-1;
                                  System.out.println(regu[0]);
                                  //reg[0]=crk;
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                    body81[i][j].setCellEvent(simpleBottomLine);

                                }
                               if(j==2)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                }
 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body8.addCell(body81[i][j]);
                            }
                        }
                        
                          //9
                       
                        PdfPTable body9 = new PdfPTable(3);
                    PdfPCell[][] body91 = new PdfPCell[2][3];
                     float[] columnWidths9 = new float[]{34f, 18f,2f};
                    body9.setWidths(columnWidths9);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body91[i][j] = new PdfPCell(new Paragraph("  9   Wife/Husband's Name(if assessee,Please Mention TIN):")); 
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                    if(amountt.matches("0"))
                                    {
                                     body91[i][j] = new PdfPCell(new Paragraph(circle.stringlengthcheck(namee,60) , bradley));    
                                    }
                                    else
                                    {
                                  // body91[i][j] = new PdfPCell(new Paragraph(""+namee+"-"+amountt+"", bradley)); 
                                    body91[i][j] = new PdfPCell(new Paragraph(circle.stringlengthcheck(""+namee+"-"+amountt+"",60), bradley)); 
                                    }
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                    body91[i][j].setCellEvent(simpleBottomLine);
                                     

                                }
                                if(j==2)
                                {
                                   body91[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body9.addCell(body91[i][j]);
                            }
                        }
                        
                        //10
                       
                        PdfPTable body10 = new PdfPTable(3);
                    PdfPCell[][] body101 = new PdfPCell[2][3];
                     float[] columnWidths10 = new float[]{10f, 28f,2f};
                    body10.setWidths(columnWidths10);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph("  10   Father's Name:")); 
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[12]+"", bradley)); 
                                  
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                    body101[i][j].setCellEvent(simpleBottomLine);
                                    

                                }
                               if(j==2)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body10.addCell(body101[i][j]);
                            }
                        }
                        
                         //11
                       
                        PdfPTable body11 = new PdfPTable(3);
                    PdfPCell[][] body111 = new PdfPCell[2][3];
                     float[] columnWidths11 = new float[]{10f, 28f,2f};
                    body11.setWidths(columnWidths11);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph("  11   Mother's Name:")); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[13]+"", bradley)); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                    body111[i][j].setCellEvent(simpleBottomLine);
                                    

                                }
                               if(j==2)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body11.addCell(body111[i][j]);
                            }
                        }
                        
                        
                          //12
                       
                        PdfPTable body12 = new PdfPTable(10);
                    PdfPCell[][] body121 = new PdfPCell[9][10];
                     float[] columnWidths12 = new float[]{12f, 2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body12.setWidths(columnWidths12);
                    String[] db=new String[10];
                    int dd=-1;
                    for(int j=0;j<10;j++)
                    {
                    if(j==0||j==1||j==3||j==4||j==6||j==7||j==8||j==9)
                     {
                         dd++;
                       db[dd]=registrationreturn[14].substring(j,(j+1));  
                     }    
                    }
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 10; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body121[i][j] = new PdfPCell(new Paragraph("  13   Date of Birth(in case of individual):")); 
                                   body121[i][j].disableBorderSide(1);
                                   body121[i][j].disableBorderSide(2);
                                   body121[i][j].disableBorderSide(4);
                                   body121[i][j].disableBorderSide(8);
                                }
                                 else if(j==9)
                                 {
                                   body121[i][j] = new PdfPCell(new Paragraph("  ")); 
                                   body121[i][j].disableBorderSide(1);
                                   body121[i][j].disableBorderSide(2);
                                   body121[i][j].disableBorderSide(4);
                                   body121[i][j].disableBorderSide(8); 
                                 }
                                else
                                {
                                 
                                       body121[i][j] = new PdfPCell(new Paragraph(""+db[j-1]+" "));   
                                   
                                 
                                }
                                
                            }

                        }
                         for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 10; j++) {
                                if(j!=0 || j!=9)
                                {
                                   body12.addCell(body121[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);  
                                }
                                else
                                {
                                   body12.addCell(body121[i][j]);  
                                }
                              
                            }
                        }
                        
                        
                          //12sub
                       
                        PdfPTable body12sub = new PdfPTable(2);
                    PdfPCell[][] body12sub1 = new PdfPCell[2][2];
                     float[] columnWidths12sub = new float[]{16f, 20f};
                    body12sub.setWidths(columnWidths12sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body12sub1[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body12sub1[i][j].disableBorderSide(1);
                                   body12sub1[i][j].disableBorderSide(2);
                                   body12sub1[i][j].disableBorderSide(4);
                                   body12sub1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                   body12sub1[i][j] = new PdfPCell(new Paragraph("Day                 Month                     Year ")); 
                                   body12sub1[i][j].disableBorderSide(1);
                                   body12sub1[i][j].disableBorderSide(2);
                                   body12sub1[i][j].disableBorderSide(4);
                                   body12sub1[i][j].disableBorderSide(8);
                                 
                                }
                                
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                               body12sub.addCell(body12sub1[i][j]);
                            }
                        }
                        
                        
                         //13
                       
                        PdfPTable body13 = new PdfPTable(3);
                    PdfPCell[][] body131 = new PdfPCell[2][3];
                     float[] columnWidths13 = new float[]{14f, 30f,2f};//14f, 30f,2f
                    body13.setWidths(columnWidths13);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph("  14   Address   (a)Present:")); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[15]+"", bradley)); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                    body131[i][j].setCellEvent(simpleBottomLine);
                                     ar=registrationreturn[15].length();
                                   br=28* 2;
                                   crk=ar/br;
                                  regu[2]=Math.ceil(crk)-1;
                                  if(regu[2]==1)
                                  {
                                     regu[2]=0; 
                                  }
                                  System.out.println(regu[2]);

                                }
                                if(j==2)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                }
                                
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body13.addCell(body131[i][j]);
                            }
                        }
                         //14
                       
                        PdfPTable body14 = new PdfPTable(3);
                    PdfPCell[][] body141 = new PdfPCell[2][3];
                     float[] columnWidths14 = new float[]{14f, 30f,2f};
                    body14.setWidths(columnWidths14);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph("                        (b)Permanent:")); 
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[16]+"", bradley));
                                  
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                   // body141[i][j].setCellEvent(simpleBottomLine);
                                     ar=registrationreturn[16].length();
                                   br=28* 2;
                                   crk=ar/br;
                                  regu[3]=Math.ceil(crk)-1;
                                  if(regu[3]==1)
                                  {
                                     regu[3]=0; 
                                  }
                                  System.out.println(regu[3]);

                                }
                                if(j==2)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j <3; j++) {
                               body14.addCell(body141[i][j]);
                            }
                        }
                        
                        //15
                       
                        PdfPTable body15 = new PdfPTable(6);
                    PdfPCell[][] body151 = new PdfPCell[5][6];
                     float[] columnWidths15 = new float[]{3f, 15f,12f,7f,15f,2f};
                    body15.setWidths(columnWidths15);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body151[i][j] = new PdfPCell(new Paragraph("  15   ")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body151[i][j] = new PdfPCell(new Paragraph("Telephone:Office/Business:")); 
                                    body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body151[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[17]+"")); 
                                    body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                    body151[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph("Residential:")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                 if(j==4)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[18]+"")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                   body151[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               if(j==5)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                            }
                            
                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body15.addCell(body151[i][j]);
                            }
                        }
                        
                        // 16
                       
                        PdfPTable body16 = new PdfPTable(3);
                    PdfPCell[][] body161 = new PdfPCell[2][3];
                     float[] columnWidths16 = new float[]{18f, 18f,2f};
                    body16.setWidths(columnWidths16);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body161[i][j] = new PdfPCell(new Paragraph("  16    VAT Registration Number(if any):")); 
                                   body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    if(registrationreturn[18].matches("0"))
                                    {
                                      body161[i][j] = new PdfPCell(new Paragraph(" "));  
                                    }
                                    else
                                    {
                                    body161[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[18]+" "));    
                                    }
                                    
                                    body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                   body161[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==2)
                                {
                                   body161[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                         for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body16.addCell(body161[i][j]);
                            }
                        }
                          PdfPTable body1r = new PdfPTable(1);
                    PdfPCell[][] bodyl1r = new PdfPCell[25][1];
                     
                  
                        for (int i = 0; i < 24; i++) {
                            for (int j = 0; j <1; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(i==0)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body1); 
                                   //bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                  // bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                 if(i==1)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body2); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                 if(i==2)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                    bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                 if(i==3)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body3); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                               
                                  if(i==4)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                  if(i==5)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body4); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);                                   
                                }
                                   if(i==6)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                               
                                    if(i==7)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body5); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                }
                                  if(i==8)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                }
                                  if(i==9)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body6); 
                                 bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                   if(i==10)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                  if(i==11)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body7); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                    if(i==12)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body8); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                      if(i==13)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body9); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                  if(i==14)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body10); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);                                   
                                }
                                   if(i==15)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body11); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);                                   
                                }
                                    if(i==16)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                     if(i==17)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body12); 
                                  bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                if(i==18)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body12sub); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                if(i==19)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body13); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }

                                if(i==20)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body14); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                 if(i==21)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body15); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                  if(i==22)
                                {
                                   bodyl1r[i][j] = new PdfPCell(body16); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                   bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                   //bodyl1r[i][j].disableBorderSide(8);
                                   
                                }
                                   if(i==23)
                                {
                                   bodyl1r[i][j] = new PdfPCell(new Paragraph("    ")); 
                                 
                                   
                                   // bodyl1r[i][j] = new PdfPCell(body16); 
                                   bodyl1r[i][j].disableBorderSide(1);
                                 // bodyl1r[i][j].disableBorderSide(2);
                                  // bodyl1r[i][j].disableBorderSide(4);
                                  // bodyl1r[i][j].disableBorderSide(8);
                                   
                                }

                            }

                        }
                        for (int i = 0; i <24; i++) {
                            for (int j = 0; j < 1; j++) {
                               body1r.addCell(bodyl1r[i][j]);
                            }
                        }
                        body1r.setWidthPercentage(95);
                     return  body1r;     

    }
    public PdfPTable incomeheader1() throws DocumentException
    {
       //header 1
                         PdfPTable pdfPTabletaxcountass = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass1 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass12 = new float[]{10f,25f};
                           Font aa = new Font(Font.FontFamily.HELVETICA, 13,Font.UNDERLINE  );
                    pdfPTabletaxcountass.setWidths(columnWidthsassesseass12);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass1[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass1[i][j] = new PdfPCell(new Paragraph("Statement of income of the Assessee",aa)); 
                                    pdfPCelltaxcountass1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass.addCell(pdfPCelltaxcountass1[i][j]);
                            }
                        } 
                        return pdfPTabletaxcountass;
    }
    public PdfPTable incomeheader2(long text,int ayear) throws DocumentException
    {
        //header 2
                         PdfPTable pdfPTabletaxcountass2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122 = new float[]{20f,25f};
                           Font aa2 = new Font(Font.FontFamily.HELVETICA, 10 );
                    pdfPTabletaxcountass2.setWidths(columnWidthsassesseass122);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12[i][j] = new PdfPCell(new Paragraph("State of Income during year ended on :",aa2));
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12[i][j] = new PdfPCell(new Paragraph("              30 June  " + registrationreturn[7] + "", bradley)); 
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(8);
                                     pdfPCelltaxcountass12[i][j].setCellEvent(simpleBottomLine);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2.addCell(pdfPCelltaxcountass12[i][j]);
                            }
                        } 
                        pdfPTabletaxcountass2.setWidthPercentage(95);
                        return pdfPTabletaxcountass2;
    }
    public PdfPTable incomefunction(long text,int ayear) throws DocumentException, ClassNotFoundException, SQLException, JSONException
    {
         //tax count
                    taxcount = conn.TaxCount(text,ayear);

                    String[][] datataxcount = {
                        {"Heads of Income", "Amount in Taka"},
                        {"Salaries :u/s 21 (as per shedule 1)", taxcount[1]},
                        {"Interest on Securities:u/s", taxcount[2]},
                        {"Income from house property:u/s 24(as per shedule 2)", taxcount[3]},
                        {"Agricultural income:u/s 26", taxcount[4]},
                        {"Income from business or profession:u/s 28", taxcount[5]},
                        {"Share of profit in a firm", taxcount[6]},
                        {"Income of the spouse or minor child as applicable:u/s 43(4)", taxcount[7]},
                        {"Capital Gains:u/s 31", taxcount[8]},
                        {"Income from other source:u/s 33", taxcount[9]},
                        {"Total 1 & 9", taxcount[10]},
                        {"Foreign Income", taxcount[11]},
                        {"Total income 10 &11", taxcount[12]},
                        {"Tax leviable on total income", taxcount[13]},
                        {"Tax rebate(u/s 44(2)(b)(as per schedule-3))", taxcount[14]},
                        {"Tax payable(difference 13 & 14)", taxcount[15]},
                        {"Tax Payments", taxcount[16]},
                        {"Difference 15 & 16", taxcount[17]},
                        {"Tax exempted & Tax free income", taxcount[18]},
                        {"Income tax paid in the last assessment year", taxcount[19]},};
                    //taxpayment part
                    int[] taxpaymentamount = new int[5];
                    int paymentsum = 0;
                    JSONObject jsontaxpa = new JSONObject(taxcount[16]);
                    JSONObject jsontaxpay = (JSONObject) jsontaxpa.get("TaxPayment");

                    taxpaymentamount[0] = Integer.parseInt(jsontaxpay.getString("TaxReducted"));
                    taxpaymentamount[1] = Integer.parseInt(jsontaxpay.getString("AdvanceTax"));
                    taxpaymentamount[2] = Integer.parseInt(jsontaxpay.getString("TaxPaidReturn"));
                    taxpaymentamount[3] = Integer.parseInt(jsontaxpay.getString("TaxRefund"));
                    for (int i = 0; i < 4; i++) {
                        paymentsum = paymentsum + taxpaymentamount[i];
                    }
                    String[][] datataxcount16 = {
                        {"16     ", "Tax Payment:", " ",""},
                        {"      ","(a)Tax deducted/collected at source(Please submit supporting document/statement)", "Tk,",jsontaxpay.getString("TaxReducted")+"/="},
                        {"      ","(b)Advance Tax u/s 64/68(Please attach challan)","Tk,", jsontaxpay.getString("AdvanceTax")+"/="},
                        {"      ","(c)Tax Paid on the basis of this return(u/s 74)(Please attach challan/pay order/bank draft/cheque)","Tk,", jsontaxpay.getString("TaxPaidReturn")+"/="},
                        {"      ","(d)Adjustment of Tax Refund (if any)","Tk,", jsontaxpay.getString("TaxRefund")+"/="},
                        {"      ","                                                           Total of (a)",",(b)", "(c)and (d)" },};
         PdfPTable pdfPTabletaxcount16 = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxcount16 = new PdfPCell[datataxcount16.length][4];
                         float[] columnWidthsassessee = new float[]{3f,22f,3f,6f};
                    pdfPTabletaxcount16.setWidths(columnWidthsassessee);
                    Font tax = new Font(Font.FontFamily.HELVETICA, 11  );
                        for (int i = 0; i < datataxcount16.length; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0 && j==0)
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph("16     ")); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                
                                 else if(i==0 && j==2 )
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j])); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                 else if(i==0 &&  j==3)
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j])); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                else if(i!=5 && j==2)
                                {
                                 pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j]));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                else if(i!=5 && j==3)
                                {
                                 pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j],tax));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                    pdfPCelltaxcount16[i][j].setCellEvent(simpleBottomLine);
                                }
                                else
                                {
                                    
                                  pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j],tax));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);   
                                }
                                 
                            }

                        }
                        for (int i = 0; i < datataxcount16.length; i++) {
                            for (int j = 0; j <4; j++) {
                                if(i!=0 &&i!=5 && j==3)
                                {
                                   pdfPTabletaxcount16.addCell(pdfPCelltaxcount16[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                else
                                {
                                 pdfPTabletaxcount16.addCell(pdfPCelltaxcount16[i][j]);   
                                }
                                
                            }
                        }
                         PdfPTable pdfPTabletaxcount16p = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcount16p1 = new PdfPCell[10][2];
                         float[] columnWidthsassesseep1 = new float[]{2f,6f};
                    pdfPTabletaxcount16p.setWidths(columnWidthsassesseep1);
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 2; j++) {
                               
                                if(i==6 && j==1)
                                {
                                 pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph(Integer.toString(paymentsum)+"/=",tax));
                                 pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);  
                                    pdfPCelltaxcount16p1[i][j].setCellEvent(simpleBottomLine);
                                }
                               else if(i==6 && j==0)
                                {
                                 pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph("Tk",tax));
                                 pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);  
                                }
                                else
                                {
                                  pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);   
                                }
                                 
                            }

                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j <2; j++) {
                                 if(i==6 && j==1)
                                 {
                                    pdfPTabletaxcount16p.addCell(pdfPCelltaxcount16p1[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                 }
                                 else
                                 {
                                   pdfPTabletaxcount16p.addCell(pdfPCelltaxcount16p1[i][j]);   
                                 }
                               
                            }
                        }
                        
                        PdfPTable pdfPTabletaxcount = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcount = new PdfPCell[23][23];
                         float[] columnWidthsassesse = new float[]{35f,10f};
                    pdfPTabletaxcount.setWidths(columnWidthsassesse);
                        for (int i = 0; i < datataxcount.length; i++) {
                            for (int j = 0; j < datataxcount[i].length; j++) {
                                if(i==0 && (j==0||j==1))
                                {
                                  pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j],CUSTOM_FONT));  
                                }
                                //paymentsum
                                else if (i == 16 && j == 0) {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(pdfPTabletaxcount16);
                                }
                                else if (i == 16 && j == 1) {
                                    pdfPCelltaxcount[i][j] = new PdfPCell((pdfPTabletaxcount16p));
                                    
                                }
                                else if(i!=16 && j==1)
                                {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j]+"/=",tax));
                                }
                                else
                                {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j],tax)); 
                                }
                            }

                        }
                        for (int i = 0; i < datataxcount.length; i++) {
                            for (int j = 0; j < datataxcount[i].length; j++) {
                                if(i!=16 && j==1)
                                {
                                  pdfPTabletaxcount.addCell(pdfPCelltaxcount[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                }
                                
                                else
                                {
                                 pdfPTabletaxcount.addCell(pdfPCelltaxcount[i][j]);   
                                }
                                
                            }
                        }
                        pdfPTabletaxcount.setWidthPercentage(95);
                        return (pdfPTabletaxcount); 
    }
    public PdfPTable verification() throws DocumentException
    {
        //verify 2
                         PdfPTable pdfPTabletaxcountass2v = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12v = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122v = new float[]{20f,25f};
                         
                           Font aa2v = new Font(Font.FontFamily.HELVETICA,12f, Font.UNDERLINE );
                    pdfPTabletaxcountass2v.setWidths(columnWidthsassesseass122v);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12v[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12v[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12v[i][j] = new PdfPCell(new Paragraph("Verification",aa2v)); 
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12v[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2v.addCell(pdfPCelltaxcountass12v[i][j]);
                            }
                        }
                        return(pdfPTabletaxcountass2v);
    }
    public PdfPTable incomefooter1() throws DocumentException
    {
        //i am
                         PdfPTable pdfPTabletaxcountass2am = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxcountass12am = new PdfPCell[1][4];
                         float[] columnWidthsassesseass122am = new float[]{3f,15f,8f,17f};
                           Font aa2am = new Font(Font.FontFamily.HELVETICA, 15,Font.UNDERLINE );
                    pdfPTabletaxcountass2am.setWidths(columnWidthsassesseass122am);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph(" I"));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "", bradley));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12am[i][j].setCellEvent(simpleBottomLine);
                                }
                                 else if( j==2)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("Father/Husband:"));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[12] + "", bradley)); 
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12am[i][j].setCellEvent(simpleBottomLine);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 4; j++) {
                               pdfPTabletaxcountass2am.addCell(pdfPCelltaxcountass12am[i][j]);
                            }
                        }
                        pdfPTabletaxcountass2am.setWidthPercentage(95);
                        return(pdfPTabletaxcountass2am);
    }
public PdfPTable incomefooter2() throws DocumentException
{
    //i am
                         PdfPTable pdfPTabletaxcountass2amu = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12amu = new PdfPCell[1][3];
                         float[] columnWidthsassesseass122amu = new float[]{7f,10f,32f};
                           Font aa2amu = new Font(Font.FontFamily.HELVETICA, 11 );
                    pdfPTabletaxcountass2amu.setWidths(columnWidthsassesseass122amu);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("UTIN/TIN:"));
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("" + text + ""));
                                  pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12amu[i][j].setCellEvent(simpleBottomLine);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("solemnly declare that to the best of my knowledge and",aa2amu )); 
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2amu.addCell(pdfPCelltaxcountass12amu[i][j]);
                            }
                        }
                        return(pdfPTabletaxcountass2amu);
}
public PdfPTable incomefooter(long text,int ayear) throws DocumentException
{
     //left
                        
                         PdfPTable pdfPTabletaxcountass2au1 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12au1 = new PdfPCell[5][2];
                         float[] columnWidthsassesseass122au1 = new float[]{5f,25f};
                           Font aa2au1 = new Font(Font.FontFamily.HELVETICA, 11 );
                    pdfPTabletaxcountass2au1.setWidths(columnWidthsassesseass122au1);
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("Place:"));
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                }
                                else if(i==0&& j==1) 
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph(""+registrationreturn[15]+" ", bradley));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12au1[i][j].setCellEvent(simpleBottomLine);
                                    ar=registrationreturn[15].length();
                                    br=25*1.76;
                                    crk=ar/br;
                                    incom[0]=Math.ceil(crk)-1;
                                    System.out.println(incom[0]);
                                    
                                }
                                else if(i==1&& j==0) 
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("Date:"));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                }
                                else if(i==1&& j==1)
                                {
                                   pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("" + cyear.getDayOfMonth() + "/" + cyear.getMonthValue() + "/" + cyear.getYear() + ""));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8); 
                                    pdfPCelltaxcountass12au1[i][j].setCellEvent(simpleBottomLine);
                                }
                                else
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);   
                                }
                            }

                        }
                        for (int i = 0; i <5; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2au1.addCell(pdfPCelltaxcountass12au1[i][j]);
                            }
                        }
                        //rifgt
                        
                         PdfPTable pdfPTabletaxcountass2au2 = new PdfPTable(1);
                        PdfPCell[][] pdfPCelltaxcountass12au2 = new PdfPCell[5][1];
                         float[] columnWidthsassesseass122au2 = new float[]{25f};
                           Font aa2au2 = new Font(Font.FontFamily.TIMES_ROMAN, 12 );
                    pdfPTabletaxcountass2au2.setWidths(columnWidthsassesseass122au2);
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 1; j++) {
                                if(i==0)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("          Signature"));
                                   // pdfPCelltaxcountass12au[i][j] = new PdfPCell( pdfPTabletaxcountass2au1);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                else if( i==1)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("   ( " + registrationreturn[1] + ") ", bradley));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                
                                else if( i==2)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("      (Name in Block Letters) "));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                else if( i==3)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("             Designation and  "));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("      Seal (For other Than Indivisual)",aa2amu )); 
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <5; i++) {
                            for (int j = 0; j < 1; j++) {
                               pdfPTabletaxcountass2au2.addCell(pdfPCelltaxcountass12au2[i][j]);
                            }
                        }
                        //root
                         PdfPTable pdfPTabletaxcountass2au = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12au = new PdfPCell[1][3];
                         float[] columnWidthsassesseass122au = new float[]{30f,2f,25f};
                           
                    pdfPTabletaxcountass2au.setWidths(columnWidthsassesseass122au);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12au[i][j] = new PdfPCell(pdfPTabletaxcountass2au1);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12au[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12au[i][j] = new PdfPCell(pdfPTabletaxcountass2au2); 
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2au.addCell(pdfPCelltaxcountass12au[i][j]);
                            }
                        }
                       // document.add(new Paragraph("          "));
                       // document.add(new Paragraph("          "));
                        
                       pdfPTabletaxcountass2au.setWidthPercentage(95);
                        return(pdfPTabletaxcountass2au);
}
public PdfPTable salaryheadern() throws DocumentException
{
  //body 3 er subtable
                         PdfPTable body4subs = new PdfPTable(12);
                    PdfPCell[][] body41subs = new PdfPCell[12][12];
                     float[] columnWidths4subs = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body4subs.setWidths(columnWidths4subs);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body41subs[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[4].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body4subs.addCell(body41subs[i][j]);
                            }
                        }
                        
                         //body salary
                        PdfPTable body4s = new PdfPTable(4);
                    PdfPCell[][] body41s = new PdfPCell[4][4];
                     float[] columnWidths4s = new float[]{12f, 20f,2f,24f};
                     Font aa2au = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4s.setWidths(columnWidths4s);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41s[i][j] = new PdfPCell(new Paragraph("Name of The Assessee:",aa2au)); 
                                   body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41s[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley1)); 
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                    body41s[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41s[i][j] = new PdfPCell(new Paragraph("TIN:",aa2au)); 
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41s[i][j]= new PdfPCell(body4subs);
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4s.addCell(body41s[i][j]);
                            }
                        }
                        body4s.setWidthPercentage(95);
                         return( body4s);   
}
public PdfPTable salaryheader2() throws DocumentException
{
     //shedules
                         PdfPTable pdfPTabletaxcountass2vs = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vs = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vs = new float[]{20f,25f};
                        
                    pdfPTabletaxcountass2vs.setWidths(columnWidthsassesseass122vs);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vs[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vs[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vs[i][j] = new PdfPCell(new Paragraph("Shedules-1(Salaries)",aa2v)); 
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vs[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vs.addCell(pdfPCelltaxcountass12vs[i][j]);
                            }
                        }
                        return(pdfPTabletaxcountass2vs);
}
public PdfPTable salary(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException, DocumentException
{
   //Salary Part
                    salary1 = conn.SALARYRETURN(text,ayear);

                    int sumsalary1 = 0, sumsalary2 = 0;
                    int[] firstsalary = new int[salary1.length];
                    int[] secondsalary = new int[salary1.length];
                    for (int i = 1; i < salary1.length; i++) {
                        JSONObject json = new JSONObject(salary1[i]);
                        firstsalary[i] = Integer.parseInt(json.getString("EXIN"));
                        secondsalary[i] = Integer.parseInt(json.getString("NETTAXIN"));
                        sumsalary1 = sumsalary1 + firstsalary[i];
                        sumsalary2 = sumsalary2 + secondsalary[i];
                    }
                    String[][] dataSalary = {
                        {"Pay & Allowance", "Amount of Income          (Tk)", "Amount of      Exempted Income       (Tk)", "Net Taxable Income        (Tk)"},
                        {"Basic pay", Integer.toString(firstsalary[1] + secondsalary[1])+"/=", Integer.toString(firstsalary[1])+"/=", Integer.toString(secondsalary[1])+"/="},
                        {"Special pay", Integer.toString(firstsalary[2] + secondsalary[2])+"/=", Integer.toString(firstsalary[2])+"/=", Integer.toString(secondsalary[2])+"/="},
                        {"Dearness allowance", Integer.toString(firstsalary[3] + secondsalary[3])+"/=", Integer.toString(firstsalary[3])+"/=", Integer.toString(secondsalary[3])+"/="},
                        {"Conveyance allowance", Integer.toString(firstsalary[4] + secondsalary[4])+"/=", Integer.toString(firstsalary[4])+"/=", Integer.toString(secondsalary[4])+"/="},
                        {"House rent allowance", Integer.toString(firstsalary[5] + secondsalary[5])+"/=", Integer.toString(firstsalary[5])+"/=", Integer.toString(secondsalary[5])+"/="},
                        {"Medical allowance", Integer.toString(firstsalary[6] + secondsalary[6])+"/=", Integer.toString(firstsalary[6])+"/=", Integer.toString(secondsalary[6])+"/="},
                        {"Servant allowance", Integer.toString(firstsalary[7] + secondsalary[7])+"/=", Integer.toString(firstsalary[7])+"/=", Integer.toString(secondsalary[7])+"/="},
                        {"leave allowance", Integer.toString(firstsalary[8] + secondsalary[8])+"/=", Integer.toString(firstsalary[8])+"/=", Integer.toString(secondsalary[8])+"/="},
                        {"Honorarium/Reward/fee", Integer.toString(firstsalary[9] + secondsalary[9])+"/=", Integer.toString(firstsalary[9])+"/=", Integer.toString(secondsalary[9])+"/="},
                        {"Education allowance", Integer.toString(firstsalary[10] + secondsalary[10])+"/=", Integer.toString(firstsalary[10])+"/=", Integer.toString(secondsalary[10])+"/="},
                        {"Bonus/Ex-gratia", Integer.toString(firstsalary[11] + secondsalary[11])+"/=", Integer.toString(firstsalary[11])+"/=", Integer.toString(secondsalary[11])+"/="},
                        {"Other allowance", Integer.toString(firstsalary[12] + secondsalary[12])+"/=", Integer.toString(firstsalary[12])+"/=", Integer.toString(secondsalary[12])+"/="},
                        {"Employer's contribution to Recognized Provident fund", Integer.toString(firstsalary[13] + secondsalary[13])+"/=", Integer.toString(firstsalary[13])+"/=", Integer.toString(secondsalary[13])+"/="},
                        {"Interest acctued on recognized provident fund", Integer.toString(firstsalary[14] + secondsalary[14])+"/=", Integer.toString(firstsalary[14])+"/=", Integer.toString(secondsalary[14])+"/="},
                        {"Deemed income for transport facility", Integer.toString(firstsalary[15] + secondsalary[15])+"/=", Integer.toString(firstsalary[15])+"/=", Integer.toString(secondsalary[15])+"/="},
                        {"Deemed income for free furnished/unfurnished accomodation", Integer.toString(firstsalary[16] + secondsalary[16])+"/=", Integer.toString(firstsalary[16])+"/=", Integer.toString(secondsalary[16])+"/="},
                        {"Other,if any(Give details)", Integer.toString(firstsalary[17] + secondsalary[17])+"/=", Integer.toString(firstsalary[17])+"/=", Integer.toString(secondsalary[17])+"/="},
                        {"Net Taxable Income From Salary", Integer.toString(sumsalary1 + sumsalary2)+"/=", Integer.toString(sumsalary1)+"/=", Integer.toString(sumsalary2)+"/="},};
                        PdfPTable pdfPTableSalary = new PdfPTable(4);
                        PdfPCell[][] pdfPCellSalary = new PdfPCell[23][23];
                        float[] columnWidthsassesseass122s = new float[]{20f,8f,8f,8f};
                           Font aa2vs = new Font(Font.FontFamily.HELVETICA, 10 );
                          // Font aa2s = new Font(Font.FontFamily.HELVETICA, 15,Font.UNDERLINE );
                        pdfPTableSalary.setWidths(columnWidthsassesseass122s);
                        for (int i = 0; i < dataSalary.length; i++) {
                            for (int j = 0; j < dataSalary[i].length; j++) {
                                pdfPCellSalary[i][j] = new PdfPCell(new Paragraph(dataSalary[i][j],aa2vs));
                            }

                        }
                        for (int i = 0; i < dataSalary.length; i++) {
                            for (int j = 0; j < dataSalary[i].length; j++) {
                                if( i==0)
                                {
                                   pdfPTableSalary.addCell(pdfPCellSalary[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);    
                                }
                               else if(j>0 && i!=0)
                                {
                                   pdfPTableSalary.addCell(pdfPCellSalary[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                }
                                else
                                {
                                   pdfPTableSalary.addCell(pdfPCellSalary[i][j]);  
                                }
                               
                            }
                        }
                        return(pdfPTableSalary);
                    
}
public PdfPTable houseproperty() throws DocumentException
{
   PdfPTable pdfPTabletaxcountass2vsh = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vsh = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vsh = new float[]{10f,30f};
                    pdfPTabletaxcountass2vsh.setWidths(columnWidthsassesseass122vsh);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vsh[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vsh[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vsh[i][j] = new PdfPCell(new Paragraph("Schedule-2(House Property Income)",aa2v)); 
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vsh[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vsh.addCell(pdfPCelltaxcountass12vsh[i][j]);
                            }
                        }
                         return(pdfPTabletaxcountass2vsh);  
}
public PdfPTable housePropertyinfo(long text,int ayear) throws DocumentException, ClassNotFoundException, SQLException, JSONException
{
    //houseproperty
                         //House property part
                    ic.accessnin(text,ayear);
                    houseproperty = conn.HOUSEPROPERTYRETURN(text,ayear);
                    int sum = 0;
                    for (int i = 0; i < 7; i++) {
                        sum = sum + ic.option[i];
                    }
                    int rentalincome = Integer.parseInt(ic.houseproperty[0]);
                    String[][] dataHouse = {
                        {"Detail", "Income/Spent"},
                        {"Annual Renatal Income", ic.houseproperty[0]},
                        {"Claimed Expense", ""},
                        {"Net Income", Integer.toString(rentalincome - sum)},};
                    String[][] expense = {
                        {"Repair,Collection,etc.", Integer.toString(ic.option[0])},
                        {"Municipal or Local Tax", Integer.toString(ic.option[1])},
                        {"Land Revenue", Integer.toString(ic.option[2])},
                        {"Interest on Loan/Mortgage/Capital charge", Integer.toString(ic.option[3])},
                        {"Insurance Premium", Integer.toString(ic.option[4])},
                        {"Vacancy Allowance", Integer.toString(ic.option[5])},
                        {"Other, if any", Integer.toString(ic.option[6])},
                        {"Total", Integer.toString(sum)},};
                    //tax divate
    
                        PdfPTable pdfPTableHouse = new PdfPTable(4);
                        PdfPCell[][] pdfPCellHouse = new PdfPCell[12][4];
                         float[] columnWidthsassesseass122vshp = new float[]{10f,20f,8f,8f};
                    pdfPTableHouse.setWidths(columnWidthsassesseass122vshp);
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0 && j==0)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Location and description of property",aa2vs)); 
                                } 
                                if(i==0 && j==1)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Particulars",aa2vs)); 
                                } 
                                if(i==0 && j==2)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Tk")); 
                                } 
                                 if(i==0 && j==3)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Tk")); 
                                } 
                                  if(i!=0 &&i<12 && j==0)
                                {
                                    if(i==1)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(2);   
                                    }
                                    if(i<11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(2);
                                     pdfPCellHouse[i][j].disableBorderSide(1);
                                    }
                                     if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(1);   
                                    }
                                   
                                } 
                                   if(i!=0 &&i<12 && j==1)
                                {
                                    if(i==1)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 1  "+dataHouse[1][0]+"",aa2vs));
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==2)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 2 Claimed Expense:",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i>2 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "+expense[i-3][0]+"",aa2vs)); 
                                      //pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("                                     Total=:",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                    if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("3. Net income(different between serial )",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   //pdfPCellHouse[i][j].disableBorderSide(1);
                               // pdfPCellHouse[i][j].disableBorderSide(2);
                                   //pdfPCellHouse[i][j].disableBorderSide(4);
                                 
                                } 
                                   if(i!=0 &&i<12 && j==2)
                                {
                                    if(i==1)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    //pdfPCellHouse[i][j].disableBorderSide(8);
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==2)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(8);
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                   if(i>2 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+expense[i-3][1]+"/=",aa2vs)); 
                                      //pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(4);
                                    }
                                   if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 1 and 2",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(4);
                                    }
                                } 
                                if(i!=0 &&i<12 && j==3)
                                {
                                    if(i==1)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("  "+dataHouse[1][1]+"/=",aa2vs)); 
                                   //pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==2)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("  ")); 
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==3)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(2);
                                    }
                                    if(i>3 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(1);
                                      pdfPCellHouse[i][j].disableBorderSide(2);
                                    }
                                    if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+expense[7][1]+"/=",aa2vs)); 
                                    }
                                    if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+dataHouse[3][1]+"/=",aa2vs)); 
                                    }
                                   
                                }  
                                
                                // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
//                              
                            }

                        }
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0)
                                {
                                  pdfPTableHouse.addCell(pdfPCellHouse[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);  
                                }
                                else if(i==1 && j==3)
                                {
                                  pdfPTableHouse.addCell(pdfPCellHouse[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);    
                                }
                                 else if(i>1 && i<11 && j==2)
                                {
                                  pdfPTableHouse.addCell(pdfPCellHouse[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);    
                                }
                                 else if(i>9 && j==3)
                                 {
                                   pdfPTableHouse.addCell(pdfPCellHouse[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                 }
                                else
                                 {
                                    pdfPTableHouse.addCell(pdfPCellHouse[i][j]);  
                                 }
                                
                                
                            }
                        }
                        return(pdfPTableHouse);
}
public PdfPTable investheader() throws DocumentException
{
     PdfPTable pdfPTabletaxcountass2vshi = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vshi = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vshi = new float[]{10f,30f};
                    pdfPTabletaxcountass2vshi.setWidths(columnWidthsassesseass122vshi);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vshi[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshi[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vshi[i][j] = new PdfPCell(new Paragraph("Schedule-3(Investment Tax Credit)",aa2v)); 
                                    pdfPCelltaxcountass12vshi[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshi[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vshi.addCell(pdfPCelltaxcountass12vshi[i][j]);
                            }
                        }
                       
                        
                      
                        return(pdfPTabletaxcountass2vshi);
    
}
public PdfPTable investbody(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException, DocumentException
{
  //tax divate
                    taxdibate = conn.TAXDIBATE(text,ayear);

                    int[] amount = new int[10];
                    int sumtaxx = 0;
                    String[] name = new String[5];
                    JSONObject jsonObject1 = new JSONObject(taxdibate[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArray = jsonObject1.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArray.get(i);
                        amount[i] = temp.getInt("amount");
                        name[i] = temp.getString("name");
                        sumtaxx = sumtaxx + amount[i];
                    }

                    String[][] datataxother = {
                        
                        {"",name[0], "Tk",Integer.toString(amount[0])},
                        {"",name[1], "Tk",Integer.toString(amount[1])},
                        {"",name[2],"Tk", Integer.toString(amount[2])},
                        {"",name[3],"Tk", Integer.toString(amount[3])},
                        {"",name[4],"Tk", Integer.toString(amount[4])},
                        {" ", "Total=" + sumtaxx},};
                    othd=Integer.parseInt(taxdibate[10])+Integer.parseInt(taxdibate[11]);
                     oth=sumtaxx+othd;
                    int taxsum = 0;
                    for (int i = 1; i < 12; i++) {
                        taxsum = taxsum + Integer.parseInt(taxdibate[i]);
                    }
                    for (int i = 0; i < 5; i++) {
                        taxsum = taxsum + amount[i];
                    }
                    String[][] datataxdibate = {
                    
                        {"1.","Life insurence premium","Tk", taxdibate[1]},
                        {"2.","Contribution to deffered annuity","Tk", taxdibate[2]},
                        {"3.","Contribution to Provident fund to which Provident fund Act , 1925 applies","Tk", taxdibate[3]},
                        {"4.","Self contribution & emplyer's contribution to Recognized Provident fund", "Tk",taxdibate[4]},
                        {"5.","Contribution to Super annuation fund","Tk", taxdibate[5]},
                        {"6.","Investment in approved deventure stock,Stock or Shatres","Tk", taxdibate[6]},
                        {"7.","Contribution to deposit pension schema ","Tk", taxdibate[7]},
                        {"8.","Contribution to Benevolent fund & group insurence premium","Tk", taxdibate[8]},
                        {"9.","Contribution to Zakat fund","Tk", taxdibate[9]},
                        {"10.","other","Tk", taxdibate[12]},
                        {" ","                                     Total= ","Tk", Integer.toString(taxsum)},
                        {" "," "," "," "},
                        {"Saving Certificate/Unit Certificate/Bond Prize bond","Tk", taxdibate[10]},
                        {"Saving Scheme/Computer","Tk", taxdibate[11]},
                        
                    };
                     lentgthnull=vlength.notnulllenth(datataxother);
                                    PdfPTable pdfPTabletaxother = new PdfPTable(4);
                                    PdfPCell[][] pdfPCelltaxother = new PdfPCell[lentgthnull+3][4];
                                    float[] columnWidthsassesseass122vshik = new float[]{6f,18f,2f,5f};
                                    pdfPTabletaxother.setWidths(columnWidthsassesseass122vshik);
                                    Font aa2a = new Font(Font.FontFamily.HELVETICA, 10 );
                                   
                                    for (int ii = 0; ii <(lentgthnull+3); ii++) {
                                        for (int jj = 0; jj < 4; jj++) {
                                            if(ii==0 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Other,s"));  
                                            }
                                            if(ii==0 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" if any(give details)"));  
                                            }
                                           else if(ii==0 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==0 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==1 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==1 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[12][0],aa2a));  
                                            }
                                           else if(ii==1 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Tk", aa2a));  
                                            }
                                           else if(ii==1 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[12][2]+"/=",aa2a));
                                              pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);
                                            }
                                           else if(ii==2 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==2 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[13][0], aa2a));  
                                            }
                                            else if(ii==2 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Tk ", aa2a));  
                                            }
                                           else if(ii==2 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[13][2]+"/=", aa2a));
                                              pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);
                                            }
                                           else if(ii>2 && ii<8)
                                           {
                                             
                                             
                                               if(jj==3)
                                              {
                                                  
                                               pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxother[ii-3][jj]+"/=", aa2a));
                                                 pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);  
                                              }
                                               else
                                               {
                                                pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxother[ii-3][jj], aa2a));    
                                               }
                                           }
                                           pdfPCelltaxother[ii][jj].disableBorderSide(1);
                                            pdfPCelltaxother[ii][jj].disableBorderSide(2);
                                            pdfPCelltaxother[ii][jj].disableBorderSide(4);
                                             pdfPCelltaxother[ii][jj].disableBorderSide(8);
                                        }

                                    }
                                    for (int ii = 0; ii < (lentgthnull+3); ii++) {
                                        for (int jj = 0; jj < 4; jj++) {
                                            if(ii>0 &&  ii<(lentgthnull+3) && jj==3)
                                            {
                                              pdfPTabletaxother.addCell(pdfPCelltaxother[ii][jj]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                            }
                                            else
                                            {
                                              pdfPTabletaxother.addCell(pdfPCelltaxother[ii][jj]);  
                                            }
                                            
                                        }
                                    }
                                    //root
                        PdfPTable pdfPTabletaxdibate = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxdibate = new PdfPCell[23][4];
                        float[] columnWidthsassesseass122vshir = new float[]{3f,30f,3f,8f};
                   pdfPTabletaxdibate.setWidths(columnWidthsassesseass122vshir);
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                              
                                if (i == (9) && j == 1) {

                                    pdfPCelltaxdibate[i][j] = new PdfPCell(pdfPTabletaxother);

                                }
                                else if (i == (9) && j == 3) {

                                    pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph( Integer.toString(oth)+"/=", aa2a));
                                    pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);

                                }
                                else if(i==11 )
                                {
                                    switch(j)
                                    {
                                        case 0:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j]));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                          //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           pdfPCelltaxdibate[i][j].disableBorderSide(8);
                                           break;
                                        }
                                        case 1:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 2:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            //pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 3:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                           //pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);
                                           
                                             break;
                                        }
                                    }
                                   
                                   
                                }
                                else {
                                    
                                   
                                    if(j==3)
                                    {
                                         pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j]+"/=", aa2a));
                                         pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                    {
                                         pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                    }
                                    
                                }
                                if(i==0 )
                                {
                                    switch(j)
                                    {
                                        case 0:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                          //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           pdfPCelltaxdibate[i][j].disableBorderSide(8);
                                           break;
                                        }
                                        case 1:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 2:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 3:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                           
                                             break;
                                        }
                                    }
                                   
                                   
                                }
                                
                                if(i<11&& i!=0 && (  j==0||j==1||j==2||j==3))
                                {
                                    if(j==0)
                                    {
                                       pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                 pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(8);   
                                    }
                                    else if(j==3)
                                            {
                                    pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                   // pdfPCelltaxdibate[i][j].disableBorderSide(8);     
                                            }
                                    else
                                    {
                                         pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(8);  
                                    }
                                   
                                }

                            }

                        }
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                 pdfPTabletaxdibate.addCell(pdfPCelltaxdibate[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                 pdfPTabletaxdibate.addCell(pdfPCelltaxdibate[i][j]);   
                                }
                                
                            }
                        }
                        return(pdfPTabletaxdibate);
  
}
public PdfPTable listheader() throws DocumentException
{
     PdfPTable pdfPTabletaxcountass2vshil = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vshil = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vshil = new float[]{10f,30f};
                    pdfPTabletaxcountass2vshil.setWidths(columnWidthsassesseass122vshil);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vshil[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshil[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vshil[i][j] = new PdfPCell(new Paragraph("List of documents furnished",aa2v)); 
                                    pdfPCelltaxcountass12vshil[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshil[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vshil.addCell(pdfPCelltaxcountass12vshil[i][j]);
                            }
                        }
                        
                         return(pdfPTabletaxcountass2vshil);
}
public PdfPTable listfunction() throws DocumentException
{
    //root
                        String list[][]=
                        {
                            {" 1 Salary Statement                                   6 Advancement Payment Slips"},
                            {" 2 MBSTU Loan Statement                       7 Copy of Chalan"},
                            {" 3 Last Year Income Tax Return Slip        8 Provident Fund statement"},
                            {" 4 Insurance Premium Slips                     9 Passport Size Photo"},
                            {" 5 DPS Statement                                   10 NID Smart Card Copy"}
                            
                        };
                       
                       
                        
                         PdfPTable pdfPTabletaxcountass2vshill = new PdfPTable(1);
                        PdfPCell[][] pdfPCelltaxcountass12vshill = new PdfPCell[15][1];
                        
                   
                        for (int i = 0; i < 15; i++) {
                            for (int j = 0; j < 1; j++) {
                                if(i==0 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[0][0]));
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                   //pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                if(i==1 || i==2 ||i==13 || i==4 || i==5 || i==7 || i==8 || i==10 || i==11 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                   //pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                   //pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                if(i==3 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[1][0]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                
                                
                                  if(i==6 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[2][0]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }

                                
                                   if(i==9 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[3][0]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                 //  pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                 //  pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }

                                
                                   if(i==12 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[4][0]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }

                                  if( i==14 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                            }

                        }
                        for (int i = 0; i <15; i++) {
                            for (int j = 0; j < 1; j++) {
                               pdfPTabletaxcountass2vshill.addCell(pdfPCelltaxcountass12vshill[i][j]);
                            }
                        }
                        pdfPTabletaxcountass2vshill.setWidthPercentage(80);
                        return(pdfPTabletaxcountass2vshill); 
}
public PdfPTable assetliability(long text,int ayear) throws JSONException, ClassNotFoundException, SQLException, DocumentException
{
  //Assetliability
                    assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
                    int assetsumm = 0;

                    totalasset[0] = Integer.parseInt(assetliabilityreturn[1]);
                    //shareholding
                    int Assetamount2 = 0;
                    String[] Assetname2 = new String[5];
                    int[] Assetshare2 = new int[5];
                    int[] Assetcost2 = new int[5];
                    JSONObject jsonObjectAsset2 = new JSONObject(assetliabilityreturn[2]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset2 = jsonObjectAsset2.getJSONArray("shareholding");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset2.get(i);
                        Assetshare2[i] = temp.getInt("share");
                        Assetcost2[i] = temp.getInt("cost");
                        Assetname2[i] = temp.getString("name");
                        Assetamount2 = Assetamount2 + Assetcost2[i];
                    }
                    totalasset[1] = Assetamount2;
                    String[][] dataasset2 = {
                        {"Directors Shareholding in Limited Companies (at cost)",""},
                        {"Name of Companies","Number of shares"},
                        {Assetname2[0], Integer.toString(Assetshare2[0])+"/=" },
                        {Assetname2[1], Integer.toString(Assetshare2[1])+"/=" },
                        {Assetname2[2], Integer.toString(Assetshare2[2])+"/="},
                        {Assetname2[3], Integer.toString(Assetshare2[3])+"/="},
                        {Assetname2[4], Integer.toString(Assetshare2[4])+"/="},
                        {" ", " ", "Total=" + Integer.toString(Assetamount2)+"/="},};
                    //nonagricultural
                    int Assetamount3 = 0;
                    String[] Assetname3 = new String[5];
                    int[] Assetshare3 = new int[5];
                    int[] Assetcost3 = new int[5];
                    JSONObject jsonObjectAsset3 = new JSONObject(assetliabilityreturn[3]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset3 = jsonObjectAsset3.getJSONArray("nonagricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset3.get(i);
                        Assetcost3[i] = temp.getInt("cost");
                        Assetname3[i] = temp.getString("name");
                        Assetamount3 = Assetamount3 + Assetcost3[i];
                    }
                    totalasset[2] = Assetamount3;
                    String[][] dataasset3 = {
                          {"Non-Agricultural Property (at cost with legal expenses)"," "},
                        {"Land/House property(Description & location of property)"," "},
                        {Assetname3[0], Integer.toString(Assetcost3[0])+"/="},
                        {Assetname3[1], Integer.toString(Assetcost3[1])+"/="},
                        {Assetname3[2], Integer.toString(Assetcost3[2])+"/="},
                        {Assetname3[3], Integer.toString(Assetcost3[3])+"/="},
                        {Assetname3[4], Integer.toString(Assetcost3[4])+"/="},
                        {" ", "Total=" + Integer.toString(Assetamount3)+"/="},};
                    //agricultural
                    int Assetamount4 = 0;
                    String[] Assetname4 = new String[5];
                    int[] Assetshare4 = new int[5];
                    int[] Assetcost4 = new int[5];
                    JSONObject jsonObjectAsset4 = new JSONObject(assetliabilityreturn[4]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset4 = jsonObjectAsset4.getJSONArray("agricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset4.get(i);
                        Assetcost4[i] = temp.getInt("cost");
                        Assetname4[i] = temp.getString("name");
                        Assetamount4 = Assetamount4 + Assetcost4[i];
                    }
                    totalasset[3] = Assetamount4;

                    String[][] dataasset4 = {
                         {"Agricultural Property (at cost with legal expenses)"," "},
                        {"Land (Total land and location of land property))"," "},
                        {Assetname4[0], Integer.toString(Assetcost4[0])+"/="},
                        {Assetname4[1], Integer.toString(Assetcost4[1])+"/="},
                        {Assetname4[2], Integer.toString(Assetcost4[2])+"/="},
                        {Assetname4[3], Integer.toString(Assetcost4[3])+"/="},
                        {Assetname4[4], Integer.toString(Assetcost4[4])+"/="},
                        {" ", "Total=" + Integer.toString(Assetamount4)+"/="},};

                    //Investment
                    int Assetamount5 = 0;
                    String[] Assetname5 = new String[6];
                    int[] Assetshare5 = new int[6];
                    int[] Assetcost5 = new int[6];
                    JSONObject jsonObjectAsset5 = new JSONObject(assetliabilityreturn[5]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset5 = jsonObjectAsset5.getJSONArray("investment");
                    for (int i = 0; i < 6; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset5.get(i);
                        Assetcost5[i] = temp.getInt("cost");
                        Assetname5[i] = temp.getString("name");
                        Assetamount5 = Assetamount5 + Assetcost5[i];
                    }
                    totalasset[4] = Assetamount5;
                    String[][] dataasset5 = {
                        {"Investments:","",""},
                        {"(a)  "+Assetname5[0],"Tk", Integer.toString(Assetcost5[0])+"/="},
                        {"(b)  "+Assetname5[1],"Tk", Integer.toString(Assetcost5[1])+"/="},
                        {"(c)  "+Assetname5[2], "Tk",Integer.toString(Assetcost5[2])+"/="},
                        {"(d)  "+Assetname5[3],"Tk", Integer.toString(Assetcost5[3])+"/="},
                        {"(e)  "+Assetname5[4],"Tk", Integer.toString(Assetcost5[4])+"/="},
                        {"(f)  "+Assetname5[5],"Tk", Integer.toString(Assetcost5[5])+"/="},
                        {" ", " " ,"Total="},};

                    //motor
                    int Assetamount6 = 0;
                    String[] Assetname6 = new String[5];
                    int[] Assetshare6 = new int[5];
                    int[] Assetcost6 = new int[5];
                    JSONObject jsonObjectAsset6 = new JSONObject(assetliabilityreturn[6]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset6 = jsonObjectAsset6.getJSONArray("motor");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset6.get(i);
                        Assetcost6[i] = temp.getInt("cost");
                        Assetname6[i] = temp.getString("name");
                        Assetamount6 = Assetamount6 + Assetcost6[i];
                    }
                    totalasset[5] = Assetamount6;
                    String[][] dataasset6 = {
                        {"Motor Vehicles(at cost)"," "},
                        {"Type of motor vehicle and Registration number", " "},
                        {Assetname6[0], Integer.toString(Assetcost6[0])+"/="},
                        {Assetname6[1], Integer.toString(Assetcost6[1])+"/="},
                        {Assetname6[2], Integer.toString(Assetcost6[2])+"/="},
                        {Assetname6[3], Integer.toString(Assetcost6[3])+"/="},
                        {Assetname6[4], Integer.toString(Assetcost6[4])+"/="},
                        {" ", "Total=" + Integer.toString(Assetamount6)+"/="},};
                    //JWELLERY
                    int Assetamount7 = 0;
                    String[] Assetname7 = new String[5];
                    int[] Assetshare7 = new int[5];
                    int[] Assetcost7 = new int[5];
                    JSONObject jsonObjectAsset7 = new JSONObject(assetliabilityreturn[7]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset7 = jsonObjectAsset7.getJSONArray("jwellery");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset7.get(i);
                        Assetcost7[i] = temp.getInt("cost");
                        Assetname7[i] = temp.getString("name");
                        Assetamount7 = Assetamount7 + Assetcost7[i];
                    }
                    totalasset[6] = Assetamount7;
                    totalasset[7] = Integer.parseInt(assetliabilityreturn[8]);
                    totalasset[8] = Integer.parseInt(assetliabilityreturn[9]);
                    String[][] dataasset7 = {
                         {"Jewellery(quantity and cost)"," "},
                        {"300 gram Gold", " "},
                        {Assetname7[0], Integer.toString(Assetcost7[0])+"/="},
                        {Assetname7[1], Integer.toString(Assetcost7[1])+"/="},
                        {Assetname7[2], Integer.toString(Assetcost7[2])+"/="},
                        {Assetname7[3], Integer.toString(Assetcost7[3])+"/="},
                        {Assetname7[4], Integer.toString(Assetcost7[4])+"/="},
                        {" ", "Total=" + Integer.toString(Assetamount7)+"/="},};

                    //cashasset
                    int Assetamount10 = 0;
                    String[] Assetname10 = new String[5];
                    int[] Assetshare10 = new int[5];
                    int[] Assetcost10 = new int[5];
                    JSONObject jsonObjectAsset10 = new JSONObject(assetliabilityreturn[10]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset10 = jsonObjectAsset10.getJSONArray("cashasset");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset10.get(i);
                        Assetcost10[i] = temp.getInt("cost");
                        Assetname10[i] = temp.getString("name");
                        Assetamount10 = Assetamount10 + Assetcost10[i];
                    }
                    totalasset[9] = Assetamount10;
                    String[][] dataasset10 = {
                        { "Cash Asset Outside Business:",""," "},
                         {"(a)  "+Assetname10[0],"Tk", Integer.toString(Assetcost10[0])+"/="},
                        {"(b)  "+Assetname10[1],"Tk", Integer.toString(Assetcost10[1])+"/="},
                        {"(c)   Other deposits((Paid the Interest of Mortgages))", "Tk",Integer.toString(Assetcost10[2])+"/="},
                       {" ", " " ,"Total="},};

                    //otherasset
                    int Assetamount11 = 0;
                    String[] Assetname11 = new String[5];
                    int[] Assetshare11 = new int[5];
                    int[] Assetcost11 = new int[5];
                    JSONObject jsonObjectAsset11 = new JSONObject(assetliabilityreturn[11]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset11 = jsonObjectAsset11.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset11.get(i);
                        Assetcost11[i] = temp.getInt("cost");
                        Assetname11[i] = temp.getString("name");
                        Assetamount11 = Assetamount11 + Assetcost11[i];
                    }
                    totalasset[10] = Assetamount11;
                    String[][] dataasset11 = {
                        { "Any other assets:"," "," "},
                         { "Give details"," "," "},
                        {"(a)  "+Assetname11[0], Integer.toString(Assetcost11[0])+"/="},
                        {"(b)  "+Assetname11[1], Integer.toString(Assetcost11[1])+"/="},
                        {"(c)  "+Assetname11[2], Integer.toString(Assetcost11[2])+"/="},
                        {"(d)  "+Assetname11[3], Integer.toString(Assetcost11[3])+"/="},
                        {"(e)  "+Assetname11[4], Integer.toString(Assetcost11[4])+"/="},
                        {" ", "Total=" ,""},
                    };

                    //lessliability
                    int Assetamount12 = 0;
                    String[] Assetname12 = new String[5];
                    int[] Assetshare12 = new int[5];
                    int[] Assetcost12 = new int[5];
                    JSONObject jsonObjectAsset12 = new JSONObject(assetliabilityreturn[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset12 = jsonObjectAsset12.getJSONArray("lessliability");
                    for (int i = 0; i < 4; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset12.get(i);
                        Assetcost12[i] = temp.getInt("cost");
                        Assetname12[i] = temp.getString("name");
                        Assetamount12 = Assetamount12 + Assetcost12[i];
                    }

                    String[][] dataasset12 = {
                        {"Less Liabilities:","",""},
                        {"(a)  "+Assetname12[0],"Tk", Integer.toString(Assetcost12[0])+"/="},
                        {"(b)  "+Assetname12[1],"Tk", Integer.toString(Assetcost12[1])+"/="},
                        {"(c)  "+Assetname12[2],"Tk", Integer.toString(Assetcost12[2])+"/="},
                        {"(d)  "+Assetname12[3],"Tk", Integer.toString(Assetcost12[3])+"/="},
                         {" ", "Total=" ,""},};
                    //member
                    int Assetamount17 = 0;
                    String[] Assetname17 = new String[5];
                    int[] Assetcost17 = new int[5];
                    JSONObject jsonObjectAsset17 = new JSONObject(assetliabilityreturn[17]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset17 = jsonObjectAsset17.getJSONArray("member");
                    for (int i = 0; i < 2; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset17.get(i);
                        Assetcost17[i] = temp.getInt("number");
                        Assetname17[i] = temp.getString("name");
                        Assetamount17 = Assetamount17 + Assetcost17[i];
                    }

                    String[][] dataasset17 = {
                        {"Name", "Number"},
                        {Assetname17[0], Integer.toString(Assetcost17[0])},
                        {Assetname17[1], Integer.toString(Assetcost17[1])},
                        {" ", "Total=" + Integer.toString(Assetamount17)},};

                    //Source Of Fund
                    int Assetamount19 = 0;
                    String[] Assetname19 = new String[5];
                    int[] Assetshare19 = new int[5];
                    int[] Assetcost19 = new int[5];
                    JSONObject jsonObjectAsset19 = new JSONObject(assetliabilityreturn[19]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset19 = jsonObjectAsset19.getJSONArray("sourcefund");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset19.get(i);
                        Assetcost19[i] = temp.getInt("cost");
                        Assetname19[i] = temp.getString("name");
                        Assetamount19 = Assetamount19 + Assetcost19[i];
                    }

                    String[][] dataasset19 = {
                        {"Sources of Fund:","",""},
                        {"(i)  "+Assetname19[0],"Tk", Integer.toString(Assetcost19[0])+"/="},
                        {"(ii)  "+Assetname19[1],"Tk", Integer.toString(Assetcost19[1])+"/="},
                        {"(iii)  "+Assetname19[2],"Tk", Integer.toString(Assetcost19[2])+"/="},
                         {" ", "Total=" ,""},};
                  int BFSUM=0;
                    for (int i = 0; i < 11; i++) {
                        assetsumm = assetsumm + totalasset[i];
                        if(i==9)
                        {
                          BFSUM=assetsumm;  
                        }
                    }
                    int thisyearincome = assetsumm - Assetamount12;
                    int finaldiffer = Integer.parseInt(assetliabilityreturn[18]) - Assetamount19;
                    int toac=Integer.parseInt(assetliabilityreturn[15])+Integer.parseInt(assetliabilityreturn[16]);
                    String[][] dataAsset = {
                        {"1. (a)", "Business Capital(Closing balance)","Tk", assetliabilityreturn[1]},
                        {"    (b) ", "Directors Shareholding in Limited Companies(at cost)","Tk.", assetliabilityreturn[2]},
                        {"2  ", "Non-agricultural","Tk.", assetliabilityreturn[3]},
                        {"3  ","Agricultural","Tk.", assetliabilityreturn[4]},
                        {"4  ","Investement","Tk.", assetliabilityreturn[5]},
                        {"5  ","Motor","Tk.", assetliabilityreturn[6]},
                        {"6  ","Jewellery","Tk.", assetliabilityreturn[7]},
                        {"7  ","Furniture(at cost)","Tk.", assetliabilityreturn[8]},
                        {"8  ","Electric Equipment(at cost)","Tk.", assetliabilityreturn[9]},
                        {"9  ","Cash asset outside business:","Tk.", assetliabilityreturn[10]},
                        {"10  ","Any other assets","Tk.", assetliabilityreturn[11]},
                        {"11  ","Total Asset","Tk.", Integer.toString(assetsumm)},
                        {"12  ","Less Liability","Tk.", assetliabilityreturn[12]},
                        {"13  ","Net wealth this year","Tk.", Integer.toString(thisyearincome)},
                        {"14  ","Net wealth last year","Tk.", assetliabilityreturn[14]},
                        {"15  ","Accretion in wealth","Tk.", assetliabilityreturn[15]},
                        {"16  ","Family Expenditure","Tk.", assetliabilityreturn[16]},
                        {"17  ","Dependent member","Tk.", assetliabilityreturn[17]},
                        {"18  ","Total accretion of wealth ","Tk.", assetliabilityreturn[18]},
                        {"19  ","Source fund","Tk.", assetliabilityreturn[19]},
                        {"20  ","Difference","Tk.", Integer.toString(finaldiffer)}
                    }; 
                    
                     lentgthnull=vlength.notnulllenth1(Assetname2)+2;
                        PdfPTable pdfPTableasset2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset2 = new PdfPCell[lentgthnull+1][2];
                     float[] share = new float[]{25f,10f};
                      pdfPTableasset2.setWidths(share);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==1)
                                {
                                 pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(dataasset2[i][j],tat2));   
                                }
                                else
                                {
                                 pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(dataasset2[i][j],tat));   
                                }
                                if(i>1&&j==1)
                                {
                                 pdfPCellasset2[i][j].setCellEvent(simpleBottomLine);   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                 pdfPCellasset2[i][j].disableBorderSide(1);
                                  pdfPCellasset2[i][j].disableBorderSide(2);
                                   pdfPCellasset2[i][j].disableBorderSide(4);
                                   pdfPCellasset2[i][j].disableBorderSide(8);
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1 && j==1)
                                {
                                  pdfPTableasset2.addCell(pdfPCellasset2[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                }
                                else
                                {
                                  pdfPTableasset2.addCell(pdfPCellasset2[i][j]);  
                                }
                                
                            }
                        }
                        //non agricultural
                         lentgthnull=vlength.notnulllenth1(Assetname3)+2;
                        PdfPTable pdfPTableasset3 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset3 = new PdfPCell[lentgthnull+1][2];
                         float[] share2 = new float[]{25f,10f};
                      pdfPTableasset3.setWidths(share2);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(dataasset3[i][j],tat));   
                                }
                                else
                                {
                                  pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(dataasset3[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                 if(i>1&&j==1&& i!=lentgthnull)
                                {
                                 pdfPCellasset3[i][j].setCellEvent(simpleBottomLine);   
                                }
                                    pdfPCellasset3[i][j].disableBorderSide(1);
                                    pdfPCellasset3[i][j].disableBorderSide(2);
                                   pdfPCellasset3[i][j].disableBorderSide(4);
                                   pdfPCellasset3[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPTableasset3.addCell(pdfPCellasset3[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset3.addCell(pdfPCellasset3[i][j]); 
                                 }
                            }
                        }
                        // agricultural
 lentgthnull=vlength.notnulllenth1(Assetname3)+2;
                        PdfPTable pdfPTableasset4 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset4 = new PdfPCell[lentgthnull+1][2];
                         float[] share3 = new float[]{25f,10f};
                      pdfPTableasset4.setWidths(share3);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(dataasset4[i][j],tat));   
                                }
                                else
                                {
                                  pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(dataasset4[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                 if(i>1&&j==1&& i!=lentgthnull)
                                {
                                 pdfPCellasset4[i][j].setCellEvent(simpleBottomLine);   
                                }
                                    pdfPCellasset4[i][j].disableBorderSide(1);
                                    pdfPCellasset4[i][j].disableBorderSide(2);
                                   pdfPCellasset4[i][j].disableBorderSide(4);
                                   pdfPCellasset4[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPTableasset4.addCell(pdfPCellasset4[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset4.addCell(pdfPCellasset4[i][j]); 
                                 }
                            }
                        }
//                       

                        // investment
                        PdfPTable pdfPTableasset5 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset5 = new PdfPCell[23][3];
                        float[] share4 = new float[]{20f,4f,10f};
                      pdfPTableasset5.setWidths(share4);
                        for (int i = 0; i < dataasset5.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset5.length-1)
                                {
                                  pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset5.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat)); 
                                     pdfPCellasset5[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat)); 
                                }
                                 pdfPCellasset5[i][j].disableBorderSide(1);
                                    pdfPCellasset5[i][j].disableBorderSide(2);
                                   pdfPCellasset5[i][j].disableBorderSide(4);
                                   pdfPCellasset5[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset5.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i>0 &&i!=dataasset5.length-1 && j==2)
                                {
                                  pdfPTableasset5.addCell(pdfPCellasset5[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                   pdfPTableasset5.addCell(pdfPCellasset5[i][j]);  
                                }
                               
                            }
                        }

                        // motor
                        lentgthnull=vlength.notnulllenth1(Assetname6)+2;
                        PdfPTable pdfPTableasset6 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset6 = new PdfPCell[lentgthnull+1][2];
                         float[] share6 = new float[]{25f,10f};
                      pdfPTableasset6.setWidths(share6);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(dataasset6[i][j],tat));   
                                }
                                else
                                {
                                  pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(dataasset6[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                if(i>1&&j==1&& i!=lentgthnull)
                                {
                                 pdfPCellasset6[i][j].setCellEvent(simpleBottomLine);   
                                }
                                    pdfPCellasset6[i][j].disableBorderSide(1);
                                    pdfPCellasset6[i][j].disableBorderSide(2);
                                   pdfPCellasset6[i][j].disableBorderSide(4);
                                   pdfPCellasset6[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPTableasset6.addCell(pdfPCellasset6[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset6.addCell(pdfPCellasset6[i][j]); 
                                 }
                            }
                        }

                        // jwellary
                         lentgthnull=vlength.notnulllenth1(Assetname7)+2;
                        PdfPTable pdfPTableasset7 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset7 = new PdfPCell[lentgthnull+1][2];
                         float[] share7 = new float[]{25f,10f};
                      pdfPTableasset7.setWidths(share7);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(dataasset7[i][j],tat));   
                                }
                                else
                                {
                                  pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(dataasset7[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                if(i>1&&j==1&& i!=lentgthnull)
                                {
                                 pdfPCellasset7[i][j].setCellEvent(simpleBottomLine);   
                                }
                                    pdfPCellasset7[i][j].disableBorderSide(1);
                                    pdfPCellasset7[i][j].disableBorderSide(2);
                                   pdfPCellasset7[i][j].disableBorderSide(4);
                                   pdfPCellasset7[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                 if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPTableasset7.addCell(pdfPCellasset7[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset7.addCell(pdfPCellasset7[i][j]); 
                                 }
                            }
                        }

                        // Cash Asset
                          PdfPTable pdfPTableasset10 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset10 = new PdfPCell[23][3];
                        float[] share10 = new float[]{23f,3f,8f};
                      pdfPTableasset10.setWidths(share10);
                        for (int i = 0; i < dataasset10.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset10.length-1)
                                {
                                  pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset10.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat)); 
                                     pdfPCellasset10[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat)); 
                                }
                                 pdfPCellasset10[i][j].disableBorderSide(1);
                                    pdfPCellasset10[i][j].disableBorderSide(2);
                                   pdfPCellasset10[i][j].disableBorderSide(4);
                                   pdfPCellasset10[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset10.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               if(i>0 &&i!=dataasset10.length-1 && j==2)
                                {
                                  pdfPTableasset10.addCell(pdfPCellasset10[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                   pdfPTableasset10.addCell(pdfPCellasset10[i][j]);  
                                }
                            }
                        }
                        
        
                        //document.add(pdfPTableasset1);
                        PdfPTable pdfPTableAsset = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset = new PdfPCell[23][4];
                        float[] columnWidth = new float[]{4f,35,4f,8f};
                        pdfPTableAsset.setWidths(columnWidth);
                        //idex 0-9 close
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                            pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset2);   
                                          
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount2)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 if(i==2)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset3);   
                                             
                                          
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount3)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                 if(i==3)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset4);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount4)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                  if(i==4)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset5);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount5)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                   if(i==5)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset6);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount6)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                    if(i==6)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset7);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount7)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                     if(i==7)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                      if(i==8)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                       if(i==9)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset10);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount10)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                   pdfPCellAsset[i][j].disableBorderSide(1);
                                   pdfPCellAsset[i][j].disableBorderSide(2);
                                   pdfPCellAsset[i][j].disableBorderSide(4);
                                   pdfPCellAsset[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                  pdfPTableAsset.addCell(pdfPCellAsset[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                 pdfPTableAsset.addCell(pdfPCellAsset[i][j]);    
                                }
                               
                            }
                        }
                      
                        return(pdfPTableAsset);
}
public PdfPTable assetliability1020(long text,int ayear) throws DocumentException, JSONException, ClassNotFoundException, SQLException
{
     //index 10 to next
     assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
                   

                    totalasset[0] = Integer.parseInt(assetliabilityreturn[1]);
                    //shareholding
                    int Assetamount2 = 0;
                    String[] Assetname2 = new String[5];
                    int[] Assetshare2 = new int[5];
                    int[] Assetcost2 = new int[5];
                    JSONObject jsonObjectAsset2 = new JSONObject(assetliabilityreturn[2]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset2 = jsonObjectAsset2.getJSONArray("shareholding");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset2.get(i);
                        Assetshare2[i] = temp.getInt("share");
                        Assetcost2[i] = temp.getInt("cost");
                        Assetname2[i] = temp.getString("name");
                        Assetamount2 = Assetamount2 + Assetcost2[i];
                    }
                    totalasset[1] = Assetamount2;
                    String[][] dataasset2 = {
                        {"Directors Shareholding in Limited Companies (at cost)",""},
                        {"Name of Companies","Number of shares"},
                        {Assetname2[0], Integer.toString(Assetshare2[0]) },
                        {Assetname2[1], Integer.toString(Assetshare2[1]) },
                        {Assetname2[2], Integer.toString(Assetshare2[2])},
                        {Assetname2[3], Integer.toString(Assetshare2[3])},
                        {Assetname2[4], Integer.toString(Assetshare2[4])},
                        {" ", " ", "Total=" + Integer.toString(Assetamount2)},};
                    //nonagricultural
                    int Assetamount3 = 0;
                    String[] Assetname3 = new String[5];
                    int[] Assetshare3 = new int[5];
                    int[] Assetcost3 = new int[5];
                    JSONObject jsonObjectAsset3 = new JSONObject(assetliabilityreturn[3]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset3 = jsonObjectAsset3.getJSONArray("nonagricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset3.get(i);
                        Assetcost3[i] = temp.getInt("cost");
                        Assetname3[i] = temp.getString("name");
                        Assetamount3 = Assetamount3 + Assetcost3[i];
                    }
                    totalasset[2] = Assetamount3;
                    String[][] dataasset3 = {
                          {"Non-Agricultural Property (at cost with legal expenses)"," "},
                        {"Land/House property(Description & location of property)"," "},
                        {Assetname3[0], Integer.toString(Assetcost3[0])},
                        {Assetname3[1], Integer.toString(Assetcost3[1])},
                        {Assetname3[2], Integer.toString(Assetcost3[2])},
                        {Assetname3[3], Integer.toString(Assetcost3[3])},
                        {Assetname3[4], Integer.toString(Assetcost3[4])},
                        {" ", "Total=" + Integer.toString(Assetamount3)},};
                    //agricultural
                    int Assetamount4 = 0;
                    String[] Assetname4 = new String[5];
                    int[] Assetshare4 = new int[5];
                    int[] Assetcost4 = new int[5];
                    JSONObject jsonObjectAsset4 = new JSONObject(assetliabilityreturn[4]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset4 = jsonObjectAsset4.getJSONArray("agricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset4.get(i);
                        Assetcost4[i] = temp.getInt("cost");
                        Assetname4[i] = temp.getString("name");
                        Assetamount4 = Assetamount4 + Assetcost4[i];
                    }
                    totalasset[3] = Assetamount4;

                    String[][] dataasset4 = {
                         {"Agricultural Property (at cost with legal expenses)"," "},
                        {"Land (Total land and location of land property))"," "},
                        {Assetname4[0], Integer.toString(Assetcost4[0])},
                        {Assetname4[1], Integer.toString(Assetcost4[1])},
                        {Assetname4[2], Integer.toString(Assetcost4[2])},
                        {Assetname4[3], Integer.toString(Assetcost4[3])},
                        {Assetname4[4], Integer.toString(Assetcost4[4])},
                        {" ", "Total=" + Integer.toString(Assetamount4)},};

                    //Investment
                    int Assetamount5 = 0;
                    String[] Assetname5 = new String[6];
                    int[] Assetshare5 = new int[6];
                    int[] Assetcost5 = new int[6];
                    JSONObject jsonObjectAsset5 = new JSONObject(assetliabilityreturn[5]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset5 = jsonObjectAsset5.getJSONArray("investment");
                    for (int i = 0; i < 6; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset5.get(i);
                        Assetcost5[i] = temp.getInt("cost");
                        Assetname5[i] = temp.getString("name");
                        Assetamount5 = Assetamount5 + Assetcost5[i];
                    }
                    totalasset[4] = Assetamount5;
                    String[][] dataasset5 = {
                        {"Investments:","",""},
                        {"(a)  "+Assetname5[0],"Tk", Integer.toString(Assetcost5[0])},
                        {"(b)  "+Assetname5[1],"Tk", Integer.toString(Assetcost5[1])},
                        {"(c)  "+Assetname5[2], "Tk",Integer.toString(Assetcost5[2])},
                        {"(d)  "+Assetname5[3],"Tk", Integer.toString(Assetcost5[3])},
                        {"(e)  "+Assetname5[4],"Tk", Integer.toString(Assetcost5[4])},
                        {"(f)  "+Assetname5[5],"Tk", Integer.toString(Assetcost5[5])},
                        {" ", " " ,"Total="},};

                    //motor
                    int Assetamount6 = 0;
                    String[] Assetname6 = new String[5];
                    int[] Assetshare6 = new int[5];
                    int[] Assetcost6 = new int[5];
                    JSONObject jsonObjectAsset6 = new JSONObject(assetliabilityreturn[6]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset6 = jsonObjectAsset6.getJSONArray("motor");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset6.get(i);
                        Assetcost6[i] = temp.getInt("cost");
                        Assetname6[i] = temp.getString("name");
                        Assetamount6 = Assetamount6 + Assetcost6[i];
                    }
                    totalasset[5] = Assetamount6;
                    String[][] dataasset6 = {
                        {"Motor Vehicles(at cost)"," "},
                        {"Type of motor vehicle and Registration number", " "},
                        {Assetname6[0], Integer.toString(Assetcost6[0])},
                        {Assetname6[1], Integer.toString(Assetcost6[1])},
                        {Assetname6[2], Integer.toString(Assetcost6[2])},
                        {Assetname6[3], Integer.toString(Assetcost6[3])},
                        {Assetname6[4], Integer.toString(Assetcost6[4])},
                        {" ", "Total=" + Integer.toString(Assetamount6)},};
                    //JWELLERY
                    int Assetamount7 = 0;
                    String[] Assetname7 = new String[5];
                    int[] Assetshare7 = new int[5];
                    int[] Assetcost7 = new int[5];
                    JSONObject jsonObjectAsset7 = new JSONObject(assetliabilityreturn[7]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset7 = jsonObjectAsset7.getJSONArray("jwellery");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset7.get(i);
                        Assetcost7[i] = temp.getInt("cost");
                        Assetname7[i] = temp.getString("name");
                        Assetamount7 = Assetamount7 + Assetcost7[i];
                    }
                    totalasset[6] = Assetamount7;
                    totalasset[7] = Integer.parseInt(assetliabilityreturn[8]);
                    totalasset[8] = Integer.parseInt(assetliabilityreturn[9]);
                    String[][] dataasset7 = {
                         {"Jewellery(quantity and cost)"," "},
                        {"300 gram Gold", " "},
                        {Assetname7[0], Integer.toString(Assetcost7[0])},
                        {Assetname7[1], Integer.toString(Assetcost7[1])},
                        {Assetname7[2], Integer.toString(Assetcost7[2])},
                        {Assetname7[3], Integer.toString(Assetcost7[3])},
                        {Assetname7[4], Integer.toString(Assetcost7[4])},
                        {" ", "Total=" + Integer.toString(Assetamount7)},};

                    //cashasset
                    int Assetamount10 = 0;
                    String[] Assetname10 = new String[5];
                    int[] Assetshare10 = new int[5];
                    int[] Assetcost10 = new int[5];
                    JSONObject jsonObjectAsset10 = new JSONObject(assetliabilityreturn[10]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset10 = jsonObjectAsset10.getJSONArray("cashasset");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset10.get(i);
                        Assetcost10[i] = temp.getInt("cost");
                        Assetname10[i] = temp.getString("name");
                        Assetamount10 = Assetamount10 + Assetcost10[i];
                    }
                    totalasset[9] = Assetamount10;
                    String[][] dataasset10 = {
                        { "Cash Asset Outside Business:",""," "},
                         {"(a)  "+Assetname10[0],"Tk", Integer.toString(Assetcost10[0])},
                        {"(b)  "+Assetname10[1],"Tk", Integer.toString(Assetcost10[1])},
                        {"(c)   Other deposits((Paid the Interest of Mortgages))", "Tk",Integer.toString(Assetcost10[2])},
                       {" ", " " ,"Total="},};

                    //otherasset
                    int Assetamount11 = 0;
                    String[] Assetname11 = new String[5];
                    int[] Assetshare11 = new int[5];
                    int[] Assetcost11 = new int[5];
                    JSONObject jsonObjectAsset11 = new JSONObject(assetliabilityreturn[11]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset11 = jsonObjectAsset11.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset11.get(i);
                        Assetcost11[i] = temp.getInt("cost");
                        Assetname11[i] = temp.getString("name");
                        Assetamount11 = Assetamount11 + Assetcost11[i];
                    }
                    totalasset[10] = Assetamount11;
                    String[][] dataasset11 = {
                        { "Any other assets:"," "," "},
                         { "Give details"," "," "},
                        {"(a)  "+Assetname11[0], Integer.toString(Assetcost11[0])},
                        {"(b)  "+Assetname11[1], Integer.toString(Assetcost11[1])},
                        {"(c)  "+Assetname11[2], Integer.toString(Assetcost11[2])},
                        {"(d)  "+Assetname11[3], Integer.toString(Assetcost11[3])},
                        {"(e)  "+Assetname11[4], Integer.toString(Assetcost11[4])},
                        {" ", "Total=" ,""},
                    };

                    //lessliability
                    int Assetamount12 = 0;
                    String[] Assetname12 = new String[5];
                    int[] Assetshare12 = new int[5];
                    int[] Assetcost12 = new int[5];
                    JSONObject jsonObjectAsset12 = new JSONObject(assetliabilityreturn[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset12 = jsonObjectAsset12.getJSONArray("lessliability");
                    for (int i = 0; i < 4; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset12.get(i);
                        Assetcost12[i] = temp.getInt("cost");
                        Assetname12[i] = temp.getString("name");
                        Assetamount12 = Assetamount12 + Assetcost12[i];
                    }

                    String[][] dataasset12 = {
                        {"Less Liabilities:","",""},
                        {"(a)  "+Assetname12[0],"Tk", Integer.toString(Assetcost12[0])},
                        {"(b)  "+Assetname12[1],"Tk", Integer.toString(Assetcost12[1])},
                        {"(c)  "+Assetname12[2],"Tk", Integer.toString(Assetcost12[2])},
                        {"(d)  "+Assetname12[3],"Tk", Integer.toString(Assetcost12[3])},
                         {" ", "Total=" ,""},};
                    //member
                    int Assetamount17 = 0;
                    String[] Assetname17 = new String[5];
                    int[] Assetcost17 = new int[5];
                    JSONObject jsonObjectAsset17 = new JSONObject(assetliabilityreturn[17]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset17 = jsonObjectAsset17.getJSONArray("member");
                    for (int i = 0; i < 2; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset17.get(i);
                        Assetcost17[i] = temp.getInt("number");
                        Assetname17[i] = temp.getString("name");
                        Assetamount17 = Assetamount17 + Assetcost17[i];
                    }

                    String[][] dataasset17 = {
                        {"Name", "Number"},
                        {Assetname17[0], Integer.toString(Assetcost17[0])},
                        {Assetname17[1], Integer.toString(Assetcost17[1])},
                        {" ", "Total=" + Integer.toString(Assetamount17)},};

                    //Source Of Fund
                    int Assetamount19 = 0;
                    String[] Assetname19 = new String[5];
                    int[] Assetshare19 = new int[5];
                    int[] Assetcost19 = new int[5];
                    JSONObject jsonObjectAsset19 = new JSONObject(assetliabilityreturn[19]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset19 = jsonObjectAsset19.getJSONArray("sourcefund");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset19.get(i);
                        Assetcost19[i] = temp.getInt("cost");
                        Assetname19[i] = temp.getString("name");
                        Assetamount19 = Assetamount19 + Assetcost19[i];
                    }

                    String[][] dataasset19 = {
                        {"Sources of Fund:","",""},
                        {"(i)  "+Assetname19[0],"Tk", Integer.toString(Assetcost19[0])},
                        {"(ii)  "+Assetname19[1],"Tk", Integer.toString(Assetcost19[1])},
                        {"(iii)  "+Assetname19[2],"Tk", Integer.toString(Assetcost19[2])},
                         {" ", "Total=" ,""},};
                  int BFSUM=0;
                    for (int i = 0; i < 11; i++) {
                        assetsumm = assetsumm + totalasset[i];
                        if(i==9)
                        {
                          BFSUM=assetsumm;  
                        }
                    }
                    int thisyearincome = assetsumm - Assetamount12;
                    int finaldiffer = Integer.parseInt(assetliabilityreturn[18]) - Assetamount19;
                    int toac=Integer.parseInt(assetliabilityreturn[15])+Integer.parseInt(assetliabilityreturn[16]);
                    String[][] dataAsset = {
                        {"1. (a)", "Business Capital(Closing balance)","Tk", assetliabilityreturn[1]},
                        {"    (b) ", "Directors Shareholding in Limited Companies(at cost)","Tk.", assetliabilityreturn[2]},
                        {"2  ", "Non-agricultural","Tk.", assetliabilityreturn[3]},
                        {"3  ","Agricultural","Tk.", assetliabilityreturn[4]},
                        {"4  ","Investement","Tk.", assetliabilityreturn[5]},
                        {"5  ","Motor","Tk.", assetliabilityreturn[6]},
                        {"6  ","Jewellery","Tk.", assetliabilityreturn[7]},
                        {"7  ","Furniture(at cost)","Tk.", assetliabilityreturn[8]},
                        {"8  ","Electric Equipment(at cost)","Tk.", assetliabilityreturn[9]},
                        {"9  ","Cash asset outside business:","Tk.", assetliabilityreturn[10]},
                        {"10  ","Any other assets","Tk.", assetliabilityreturn[11]},
                        {"11  ","Total Asset","Tk.", Integer.toString(assetsumm)},
                        {"12  ","Less Liability","Tk.", assetliabilityreturn[12]},
                        {"13  ","Net wealth this year","Tk.", Integer.toString(thisyearincome)},
                        {"14  ","Net wealth last year","Tk.", assetliabilityreturn[14]},
                        {"15  ","Accretion in wealth","Tk.", assetliabilityreturn[15]},
                        {"16  ","Family Expenditure","Tk.", assetliabilityreturn[16]},
                        {"17  ","Dependent member","Tk.", assetliabilityreturn[17]},
                        {"18  ","Total accretion of wealth ","Tk.", assetliabilityreturn[18]},
                        {"19  ","Source fund","Tk.", assetliabilityreturn[19]},
                        {"20  ","Difference","Tk.", Integer.toString(finaldiffer)}
                    }; 
                   
                        
                        // otherasset
                        lentgthnull=vlength.notnulllenth1(Assetname11)+2;
                        PdfPTable pdfPTableasset11 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset11 = new PdfPCell[lentgthnull+1][2];
                         float[] share11 = new float[]{25f,10f};
                      pdfPTableasset11.setWidths(share11);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(dataasset11[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(dataasset11[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPCellasset11[i][j].setCellEvent(simpleBottomLine);   
                                }
                                    pdfPCellasset11[i][j].disableBorderSide(1);
                                    pdfPCellasset11[i][j].disableBorderSide(2);
                                   pdfPCellasset11[i][j].disableBorderSide(4);
                                   pdfPCellasset11[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                 if(i>1 && i!=lentgthnull && j==1)
                                {
                                 pdfPTableasset11.addCell(pdfPCellasset11[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset11.addCell(pdfPCellasset11[i][j]); 
                                 }
                               
                            }
                        }
 
                        // lessliability
                        PdfPTable pdfPTableasset12 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset12 = new PdfPCell[23][3];
                        float[] share12 = new float[]{20f,4f,10f};
                      pdfPTableasset12.setWidths(share4);
                        for (int i = 0; i < dataasset12.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset12.length-1)
                                {
                                  pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset12.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j]+"/=",tat)); 
                                     pdfPCellasset12[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat)); 
                                }
                                 pdfPCellasset12[i][j].disableBorderSide(1);
                                    pdfPCellasset12[i][j].disableBorderSide(2);
                                   pdfPCellasset12[i][j].disableBorderSide(4);
                                   pdfPCellasset12[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset12.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i>0 &&i!=dataasset12.length-1 && j==2)
                                {
                                 pdfPTableasset12.addCell(pdfPCellasset12[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset12.addCell(pdfPCellasset12[i][j]); 
                                 }
                               
                            }
                        }

                        // member
                        PdfPTable pdfPTableasset17 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset17 = new PdfPCell[23][23];
                        for (int i = 0; i < dataasset17.length; i++) {
                            for (int j = 0; j < dataasset17[i].length; j++) {
                                pdfPCellasset17[i][j] = new PdfPCell(new Paragraph(dataasset17[i][j]));
                            }

                        }
                        for (int i = 0; i < dataasset17.length; i++) {
                            for (int j = 0; j < dataasset17[i].length; j++) {
                                pdfPTableasset17.addCell(pdfPCellasset17[i][j]);
                            }
                        }
                        //source of fund
                        
                          PdfPTable pdfPTableasset19 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset19 = new PdfPCell[23][3];
                        float[] share19 = new float[]{21f,5f,8f};
                      pdfPTableasset19.setWidths(share19);
                        for (int i = 0; i < dataasset19.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset19.length-1)
                                {
                                  pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset19.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j]+"/=",tat)); 
                                     pdfPCellasset19[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat)); 
                                }
                                 pdfPCellasset19[i][j].disableBorderSide(1);
                                    pdfPCellasset19[i][j].disableBorderSide(2);
                                   pdfPCellasset19[i][j].disableBorderSide(4);
                                   pdfPCellasset19[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset19.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i>0 &&i!=dataasset19.length-1 && j==2)
                                {
                                 pdfPTableasset19.addCell(pdfPCellasset19[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT); 
                                }
                                 else
                                 {
                                     pdfPTableasset19.addCell(pdfPCellasset19[i][j]); 
                                 }
                            }
                        }
                        
                         //BF
                         PdfPTable pdfPTableAsset11 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11 = new PdfPCell[23][4];
                        float[] columnWidth11 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11.setWidths(columnWidth11); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph(" "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph("                                                                                                                   B/F=",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph(Integer.toString(BFSUM)+"/=",tat));
                                        pdfPCellAsset11[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11[i][j].disableBorderSide(1);
                                   pdfPCellAsset11[i][j].disableBorderSide(2);
                                   pdfPCellAsset11[i][j].disableBorderSide(4);
                                   pdfPCellAsset11[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                  pdfPTableAsset11.addCell(pdfPCellAsset11[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11.addCell(pdfPCellAsset11[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11);
                        //anyother
                        PdfPTable pdfPTableAsset11any = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11any = new PdfPCell[23][4];
                        float[] columnWidth11any = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11any.setWidths(columnWidth11any); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph("10   "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(pdfPTableasset11); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount11)+"/=",tat));
                                        pdfPCellAsset11any[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11any[i][j].disableBorderSide(1);
                                   pdfPCellAsset11any[i][j].disableBorderSide(2);
                                   pdfPCellAsset11any[i][j].disableBorderSide(4);
                                   pdfPCellAsset11any[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               
                                 if(j==3)
                                {
                                  pdfPTableAsset11any.addCell(pdfPCellAsset11any[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11any.addCell(pdfPCellAsset11any[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11any);
                        //total
                         PdfPTable pdfPTableAsset1 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset1 = new PdfPCell[23][4];
                        float[] columnWidth1 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset1.setWidths(columnWidth1); 
                        for (int i = 10; i < 11; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==10)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph(" "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph( "                                                                                        Total Assets",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph("Tk",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph(assetsumm+"/=",tat));
                                        pdfPCellAsset1[i-10][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset1[i-10][j].disableBorderSide(1);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(2);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(4);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 10; i < 11; i++) {
                            for (int j = 0; j < 4; j++) {
                              
                                 if(j==3)
                                {
                                  pdfPTableAsset1.addCell(pdfPCellAsset1[i-10][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset1.addCell(pdfPCellAsset1[i-10][j]);   
                                }
                               
                            }
                        }
                       // document.add(new Paragraph(" "));
                       // document.add(new Paragraph(" "));
                       // document.add(pdfPTableAsset1);
                        // document.add(new Paragraph(" "));
                        //less liability
                        PdfPTable pdfPTableAsset11less = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less = new PdfPCell[23][4];
                        float[] columnWidth11less = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less.setWidths(columnWidth11less); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph("11   "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(pdfPTableasset12); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount12)+"/=",tat));
                                        pdfPCellAsset11less[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                 if(j==3)
                                {
                                  pdfPTableAsset11less.addCell(pdfPCellAsset11less[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less.addCell(pdfPCellAsset11less[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less);
                        // document.add(new Paragraph(" "));
                         //12
                        PdfPTable pdfPTableAsset11less12 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less12 = new PdfPCell[23][4];
                        float[] columnWidth11less12 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less12.setWidths(columnWidth11less12); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("12.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("Net wealth as on last date of this income year                                                                           (difference between total assets & total liabilities)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph(Integer.toString(thisyearincome)+"/=",tat));
                                        pdfPCellAsset11less12[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less12[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                 if(j==3)
                                {
                                  pdfPTableAsset11less12.addCell(pdfPCellAsset11less12[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less12.addCell(pdfPCellAsset11less12[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less12);
                       //  document.add(new Paragraph(" "));
                          //13
                        PdfPTable pdfPTableAsset11less13 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less13 = new PdfPCell[23][4];
                        float[] columnWidth11less13 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less13.setWidths(columnWidth11less13); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("13.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("Net wealth as on last date of previous income year",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[14]+"/=",tat));
                                        pdfPCellAsset11less13[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less13[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                 if(j==3)
                                {
                                  pdfPTableAsset11less13.addCell(pdfPCellAsset11less13[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less13.addCell(pdfPCellAsset11less13[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less13);
                        // document.add(new Paragraph(" "));
                         //14
                        PdfPTable pdfPTableAsset11less14 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less14 = new PdfPCell[23][4];
                        float[] columnWidth11less14 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less14.setWidths(columnWidth11less14); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("14.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("Accretion in wealth(difference between serial no. 12 & 13)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[15]+"/=",tat));
                                        pdfPCellAsset11less14[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less14[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                 if(j==3)
                                {
                                  pdfPTableAsset11less14.addCell(pdfPCellAsset11less14[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less14.addCell(pdfPCellAsset11less14[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less14);
                       //  document.add(new Paragraph(" "));
                          //15a
                        PdfPTable pdfPTableAsset11less15a = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less15a = new PdfPCell[23][4];
                        float[] columnWidth11less15a = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less15a.setWidths(columnWidth11less15a); 
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("15.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("(a) Family Expenditure:(Total expenditure as per From IT 10 BB)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[16]+"/=",tat));
                                        pdfPCellAsset11less15a[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(""));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("(b) Number of dependent children of the family",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("",tat));
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 4; j++) {
                                 if(j==3)
                                {
                                  pdfPTableAsset11less15a.addCell(pdfPCellAsset11less15a[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less15a.addCell(pdfPCellAsset11less15a[i][j]);   
                                }
                               
                            }
                        }
                        //document.add(pdfPTableAsset11less15a);
                        // document.add(new Paragraph(" "));
                         //15c
                        PdfPTable pdfPTableAsset11less15c = new PdfPTable(5);
                        PdfPCell[][] pdfPCellAsset11less15c = new PdfPCell[23][5];
                        float[] columnWidth11less15c = new float[]{4f,8f,6f,8f,16f};
                        pdfPTableAsset11less15c.setWidths(columnWidth11less15c); 
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 5; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" "));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetcost17[0]),tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetcost17[1]),tat));
                                       
                                        break;
                                       }
                                       case 4:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                             pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        break;
                                       }
                                   }
                                }
                                if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(""));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph("            Adult",tat)); 
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph("               Child",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        break;
                                       }
                                       case 4:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        
                                        break;
                                       }
                                       
                                   }
                                }
                                 
                                  

                            }

                        }
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 5; j++) {
                                if(i==0)
                                {
                                  pdfPTableAsset11less15c.addCell(pdfPCellAsset11less15c[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);  
                                }
                                else
                                {
                                  pdfPTableAsset11less15c.addCell(pdfPCellAsset11less15c[i][j]);  
                                }
                                
                            }
                        }
                       // document.add(pdfPTableAsset11less15c);
                       //  document.add(new Paragraph(" "));
                          //16
                        PdfPTable pdfPTableAsset11less16 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less16 = new PdfPCell[23][4];
                        float[] columnWidth11less16 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less16.setWidths(columnWidth11less16); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("16.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("Total  accretion of wealth(total of serial 14 & 15)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph(toac+"/=",tat));
                                        pdfPCellAsset11less16[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less16[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                  pdfPTableAsset11less16.addCell(pdfPCellAsset11less16[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less16.addCell(pdfPCellAsset11less16[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less16);
                        // document.add(new Paragraph(" "));
                          //19
                        PdfPTable pdfPTableAsset11less19 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less19 = new PdfPCell[23][4];
                        float[] columnWidth11less19 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less19.setWidths(columnWidth11less19); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph("17.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(pdfPTableasset19); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount19)+"/=",tat));
                                        pdfPCellAsset11less19[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less19[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                  pdfPTableAsset11less19.addCell(pdfPCellAsset11less19[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less19.addCell(pdfPCellAsset11less19[i][j]);   
                                }
                               
                            }
                        }
                       // document.add(pdfPTableAsset11less19);
                        // document.add(new Paragraph(" "));
                         //19
                        PdfPTable pdfPTableAsset11less20 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less20 = new PdfPCell[23][4];
                        float[] columnWidth11less20 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less20.setWidths(columnWidth11less20); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("18.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("Difference (between serial 16 & 17)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph(Integer.toString(toac-Assetamount19)+"/=",tat));
                                        pdfPCellAsset11less20[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less20[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==3)
                                {
                                  pdfPTableAsset11less20.addCell(pdfPCellAsset11less20[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);   
                                }
                                else
                                {
                                  pdfPTableAsset11less20.addCell(pdfPCellAsset11less20[i][j]);   
                                }
                               
                            }
                        }
                        
                         PdfPTable pdfPTableAsset20 = new PdfPTable(1);
                        PdfPCell[][] pdfPTableAsset202 = new PdfPCell[26][1];
                        
                        for (int i = 0; i < 25; i++) {
                            for (int j = 0; j < 1; j++) {
                                
                                if(i==0)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11); 
                                }
                                 
                                 if(i==1)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11any); 
                                }
                                  if(i==2 || i==3)
                                {
                                     pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                   if( i==4)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset1); 
                                }
                                    if( i==5)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                  if( i==6)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less); 
                                }
                                    if( i==7)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                  if( i==8)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less12); 
                                }
                                    if( i==9)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                  if( i==10)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less13); 
                                }
                                    if( i==11)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                  if( i==12)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less14); 
                                }
                                    if( i==13)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }

                                 if( i==14)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less15a); 
                                }
                                    if( i==15)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                if( i==16)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less15c); 
                                }
                                    if( i==17)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }

                                if( i==18)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less16); 
                                }
                                    if( i==19)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }

                                if( i==20)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less19); 
                                }
                                    if( i==21)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }
                                    if( i==22)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(pdfPTableAsset11less20); 
                                }
                                    if( i==23 || i==24)
                                {
                                   pdfPTableAsset202[i][j] = new PdfPCell(new Paragraph(" ")); 
                                }

                                 pdfPTableAsset202[i][j].disableBorderSide(1);
                                  pdfPTableAsset202[i][j].disableBorderSide(2);
                                  pdfPTableAsset202[i][j].disableBorderSide(4);
                                   pdfPTableAsset202[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 25; i++) {
                            for (int j = 0; j < 1; j++) {
                                pdfPTableAsset20.addCell(pdfPTableAsset202[i][j]);
                            }
                        }
                        pdfPTableAsset20.setWidthPercentage(95);
                       return pdfPTableAsset20; 
}
public PdfPTable assetheader() throws DocumentException
{
    PdfPTable body4ss = new PdfPTable(4);
                    PdfPCell[][] body41ss = new PdfPCell[4][4];
                     float[] columnWidths4ss = new float[]{20f, 5f,15f,2f};
                     Font aa2au = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4ss.setWidths(columnWidths4ss);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41ss[i][j] = new PdfPCell(new Paragraph("Statement of assets and liabilities:",aa2au)); 
                                   body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41ss[i][j] = new PdfPCell(new Paragraph("(as on" )); 
                                   body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                   
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41ss[i][j] = new PdfPCell(new Paragraph("30 June "+registrationreturn[7],aa2au)); 
                                     body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                    body41ss[i][j].setCellEvent(simpleBottomLine);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41ss[i][j]= new PdfPCell(new Paragraph(")"));
                                  body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4ss.addCell(body41ss[i][j]);
                            }
                        }
                         return( body4ss);  
}
public PdfPTable assetbottom() throws DocumentException
{
     PdfPTable pdfPTableAsset11less20d = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less2d = new PdfPCell[23][4];
                        float[] columnWidth11less20d = new float[]{27f,3,10f,6f};
                        pdfPTableAsset11less20d.setWidths(columnWidth11less20d); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                            pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("Date",tat));
                                        
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("" + cyear.getDayOfMonth() + "-" + cyear.getMonth() + "-" + cyear.getYear() + "",tat));
                                        pdfPCellAsset11less2d[i][j].setCellEvent(simpleBottomLine);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph(" ",tat)); 
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less20d.addCell(pdfPCellAsset11less2d[i][j]);
                            }
                        }
                        return pdfPTableAsset11less20d;
}
public PdfPTable formheader() throws DocumentException
{
     PdfPTable pdfPTabletaxcountass2vF = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF = new float[]{20f,25f};
                         
                           Font aa2vF = new Font(Font.FontFamily.HELVETICA,12f, Font.BOLD );
                    pdfPTabletaxcountass2vF.setWidths(columnWidthsassesseass122vF);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF[i][j] = new PdfPCell(new Paragraph("FORM",aa2v)); 
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF.addCell(pdfPCelltaxcountass12vF[i][j]);
                            }
                        }
                        return(pdfPTabletaxcountass2vF);
}
public PdfPTable forminfo(long text,int ayear) throws DocumentException, ClassNotFoundException, SQLException, JSONException
{
                     //family expense
                    familyexpense = conn.FamilyExpense(text,ayear);
                    int sumexpense = 0;
                    int[] firstexpense = new int[familyexpense.length];
                    String[] secondexpense = new String[familyexpense.length];
                    for (int i = 1; i < 14; i++) {
                        JSONObject json2 = new JSONObject(familyexpense[i]);
                        firstexpense[i] = Integer.parseInt(json2.getString("amount"));
                        secondexpense[i] = (json2.getString("comment"));
                        sumexpense = sumexpense + firstexpense[i];

                    }

                    String[][] datafamilyexpense = {
                        {"Serial No","Particulars Of Expenditure", "Amount Of Taka", "Comments"},
                        {"1","Personal and fooding expenses", Integer.toString(firstexpense[1]), secondexpense[1]},
                        {"2","Tax paid including deduction at source of the last financial year", Integer.toString(firstexpense[2]), secondexpense[2]},
                        {"3","Accomodation expenses", Integer.toString(firstexpense[3]), secondexpense[3]},
                        {"4","Transport expenses", Integer.toString(firstexpense[4]), secondexpense[4]},
                        {"5","Electric bill for residence", Integer.toString(firstexpense[5]), secondexpense[5]},
                        {"6","Wasa bill for residence", Integer.toString(firstexpense[6]), secondexpense[6]},
                        {"7","Gas bill for residence", Integer.toString(firstexpense[7]), secondexpense[7]},
                        {"8","Telephone bill for residence", Integer.toString(firstexpense[8]), secondexpense[8]},
                        {"9","Education expense for chirldren", Integer.toString(firstexpense[9]), secondexpense[9]},
                        {"10","Bank loan installment", Integer.toString(firstexpense[10]), secondexpense[10]},
                        {"11","Festival other expense", Integer.toString(firstexpense[11]), secondexpense[11]},
                        {"12","Medical purposes", Integer.toString(firstexpense[12]), secondexpense[12]},
                        {" ","Total expenses", Integer.toString(sumexpense), secondexpense[13]},};

    //datafamilyexpense
                         PdfPTable pdfPTableAsset11less20df = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less2df = new PdfPCell[23][4];
                        float[] columnWidth11less20df = new float[]{3f,27,6f,6f};
                        pdfPTableAsset11less20df.setWidths(columnWidth11less20df); 
                        for (int i = 0; i < 14; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                 
                                if(j==2)
                                {
                                  pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j]+"/=",tat));  
                                }
                                else if(j==3)
                                {
                                  if(datafamilyexpense[i][j].matches("null"))
                                  {
                                    pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(" "));    
                                  }
                                  else
                                  {
                                    pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j],tat));    
                                  }
                                }
                                else
                                {
                                   pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j],tat));    
                                }

                            }

                        }
                        for (int i = 0; i < 14; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==2)
                                {
                                   pdfPTableAsset11less20df.addCell(pdfPCellAsset11less2df[i][j]).setHorizontalAlignment(Element.ALIGN_RIGHT);  
                                }
                                else
                                {
                                   pdfPTableAsset11less20df.addCell(pdfPCellAsset11less2df[i][j]);  
                                }
                               
                            }
                        }
                         return(pdfPTableAsset11less20df);
}
public PdfPTable formbottom2(long text,int ayear) throws DocumentException
{
   PdfPTable body4sf = new PdfPTable(4);
                    PdfPCell[][] body41sf = new PdfPCell[4][4];
                     float[] columnWidths4sf = new float[]{10f, 17f,10f,10f};
                     Font aa2auf = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sf.setWidths(columnWidths4sf);
                   text = ch.textfieldcheck(registrationreturn[7]);
                        long text1 = text + 1;
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sf[i][j] = new PdfPCell(new Paragraph("Name of The Assessee:",aa2auf)); 
                                   body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sf[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley)); 
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                    body41sf[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sf[i][j] = new PdfPCell(new Paragraph("Assessment Year:",tat)); 
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sf[i][j]= new PdfPCell(new Paragraph("" + text + "-" +Long.toString(text1).substring(2, 4)  + " ",tat));
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                    body41sf[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sf.addCell(body41sf[i][j]);
                            }
                        }
                         body4sf.setWidthPercentage(95);
                        return(body4sf); 
}
public PdfPTable formbottom3(long text,int ayear) throws DocumentException
{
     PdfPTable body4subs = new PdfPTable(12);
                    PdfPCell[][] body41subs = new PdfPCell[12][12];
                     float[] columnWidths4subs = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body4subs.setWidths(columnWidths4subs);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body41subs[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[4].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body4subs.addCell(body41subs[i][j]);
                            }
                        }
                        
     PdfPTable body4sff = new PdfPTable(6);
                    PdfPCell[][] body41sff = new PdfPCell[4][6];
                     float[] columnWidths4sff = new float[]{7f, 24f,4f,8f,8f,6f};
                     Font aa2auff = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sff.setWidths(columnWidths4sff);
                   
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sff[i][j] = new PdfPCell(new Paragraph("UTIN/TIN:",tat)); 
                                   body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                      body41sff[i][j]= new PdfPCell(body4subs);
                                  // body41sff[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sff[i][j] = new PdfPCell(new Paragraph("Circle:",tat)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sff[i][j]= new PdfPCell(new Paragraph("" + registrationreturn[5] + "(Salary)",tat));
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    body41sff[i][j].setCellEvent(simpleBottomLine);
                                    
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                                 if(j==4)
                                {
                                    
                                     body41sff[i][j] = new PdfPCell(new Paragraph("Taxes Zone:",tat)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==5)
                                {
                                   
                                   body41sff[i][j]= new PdfPCell(new Paragraph("" + registrationreturn[6] + "",tat));
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    body41sff[i][j].setCellEvent(simpleBottomLine);
                                    
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body4sff.addCell(body41sff[i][j]);
                            }
                        }
                        body4sff.setWidthPercentage(95);
                        return(body4sff);
}
public PdfPTable instructionheader() throws DocumentException
{
     PdfPTable pdfPTabletaxcountass2vFl = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vFl = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vFl = new float[]{10f,25f};
                         
                           Font aa2vFl = new Font(Font.FontFamily.HELVETICA,12f, Font.BOLD );
                    pdfPTabletaxcountass2vFl.setWidths(columnWidthsassesseass122vFl);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vFl[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vFl[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vFl[i][j] = new PdfPCell(new Paragraph("Instructions to fill up the Return Form",aa2v)); 
                                  pdfPCelltaxcountass12vFl[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vFl[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vFl.addCell(pdfPCelltaxcountass12vFl[i][j]);
                            }
                        }
                        return pdfPTabletaxcountass2vFl;
}
public PdfPTable instructionbottom1(long text,int ayear) throws DocumentException, JSONException, ClassNotFoundException, SQLException
{
    
    //Assetliability
                    assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
                  

                    totalasset[0] = Integer.parseInt(assetliabilityreturn[1]);
                    //shareholding
                    int Assetamount2 = 0;
                    String[] Assetname2 = new String[5];
                    int[] Assetshare2 = new int[5];
                    int[] Assetcost2 = new int[5];
                    JSONObject jsonObjectAsset2 = new JSONObject(assetliabilityreturn[2]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset2 = jsonObjectAsset2.getJSONArray("shareholding");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset2.get(i);
                        Assetshare2[i] = temp.getInt("share");
                        Assetcost2[i] = temp.getInt("cost");
                        Assetname2[i] = temp.getString("name");
                        Assetamount2 = Assetamount2 + Assetcost2[i];
                    }
                    totalasset[1] = Assetamount2;
                    String[][] dataasset2 = {
                        {"Directors Shareholding in Limited Companies (at cost)",""},
                        {"Name of Companies","Number of shares"},
                        {Assetname2[0], Integer.toString(Assetshare2[0]) },
                        {Assetname2[1], Integer.toString(Assetshare2[1]) },
                        {Assetname2[2], Integer.toString(Assetshare2[2])},
                        {Assetname2[3], Integer.toString(Assetshare2[3])},
                        {Assetname2[4], Integer.toString(Assetshare2[4])},
                        {" ", " ", "Total=" + Integer.toString(Assetamount2)},};
                    //nonagricultural
                    int Assetamount3 = 0;
                    String[] Assetname3 = new String[5];
                    int[] Assetshare3 = new int[5];
                    int[] Assetcost3 = new int[5];
                    JSONObject jsonObjectAsset3 = new JSONObject(assetliabilityreturn[3]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset3 = jsonObjectAsset3.getJSONArray("nonagricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset3.get(i);
                        Assetcost3[i] = temp.getInt("cost");
                        Assetname3[i] = temp.getString("name");
                        Assetamount3 = Assetamount3 + Assetcost3[i];
                    }
                    totalasset[2] = Assetamount3;
                    String[][] dataasset3 = {
                          {"Non-Agricultural Property (at cost with legal expenses)"," "},
                        {"Land/House property(Description & location of property)"," "},
                        {Assetname3[0], Integer.toString(Assetcost3[0])},
                        {Assetname3[1], Integer.toString(Assetcost3[1])},
                        {Assetname3[2], Integer.toString(Assetcost3[2])},
                        {Assetname3[3], Integer.toString(Assetcost3[3])},
                        {Assetname3[4], Integer.toString(Assetcost3[4])},
                        {" ", "Total=" + Integer.toString(Assetamount3)},};
                    //agricultural
                    int Assetamount4 = 0;
                    String[] Assetname4 = new String[5];
                    int[] Assetshare4 = new int[5];
                    int[] Assetcost4 = new int[5];
                    JSONObject jsonObjectAsset4 = new JSONObject(assetliabilityreturn[4]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset4 = jsonObjectAsset4.getJSONArray("agricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset4.get(i);
                        Assetcost4[i] = temp.getInt("cost");
                        Assetname4[i] = temp.getString("name");
                        Assetamount4 = Assetamount4 + Assetcost4[i];
                    }
                    totalasset[3] = Assetamount4;

                    String[][] dataasset4 = {
                         {"Agricultural Property (at cost with legal expenses)"," "},
                        {"Land (Total land and location of land property))"," "},
                        {Assetname4[0], Integer.toString(Assetcost4[0])},
                        {Assetname4[1], Integer.toString(Assetcost4[1])},
                        {Assetname4[2], Integer.toString(Assetcost4[2])},
                        {Assetname4[3], Integer.toString(Assetcost4[3])},
                        {Assetname4[4], Integer.toString(Assetcost4[4])},
                        {" ", "Total=" + Integer.toString(Assetamount4)},};

                    //Investment
                    int Assetamount5 = 0;
                    String[] Assetname5 = new String[6];
                    int[] Assetshare5 = new int[6];
                    int[] Assetcost5 = new int[6];
                    JSONObject jsonObjectAsset5 = new JSONObject(assetliabilityreturn[5]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset5 = jsonObjectAsset5.getJSONArray("investment");
                    for (int i = 0; i < 6; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset5.get(i);
                        Assetcost5[i] = temp.getInt("cost");
                        Assetname5[i] = temp.getString("name");
                        Assetamount5 = Assetamount5 + Assetcost5[i];
                    }
                    totalasset[4] = Assetamount5;
                    String[][] dataasset5 = {
                        {"Investments:","",""},
                        {"(a)  "+Assetname5[0],"Tk", Integer.toString(Assetcost5[0])},
                        {"(b)  "+Assetname5[1],"Tk", Integer.toString(Assetcost5[1])},
                        {"(c)  "+Assetname5[2], "Tk",Integer.toString(Assetcost5[2])},
                        {"(d)  "+Assetname5[3],"Tk", Integer.toString(Assetcost5[3])},
                        {"(e)  "+Assetname5[4],"Tk", Integer.toString(Assetcost5[4])},
                        {"(f)  "+Assetname5[5],"Tk", Integer.toString(Assetcost5[5])},
                        {" ", " " ,"Total="},};

                    //motor
                    int Assetamount6 = 0;
                    String[] Assetname6 = new String[5];
                    int[] Assetshare6 = new int[5];
                    int[] Assetcost6 = new int[5];
                    JSONObject jsonObjectAsset6 = new JSONObject(assetliabilityreturn[6]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset6 = jsonObjectAsset6.getJSONArray("motor");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset6.get(i);
                        Assetcost6[i] = temp.getInt("cost");
                        Assetname6[i] = temp.getString("name");
                        Assetamount6 = Assetamount6 + Assetcost6[i];
                    }
                    totalasset[5] = Assetamount6;
                    String[][] dataasset6 = {
                        {"Motor Vehicles(at cost)"," "},
                        {"Type of motor vehicle and Registration number", " "},
                        {Assetname6[0], Integer.toString(Assetcost6[0])},
                        {Assetname6[1], Integer.toString(Assetcost6[1])},
                        {Assetname6[2], Integer.toString(Assetcost6[2])},
                        {Assetname6[3], Integer.toString(Assetcost6[3])},
                        {Assetname6[4], Integer.toString(Assetcost6[4])},
                        {" ", "Total=" + Integer.toString(Assetamount6)},};
                    //JWELLERY
                    int Assetamount7 = 0;
                    String[] Assetname7 = new String[5];
                    int[] Assetshare7 = new int[5];
                    int[] Assetcost7 = new int[5];
                    JSONObject jsonObjectAsset7 = new JSONObject(assetliabilityreturn[7]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset7 = jsonObjectAsset7.getJSONArray("jwellery");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset7.get(i);
                        Assetcost7[i] = temp.getInt("cost");
                        Assetname7[i] = temp.getString("name");
                        Assetamount7 = Assetamount7 + Assetcost7[i];
                    }
                    totalasset[6] = Assetamount7;
                    totalasset[7] = Integer.parseInt(assetliabilityreturn[8]);
                    totalasset[8] = Integer.parseInt(assetliabilityreturn[9]);
                    String[][] dataasset7 = {
                         {"Jewellery(quantity and cost)"," "},
                        {"300 gram Gold", " "},
                        {Assetname7[0], Integer.toString(Assetcost7[0])},
                        {Assetname7[1], Integer.toString(Assetcost7[1])},
                        {Assetname7[2], Integer.toString(Assetcost7[2])},
                        {Assetname7[3], Integer.toString(Assetcost7[3])},
                        {Assetname7[4], Integer.toString(Assetcost7[4])},
                        {" ", "Total=" + Integer.toString(Assetamount7)},};

                    //cashasset
                    int Assetamount10 = 0;
                    String[] Assetname10 = new String[5];
                    int[] Assetshare10 = new int[5];
                    int[] Assetcost10 = new int[5];
                    JSONObject jsonObjectAsset10 = new JSONObject(assetliabilityreturn[10]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset10 = jsonObjectAsset10.getJSONArray("cashasset");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset10.get(i);
                        Assetcost10[i] = temp.getInt("cost");
                        Assetname10[i] = temp.getString("name");
                        Assetamount10 = Assetamount10 + Assetcost10[i];
                    }
                    totalasset[9] = Assetamount10;
                    String[][] dataasset10 = {
                        { "Cash Asset Outside Business:",""," "},
                         {"(a)  "+Assetname10[0],"Tk", Integer.toString(Assetcost10[0])},
                        {"(b)  "+Assetname10[1],"Tk", Integer.toString(Assetcost10[1])},
                        {"(c)   Other deposits((Paid the Interest of Mortgages))", "Tk",Integer.toString(Assetcost10[2])},
                       {" ", " " ,"Total="},};

                    //otherasset
                    int Assetamount11 = 0;
                    String[] Assetname11 = new String[5];
                    int[] Assetshare11 = new int[5];
                    int[] Assetcost11 = new int[5];
                    JSONObject jsonObjectAsset11 = new JSONObject(assetliabilityreturn[11]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset11 = jsonObjectAsset11.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset11.get(i);
                        Assetcost11[i] = temp.getInt("cost");
                        Assetname11[i] = temp.getString("name");
                        Assetamount11 = Assetamount11 + Assetcost11[i];
                    }
                    totalasset[10] = Assetamount11;
                    String[][] dataasset11 = {
                        { "Any other assets:"," "," "},
                         { "Give details"," "," "},
                        {"(a)  "+Assetname11[0],"Tk", Integer.toString(Assetcost11[0])},
                        {"(b)  "+Assetname11[1],"Tk", Integer.toString(Assetcost11[1])},
                        {"(c)  "+Assetname11[2],"Tk", Integer.toString(Assetcost11[2])},
                        {"(d)  "+Assetname11[3],"Tk", Integer.toString(Assetcost11[3])},
                        {"(e)  "+Assetname11[4],"Tk", Integer.toString(Assetcost11[4])},
                        {" ", "Total=" ,""},
                    };

                    //lessliability
                    int Assetamount12 = 0;
                    String[] Assetname12 = new String[5];
                    int[] Assetshare12 = new int[5];
                    int[] Assetcost12 = new int[5];
                    JSONObject jsonObjectAsset12 = new JSONObject(assetliabilityreturn[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset12 = jsonObjectAsset12.getJSONArray("lessliability");
                    for (int i = 0; i < 4; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset12.get(i);
                        Assetcost12[i] = temp.getInt("cost");
                        Assetname12[i] = temp.getString("name");
                        Assetamount12 = Assetamount12 + Assetcost12[i];
                    }

                    String[][] dataasset12 = {
                        {"Less Liabilities:","",""},
                        {"(a)  "+Assetname12[0],"Tk", Integer.toString(Assetcost12[0])},
                        {"(b)  "+Assetname12[1],"Tk", Integer.toString(Assetcost12[1])},
                        {"(c)  "+Assetname12[2],"Tk", Integer.toString(Assetcost12[2])},
                        {"(d)  "+Assetname12[3],"Tk", Integer.toString(Assetcost12[3])},
                         {" ", "Total=" ,""},};
                    //member
                    int Assetamount17 = 0;
                    String[] Assetname17 = new String[5];
                    int[] Assetcost17 = new int[5];
                    JSONObject jsonObjectAsset17 = new JSONObject(assetliabilityreturn[17]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset17 = jsonObjectAsset17.getJSONArray("member");
                    for (int i = 0; i < 2; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset17.get(i);
                        Assetcost17[i] = temp.getInt("number");
                        Assetname17[i] = temp.getString("name");
                        Assetamount17 = Assetamount17 + Assetcost17[i];
                    }

                    String[][] dataasset17 = {
                        {"Name", "Number"},
                        {Assetname17[0], Integer.toString(Assetcost17[0])},
                        {Assetname17[1], Integer.toString(Assetcost17[1])},
                        {" ", "Total=" + Integer.toString(Assetamount17)},};

                    //Source Of Fund
                    int Assetamount19 = 0;
                    String[] Assetname19 = new String[5];
                    int[] Assetshare19 = new int[5];
                    int[] Assetcost19 = new int[5];
                    JSONObject jsonObjectAsset19 = new JSONObject(assetliabilityreturn[19]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset19 = jsonObjectAsset19.getJSONArray("sourcefund");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset19.get(i);
                        Assetcost19[i] = temp.getInt("cost");
                        Assetname19[i] = temp.getString("name");
                        Assetamount19 = Assetamount19 + Assetcost19[i];
                    }

                    String[][] dataasset19 = {
                        {"Sources of Fund:","",""},
                        {"(i)  "+Assetname19[0],"Tk", Integer.toString(Assetcost19[0])},
                        {"(ii)  "+Assetname19[1],"Tk", Integer.toString(Assetcost19[1])},
                        {"(iii)  "+Assetname19[2],"Tk", Integer.toString(Assetcost19[2])},
                         {" ", "Total=" ,""},};
                  int BFSUM=0;
                    for (int i = 0; i < 11; i++) {
                        assetsumm = assetsumm + totalasset[i];
                        if(i==9)
                        {
                          BFSUM=assetsumm;  
                        }
                    }
                    int thisyearincome = assetsumm - Assetamount12;
                    int finaldiffer = Integer.parseInt(assetliabilityreturn[18]) - Assetamount19;
                    int toac=Integer.parseInt(assetliabilityreturn[15])+Integer.parseInt(assetliabilityreturn[16]);
    PdfPTable body4sft = new PdfPTable(4);
                    PdfPCell[][] body41sft = new PdfPCell[4][4];
                     float[] columnWidths4sft = new float[]{17f, 10f,10f,8f};
                     Font aa2auft = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sft.setWidths(columnWidths4sft);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sft[i][j] = new PdfPCell(new Paragraph("Total income shown in Return:   Tk.",tat)); 
                                   body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sft[i][j] = new PdfPCell(new Paragraph(assetsumm+"/=",tat)); 
                                   body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                    body41sft[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sft[i][j] = new PdfPCell(new Paragraph("           Tax Paid:     Tk.",tat)); 
                                  body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sft[i][j]= new PdfPCell(new Paragraph(""+paymentsum+"",tat));
                                    body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                    body41sft[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sft.addCell(body41sft[i][j]);
                            }
                        }
                       
                        return(body4sft); 
}
public PdfPTable instructionbottom2(long text,int ayear) throws DocumentException, JSONException, ClassNotFoundException, SQLException
{
    
                    assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
                  

                    totalasset[0] = Integer.parseInt(assetliabilityreturn[1]);
                    //shareholding
                    int Assetamount2 = 0;
                    String[] Assetname2 = new String[5];
                    int[] Assetshare2 = new int[5];
                    int[] Assetcost2 = new int[5];
                    JSONObject jsonObjectAsset2 = new JSONObject(assetliabilityreturn[2]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset2 = jsonObjectAsset2.getJSONArray("shareholding");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset2.get(i);
                        Assetshare2[i] = temp.getInt("share");
                        Assetcost2[i] = temp.getInt("cost");
                        Assetname2[i] = temp.getString("name");
                        Assetamount2 = Assetamount2 + Assetcost2[i];
                    }
                    totalasset[1] = Assetamount2;
                    String[][] dataasset2 = {
                        {"Directors Shareholding in Limited Companies (at cost)",""},
                        {"Name of Companies","Number of shares"},
                        {Assetname2[0], Integer.toString(Assetshare2[0]) },
                        {Assetname2[1], Integer.toString(Assetshare2[1]) },
                        {Assetname2[2], Integer.toString(Assetshare2[2])},
                        {Assetname2[3], Integer.toString(Assetshare2[3])},
                        {Assetname2[4], Integer.toString(Assetshare2[4])},
                        {" ", " ", "Total=" + Integer.toString(Assetamount2)},};
                    //nonagricultural
                    int Assetamount3 = 0;
                    String[] Assetname3 = new String[5];
                    int[] Assetshare3 = new int[5];
                    int[] Assetcost3 = new int[5];
                    JSONObject jsonObjectAsset3 = new JSONObject(assetliabilityreturn[3]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset3 = jsonObjectAsset3.getJSONArray("nonagricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset3.get(i);
                        Assetcost3[i] = temp.getInt("cost");
                        Assetname3[i] = temp.getString("name");
                        Assetamount3 = Assetamount3 + Assetcost3[i];
                    }
                    totalasset[2] = Assetamount3;
                    String[][] dataasset3 = {
                          {"Non-Agricultural Property (at cost with legal expenses)"," "},
                        {"Land/House property(Description & location of property)"," "},
                        {Assetname3[0], Integer.toString(Assetcost3[0])},
                        {Assetname3[1], Integer.toString(Assetcost3[1])},
                        {Assetname3[2], Integer.toString(Assetcost3[2])},
                        {Assetname3[3], Integer.toString(Assetcost3[3])},
                        {Assetname3[4], Integer.toString(Assetcost3[4])},
                        {" ", "Total=" + Integer.toString(Assetamount3)},};
                    //agricultural
                    int Assetamount4 = 0;
                    String[] Assetname4 = new String[5];
                    int[] Assetshare4 = new int[5];
                    int[] Assetcost4 = new int[5];
                    JSONObject jsonObjectAsset4 = new JSONObject(assetliabilityreturn[4]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset4 = jsonObjectAsset4.getJSONArray("agricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset4.get(i);
                        Assetcost4[i] = temp.getInt("cost");
                        Assetname4[i] = temp.getString("name");
                        Assetamount4 = Assetamount4 + Assetcost4[i];
                    }
                    totalasset[3] = Assetamount4;

                    String[][] dataasset4 = {
                         {"Agricultural Property (at cost with legal expenses)"," "},
                        {"Land (Total land and location of land property))"," "},
                        {Assetname4[0], Integer.toString(Assetcost4[0])},
                        {Assetname4[1], Integer.toString(Assetcost4[1])},
                        {Assetname4[2], Integer.toString(Assetcost4[2])},
                        {Assetname4[3], Integer.toString(Assetcost4[3])},
                        {Assetname4[4], Integer.toString(Assetcost4[4])},
                        {" ", "Total=" + Integer.toString(Assetamount4)},};

                    //Investment
                    int Assetamount5 = 0;
                    String[] Assetname5 = new String[6];
                    int[] Assetshare5 = new int[6];
                    int[] Assetcost5 = new int[6];
                    JSONObject jsonObjectAsset5 = new JSONObject(assetliabilityreturn[5]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset5 = jsonObjectAsset5.getJSONArray("investment");
                    for (int i = 0; i < 6; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset5.get(i);
                        Assetcost5[i] = temp.getInt("cost");
                        Assetname5[i] = temp.getString("name");
                        Assetamount5 = Assetamount5 + Assetcost5[i];
                    }
                    totalasset[4] = Assetamount5;
                    String[][] dataasset5 = {
                        {"Investments:","",""},
                        {"(a)  "+Assetname5[0],"Tk", Integer.toString(Assetcost5[0])},
                        {"(b)  "+Assetname5[1],"Tk", Integer.toString(Assetcost5[1])},
                        {"(c)  "+Assetname5[2], "Tk",Integer.toString(Assetcost5[2])},
                        {"(d)  "+Assetname5[3],"Tk", Integer.toString(Assetcost5[3])},
                        {"(e)  "+Assetname5[4],"Tk", Integer.toString(Assetcost5[4])},
                        {"(f)  "+Assetname5[5],"Tk", Integer.toString(Assetcost5[5])},
                        {" ", " " ,"Total="},};

                    //motor
                    int Assetamount6 = 0;
                    String[] Assetname6 = new String[5];
                    int[] Assetshare6 = new int[5];
                    int[] Assetcost6 = new int[5];
                    JSONObject jsonObjectAsset6 = new JSONObject(assetliabilityreturn[6]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset6 = jsonObjectAsset6.getJSONArray("motor");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset6.get(i);
                        Assetcost6[i] = temp.getInt("cost");
                        Assetname6[i] = temp.getString("name");
                        Assetamount6 = Assetamount6 + Assetcost6[i];
                    }
                    totalasset[5] = Assetamount6;
                    String[][] dataasset6 = {
                        {"Motor Vehicles(at cost)"," "},
                        {"Type of motor vehicle and Registration number", " "},
                        {Assetname6[0], Integer.toString(Assetcost6[0])},
                        {Assetname6[1], Integer.toString(Assetcost6[1])},
                        {Assetname6[2], Integer.toString(Assetcost6[2])},
                        {Assetname6[3], Integer.toString(Assetcost6[3])},
                        {Assetname6[4], Integer.toString(Assetcost6[4])},
                        {" ", "Total=" + Integer.toString(Assetamount6)},};
                    //JWELLERY
                    int Assetamount7 = 0;
                    String[] Assetname7 = new String[5];
                    int[] Assetshare7 = new int[5];
                    int[] Assetcost7 = new int[5];
                    JSONObject jsonObjectAsset7 = new JSONObject(assetliabilityreturn[7]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset7 = jsonObjectAsset7.getJSONArray("jwellery");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset7.get(i);
                        Assetcost7[i] = temp.getInt("cost");
                        Assetname7[i] = temp.getString("name");
                        Assetamount7 = Assetamount7 + Assetcost7[i];
                    }
                    totalasset[6] = Assetamount7;
                    totalasset[7] = Integer.parseInt(assetliabilityreturn[8]);
                    totalasset[8] = Integer.parseInt(assetliabilityreturn[9]);
                    String[][] dataasset7 = {
                         {"Jewellery(quantity and cost)"," "},
                        {"300 gram Gold", " "},
                        {Assetname7[0], Integer.toString(Assetcost7[0])},
                        {Assetname7[1], Integer.toString(Assetcost7[1])},
                        {Assetname7[2], Integer.toString(Assetcost7[2])},
                        {Assetname7[3], Integer.toString(Assetcost7[3])},
                        {Assetname7[4], Integer.toString(Assetcost7[4])},
                        {" ", "Total=" + Integer.toString(Assetamount7)},};

                    //cashasset
                    int Assetamount10 = 0;
                    String[] Assetname10 = new String[5];
                    int[] Assetshare10 = new int[5];
                    int[] Assetcost10 = new int[5];
                    JSONObject jsonObjectAsset10 = new JSONObject(assetliabilityreturn[10]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset10 = jsonObjectAsset10.getJSONArray("cashasset");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset10.get(i);
                        Assetcost10[i] = temp.getInt("cost");
                        Assetname10[i] = temp.getString("name");
                        Assetamount10 = Assetamount10 + Assetcost10[i];
                    }
                    totalasset[9] = Assetamount10;
                    String[][] dataasset10 = {
                        { "Cash Asset Outside Business:",""," "},
                         {"(a)  "+Assetname10[0],"Tk", Integer.toString(Assetcost10[0])},
                        {"(b)  "+Assetname10[1],"Tk", Integer.toString(Assetcost10[1])},
                        {"(c)   Other deposits((Paid the Interest of Mortgages))", "Tk",Integer.toString(Assetcost10[2])},
                       {" ", " " ,"Total="},};

                    //otherasset
                    int Assetamount11 = 0;
                    String[] Assetname11 = new String[5];
                    int[] Assetshare11 = new int[5];
                    int[] Assetcost11 = new int[5];
                    JSONObject jsonObjectAsset11 = new JSONObject(assetliabilityreturn[11]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset11 = jsonObjectAsset11.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset11.get(i);
                        Assetcost11[i] = temp.getInt("cost");
                        Assetname11[i] = temp.getString("name");
                        Assetamount11 = Assetamount11 + Assetcost11[i];
                    }
                    totalasset[10] = Assetamount11;
                    String[][] dataasset11 = {
                        { "Any other assets:"," "," "},
                         { "Give details"," "," "},
                        {"(a)  "+Assetname11[0],"Tk", Integer.toString(Assetcost11[0])},
                        {"(b)  "+Assetname11[1],"Tk", Integer.toString(Assetcost11[1])},
                        {"(c)  "+Assetname11[2],"Tk", Integer.toString(Assetcost11[2])},
                        {"(d)  "+Assetname11[3],"Tk", Integer.toString(Assetcost11[3])},
                        {"(e)  "+Assetname11[4],"Tk", Integer.toString(Assetcost11[4])},
                        {" ", "Total=" ,""},
                    };

                    //lessliability
                    int Assetamount12 = 0;
                    String[] Assetname12 = new String[5];
                    int[] Assetshare12 = new int[5];
                    int[] Assetcost12 = new int[5];
                    JSONObject jsonObjectAsset12 = new JSONObject(assetliabilityreturn[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset12 = jsonObjectAsset12.getJSONArray("lessliability");
                    for (int i = 0; i < 4; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset12.get(i);
                        Assetcost12[i] = temp.getInt("cost");
                        Assetname12[i] = temp.getString("name");
                        Assetamount12 = Assetamount12 + Assetcost12[i];
                    }

                    String[][] dataasset12 = {
                        {"Less Liabilities:","",""},
                        {"(a)  "+Assetname12[0],"Tk", Integer.toString(Assetcost12[0])},
                        {"(b)  "+Assetname12[1],"Tk", Integer.toString(Assetcost12[1])},
                        {"(c)  "+Assetname12[2],"Tk", Integer.toString(Assetcost12[2])},
                        {"(d)  "+Assetname12[3],"Tk", Integer.toString(Assetcost12[3])},
                         {" ", "Total=" ,""},};
                    //member
                    int Assetamount17 = 0;
                    String[] Assetname17 = new String[5];
                    int[] Assetcost17 = new int[5];
                    JSONObject jsonObjectAsset17 = new JSONObject(assetliabilityreturn[17]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset17 = jsonObjectAsset17.getJSONArray("member");
                    for (int i = 0; i < 2; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset17.get(i);
                        Assetcost17[i] = temp.getInt("number");
                        Assetname17[i] = temp.getString("name");
                        Assetamount17 = Assetamount17 + Assetcost17[i];
                    }

                    String[][] dataasset17 = {
                        {"Name", "Number"},
                        {Assetname17[0], Integer.toString(Assetcost17[0])},
                        {Assetname17[1], Integer.toString(Assetcost17[1])},
                        {" ", "Total=" + Integer.toString(Assetamount17)},};

                    //Source Of Fund
                    int Assetamount19 = 0;
                    String[] Assetname19 = new String[5];
                    int[] Assetshare19 = new int[5];
                    int[] Assetcost19 = new int[5];
                    JSONObject jsonObjectAsset19 = new JSONObject(assetliabilityreturn[19]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset19 = jsonObjectAsset19.getJSONArray("sourcefund");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset19.get(i);
                        Assetcost19[i] = temp.getInt("cost");
                        Assetname19[i] = temp.getString("name");
                        Assetamount19 = Assetamount19 + Assetcost19[i];
                    }

                    String[][] dataasset19 = {
                        {"Sources of Fund:","",""},
                        {"(i)  "+Assetname19[0],"Tk", Integer.toString(Assetcost19[0])},
                        {"(ii)  "+Assetname19[1],"Tk", Integer.toString(Assetcost19[1])},
                        {"(iii)  "+Assetname19[2],"Tk", Integer.toString(Assetcost19[2])},
                         {" ", "Total=" ,""},};
                  int BFSUM=0;
                    for (int i = 0; i < 11; i++) {
                        assetsumm = assetsumm + totalasset[i];
                        if(i==9)
                        {
                          BFSUM=assetsumm;  
                        }
                    }
                    int thisyearincome = assetsumm - Assetamount12;
                    int finaldiffer = Integer.parseInt(assetliabilityreturn[18]) - Assetamount19;
                    int toac=Integer.parseInt(assetliabilityreturn[15])+Integer.parseInt(assetliabilityreturn[16]);
                    
      PdfPTable body4sftn = new PdfPTable(4);
                    PdfPCell[][] body41sftn = new PdfPCell[4][4];
                     float[] columnWidths4sftn = new float[]{17f, 10f,10f,8f};
                     Font aa2auftn = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftn.setWidths(columnWidths4sftn);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftn[i][j] = new PdfPCell(new Paragraph("Net Wealth of Assessee:   Tk.",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftn[i][j] = new PdfPCell(new Paragraph(Integer.toString(thisyearincome)+"/=",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                    body41sftn[i][j].setCellEvent(simpleBottomLine);
                                   
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sftn[i][j] = new PdfPCell(new Paragraph("      ",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftn[i][j]= new PdfPCell(new Paragraph("",tat));
                                    body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sftn.addCell(body41sftn[i][j]);
                            }
                        }
                       
                        return(body4sftn);
}
public PdfPTable instructionbottom3() throws DocumentException
{
      PdfPTable body4sftd = new PdfPTable(4);
                    PdfPCell[][] body41sftd = new PdfPCell[4][4];
                     float[] columnWidths4sftd = new float[]{10f, 10f,12f,10f};
                     Font aa2auftd = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftd.setWidths(columnWidths4sftd);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftd[i][j] = new PdfPCell(new Paragraph("Date of receipt of return:",tat)); 
                                   body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftd[i][j] = new PdfPCell(new Paragraph("  ",tat)); 
                                    body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                    body41sftd[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sftd[i][j] = new PdfPCell(new Paragraph("Serial No. in return register",tat)); 
                                  body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftd[i][j]= new PdfPCell(new Paragraph("  ",tat));
                                    body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                    body41sftd[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sftd.addCell(body41sftd[i][j]);
                            }
                        }
                       
                        return(body4sftd);
}
public PdfPTable instructionbottom4() throws DocumentException
{
  PdfPTable body4sftdm = new PdfPTable(7);
                    PdfPCell[][] body41sftdm = new PdfPCell[4][7];
                     float[] columnWidths4sftdm = new float[]{10f, 5f,3f,10f,3f,5f,15f};
                     Font aa2auftdm = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftdm.setWidths(columnWidths4sftdm);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftdm[i][j] = new PdfPCell(new Paragraph("Nature of Return:  ",tat)); 
                                   body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftdm[i][j] = new PdfPCell(new Paragraph(" Self ",tat)); 
                                                                   
                                }
                                if(j==2)
                                {
                                    
                                     body41sftdm[i][j] = new PdfPCell(new Paragraph(" ",tat)); 
                                     body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph("Universal Self",tat));
                                  
                                }
                                if(j==4)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph(" ",tat));
                                  body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                }
                                if(j==5)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph("Normal",tat));
                                  
                                }
                                if(j==6)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph(" ",tat));
                                   body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                  
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                                if(j>0)
                                {
                                  body4sftdm.addCell(body41sftdm[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);  
                                }
                                else
                                {
                                 body4sftdm.addCell(body41sftdm[i][j]);   
                                }
                               
                            }
                        }
                       
                        return(body4sftdm);   
}
public Rectangle pagenumbering(Document doc,PdfWriter writer,int i) throws DocumentException
{
    
                Rectangle page = new Rectangle(300,50,320,10);
                ColumnText pageinfo = new ColumnText(writer.getDirectContent());
                // rect.setBackgroundColor(BaseColor.RED);
                page.setBorderColor(BaseColor.BLACK);
                page.setBorder(Rectangle.BOX); 
               // page.setBorderWidth(1);
                 page.setBorderWidth(0);
                doc.add(page);
                pageinfo.setSimpleColumn(page);
                String pg=""+i+"";
                pageinfo.addElement(new Paragraph(pg));
               
                pageinfo.go(); 
                 return page;
}
            public void pdfc(long text,int ayear) throws DocumentException, ClassNotFoundException, SQLException, JSONException, FileNotFoundException, IOException
    {
       
        
        IncomeAssessee ic = new IncomeAssessee();
        String namee = "", amountt = "";
        // text=Long.parseLong("222222222222");
        
            int a = conn.EMPLOYEE(text);
            int[] b = conn.Assetliavilityy(text,ayear);
            String[] c = conn.FamilyExpense(text,ayear);
            String[] d = conn.HOUSEPROPERTYRETURN(text,ayear);
            String[] f = conn.TaxCount(text,ayear);
            String[] g = conn.SALARYRETURN(text,ayear);
            String[] h = conn.TAXDIBATE(text,ayear);

            if (a == 1) {
                if (b[0] == -1 && c[0].matches("-1") && d[0].matches("-1") && f[0].matches("-1") && g[0].matches("-1") && h[0].matches("-1")) {
                    JOptionPane.showMessageDialog(null, "Please Fillup All Form");
                } else {

                    //registration part
                    registrationreturn = conn.RegistrationReturn(text);
                    JSONObject jsonObject;
                    jsonObject = new JSONObject(registrationreturn[11]);
                    String ggh = jsonObject.getString("whname");
                    jsonObject = new JSONObject(ggh);
                    namee = jsonObject.getString("name");
                    amountt = jsonObject.getString("TIN");

                    String[][] dataRegistration = {
                        {"Name", "Detail"},
                        {"Type", registrationreturn[0]},
                        {"Name", registrationreturn[1]},
                        {"NID", registrationreturn[2]},
                        {"UTIN", registrationreturn[3]},
                        {"TIN", registrationreturn[4]},
                        {"Circle", registrationreturn[5]},
                        {"Taxes Zone", registrationreturn[6]},
                        {"Assessment year", registrationreturn[7]},
                        {"Residential status", registrationreturn[8]},
                        {"Status", registrationreturn[9]},
                        {"Name of the employer/business(where applicable)", registrationreturn[10]},
                        {"Wife/Husband's name(If assessee,please mention TIN),", "Name   :" + namee},
                        {" ", "TIN       :" + amountt},
                        {"Father name", registrationreturn[12]},
                        {"Mother name", registrationreturn[13]},
                        {"Date of Birth", registrationreturn[14]},
                        {"Present Address", registrationreturn[15]},
                        {"Permanent Address", registrationreturn[16]},
                        {"Office/Business Telephone Number", registrationreturn[17]},
                        {"Residential Telephone Number", registrationreturn[18]},
                        {"Vat registration number,if any", registrationreturn[19]},
                        {"Photo", registrationreturn[20]}
                    };

                    //Salary Part
                    salary1 = conn.SALARYRETURN(text,ayear);

                    int sumsalary1 = 0, sumsalary2 = 0;
                    int[] firstsalary = new int[salary1.length];
                    int[] secondsalary = new int[salary1.length];
                    for (int i = 1; i < salary1.length; i++) {
                        JSONObject json = new JSONObject(salary1[i]);
                        firstsalary[i] = Integer.parseInt(json.getString("EXIN"));
                        secondsalary[i] = Integer.parseInt(json.getString("NETTAXIN"));
                        sumsalary1 = sumsalary1 + firstsalary[i];
                        sumsalary2 = sumsalary2 + secondsalary[i];
                    }
                    String[][] dataSalary = {
                        {"Pay & Allowance", "Amount of Income", "Exempted Income", "Net Taxable Income"},
                        {"Basic pay", Integer.toString(firstsalary[1] + secondsalary[1]), Integer.toString(firstsalary[1]), Integer.toString(secondsalary[1])},
                        {"Special pay", Integer.toString(firstsalary[2] + secondsalary[2]), Integer.toString(firstsalary[2]), Integer.toString(secondsalary[2])},
                        {"Dearness allowance", Integer.toString(firstsalary[3] + secondsalary[3]), Integer.toString(firstsalary[3]), Integer.toString(secondsalary[3])},
                        {"Conveyance allowance", Integer.toString(firstsalary[4] + secondsalary[4]), Integer.toString(firstsalary[4]), Integer.toString(secondsalary[4])},
                        {"House rent allowance", Integer.toString(firstsalary[5] + secondsalary[5]), Integer.toString(firstsalary[5]), Integer.toString(secondsalary[5])},
                        {"Medical allowance", Integer.toString(firstsalary[6] + secondsalary[6]), Integer.toString(firstsalary[6]), Integer.toString(secondsalary[6])},
                        {"Servant allowance", Integer.toString(firstsalary[7] + secondsalary[7]), Integer.toString(firstsalary[7]), Integer.toString(secondsalary[7])},
                        {"leave allowance", Integer.toString(firstsalary[8] + secondsalary[8]), Integer.toString(firstsalary[8]), Integer.toString(secondsalary[8])},
                        {"Honorarium/Reward/fee", Integer.toString(firstsalary[9] + secondsalary[9]), Integer.toString(firstsalary[9]), Integer.toString(secondsalary[9])},
                        {"Education allowance", Integer.toString(firstsalary[10] + secondsalary[10]), Integer.toString(firstsalary[10]), Integer.toString(secondsalary[10])},
                        {"Bonus/Ex-gratia", Integer.toString(firstsalary[11] + secondsalary[11]), Integer.toString(firstsalary[11]), Integer.toString(secondsalary[11])},
                        {"Other allowance", Integer.toString(firstsalary[12] + secondsalary[12]), Integer.toString(firstsalary[12]), Integer.toString(secondsalary[12])},
                        {"Employer's contribution to Recognized Provident fund", Integer.toString(firstsalary[13] + secondsalary[13]), Integer.toString(firstsalary[13]), Integer.toString(secondsalary[13])},
                        {"Interest acctued on recognized provident fund", Integer.toString(firstsalary[14] + secondsalary[14]), Integer.toString(firstsalary[14]), Integer.toString(secondsalary[14])},
                        {"Deemed income for transport facility", Integer.toString(firstsalary[15] + secondsalary[15]), Integer.toString(firstsalary[15]), Integer.toString(secondsalary[15])},
                        {"Deemed income for free furnished/unfurnished accomodation", Integer.toString(firstsalary[16] + secondsalary[16]), Integer.toString(firstsalary[16]), Integer.toString(secondsalary[16])},
                        {"Other,if any(Give details)", Integer.toString(firstsalary[17] + secondsalary[17]), Integer.toString(firstsalary[17]), Integer.toString(secondsalary[17])},
                        {"Net Taxable Income From Salary", Integer.toString(sumsalary1 + sumsalary2), Integer.toString(sumsalary1), Integer.toString(sumsalary2)},};

                    //House property part
                    ic.accessnin(text,ayear);
                    houseproperty = conn.HOUSEPROPERTYRETURN(text,ayear);
                    int sum = 0;
                    for (int i = 0; i < 7; i++) {
                        sum = sum + ic.option[i];
                    }
                    int rentalincome = Integer.parseInt(ic.houseproperty[0]);
                    String[][] dataHouse = {
                        {"Detail", "Income/Spent"},
                        {"Annual Renatal Income", ic.houseproperty[0]},
                        {"Claimed Expense", ""},
                        {"Net Income", Integer.toString(rentalincome - sum)},};
                    String[][] expense = {
                        {"Repair,Collection,etc.", Integer.toString(ic.option[0])},
                        {"Municipal or Local Tax", Integer.toString(ic.option[1])},
                        {"Land Revenue", Integer.toString(ic.option[2])},
                        {"Interest on Loan/Mortgage/Capital charge", Integer.toString(ic.option[3])},
                        {"Insurance Premium", Integer.toString(ic.option[4])},
                        {"Vacancy Allowance", Integer.toString(ic.option[5])},
                        {"Other, if any", Integer.toString(ic.option[6])},
                        {"Total", Integer.toString(sum)},};
                    //tax divate
                    taxdibate = conn.TAXDIBATE(text,ayear);

                    int[] amount = new int[10];
                    int sumtaxx = 0;
                    String[] name = new String[5];
                    JSONObject jsonObject1 = new JSONObject(taxdibate[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArray = jsonObject1.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArray.get(i);
                        amount[i] = temp.getInt("amount");
                        name[i] = temp.getString("name");
                        sumtaxx = sumtaxx + amount[i];
                    }

                    String[][] datataxother = {
                        
                        {"",name[0], "Tk",Integer.toString(amount[0])},
                        {"",name[1], "Tk",Integer.toString(amount[1])},
                        {"",name[2],"Tk", Integer.toString(amount[2])},
                        {"",name[3],"Tk", Integer.toString(amount[3])},
                        {"",name[4],"Tk", Integer.toString(amount[4])},
                        {" ", "Total=" + sumtaxx},};
                    othd=Integer.parseInt(taxdibate[10])+Integer.parseInt(taxdibate[11]);
                     oth=sumtaxx+othd;
                    int taxsum = 0;
                    for (int i = 1; i < 12; i++) {
                        taxsum = taxsum + Integer.parseInt(taxdibate[i]);
                    }
                    for (int i = 0; i < 5; i++) {
                        taxsum = taxsum + amount[i];
                    }
                    String[][] datataxdibate = {
                    
                        {"1.","Life insurence premium","Tk", taxdibate[1]},
                        {"2.","Contribution to deffered annuity","Tk", taxdibate[2]},
                        {"3.","Contribution to Provident fund to which Provident fund Act , 1925 applies","Tk", taxdibate[3]},
                        {"4.","Self contribution & emplyer's contribution to Recognized Provident fund", "Tk",taxdibate[4]},
                        {"5.","Contribution to Super annuation fund","Tk", taxdibate[5]},
                        {"6.","Investment in approved deventure stock,Stock or Shatres","Tk", taxdibate[6]},
                        {"7.","Contribution to deposit pension schema ","Tk", taxdibate[7]},
                        {"8.","Contribution to Benevolent fund & group insurence premium","Tk", taxdibate[8]},
                        {"9.","Contribution to Zakat fund","Tk", taxdibate[9]},
                        {"10.","other","Tk", taxdibate[12]},
                        {" ","                                     Total= ","Tk", Integer.toString(taxsum)},
                        {" "," "," "," "},
                        {"Saving Certificate/Unit Certificate/Bond Prize bond","Tk", taxdibate[10]},
                        {"Saving Scheme/Computer","Tk", taxdibate[11]},
                        
                    };

                    //family expense
                    familyexpense = conn.FamilyExpense(text,ayear);
                    int sumexpense = 0;
                    int[] firstexpense = new int[familyexpense.length];
                    String[] secondexpense = new String[familyexpense.length];
                    for (int i = 1; i < 14; i++) {
                        JSONObject json2 = new JSONObject(familyexpense[i]);
                        firstexpense[i] = Integer.parseInt(json2.getString("amount"));
                        secondexpense[i] = (json2.getString("comment"));
                        sumexpense = sumexpense + firstexpense[i];

                    }

                    String[][] datafamilyexpense = {
                        {"Serial No","Particulars Of Expenditure", "Amount Of Taka", "Comments"},
                        {"1","Personal and fooding expenses", Integer.toString(firstexpense[1]), secondexpense[1]},
                        {"2","Tax paid including deduction at source of the last financial year", Integer.toString(firstexpense[2]), secondexpense[2]},
                        {"3","Accomodation expenses", Integer.toString(firstexpense[3]), secondexpense[3]},
                        {"4","Transport expenses", Integer.toString(firstexpense[4]), secondexpense[4]},
                        {"5","Electric bill for residence", Integer.toString(firstexpense[5]), secondexpense[5]},
                        {"6","Wasa bill for residence", Integer.toString(firstexpense[6]), secondexpense[6]},
                        {"7","Gas bill for residence", Integer.toString(firstexpense[7]), secondexpense[7]},
                        {"8","Telephone bill for residence", Integer.toString(firstexpense[8]), secondexpense[8]},
                        {"9","Education expense for chirldren", Integer.toString(firstexpense[9]), secondexpense[9]},
                        {"10","Bank loan installment", Integer.toString(firstexpense[10]), secondexpense[10]},
                        {"11","Festival other expense", Integer.toString(firstexpense[11]), secondexpense[11]},
                        {"12","Medical purposes", Integer.toString(firstexpense[12]), secondexpense[12]},
                        {" ","Total expenses", Integer.toString(sumexpense), secondexpense[13]},};

                    //Assetliability
                    assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
                    int assetsumm = 0;

                    totalasset[0] = Integer.parseInt(assetliabilityreturn[1]);
                    //shareholding
                    int Assetamount2 = 0;
                    String[] Assetname2 = new String[5];
                    int[] Assetshare2 = new int[5];
                    int[] Assetcost2 = new int[5];
                    JSONObject jsonObjectAsset2 = new JSONObject(assetliabilityreturn[2]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset2 = jsonObjectAsset2.getJSONArray("shareholding");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset2.get(i);
                        Assetshare2[i] = temp.getInt("share");
                        Assetcost2[i] = temp.getInt("cost");
                        Assetname2[i] = temp.getString("name");
                        Assetamount2 = Assetamount2 + Assetcost2[i];
                    }
                    totalasset[1] = Assetamount2;
                    String[][] dataasset2 = {
                        {"Directors Shareholding in Limited Companies (at cost)",""},
                        {"Name of Companies","Number of shares"},
                        {Assetname2[0], Integer.toString(Assetshare2[0]) },
                        {Assetname2[1], Integer.toString(Assetshare2[1]) },
                        {Assetname2[2], Integer.toString(Assetshare2[2])},
                        {Assetname2[3], Integer.toString(Assetshare2[3])},
                        {Assetname2[4], Integer.toString(Assetshare2[4])},
                        {" ", " ", "Total=" + Integer.toString(Assetamount2)},};
                    //nonagricultural
                    int Assetamount3 = 0;
                    String[] Assetname3 = new String[5];
                    int[] Assetshare3 = new int[5];
                    int[] Assetcost3 = new int[5];
                    JSONObject jsonObjectAsset3 = new JSONObject(assetliabilityreturn[3]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset3 = jsonObjectAsset3.getJSONArray("nonagricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset3.get(i);
                        Assetcost3[i] = temp.getInt("cost");
                        Assetname3[i] = temp.getString("name");
                        Assetamount3 = Assetamount3 + Assetcost3[i];
                    }
                    totalasset[2] = Assetamount3;
                    String[][] dataasset3 = {
                          {"Non-Agricultural Property (at cost with legal expenses)"," "},
                        {"Land/House property(Description & location of property)"," "},
                        {Assetname3[0], Integer.toString(Assetcost3[0])},
                        {Assetname3[1], Integer.toString(Assetcost3[1])},
                        {Assetname3[2], Integer.toString(Assetcost3[2])},
                        {Assetname3[3], Integer.toString(Assetcost3[3])},
                        {Assetname3[4], Integer.toString(Assetcost3[4])},
                        {" ", "Total=" + Integer.toString(Assetamount3)},};
                    //agricultural
                    int Assetamount4 = 0;
                    String[] Assetname4 = new String[5];
                    int[] Assetshare4 = new int[5];
                    int[] Assetcost4 = new int[5];
                    JSONObject jsonObjectAsset4 = new JSONObject(assetliabilityreturn[4]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset4 = jsonObjectAsset4.getJSONArray("agricultural");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset4.get(i);
                        Assetcost4[i] = temp.getInt("cost");
                        Assetname4[i] = temp.getString("name");
                        Assetamount4 = Assetamount4 + Assetcost4[i];
                    }
                    totalasset[3] = Assetamount4;

                    String[][] dataasset4 = {
                         {"Agricultural Property (at cost with legal expenses)"," "},
                        {"Land (Total land and location of land property))"," "},
                        {Assetname4[0], Integer.toString(Assetcost4[0])},
                        {Assetname4[1], Integer.toString(Assetcost4[1])},
                        {Assetname4[2], Integer.toString(Assetcost4[2])},
                        {Assetname4[3], Integer.toString(Assetcost4[3])},
                        {Assetname4[4], Integer.toString(Assetcost4[4])},
                        {" ", "Total=" + Integer.toString(Assetamount4)},};

                    //Investment
                    int Assetamount5 = 0;
                    String[] Assetname5 = new String[6];
                    int[] Assetshare5 = new int[6];
                    int[] Assetcost5 = new int[6];
                    JSONObject jsonObjectAsset5 = new JSONObject(assetliabilityreturn[5]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset5 = jsonObjectAsset5.getJSONArray("investment");
                    for (int i = 0; i < 6; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset5.get(i);
                        Assetcost5[i] = temp.getInt("cost");
                        Assetname5[i] = temp.getString("name");
                        Assetamount5 = Assetamount5 + Assetcost5[i];
                    }
                    totalasset[4] = Assetamount5;
                    String[][] dataasset5 = {
                        {"Investments:","",""},
                        {"(a)  "+Assetname5[0],"Tk", Integer.toString(Assetcost5[0])},
                        {"(b)  "+Assetname5[1],"Tk", Integer.toString(Assetcost5[1])},
                        {"(c)  "+Assetname5[2], "Tk",Integer.toString(Assetcost5[2])},
                        {"(d)  "+Assetname5[3],"Tk", Integer.toString(Assetcost5[3])},
                        {"(e)  "+Assetname5[4],"Tk", Integer.toString(Assetcost5[4])},
                        {"(f)  "+Assetname5[5],"Tk", Integer.toString(Assetcost5[5])},
                        {" ", " " ,"Total="},};

                    //motor
                    int Assetamount6 = 0;
                    String[] Assetname6 = new String[5];
                    int[] Assetshare6 = new int[5];
                    int[] Assetcost6 = new int[5];
                    JSONObject jsonObjectAsset6 = new JSONObject(assetliabilityreturn[6]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset6 = jsonObjectAsset6.getJSONArray("motor");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset6.get(i);
                        Assetcost6[i] = temp.getInt("cost");
                        Assetname6[i] = temp.getString("name");
                        Assetamount6 = Assetamount6 + Assetcost6[i];
                    }
                    totalasset[5] = Assetamount6;
                    String[][] dataasset6 = {
                        {"Motor Vehicles(at cost)"," "},
                        {"Type of motor vehicle and Registration number", " "},
                        {Assetname6[0], Integer.toString(Assetcost6[0])},
                        {Assetname6[1], Integer.toString(Assetcost6[1])},
                        {Assetname6[2], Integer.toString(Assetcost6[2])},
                        {Assetname6[3], Integer.toString(Assetcost6[3])},
                        {Assetname6[4], Integer.toString(Assetcost6[4])},
                        {" ", "Total=" + Integer.toString(Assetamount6)},};
                    //JWELLERY
                    int Assetamount7 = 0;
                    String[] Assetname7 = new String[5];
                    int[] Assetshare7 = new int[5];
                    int[] Assetcost7 = new int[5];
                    JSONObject jsonObjectAsset7 = new JSONObject(assetliabilityreturn[7]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset7 = jsonObjectAsset7.getJSONArray("jwellery");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset7.get(i);
                        Assetcost7[i] = temp.getInt("cost");
                        Assetname7[i] = temp.getString("name");
                        Assetamount7 = Assetamount7 + Assetcost7[i];
                    }
                    totalasset[6] = Assetamount7;
                    totalasset[7] = Integer.parseInt(assetliabilityreturn[8]);
                    totalasset[8] = Integer.parseInt(assetliabilityreturn[9]);
                    String[][] dataasset7 = {
                         {"Jewellery(quantity and cost)"," "},
                        {"300 gram Gold", " "},
                        {Assetname7[0], Integer.toString(Assetcost7[0])},
                        {Assetname7[1], Integer.toString(Assetcost7[1])},
                        {Assetname7[2], Integer.toString(Assetcost7[2])},
                        {Assetname7[3], Integer.toString(Assetcost7[3])},
                        {Assetname7[4], Integer.toString(Assetcost7[4])},
                        {" ", "Total=" + Integer.toString(Assetamount7)},};

                    //cashasset
                    int Assetamount10 = 0;
                    String[] Assetname10 = new String[5];
                    int[] Assetshare10 = new int[5];
                    int[] Assetcost10 = new int[5];
                    JSONObject jsonObjectAsset10 = new JSONObject(assetliabilityreturn[10]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset10 = jsonObjectAsset10.getJSONArray("cashasset");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset10.get(i);
                        Assetcost10[i] = temp.getInt("cost");
                        Assetname10[i] = temp.getString("name");
                        Assetamount10 = Assetamount10 + Assetcost10[i];
                    }
                    totalasset[9] = Assetamount10;
                    String[][] dataasset10 = {
                        { "Cash Asset Outside Business:",""," "},
                         {"(a)  "+Assetname10[0],"Tk", Integer.toString(Assetcost10[0])},
                        {"(b)  "+Assetname10[1],"Tk", Integer.toString(Assetcost10[1])},
                        {"(c)   Other deposits((Paid the Interest of Mortgages))", "Tk",Integer.toString(Assetcost10[2])},
                       {" ", " " ,"Total="},};

                    //otherasset
                    int Assetamount11 = 0;
                    String[] Assetname11 = new String[5];
                    int[] Assetshare11 = new int[5];
                    int[] Assetcost11 = new int[5];
                    JSONObject jsonObjectAsset11 = new JSONObject(assetliabilityreturn[11]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset11 = jsonObjectAsset11.getJSONArray("other");
                    for (int i = 0; i < 5; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset11.get(i);
                        Assetcost11[i] = temp.getInt("cost");
                        Assetname11[i] = temp.getString("name");
                        Assetamount11 = Assetamount11 + Assetcost11[i];
                    }
                    totalasset[10] = Assetamount11;
                    String[][] dataasset11 = {
                        { "Any other assets:"," "," "},
                         { "Give details"," "," "},
                        {"(a)  "+Assetname11[0],"Tk", Integer.toString(Assetcost11[0])},
                        {"(b)  "+Assetname11[1],"Tk", Integer.toString(Assetcost11[1])},
                        {"(c)  "+Assetname11[2],"Tk", Integer.toString(Assetcost11[2])},
                        {"(d)  "+Assetname11[3],"Tk", Integer.toString(Assetcost11[3])},
                        {"(e)  "+Assetname11[4],"Tk", Integer.toString(Assetcost11[4])},
                        {" ", "Total=" ,""},
                    };

                    //lessliability
                    int Assetamount12 = 0;
                    String[] Assetname12 = new String[5];
                    int[] Assetshare12 = new int[5];
                    int[] Assetcost12 = new int[5];
                    JSONObject jsonObjectAsset12 = new JSONObject(assetliabilityreturn[12]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset12 = jsonObjectAsset12.getJSONArray("lessliability");
                    for (int i = 0; i < 4; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset12.get(i);
                        Assetcost12[i] = temp.getInt("cost");
                        Assetname12[i] = temp.getString("name");
                        Assetamount12 = Assetamount12 + Assetcost12[i];
                    }

                    String[][] dataasset12 = {
                        {"Less Liabilities:","",""},
                        {"(a)  "+Assetname12[0],"Tk", Integer.toString(Assetcost12[0])},
                        {"(b)  "+Assetname12[1],"Tk", Integer.toString(Assetcost12[1])},
                        {"(c)  "+Assetname12[2],"Tk", Integer.toString(Assetcost12[2])},
                        {"(d)  "+Assetname12[3],"Tk", Integer.toString(Assetcost12[3])},
                         {" ", "Total=" ,""},};
                    //member
                    int Assetamount17 = 0;
                    String[] Assetname17 = new String[5];
                    int[] Assetcost17 = new int[5];
                    JSONObject jsonObjectAsset17 = new JSONObject(assetliabilityreturn[17]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset17 = jsonObjectAsset17.getJSONArray("member");
                    for (int i = 0; i < 2; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset17.get(i);
                        Assetcost17[i] = temp.getInt("number");
                        Assetname17[i] = temp.getString("name");
                        Assetamount17 = Assetamount17 + Assetcost17[i];
                    }

                    String[][] dataasset17 = {
                        {"Name", "Number"},
                        {Assetname17[0], Integer.toString(Assetcost17[0])},
                        {Assetname17[1], Integer.toString(Assetcost17[1])},
                        {" ", "Total=" + Integer.toString(Assetamount17)},};

                    //Source Of Fund
                    int Assetamount19 = 0;
                    String[] Assetname19 = new String[5];
                    int[] Assetshare19 = new int[5];
                    int[] Assetcost19 = new int[5];
                    JSONObject jsonObjectAsset19 = new JSONObject(assetliabilityreturn[19]);
                    // JSONObject temp=null;
                    JSONArray jsonArrayAsset19 = jsonObjectAsset19.getJSONArray("sourcefund");
                    for (int i = 0; i < 3; i++) {
                        JSONObject temp = null;
                        temp = (JSONObject) jsonArrayAsset19.get(i);
                        Assetcost19[i] = temp.getInt("cost");
                        Assetname19[i] = temp.getString("name");
                        Assetamount19 = Assetamount19 + Assetcost19[i];
                    }

                    String[][] dataasset19 = {
                        {"Sources of Fund:","",""},
                        {"(i)  "+Assetname19[0],"Tk", Integer.toString(Assetcost19[0])},
                        {"(ii)  "+Assetname19[1],"Tk", Integer.toString(Assetcost19[1])},
                        {"(iii)  "+Assetname19[2],"Tk", Integer.toString(Assetcost19[2])},
                         {" ", "Total=" ,""},};
                  int BFSUM=0;
                    for (int i = 0; i < 11; i++) {
                        assetsumm = assetsumm + totalasset[i];
                        if(i==9)
                        {
                          BFSUM=assetsumm;  
                        }
                    }
                    int thisyearincome = assetsumm - Assetamount12;
                    int finaldiffer = Integer.parseInt(assetliabilityreturn[18]) - Assetamount19;
                    int toac=Integer.parseInt(assetliabilityreturn[15])+Integer.parseInt(assetliabilityreturn[16]);
                    String[][] dataAsset = {
                        {"1. (a)", "Business Capital(Closing balance)","Tk", assetliabilityreturn[1]},
                        {"    (b) ", "Directors Shareholding in Limited Companies(at cost)","Tk.", assetliabilityreturn[2]},
                        {"2  ", "Non-agricultural","Tk.", assetliabilityreturn[3]},
                        {"3  ","Agricultural","Tk.", assetliabilityreturn[4]},
                        {"4  ","Investement","Tk.", assetliabilityreturn[5]},
                        {"5  ","Motor","Tk.", assetliabilityreturn[6]},
                        {"6  ","Jewellery","Tk.", assetliabilityreturn[7]},
                        {"7  ","Furniture(at cost)","Tk.", assetliabilityreturn[8]},
                        {"8  ","Electric Equipment(at cost)","Tk.", assetliabilityreturn[9]},
                        {"9  ","Cash asset outside business:","Tk.", assetliabilityreturn[10]},
                        {"10  ","Any other assets","Tk.", assetliabilityreturn[11]},
                        {"11  ","Total Asset","Tk.", Integer.toString(assetsumm)},
                        {"12  ","Less Liability","Tk.", assetliabilityreturn[12]},
                        {"13  ","Net wealth this year","Tk.", Integer.toString(thisyearincome)},
                        {"14  ","Net wealth last year","Tk.", assetliabilityreturn[14]},
                        {"15  ","Accretion in wealth","Tk.", assetliabilityreturn[15]},
                        {"16  ","Family Expenditure","Tk.", assetliabilityreturn[16]},
                        {"17  ","Dependent member","Tk.", assetliabilityreturn[17]},
                        {"18  ","Total accretion of wealth ","Tk.", assetliabilityreturn[18]},
                        {"19  ","Source fund","Tk.", assetliabilityreturn[19]},
                        {"20  ","Difference","Tk.", Integer.toString(finaldiffer)}
                    };
                    //tax count
                    taxcount = conn.TaxCount(text,ayear);

                    String[][] datataxcount = {
                        {"Heads of Income", "Amount in Taka"},
                        {"Salaries :u/s 21 (as per shedule 1)", taxcount[1]},
                        {"Interest on Securities:u/s", taxcount[2]},
                        {"Income from house property:u/s 24(as per shedule 2)", taxcount[3]},
                        {"Agricultural income:u/s 26", taxcount[4]},
                        {"Income from business or profession:u/s 28", taxcount[5]},
                        {"Share of profit in a firm", taxcount[6]},
                        {"Income of the spouse or minor child as applicable:u/s 43(4)", taxcount[7]},
                        {"Capital Gains:u/s 31", taxcount[8]},
                        {"Income from other source:u/s 33", taxcount[9]},
                        {"Total 1 & 9", taxcount[10]},
                        {"Foreign Income", taxcount[11]},
                        {"Total income 10 &11", taxcount[12]},
                        {"Tax leviable on total income", taxcount[13]},
                        {"Tax rebate(u/s 44(2)(b)(as per schedule-3))", taxcount[14]},
                        {"Tax payable(difference 13 & 14)", taxcount[15]},
                        {"Tax Payments", taxcount[16]},
                        {"Difference 15 & 16", taxcount[17]},
                        {"Tax exempted & Tax free income", taxcount[18]},
                        {"Income tax paid in the last assessment year", taxcount[19]},};
                    //taxpayment part
                    int[] taxpaymentamount = new int[5];
                   
                    JSONObject jsontaxpa = new JSONObject(taxcount[16]);
                    JSONObject jsontaxpay = (JSONObject) jsontaxpa.get("TaxPayment");

                    taxpaymentamount[0] = Integer.parseInt(jsontaxpay.getString("TaxReducted"));
                    taxpaymentamount[1] = Integer.parseInt(jsontaxpay.getString("AdvanceTax"));
                    taxpaymentamount[2] = Integer.parseInt(jsontaxpay.getString("TaxPaidReturn"));
                    taxpaymentamount[3] = Integer.parseInt(jsontaxpay.getString("TaxRefund"));
                    for (int i = 0; i < 4; i++) {
                        paymentsum = paymentsum + taxpaymentamount[i];
                    }
                    String[][] datataxcount16 = {
                        {"16     ", "Tax Payment:", " ",""},
                        {"      ","(a)Tax deducted/collected at source(Please submit supporting document/statement)", "Tk,",jsontaxpay.getString("TaxReducted")},
                        {"      ","(b)Advance Tax u/s 64/68(Please attach challan)","Tk,", jsontaxpay.getString("AdvanceTax")},
                        {"      ","(c)Tax Paid on the basis of this return(u/s 74)(Please attach challan/pay order/bank draft/cheque)","Tk,", jsontaxpay.getString("TaxPaidReturn")},
                        {"      ","(d)Adjustment of Tax Refund (if any)","Tk,", jsontaxpay.getString("TaxRefund")},
                        {"      ","                                                Total of (a)",",(b)", "(c)and (d)" },};

                    try {
                        Document document = new Document(PageSize.A4);
                        OutputStream outputStream = new FileOutputStream(new File("E:\\pdf\\dot\\" + registrationreturn[1] + "god(" + text + ").pdf"));
                       PdfWriter writer= PdfWriter.getInstance(document, outputStream);
                       document.setMargins(5, 1,10, 20);
                        document.open();
                        PdfPTable header = new PdfPTable(1);
                        String header1 = "      FOR INDIVDUAL & OTHER TAXPAYERS (OTHER THAN COMPANY) ";
                       // Font CUSTOM_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD | Font.UNDERLINE);
                       
                        PdfPCell headercell = new PdfPCell(new Paragraph(header1,CUSTOM_FONT));
                        headercell.setBorderColor(BaseColor.BLACK);
                        headercell.setBorderWidth(1.5f);
                       
                        //Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC);
                        header.addCell(headercell);
                       
                        document.add(header);
                        document.add(new Paragraph("         "));
                        document.add(new Paragraph("                         FORM OF RETURN OF INCOME UNDER THE INCOME TAX"));
                        document.add(new Paragraph("                                                  ORDINACE, 1984(XXVI OF 1984)"));
                        //first=left margin-x
                        //second=distance from bottom distance-y
                        //third=first+width
                        //fourth=second-width
                        //it-11ga
                        //image tick mark
                      String imFile = "E:\\pdf\\tickmark.png";
                        Image img = Image.getInstance(imFile);
                        img.scaleAbsoluteHeight(256f);
                         img.scaleAbsoluteWidth(256f);                         

                                          Rectangle rect = new Rectangle(500,750,580,720);
                          ColumnText ct = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                            rect.setBorderColor(BaseColor.BLACK);
                            rect.setBorder(Rectangle.BOX); 
                            rect.setBorderWidth(1);
                            document.add(rect);
                           ct.setSimpleColumn(rect);
                           String it = "  IT-11GA   ";
                           ct.addElement(new Paragraph(it));
                           ct.go(); 
                      // end
                      
                      //berespect
                      Rectangle berespect = new Rectangle(18,700,200,630);
                          ColumnText  berespect1 = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                             berespect.setBorderColor(BaseColor.BLACK);
                             berespect.setBorder(Rectangle.BOX); 
                             berespect.setBorderWidth(1);
                            document.add( berespect);
                            berespect1.setSimpleColumn( berespect);
                           berespect1.addElement(new Paragraph("  Be a Responsible Taxpayer"));
                            berespect1.addElement(new Paragraph("  Submit return in due time"));
                            berespect1.addElement(new Paragraph("  Avoid penalty"));
                           berespect1.go(); 
                      //photo
                      Rectangle photo = new Rectangle(400,700,570,600);
                          ColumnText  photo1 = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                             photo.setBorderColor(BaseColor.BLACK);
                             photo.setBorder(Rectangle.BOX); 
                             photo.setBorderWidth(1);
                            document.add(photo);
                            photo1.setSimpleColumn( photo);
                             photo1.addElement(new Paragraph("  "));
                           photo1.addElement(new Paragraph("  Photograph of the Assessee"));
                           photo1.addElement(new Paragraph("  "));
                            Font pt = new Font(Font.FontFamily.HELVETICA, 10  );
                            photo1.addElement(new Paragraph(" [to be attested on the photographh]",pt));
                            photo1.addElement(new Paragraph("  "));
                           photo1.go(); 
                           for(int i=0;i<8;i++)
                           {
                              document.add(new Paragraph("         ")); 
                           }
                           String tic="D:\\soft\\sqljdbc_9.4.0.0_enu\\sqljdbc_9.4\\enu\\pdf file\\itext5\\customfont.ttf";
                           //FontSelector selector=new FontSelector();
                           BaseFont base=BaseFont.createFont(tic,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
                           Font bradley=new Font(base,12f);
                           Font bradley1=new Font(base,12f);
                           String headers="D:\\soft\\sqljdbc_9.4.0.0_enu\\sqljdbc_9.4\\enu\\pdf file\\itext5\\header.ttf";
                           BaseFont headerf=BaseFont.createFont(tic,BaseFont.IDENTITY_H,BaseFont.EMBEDDED);
                           
                          // selector.addFont(FontFactory.getFont(FontFactory.HELVETICA,12));
                           //selector.addFont(new Font(base,12));
                           //char ticsymbl=10003;
                           //String text=String.valueOf(ticsymbl);
                           //Phrase ph=selector.process(text);
                           
                     //tick      
                    document.add(new Paragraph("Put the tick() mark whereever applicable"));
                    document.add(new Paragraph("         ")); 
                   
                    //
                    PdfPTable tick = new PdfPTable(4);
                    PdfPCell[][] tickcell = new PdfPCell[4][4];
                     float[] columnWidths = new float[]{5f, 10f,5f,15f};
                    tick.setWidths(columnWidths);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(j==0)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Self"));  
                                }
                                if(j==1)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Universal Self"));  
                                }
                                if(j==2)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph("Normal"));  
                                }
                                if(j==3)
                                {
                                   tickcell[i][j] = new PdfPCell(new Paragraph(" "));
                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
                                   tickcell[i][j].disableBorderSide(1);//TOP
                                    tickcell[i][j].disableBorderSide(2);//BOTTOM
                                     //tickcell[i][j].disableBorderSide(4);//LEFT
                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               tick.addCell(tickcell[i][j]);
                            }
                        }
                         tick.setWidthPercentage(95);
                        document.add(tick);

                        //1
                        PdfPTable body1 = new PdfPTable(4);
                    PdfPCell[][] bodyl1 = new PdfPCell[4][4];
                     float[] columnWidths1 = new float[]{3f, 15f,30f,2f};
                    body1.setWidths(columnWidths1);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   bodyl1[i][j] = new PdfPCell(new Paragraph("  1")); 
                                   bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                   bodyl1[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   bodyl1[i][j] = new PdfPCell(new Paragraph("Name of the Assessee:")); 
                                    bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     bodyl1[i][j]= new PdfPCell(new Paragraph(registrationreturn[1], bradley));
                                      bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
                                    bodyl1[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   bodyl1[i][j] = new PdfPCell(new Paragraph(" "));
                                    bodyl1[i][j].disableBorderSide(1);
                                   bodyl1[i][j].disableBorderSide(2);
                                   bodyl1[i][j].disableBorderSide(4);
                                   bodyl1[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body1.addCell(bodyl1[i][j]);
                            }
                        }
                        
                        //body2
                        PdfPTable body2 = new PdfPTable(4);
                    PdfPCell[][] body21 = new PdfPCell[4][4];
                     float[] columnWidths2 = new float[]{3f, 15f,30f,2f};//3f, 15f,30f,2f
                    body2.setWidths(columnWidths2);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body21[i][j] = new PdfPCell(new Paragraph("  2")); 
                                   body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body21[i][j] = new PdfPCell(new Paragraph("National ID No(if any):")); 
                                    body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body21[i][j]= new PdfPCell(new Paragraph(registrationreturn[2]));
                                      body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
                                    body21[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body21[i][j] = new PdfPCell(new Paragraph(" "));
                                    body21[i][j].disableBorderSide(1);
                                   body21[i][j].disableBorderSide(2);
                                   body21[i][j].disableBorderSide(4);
                                   body21[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body2.addCell(body21[i][j]);
                            }
                        }
                        
                         //body 3 er subtable
                         PdfPTable body3sub = new PdfPTable(12);
                    PdfPCell[][] body31sub = new PdfPCell[12][12];
                     float[] columnWidths3sub = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body3sub.setWidths(columnWidths3sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body31sub[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[3].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body3sub.addCell(body31sub[i][j]);
                            }
                        }
                        
                         //body3
                        PdfPTable body3 = new PdfPTable(4);
                    PdfPCell[][] body31 = new PdfPCell[4][4];
                     float[] columnWidths3 = new float[]{3f, 15f,25f,15f};
                    body3.setWidths(columnWidths3);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body31[i][j] = new PdfPCell(new Paragraph("  3")); 
                                   body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body31[i][j] = new PdfPCell(new Paragraph("UTIN(if any):")); 
                                    body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body31[i][j]= new PdfPCell(body3sub);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body31[i][j] = new PdfPCell(new Paragraph(" "));
                                    body31[i][j].disableBorderSide(1);
                                   body31[i][j].disableBorderSide(2);
                                   body31[i][j].disableBorderSide(4);
                                   body31[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body3.addCell(body31[i][j]);
                            }
                        }
                       
                        
                         //body 3 er subtable
                         PdfPTable body4sub = new PdfPTable(12);
                    PdfPCell[][] body41sub = new PdfPCell[12][12];
                     float[] columnWidths4sub = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body4sub.setWidths(columnWidths4sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body41sub[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[4].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body4sub.addCell(body41sub[i][j]);
                            }
                        }
                        
                         //body4
                        PdfPTable body4 = new PdfPTable(4);
                    PdfPCell[][] body41 = new PdfPCell[4][4];
                     float[] columnWidths4 = new float[]{3f, 15f,25f,15f};
                    body4.setWidths(columnWidths4);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41[i][j] = new PdfPCell(new Paragraph("  4")); 
                                   body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41[i][j] = new PdfPCell(new Paragraph("TIN:")); 
                                    body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body41[i][j]= new PdfPCell(body4sub);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41[i][j] = new PdfPCell(new Paragraph(" "));
                                    body41[i][j].disableBorderSide(1);
                                   body41[i][j].disableBorderSide(2);
                                   body41[i][j].disableBorderSide(4);
                                   body41[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4.addCell(body41[i][j]);
                            }
                        }
                       //5
                       
                        PdfPTable body5 = new PdfPTable(6);
                    PdfPCell[][] body51 = new PdfPCell[5][6];
                     float[] columnWidths5 = new float[]{3f, 5f,10f,7f,10f,2f};
                    body5.setWidths(columnWidths5);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph("  5")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph("(a) Circle:")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body51[i][j] = new PdfPCell(new Paragraph(""+registrationreturn[5]+"(Salary)", bradley)); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                    body51[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body51[i][j] = new PdfPCell(new Paragraph("(b) Taxes Zone:")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                 if(j==4)
                                {
                                   
                                   body51[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[6]+"", bradley)); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                   body51[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                if(j==5)
                                {
                                   body51[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body51[i][j].disableBorderSide(1);
                                   body51[i][j].disableBorderSide(2);
                                   body51[i][j].disableBorderSide(4);
                                   body51[i][j].disableBorderSide(8);
                                 
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body5.addCell(body51[i][j]);
                            }
                        }
                        
//                        //6
//                       
//                        PdfPTable body6 = new PdfPTable(7);
//                    PdfPCell[][] body61 = new PdfPCell[7][7];
//                     float[] columnWidths6 = new float[]{10f, 4f,12f,1f,6f,1f,3f};
//                    body6.setWidths(columnWidths6);
//                  int nesty=Integer.parseInt(registrationreturn[7].substring(2, 4))+1;
//                  String xf=registrationreturn[7].substring(0, 4).concat("-").concat(Integer.toString(nesty));
//                  System.out.print(xf);
//                   System.out.print(registrationreturn[7].length());
//                        for (int i = 0; i < 1; i++) {
//                            for (int j = 0; j < 7; j++) {
//                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
//                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
//                                if(j==0)
//                                {
//                                   body61[i][j] = new PdfPCell(new Paragraph("  6    Assessment Year:")); 
//                                   body61[i][j].disableBorderSide(1);
//                                   body61[i][j].disableBorderSide(2);
//                                   body61[i][j].disableBorderSide(4);
//                                   body61[i][j].disableBorderSide(8);
//                                }
//                                if(j==1)
//                                {
//                                   body61[i][j] = new PdfPCell(new Paragraph(xf)); 
//                                   body61[i][j].disableBorderSide(1);
//                                   body61[i][j].disableBorderSide(2);
//                                   body61[i][j].disableBorderSide(4);
//                                   body61[i][j].disableBorderSide(8);
//                                 
//                                }
//                                if(j==2)
//                                {
//                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
//                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
//                                     body61[i][j] = new PdfPCell(new Paragraph("7   Residential Status: Resident")); 
//                                   body61[i][j].disableBorderSide(1);
//                                   body61[i][j].disableBorderSide(2);
//                                   body61[i][j].disableBorderSide(4);
//                                   body61[i][j].disableBorderSide(8);
//                                   // body61[i][j].setCellEvent(simpleBottomLine);
//                                }
//                               
//                                 if(j==3)
//                                {
//                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
//                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
//                                     body61[i][j] = new PdfPCell(new Paragraph(" ")); 
//                                  
//                                }
//                               
//                                  if(j==4)
//                                {
//                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
//                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
//                                     body61[i][j] = new PdfPCell(new Paragraph("/Non-resident")); 
//                                   body61[i][j].disableBorderSide(1);
//                                   body61[i][j].disableBorderSide(2);
//                                   body61[i][j].disableBorderSide(4);
//                                   body61[i][j].disableBorderSide(8);
//                                   // body61[i][j].setCellEvent(simpleBottomLine);
//                                }
//                                 if(j==5)
//                                {
//                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
//                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
//                                     body61[i][j] = new PdfPCell(new Paragraph(" ")); 
//                                  
//                                }
//                                  if(j==6)
//                                {
//                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
//                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
//                                     body61[i][j] = new PdfPCell(new Paragraph(" "));
//                                     body61[i][j].disableBorderSide(1);
//                                   body61[i][j].disableBorderSide(2);
//                                   body61[i][j].disableBorderSide(4);
//                                   body61[i][j].disableBorderSide(8);
//                                  
//                                }
//                               
//                            }
//
//                        }
//                        for (int i = 0; i < 1; i++) {
//                            for (int j = 0; j < 7; j++) {
//                               body6.addCell(body61[i][j]);
//                            }
//                        }
//                        
                        
                        //7
                       
                        PdfPTable body7 = new PdfPTable(9);
                    PdfPCell[][] body71 = new PdfPCell[8][9];
                     float[] columnWidths7 = new float[]{11f, 1f,3f,1f,12f,1f,12f,1f,5f};
                    body7.setWidths(columnWidths7);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body71[i][j] = new PdfPCell(new Paragraph("  7    Status:Individual")); 
                                   body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                                                   
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Firm")); 
                                   body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                               
                                 if(j==3)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                               
                                  if(j==4)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Association of Persions")); 
                                  body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                   // body61[i][j].setCellEvent(simpleBottomLine);
                                }
                                 if(j==5)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                  if(j==6)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph("Hindu Undivided Family")); 
                                  body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                }
                                if(j==7)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                  
                                }
                                if(j==8)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body71[i][j] = new PdfPCell(new Paragraph(" ")); 
                                      body71[i][j].disableBorderSide(1);
                                   body71[i][j].disableBorderSide(2);
                                   body71[i][j].disableBorderSide(4);
                                   body71[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                               body7.addCell(body71[i][j]);
                            }
                        }
                        
                         //8
                       
                        PdfPTable body8 = new PdfPTable(3);
                    PdfPCell[][] body81 = new PdfPCell[2][3];
                     float[] columnWidths8 = new float[]{28f, 20f,2f};
                    body8.setWidths(columnWidths8);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph("  8    Name of the employer/business(where applicable):")); 
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph(" "+ registrationreturn[10]+"", bradley)); 
                                   ar=registrationreturn[10].length();
                                   br=20* 2;
                                   crk=ar/br;
                                  regu[0]=Math.ceil(crk)-1;
                                  System.out.println(regu[0]);
                                  //reg[0]=crk;
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                    body81[i][j].setCellEvent(simpleBottomLine);

                                }
                               if(j==2)
                                {
                                   body81[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body81[i][j].disableBorderSide(1);
                                   body81[i][j].disableBorderSide(2);
                                   body81[i][j].disableBorderSide(4);
                                   body81[i][j].disableBorderSide(8);
                                }
 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body8.addCell(body81[i][j]);
                            }
                        }
                        
                          //9
                       
                        PdfPTable body9 = new PdfPTable(3);
                    PdfPCell[][] body91 = new PdfPCell[2][3];
                     float[] columnWidths9 = new float[]{34f, 18f,2f};
                    body9.setWidths(columnWidths9);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body91[i][j] = new PdfPCell(new Paragraph("  9   Wife/Husband's Name(if assessee,Please Mention TIN):")); 
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                    if(amountt.matches("0"))
                                    {
                                     body91[i][j] = new PdfPCell(new Paragraph(""+namee+"", bradley));    
                                    }
                                    else
                                    {
                                   body91[i][j] = new PdfPCell(new Paragraph(""+namee+"-"+amountt+"", bradley)); 
                                    }
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                    body91[i][j].setCellEvent(simpleBottomLine);
                                      ar=(""+namee+"-"+amountt+"").length();
                                   br=18* 2;
                                   crk=ar/br;
                                  regu[1]=Math.ceil(crk)-1;
//                                  if(regu[1]==1)
//                                  {
//                                     regu[1]=0; 
//                                  }
                                  System.out.println(regu[1]);

                                }
                                if(j==2)
                                {
                                   body91[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body91[i][j].disableBorderSide(1);
                                   body91[i][j].disableBorderSide(2);
                                   body91[i][j].disableBorderSide(4);
                                   body91[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body9.addCell(body91[i][j]);
                            }
                        }
                        
                        //10
                       
                        PdfPTable body10 = new PdfPTable(3);
                    PdfPCell[][] body101 = new PdfPCell[2][3];
                     float[] columnWidths10 = new float[]{10f, 28f,2f};
                    body10.setWidths(columnWidths10);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph("  10   Father's Name:")); 
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[12]+"", bradley)); 
                                  
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                    body101[i][j].setCellEvent(simpleBottomLine);
                                    

                                }
                               if(j==2)
                                {
                                   body101[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body101[i][j].disableBorderSide(1);
                                   body101[i][j].disableBorderSide(2);
                                   body101[i][j].disableBorderSide(4);
                                   body101[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body10.addCell(body101[i][j]);
                            }
                        }
                        
                         //11
                       
                        PdfPTable body11 = new PdfPTable(3);
                    PdfPCell[][] body111 = new PdfPCell[2][3];
                     float[] columnWidths11 = new float[]{10f, 28f,2f};
                    body11.setWidths(columnWidths11);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph("  11   Mother's Name:")); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[13]+"", bradley)); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                    body111[i][j].setCellEvent(simpleBottomLine);
                                    

                                }
                               if(j==2)
                                {
                                   body111[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body111[i][j].disableBorderSide(1);
                                   body111[i][j].disableBorderSide(2);
                                   body111[i][j].disableBorderSide(4);
                                   body111[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body11.addCell(body111[i][j]);
                            }
                        }
                        
                        
                          //12
                       
                        PdfPTable body12 = new PdfPTable(10);
                    PdfPCell[][] body121 = new PdfPCell[9][10];
                     float[] columnWidths12 = new float[]{12f, 2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body12.setWidths(columnWidths12);
                    String[] db=new String[10];
                    int dd=-1;
                    for(int j=0;j<10;j++)
                    {
                    if(j==0||j==1||j==3||j==4||j==6||j==7||j==8||j==9)
                     {
                         dd++;
                       db[dd]=registrationreturn[14].substring(j,(j+1));  
                     }    
                    }
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 10; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body121[i][j] = new PdfPCell(new Paragraph("  13   Date of Birth(in case of individual):")); 
                                   body121[i][j].disableBorderSide(1);
                                   body121[i][j].disableBorderSide(2);
                                   body121[i][j].disableBorderSide(4);
                                   body121[i][j].disableBorderSide(8);
                                }
                                 else if(j==9)
                                 {
                                   body121[i][j] = new PdfPCell(new Paragraph("  ")); 
                                   body121[i][j].disableBorderSide(1);
                                   body121[i][j].disableBorderSide(2);
                                   body121[i][j].disableBorderSide(4);
                                   body121[i][j].disableBorderSide(8); 
                                 }
                                else
                                {
                                 
                                       body121[i][j] = new PdfPCell(new Paragraph(""+db[j-1]+" "));   
                                   
                                 
                                }
                                
                            }

                        }
                         for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 10; j++) {
                               body12.addCell(body121[i][j]);
                            }
                        }
                        
                        
                          //12sub
                       
                        PdfPTable body12sub = new PdfPTable(2);
                    PdfPCell[][] body12sub1 = new PdfPCell[2][2];
                     float[] columnWidths12sub = new float[]{16f, 20f};
                    body12sub.setWidths(columnWidths12sub);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body12sub1[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body12sub1[i][j].disableBorderSide(1);
                                   body12sub1[i][j].disableBorderSide(2);
                                   body12sub1[i][j].disableBorderSide(4);
                                   body12sub1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                   body12sub1[i][j] = new PdfPCell(new Paragraph("Day                 Month                     Year ")); 
                                   body12sub1[i][j].disableBorderSide(1);
                                   body12sub1[i][j].disableBorderSide(2);
                                   body12sub1[i][j].disableBorderSide(4);
                                   body12sub1[i][j].disableBorderSide(8);
                                 
                                }
                                
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                               body12sub.addCell(body12sub1[i][j]);
                            }
                        }
                        
                        
                         //13
                       
                        PdfPTable body13 = new PdfPTable(3);
                    PdfPCell[][] body131 = new PdfPCell[2][3];
                     float[] columnWidths13 = new float[]{14f, 30f,2f};//14f, 30f,2f
                    body13.setWidths(columnWidths13);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph("  14   Address   (a)Present:")); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                   
                                }
                                if(j==1)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[15]+"", bradley)); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                    body131[i][j].setCellEvent(simpleBottomLine);
                                     ar=registrationreturn[15].length();
                                   br=28* 2;
                                   crk=ar/br;
                                  regu[2]=Math.ceil(crk)-1;
                                  if(regu[2]==1)
                                  {
                                     regu[2]=0; 
                                  }
                                  System.out.println(regu[2]);

                                }
                                if(j==2)
                                {
                                   body131[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body131[i][j].disableBorderSide(1);
                                   body131[i][j].disableBorderSide(2);
                                   body131[i][j].disableBorderSide(4);
                                   body131[i][j].disableBorderSide(8);
                                }
                                
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body13.addCell(body131[i][j]);
                            }
                        }
                         //14
                       
                        PdfPTable body14 = new PdfPTable(3);
                    PdfPCell[][] body141 = new PdfPCell[2][3];
                     float[] columnWidths14 = new float[]{14f, 30f,2f};
                    body14.setWidths(columnWidths14);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph("                        (b)Permanent:")); 
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[16]+"", bradley));
                                  
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                    body141[i][j].setCellEvent(simpleBottomLine);
                                     ar=registrationreturn[16].length();
                                   br=28* 2;
                                   crk=ar/br;
                                  regu[3]=Math.ceil(crk)-1;
                                  if(regu[3]==1)
                                  {
                                     regu[3]=0; 
                                  }
                                  System.out.println(regu[3]);

                                }
                                if(j==2)
                                {
                                   body141[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body141[i][j].disableBorderSide(1);
                                   body141[i][j].disableBorderSide(2);
                                   body141[i][j].disableBorderSide(4);
                                   body141[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j <3; j++) {
                               body14.addCell(body141[i][j]);
                            }
                        }
                        
                        //15
                       
                        PdfPTable body15 = new PdfPTable(6);
                    PdfPCell[][] body151 = new PdfPCell[5][6];
                     float[] columnWidths15 = new float[]{3f, 15f,12f,7f,15f,2f};
                    body15.setWidths(columnWidths15);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body151[i][j] = new PdfPCell(new Paragraph("  15   ")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                }
                                if(j==1)
                                {
                                   body151[i][j] = new PdfPCell(new Paragraph("Telephone:Office/Business:")); 
                                    body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                 
                                }
                                if(j==2)
                                {
                                  // tickcell[i][j] = new PdfPCell(new Paragraph("Normal")); 
                                 //  bodyl1[i][j].setCellEvent(simpleBottomLine);
                                     body151[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[17]+"")); 
                                    body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                    body151[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==3)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph("Residential:")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                                 if(j==4)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[18]+"")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
                                   body151[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               if(j==5)
                                {
                                   
                                   body151[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body151[i][j].disableBorderSide(1);
                                   body151[i][j].disableBorderSide(2);
                                   body151[i][j].disableBorderSide(4);
                                   body151[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                            }
                            
                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body15.addCell(body151[i][j]);
                            }
                        }
                        
                        // 16
                       
                        PdfPTable body16 = new PdfPTable(3);
                    PdfPCell[][] body161 = new PdfPCell[2][3];
                     float[] columnWidths16 = new float[]{18f, 18f,2f};
                    body16.setWidths(columnWidths16);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                              
                                 if(j==0)
                                {
                                   body161[i][j] = new PdfPCell(new Paragraph("  16    VAT Registration Number(if any):")); 
                                   body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    if(registrationreturn[18].matches("0"))
                                    {
                                      body161[i][j] = new PdfPCell(new Paragraph(" "));  
                                    }
                                    else
                                    {
                                    body161[i][j] = new PdfPCell(new Paragraph(""+ registrationreturn[18]+" "));    
                                    }
                                    
                                    body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                   body161[i][j].setCellEvent(simpleBottomLine);
                                }
                                if(j==2)
                                {
                                   body161[i][j] = new PdfPCell(new Paragraph(" ")); 
                                   body161[i][j].disableBorderSide(1);
                                   body161[i][j].disableBorderSide(2);
                                   body161[i][j].disableBorderSide(4);
                                   body161[i][j].disableBorderSide(8);
                                } 
                            }

                        }
                         for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                               body16.addCell(body161[i][j]);
                            }
                        }
                        double sumgapp=0;
                        for(int i=0;i<4;i++)
                        {
                         sumgapp=regu[i]+sumgapp;   
                        }
                        if(sumgapp>0)
                        {
                           for(int i=0;i<(17+sumgapp);i++)
                           {
                              document.add(new Paragraph("         ")); 
                           }
                          
                        }
                        else
                        {
                          for(int i=0;i<(23+sumgapp);i++)
                           {
                              document.add(new Paragraph("         ")); 
                           }
                           
                        }
                         
                         
                       
                        //MAIN BODY
                           Rectangle BODY = new Rectangle(18,530,580,10);
                           ColumnText BODY1 = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                           BODY.setBorderColor(BaseColor.BLACK);
                           BODY.setBorder(Rectangle.BOX); 
                           BODY.setBorderWidth(1);
                           document.add(BODY);
                           BODY1.setSimpleColumn(BODY);
                          // BODY1.addElement(new Paragraph("  "));
                           //1
                           body1.setWidthPercentage(100);
                           BODY1.addElement((body1));
                           //2
                           body2.setWidthPercentage(100);
                           BODY1.addElement((body2));
                           BODY1.addElement(new Paragraph("  "));
//                           //3
                           body3.setWidthPercentage(100);
                           BODY1.addElement((body3));
                           BODY1.addElement(new Paragraph("  "));
//                            //4
                            body4.setWidthPercentage(100);
                           BODY1.addElement((body4));
                            BODY1.addElement(new Paragraph("  "));
                           //5
                           body5.setWidthPercentage(100);
                           BODY1.addElement((body5));
//                           //6
//                           body6.setWidthPercentage(100);
//                           BODY1.addElement((body6));
                            //7
                            body7.setWidthPercentage(100);
                           BODY1.addElement((body7));
                            //8
                            body8.setWidthPercentage(100);
                           BODY1.addElement((body8));
                           //9
                           body9.setWidthPercentage(100);
                           BODY1.addElement((body9));
                            //10
                            body10.setWidthPercentage(100);
                           BODY1.addElement((body10));
                            //11
                            body11.setWidthPercentage(100);
                           BODY1.addElement((body11));
                            //12
                            body12.setWidthPercentage(100);
                             BODY1.addElement(new Paragraph("  "));
                           BODY1.addElement((body12));
                           //12sub
                           body12sub.setWidthPercentage(100);
                           BODY1.addElement((body12sub));
                            //11
                            body13.setWidthPercentage(100);
                           BODY1.addElement((body13));
                            //11
                            body14.setWidthPercentage(100);
                           BODY1.addElement((body14));
                           //15
                           body15.setWidthPercentage(100);
                           BODY1.addElement((body15));
                          // 16
                           body16.setWidthPercentage(100);
                           BODY1.addElement((body16));

                           BODY1.go(); 
                        //income asseessee
                        for(int i=0;i<8;i++)
                           {
                              document.add(new Paragraph("         ")); 
                           }
                        //header 1
                         PdfPTable pdfPTabletaxcountass = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass1 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass12 = new float[]{10f,25f};
                           Font aa = new Font(Font.FontFamily.HELVETICA, 13,Font.UNDERLINE  );
                    pdfPTabletaxcountass.setWidths(columnWidthsassesseass12);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass1[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass1[i][j] = new PdfPCell(new Paragraph("Statement of income of the Assessee",aa)); 
                                    pdfPCelltaxcountass1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass1[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass.addCell(pdfPCelltaxcountass1[i][j]);
                            }
                        }
                        //header 2
                         PdfPTable pdfPTabletaxcountass2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122 = new float[]{20f,25f};
                           Font aa2 = new Font(Font.FontFamily.HELVETICA, 10 );
                    pdfPTabletaxcountass2.setWidths(columnWidthsassesseass122);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12[i][j] = new PdfPCell(new Paragraph("State of Income during year ended on :",aa2));
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12[i][j] = new PdfPCell(new Paragraph("              30 June  " + registrationreturn[7] + "", bradley)); 
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12[i][j].disableBorderSide(8);
                                     pdfPCelltaxcountass12[i][j].setCellEvent(simpleBottomLine);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2.addCell(pdfPCelltaxcountass12[i][j]);
                            }
                        }
                        document.add((pdfPTabletaxcountass));
                        document.add(pdfPTabletaxcountass2);
                        document.add(new Paragraph("         "));
                        PdfPTable pdfPTabletaxcount16 = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxcount16 = new PdfPCell[datataxcount16.length][4];
                         float[] columnWidthsassessee = new float[]{3f,22f,3f,6f};
                    pdfPTabletaxcount16.setWidths(columnWidthsassessee);
                    Font tax = new Font(Font.FontFamily.HELVETICA, 11  );
                        for (int i = 0; i < datataxcount16.length; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0 && j==0)
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph("16     ")); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                
                                 else if(i==0 && j==2 )
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j])); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                 else if(i==0 &&  j==3)
                                {
                                   pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j])); 
                                    pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                else if(i!=5 && j==2)
                                {
                                 pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j]));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                }
                                else if(i!=5 && j==3)
                                {
                                 pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j],tax));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);
                                    pdfPCelltaxcount16[i][j].setCellEvent(simpleBottomLine);
                                }
                                else
                                {
                                  pdfPCelltaxcount16[i][j] = new PdfPCell(new Paragraph(datataxcount16[i][j],tax));
                                  pdfPCelltaxcount16[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16[i][j].disableBorderSide(8);   
                                }
                                 
                            }

                        }
                        for (int i = 0; i < datataxcount16.length; i++) {
                            for (int j = 0; j <4; j++) {
                                pdfPTabletaxcount16.addCell(pdfPCelltaxcount16[i][j]);
                            }
                        }
                         PdfPTable pdfPTabletaxcount16p = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcount16p1 = new PdfPCell[10][2];
                         float[] columnWidthsassesseep1 = new float[]{2f,6f};
                    pdfPTabletaxcount16p.setWidths(columnWidthsassesseep1);
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 2; j++) {
                               
                                if(i==8 && j==1)
                                {
                                 pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph(Integer.toString(paymentsum),tax));
                                 pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);  
                                    pdfPCelltaxcount16p1[i][j].setCellEvent(simpleBottomLine);
                                }
                               else if(i==8 && j==0)
                                {
                                 pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph("Tk",tax));
                                 pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);  
                                }
                                else
                                {
                                  pdfPCelltaxcount16p1[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcount16p1[i][j].disableBorderSide(1);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcount16p1[i][j].disableBorderSide(4);
                                    pdfPCelltaxcount16p1[i][j].disableBorderSide(8);   
                                }
                                 
                            }

                        }
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j <2; j++) {
                                pdfPTabletaxcount16p.addCell(pdfPCelltaxcount16p1[i][j]);
                            }
                        }
                        
                        PdfPTable pdfPTabletaxcount = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcount = new PdfPCell[23][23];
                         float[] columnWidthsassesse = new float[]{35f,10f};
                    pdfPTabletaxcount.setWidths(columnWidthsassesse);
                        for (int i = 0; i < datataxcount.length; i++) {
                            for (int j = 0; j < datataxcount[i].length; j++) {
                                if(i==0 && (j==0||j==1))
                                {
                                  pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j],CUSTOM_FONT));  
                                }
                                //paymentsum
                                else if (i == 16 && j == 0) {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(pdfPTabletaxcount16);
                                }
                                else if (i == 16 && j == 1) {
                                    pdfPCelltaxcount[i][j] = new PdfPCell((pdfPTabletaxcount16p));
                                }
                                else if(i!=16 && j==1)
                                {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j]+"/=",tax));
                                }
                                else
                                {
                                    pdfPCelltaxcount[i][j] = new PdfPCell(new Paragraph(datataxcount[i][j],tax)); 
                                }
                            }

                        }
                        for (int i = 0; i < datataxcount.length; i++) {
                            for (int j = 0; j < datataxcount[i].length; j++) {
                                pdfPTabletaxcount.addCell(pdfPCelltaxcount[i][j]);
                            }
                        }
                        pdfPTabletaxcount.setWidthPercentage(95);
                        document.add(pdfPTabletaxcount);
                       Font ift = new Font(Font.FontFamily.HELVETICA, 9,Font.BOLDITALIC  );
                        document.add(new Paragraph("                      *If needed, please use separate sheet  ",ift));
                        
                        //verify 2
                         PdfPTable pdfPTabletaxcountass2v = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12v = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122v = new float[]{20f,25f};
                         
                          
                    pdfPTabletaxcountass2v.setWidths(columnWidthsassesseass122v);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12v[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12v[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12v[i][j] = new PdfPCell(new Paragraph("Verification",aa2v)); 
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12v[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12v[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2v.addCell(pdfPCelltaxcountass12v[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2v);
                        document.add(new Paragraph("          "));
                        //i am
                         PdfPTable pdfPTabletaxcountass2am = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxcountass12am = new PdfPCell[1][4];
                         float[] columnWidthsassesseass122am = new float[]{3f,15f,8f,17f};
                           Font aa2am = new Font(Font.FontFamily.HELVETICA, 15,Font.UNDERLINE );
                    pdfPTabletaxcountass2am.setWidths(columnWidthsassesseass122am);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph(" I"));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "", bradley));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12am[i][j].setCellEvent(simpleBottomLine);
                                }
                                 else if( j==2)
                                {
                                  pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("Father/Husband:"));
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12am[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[12] + "", bradley)); 
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12am[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12am[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12am[i][j].setCellEvent(simpleBottomLine);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 4; j++) {
                               pdfPTabletaxcountass2am.addCell(pdfPCelltaxcountass12am[i][j]);
                            }
                        }
                        pdfPTabletaxcountass2am.setWidthPercentage(95);
                        document.add(pdfPTabletaxcountass2am);
                        //i am
                         PdfPTable pdfPTabletaxcountass2amu = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12amu = new PdfPCell[1][3];
                         float[] columnWidthsassesseass122amu = new float[]{7f,10f,32f};
                        
                    pdfPTabletaxcountass2amu.setWidths(columnWidthsassesseass122amu);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("UTIN/TIN:"));
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("" + text + ""));
                                  pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12amu[i][j].setCellEvent(simpleBottomLine);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12amu[i][j] = new PdfPCell(new Paragraph("solemnly declare that to the best of my knowledge and",aa2amu )); 
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12amu[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12amu[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2amu.addCell(pdfPCelltaxcountass12amu[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2amu);
                       // document.add(new Paragraph("             I am  " + registrationreturn[1] + ".     Father/Mother: " + registrationreturn[10] + ". TIN :  " + text + ".  solemnly declare that to the best  "));
                        document.add(new Paragraph("             belief the given in this return and statements and documents annexed here with is correct"));
                        document.add(new Paragraph("             and complete.  "));
                        
                         
                        //left
                        
                         PdfPTable pdfPTabletaxcountass2au1 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12au1 = new PdfPCell[5][2];
                         float[] columnWidthsassesseass122au1 = new float[]{5f,25f};

                    pdfPTabletaxcountass2au1.setWidths(columnWidthsassesseass122au1);
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("Place:"));
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                }
                                else if(i==0&& j==1) 
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph(""+registrationreturn[15]+" ", bradley));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                    pdfPCelltaxcountass12au1[i][j].setCellEvent(simpleBottomLine);
                                    ar=registrationreturn[15].length();
                                    br=25*1.76;
                                    crk=ar/br;
                                    incom[0]=Math.ceil(crk)-1;
                                    System.out.println(incom[0]);
                                    
                                }
                                else if(i==1&& j==0) 
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("Date:"));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);
                                }
                                else if(i==1&& j==1)
                                {
                                   pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph("" + cyear.getDayOfMonth() + "/" + cyear.getMonthValue() + "/" + cyear.getYear() + ""));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8); 
                                    pdfPCelltaxcountass12au1[i][j].setCellEvent(simpleBottomLine);
                                }
                                else
                                {
                                  pdfPCelltaxcountass12au1[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcountass12au1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au1[i][j].disableBorderSide(8);   
                                }
                            }

                        }
                        for (int i = 0; i <5; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2au1.addCell(pdfPCelltaxcountass12au1[i][j]);
                            }
                        }
                        //rifgt
                        
                         PdfPTable pdfPTabletaxcountass2au2 = new PdfPTable(1);
                        PdfPCell[][] pdfPCelltaxcountass12au2 = new PdfPCell[5][1];
                         float[] columnWidthsassesseass122au2 = new float[]{25f};
                        
                    pdfPTabletaxcountass2au2.setWidths(columnWidthsassesseass122au2);
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 1; j++) {
                                if(i==0)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("          Signature"));
                                   // pdfPCelltaxcountass12au[i][j] = new PdfPCell( pdfPTabletaxcountass2au1);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                else if( i==1)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("   ( " + registrationreturn[1] + ") ", bradley));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                
                                else if( i==2)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("      (Name in Block Letters) "));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                else if( i==3)
                                {
                                  pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("             Designation and  "));
                                  pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12au2[i][j] = new PdfPCell(new Paragraph("      Seal (For other Than Indivisual)",aa2amu )); 
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au2[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <5; i++) {
                            for (int j = 0; j < 1; j++) {
                               pdfPTabletaxcountass2au2.addCell(pdfPCelltaxcountass12au2[i][j]);
                            }
                        }
                        //root
                         PdfPTable pdfPTabletaxcountass2au = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12au = new PdfPCell[1][3];
                         float[] columnWidthsassesseass122au = new float[]{30f,2f,25f};
                           
                    pdfPTabletaxcountass2au.setWidths(columnWidthsassesseass122au);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i==0&& j==0)
                                {
                                  pdfPCelltaxcountass12au[i][j] = new PdfPCell(pdfPTabletaxcountass2au1);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                                else if( j==1)
                                {
                                  pdfPCelltaxcountass12au[i][j] = new PdfPCell(new Paragraph(" "));
                                  pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                                
                                else
                                {
                                    pdfPCelltaxcountass12au[i][j] = new PdfPCell(pdfPTabletaxcountass2au2); 
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12au[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12au[i][j].disableBorderSide(8);
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2au.addCell(pdfPCelltaxcountass12au[i][j]);
                            }
                        }
                       // document.add(new Paragraph("          "));
                       // document.add(new Paragraph("          "));
                        
                       pdfPTabletaxcountass2au.setWidthPercentage(95);
                        document.add(pdfPTabletaxcountass2au);
                       
                        
                        
                         for(int i=0;i<5-incom[0];i++)
                        {
                           document.add(new Paragraph("          ")); 
                        }    
                        
                       
                        
                         //Salary part
                           // document.add(new Paragraph("         "));
                       
                        document.add(new Paragraph("                                                  SHEDULES SHOWING DETAILS OF INCOME"));
                        document.add(new Paragraph("         "));
                         //body 3 er subtable
                         PdfPTable body4subs = new PdfPTable(12);
                    PdfPCell[][] body41subs = new PdfPCell[12][12];
                     float[] columnWidths4subs = new float[]{2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f};
                    body4subs.setWidths(columnWidths4subs);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                               body41subs[i][j] = new PdfPCell(new Paragraph(" "+registrationreturn[4].substring(j,(j+1))+""));
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 12; j++) {
                               body4subs.addCell(body41subs[i][j]);
                            }
                        }
                        
                         //body salary
                        PdfPTable body4s = new PdfPTable(4);
                    PdfPCell[][] body41s = new PdfPCell[4][4];
                     float[] columnWidths4s = new float[]{12f, 20f,2f,24f};
                     Font aa2au = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4s.setWidths(columnWidths4s);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41s[i][j] = new PdfPCell(new Paragraph("Name of The Assessee:",aa2au)); 
                                   body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41s[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley1)); 
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                    body41s[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41s[i][j] = new PdfPCell(new Paragraph("TIN:",aa2au)); 
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41s[i][j]= new PdfPCell(body4subs);
                                    body41s[i][j].disableBorderSide(1);
                                   body41s[i][j].disableBorderSide(2);
                                   body41s[i][j].disableBorderSide(4);
                                   body41s[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4s.addCell(body41s[i][j]);
                            }
                        }
                        body4s.setWidthPercentage(95);
                         document.add( body4s);
                       // document.add(new Paragraph("                            Name of The Assessee:  " + registrationreturn[1] + "                               TIN:    " + text + " "));
                        document.add(new Paragraph("         "));
                        
                        //shedules
                         PdfPTable pdfPTabletaxcountass2vs = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vs = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vs = new float[]{20f,25f};
                        
                    pdfPTabletaxcountass2vs.setWidths(columnWidthsassesseass122vs);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vs[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vs[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vs[i][j] = new PdfPCell(new Paragraph("Shedules-1(Salaries)",aa2v)); 
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vs[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vs[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vs.addCell(pdfPCelltaxcountass12vs[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vs);
                       // document.add(new Paragraph("                                                         Shedules-1(Salaries)"));
                        document.add(new Paragraph("         "));
                        PdfPTable pdfPTableSalary = new PdfPTable(4);
                        PdfPCell[][] pdfPCellSalary = new PdfPCell[23][23];
                        float[] columnWidthsassesseass122s = new float[]{20f,8f,8f,8f};
                          
                          // Font aa2s = new Font(Font.FontFamily.HELVETICA, 15,Font.UNDERLINE );
                        pdfPTableSalary.setWidths(columnWidthsassesseass122s);
                        for (int i = 0; i < dataSalary.length; i++) {
                            for (int j = 0; j < dataSalary[i].length; j++) {
                                pdfPCellSalary[i][j] = new PdfPCell(new Paragraph(dataSalary[i][j],aa2vs));
                            }

                        }
                        for (int i = 0; i < dataSalary.length; i++) {
                            for (int j = 0; j < dataSalary[i].length; j++) {
                                pdfPTableSalary.addCell(pdfPCellSalary[i][j]);
                            }
                        }
                        document.add(pdfPTableSalary);
                        //house Property

                        document.add(new Paragraph("         "));
                        //shedules house property
                         PdfPTable pdfPTabletaxcountass2vsh = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vsh = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vsh = new float[]{10f,30f};
                    pdfPTabletaxcountass2vsh.setWidths(columnWidthsassesseass122vsh);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vsh[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vsh[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vsh[i][j] = new PdfPCell(new Paragraph("Schedule-2(House Property Income)",aa2v)); 
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vsh[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vsh[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vsh.addCell(pdfPCelltaxcountass12vsh[i][j]);
                            }
                        }
                         document.add(pdfPTabletaxcountass2vsh);
                        
                       // document.add(new Paragraph("                                  Schedule-2(House Property Income)"));
                        document.add(new Paragraph("         "));
                        //houseproperty
                        PdfPTable pdfPTableHouse = new PdfPTable(4);
                        PdfPCell[][] pdfPCellHouse = new PdfPCell[12][4];
                         float[] columnWidthsassesseass122vshp = new float[]{10f,20f,8f,8f};
                    pdfPTableHouse.setWidths(columnWidthsassesseass122vshp);
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(i==0 && j==0)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Location and description of property",aa2vs)); 
                                } 
                                if(i==0 && j==1)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Particulars",aa2vs)); 
                                } 
                                if(i==0 && j==2)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Tk")); 
                                } 
                                 if(i==0 && j==3)
                                {
                                   pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("Tk")); 
                                } 
                                  if(i!=0 &&i<12 && j==0)
                                {
                                    if(i==1)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(2);   
                                    }
                                    if(i<11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(2);
                                     pdfPCellHouse[i][j].disableBorderSide(1);
                                    }
                                     if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(1);   
                                    }
                                   
                                } 
                                   if(i!=0 &&i<12 && j==1)
                                {
                                    if(i==1)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 1  "+dataHouse[1][0]+"",aa2vs));
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==2)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 2 Claimed Expense:",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i>2 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "+expense[i-3][0]+"",aa2vs)); 
                                      //pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("                                     Total=:",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                    if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("3. Net income(different between serial )",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   //pdfPCellHouse[i][j].disableBorderSide(1);
                               // pdfPCellHouse[i][j].disableBorderSide(2);
                                   //pdfPCellHouse[i][j].disableBorderSide(4);
                                 
                                } 
                                   if(i!=0 &&i<12 && j==2)
                                {
                                    if(i==1)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    //pdfPCellHouse[i][j].disableBorderSide(8);
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==2)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" "));
                                    pdfPCellHouse[i][j].disableBorderSide(8);
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                   if(i>2 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+expense[i-3][1]+"/=",aa2vs)); 
                                      //pdfPCellHouse[i][j].disableBorderSide(8);
                                    }
                                   if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(4);
                                    }
                                   if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" 1 and 2",aa2vs)); 
                                      pdfPCellHouse[i][j].disableBorderSide(4);
                                    }
                                } 
                                if(i!=0 &&i<12 && j==3)
                                {
                                    if(i==1)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("  "+dataHouse[1][1]+"/=",aa2vs)); 
                                   //pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==2)
                                    {
                                      pdfPCellHouse[i][j]=new PdfPCell(new Paragraph("  ")); 
                                   pdfPCellHouse[i][j].disableBorderSide(4);  
                                    }
                                    if(i==3)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(2);
                                    }
                                    if(i>3 && i<10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(" ")); 
                                      pdfPCellHouse[i][j].disableBorderSide(1);
                                      pdfPCellHouse[i][j].disableBorderSide(2);
                                    }
                                    if(i==10)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+expense[7][1]+"/=",aa2vs)); 
                                    }
                                    if(i==11)
                                    {
                                     pdfPCellHouse[i][j]=new PdfPCell(new Paragraph(""+dataHouse[3][1]+"/=",aa2vs)); 
                                    }
                                   
                                }  
                                
                                // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
//                              
                            }

                        }
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableHouse.addCell(pdfPCellHouse[i][j]);
                            }
                        }
                        document.add(pdfPTableHouse);
                       
                        
                        //tax divate
                        //document.add(new Paragraph("         "));
                        for (int j = 0; j < 4; j++) {
                            document.add(new Paragraph("         "));

                        }
                         PdfPTable pdfPTabletaxcountass2vshi = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vshi = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vshi = new float[]{10f,30f};
                    pdfPTabletaxcountass2vshi.setWidths(columnWidthsassesseass122vshi);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vshi[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshi[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vshi[i][j] = new PdfPCell(new Paragraph("Schedule-3(Investment Tax Credit)",aa2v)); 
                                    pdfPCelltaxcountass12vshi[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshi[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshi[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vshi.addCell(pdfPCelltaxcountass12vshi[i][j]);
                            }
                        }
                       
                          document.add(new Paragraph("         "));
                      
                        document.add(pdfPTabletaxcountass2vshi);
                        document.add(new Paragraph("                                        (Section 44(2) read with part 'B' of Sixth Shedule)"));
                        document.add(new Paragraph("         "));       
                        lentgthnull=vlength.notnulllenth(datataxother);
                                    PdfPTable pdfPTabletaxother = new PdfPTable(4);
                                    PdfPCell[][] pdfPCelltaxother = new PdfPCell[lentgthnull+3][4];
                                    float[] columnWidthsassesseass122vshik = new float[]{6f,18f,2f,5f};
                                    pdfPTabletaxother.setWidths(columnWidthsassesseass122vshik);
                                    Font aa2a = new Font(Font.FontFamily.HELVETICA, 10 );
                                   
                                    for (int ii = 0; ii <(lentgthnull+3); ii++) {
                                        for (int jj = 0; jj < 4; jj++) {
                                            if(ii==0 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Other,s"));  
                                            }
                                            if(ii==0 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" if any(give details)"));  
                                            }
                                           else if(ii==0 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==0 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==1 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==1 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[12][0],aa2a));  
                                            }
                                           else if(ii==1 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Tk", aa2a));  
                                            }
                                           else if(ii==1 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[12][2]+"/=",aa2a));
                                              pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);
                                            }
                                           else if(ii==2 && jj==0)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(" "));  
                                            }
                                           else if(ii==2 && jj==1)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[13][0], aa2a));  
                                            }
                                            else if(ii==2 && jj==2)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph("Tk ", aa2a));  
                                            }
                                           else if(ii==2 && jj==3)
                                            {
                                              pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxdibate[13][2]+"/=", aa2a));
                                              pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);
                                            }
                                           else if(ii>2 && ii<8)
                                           {
                                             
                                             
                                               if(jj==3)
                                              {
                                                  
                                               pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxother[ii-3][jj]+"/=", aa2a));
                                                 pdfPCelltaxother[ii][jj].setCellEvent(simpleBottomLine);  
                                              }
                                               else
                                               {
                                                pdfPCelltaxother[ii][jj] = new PdfPCell(new Paragraph(datataxother[ii-3][jj], aa2a));    
                                               }
                                           }
                                           pdfPCelltaxother[ii][jj].disableBorderSide(1);
                                            pdfPCelltaxother[ii][jj].disableBorderSide(2);
                                            pdfPCelltaxother[ii][jj].disableBorderSide(4);
                                             pdfPCelltaxother[ii][jj].disableBorderSide(8);
                                        }

                                    }
                                    for (int ii = 0; ii < (lentgthnull+3); ii++) {
                                        for (int jj = 0; jj < 4; jj++) {
                                            pdfPTabletaxother.addCell(pdfPCelltaxother[ii][jj]);
                                        }
                                    }
                                    //root
                        PdfPTable pdfPTabletaxdibate = new PdfPTable(4);
                        PdfPCell[][] pdfPCelltaxdibate = new PdfPCell[23][4];
                        float[] columnWidthsassesseass122vshir = new float[]{3f,30f,3f,8f};
                   pdfPTabletaxdibate.setWidths(columnWidthsassesseass122vshir);
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                              
                                if (i == (9) && j == 1) {

                                    pdfPCelltaxdibate[i][j] = new PdfPCell(pdfPTabletaxother);

                                }
                                else if (i == (9) && j == 3) {

                                    pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph( Integer.toString(oth)+"/=", aa2a));
                                    pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);

                                }
                                else if(i==11 )
                                {
                                    switch(j)
                                    {
                                        case 0:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j]));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                          //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           pdfPCelltaxdibate[i][j].disableBorderSide(8);
                                           break;
                                        }
                                        case 1:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 2:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            //pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 3:
                                        {
                                             pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                            pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                           //pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);
                                           
                                             break;
                                        }
                                    }
                                   
                                   
                                }
                                else {
                                    
                                   
                                    if(j==3)
                                    {
                                         pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j]+"/=", aa2a));
                                         pdfPCelltaxdibate[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                    {
                                         pdfPCelltaxdibate[i][j] = new PdfPCell(new Paragraph(datataxdibate[i][j], aa2a));
                                    }
                                    
                                }
                                if(i==0 )
                                {
                                    switch(j)
                                    {
                                        case 0:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                          //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           pdfPCelltaxdibate[i][j].disableBorderSide(8);
                                           break;
                                        }
                                        case 1:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 2:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                             break;
                                        }
                                         case 3:
                                        {
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                            pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                           // pdfPCelltaxdibate[i][j].disableBorderSide(8); 
                                           
                                             break;
                                        }
                                    }
                                   
                                   
                                }
                                
                                if(i<11&& i!=0 && (  j==0||j==1||j==2||j==3))
                                {
                                    if(j==0)
                                    {
                                       pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                 pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   //pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(8);   
                                    }
                                    else if(j==3)
                                            {
                                    pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                   // pdfPCelltaxdibate[i][j].disableBorderSide(8);     
                                            }
                                    else
                                    {
                                         pdfPCelltaxdibate[i][j].disableBorderSide(1);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(2);
                                   pdfPCelltaxdibate[i][j].disableBorderSide(4);
                                    pdfPCelltaxdibate[i][j].disableBorderSide(8);  
                                    }
                                   
                                }

                            }

                        }
                        for (int i = 0; i < 12; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTabletaxdibate.addCell(pdfPCelltaxdibate[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxdibate);
                         document.add(new Paragraph("                      *Please Attach Cirtificates of Investment",ift));
                        //document.add(new Paragraph("                   ******Please Attach Cirtificates of Investment"));
                        //list document
                        //document.add(new Paragraph("         "));
                       
                         PdfPTable pdfPTabletaxcountass2vshil = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vshil = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vshil = new float[]{10f,30f};
                    pdfPTabletaxcountass2vshil.setWidths(columnWidthsassesseass122vshil);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vshil[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshil[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vshil[i][j] = new PdfPCell(new Paragraph("List of documents furnished",aa2v)); 
                                    pdfPCelltaxcountass12vshil[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vshil[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshil[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vshil.addCell(pdfPCelltaxcountass12vshil[i][j]);
                            }
                        }
                         document.add(new Paragraph("              "));
                          document.add(new Paragraph("              "));
                           document.add(new Paragraph("              "));
                         document.add(pdfPTabletaxcountass2vshil);
                        //root
                        String list[][]=
                        {
                            {"1 Salary Statement                                                                       .                                                                               .","6 Advancement Payment Slips"},
                            {"2 MBSTU Loan Statement","7 Copy of Chalan                                                                       .                                                                               ."},
                            {"3 Last Year Income Tax Return Slip                                                                       .                                                                               .","8 Provident Fund statement"},
                            {"4 Insurance Premium Slips","9 Passport Size Photo                                                                       .                                                                               ."},
                            {"5 DPS Statement                                                                       .                                                                               .","10 NID Smart Card Copy"}
                            
                        };
                       
                       
                         document.add(new Paragraph("         "));
                         PdfPTable pdfPTabletaxcountass2vshill = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vshill = new PdfPCell[5][2];
                         float[] columnWidthsassesseass122vshill = new float[]{20f,20f};
                        pdfPTabletaxcountass2vshill.setWidths(columnWidthsassesseass122vshill);
                   
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j]));
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                if(i==0 && j==1 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j]));
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                if(i==4 && j==0 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }
                                   if(i==4 && j==1 )
                                {
                                  pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j]));
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);
                                    
                                  
                                }

                                 if(i==1 || i==2 || i==3)
                                {
                                   
                                    if(j==0)
                                    {
                                         pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j])); 
                                      pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);  
                                    }
                                     if(j==1)
                                    {
                                    pdfPCelltaxcountass12vshill[i][j] = new PdfPCell(new Paragraph(list[i][j])); 
                                    pdfPCelltaxcountass12vshill[i][j].disableBorderSide(1);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vshill[i][j].disableBorderSide(4);
                                  // pdfPCelltaxcountass12vshill[i][j].disableBorderSide(8);  
                                    }
                                    
                                  
                                }
                            }

                        }
                        for (int i = 0; i <5; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vshill.addCell(pdfPCelltaxcountass12vshill[i][j]);
                            }
                        }
                        //document.add(pdfPTabletaxcountass2vshill);
                         //document.add(new Paragraph("1 Salary Statement"));
                        
                         Rectangle BODY3 = new Rectangle(88,400,507,100);
                           ColumnText BODY13 = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                           BODY3.setBorderColor(BaseColor.BLACK);
                           BODY3.setBorder(Rectangle.BOX); 
                           BODY3.setBorderWidth(1);
                           document.add(BODY3);
                           BODY13.setSimpleColumn(BODY3);
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" 1 Salary Statement                                   6 Advancement Payment Slips"));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" 2 MBSTU Loan Statement                       7 Copy of Chalan"));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" 3 Last Year Income Tax Return Slip        8 Provident Fund statement"));
                            BODY13.addElement(new Paragraph(" "));
                            BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" 4 Insurance Premium Slips                     9 Passport Size Photo"));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" 5 DPS Statement                                   10 NID Smart Card Copy"));
                           BODY13.addElement(new Paragraph(" "));
                           BODY13.addElement(new Paragraph(" "));

                           BODY13.go();
                            for (int i = 0; i <21; i++) {
                          document.add(new Paragraph("              ")); 
                        }
                        document.add(new Paragraph("                      Incomplete return is not acceptable",ift));
                        //ASSet libility
                        for (int i = 0; i <4; i++) {
                          document.add(new Paragraph("             ")); 
                        }
                        document.add(new Paragraph("                                                                                                                                                                                                     IT-10B",ift));
                         PdfPTable body4ss = new PdfPTable(4);
                    PdfPCell[][] body41ss = new PdfPCell[4][4];
                     float[] columnWidths4ss = new float[]{20f, 5f,15f,2f};
                     Font aa2aus = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4ss.setWidths(columnWidths4ss);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41ss[i][j] = new PdfPCell(new Paragraph("Statement of assets and liabilities:",aa2au)); 
                                   body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41ss[i][j] = new PdfPCell(new Paragraph("(as on" )); 
                                   body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                   
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41ss[i][j] = new PdfPCell(new Paragraph("30 June "+registrationreturn[7],aa2au)); 
                                     body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
                                    body41ss[i][j].setCellEvent(simpleBottomLine);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41ss[i][j]= new PdfPCell(new Paragraph(")"));
                                  body41ss[i][j].disableBorderSide(1);
                                   body41ss[i][j].disableBorderSide(2);
                                   body41ss[i][j].disableBorderSide(4);
                                   body41ss[i][j].disableBorderSide(8);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4ss.addCell(body41ss[i][j]);
                            }
                        }
                         document.add( body4ss); 
                         document.add(new Paragraph("         "));
                        document.add( body4s);
                        
                                     
                                      //shareholding table
                                      //Assetname2
                                       Font tat = new Font(Font.FontFamily.HELVETICA, 8 );
                                       Font tat2 = new Font(Font.FontFamily.HELVETICA, 8,Font.UNDERLINE );
                                      lentgthnull=vlength.notnulllenth1(Assetname2)+2;
                        PdfPTable pdfPTableasset2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset2 = new PdfPCell[lentgthnull+1][2];
                     float[] share = new float[]{25f,10f};
                      pdfPTableasset2.setWidths(share);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==1)
                                {
                                 pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(dataasset2[i][j],tat2));   
                                }
                                else
                                {
                                 pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(dataasset2[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset2[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                 pdfPCellasset2[i][j].disableBorderSide(1);
                                  pdfPCellasset2[i][j].disableBorderSide(2);
                                   pdfPCellasset2[i][j].disableBorderSide(4);
                                   pdfPCellasset2[i][j].disableBorderSide(8);
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset2.addCell(pdfPCellasset2[i][j]);
                            }
                        }
                        //non agricultural
                         lentgthnull=vlength.notnulllenth1(Assetname3)+2;
                        PdfPTable pdfPTableasset3 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset3 = new PdfPCell[lentgthnull+1][2];
                         float[] share2 = new float[]{25f,10f};
                      pdfPTableasset3.setWidths(share2);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(dataasset3[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(dataasset3[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset3[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                    pdfPCellasset3[i][j].disableBorderSide(1);
                                    pdfPCellasset3[i][j].disableBorderSide(2);
                                   pdfPCellasset3[i][j].disableBorderSide(4);
                                   pdfPCellasset3[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset3.addCell(pdfPCellasset3[i][j]);
                            }
                        }
                        // agricultural
 lentgthnull=vlength.notnulllenth1(Assetname3)+2;
                        PdfPTable pdfPTableasset4 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset4 = new PdfPCell[lentgthnull+1][2];
                         float[] share3 = new float[]{25f,10f};
                      pdfPTableasset4.setWidths(share3);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(dataasset4[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(dataasset4[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset4[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                    pdfPCellasset4[i][j].disableBorderSide(1);
                                    pdfPCellasset4[i][j].disableBorderSide(2);
                                   pdfPCellasset4[i][j].disableBorderSide(4);
                                   pdfPCellasset4[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset4.addCell(pdfPCellasset4[i][j]);
                            }
                        }
//                       

                        // investment
                        PdfPTable pdfPTableasset5 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset5 = new PdfPCell[23][3];
                       
                      pdfPTableasset5.setWidths(share4);
                        for (int i = 0; i < dataasset5.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset5.length-1)
                                {
                                  pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset5.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j]+"/=",tat)); 
                                     pdfPCellasset5[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset5[i][j] = new PdfPCell(new Paragraph(dataasset5[i][j],tat)); 
                                }
                                 pdfPCellasset5[i][j].disableBorderSide(1);
                                    pdfPCellasset5[i][j].disableBorderSide(2);
                                   pdfPCellasset5[i][j].disableBorderSide(4);
                                   pdfPCellasset5[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset5.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                pdfPTableasset5.addCell(pdfPCellasset5[i][j]);
                            }
                        }

                        // motor
                        lentgthnull=vlength.notnulllenth1(Assetname6)+2;
                        PdfPTable pdfPTableasset6 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset6 = new PdfPCell[lentgthnull+1][2];
                         float[] share6 = new float[]{25f,10f};
                      pdfPTableasset6.setWidths(share6);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(dataasset6[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(dataasset6[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset6[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                    pdfPCellasset6[i][j].disableBorderSide(1);
                                    pdfPCellasset6[i][j].disableBorderSide(2);
                                   pdfPCellasset6[i][j].disableBorderSide(4);
                                   pdfPCellasset6[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset6.addCell(pdfPCellasset6[i][j]);
                            }
                        }

                        // jwellary
                         lentgthnull=vlength.notnulllenth1(Assetname7)+2;
                        PdfPTable pdfPTableasset7 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset7 = new PdfPCell[lentgthnull+1][2];
                         float[] share7 = new float[]{25f,10f};
                      pdfPTableasset7.setWidths(share7);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(dataasset7[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(dataasset7[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset7[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                    pdfPCellasset7[i][j].disableBorderSide(1);
                                    pdfPCellasset7[i][j].disableBorderSide(2);
                                   pdfPCellasset7[i][j].disableBorderSide(4);
                                   pdfPCellasset7[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset7.addCell(pdfPCellasset7[i][j]);
                            }
                        }

                        // Cash Asset
                          PdfPTable pdfPTableasset10 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset10 = new PdfPCell[23][3];
                        float[] share10 = new float[]{23f,3f,8f};
                      pdfPTableasset10.setWidths(share10);
                        for (int i = 0; i < dataasset10.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset10.length-1)
                                {
                                  pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset10.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j]+"/=",tat)); 
                                     pdfPCellasset10[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset10[i][j] = new PdfPCell(new Paragraph(dataasset10[i][j],tat)); 
                                }
                                 pdfPCellasset10[i][j].disableBorderSide(1);
                                    pdfPCellasset10[i][j].disableBorderSide(2);
                                   pdfPCellasset10[i][j].disableBorderSide(4);
                                   pdfPCellasset10[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset10.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                pdfPTableasset10.addCell(pdfPCellasset10[i][j]);
                            }
                        }
                        
                        // otherasset
                        lentgthnull=vlength.notnulllenth1(Assetname11)+2;
                        PdfPTable pdfPTableasset11 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset11 = new PdfPCell[lentgthnull+1][2];
                         float[] share11 = new float[]{25f,10f};
                      pdfPTableasset11.setWidths(share11);
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i>1&&j==1)
                                {
                                  pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(dataasset11[i][j]+"/=",tat));   
                                }
                                else
                                {
                                  pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(dataasset11[i][j],tat));   
                                }
                                if(i==lentgthnull)
                                {
                                   pdfPCellasset11[i][j] = new PdfPCell(new Paragraph(" "));  
                                }
                                    pdfPCellasset11[i][j].disableBorderSide(1);
                                    pdfPCellasset11[i][j].disableBorderSide(2);
                                   pdfPCellasset11[i][j].disableBorderSide(4);
                                   pdfPCellasset11[i][j].disableBorderSide(8);
                               
                            }

                        }
                        for (int i = 0; i < lentgthnull+1; i++) {
                            for (int j = 0; j < 2; j++) {
                                pdfPTableasset11.addCell(pdfPCellasset11[i][j]);
                            }
                        }
 
                        // lessliability
                        PdfPTable pdfPTableasset12 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset12 = new PdfPCell[23][3];
                        float[] share12 = new float[]{20f,4f,10f};
                      pdfPTableasset12.setWidths(share4);
                        for (int i = 0; i < dataasset12.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset12.length-1)
                                {
                                  pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset12.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j]+"/=",tat)); 
                                     pdfPCellasset12[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset12[i][j] = new PdfPCell(new Paragraph(dataasset12[i][j],tat)); 
                                }
                                 pdfPCellasset12[i][j].disableBorderSide(1);
                                    pdfPCellasset12[i][j].disableBorderSide(2);
                                   pdfPCellasset12[i][j].disableBorderSide(4);
                                   pdfPCellasset12[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset12.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                pdfPTableasset12.addCell(pdfPCellasset12[i][j]);
                            }
                        }

                        // member
                        PdfPTable pdfPTableasset17 = new PdfPTable(2);
                        PdfPCell[][] pdfPCellasset17 = new PdfPCell[23][23];
                        for (int i = 0; i < dataasset17.length; i++) {
                            for (int j = 0; j < dataasset17[i].length; j++) {
                                pdfPCellasset17[i][j] = new PdfPCell(new Paragraph(dataasset17[i][j]));
                            }

                        }
                        for (int i = 0; i < dataasset17.length; i++) {
                            for (int j = 0; j < dataasset17[i].length; j++) {
                                pdfPTableasset17.addCell(pdfPCellasset17[i][j]);
                            }
                        }
                        //source of fund
                        
                          PdfPTable pdfPTableasset19 = new PdfPTable(3);
                        PdfPCell[][] pdfPCellasset19 = new PdfPCell[23][3];
                        float[] share19 = new float[]{21f,5f,8f};
                      pdfPTableasset19.setWidths(share19);
                        for (int i = 0; i < dataasset19.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(i== dataasset19.length-1)
                                {
                                  pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat));   
                                }
                                else if(i>0 &&i!=dataasset19.length-1)
                                {
                                    if(j==2)
                                    {
                                     pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j]+"/=",tat)); 
                                     pdfPCellasset19[i][j].setCellEvent(simpleBottomLine);
                                    }
                                    else
                                   pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat)); 
                                }
                                else{
                                   pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j],tat)); 
                                }
                                 pdfPCellasset19[i][j].disableBorderSide(1);
                                    pdfPCellasset19[i][j].disableBorderSide(2);
                                   pdfPCellasset19[i][j].disableBorderSide(4);
                                   pdfPCellasset19[i][j].disableBorderSide(8); 
                            }

                        }
                        for (int i = 0; i < dataasset19.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                pdfPTableasset19.addCell(pdfPCellasset19[i][j]);
                            }
                        }
                        
//                        PdfPTable pdfPTableasset19 = new PdfPTable(2);
//                        PdfPCell[][] pdfPCellasset19 = new PdfPCell[23][23];
//                        for (int i = 0; i < dataasset19.length; i++) {
//                            for (int j = 0; j < dataasset19[i].length; j++) {
//                                pdfPCellasset19[i][j] = new PdfPCell(new Paragraph(dataasset19[i][j]));
//                            }
//
//                        }
//                        for (int i = 0; i < dataasset19.length; i++) {
//                            for (int j = 0; j < dataasset19[i].length; j++) {
//                                pdfPTableasset19.addCell(pdfPCellasset19[i][j]);
//                            }
//                        }

                        //document.add(pdfPTableasset1);
                        PdfPTable pdfPTableAsset = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset = new PdfPCell[23][4];
                        float[] columnWidth = new float[]{4f,35,4f,8f};
                        pdfPTableAsset.setWidths(columnWidth);
                        //idex 0-9 close
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                            pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset2);   
                                          
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount2)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 if(i==2)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset3);   
                                             
                                          
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount3)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                 if(i==3)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset4);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount4)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                  if(i==4)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset5);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount5)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                   if(i==5)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset6);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount6)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                    if(i==6)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset7);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount7)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                     if(i==7)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                      if(i==8)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                       if(i==9)
                                 {
                                    switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j]));
                                         break;
                                       }
                                       case 1:
                                       {
                                           
                                             pdfPCellAsset[i][j] = new PdfPCell(pdfPTableasset10);   
                                         
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(dataAsset[i][j],tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount10)+"/=",tat));
                                        pdfPCellAsset[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   } 
                                 }
                                   pdfPCellAsset[i][j].disableBorderSide(1);
                                   pdfPCellAsset[i][j].disableBorderSide(2);
                                   pdfPCellAsset[i][j].disableBorderSide(4);
                                   pdfPCellAsset[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset.addCell(pdfPCellAsset[i][j]);
                            }
                        }
                       document.add(new Paragraph(" "));
                        document.add(pdfPTableAsset);
                         for(int i=0;i<15;i++)
                        {
                            document.add(new Paragraph(" ")); 
                        }
                         //index 10 to next
                        
                         //BF
                         PdfPTable pdfPTableAsset11 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11 = new PdfPCell[23][4];
                        float[] columnWidth11 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11.setWidths(columnWidth11); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph(" "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph("                                                                                                                   B/F=",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11[i][j] = new PdfPCell(new Paragraph(Integer.toString(BFSUM)+"/=",tat));
                                        pdfPCellAsset11[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11[i][j].disableBorderSide(1);
                                   pdfPCellAsset11[i][j].disableBorderSide(2);
                                   pdfPCellAsset11[i][j].disableBorderSide(4);
                                   pdfPCellAsset11[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11.addCell(pdfPCellAsset11[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11);
                        //anyother
                        PdfPTable pdfPTableAsset11any = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11any = new PdfPCell[23][4];
                        float[] columnWidth11any = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11any.setWidths(columnWidth11any); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph("10   "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(pdfPTableasset11); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11any[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount11)+"/=",tat));
                                        pdfPCellAsset11any[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11any[i][j].disableBorderSide(1);
                                   pdfPCellAsset11any[i][j].disableBorderSide(2);
                                   pdfPCellAsset11any[i][j].disableBorderSide(4);
                                   pdfPCellAsset11any[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11any.addCell(pdfPCellAsset11any[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11any);
                        //total
                         PdfPTable pdfPTableAsset1 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset1 = new PdfPCell[23][4];
                        float[] columnWidth1 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset1.setWidths(columnWidth1); 
                        for (int i = 10; i < 11; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==10)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph(" "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph( "                                                                                        Total Assets",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph("Tk",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset1[i-10][j] = new PdfPCell(new Paragraph(assetsumm+"/=",tat));
                                        pdfPCellAsset1[i-10][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset1[i-10][j].disableBorderSide(1);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(2);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(4);
                                   pdfPCellAsset1[i-10][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 10; i < 11; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset1.addCell(pdfPCellAsset1[i-10][j]);
                            }
                        }
                        document.add(new Paragraph(" "));
                        document.add(new Paragraph(" "));
                        document.add(pdfPTableAsset1);
                         document.add(new Paragraph(" "));
                        //less liability
                        PdfPTable pdfPTableAsset11less = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less = new PdfPCell[23][4];
                        float[] columnWidth11less = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less.setWidths(columnWidth11less); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph("11   "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(pdfPTableasset12); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount12)+"/=",tat));
                                        pdfPCellAsset11less[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less.addCell(pdfPCellAsset11less[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less);
                         document.add(new Paragraph(" "));
                         //12
                        PdfPTable pdfPTableAsset11less12 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less12 = new PdfPCell[23][4];
                        float[] columnWidth11less12 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less12.setWidths(columnWidth11less12); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("12.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("Net wealth as on last date of this income year                                                                           (difference between total assets & total liabilities)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less12[i][j] = new PdfPCell(new Paragraph(Integer.toString(thisyearincome)+"/=",tat));
                                        pdfPCellAsset11less12[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less12[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less12[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less12.addCell(pdfPCellAsset11less12[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less12);
                         document.add(new Paragraph(" "));
                          //13
                        PdfPTable pdfPTableAsset11less13 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less13 = new PdfPCell[23][4];
                        float[] columnWidth11less13 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less13.setWidths(columnWidth11less13); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("13.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("Net wealth as on last date of previous income year",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less13[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[14]+"/=",tat));
                                        pdfPCellAsset11less13[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less13[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less13[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less13.addCell(pdfPCellAsset11less13[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less13);
                         document.add(new Paragraph(" "));
                         //14
                        PdfPTable pdfPTableAsset11less14 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less14 = new PdfPCell[23][4];
                        float[] columnWidth11less14 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less14.setWidths(columnWidth11less14); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("14.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("Accretion in wealth(difference between serial no. 12 & 13)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less14[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[15]+"/=",tat));
                                        pdfPCellAsset11less14[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less14[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less14[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less14.addCell(pdfPCellAsset11less14[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less14);
                         document.add(new Paragraph(" "));
                          //15a
                        PdfPTable pdfPTableAsset11less15a = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less15a = new PdfPCell[23][4];
                        float[] columnWidth11less15a = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less15a.setWidths(columnWidth11less15a); 
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("15.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("(a) Family Expenditure:(Total expenditure as per From IT 10 BB)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(assetliabilityreturn[16]+"/=",tat));
                                        pdfPCellAsset11less15a[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(""));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("(b) Number of dependent children of the family",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15a[i][j] = new PdfPCell(new Paragraph("",tat));
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less15a[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less15a.addCell(pdfPCellAsset11less15a[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less15a);
                        // document.add(new Paragraph(" "));
                         //15a
                        PdfPTable pdfPTableAsset11less15c = new PdfPTable(5);
                        PdfPCell[][] pdfPCellAsset11less15c = new PdfPCell[23][5];
                        float[] columnWidth11less15c = new float[]{4f,8f,6f,8f,16f};
                        pdfPTableAsset11less15c.setWidths(columnWidth11less15c); 
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 5; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" "));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetcost17[0]),tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                        pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetcost17[1]),tat));
                                       
                                        break;
                                       }
                                       case 4:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                             pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        break;
                                       }
                                   }
                                }
                                if(i==1)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(""));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph("            Adult",tat)); 
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph("               Child",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        break;
                                       }
                                       case 4:
                                       {
                                         pdfPCellAsset11less15c[i][j] = new PdfPCell(new Paragraph(" ",tat));
                                          pdfPCellAsset11less15c[i][j].disableBorderSide(1);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(2);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(4);
                                            pdfPCellAsset11less15c[i][j].disableBorderSide(8);
                                        
                                        break;
                                       }
                                       
                                   }
                                }
                                 
                                  

                            }

                        }
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 5; j++) {
                                pdfPTableAsset11less15c.addCell(pdfPCellAsset11less15c[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less15c);
                         document.add(new Paragraph(" "));
                          //16
                        PdfPTable pdfPTableAsset11less16 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less16 = new PdfPCell[23][4];
                        float[] columnWidth11less16 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less16.setWidths(columnWidth11less16); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("16.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("Total  accretion of wealth(total of serial 14 & 15)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less16[i][j] = new PdfPCell(new Paragraph(toac+"/=",tat));
                                        pdfPCellAsset11less16[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less16[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less16[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less16.addCell(pdfPCellAsset11less16[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less16);
                         document.add(new Paragraph(" "));
                          //19
                        PdfPTable pdfPTableAsset11less19 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less19 = new PdfPCell[23][4];
                        float[] columnWidth11less19 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less19.setWidths(columnWidth11less19); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph("17.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(pdfPTableasset19); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less19[i][j] = new PdfPCell(new Paragraph(Integer.toString(Assetamount19)+"/=",tat));
                                        pdfPCellAsset11less19[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less19[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less19[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less19.addCell(pdfPCellAsset11less19[i][j]);
                            }
                        }
                        document.add(pdfPTableAsset11less19);
                         document.add(new Paragraph(" "));
                         //19
                        PdfPTable pdfPTableAsset11less20 = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less20 = new PdfPCell[23][4];
                        float[] columnWidth11less20 = new float[]{4f,35,4f,8f};
                        pdfPTableAsset11less20.setWidths(columnWidth11less20); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("18.  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("Difference (between serial 16 & 17)",tat)); 
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph("Tk.",tat));
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less20[i][j] = new PdfPCell(new Paragraph(Integer.toString(toac-Assetamount19)+"/=",tat));
                                        pdfPCellAsset11less20[i][j].setCellEvent(simpleBottomLine);
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less20[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less20[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less20.addCell(pdfPCellAsset11less20[i][j]);
                            }
                        }
                        //date
                        //19
                        PdfPTable pdfPTableAsset11less20d = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less2d = new PdfPCell[23][4];
                        float[] columnWidth11less20d = new float[]{27f,3,6f,10f};
                        pdfPTableAsset11less20d.setWidths(columnWidth11less20d); 
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                if(i==0)
                                {
                                   switch(j)
                                   {
                                       case 0:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("  "));
                                         break;
                                       }
                                       case 1:
                                       {
                                            pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("Date",tat));
                                        
                                         break;
                                       }
                                       case 2:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph("" + cyear.getDayOfMonth() + "-" + cyear.getMonth() + "-" + cyear.getYear() + "",tat));
                                        pdfPCellAsset11less2d[i][j].setCellEvent(simpleBottomLine);
                                         break;
                                       }
                                       case 3:
                                       {
                                         pdfPCellAsset11less2d[i][j] = new PdfPCell(new Paragraph(" ",tat)); 
                                        break;
                                       }
                                   }
                                }
                                 
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(1);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(2);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(4);
                                   pdfPCellAsset11less2d[i][j].disableBorderSide(8);

                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less20d.addCell(pdfPCellAsset11less2d[i][j]);
                            }
                        }
                        
                         document.add(new Paragraph(" "));
                          document.add(new Paragraph("                             I solmately declarevthat to the best of knowledge and belief the information given in the IT-10BB is                                                                                   Correct and Complete",tat));
                        document.add(new Paragraph("                                                                                            (" + registrationreturn[1] + ") "));
                        document.add(new Paragraph("                                                                                                                                      Name & Signature Of ASSessee  ",tat));
                       document.add(pdfPTableAsset11less20d);
                       // document.add(new Paragraph("                                                                                            date:" + registrationreturn[7] + " "));
                        document.add(new Paragraph("         "));
                        document.add(new Paragraph("                             *Assets & Liabilities of self,spouse if(she/he is not an assessee),minor children and                                                                                                             dependents(s) to be shown in the above statements",ift));
                        document.add(new Paragraph("         "));
                        document.add(new Paragraph("                             *if needed ,please use seperate sheet",ift));
                        //FORM
                        
                        for(int i=0;i<5;i++)
                        {
                            document.add(new Paragraph("         "));  
                        }
                        
                        document.add(new Paragraph("                                                                                                                                                                                   From No.IT-10BB",ift));
                         PdfPTable pdfPTabletaxcountass2vF = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF = new float[]{20f,25f};
                         
                           Font aa2vF = new Font(Font.FontFamily.HELVETICA,12f, Font.BOLD );
                    pdfPTabletaxcountass2vF.setWidths(columnWidthsassesseass122vF);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF[i][j] = new PdfPCell(new Paragraph("FORM",aa2v)); 
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF.addCell(pdfPCelltaxcountass12vF[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF);
                        document.add(new Paragraph("          "));
                         document.add(new Paragraph("               Statement under section 75(2)(d)(i) and section 80 of the Income tax Ordinace ",aa2vF));
                        document.add(new Paragraph("                              1984(XXXXVI OF 1984) regarding particulars of life style",aa2vF));
                        document.add(new Paragraph("          "));
                        document.add( body4s); 
                         document.add(new Paragraph("         "));
                         //datafamilyexpense
                         PdfPTable pdfPTableAsset11less20df = new PdfPTable(4);
                        PdfPCell[][] pdfPCellAsset11less2df = new PdfPCell[23][4];
                        float[] columnWidth11less20df = new float[]{3f,27,6f,6f};
                        pdfPTableAsset11less20df.setWidths(columnWidth11less20df); 
                        for (int i = 0; i < 14; i++) {
                            for (int j = 0; j < 4; j++) {
                                //pdfPTableasset2
                                 
                                if(j==2)
                                {
                                  pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j]+"/=",tat));  
                                }
                                else if(j==3)
                                {
                                  if(datafamilyexpense[i][j].matches("null"))
                                  {
                                    pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(" "));    
                                  }
                                  else
                                  {
                                    pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j],tat));    
                                  }
                                }
                                else
                                {
                                   pdfPCellAsset11less2df[i][j] = new PdfPCell(new Paragraph(datafamilyexpense[i][j],tat));    
                                }

                            }

                        }
                        for (int i = 0; i < 14; i++) {
                            for (int j = 0; j < 4; j++) {
                                pdfPTableAsset11less20df.addCell(pdfPCellAsset11less2df[i][j]);
                            }
                        }
                         document.add(pdfPTableAsset11less20df); 
                         document.add(new Paragraph(" "));
                          document.add(new Paragraph("                             I solmately declarevthat to the best of knowledge and belief the information given in the IT-10BB is                                                                                   Correct and Complete",tat));
                        document.add(new Paragraph("                                                                                            (" + registrationreturn[1] + ") "));
                        document.add(new Paragraph("                                                                                                                                      Name & Signature Of ASSessee  ",tat));
                       document.add(pdfPTableAsset11less20d);
                       // document.add(new Paragraph("                                                                                            date:" + registrationreturn[7] + " "));
                        document.add(new Paragraph("         "));
                        //document.add(new Paragraph("                             *Assets & Liabilities of self,spouse if(she/he is not an assessee),minor children and                                                                                                             dependents(s) to be shown in the above statements",ift));
                        document.add(new Paragraph("         "));
                        document.add(new Paragraph("                             *if needed ,please use seperate sheet",ift));
        
                          document.add(new Paragraph("                      ....................................................... ........................................................................"));
                         
                          document.add(new Paragraph("                                        Acknowledgement Receipt of Income Tax Return",aa2vF));
                        document.add(new Paragraph("         "));
                     PdfPTable body4sf = new PdfPTable(4);
                    PdfPCell[][] body41sf = new PdfPCell[4][4];
                     float[] columnWidths4sf = new float[]{14f, 13f,10f,10f};
                     Font aa2auf = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sf.setWidths(columnWidths4sf);
                   text = ch.textfieldcheck(registrationreturn[7]);
                        long text1 = text + 1;
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sf[i][j] = new PdfPCell(new Paragraph("Name of The Assessee:",aa2au)); 
                                   body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sf[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley)); 
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                    body41sf[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sf[i][j] = new PdfPCell(new Paragraph("Assessment Year:",tat)); 
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sf[i][j]= new PdfPCell(new Paragraph("" + text + "-" +Long.toString(text1).substring(2, 4)  + " ",tat));
                                    body41sf[i][j].disableBorderSide(1);
                                   body41sf[i][j].disableBorderSide(2);
                                   body41sf[i][j].disableBorderSide(4);
                                   body41sf[i][j].disableBorderSide(8);
                                    body41sf[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sf.addCell(body41sf[i][j]);
                            }
                        }
                        document.add(body4sf);
                       // document.add(new Paragraph("     Name of The Assessee:  " + registrationreturn[1] + "                                     Assessment Year:    " + text + "-" + text1 + ""));
                        document.add(new Paragraph("         "));
                         PdfPTable body4sff = new PdfPTable(6);
                    PdfPCell[][] body41sff = new PdfPCell[4][6];
                     float[] columnWidths4sff = new float[]{7f, 24f,4f,8f,8f,6f};
                     Font aa2auff = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sff.setWidths(columnWidths4sff);
                   
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sff[i][j] = new PdfPCell(new Paragraph("UTIN/TIN:",tat)); 
                                   body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                      body41sff[i][j]= new PdfPCell(body4subs);
                                  // body41sff[i][j] = new PdfPCell(new Paragraph("" + registrationreturn[1] + "",bradley)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sff[i][j] = new PdfPCell(new Paragraph("Circle:",tat)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sff[i][j]= new PdfPCell(new Paragraph("" + registrationreturn[5] + "(Salary)",tat));
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    body41sff[i][j].setCellEvent(simpleBottomLine);
                                    
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                                 if(j==4)
                                {
                                    
                                     body41sff[i][j] = new PdfPCell(new Paragraph("Taxes Zone:",tat)); 
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==5)
                                {
                                   
                                   body41sff[i][j]= new PdfPCell(new Paragraph("" + registrationreturn[6] + "",tat));
                                    body41sff[i][j].disableBorderSide(1);
                                   body41sff[i][j].disableBorderSide(2);
                                   body41sff[i][j].disableBorderSide(4);
                                   body41sff[i][j].disableBorderSide(8);
                                    body41sff[i][j].setCellEvent(simpleBottomLine);
                                    
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 6; j++) {
                               body4sff.addCell(body41sff[i][j]);
                            }
                        }
                        document.add(body4sff);
                        for(int i=0;i<8;i++)
                        {
                           document.add(new Paragraph(" ")); 
                        }
                          PdfPTable pdfPTabletaxcountass2vFl = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vFl = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vFl = new float[]{10f,25f};
                         
                           Font aa2vFl = new Font(Font.FontFamily.HELVETICA,12f, Font.BOLD );
                    pdfPTabletaxcountass2vFl.setWidths(columnWidthsassesseass122vFl);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vFl[i][j] = new PdfPCell(new Paragraph(" "));
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vFl[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vFl[i][j] = new PdfPCell(new Paragraph("Instructions to fill up the Return Form",aa2v)); 
                                  pdfPCelltaxcountass12vFl[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vFl[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vFl[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vFl.addCell(pdfPCelltaxcountass12vFl[i][j]);
                            }
                        }
                        document.add(new Paragraph(" "));
                         document.add(new Paragraph(" "));
                        document.add(pdfPTabletaxcountass2vFl);
                         document.add(new Paragraph(" "));
                        document.add(new Paragraph("               Instruction:",aa2vF));
                       
                         //1
                          PdfPTable pdfPTabletaxcountass2vF1 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF1 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF1 = new float[]{3f,30f};
                         
                           Font aa2vF1 = new Font(Font.FontFamily.HELVETICA,10f, Font.BOLD );
                    pdfPTabletaxcountass2vF1.setWidths(columnWidthsassesseass122vF1);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF1[i][j] = new PdfPCell(new Paragraph("(1)",aa2vF1));
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF1[i][j] = new PdfPCell(new Paragraph("This return of income shall be signed and verified by the individual assessee or paerson as prescribed u/s 75 of the income tax ordinace ,1984.",tat)); 
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF1[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF1[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF1.addCell(pdfPCelltaxcountass12vF1[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF1);
                        //2
                          PdfPTable pdfPTabletaxcountass2vF2 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF2 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF2 = new float[]{3f,30f};
                         
                           Font aa2vF2 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF2.setWidths(columnWidthsassesseass122vF2);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF2[i][j] = new PdfPCell(new Paragraph("(2)",aa2vF1));
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF2[i][j] = new PdfPCell(new Paragraph("Enclose where applicable:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF2[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF2.addCell(pdfPCelltaxcountass12vF2[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF2);
                        //2s
                        String [][] l2=
                        {
                            {""," (a)","Salary statement for salary income;Bank statement for interest;Certificate"
                                + "for interest on saving instruments; Rent agrement receipts of municipal tax & land revenue, statement of house property loan interest,insurence premium for house property income;statement of Professional income as per IT Rule-8; Copy of assessment/income statement & balance sheet for partnership income;"
                                + "Documents of capital gain; Dividend warrant for dividend income ;Statement of other income;Documents in support of investments in savings certificate,LIP,DPS,Zakat,stock/share etc"},
                            {""," (b)","Statement of income and expenditure; Manufacturing A/C ,trading & Profit & Loss A/C and Balance sheet"},
                            {""," (c)","Depreciation chart claiming depreciation as per THIRD SHEDULE of the income Tax Ordinace,1984;"},
                            {""," (d)","Computation of income accotding to income tax law;"},
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF2s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF2s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF2s = new float[]{3f,2f,28f};
                         
                           Font aa2vF2s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF2s.setWidths(columnWidthsassesseass122vF2s);
                        for (int i = 0; i < l2.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                             
                                    pdfPCelltaxcountass12vF2s[i][j] = new PdfPCell(new Paragraph(l2[i][j],tat)); 
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF2s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l2.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF2s.addCell(pdfPCelltaxcountass12vF2s[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF2s);
                        //3
                          PdfPTable pdfPTabletaxcountass2vF3 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF3 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF3 = new float[]{3f,30f};
                         
                           Font aa2vF3 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF3.setWidths(columnWidthsassesseass122vF3);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF3[i][j] = new PdfPCell(new Paragraph("(3)",aa2vF1));
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF3[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF3[i][j] = new PdfPCell(new Paragraph("Enclose separate statement for:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF3[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF3.addCell(pdfPCelltaxcountass12vF3[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF3);
                        //3s
                        String [][] l3=
                        {
                            {""," (a)","any income of the spouse of the assessee(if she/he is not an assessee),minor children and dependan"},
                            {""," (b)","tax exempted /tax free income"},
                            //{""," (c)","Depreciation chart claiming depreciation as per THIRD SHEDULE of the income Tax Ordinace,1984;"},
                            
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF3s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF3s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF3s = new float[]{3f,2f,28f};
                         
                           Font aa2vF3s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF3s.setWidths(columnWidthsassesseass122vF3s);
                        for (int i = 0; i < l3.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                                    pdfPCelltaxcountass12vF3s[i][j] = new PdfPCell(new Paragraph(l3[i][j],tat)); 
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF3s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l3.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF3s.addCell(pdfPCelltaxcountass12vF3s[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF3s);
                        
                         //4
                          PdfPTable pdfPTabletaxcountass2vF4 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF4 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF4 = new float[]{3f,30f};
                         
                           Font aa2vF4 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF4.setWidths(columnWidthsassesseass122vF4);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF4[i][j] = new PdfPCell(new Paragraph("(4)",aa2vF1));
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF4[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF4[i][j] = new PdfPCell(new Paragraph("Fulfillment of the condition laid down in rule-38 is mandatory for submission of a return under 'Self Assessment'",tat)); 
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF4[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF4[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF4.addCell(pdfPCelltaxcountass12vF4[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF4);
                        //5
                          PdfPTable pdfPTabletaxcountass2vF5 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF5 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF5 = new float[]{3f,30f};
                         
                           Font aa2vF5 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF5.setWidths(columnWidthsassesseass122vF5);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF5[i][j] = new PdfPCell(new Paragraph("(5)",aa2vF1));
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF5[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF5[i][j] = new PdfPCell(new Paragraph("Documents furnished to support the declaration should be signed by by the assessee or his /her authorized representative",tat)); 
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF5[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF5[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF5.addCell(pdfPCelltaxcountass12vF5[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF5);
                        //6
                          PdfPTable pdfPTabletaxcountass2vF6 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF6 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF6 = new float[]{3f,30f};
                         
                           Font aa2vF6 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF6.setWidths(columnWidthsassesseass122vF6);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF6[i][j] = new PdfPCell(new Paragraph("(6)",aa2vF1));
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF6[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF6[i][j] = new PdfPCell(new Paragraph("The assessee shall submit his/her photograph with return after every five year",tat)); 
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF6[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF6[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF6.addCell(pdfPCelltaxcountass12vF6[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF6);
                         //7
                          PdfPTable pdfPTabletaxcountass2vF7 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF7 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF7 = new float[]{3f,30f};
                         
                           Font aa2vF7 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF7.setWidths(columnWidthsassesseass122vF7);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF7[i][j] = new PdfPCell(new Paragraph("(7)",aa2vF1));
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF7[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF7[i][j] = new PdfPCell(new Paragraph("Furnished the following information:",aa2vF2)); 
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF7[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF7.addCell(pdfPCelltaxcountass12vF7[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF7);
                        //3s
                        String [][] l7=
                        {
                            {""," (a)","Name,address & TIN of the partners if the assessee is a firm"},
                            {""," (b)","Name of firm address & TIN if the assesseee is a partner"},
                            {""," (c)","Name of the company,address & TIN if the assessee is director"},
                            
                            
                        };
                          PdfPTable pdfPTabletaxcountass2vF7s = new PdfPTable(3);
                        PdfPCell[][] pdfPCelltaxcountass12vF7s = new PdfPCell[l2.length][3];
                         float[] columnWidthsassesseass122vF7s = new float[]{3f,2f,28f};
                         
                           Font aa2vF7s = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF7s.setWidths(columnWidthsassesseass122vF7s);
                        for (int i = 0; i < l7.length; i++) {
                            for (int j = 0; j < 3; j++) {
                                
                                    pdfPCelltaxcountass12vF7s[i][j] = new PdfPCell(new Paragraph(l7[i][j],tat)); 
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(1);
                                    pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF7s[i][j].disableBorderSide(8);
                                  
                                
                            }

                        }
                        for (int i = 0; i <l7.length; i++) {
                            for (int j = 0; j < 3; j++) {
                               pdfPTabletaxcountass2vF7s.addCell(pdfPCelltaxcountass12vF7s[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF7s);
                         //8
                          PdfPTable pdfPTabletaxcountass2vF8 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF8 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF8 = new float[]{3f,30f};
                         
                           Font aa2vF8 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF8.setWidths(columnWidthsassesseass122vF8);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF8[i][j] = new PdfPCell(new Paragraph("(8)",aa2vF1));
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF8[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF8[i][j] = new PdfPCell(new Paragraph("Assets & Liabilities of self , spouse(if she/he is not an assessee),minor children and dependant(s) to be shown in the IT-10B",tat)); 
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF8[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF8[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF8.addCell(pdfPCelltaxcountass12vF8[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF8);
                         //9
                          PdfPTable pdfPTabletaxcountass2vF9 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF9 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF9 = new float[]{3f,30f};
                         
                           Font aa2vF9 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF9.setWidths(columnWidthsassesseass122vF9);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF9[i][j] = new PdfPCell(new Paragraph("(9)",aa2vF1));
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF9[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF9[i][j] = new PdfPCell(new Paragraph("Signature is mandatory for all the assessee or his/her authorized representative. For individual, signature is also mandatory in IT-10B & IT-10BB)",tat)); 
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF9[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF9[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF9.addCell(pdfPCelltaxcountass12vF9[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF9);
                         //10
                          PdfPTable pdfPTabletaxcountass2vF10 = new PdfPTable(2);
                        PdfPCell[][] pdfPCelltaxcountass12vF10 = new PdfPCell[1][2];
                         float[] columnWidthsassesseass122vF10 = new float[]{3f,30f};
                         
                           Font aa2vF10 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
                    pdfPTabletaxcountass2vF10.setWidths(columnWidthsassesseass122vF10);
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 2; j++) {
                                if(i==0 && j==0)
                                {
                                  pdfPCelltaxcountass12vF10[i][j] = new PdfPCell(new Paragraph("(10)",aa2vF1));
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF10[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(8);
                                }
                                else
                                {
                                    pdfPCelltaxcountass12vF10[i][j] = new PdfPCell(new Paragraph("If needed Please Use Seperate sheet",tat)); 
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(1);
                                pdfPCelltaxcountass12vF10[i][j].disableBorderSide(2);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(4);
                                   pdfPCelltaxcountass12vF10[i][j].disableBorderSide(8);
                                  
                                }
                            }

                        }
                        for (int i = 0; i <1; i++) {
                            for (int j = 0; j < 2; j++) {
                               pdfPTabletaxcountass2vF10.addCell(pdfPCelltaxcountass12vF10[i][j]);
                            }
                        }
                        document.add(pdfPTabletaxcountass2vF10);
                        
//                         PdfPTable pdfPTablein = new PdfPTable(2);
//                        PdfPCell[][] pdfPCellin = new PdfPCell[1][2];
//                         float[] columnWidthin = new float[]{3f,30f};
//                         
//                           Font aa2vF101 = new Font(Font.FontFamily.HELVETICA,8f, Font.UNDERLINE );
//                    pdfPTablein.setWidths(columnWidthin);
//                        for (int i = 0; i < 1; i++) {
//                            for (int j = 0; j < 1; j++) {
//                                
//                                if(i==0)
//                                {
//                                   pdfPCellin[i][j] = new PdfPCell( pdfPTabletaxcountass2vF10);  
//                                }
//                                  pdfPCellin[i][j].disableBorderSide(1);
//                                pdfPCellin[i][j].disableBorderSide(2);
//                                    pdfPCellin[i][j].disableBorderSide(4);
//                                  pdfPCellin[i][j].disableBorderSide(8);
//                                  
//                                
//                            }
//
//                        }
//                        for (int i = 0; i <1; i++) {
//                            for (int j = 0; j < 1; j++) {
//                              pdfPTablein.addCell(pdfPCellin[i][j]);
//                            }
//                        }
//                         pdfPTablein.setWidthPercentage(95);
//                        document.add( pdfPTablein);
//                        
                        
                        
                        //MAIN BODY
                           Rectangle BODYl = new Rectangle(70,680,570,300);
                           ColumnText BODY1l = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                           BODYl.setBorderColor(BaseColor.BLACK);
                           BODYl.setBorder(Rectangle.BOX); 
                           BODYl.setBorderWidth(1);
                           document.add(BODYl);
                           BODY1l.setSimpleColumn(BODYl);
                         
                           BODY1l.go();
                           for(int i=0;i<2;i++)
                           {
                               document.add(new Paragraph(" "));
                           }
                          document.add(new Paragraph("             ...................................................................... ........................................................................"));
                          document.add(new Paragraph(" "));
                         document.add(new Paragraph(" "));
                          //total
                          PdfPTable body4sft = new PdfPTable(4);
                    PdfPCell[][] body41sft = new PdfPCell[4][4];
                     float[] columnWidths4sft = new float[]{17f, 10f,10f,8f};
                     Font aa2auft = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sft.setWidths(columnWidths4sft);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sft[i][j] = new PdfPCell(new Paragraph("Total income shown in Return:   Tk.",tat)); 
                                   body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sft[i][j] = new PdfPCell(new Paragraph(assetsumm+"/=",tat)); 
                                   body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                    body41sft[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sft[i][j] = new PdfPCell(new Paragraph("           Tax Paid:     Tk.",tat)); 
                                  body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sft[i][j]= new PdfPCell(new Paragraph(""+paymentsum+"",tat));
                                    body41sft[i][j].disableBorderSide(1);
                                   body41sft[i][j].disableBorderSide(2);
                                   body41sft[i][j].disableBorderSide(4);
                                   body41sft[i][j].disableBorderSide(8);
                                    body41sft[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sft.addCell(body41sft[i][j]);
                            }
                        }
                       
                        document.add(body4sft);
                         document.add(new Paragraph(" "));
                        
                         //net wealth
                          PdfPTable body4sftn = new PdfPTable(4);
                    PdfPCell[][] body41sftn = new PdfPCell[4][4];
                     float[] columnWidths4sftn = new float[]{17f, 10f,10f,8f};
                     Font aa2auftn = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftn.setWidths(columnWidths4sftn);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftn[i][j] = new PdfPCell(new Paragraph("Net Wealth of Assessee:   Tk.",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftn[i][j] = new PdfPCell(new Paragraph(Integer.toString(thisyearincome)+"/=",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                    body41sftn[i][j].setCellEvent(simpleBottomLine);
                                   
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sftn[i][j] = new PdfPCell(new Paragraph("      ",tat)); 
                                  body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftn[i][j]= new PdfPCell(new Paragraph("",tat));
                                    body41sftn[i][j].disableBorderSide(1);
                                   body41sftn[i][j].disableBorderSide(2);
                                   body41sftn[i][j].disableBorderSide(4);
                                   body41sftn[i][j].disableBorderSide(8);
                                   // body41sftn[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sftn.addCell(body41sftn[i][j]);
                            }
                        }
                       
                        document.add(body4sftn);
                         document.add(new Paragraph(" "));
                          //date
                          PdfPTable body4sftd = new PdfPTable(4);
                    PdfPCell[][] body41sftd = new PdfPCell[4][4];
                     float[] columnWidths4sftd = new float[]{10f, 10f,12f,10f};
                     Font aa2auftd = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftd.setWidths(columnWidths4sftd);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftd[i][j] = new PdfPCell(new Paragraph("Date of receipt of return:",tat)); 
                                   body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftd[i][j] = new PdfPCell(new Paragraph("  ",tat)); 
                                    body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                    body41sftd[i][j].setCellEvent(simpleBottomLine);
                                 
                                }
                                if(j==2)
                                {
                                    
                                     body41sftd[i][j] = new PdfPCell(new Paragraph("Serial No. in return register",tat)); 
                                  body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftd[i][j]= new PdfPCell(new Paragraph("  ",tat));
                                    body41sftd[i][j].disableBorderSide(1);
                                   body41sftd[i][j].disableBorderSide(2);
                                   body41sftd[i][j].disableBorderSide(4);
                                   body41sftd[i][j].disableBorderSide(8);
                                    body41sftd[i][j].setCellEvent(simpleBottomLine);
//                                  // tickcell[i][j].setBorderColor(BaseColor.WHITE);
//                                   bodyl1[i][j].disableBorderSide(1);//TOP
//                                    bodyl1[i][j].disableBorderSide(2);//BOTTOM
//                                     //tickcell[i][j].disableBorderSide(4);//LEFT
//                                       tickcell[i][j].disableBorderSide(8);//RIGHT
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 4; j++) {
                               body4sftd.addCell(body41sftd[i][j]);
                            }
                        }
                       
                        document.add(body4sftd);
                         document.add(new Paragraph(" "));
                         //date
                          body4sftdm = new PdfPTable(7);
                    PdfPCell[][] body41sftdm = new PdfPCell[4][7];
                     float[] columnWidths4sftdm = new float[]{10f, 5f,3f,10f,3f,5f,15f};
                     Font aa2auftdm = new Font(Font.FontFamily.HELVETICA, 9 );
                    body4sftdm.setWidths(columnWidths4sftdm);
                  
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                                // PdfPCell cell = new PdfPCell(new Phrase("Test1"));
                                 // bodyl1[i][j].disableBorderSide(Rectangle.LEFT|Rectangle.RIGHT|Rectangle.TOP|Rectangle.BOTTOM);
                                if(j==0)
                                {
                                   body41sftdm[i][j] = new PdfPCell(new Paragraph("Nature of Return:  ",tat)); 
                                   body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                   //body21[i][j].getLeft(2f);
                                }
                                if(j==1)
                                {
                                   body41sftdm[i][j] = new PdfPCell(new Paragraph(" Self ",tat)); 
                                                                   
                                }
                                if(j==2)
                                {
                                    
                                     body41sftdm[i][j] = new PdfPCell(new Paragraph(" ",tat)); 
                                     body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                     
                                }
                                if(j==3)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph("Universal Self",tat));
                                  
                                }
                                if(j==4)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph(" ",tat));
                                  body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                }
                                if(j==5)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph("Normal",tat));
                                  
                                }
                                if(j==6)
                                {
                                   
                                   body41sftdm[i][j]= new PdfPCell(new Paragraph(" ",tat));
                                   body41sftdm[i][j].disableBorderSide(1);
                                   body41sftdm[i][j].disableBorderSide(2);
                                   body41sftdm[i][j].disableBorderSide(4);
                                   body41sftdm[i][j].disableBorderSide(8);
                                  
                                }
                               
                            }

                        }
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 7; j++) {
                                if(j>0)
                                {
                                  body4sftdm.addCell(body41sftdm[i][j]).setHorizontalAlignment(Element.ALIGN_CENTER);  
                                }
                                else
                                {
                                  body4sftdm.addCell(body41sftdm[i][j]);  
                                }
                               
                            }
                        }
                       
                        document.add(body4sftdm);
                        for(int i=0;i<3;i++)
                        {
                            document.add(new Paragraph(" "));
                        }
                         document.add(new Paragraph("                                                                                                                                                                       Signature of Receiving",tat));
                         document.add(new Paragraph("                                                                                                                                                                             Officer with Seal",tat));
                        document.close();
                        outputStream.close();

                        JOptionPane.showMessageDialog(null, "Downloaded Successfully");
                         } catch (Exception j) {
                        j.printStackTrace();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit NIN");

            }
 
    }
    public static void main(String[] args) throws DocumentException, ClassNotFoundException, SQLException, JSONException, IOException {
    Pdf window = new Pdf();
    window.setVisible(true);
   

}
}
