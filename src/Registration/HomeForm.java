/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Registration;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Font;
import java.awt.Toolkit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import Registration.Pdf;
import com.itextpdf.text.Element;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class HomeForm extends JFrame {
                               Font aa2vF = new Font(Font.FontFamily.HELVETICA,12f, Font.BOLD );
     Font tat = new Font(Font.FontFamily.HELVETICA, 10 );
     Pdf pd;
    SimpleBottomLine simpleBottomLine=new SimpleBottomLine();
    validatiocheck vlength = new validatiocheck();
     int lentgthnull, oth=0,othd;
     double ar,br,crk;
     //gap calculate
     double[] regu=new double[4];
     double [] incom=new double[4];
     JMenuItem[] assessmemtyear = new JMenuItem[20];
     JMenuItem[] assessmemtyear1 = new JMenuItem[20];
     JMenuItem[] assessmemtyear2 = new JMenuItem[20];
     JMenuItem[] assessmemtyear3 = new JMenuItem[20];
     JMenuItem[] assessmemtyear4 = new JMenuItem[20];
     JMenuItem[] assessmemtyear5 = new JMenuItem[20];
     JMenuItem[] assessmemtyear6 = new JMenuItem[20];
     
      JMenuItem[] assessmemtyearu = new JMenuItem[20];
     JMenuItem[] assessmemtyear1u = new JMenuItem[20];
     JMenuItem[] assessmemtyear2u = new JMenuItem[20];
     JMenuItem[] assessmemtyear3u = new JMenuItem[20];
     JMenuItem[] assessmemtyear4u = new JMenuItem[20];
     JMenuItem[] assessmemtyear5u = new JMenuItem[20];
     JMenuItem[] assessmemtyear6u = new JMenuItem[20];
     int[] ayear = new int[20];
 JMenu menu;
JButton EXIT;
LocalDateTime cyear = LocalDateTime.now();
int currentyear = (cyear.getYear());
IncomeAssessee ic = new IncomeAssessee();
long TIN;
int vis3 = 0;
int[] totalasset = new int[11];
JMenuBar bar = new JMenuBar();
 JMenu registration ;
JMenu assetliability ;
JMenu investmentf ;
JMenu housepropertyy;
JMenu incomeassee ;
JMenu salary ;
JMenu taxcredit ;
JMenu registration1 ;
JMenu assetliability1 ;
JMenu investmentf1 ;
JMenu housepropertyy1;
JMenu incomeassee1 ;
JMenu salary1k ;
JMenu taxcredit1 ;

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

JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre, centreleft_7_top, centreleft_7_bottom, centreleft_7_centre, centreleft_8_top, centreleft_8_bottom, centreleft_8_centre, centreleft_9_top, centreleft_9_bottom, centreleft_9_centre,
        centreleft_1_top_upper, centreleft_2_top_upper, centreleft_3_top_upper, centreleft_4_top_upper, centreleft_5_top_upper, centreleft_6_top_upper, centreleft_7_top_upper, centreleft_8_top_upper, centreleft_9_top_upper,
        centreleft_1_top_middle, centreleft_2_top_middle, centreleft_3_top_middle, centreleft_4_top_middle, centreleft_5_top_middle, centreleft_6_top_middle, centreleft_7_top_middle, centreleft_8_top_middle, centreleft_9_top_middle,
        centrecentre_1_top, centrecentre_1_bottom, centrecentre_1_centre, centrecentre_2_top, centrecentre_2_bottom, centrecentre_2_centre, centrecentre_3_top, centrecentre_3_bottom, centrecentre_3_centre, centrecentre_4_top, centrecentre_4_bottom, centrecentre_4_centre, centrecentre_5_top, centrecentre_5_bottom, centrecentre_5_centre, centrecentre_6_top, centrecentre_6_bottom, centrecentre_6_centre, centrecentre_7_top, centrecentre_7_bottom, centrecentre_7_centre,
        centrecentre_1_top_upper, centrecentre_2_top_upper, centrecentre_3_top_upper, centrecentre_4_top_upper, centrecentre_5_top_upper, centrecentre_6_top_upper, centrecentre_7_top_upper,
        centrecentre_1_top_middle, centrecentre_2_top_middle, centrecentre_3_top_middle, centrecentre_4_top_middle, centrecentre_5_top_middle, centrecentre_6_top_middle, centrecentre_7_top_middle,
        centreright_1_top, centreright_1_bottom, centreright_1_centre, centreright_2_top, centreright_2_bottom, centreright_2_centre, centreright_3_top, centreright_3_bottom, centreright_3_centre, centreright_4_top, centreright_4_bottom, centreright_4_centre, centreright_5_top, centreright_5_bottom, centreright_5_centre, centreright_6_top, centreright_6_bottom, centreright_6_centre, centreright_7_top, centreright_7_bottom, centreright_7_centre, centreright_8_top, centreright_8_bottom, centreright_8_centre, centreright_9_top, centreright_9_bottom, centreright_9_centre, centreright_10_top, centreright_10_bottom, centreright_10_centre,
        centreright_1_top_upper, centreright_2_top_upper, centreright_3_top_upper, centreright_4_top_upper, centreright_5_top_upper, centreright_6_top_upper, centreright_7_top_upper, centreright_8_top_upper, centreright_9_top_upper, centreright_10_top_upper,
        centreright_1_top_middle, centreright_2_top_middle, centreright_3_top_middle, centreright_4_top_middle, centreright_5_top_middle, centreright_6_top_middle, centreright_7_top_middle, centreright_8_top_middle, centreright_9_top_middle, centreright_10_top_middle;

JScrollPane js;
JButton btn1;
BoxLayout centreleft_1_top_box, centreleft_2_top_box, centreleft_3_top_box, centreleft_4_top_box, centreleft_5_top_box, centreleft_6_top_box, centreleft_7_top_box, centreleft_8_top_box, centreleft_9_top_box,
        centreleft_1_top_box_upper, centreleft_2_top_box_upper, centreleft_3_top_box_upper, centreleft_4_top_box_upper, centreleft_5_top_box_upper, centreleft_6_top_box_upper, centreleft_7_top_box_upper, centreleft_8_top_box_upper, centreleft_9_top_box_upper,
        centrecentre_1_top_box, centrecentre_2_top_box, centrecentre_3_top_box, centrecentre_4_top_box, centrecentre_5_top_box, centrecentre_6_top_box, centrecentre_7_top_box,
        centrecentre_1_top_box_upper, centrecentre_2_top_box_upper, centrecentre_3_top_box_upper, centrecentre_4_top_box_upper, centrecentre_5_top_box_upper, centrecentre_6_top_box_upper, centrecentre_7_top_box_upper,
        centreright_1_top_box, centreright_2_top_box, centreright_3_top_box, centreright_4_top_box, centreright_5_top_box, centreright_6_top_box, centreright_7_top_box, centreright_8_top_box, centreright_9_top_box, centreright_10_top_box,
        centreright_1_top_box_upper, centreright_2_top_box_upper, centreright_3_top_box_upper, centreright_4_top_box_upper, centreright_5_top_box_upper, centreright_6_top_box_upper, centreright_7_top_box_upper, centreright_8_top_box_upper, centreright_9_top_box_upper, centreright_10_top_box_upper;

JLabel centreleft_1_top_label, centreleft_2_top_label, centreleft_3_top_label, centreleft_4_top_label, centreleft_5_top_label, centreleft_6_top_label, centreleft_7_top_label, centreleft_8_top_label, centreleft_9_top_label,
        centreleft_1_top_label_next_exampted1, centreleft_1_top_label_next_taxable1,
        centreleft_2_top_label_next_exampted1, centreleft_2_top_label_next_taxable1,
        centreleft_3_top_label_next_exampted1, centreleft_3_top_label_next_taxable1,
        centreleft_4_top_label_next_exampted1, centreleft_4_top_label_next_taxable1,
        centreleft_5_top_label_next_exampted1, centreleft_5_top_label_next_taxable1,
        centreleft_6_top_label_next_exampted1, centreleft_6_top_label_next_taxable1,
        centreleft_7_top_label_next_exampted1, centreleft_7_top_label_next_taxable1,
        centreleft_8_top_label_next_exampted1, centreleft_8_top_label_next_taxable1,
        centreleft_9_top_label_next_exampted1, centreleft_9_top_label_next_taxable1;

JLabel centrecentre_1_top_label, centrecentre_2_top_label, centrecentre_3_top_label, centrecentre_4_top_label, centrecentre_5_top_label, centrecentre_6_top_label, centrecentre_7_top_label,
        centrecentre_1_top_label_next_1, centrecentre_1_top_label_next_2,
        centrecentre_2_top_label_next_1, centrecentre_2_top_label_next_2,
        centrecentre_3_top_label_next_1, centrecentre_3_top_label_next_2,
        centrecentre_4_top_label_next_1, centrecentre_4_top_label_next_2,
        centrecentre_5_top_label_next_1, centrecentre_5_top_label_next_2,
        centrecentre_6_top_label_next_1, centrecentre_6_top_label_next_2,
        centrecentre_7_top_label_next_1, centrecentre_7_top_label_next_2,
        centrecentre_5_top_label_next_heading;

JLabel centreright_1_top_label, centreright_2_top_label, centreright_3_top_label, centreright_4_top_label, centreright_5_top_label, centreright_6_top_label, centreright_7_top_label, centreright_8_top_label, centreright_9_top_label, centreright_10_top_label,
        centreright_1_top_label_next_exampted1, centreright_1_top_label_next_taxable2,
        centreright_2_top_label_next_exampted1, centreright_2_top_label_next_taxable2,
        centreright_3_top_label_next_exampted1, centreright_3_top_label_next_taxable2,
        centreright_4_top_label_next_exampted1, centreright_4_top_label_next_taxable2,
        centreright_5_top_label_next_exampted1, centreright_5_top_label_next_taxable2,
        centreright_6_top_label_next_exampted1, centreright_6_top_label_next_taxable2,
        centreright_7_top_label_next_exampted1, centreright_7_top_label_next_taxable2,
        centreright_8_top_label_next_exampted1, centreright_8_top_label_next_taxable2,
        centreright_9_top_label_next_exampted1, centreright_9_top_label_next_taxable2,
        centreright_10_top_label_next_exampted1, centreright_10_top_label_next_taxable2,
        centreright_7_top_label_next_taxdeducted1, centreright_7_top_label_next_advancetax2, centreright_7_top_label_next_taxpaid3, centreright_7_top_label_next_adjustrefund4;

JTextField centreleft_1_top_textfield, centreleft_2_top_textfield, centreleft_3_top_textfield, centreleft_4_top_textfield, centreleft_5_top_textfield, centreleft_6_top_textfield, centreleft_7_top_textfield, centreleft_8_top_textfield, centreleft_9_top_textfield,
        centreleft_1_top_textfield_next_exampted1, centreleft_1_top_textfield_next_taxable1,
        centreleft_2_top_textfield_next_exampted1, centreleft_2_top_textfield_next_taxable1,
        centreleft_3_top_textfield_next_exampted1, centreleft_3_top_textfield_next_taxable1,
        centreleft_4_top_textfield_next_exampted1, centreleft_4_top_textfield_next_taxable1,
        centreleft_5_top_textfield_next_exampted1, centreleft_5_top_textfield_next_taxable1,
        centreleft_6_top_textfield_next_exampted1, centreleft_6_top_textfield_next_taxable1,
        centreleft_7_top_textfield_next_exampted1, centreleft_7_top_textfield_next_taxable1,
        centreleft_8_top_textfield_next_exampted1, centreleft_8_top_textfield_next_taxable1,
        centreleft_9_top_textfield_next_exampted1, centreleft_9_top_textfield_next_taxable1,
        centrecentre_1_top_textfield, centrecentre_2_top_textfield, centrecentre_3_top_textfield, centrecentre_4_top_textfield, centrecentre_5_top_textfield, centrecentre_6_top_textfield, centrecentre_7_top_textfield,
        centrecentre_1_top_textfield_next_1, centrecentre_1_top_textfield_next_2,
        centrecentre_2_top_textfield_next_1, centrecentre_2_top_textfield_next_2,
        centrecentre_3_top_textfield_next_1, centrecentre_3_top_textfield_next_2,
        centrecentre_4_top_textfield_next_1, centrecentre_4_top_textfield_next_2,
        centrecentre_5_top_textfield_next_1, centrecentre_5_top_textfield_next_2,
        centrecentre_6_top_textfield_next_1, centrecentre_6_top_textfield_next_2,
        centrecentre_7_top_textfield_next_1, centrecentre_7_top_textfield_next_2,
        centrecentre_5_top_textfield_next_heading,
        centreright_1_top_textfield, centreright_2_top_textfield, centreright_3_top_textfield, centreright_4_top_textfield, centreright_5_top_textfield, centreright_6_top_textfield, centreright_7_top_textfield, centreright_8_top_textfield, centreright_9_top_textfield, centreright_10_top_textfield,
        centreright_1_top_textfield_next_exampted1, centreright_1_top_textfield_next_taxable2,
        centreright_2_top_textfield_next_exampted1, centreright_2_top_textfield_next_taxable2,
        centreright_3_top_textfield_next_exampted1, centreright_3_top_textfield_next_taxable2,
        centreright_4_top_textfield_next_exampted1, centreright_4_top_textfield_next_taxable2,
        centreright_5_top_textfield_next_exampted1, centreright_5_top_textfield_next_taxable2,
        centreright_6_top_textfield_next_exampted1, centreright_6_top_textfield_next_taxable2,
        centreright_7_top_textfield_next_exampted1, centreright_7_top_textfield_next_taxable2,
        centreright_8_top_textfield_next_exampted1, centreright_8_top_textfield_next_taxable2,
        centreright_9_top_textfield_next_exampted1, centreright_9_top_textfield_next_taxable2,
        centreright_10_top_textfield_next_exampted1, centreright_10_top_textfield_next_taxable2,
        centreright_7_top_textfield_next_taxdeducted1, centreright_7_top_textfield_next_advancetax2, centreright_7_top_textfield_next_taxpaid3, centreright_7_top_textfield_next_adjustrefund4;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_7_top_adddetail, centreleft_8_top_adddetail, centreleft_9_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_7_top_add, centreleft_8_top_add, centreleft_9_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end, centreleft_7_top_end, centreleft_8_top_end, centreleft_9_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_8_top_adddetail, centreright_9_top_adddetail, centreright_10_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_8_top_add, centreright_9_top_add, centreright_10_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end, centreright_8_top_end, centreright_9_top_end, centreright_10_top_end;
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
public HomeForm() throws ClassNotFoundException, SQLException {
   


    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Testkk");
    int count = 1;
    for (int i = 0; i < 20; i++) {
        ayear[i] = currentyear - count;
        count++;
        // System.out.print(ayear[i]);

    }
   
    mainbody(ayear);
   

}

public static void main(String[] args) throws ClassNotFoundException {
    HomeForm window1;
    try {
        window1 = new HomeForm();
        window1.setVisible(true);

    } catch (SQLException ex) {
        Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
    }

}

public void mainbody(int[] ayear) {
    mainbody = new JPanel();
    mainbody.setLayout(new BorderLayout());
    left = new JPanel();
    left.setBackground(Color.green);
    right = new JPanel();
    right.setBackground(Color.red);
    top = new JPanel();
    top.setBackground(Color.green);
    bottom = new JPanel();
    bottom.setBackground(Color.blue);
    centre = new JPanel();
    centre.setBackground(Color.black);
    mainbody.add(left, BorderLayout.WEST);
    mainbody.add(right, BorderLayout.EAST);
    mainbody.add(top, BorderLayout.NORTH);
    mainbody.add(bottom, BorderLayout.SOUTH);
    mainbody.add(centre, BorderLayout.CENTER);
    //adding scroll bar
    js = new JScrollPane(mainbody);
    js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    this.add(js);
    top();
    centre(ayear);
    bottom();

}

public void top() {
    JLabel jj = new JLabel("   HomeForm     ");
    top.add(jj);
}

public void centre(int[] ayear) {
    centre.setLayout(new BorderLayout());
    centreleft = new JPanel();
    centreleft.setBackground(Color.yellow);
    centreright = new JPanel();
    centreright.setBackground(Color.orange);
    centrecentre = new JPanel();
    centrecentre.setBackground(Color.gray);
    centre.add(centreleft, BorderLayout.CENTER);//west
    centre.add(centreright, BorderLayout.EAST);
    centre.add(centrecentre, BorderLayout.WEST);//center
    centreleft();
    centreright();
    centremiddle();
    centrebottom();

}

public void addmenubar() {

}

public void centreleft() {
    //main  frst outdoor
    centreleft.setLayout(new BorderLayout());
    centreleft_1_top = new JPanel();
    centreleft_1_centre = new JPanel();
    centreleft_1_bottom = new JPanel();

    centreleft_1_top.add(Box.createVerticalStrut(20));
    centreleft.add(centreleft_1_top, BorderLayout.NORTH);
    centreleft.add(centreleft_1_centre, BorderLayout.CENTER);
    //centreleft.add(centreleft_1_bottom,BorderLayout.SOUTH);

    //second indoor
    centreleft_1_centre.setLayout(new BorderLayout());
    centreleft_2_top = new JPanel();
    centreleft_2_centre = new JPanel();
    centreleft_2_bottom = new JPanel();

    centreleft_2_top.add(Box.createVerticalStrut(20));
    centreleft_1_centre.add(centreleft_2_top, BorderLayout.NORTH);
    centreleft_1_centre.add(centreleft_2_centre, BorderLayout.CENTER);
    //centreleft_1_centre.add(centreleft_2_bottom,BorderLayout.SOUTH);
    //third indoor
    centreleft_2_centre.setLayout(new BorderLayout());
    centreleft_3_top = new JPanel();
    centreleft_3_centre = new JPanel();
    centreleft_3_bottom = new JPanel();

    centreleft_1_top.add(Box.createVerticalStrut(20));
    centreleft_2_centre.add(centreleft_3_top, BorderLayout.NORTH);
    centreleft_2_centre.add(centreleft_3_centre, BorderLayout.CENTER);
    // centreleft_2_centre.add(centreleft_3_bottom,BorderLayout.SOUTH);
    //fourth indoor
    centreleft_3_centre.setLayout(new BorderLayout());
    centreleft_4_top = new JPanel();
    centreleft_4_centre = new JPanel();
    centreleft_4_bottom = new JPanel();

    centreleft_4_top.add(Box.createVerticalStrut(20));
    centreleft_3_centre.add(centreleft_4_top, BorderLayout.NORTH);
    centreleft_3_centre.add(centreleft_4_centre, BorderLayout.CENTER);
    //centreleft_3_centre.add(centreleft_4_bottom,BorderLayout.SOUTH);

    //five indoor
    centreleft_4_centre.setLayout(new BorderLayout());
    centreleft_5_top = new JPanel();
    centreleft_5_centre = new JPanel();
    centreleft_5_bottom = new JPanel();

    centreleft_5_top.add(Box.createVerticalStrut(20));
    centreleft_4_centre.add(centreleft_5_top, BorderLayout.NORTH);
    centreleft_4_centre.add(centreleft_5_centre, BorderLayout.CENTER);
    //centreleft_4_centre.add(centreleft_5_bottom,BorderLayout.SOUTH);

    //six indoor
    centreleft_5_centre.setLayout(new BorderLayout());
    centreleft_6_top = new JPanel();
    centreleft_6_centre = new JPanel();
    centreleft_6_bottom = new JPanel();

    centreleft_6_top.add(Box.createVerticalStrut(20));
    centreleft_5_centre.add(centreleft_6_top, BorderLayout.NORTH);
    centreleft_5_centre.add(centreleft_6_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);
    //seven indoor
    centreleft_6_centre.setLayout(new BorderLayout());
    centreleft_7_top = new JPanel();
    centreleft_7_centre = new JPanel();
    centreleft_7_bottom = new JPanel();

    centreleft_7_top.add(Box.createVerticalStrut(20));
    centreleft_6_centre.add(centreleft_7_top, BorderLayout.NORTH);
    centreleft_6_centre.add(centreleft_7_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);
    //Eight indoor
    centreleft_7_centre.setLayout(new BorderLayout());
    centreleft_8_top = new JPanel();
    centreleft_8_centre = new JPanel();
    centreleft_8_bottom = new JPanel();

    centreleft_8_top.add(Box.createVerticalStrut(20));
    centreleft_7_centre.add(centreleft_8_top, BorderLayout.NORTH);
    centreleft_7_centre.add(centreleft_8_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);
    //nine indoor
    centreleft_8_centre.setLayout(new BorderLayout());
    centreleft_9_top = new JPanel();
    centreleft_9_centre = new JPanel();
    centreleft_9_bottom = new JPanel();

    centreleft_9_top.add(Box.createVerticalStrut(20));
    centreleft_8_centre.add(centreleft_9_top, BorderLayout.NORTH);
    //centreleft_8_centre.add(centreleft_9_centre,BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addleftcontent(ayear);

}

public void addleftcontent(int [] ayear) {
    centreleft_1_top_box = new BoxLayout(centreleft_1_top, BoxLayout.Y_AXIS);
    centreleft_1_top.setLayout(centreleft_1_top_box);
    JButton reg = new JButton("                         Registration                          ");
    centreleft_1_top_textfield = new JTextField();

    reg.addActionListener(e -> {
        AssesseeRegistration kk = new AssesseeRegistration();
        kk.setVisible(true);
        dispose();
    });

    centreleft_1_top.add(reg);
    centreleft_1_top.add(Box.createVerticalStrut(30));

    //2
    centreleft_2_top.setLayout(new BorderLayout());
    JPanel singleleft = new JPanel();
    JPanel singletop = new JPanel();
    JPanel singlemidle = new JPanel();
    JPanel singleright = new JPanel();
    centreleft_2_top.add(singletop, BorderLayout.NORTH);
    centreleft_2_top.add(singleleft, BorderLayout.WEST);
    centreleft_2_top.add(singleright, BorderLayout.EAST);
    centreleft_2_top.add(singlemidle, BorderLayout.CENTER);
    centreleft_2_top_label = new JLabel("Fillup Information(Enter TIN):                                                                                                                                                                                                ", JLabel.LEFT);
    centreleft_2_top_textfield = new JTextField("                                                       ");
    JLabel jl = new JLabel("                                                                          ");
   // JButton search = new JButton("Click      ");
   menu=new JMenu("Click1    ");
    for (int i = 0; i < 11; i++) {
       
        assessmemtyear[i] = new JMenuItem(Integer.toString(ayear[i]));

    }

    for (int i = 0; i < 11; i++) {
        menu.add(assessmemtyear[i]);
    }

    bar = new JMenuBar();
    bar.add(menu);
    setJMenuBar(bar);

    assessmemtyear[0].addActionListener(e -> {
      text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[0]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

       // centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[1].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[1]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[2].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[2]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[3].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[3]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[4].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[4]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[5].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[5]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    assessmemtyear[6].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[6]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[7].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[7]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[8].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[8]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[9].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[9]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
    assessmemtyear[10].addActionListener(e -> {
        text = ch.textfieldcheck(centreleft_2_top_textfield.getText());
        try {
                
            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                AssesseeLiabilty jj = new AssesseeLiabilty();
                jj.accessnin(text,ayear[10]);
                jj.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit TIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    });
  
    singletop.add(centreleft_2_top_label);
    singleleft.add(centreleft_2_top_textfield);
   // singleleft.add(search);
   singleleft.add(bar);
    singleright.add(jl);
    centreleft_3_top.add(Box.createVerticalStrut(30));

    //3
    centreleft_3_top.setLayout(new BorderLayout());
    JPanel allleft = new JPanel();
    JPanel alltop = new JPanel();
    JPanel allmidle = new JPanel();
    JPanel allright = new JPanel();
    JPanel allbottom = new JPanel();
    centreleft_3_top.add(alltop, BorderLayout.NORTH);
    centreleft_3_top.add(allleft, BorderLayout.WEST);
    centreleft_3_top.add(allright, BorderLayout.EAST);
    centreleft_3_top.add(allmidle, BorderLayout.CENTER);

    centreleft_3_top_label = new JLabel("Asseesse Details:                                                                                                                                                                                                                                ", JLabel.LEFT);
    centreleft_3_top_textfield = new JTextField("                                                       ");
    JLabel alljl = new JLabel("                                                                                                                                                 ");
    registration = new JMenu("Registration");
 assetliability = new JMenu("AssetLiability");
 investmentf = new JMenu("Investment");
 housepropertyy = new JMenu("HouseProperty");
 incomeassee = new JMenu("TaxCount");
 salary = new JMenu("Salary(Income)");
 taxcredit = new JMenu("Family Expense");
    
    menu = new JMenu("Click             ");
    //registration
     for (int i = 0; i < 1; i++) {
        assessmemtyear[i] = new JMenuItem("Click");
    }
     for (int i = 0; i < 1; i++) {
        registration.add(assessmemtyear[i]);
    }
     menu.add(registration);
     //assetliability
      for (int i = 0; i < 11; i++) {
        assessmemtyear1[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       assetliability.add(assessmemtyear1[i]);
    }
     
    menu.add(assetliability);
    //investment
     for (int i = 0; i < 11; i++) {
        assessmemtyear2[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       investmentf.add(assessmemtyear2[i]);
    }
     
    menu.add(investmentf);
    //houseproperty
     for (int i = 0; i < 11; i++) {
        assessmemtyear3[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       housepropertyy.add(assessmemtyear3[i]);
    }
    menu.add(housepropertyy);
    //incomeassee
    for (int i = 0; i < 11; i++) {
        assessmemtyear4[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       incomeassee.add(assessmemtyear4[i]);
    }
    menu.add(incomeassee);
    //salary
    for (int i = 0; i < 11; i++) {
        assessmemtyear5[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       salary.add(assessmemtyear5[i]);
    }
    menu.add(salary);
    //taxcredit
     for (int i = 0; i < 11; i++) {
        assessmemtyear6[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       taxcredit.add(assessmemtyear6[i]);
    }
    menu.add(taxcredit);
    
    bar = new JMenuBar();
    bar.add(menu);
    setJMenuBar(bar);
    //registration part
    for(int m=0;m<1;m++)
    {
        int k=m;
        assessmemtyear[k].addActionListener(e -> {
            
        text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            int a = conn.EMPLOYEE(text);
            if (a == 1) {
                registrationreturn = conn.RegistrationReturn(text);
                String[][] data = {
                    {"Type", registrationreturn[0]},
                    {"Name", registrationreturn[1]},
                    {"NID", registrationreturn[2]},
                    {"UTIN", registrationreturn[3]},
                    {"TIN", registrationreturn[4]},
                    {"CIRCLE", registrationreturn[5]},
                    {"TAXZONE", registrationreturn[6]},
                    {"ASSESSMENTYEAR", registrationreturn[7]},
                    {"RESIDENTIALSTATUS", registrationreturn[8]},
                    {"STATUS", registrationreturn[9]},
                    {"NAMEBUSINESS", registrationreturn[10]},
                    {"WIFEHUSBANDNAME", registrationreturn[11]},
                    {"FATHERNAME", registrationreturn[12]},
                    {"MOTHERNAME", registrationreturn[13]},
                    {"DOB", registrationreturn[14]},
                    {"ADDRESSPRESENT", registrationreturn[15]},
                    {"ADDRESSPERMANENT", registrationreturn[16]},
                    {"TELEPHONEOFFICE", registrationreturn[17]},
                    {"TELEPHONERESIDENTIAL", registrationreturn[18]},
                    {"VATNUMBER", registrationreturn[19]},
                    {"IMAGE", registrationreturn[20]}
                };
                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                table.setBounds(30, 40, 200, 300);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);
            } else {
                JOptionPane.showMessageDialog(null, "Not Exit NIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         });
        
    }
    for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear1[k].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            assetliabilityreturn = conn.Assetliavilityreturn(text,ayear[k]);
            if (!assetliabilityreturn[0].matches("-1")) {
                String[][] data = {
                    {"TIN", assetliabilityreturn[0]},
                    {"BUSINESS CAPITAL", assetliabilityreturn[1]},
                    {"SHARE HOLDING", assetliabilityreturn[2]},
                    {"NON-AGRICULTURAL", assetliabilityreturn[3]},
                    {"AGRICULTURAL", assetliabilityreturn[4]},
                    {"INVESTMENT", assetliabilityreturn[5]},
                    {"MOTOR", assetliabilityreturn[6]},
                    {"JEWELLERY", assetliabilityreturn[7]},
                    {"FURNITURE", assetliabilityreturn[8]},
                    {"ELECTRIC EQUIPMENT", assetliabilityreturn[9]},
                    {"CASH ASSET OUTSIDE BUSINESS", assetliabilityreturn[10]},
                    {" ANY OTHER ASSETS", assetliabilityreturn[11]},
                    {"LESS LIABILITY", assetliabilityreturn[12]},
                    {"NET WEALTH THI SYEAR", assetliabilityreturn[13]},
                    {"NET WEALTH LAST YEAR", assetliabilityreturn[14]},
                    {"ACCRETION IN WEALTH", assetliabilityreturn[15]},
                    {"FAMILY EXPENDITURE", assetliabilityreturn[16]},
                    {"DEPENDED MEMBER", assetliabilityreturn[17]},
                    {" TOTAL ACCRETION OF WEALTH1", assetliabilityreturn[18]},
                    {"SOURCES OF FUND", assetliabilityreturn[19]},
                    {"DIFFERENCE", assetliabilityreturn[20]}
                };

                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                table.setBounds(30, 40, 200, 300);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

         });
        
    }

    for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear2[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {
            //int a=conn.EMPLOYEE(text);
            taxdibate = conn.TAXDIBATE(text,ayear[k]);

            if (!taxdibate[0].matches("-1")) {
                String[][] data = {
                    {"Name", "Amount"},
                    {" TIN ", taxdibate[0]},
                    {"LIFEINSURANCE", taxdibate[1]},
                    {"CONTRIBUTIONANNUUITY", taxdibate[2]},
                    {"PROVIDENTFUND1925", taxdibate[3]},
                    {"RECOGNIZEDPROVIDENTFUND", taxdibate[4]},
                    {"SUPERANNUTION", taxdibate[5]},
                    {"SHARESTOCK", taxdibate[6]},
                    {"DEPOSITPENSION", taxdibate[7]},
                    {"GROUPINSURANCE", taxdibate[8]},
                    {"ZAKATFUND", taxdibate[9]},
                    {"SAVINGCERTIFICATE", taxdibate[10]},
                    {"SAVINGSCHEMA", taxdibate[11]},
                    {" OTHER", taxdibate[12]}

                };
                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);

            } else {
                JOptionPane.showMessageDialog(null, "Not inserted Data");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

         });
    
    }
    
      for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear3[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            //int a=conn.EMPLOYEE(text);
            // houseproperty=conn.HOUSEPROPERTYRETURN(text);
            IncomeAssessee ic = new IncomeAssessee();
            ic.accessnin(text,ayear[k]);

            if (!ic.houseproperty[0].matches("-1")) {
                int sum = 0;
                for (int i = 0; i < 7; i++) {
                    sum = sum + ic.option[i];
                }
                String[][] data = {
                    {"Renatal Income", ic.houseproperty[0]},
                    {"Expense(Total)", Integer.toString(sum)},
                    {"Repair", Integer.toString(ic.option[0])},
                    {"Local_Tax", Integer.toString(ic.option[1])},
                    {"Land_Revenue", Integer.toString(ic.option[2])},
                    {"Interest_Loan", Integer.toString(ic.option[3])},
                    {"Insurance_Premium", Integer.toString(ic.option[4])},
                    {"Vacancy_Allowance", Integer.toString(ic.option[5])},
                    {"Other", Integer.toString(ic.option[6])}

                };
                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);

            } else {
                JOptionPane.showMessageDialog(null, "Not Exit NIN");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

         });
         
    }
          for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear4[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            taxcount = conn.TaxCount(text,ayear[k]);

            if (!taxcount[0].matches("-1")) {
                String[][] data = {
                    {"TIN", taxcount[0]},
                    {"SALARIES", taxcount[1]},
                    {"INTERSETSECURITIES", taxcount[2]},
                    {"HOUSEPROPERTY", taxcount[3]},
                    {"AGRICULTURALINCOME", taxcount[4]},
                    {"BUSINESSINCOME", taxcount[5]},
                    {"SHAREPROFIT", taxcount[6]},
                    {"SPOUSEINCOME", taxcount[7]},
                    {"CAPITALGAINS", taxcount[8]},
                    {"OTHERSOURCEINCOME", taxcount[9]},
                    {"TOTAL19", taxcount[10]},
                    {"FORIEGNINCOME", taxcount[11]},
                    {"TOTALINCOME1011", taxcount[12]},
                    {"TAXLEVIABLE", taxcount[13]},
                    {"TAXREBATE", taxcount[14]},
                    {"TAXPAYABLE", taxcount[15]},
                    {"TAXPAYYMENT", taxcount[16]},
                    {"DIFFEREN1516", taxcount[17]},
                    {"TAXFREEINCOME", taxcount[18]},
                    {"TAXPAIDLASTYEAR", taxcount[19]},};

                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                table.setBounds(30, 40, 200, 300);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);

            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    } 

      for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear5[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            salary1 = conn.SALARYRETURN(text,ayear[k]);

            if (!salary1[0].matches("-1")) {
                String[][] data = {
                    {"TIN", salary1[0]},
                    {"BASICPAY", salary1[1]},
                    {"SPECIALPAY", salary1[2]},
                    {"DEARNESSALLOWANCE", salary1[3]},
                    {"CONVEYANCEALLOWANCE", salary1[4]},
                    {"HOUSERENTALLOWANCE", salary1[5]},
                    {"MEDICALALLOWANCE", salary1[6]},
                    {"SERVENTALLOWANCE", salary1[7]},
                    {"LEAVEALLOWANCE", salary1[8]},
                    {"REWARD", salary1[9]},
                    {"EDUCATIONALLOWANCE", salary1[10]},
                    {"BONUS", salary1[11]},
                    {"OTHERALLOWANCE", salary1[12]},
                    {"EMPLOYERCONTRIBUTION", salary1[13]},
                    {"INTERESTACCRUED", salary1[14]},
                    {"INCOMETRANSPORT", salary1[15]},
                    {"INCOMEACCOMMODATION", salary1[16]},
                    {"OTHER", salary1[17]},};
                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);

            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    } 
       for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear6[k].addActionListener(e -> {
           text = ch.textfieldcheck(centreleft_3_top_textfield.getText());
        try {

            familyexpense = conn.FamilyExpense(text,ayear[k]);

            if (!familyexpense[0].matches("-1")) {
                String[][] data = {
                    {" TIN ", familyexpense[0]},
                    {"PARSONAL AND FOODING EXPENSE", familyexpense[1]},
                    {"TAX PAID INCLUDING DEDUCTION AT SOURCE OF THE LAST FINANCIAL YEAR", familyexpense[2]},
                    {"ACCOMMODATION EXPENSES", familyexpense[3]},
                    {"TRANSPORT EXPENSES", familyexpense[4]},
                    {"ELECTRIC BILL FOR RESIDENCE", familyexpense[5]},
                    {"WASA BILL FOR RESIDENCE", familyexpense[6]},
                    {"GAS BILL FOR RESIDENCE", familyexpense[7]},
                    {"TELEPHONE BILL FOR RESIDENCE", familyexpense[8]},
                    {"EDUCATION EXPENSE FOR CHILDREN", familyexpense[9]},
                    {"BANK LOAN INSTALLMENT", familyexpense[10]},
                    {"FESTIVAL AND OTHER SPECIAL EXPENSES,IF ANY", familyexpense[11]},
                    {"MEDICAL PURPOSES", familyexpense[12]},
                    {"TOTAL EXPENSE", familyexpense[13]},};
                String[] columnNames = {"Name", "value"};
                table = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(table);
                JOptionPane.showMessageDialog(null, sp);
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }

         });
         
    } 

    alltop.add(centreleft_3_top_label);
    allleft.add(centreleft_3_top_textfield);
    // allleft.add(allsearch);
    allleft.add(bar);
    allright.add(alljl);
    centreleft_3_top.add(Box.createVerticalStrut(30));

    //4
    //4
    centreleft_4_top.setLayout(new BorderLayout());
    JPanel allleft4 = new JPanel();
    JPanel alltop4 = new JPanel();
    JPanel allmidle4 = new JPanel();
    JPanel allright4 = new JPanel();
    JPanel allbottom4 = new JPanel();
    centreleft_4_top.add(alltop4, BorderLayout.NORTH);
    centreleft_4_top.add(allleft4, BorderLayout.WEST);
    centreleft_4_top.add(allright4, BorderLayout.EAST);
    centreleft_4_top.add(allmidle4, BorderLayout.CENTER);

    centreleft_4_top_label = new JLabel("Edit Information:                                                                                                                                                                                                                     ", JLabel.LEFT);
    centreleft_4_top_textfield = new JTextField("                                                       ");
    JLabel alljl4 = new JLabel("                                                                                                                                                 ");
    
registration1 = new JMenu("Registration");
 assetliability1 = new JMenu("AssetLiability");
 investmentf1 = new JMenu("Investment");
 housepropertyy1 = new JMenu("HouseProperty");
 incomeassee1 = new JMenu("TaxCount");
 salary1k = new JMenu("Salary(Income)");
 taxcredit1 = new JMenu("Family Expense");
    
    menu4 = new JMenu("Click             ");
    //registration
     for (int i = 0; i < 1; i++) {
        assessmemtyearu[i] = new JMenuItem("Click");
    }
     for (int i = 0; i < 1; i++) {
        registration1.add(assessmemtyearu[i]);
    }
     menu4.add(registration1);
     //assetliability
      for (int i = 0; i < 11; i++) {
        assessmemtyear1u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       assetliability1.add(assessmemtyear1u[i]);
    }
     
    menu4.add(assetliability1);
    //investment
     for (int i = 0; i < 11; i++) {
        assessmemtyear2u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       investmentf1.add(assessmemtyear2u[i]);
    }
     
    menu4.add(investmentf1);
    //houseproperty
     for (int i = 0; i < 11; i++) {
        assessmemtyear3u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       housepropertyy1.add(assessmemtyear3u[i]);
    }
    menu4.add(housepropertyy1);
    //incomeassee
    for (int i = 0; i < 11; i++) {
        assessmemtyear4u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       incomeassee1.add(assessmemtyear4u[i]);
    }
    menu4.add(incomeassee1);
    //salary
    for (int i = 0; i < 11; i++) {
        assessmemtyear5u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       salary1k.add(assessmemtyear5u[i]);
    }
    menu4.add(salary1k);
    //taxcredit
     for (int i = 0; i < 11; i++) {
        assessmemtyear6u[i] = new JMenuItem(Integer.toString(ayear[i]));
    }
     for (int i = 0; i < 11; i++) {
       taxcredit1.add(assessmemtyear6u[i]);
    }
    menu4.add(taxcredit1);
    
   bar4 = new JMenuBar();
    bar4.add(menu4);
    setJMenuBar(bar4);
    
for(int m=0;m<1;m++)
    {
        int k=m;
        assessmemtyearu[k].addActionListener(e -> {
            
        text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            int regg = conn.EMPLOYEE(text);
            if (regg == 1) {
                AssesseeRegistration tc = new AssesseeRegistration();
                tc.update(text,ayear[k]);
                tc.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         });
        
    }
    for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear1u[k].addActionListener(e -> {
         text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            assetliabilityreturn = conn.Assetliavilityreturn(text,ayear[k]);
            if (!assetliabilityreturn[0].matches("-1")) {
                AssesseeLiabilty tc = new AssesseeLiabilty();
                tc.update(text,ayear[k]);
                tc.setVisible(true);
                    dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         });
        
    }
//tax dibate
    for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear2u[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            taxdibate = conn.TAXDIBATE(text,ayear[k]);
            if (!taxdibate[0].matches("-1")) {
                TaxCredit tc = new TaxCredit();
                tc.update(text,ayear[k]);
                tc.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         });
    
    }
    
      for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear3u[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            houseproperty = conn.HOUSEPROPERTYRETURN(text,ayear[k]);
            if (!houseproperty[0].matches("-1")) {
                HousePropertyIcome tc = new HousePropertyIcome();
                try {
                    tc.update(text,ayear[k]);
                    tc.setVisible(true);
                    dispose();
                } catch (JSONException ex) {
                    Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         });
         
    }
          for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear4u[k].addActionListener(e -> {
            text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            taxcount = conn.TaxCount(text,ayear[k]);
            if (!taxcount[0].matches("-1")) {
                IncomeAssessee tc = new IncomeAssessee();
                tc.update(text,ayear[k]);
                tc.setVisible(true);
                    dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    } 

      for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear5u[k].addActionListener(e -> {
          text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            salary1 = conn.SALARYRETURN(text,ayear[k]);
            if (!salary1[0].matches("-1")) {
                Salary tc = new Salary();
                try {
                    tc.update(text,ayear[k]);
                    tc.setVisible(true);
                    dispose();
                } catch (JSONException ex) {
                    Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    } 
       for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear6u[k].addActionListener(e -> {
           text = ch.textfieldcheck(centreleft_4_top_textfield.getText());
        try {
            familyexpense = conn.HOUSEPROPERTYRETURN(text,ayear[k]);
            if (!familyexpense[0].matches("-1")) {
                Form tc = new Form();
                try {
                    tc.update(text,ayear[k]);
                    tc.setVisible(true);
                    dispose();
                } catch (JSONException ex) {
                    Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not Data Inserted");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }

    alltop4.add(centreleft_4_top_label);
    allleft4.add(centreleft_4_top_textfield);
    allleft4.add(bar4);
    allright4.add(alljl4);
    centreleft_4_top.add(Box.createVerticalStrut(30));

    //5
    centreleft_5_top.setLayout(new BorderLayout());
    JPanel downloadleft1 = new JPanel();
    JPanel downloadtop1 = new JPanel();
    JPanel downloadmidle1 = new JPanel();
    JPanel downloadright1 = new JPanel();
    centreleft_5_top.add(downloadtop1, BorderLayout.NORTH);
    centreleft_5_top.add(downloadleft1, BorderLayout.WEST);
    centreleft_5_top.add(downloadright1, BorderLayout.EAST);
    centreleft_5_top.add(downloadmidle1, BorderLayout.CENTER);
    centreleft_5_top_label = new JLabel("Download Details:                                                                                                                                                                                           ");
    centreleft_5_top_textfield = new JTextField("                                                      ");
    JLabel downloadjl1 = new JLabel("                                                                          ");

    JButton abc1 = new JButton("Click      ");
    
     menu = new JMenu("Click             ");
    for (int i = 0; i < 11; i++) {
       
        assessmemtyear[i] = new JMenuItem(Integer.toString(ayear[i]));

    }

    for (int i = 0; i < 11; i++) {
        menu.add(assessmemtyear[i]);
    }

    bar = new JMenuBar();
    bar.add(menu);
    setJMenuBar(bar);
    
    for(int m=0;m<11;m++)
    {
        int k=m;
         assessmemtyear[k].addActionListener(e -> {
       
         text = ch.textfieldcheck(centreleft_5_top_textfield.getText());
        try {
            int a = conn.EMPLOYEE(text);
            int[] b = conn.Assetliavilityy(text,ayear[k]);
            String[] c = conn.FamilyExpense(text,ayear[k]);
            String[] d = conn.HOUSEPROPERTYRETURN(text,ayear[k]);
            String[] f = conn.TaxCount(text,ayear[k]);
            String[] g = conn.SALARYRETURN(text,ayear[k]);
            String[] h = conn.TAXDIBATE(text,ayear[k]);
            registrationreturn = conn.RegistrationReturn(text);
             String namek=registrationreturn[1];
                  
            
            if(a == 1)
            {
              if (b[0] == -1 && c[0].matches("-1") && d[0].matches("-1") && f[0].matches("-1") && g[0].matches("-1") && h[0].matches("-1"))
                {
                    JOptionPane.showMessageDialog(null, "Please Fillup All Form");
                }
              else
              {
                try {
                pd=new Pdf();
                pd.pdfc(text,ayear[k]);
                String namee = "", amountt = "";
                text = ch.textfieldcheck(centreleft_5_top_textfield.getText());
                
                
                Document doc = new Document(PageSize.A4);
                OutputStream outputStream;
                outputStream = new FileOutputStream(new File("E:\\pdf\\dot\\" + namek + "ovi(" + text + ").pdf"));
                PdfWriter writer= PdfWriter.getInstance(doc, outputStream);
                doc.setMargins(5, 1,10, 20);
               
                doc.open();
                PdfPTable header = new PdfPTable(1);
                String header1 = "      FOR INDIVDUAL & OTHER TAXPAYERS (OTHER THAN COMPANY) ";
                // Font CUSTOM_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD | Font.UNDERLINE);
                Font CUSTOM_FONT = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD  );
                PdfPCell headercell = new PdfPCell(new Paragraph(header1,CUSTOM_FONT));
                headercell.setBorderColor(BaseColor.BLACK);
                headercell.setBorderWidth(1.5f);
                
                //Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC);
                header.addCell(headercell);
                
                doc.add(header);
//                 Rectangle BODY = new Rectangle(18,530,580,10);
//                ColumnText BODY1 = new ColumnText(writer.getDirectContent());
//                // rect.setBackgroundColor(BaseColor.RED);
//                BODY.setBorderColor(BaseColor.BLACK);
//                BODY.setBorder(Rectangle.BOX); 
//                BODY.setBorderWidth(1);
//                doc.add(BODY);
//                BODY1.setSimpleColumn(BODY);
//                
//                 BODY1.go(); 
                PdfPTable tick = new PdfPTable(4);
                doc.add(new Paragraph("         "));
                        doc.add(new Paragraph("                         FORM OF RETURN OF INCOME UNDER THE INCOME TAX"));
                        doc.add(new Paragraph("                                                  ORDINACE, 1984(XXVI OF 1984)"));
               for(int i=0;i<8;i++)
                           {
                              doc.add(new Paragraph("         ")); 
                           }
               doc.add(new Paragraph("    Put the tick() mark whereever applicable"));
                    doc.add(new Paragraph("         ")); 
                        doc.add(pd.ticc());
                       
                 Rectangle rect = new Rectangle(500,750,580,725);
                          ColumnText ct = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                            rect.setBorderColor(BaseColor.BLACK);
                            rect.setBorder(Rectangle.BOX); 
                            rect.setBorderWidth(1);
                            doc.add(rect);
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
                            doc.add( berespect);
                            berespect1.setSimpleColumn( berespect);
                           berespect1.addElement(new Paragraph("  Be a Responsible Taxpayer"));
                            berespect1.addElement(new Paragraph("  Submit return in due time"));
                            berespect1.addElement(new Paragraph("  Avoid penalty"));
                           berespect1.go(); 
                      //photo
                      Rectangle photo = new Rectangle(400,700,580,600);
                          ColumnText  photo1 = new ColumnText(writer.getDirectContent());
                           // rect.setBackgroundColor(BaseColor.RED);
                             photo.setBorderColor(BaseColor.BLACK);
                             photo.setBorder(Rectangle.BOX); 
                             photo.setBorderWidth(1);
                            doc.add(photo);
                            photo1.setSimpleColumn( photo);
                             photo1.addElement(new Paragraph("  "));
                           photo1.addElement(new Paragraph("  Photograph of the Assessee"));
                           photo1.addElement(new Paragraph("  "));
                            Font pt = new Font(Font.FontFamily.HELVETICA, 10  );
                            photo1.addElement(new Paragraph(" [to be attested on the photographh]",pt));
                            photo1.addElement(new Paragraph("  "));
                           photo1.go(); 
                           doc.add(new Paragraph(" ")); 
                           doc.add(pd.registration(text,ayear[k]));
                           
               
                           //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 1));
                           
                            
                          for(int i=0;i<5;i++)
                        {
                          doc.add(new Paragraph(" "));   
                        }
                          //incomeass
                         doc.add(pd.incomeheader1());
                         doc.add(new Paragraph("         "));
                          doc.add(pd.incomeheader2(text,ayear[k]));
                          doc.add(new Paragraph("         "));
                          doc.add(pd.incomefunction(text,ayear[k]));
                           Font ift = new Font(Font.FontFamily.HELVETICA, 9,Font.BOLDITALIC  );
                            doc.add(new Paragraph("                      *If needed, please use separate sheet  ",ift));
                             doc.add(new Paragraph(" ")); 
                             doc.add(pd.incomefooter1());
                             doc.add(pd.incomefooter2());
                             doc.add(new Paragraph("             belief the given in this return and statements and documents annexed here with is correct"));
                        doc.add(new Paragraph("             and complete.  "));
                        doc.add(new Paragraph(" "));
                         //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 2));
                        doc.add(pd.incomefooter(text,ayear[k]));
                        
                        for(int i=0;i<4;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                        //salaries
                        doc.add(new Paragraph("                                                  SHEDULES SHOWING DETAILS OF INCOME"));
                        doc.add(new Paragraph("         "));
                        doc.add(pd.salaryheadern());
                        doc.add(pd.salaryheader2());
                        doc.add(new Paragraph("         "));
                        doc.add(pd.salary(text,ayear[k]));
                        doc.add(new Paragraph("         "));
                        doc.add(pd.houseproperty());
                        doc.add(new Paragraph("         "));
                        doc.add(pd.housePropertyinfo(text,ayear[k]));
                         //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 3));
                        for(int i=0;i<9;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                        //invest part
                        doc.add(pd.investheader());
                        
                         doc.add(new Paragraph("                                        (Section 44(2) read with part 'B' of Sixth Shedule)"));
                        doc.add(new Paragraph("         ")); 
                        doc.add(pd.investbody(text,ayear[k]));
                         doc.add(new Paragraph("                      *Please Attach Cirtificates of Investment",ift));
                        doc.add(new Paragraph("         "));
                         doc.add(new Paragraph("         "));
                         //list part
                          //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 4));
                         doc.add(pd.listheader());
                          doc.add(new Paragraph("         "));
                          doc.add(pd.listfunction());
                          doc.add(new Paragraph("                      Incomplete return is not acceptable",ift));
                           for(int i=0;i<12;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                           //asset liability
                           //firs part
                                                   doc.add(new Paragraph("                                                                                                                                                                                                     IT-10B",ift));
                            doc.add(pd.assetheader());
                            doc.add(new Paragraph("         "));
                             //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 5));
                           doc.add(pd.assetliability(text,ayear[k]));
                           //second part 
                          for(int i=0;i<13;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                       
                        doc.add(pd.assetliability1020(text,ayear[k]));
                         //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 6));
                         doc.add(new Paragraph(" "));
                          doc.add(new Paragraph("                             I solmately declarevthat to the best of knowledge and belief the information given in the IT-10BB is ",tat));
                          doc.add(new Paragraph( "                             Correct and Complete",tat));
                          doc.add(new Paragraph("                                                                                            (" + namek + ") "));
                        doc.add(new Paragraph("                                                                                                                          Name & Signature Of ASSessee  ",tat));
                       doc.add(pd.assetbottom());
                       // document.add(new Paragraph("                                                                                            date:" + registrationreturn[7] + " "));
                        doc.add(new Paragraph("         "));
                        doc.add(new Paragraph("                             *Assets & Liabilities of self,spouse if(she/he is not an assessee),minor children and                                                                                                             dependents(s) to be shown in the above statements",ift));
                        doc.add(new Paragraph("         "));
                        doc.add(new Paragraph("                             *if needed ,please use seperate sheet",ift));
                        for(int i=0;i<5;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                       //form
                       
                         doc.add(new Paragraph("                                                                                                                                                                                   From No.IT-10BB",ift));
                       doc.add(pd.formheader());
                       doc.add(new Paragraph("         "));
                        doc.add(new Paragraph("               Statement under section 75(2)(d)(i) and section 80 of the Income tax Ordinace ",aa2vF));
                        doc.add(new Paragraph("                              1984(XXXXVI OF 1984) regarding particulars of life style",aa2vF));
                        doc.add(new Paragraph("          "));
                         //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 7));
                        doc.add(pd.incomeheader2(text,ayear[k])); 
                         doc.add(new Paragraph("         "));
                         doc.add(pd.forminfo(text,ayear[k]));
                          doc.add(new Paragraph(" "));
                          doc.add(new Paragraph("                                        I solmately declarevthat to the best of knowledge and belief the information given in the ",tat));
                        doc.add(new Paragraph("                            IT-10BB is Correct and Complete ",tat));
                          doc.add(new Paragraph("                                                                                                (" + namek + ") "));
                        doc.add(new Paragraph("                                                                                                                          Name & Signature Of ASSessee  ",tat));
                       doc.add(pd.assetbottom());
                       // document.add(new Paragraph("                                                                                            date:" + registrationreturn[7] + " "));
                        doc.add(new Paragraph("         "));
                        //document.add(new Paragraph("                             *Assets & Liabilities of self,spouse if(she/he is not an assessee),minor children and                                                                                                             dependents(s) to be shown in the above statements",ift));
                        doc.add(new Paragraph("         "));
                        doc.add(new Paragraph("                             *if needed ,please use seperate sheet",ift));
        
                          doc.add(new Paragraph("                      ....................................................... ........................................................................"));
                         
                          doc.add(new Paragraph("                                        Acknowledgement Receipt of Income Tax Return",aa2vF));
                        doc.add(new Paragraph("         "));
                        doc.add(pd.formbottom2(text,ayear[k]));
                          doc.add(new Paragraph("         "));
                        doc.add(pd.formbottom3(text,ayear[k]));
                         
                          for(int i=0;i<10;i++)
                        {
                          doc.add(new Paragraph("         "));   
                        }
                          //instruction
                          
                          doc.add(pd.instructionheader());
                            doc.add(new Paragraph("         "));
                            doc.add(pd.instruction()); 
                            
                             doc.add(new Paragraph("             ...................................................................... ........................................................................"));
                         doc.add(new Paragraph("         "));
                         doc.add(new Paragraph("         "));
                         doc.add(pd.instructionbottom1(text,ayear[k]));
                          doc.add(new Paragraph("         "));
                           //pagenumber adding
                           doc.add(pd.pagenumbering(doc, writer, 8));
                            doc.add(pd.instructionbottom2(text,ayear[k]));
                              doc.add(new Paragraph("         "));
                                doc.add(pd.instructionbottom3());
                                doc.add(new Paragraph("         "));
                                doc.add(pd.instructionbottom4());
                         for(int i=0;i<3;i++)
                        {
                            doc.add(new Paragraph(" "));
                        }
                         doc.add(new Paragraph("                                                                                                                                                                       Signature of Receiving",tat));
                         doc.add(new Paragraph("                                                                                                                                                                             Officer with Seal",tat));
                        //doc.add(new Paragraph(doc.getPageNumber()));
                         JOptionPane.showMessageDialog(null, "page "+doc.getPageNumber());
                // doc.add();
                doc.close();
           
                
            } catch (DocumentException ex) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not Exit NIN");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         }); 
    }
   
    downloadtop1.add(centreleft_5_top_label);
    downloadleft1.add(centreleft_5_top_textfield);
    downloadleft1.add(bar);
    downloadright1.add(downloadjl1);

    centreleft_6_top.add(Box.createVerticalStrut(30));
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    EXIT = new JButton("                               EXIT                                   ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top.add(EXIT);
    EXIT.addActionListener(e -> {
        System.exit(0);
    });

}

public void centremiddle() {
    //main  frst outdoor
    centrecentre.setLayout(new BorderLayout());
    centrecentre_1_top = new JPanel();
    centrecentre_1_centre = new JPanel();
    centrecentre_1_bottom = new JPanel();

    centrecentre_1_top.add(Box.createVerticalStrut(20));
    centrecentre.add(centrecentre_1_top, BorderLayout.NORTH);
    centrecentre.add(centrecentre_1_centre, BorderLayout.CENTER);
    //centreleft.add(centreleft_1_bottom,BorderLayout.SOUTH);

    addcentrecontent();

}

public void addcentrecontent() {
    centrecentre_1_top_box = new BoxLayout(centrecentre_1_top, BoxLayout.Y_AXIS);
    centrecentre_1_top.setLayout(centrecentre_1_top_box);
    centrecentre_1_top.add(Box.createVerticalStrut(20));
    centrecentre_1_top_label = new JLabel("                                                                                                                                                                        ");
    centrecentre_1_top_textfield = new JTextField();
    centrecentre_1_top.add(centrecentre_1_top_label);

}

public void centreright() {
    //main  frst outdoor
    centreright.setLayout(new BorderLayout());
    centreright_1_top = new JPanel();
    centreright_1_centre = new JPanel();
    centreright_1_bottom = new JPanel();

    centreright_1_top.add(Box.createVerticalStrut(20));
    centreright.add(centreright_1_top, BorderLayout.NORTH);
    centreright.add(centreright_1_centre, BorderLayout.CENTER);

    //second indoor
    centreright_1_centre.setLayout(new BorderLayout());
    centreright_2_top = new JPanel();
    centreright_2_centre = new JPanel();
    centreright_2_bottom = new JPanel();

    centreright_2_top.add(Box.createVerticalStrut(20));
    centreright_1_centre.add(centreright_2_top, BorderLayout.NORTH);
    centreright_1_centre.add(centreright_2_centre, BorderLayout.CENTER);
    //centreleft_1_centre.add(centreleft_2_bottom,BorderLayout.SOUTH);
    //third indoor
    centreright_2_centre.setLayout(new BorderLayout());
    centreright_3_top = new JPanel();
    centreright_3_centre = new JPanel();
    centreright_3_bottom = new JPanel();

    centreright_1_top.add(Box.createVerticalStrut(20));
    centreright_2_centre.add(centreright_3_top, BorderLayout.NORTH);
    centreright_2_centre.add(centreright_3_centre, BorderLayout.CENTER);
    // centreleft_2_centre.add(centreleft_3_bottom,BorderLayout.SOUTH);
    //fourth indoor
    centreright_3_centre.setLayout(new BorderLayout());
    centreright_4_top = new JPanel();
    centreright_4_centre = new JPanel();
    centreright_4_bottom = new JPanel();

    centreright_4_top.add(Box.createVerticalStrut(20));
    centreright_3_centre.add(centreright_4_top, BorderLayout.NORTH);
    centreright_3_centre.add(centreright_4_centre, BorderLayout.CENTER);
    //centreleft_3_centre.add(centreleft_4_bottom,BorderLayout.SOUTH);

    //five indoor
    centreright_4_centre.setLayout(new BorderLayout());
    centreright_5_top = new JPanel();
    centreright_5_centre = new JPanel();
    centreright_5_bottom = new JPanel();

    centreright_5_top.add(Box.createVerticalStrut(20));
    centreright_4_centre.add(centreright_5_top, BorderLayout.NORTH);
    centreright_4_centre.add(centreright_5_centre, BorderLayout.CENTER);
    //centreleft_4_centre.add(centreleft_5_bottom,BorderLayout.SOUTH);

    //six indoor
    centreright_5_centre.setLayout(new BorderLayout());
    centreright_6_top = new JPanel();
    centreright_6_centre = new JPanel();
    centreright_6_bottom = new JPanel();

    centreright_6_top.add(Box.createVerticalStrut(20));
    centreright_5_centre.add(centreright_6_top, BorderLayout.NORTH);
    centreright_5_centre.add(centreright_6_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    //seven indoor
    centreright_6_centre.setLayout(new BorderLayout());
    centreright_7_top = new JPanel();
    centreright_7_centre = new JPanel();
    centreright_7_bottom = new JPanel();

    centreright_7_top.add(Box.createVerticalStrut(20));
    centreright_6_centre.add(centreright_7_top, BorderLayout.NORTH);
    centreright_6_centre.add(centreright_7_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    //eight indoor
    centreright_7_centre.setLayout(new BorderLayout());
    centreright_8_top = new JPanel();
    centreright_8_centre = new JPanel();
    centreright_8_bottom = new JPanel();

    centreright_8_top.add(Box.createVerticalStrut(20));
    centreright_7_centre.add(centreright_8_top, BorderLayout.NORTH);
    centreright_7_centre.add(centreright_8_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);
    //nine indoor
    centreright_8_centre.setLayout(new BorderLayout());
    centreright_9_top = new JPanel();
    centreright_9_centre = new JPanel();
    centreright_9_bottom = new JPanel();

    centreright_9_top.add(Box.createVerticalStrut(20));
    centreright_8_centre.add(centreright_9_top, BorderLayout.NORTH);
    centreright_8_centre.add(centreright_9_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    //nine indoor
    centreright_9_centre.setLayout(new BorderLayout());
    centreright_10_top = new JPanel();
    centreright_10_centre = new JPanel();
    centreright_10_bottom = new JPanel();

    centreright_10_top.add(Box.createVerticalStrut(20));
    centreright_9_centre.add(centreright_10_top, BorderLayout.NORTH);
    centreright_9_centre.add(centreright_10_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addrightcontent();

}

public void addrightcontent() {
    centreright_1_top_box = new BoxLayout(centreright_1_top, BoxLayout.Y_AXIS);
    centreright_1_top.setLayout(centreright_1_top_box);
    centreright_1_top_label = new JLabel("Total(serial 1-9):                                ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top_textfield.setEnabled(false);
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Foreign Income:                                      ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Total Income(Serial 10-11):                                   ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top_textfield.setEnabled(false);
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);
    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Tax Leviable on total income:                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);
    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Tax rebate:u/s 44(2)(b)(as per schedule-3):                                ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top_textfield.setEnabled(false);
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);
    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel("Tax payable(difference between serial 13 and 14):                              ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top_textfield.setEnabled(false);
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);
    //7
    centreright_7_top_box = new BoxLayout(centreright_7_top, BoxLayout.Y_AXIS);
    centreright_7_top.setLayout(centreright_7_top_box);
    centreright_7_top_label = new JLabel("Tax Payments:                               ");
    centreright_7_top_textfield = new JTextField();
    centreright_7_top_textfield.setEnabled(false);
    centreright_7_top_adddetail = new JButton("Add Detail");
    centreright_7_top.add(centreright_7_top_label);
    centreright_7_top.add(centreright_7_top_textfield);
    centreright_7_top.add(centreright_7_top_adddetail);
    centreright_7_top_adddetail.addActionListener(e -> adddetails_right_7());
    //8
    centreright_8_top_box = new BoxLayout(centreright_8_top, BoxLayout.Y_AXIS);
    centreright_8_top.setLayout(centreright_8_top_box);
    centreright_8_top_label = new JLabel("Difference between serial 15 and 16(if any):                                 ");
    centreright_8_top_textfield = new JTextField();
    centreright_8_top_textfield.setEnabled(false);
    centreright_8_top.add(centreright_8_top_label);
    centreright_8_top.add(centreright_8_top_textfield);
    //9
    centreright_9_top_box = new BoxLayout(centreright_9_top, BoxLayout.Y_AXIS);
    centreright_9_top.setLayout(centreright_9_top_box);
    centreright_9_top_label = new JLabel("Tax exempted & Tax Free Income:                                     ");
    centreright_9_top_textfield = new JTextField();
    centreright_9_top_textfield.setEnabled(false);
    centreright_9_top.add(centreright_9_top_label);
    centreright_9_top.add(centreright_9_top_textfield);

    //10
    centreright_10_top_box = new BoxLayout(centreright_10_top, BoxLayout.Y_AXIS);
    centreright_10_top.setLayout(centreright_10_top_box);
    centreright_10_top_label = new JLabel("Income tax paid in the last assessment year:                                     ");
    centreright_10_top_textfield = new JTextField();
    JLabel yy = new JLabel("                                                                                                                                                                                                                                                                                                                 ");
    centreright_10_top.add(centreright_10_top_label);
    centreright_10_top.add(centreright_10_top_textfield);
    // centreright_10_top.add(yy);

}

public void adddetails_right_7() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_7_top_upper = new JPanel();
    centreright_7_top_box_upper = new BoxLayout(centreright_7_top_upper, BoxLayout.Y_AXIS);
    centreright_7_top_upper.setLayout(centreright_7_top_box_upper);

    centreright_7_top_middle = new JPanel();
    centreright_7_top_middle.setBackground(Color.green);

    centreright_7_top.add(centreright_7_top_upper, BorderLayout.NORTH);
    centreright_7_top.add(centreright_7_top_middle, BorderLayout.CENTER);
    centreright_7_top_label_next_taxdeducted1 = new JLabel("Tax deducted/Collected source(Please submit supporting documents/statement):");
    centreright_7_top_textfield_next_taxdeducted1 = new JTextField();
    centreright_7_top_label_next_advancetax2 = new JLabel("Advance tax u/s 64/68(Please Attach challan):");
    centreright_7_top_textfield_next_advancetax2 = new JTextField();

    centreright_7_top_label_next_taxpaid3 = new JLabel("Tax paid on the basis of this return(u/s 74)(Please please attach challan/pay order/bank draft/cheque):");
    centreright_7_top_textfield_next_taxpaid3 = new JTextField();
    centreright_7_top_label_next_adjustrefund4 = new JLabel("Adjust of Tax Refund (if any):");
    centreright_7_top_textfield_next_adjustrefund4 = new JTextField();

    centreright_7_top_add = new JButton("Add");
    centreright_7_top_add.addActionListener(e -> adddetails_centre_add());
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_taxdeducted1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_taxdeducted1);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_advancetax2);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_advancetax2);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));

    centreright_7_top_upper.add(centreright_7_top_label_next_taxpaid3);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_taxpaid3);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_adjustrefund4);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_adjustrefund4);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_middle.add(centreright_7_top_add);
    mainbody.revalidate();

}

public void adddetails_centre_add() {

}

public void centrebottom() {
    bottom.setLayout(new BorderLayout());
    bottom_left = new JPanel();
    bottom_left.setBackground(Color.ORANGE);
    bottom_right = new JPanel();
    bottom_right.setBackground(Color.black);
    bottom_top = new JPanel();
    bottom_top.setBackground(Color.yellow);
    bottom_bottom = new JPanel();
    bottom_bottom.setBackground(Color.gray);
    bottom_centre = new JPanel();
    bottom_centre.setBackground(Color.RED);
    bottom.add(bottom_left, BorderLayout.WEST);
    bottom.add(bottom_right, BorderLayout.EAST);
    bottom.add(bottom_top, BorderLayout.NORTH);
    bottom.add(bottom_bottom, BorderLayout.SOUTH);
    bottom.add(bottom_centre, BorderLayout.CENTER);

    JButton jj = new JButton("                                                   ");
    bottom_top.add(jj);
    jj.addActionListener(e -> submit());

}

public void submit() {

}

public void bottom() {

    centreright.setVisible(false);

}
//create table

}
