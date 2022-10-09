/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Registration;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class AssesseeLiabilty extends JFrame {
int ayear;
int totalsum = 0;
int sumexpense = 0;
int lessliabilityy = 0, sourcefundd = 0;
String[] familyexpense = new String[17];
JLabel[] comapayname = new JLabel[5];
JTextField[] comapanynametextfield = new JTextField[5];
JLabel[] comapanyshare = new JLabel[5];
JTextField[] comapanysharetextfield = new JTextField[5];
JLabel[] comapanyamount = new JLabel[5];
JTextField[] comapanyamounttextfield = new JTextField[5];
JButton[] companyaddbutton = new JButton[5];

JLabel[] jwname = new JLabel[5];
JTextField[] jwnametextfield = new JTextField[5];
JLabel[] jwshare = new JLabel[5];
JTextField[] jwsharetextfield = new JTextField[5];
JLabel[] jwamount = new JLabel[5];
JTextField[] jwamounttextfield = new JTextField[5];
JButton[] jwaddbutton = new JButton[5];

JLabel[] nonagriname = new JLabel[5];
JTextField[] nonagrinametextfield = new JTextField[5];
JLabel[] nonagriamount = new JLabel[5];
JTextField[] nonagriamounttextfield = new JTextField[5];
JButton[] nonagriaddbutton = new JButton[5];

JLabel[] agriname = new JLabel[5];
JTextField[] agrinametextfield = new JTextField[5];
JLabel[] agriamount = new JLabel[5];
JTextField[] agriamounttextfield = new JTextField[5];
JButton[] agriaddbutton = new JButton[5];

JLabel[] motorrname = new JLabel[5];
JTextField[] motorrnametextfield = new JTextField[5];
JLabel[] motorramount = new JLabel[5];
JTextField[] motorramounttextfield = new JTextField[5];
JButton[] motorraddbutton = new JButton[5];

JLabel[] othername = new JLabel[5];
JTextField[] othernametextfield = new JTextField[5];
JLabel[] otheramount = new JLabel[5];
JTextField[] otheramounttextfield = new JTextField[5];
JButton[] otheraddbutton = new JButton[5];

String[] assetliabilityreturn = new String[21];
databaseConnection conn = new databaseConnection();
String[] shareholdingname = new String[5];
int[] shareholdingshare = new int[5];
int[] shareholdingamount = new int[5];
String[] nonagriculname = new String[5];
int[] nonagriculcost = new int[5];
String[] agriculname = new String[5];
int[] agriculcost = new int[5];
int[] investment = new int[6];
int[] motoramount = new int[5];
String[] motorname = new String[5];
String[] jwelleryname = new String[5];
int[] jwelleryquantity = new int[5];
int[] jwellerycost = new int[5];
int[] cashasset = new int[3];
int[] lessliability = new int[4];
int[] dependentmember = new int[2];
int[] sourcefund = new int[3];
String[] otherassetname = new String[5];
int[] otherassetcost = new int[5];

ArrayList<Integer> sumasset = new ArrayList();
ArrayList<Integer> sumsource = new ArrayList();
ArrayList<Integer> value1 = new ArrayList();
ArrayList<Integer> value8 = new ArrayList();
ArrayList<Integer> value9 = new ArrayList();
ArrayList<Integer> valuer3 = new ArrayList();
ArrayList<Integer> valuer4 = new ArrayList();
ArrayList<Integer> valuer5 = new ArrayList();
ArrayList<Integer> valuer6 = new ArrayList();
ArrayList<Integer> valuer71 = new ArrayList();
ArrayList<Integer> valuer72 = new ArrayList();
ArrayList<Integer> valuer8 = new ArrayList();
ArrayList<Integer> valuer10 = new ArrayList();

int prevyearincome;
int[] salary = new int[17];
long NIN;
int previncome, presincome, accretionincome, familyexpepense, accretionincome8, finaloutput;
ArrayList<String> left2s = new ArrayList();
ArrayList<Integer> left2i1 = new ArrayList();
ArrayList<Integer> left2i2 = new ArrayList();

ArrayList<String> left3s = new ArrayList();
ArrayList<Integer> left3i1 = new ArrayList();

ArrayList<String> left4s = new ArrayList();
ArrayList<Integer> left4i1 = new ArrayList();

ArrayList<Integer> left5i = new ArrayList();

ArrayList<String> left6s = new ArrayList();
ArrayList<Integer> left6i1 = new ArrayList();

ArrayList<String> left7s = new ArrayList();
ArrayList<Integer> left7i1 = new ArrayList();
ArrayList<Integer> left7i2 = new ArrayList();

ArrayList<Integer> left10i = new ArrayList();

ArrayList<String> right1s = new ArrayList();
ArrayList<Integer> right1i1 = new ArrayList();
ArrayList<Integer> right2i = new ArrayList();
ArrayList<Integer> right9i = new ArrayList();

JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre, centreleft_7_top, centreleft_7_bottom, centreleft_7_centre, centreleft_8_top, centreleft_8_bottom, centreleft_8_centre, centreleft_9_top, centreleft_9_bottom, centreleft_9_centre, centreleft_10_top, centreleft_10_bottom, centreleft_10_centre,
        centreleft_1_top_upper, centreleft_2_top_upper, centreleft_3_top_upper, centreleft_4_top_upper, centreleft_5_top_upper, centreleft_6_top_upper, centreleft_7_top_upper, centreleft_8_top_upper, centreleft_9_top_upper, centreleft_10_top_upper,
        centreleft_1_top_middle, centreleft_2_top_middle, centreleft_3_top_middle, centreleft_4_top_middle, centreleft_5_top_middle, centreleft_6_top_middle, centreleft_7_top_middle, centreleft_8_top_middle, centreleft_9_top_middle, centreleft_10_top_middle,
        centrecentre_1_top, centrecentre_1_bottom, centrecentre_1_centre, centrecentre_2_top, centrecentre_2_bottom, centrecentre_2_centre, centrecentre_3_top, centrecentre_3_bottom, centrecentre_3_centre, centrecentre_4_top, centrecentre_4_bottom, centrecentre_4_centre, centrecentre_5_top, centrecentre_5_bottom, centrecentre_5_centre, centrecentre_6_top, centrecentre_6_bottom, centrecentre_6_centre, centrecentre_7_top, centrecentre_7_bottom, centrecentre_7_centre,
        centrecentre_1_top_upper, centrecentre_2_top_upper, centrecentre_3_top_upper, centrecentre_4_top_upper, centrecentre_5_top_upper, centrecentre_6_top_upper, centrecentre_7_top_upper,
        centrecentre_1_top_middle, centrecentre_2_top_middle, centrecentre_3_top_middle, centrecentre_4_top_middle, centrecentre_5_top_middle, centrecentre_6_top_middle, centrecentre_7_top_middle,
        centreright_1_top, centreright_1_bottom, centreright_1_centre, centreright_2_top, centreright_2_bottom, centreright_2_centre, centreright_3_top, centreright_3_bottom, centreright_3_centre, centreright_4_top, centreright_4_bottom, centreright_4_centre, centreright_5_top, centreright_5_bottom, centreright_5_centre, centreright_6_top, centreright_6_bottom, centreright_6_centre, centreright_7_top, centreright_7_bottom, centreright_7_centre, centreright_8_top, centreright_8_bottom, centreright_8_centre, centreright_9_top, centreright_9_bottom, centreright_9_centre, centreright_10_top, centreright_10_bottom, centreright_10_centre,
        centreright_1_top_upper, centreright_2_top_upper, centreright_3_top_upper, centreright_4_top_upper, centreright_5_top_upper, centreright_6_top_upper, centreright_7_top_upper, centreright_8_top_upper, centreright_9_top_upper, centreright_10_top_upper,
        centreright_1_top_middle, centreright_2_top_middle, centreright_3_top_middle, centreright_4_top_middle, centreright_5_top_middle, centreright_6_top_middle, centreright_7_top_middle, centreright_8_top_middle, centreright_9_top_middle, centreright_10_top_middle;

JScrollPane js;
JButton btn1;
BoxLayout centreleft_1_top_box, centreleft_2_top_box, centreleft_3_top_box, centreleft_4_top_box, centreleft_5_top_box, centreleft_6_top_box, centreleft_7_top_box, centreleft_8_top_box, centreleft_9_top_box, centreleft_10_top_box,
        centreleft_1_top_box_upper, centreleft_2_top_box_upper, centreleft_3_top_box_upper, centreleft_4_top_box_upper, centreleft_5_top_box_upper, centreleft_6_top_box_upper, centreleft_7_top_box_upper, centreleft_8_top_box_upper, centreleft_9_top_box_upper, centreleft_10_top_box_upper,
        centrecentre_1_top_box, centrecentre_2_top_box, centrecentre_3_top_box, centrecentre_4_top_box, centrecentre_5_top_box, centrecentre_6_top_box, centrecentre_7_top_box,
        centrecentre_1_top_box_upper, centrecentre_2_top_box_upper, centrecentre_3_top_box_upper, centrecentre_4_top_box_upper, centrecentre_5_top_box_upper, centrecentre_6_top_box_upper, centrecentre_7_top_box_upper,
        centreright_1_top_box, centreright_2_top_box, centreright_3_top_box, centreright_4_top_box, centreright_5_top_box, centreright_6_top_box, centreright_7_top_box, centreright_8_top_box, centreright_9_top_box, centreright_10_top_box,
        centreright_1_top_box_upper, centreright_2_top_box_upper, centreright_3_top_box_upper, centreright_4_top_box_upper, centreright_5_top_box_upper, centreright_6_top_box_upper, centreright_7_top_box_upper, centreright_8_top_box_upper, centreright_9_top_box_upper, centreright_10_top_box_upper;

JLabel centreleft_1_top_label, centreleft_2_top_label, centreleft_3_top_label, centreleft_4_top_label, centreleft_5_top_label, centreleft_6_top_label, centreleft_7_top_label, centreleft_8_top_label, centreleft_9_top_label, centreleft_10_top_label,
        centreleft_1_top_label_next_exampted1, centreleft_1_top_label_next_taxable1,
        centreleft_2_top_label_next_company1, centreleft_2_top_label_next_share1, centreleft_2_top_label_next_amount1,
        centreleft_3_top_label_next_exampted1, centreleft_3_top_label_next_taxable1,
        centreleft_4_top_label_next_exampted1, centreleft_4_top_label_next_taxable1,
        centreleft_5_top_label_next_share1, centreleft_5_top_label_next_insurance1, centreleft_5_top_label_next_dps1, centreleft_5_top_label_next_profund1, centreleft_5_top_label_next_annualfund1, centreleft_5_top_label_next_groupinsurance1,
        centreleft_6_top_label_next_exampted1, centreleft_6_top_label_next_taxable1,
        centreleft_7_top_label_next_name1, centreleft_7_top_label_next_quantity1, centreleft_7_top_label_next_cost1,
        centreleft_8_top_label_next_exampted1, centreleft_8_top_label_next_taxable1,
        centreleft_9_top_label_next_exampted1, centreleft_9_top_label_next_taxable1,
        centreleft_10_top_label_next_cashhand1, centreleft_10_top_label_next_cashbank2, centreleft_10_top_label_next_other2;

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
        centreright_1_top_label_next_1, centreright_1_top_label_next_2,
        centreright_2_top_label_next_1, centreright_2_top_label_next_2,
        centreright_3_top_label_next_1, centreright_3_top_label_next_2,
        centreright_4_top_label_next_1, centreright_4_top_label_next_2,
        centreright_5_top_label_next_1, centreright_5_top_label_next_2,
        centreright_6_top_label_next_1, centreright_6_top_label_next_2,
        centreright_7_top_label_next_1, centreright_7_top_label_next_2,
        centreright_8_top_label_next_1, centreright_8_top_label_next_2,
        centreright_9_top_label_next_1, centreright_9_top_label_next_2,
        centreright_1_top_label_next_exampted1, centreright_1_top_label_next_taxable2,
        centreright_2_top_label_next_mortgage1, centreright_2_top_label_next_unsecured2, centreright_2_top_label_next_provident2, centreright_2_top_label_next_other2,
        centreright_3_top_label_next_exampted1, centreright_3_top_label_next_taxable2,
        centreright_4_top_label_next_exampted1, centreright_4_top_label_next_taxable2,
        centreright_5_top_label_next_exampted1, centreright_5_top_label_next_taxable2,
        centreright_6_top_label_next_exampted1, centreright_6_top_label_next_taxable2,
        centreright_7_top_label_next_exampted1, centreright_7_top_label_next_taxable2,
        centreright_8_top_label_next_exampted1, centreright_8_top_label_next_taxable2,
        centreright_9_top_label_next_returnincome1, centreright_9_top_label_next_freeincome2, centreright_9_top_label_next_other2,
        centreright_10_top_label_next_exampted1, centreright_10_top_label_next_taxable2;

JTextField centreleft_1_top_textfield, centreleft_2_top_textfield, centreleft_3_top_textfield, centreleft_4_top_textfield, centreleft_5_top_textfield, centreleft_6_top_textfield, centreleft_7_top_textfield, centreleft_8_top_textfield, centreleft_9_top_textfield, centreleft_10_top_textfield,
        centreleft_1_top_textfield_next_exampted1, centreleft_1_top_textfield_next_taxable1,
        centreleft_2_top_textfield_next_company1, centreleft_2_top_textfield_next_share1, centreleft_2_top_textfield_next_amount1,
        centreleft_3_top_textfield_next_exampted1, centreleft_3_top_textfield_next_taxable1,
        centreleft_4_top_textfield_next_exampted1, centreleft_4_top_textfield_next_taxable1,
        centreleft_5_top_textfield_next_share1, centreleft_5_top_textfield_next_insurance1, centreleft_5_top_textfield_next_dps1, centreleft_5_top_textfield_next_profund1, centreleft_5_top_textfield_next_annualfund1, centreleft_5_top_textfield_next_groupinsurance1,
        centreleft_6_top_textfield_next_exampted1, centreleft_6_top_textfield_next_taxable1,
        centreleft_7_top_textfield_next_name1, centreleft_7_top_textfield_next_quantity1, centreleft_7_top_textfield_next_cost1,
        centreleft_8_top_textfield_next_exampted1, centreleft_8_top_textfield_next_taxable1,
        centreleft_9_top_textfield_next_exampted1, centreleft_9_top_textfield_next_taxable1,
        centreleft_10_top_textfield_next_cashhand1, centreleft_10_top_textfield_next_cashbank2, centreleft_10_top_textfield_next_other2,
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
        centreright_1_top_textfield_next_1, centreright_1_top_textfield_next_2,
        centreright_2_top_textfield_next_1, centreright_2_top_textfield_next_2,
        centreright_3_top_textfield_next_1, centreright_3_top_textfield_next_2,
        centreright_4_top_textfield_next_1, centreright_4_top_textfield_next_2,
        centreright_5_top_textfield_next_1, centreright_5_top_textfield_next_2,
        centreright_6_top_textfield_next_1, centreright_6_top_textfield_next_2,
        centreright_7_top_textfield_next_1, centreright_7_top_textfield_next_2,
        centreright_8_top_textfield_next_1, centreright_8_top_textfield_next_2,
        centreright_9_top_textfield_next_1, centreright_9_top_textfield_next_2,
        centreright_10_top_textfield_next_1, centreright_10_top_textfield_next_2,
        centreright_1_top_textfield_next_exampted1, centreright_1_top_textfield_next_taxable2,
        centreright_2_top_textfield_next_mortgage1, centreright_2_top_textfield_next_unsecured2, centreright_2_top_textfield_next_provident2, centreright_2_top_textfield_next_other2,
        centreright_3_top_textfield_next_exampted1, centreright_3_top_textfield_next_taxable2,
        centreright_4_top_textfield_next_exampted1, centreright_4_top_textfield_next_taxable2,
        centreright_5_top_textfield_next_exampted1, centreright_5_top_textfield_next_taxable2,
        centreright_6_top_textfield_next_exampted1, centreright_6_top_textfield_next_taxable2,
        centreright_7_top_textfield_next_exampted1, centreright_7_top_textfield_next_taxable2,
        centreright_8_top_textfield_next_exampted1, centreright_8_top_textfield_next_taxable2,
        centreright_9_top_textfield_next_returnincome1, centreright_9_top_textfield_next_freeincome2, centreright_9_top_textfield_next_other2,
        centreright_10_top_textfield_next_exampted1, centreright_10_top_textfield_next_taxable2;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_2_top_adddetail_update, centreleft_3_top_adddetail, centreleft_3_top_adddetail_update, centreleft_4_top_adddetail_update, centreleft_4_top_adddetail, centreleft_5_top_adddetail_update, centreleft_5_top_adddetail, centreleft_6_top_adddetail_update, centreleft_6_top_adddetail, centreleft_7_top_adddetail, centreleft_7_top_adddetail_update, centreleft_8_top_adddetail, centreleft_9_top_adddetail, centreleft_10_top_adddetail, centreleft_10_top_adddetail_update, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_7_top_add, centreleft_8_top_add, centreleft_9_top_add, centreleft_10_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end, centreleft_7_top_end, centreleft_8_top_end, centreleft_9_top_end, centreleft_10_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate;

JButton centreright_1_top_adddetail, centreright_1_top_adddetail_update, centreright_2_top_adddetail_update, centreright_7_top_adddetail_update, centreright_9_top_adddetail_update, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_8_top_adddetail, centreright_9_top_adddetail, centreright_10_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_8_top_add, centreright_9_top_add, centreright_10_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end, centreright_8_top_end, centreright_9_top_end, centreright_10_top_end, jj, update;

public AssesseeLiabilty() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test");
    mainbody();
    try {
        AUTOLOADDATA();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
    }

}

public void accessnin(long a,int ayea) throws ClassNotFoundException, SQLException, JSONException {
    NIN = a;
    ayear=ayea;
     salary = conn.Assetliavilityy(NIN,ayear);
        if (salary[0] != -1) {
            centreright_4_top_textfield.setText(Integer.toString(salary[0]));
            centreright_4_top_textfield.setEnabled(false);

        }
    familyexpense = conn.FamilyExpense(a,ayear);
    if (!familyexpense[0].matches("-1")) {
        //family expense

        // int sumexpense=0;
        int[] firstexpense = new int[familyexpense.length];
        String[] secondexpense = new String[familyexpense.length];
        for (int i = 1; i < 14; i++) {
            JSONObject json2 = new JSONObject(familyexpense[i]);
            firstexpense[i] = Integer.parseInt(json2.getString("amount"));
            secondexpense[i] = (json2.getString("comment"));
            sumexpense = sumexpense + firstexpense[i];

        }
        centreright_6_top_textfield.setText(Integer.toString(sumexpense));
        centreright_6_top_textfield.setEnabled(false);
    } else {
        centreright_6_top_textfield.setText(Integer.toString(sumexpense));
        centreright_6_top_textfield.setEnabled(false);
    }
}

public void AUTOLOADDATA() throws ClassNotFoundException {
//    int houseincome;
//    databaseConnection conn = new databaseConnection();
//
//    try {
//        salary = conn.Assetliavilityy(NIN,ayear);
//        if (salary[0] != -1) {
//            centreright_4_top_textfield.setText(Integer.toString(salary[0]));
//            centreright_4_top_textfield.setEnabled(false);
//
//        }
//
//    } catch (SQLException ex) {
//        Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
//    }

}

public static void main(String[] args) {
    AssesseeLiabilty window = new AssesseeLiabilty();
    window.setVisible(true);

}

public void mainbody() {
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
    centre();
    bottom();

}

public void top() {
    JLabel jj = new JLabel("   Asset And Liability    ");
    top.add(jj);
}

public void centre() {
    centre.setLayout(new BorderLayout());
    centreleft = new JPanel();
    centreleft.setBackground(Color.yellow);
    centreright = new JPanel();
    centreright.setBackground(Color.orange);
    centrecentre = new JPanel();
    centrecentre.setBackground(Color.gray);
    centre.add(centreleft, BorderLayout.WEST);
    centre.add(centreright, BorderLayout.EAST);
    centre.add(centrecentre, BorderLayout.CENTER);
    centreleft();
    centreright();
    centremiddle();
    centrebottom();

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
    centreleft_8_centre.add(centreleft_9_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    //10 indoor
    centreleft_9_centre.setLayout(new BorderLayout());
    centreleft_10_top = new JPanel();
    centreleft_10_centre = new JPanel();
    centreleft_10_bottom = new JPanel();

    centreleft_10_top.add(Box.createVerticalStrut(20));
    centreleft_9_centre.add(centreleft_10_top, BorderLayout.NORTH);
    centreleft_9_centre.add(centreleft_10_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addleftcontent();

}

public void addleftcontent() {
    centreleft_1_top_box = new BoxLayout(centreleft_1_top, BoxLayout.Y_AXIS);
    centreleft_1_top.setLayout(centreleft_1_top_box);
    centreleft_1_top_label = new JLabel(" Business Capital(Closing Balance):                                                                                                                   ");
    centreleft_1_top_textfield = new JTextField();
    // centreleft_1_top_textfield.setEnabled(false);
    centreleft_1_top.add(centreleft_1_top_label);
    centreleft_1_top.add(centreleft_1_top_textfield);

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Directors Shareholding in limited Companies(at Cost):                                    ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top_textfield.setEnabled(false);
    centreleft_2_top_adddetail = new JButton("Add Detail");
    centreleft_2_top_adddetail_update = new JButton("Add Detail");
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);
    centreleft_2_top.add(centreleft_2_top_adddetail);
    centreleft_2_top.add(centreleft_2_top_adddetail_update);
    centreleft_2_top_adddetail_update.setVisible(false);
    centreleft_2_top_adddetail.addActionListener(e -> adddetails_left_2());

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("Non-Agricultural Property (at cost with legal expense):                                    ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top_textfield.setEnabled(false);
    centreleft_3_top_adddetail = new JButton("Add Detail");
    centreleft_3_top_adddetail_update = new JButton("Add Detailup");
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);
    centreleft_3_top.add(centreleft_3_top_adddetail);
    centreleft_3_top.add(centreleft_3_top_adddetail_update);
    centreleft_3_top_adddetail_update.setVisible(false);
    centreleft_3_top_adddetail.addActionListener(e -> adddetails_left_3());
    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("Agricultural Property (at cost with legal expense):                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top_textfield.setEnabled(false);
    centreleft_4_top_adddetail = new JButton("Add Detail");
    centreleft_4_top_adddetail_update = new JButton("Add Detail");
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);
    centreleft_4_top.add(centreleft_4_top_adddetail);
    centreleft_4_top.add(centreleft_4_top_adddetail_update);
    centreleft_4_top_adddetail_update.setVisible(false);
    centreleft_4_top_adddetail.addActionListener(e -> adddetails_left_4());
    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("Investment:                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top_textfield.setEnabled(false);
    centreleft_5_top_adddetail = new JButton("Add Detail");
    centreleft_5_top_adddetail_update = new JButton("Add Detail");
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);
    centreleft_5_top.add(centreleft_5_top_adddetail);
    centreleft_5_top.add(centreleft_5_top_adddetail_update);
    centreleft_5_top_adddetail_update.setVisible(false);
    centreleft_5_top_adddetail.addActionListener(e -> adddetails_left_5());
    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("Motor Vehicles(at cost):                                    ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top_textfield.setEnabled(false);
    centreleft_6_top_adddetail = new JButton("Add Detail");
    centreleft_6_top_adddetail_update = new JButton("Add Detail");
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);
    centreleft_6_top.add(centreleft_6_top_adddetail);
    centreleft_6_top.add(centreleft_6_top_adddetail_update);
    centreleft_6_top_adddetail_update.setVisible(false);
    centreleft_6_top_adddetail.addActionListener(e -> adddetails_left_6());

    //7
    centreleft_7_top_box = new BoxLayout(centreleft_7_top, BoxLayout.Y_AXIS);
    centreleft_7_top.setLayout(centreleft_7_top_box);
    centreleft_7_top_label = new JLabel("Jewellery(Quantity & Cost:                                    ");
    centreleft_7_top_textfield = new JTextField();
    centreleft_7_top_textfield.setEnabled(false);
    centreleft_7_top_adddetail = new JButton("Add Detail");
    centreleft_7_top_adddetail_update = new JButton("Add Detail");
    centreleft_7_top.add(centreleft_7_top_label);
    centreleft_7_top.add(centreleft_7_top_textfield);
    centreleft_7_top.add(centreleft_7_top_adddetail);
    centreleft_7_top.add(centreleft_7_top_adddetail_update);
    centreleft_7_top_adddetail_update.setVisible(false);
    centreleft_7_top_adddetail.addActionListener(e -> adddetails_left_7());

    //8
    centreleft_8_top_box = new BoxLayout(centreleft_8_top, BoxLayout.Y_AXIS);
    centreleft_8_top.setLayout(centreleft_8_top_box);
    centreleft_8_top_label = new JLabel("Furniture(at cost):                                  ");
    centreleft_8_top_textfield = new JTextField();

    centreleft_8_top.add(centreleft_8_top_label);
    centreleft_8_top.add(centreleft_8_top_textfield);

    //9
    centreleft_9_top_box = new BoxLayout(centreleft_9_top, BoxLayout.Y_AXIS);
    centreleft_9_top.setLayout(centreleft_9_top_box);
    centreleft_9_top_label = new JLabel("Electric Equipment(at cost):                                    ");
    centreleft_9_top_textfield = new JTextField();
    centreleft_9_top.add(centreleft_9_top_label);
    centreleft_9_top.add(centreleft_9_top_textfield);

    //10
    centreleft_10_top_box = new BoxLayout(centreleft_10_top, BoxLayout.Y_AXIS);
    centreleft_10_top.setLayout(centreleft_10_top_box);
    centreleft_10_top_label = new JLabel("Cash Asset Outside Business:                                    ");
    centreleft_10_top_textfield = new JTextField();
    centreleft_10_top_textfield.setEnabled(false);
    centreleft_10_top_adddetail = new JButton("Add Detail");
    centreleft_10_top_adddetail_update = new JButton("Add Detail");
    centreleft_10_top.add(centreleft_10_top_label);
    centreleft_10_top.add(centreleft_10_top_textfield);
    centreleft_10_top.add(centreleft_10_top_adddetail);
    centreleft_10_top.add(centreleft_10_top_adddetail_update);
    centreleft_10_top_adddetail_update.setVisible(false);
    centreleft_10_top_adddetail.addActionListener(e -> adddetails_left_10());

}

public int adddetails_add(int a, int b) {
    return a + b;
}

public int adddetails_add(int a, int b, int c, int d, int e, int f) {
    return a + b + c + d + e + f;
}

public int adddetails_add1(ArrayList<Integer> a) {
    int sum = 0;
    for (int i = 0; i < a.size(); i++) {

        sum = sum + a.get(i);

    }
    return sum;

}

public void adddetails_left_2() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_2_top_upper = new JPanel();
    centreleft_2_top_box_upper = new BoxLayout(centreleft_2_top_upper, BoxLayout.Y_AXIS);
    centreleft_2_top_upper.setLayout(centreleft_2_top_box_upper);

    centreleft_2_top_middle = new JPanel();
    centreleft_2_top_middle.setBackground(Color.green);

    centreleft_2_top.add(centreleft_2_top_upper, BorderLayout.NORTH);
    centreleft_2_top.add(centreleft_2_top_middle, BorderLayout.CENTER);
    centreleft_2_top_label_next_company1 = new JLabel("Name Of Company:                                     ");
    centreleft_2_top_textfield_next_company1 = new JTextField();

    centreleft_2_top_label_next_share1 = new JLabel("Number Of Share in Company:                                     ");
    centreleft_2_top_textfield_next_share1 = new JTextField();

    centreleft_2_top_label_next_amount1 = new JLabel("Amount(TK):                                     ");
    centreleft_2_top_textfield_next_amount1 = new JTextField();

    centreleft_2_top_add = new JButton("Add");
    centreleft_2_top_end = new JButton("End");

    centreleft_2_top_add.addActionListener(e -> right_addle2(centreleft_2_top_textfield_next_company1.getText(), Integer.parseInt(centreleft_2_top_textfield_next_share1.getText()), Integer.parseInt(centreleft_2_top_textfield_next_amount1.getText())));
    centreleft_2_top_end.addActionListener(e -> {
        try {
            right_endle2();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));
    centreleft_2_top_upper.add(centreleft_2_top_label_next_company1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_company1);
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));

    centreleft_2_top_upper.add(centreleft_2_top_label_next_share1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_share1);
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));

    centreleft_2_top_upper.add(centreleft_2_top_label_next_amount1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_amount1);
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));

    centreleft_2_top_middle.add(centreleft_2_top_add);

    centreleft_2_top_middle.add(centreleft_2_top_end);
    mainbody.revalidate();

}

public void right_addle2(String name, int share, int amount) {
    left2s.add(name);
    left2i1.add(share);
    left2i2.add(amount);
    centreleft_2_top_textfield_next_company1.setText(null);
    centreleft_2_top_textfield_next_share1.setText(null);
    centreleft_2_top_textfield_next_amount1.setText(null);
}

public void right_endle2() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < left2s.size(); i++) {
        shareholdingname[i] = left2s.get(i);
        shareholdingshare[i] = left2i1.get(i);
        shareholdingamount[i] = left2i2.get(i);
        sum = sum + left2i2.get(i);

    }

    centreleft_2_top_textfield.setEnabled(true);
    centreleft_2_top_textfield.setText(Integer.toString(sum));

    centreleft_2_top_textfield.setEnabled(true);
    centreleft_2_top_upper.setVisible(false);
    centreleft_2_top_middle.setVisible(false);

}

public void adddetails_left_3() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_3_top_upper = new JPanel();
    centreleft_3_top_box_upper = new BoxLayout(centreleft_3_top_upper, BoxLayout.Y_AXIS);
    centreleft_3_top_upper.setLayout(centreleft_3_top_box_upper);

    centreleft_3_top_middle = new JPanel();
    centreleft_3_top_middle.setBackground(Color.green);

    centreleft_3_top.add(centreleft_3_top_upper, BorderLayout.NORTH);
    centreleft_3_top.add(centreleft_3_top_middle, BorderLayout.CENTER);
    centreleft_3_top_label_next_exampted1 = new JLabel("Land/House Property(Description & location Property):                                     ");
    centreleft_3_top_textfield_next_exampted1 = new JTextField();

    centreleft_3_top_label_next_taxable1 = new JLabel("Amount(Tk):                                     ");
    centreleft_3_top_textfield_next_taxable1 = new JTextField();

    centreleft_3_top_add = new JButton("Add");
    centreleft_3_top_end = new JButton("End");

    centreleft_3_top_add.addActionListener(e -> right_addle3(centreleft_3_top_textfield_next_exampted1.getText(), Integer.parseInt(centreleft_3_top_textfield_next_taxable1.getText())));
    centreleft_3_top_end.addActionListener(e -> {
        try {
            right_endle3();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });

    centreleft_3_top_upper.add(Box.createVerticalStrut(20));
    centreleft_3_top_upper.add(centreleft_3_top_label_next_exampted1);
    centreleft_3_top_upper.add(centreleft_3_top_textfield_next_exampted1);
    centreleft_3_top_upper.add(Box.createVerticalStrut(20));

    centreleft_3_top_upper.add(centreleft_3_top_label_next_taxable1);
    centreleft_3_top_upper.add(centreleft_3_top_textfield_next_taxable1);
    centreleft_3_top_upper.add(Box.createVerticalStrut(20));

    centreleft_3_top_middle.add(centreleft_3_top_add);
    centreleft_3_top_middle.add(centreleft_3_top_end);

    mainbody.revalidate();

}

public void right_addle3(String name, int amount) {
    left3s.add(name);
    left3i1.add(amount);
    centreleft_3_top_textfield_next_exampted1.setText(null);
    centreleft_3_top_textfield_next_taxable1.setText(null);
}

public void right_endle3() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < left3s.size(); i++) {
        nonagriculname[i] = left3s.get(i);
        nonagriculcost[i] = left3i1.get(i);
        sum = sum + left3i1.get(i);

    }

    centreleft_3_top_textfield.setEnabled(true);
    centreleft_3_top_textfield.setText(Integer.toString(sum));

    centreleft_3_top_textfield.setEnabled(true);
    centreleft_3_top_upper.setVisible(false);
    centreleft_3_top_middle.setVisible(false);

}

public void adddetails_left_4() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_4_top_upper = new JPanel();
    centreleft_4_top_box_upper = new BoxLayout(centreleft_4_top_upper, BoxLayout.Y_AXIS);
    centreleft_4_top_upper.setLayout(centreleft_4_top_box_upper);

    centreleft_4_top_middle = new JPanel();
    centreleft_4_top_middle.setBackground(Color.green);

    centreleft_4_top.add(centreleft_4_top_upper, BorderLayout.NORTH);
    centreleft_4_top.add(centreleft_4_top_middle, BorderLayout.CENTER);
    centreleft_4_top_label_next_exampted1 = new JLabel("Land/House Property(Description & location Property):                                     ");
    centreleft_4_top_textfield_next_exampted1 = new JTextField();

    centreleft_4_top_label_next_taxable1 = new JLabel("Amount(Tk):                                     ");
    centreleft_4_top_textfield_next_taxable1 = new JTextField();

    centreleft_4_top_add = new JButton("Add");
    centreleft_4_top_end = new JButton("End");

    centreleft_4_top_add.addActionListener(e -> right_addle4(centreleft_4_top_textfield_next_exampted1.getText(), Integer.parseInt(centreleft_4_top_textfield_next_taxable1.getText())));
    centreleft_4_top_end.addActionListener(e -> {
        try {
            right_endle4();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });

    centreleft_4_top_upper.add(Box.createVerticalStrut(20));
    centreleft_4_top_upper.add(centreleft_4_top_label_next_exampted1);
    centreleft_4_top_upper.add(centreleft_4_top_textfield_next_exampted1);
    centreleft_4_top_upper.add(Box.createVerticalStrut(20));

    centreleft_4_top_upper.add(centreleft_4_top_label_next_taxable1);
    centreleft_4_top_upper.add(centreleft_4_top_textfield_next_taxable1);
    centreleft_4_top_upper.add(Box.createVerticalStrut(20));

    centreleft_4_top_middle.add(centreleft_4_top_add);
    centreleft_4_top_middle.add(centreleft_4_top_end);
    mainbody.revalidate();
}

public void right_addle4(String name, int amount) {
    left4s.add(name);
    left4i1.add(amount);
    centreleft_4_top_textfield_next_exampted1.setText(null);
    centreleft_4_top_textfield_next_taxable1.setText(null);
}

public void right_endle4() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < left4s.size(); i++) {
        agriculname[i] = left4s.get(i);
        agriculcost[i] = left4i1.get(i);

        sum = sum + left4i1.get(i);

    }

    centreleft_4_top_textfield.setEnabled(true);
    centreleft_4_top_textfield.setText(Integer.toString(sum));

    centreleft_4_top_textfield.setEnabled(true);
    centreleft_4_top_upper.setVisible(false);
    centreleft_4_top_middle.setVisible(false);

}

public void adddetails_left_5() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_5_top_upper = new JPanel();
    centreleft_5_top_box_upper = new BoxLayout(centreleft_5_top_upper, BoxLayout.Y_AXIS);
    centreleft_5_top_upper.setLayout(centreleft_5_top_box_upper);

    centreleft_5_top_middle = new JPanel();
    centreleft_5_top_middle.setBackground(Color.green);

    centreleft_5_top.add(centreleft_5_top_upper, BorderLayout.NORTH);
    centreleft_5_top.add(centreleft_5_top_middle, BorderLayout.CENTER);
    centreleft_5_top_label_next_share1 = new JLabel("Share/Debentures:                                     ");
    centreleft_5_top_textfield_next_share1 = new JTextField();

    centreleft_5_top_label_next_insurance1 = new JLabel("Insurance/Saving Certificate:                                     ");
    centreleft_5_top_textfield_next_insurance1 = new JTextField();

    centreleft_5_top_label_next_dps1 = new JLabel("Saving Schema(DPS):                                     ");
    centreleft_5_top_textfield_next_dps1 = new JTextField();

    centreleft_5_top_label_next_profund1 = new JLabel("Provident Fund:                                     ");
    centreleft_5_top_textfield_next_profund1 = new JTextField();

    centreleft_5_top_label_next_annualfund1 = new JLabel("Contribution to Annual Fund:                                     ");
    centreleft_5_top_textfield_next_annualfund1 = new JTextField();

    centreleft_5_top_label_next_groupinsurance1 = new JLabel("Group Insurance:                                     ");
    centreleft_5_top_textfield_next_groupinsurance1 = new JTextField();

    centreleft_5_top_add = new JButton("Add");

    centreleft_5_top_add.addActionListener(e
            -> {
        if (centreleft_5_top_textfield_next_share1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_share1.getText()));
        }
        if (centreleft_5_top_textfield_next_insurance1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_insurance1.getText()));
        }
        if (centreleft_5_top_textfield_next_dps1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_dps1.getText()));
        }
        if (centreleft_5_top_textfield_next_profund1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_profund1.getText()));
        }
        if (centreleft_5_top_textfield_next_annualfund1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_annualfund1.getText()));
        }
        if (centreleft_5_top_textfield_next_groupinsurance1.getText().isEmpty()) {
            left5i.add(0);
        } else {
            left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_groupinsurance1.getText()));
        }

        // int sum=adddetails_add(Integer.parseInt(centreleft_5_top_textfield_next_share1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_insurance1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_dps1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_profund1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_annualfund1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_groupinsurance1.getText()));
        int sum = adddetails_add1(left5i);

        centreleft_5_top_textfield.setText(Integer.toString(sum));
        centreleft_5_top_textfield.setEnabled(true);
        centreleft_5_top_upper.setVisible(false);
        centreleft_5_top_middle.setVisible(false);
        for (int i = 0; i < 6; i++) {
            investment[i] = left5i.get(i);
        }
    });

    centreleft_5_top_upper.add(Box.createVerticalStrut(20));
    centreleft_5_top_upper.add(centreleft_5_top_label_next_share1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_share1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_insurance1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_insurance1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_dps1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_dps1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_profund1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_profund1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_annualfund1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_annualfund1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_groupinsurance1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_groupinsurance1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_middle.add(centreleft_5_top_add);
    mainbody.revalidate();
}

public void adddetails_left_6() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_6_top_upper = new JPanel();
    centreleft_6_top_box_upper = new BoxLayout(centreleft_6_top_upper, BoxLayout.Y_AXIS);
    centreleft_6_top_upper.setLayout(centreleft_6_top_box_upper);

    centreleft_6_top_middle = new JPanel();
    centreleft_6_top_middle.setBackground(Color.green);

    centreleft_6_top.add(centreleft_6_top_upper, BorderLayout.NORTH);
    centreleft_6_top.add(centreleft_6_top_middle, BorderLayout.CENTER);
    centreleft_6_top_label_next_exampted1 = new JLabel("Type of Motor vehicles and Registration number:                                     ");
    centreleft_6_top_textfield_next_exampted1 = new JTextField();

    centreleft_6_top_label_next_taxable1 = new JLabel("Amout(Tk):                                     ");
    centreleft_6_top_textfield_next_taxable1 = new JTextField();

    centreleft_6_top_add = new JButton("Add");
    centreleft_6_top_end = new JButton("End");

    centreleft_6_top_add.addActionListener(e -> right_addle6(centreleft_6_top_textfield_next_exampted1.getText(), Integer.parseInt(centreleft_6_top_textfield_next_taxable1.getText())));
    centreleft_6_top_end.addActionListener(e -> {
        try {
            right_endle6();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));
    centreleft_6_top_upper.add(centreleft_6_top_label_next_exampted1);
    centreleft_6_top_upper.add(centreleft_6_top_textfield_next_exampted1);
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));

    centreleft_6_top_upper.add(centreleft_6_top_label_next_taxable1);
    centreleft_6_top_upper.add(centreleft_6_top_textfield_next_taxable1);
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));

    centreleft_6_top_middle.add(centreleft_6_top_add);
    centreleft_6_top_middle.add(centreleft_6_top_end);
    mainbody.revalidate();

}

public void right_addle6(String name, int amount) {
    left6s.add(name);
    left6i1.add(amount);
    centreleft_6_top_textfield_next_exampted1.setText(null);
    centreleft_6_top_textfield_next_taxable1.setText(null);
}

public void right_endle6() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < left6s.size(); i++) {
        motorname[i] = left6s.get(i);
        motoramount[i] = left6i1.get(i);
        sum = sum + left6i1.get(i);

    }

    centreleft_6_top_textfield.setEnabled(true);
    centreleft_6_top_textfield.setText(Integer.toString(sum));

    centreleft_6_top_textfield.setEnabled(true);
    centreleft_6_top_upper.setVisible(false);
    centreleft_6_top_middle.setVisible(false);

}

public void adddetails_left_7() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_7_top_upper = new JPanel();
    centreleft_7_top_box_upper = new BoxLayout(centreleft_7_top_upper, BoxLayout.Y_AXIS);
    centreleft_7_top_upper.setLayout(centreleft_7_top_box_upper);

    centreleft_7_top_middle = new JPanel();
    centreleft_7_top_middle.setBackground(Color.green);

    centreleft_7_top.add(centreleft_7_top_upper, BorderLayout.NORTH);
    centreleft_7_top.add(centreleft_7_top_middle, BorderLayout.CENTER);
    centreleft_7_top_label_next_name1 = new JLabel("Name:                                     ");
    centreleft_7_top_textfield_next_name1 = new JTextField();

    centreleft_7_top_label_next_quantity1 = new JLabel("Quantity:                                     ");
    centreleft_7_top_textfield_next_quantity1 = new JTextField();

    centreleft_7_top_label_next_cost1 = new JLabel("Cost:                                     ");
    centreleft_7_top_textfield_next_cost1 = new JTextField();

    centreleft_7_top_add = new JButton("Add");
    centreleft_7_top_end = new JButton("end");

    centreleft_7_top_add.addActionListener(e -> right_addle7(centreleft_7_top_textfield_next_name1.getText(), Integer.parseInt(centreleft_7_top_textfield_next_quantity1.getText()), Integer.parseInt(centreleft_7_top_textfield_next_cost1.getText())));
    centreleft_7_top_end.addActionListener(e -> {
        try {
            right_endle7();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });

    centreleft_7_top_upper.add(Box.createVerticalStrut(20));
    centreleft_7_top_upper.add(centreleft_7_top_label_next_name1);
    centreleft_7_top_upper.add(centreleft_7_top_textfield_next_name1);
    centreleft_7_top_upper.add(Box.createVerticalStrut(20));

    centreleft_7_top_upper.add(centreleft_7_top_label_next_quantity1);
    centreleft_7_top_upper.add(centreleft_7_top_textfield_next_quantity1);
    centreleft_7_top_upper.add(Box.createVerticalStrut(20));

    centreleft_7_top_upper.add(centreleft_7_top_label_next_cost1);
    centreleft_7_top_upper.add(centreleft_7_top_textfield_next_cost1);
    centreleft_7_top_upper.add(Box.createVerticalStrut(20));

    centreleft_7_top_middle.add(centreleft_7_top_add);
    centreleft_7_top_middle.add(centreleft_7_top_end);
    mainbody.revalidate();

}

public void right_addle7(String name, int share, int amount) {
    left7s.add(name);
    left7i1.add(share);
    left7i2.add(amount);
    centreleft_7_top_textfield_next_name1.setText(null);
    centreleft_7_top_textfield_next_quantity1.setText(null);
    centreleft_7_top_textfield_next_cost1.setText(null);
}

public void right_endle7() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < left7s.size(); i++) {
        jwelleryname[i] = left7s.get(i);
        jwelleryquantity[i] = left7i1.get(i);
        jwellerycost[i] = left7i2.get(i);
        sum = sum + left7i2.get(i);

    }

    centreleft_7_top_textfield.setEnabled(true);
    centreleft_7_top_textfield.setText(Integer.toString(sum));

    centreleft_7_top_textfield.setEnabled(true);
    centreleft_7_top_upper.setVisible(false);
    centreleft_7_top_middle.setVisible(false);

}

public void adddetails_left_8() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_8_top_upper = new JPanel();
    centreleft_8_top_box_upper = new BoxLayout(centreleft_8_top_upper, BoxLayout.Y_AXIS);
    centreleft_8_top_upper.setLayout(centreleft_8_top_box_upper);

    centreleft_8_top_middle = new JPanel();
    centreleft_8_top_middle.setBackground(Color.green);

    centreleft_8_top.add(centreleft_8_top_upper, BorderLayout.NORTH);
    centreleft_8_top.add(centreleft_8_top_middle, BorderLayout.CENTER);
    centreleft_8_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_8_top_textfield_next_exampted1 = new JTextField();

    centreleft_8_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_8_top_textfield_next_taxable1 = new JTextField();

    centreleft_8_top_add = new JButton("Add");

    centreleft_8_top_add.addActionListener(e
            -> {
        int sum = adddetails_add(Integer.parseInt(centreleft_8_top_textfield_next_exampted1.getText()), Integer.parseInt(centreleft_8_top_textfield_next_taxable1.getText()));
        centreleft_8_top_textfield.setText(Integer.toString(sum));
        centreleft_8_top_textfield.setEnabled(true);
        centreleft_8_top_upper.setVisible(false);
        centreleft_8_top_middle.setVisible(false);
    });

    centreleft_8_top_upper.add(Box.createVerticalStrut(20));
    centreleft_8_top_upper.add(centreleft_8_top_label_next_exampted1);
    centreleft_8_top_upper.add(centreleft_8_top_textfield_next_exampted1);
    centreleft_8_top_upper.add(Box.createVerticalStrut(20));

    centreleft_8_top_upper.add(centreleft_8_top_label_next_taxable1);
    centreleft_8_top_upper.add(centreleft_8_top_textfield_next_taxable1);
    centreleft_8_top_upper.add(Box.createVerticalStrut(20));

    centreleft_8_top_middle.add(centreleft_8_top_add);
    mainbody.revalidate();
}

public void adddetails_left_9() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_9_top_upper = new JPanel();
    centreleft_9_top_box_upper = new BoxLayout(centreleft_9_top_upper, BoxLayout.Y_AXIS);
    centreleft_9_top_upper.setLayout(centreleft_9_top_box_upper);

    centreleft_9_top_middle = new JPanel();
    centreleft_9_top_middle.setBackground(Color.green);

    centreleft_9_top.add(centreleft_9_top_upper, BorderLayout.NORTH);
    centreleft_9_top.add(centreleft_9_top_middle, BorderLayout.CENTER);
    centreleft_9_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_9_top_textfield_next_exampted1 = new JTextField();

    centreleft_9_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_9_top_textfield_next_taxable1 = new JTextField();

    centreleft_9_top_add = new JButton("Add");

    centreleft_9_top_add.addActionListener(e
            -> {
        int sum = adddetails_add(Integer.parseInt(centreleft_9_top_textfield_next_exampted1.getText()), Integer.parseInt(centreleft_9_top_textfield_next_taxable1.getText()));
        centreleft_9_top_textfield.setText(Integer.toString(sum));
        centreleft_9_top_textfield.setEnabled(true);
        centreleft_9_top_upper.setVisible(false);
        centreleft_9_top_middle.setVisible(false);
    });

    centreleft_9_top_upper.add(Box.createVerticalStrut(20));
    centreleft_9_top_upper.add(centreleft_9_top_label_next_exampted1);
    centreleft_9_top_upper.add(centreleft_9_top_textfield_next_exampted1);
    centreleft_9_top_upper.add(Box.createVerticalStrut(20));

    centreleft_9_top_upper.add(centreleft_9_top_label_next_taxable1);
    centreleft_9_top_upper.add(centreleft_9_top_textfield_next_taxable1);
    centreleft_9_top_upper.add(Box.createVerticalStrut(20));

    centreleft_9_top_middle.add(centreleft_9_top_add);
    mainbody.revalidate();

}

public void adddetails_left_10() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_10_top_upper = new JPanel();
    centreleft_10_top_box_upper = new BoxLayout(centreleft_10_top_upper, BoxLayout.Y_AXIS);
    centreleft_10_top_upper.setLayout(centreleft_10_top_box_upper);

    centreleft_10_top_middle = new JPanel();
    centreleft_10_top_middle.setBackground(Color.green);

    centreleft_10_top.add(centreleft_10_top_upper, BorderLayout.NORTH);
    centreleft_10_top.add(centreleft_10_top_middle, BorderLayout.CENTER);
    centreleft_10_top_label_next_cashhand1 = new JLabel("Cash in hand:                                     ");
    centreleft_10_top_textfield_next_cashhand1 = new JTextField();
    centreleft_10_top_label_next_cashbank2 = new JLabel("Cash in Bank:                                   ");
    centreleft_10_top_textfield_next_cashbank2 = new JTextField();

    centreleft_10_top_label_next_other2 = new JLabel("Other Deposits((Paid the interset of Mortgages):                                   ");
    centreleft_10_top_textfield_next_other2 = new JTextField();

    centreleft_10_top_add = new JButton("Add");

    centreleft_10_top_add.addActionListener(e
            -> {
        if (centreleft_10_top_textfield_next_cashhand1.getText().isEmpty()) {
            left10i.add(0);
        } else {
            left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_cashhand1.getText()));
        }
        if (centreleft_10_top_textfield_next_cashbank2.getText().isEmpty()) {
            left10i.add(0);
        } else {
            left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_cashbank2.getText()));
        }
        if (centreleft_10_top_textfield_next_other2.getText().isEmpty()) {
            left10i.add(0);
        } else {
            left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_other2.getText()));
        }
        //  int sum=adddetails_add(Integer.parseInt(centreleft_10_top_textfield_next_cashhand1.getText()),Integer.parseInt( centreleft_10_top_textfield_next_cashbank2.getText()),Integer.parseInt(centreleft_10_top_textfield_next_other2.getText()),0,0,0);
        int sum = adddetails_add1(left10i);
        for (int i = 0; i < 3; i++) {
            cashasset[i] = left10i.get(i);
        }

        centreleft_10_top_textfield.setText(Integer.toString(sum));
        centreleft_10_top_textfield.setEnabled(true);
        centreleft_10_top_upper.setVisible(false);
        centreleft_10_top_middle.setVisible(false);
    });

    centreleft_10_top_upper.add(Box.createVerticalStrut(20));

    centreleft_10_top_upper.add(centreleft_10_top_label_next_cashhand1);
    centreleft_10_top_upper.add(centreleft_10_top_textfield_next_cashhand1);
    centreleft_10_top_upper.add(Box.createVerticalStrut(20));

    centreleft_10_top_upper.add(centreleft_10_top_label_next_cashbank2);
    centreleft_10_top_upper.add(centreleft_10_top_textfield_next_cashbank2);
    centreleft_10_top_upper.add(Box.createVerticalStrut(20));

    centreleft_10_top_upper.add(centreleft_10_top_label_next_other2);
    centreleft_10_top_upper.add(centreleft_10_top_textfield_next_other2);
    centreleft_10_top_upper.add(Box.createVerticalStrut(20));
    centreleft_10_top_middle.add(centreleft_10_top_add);
    mainbody.revalidate();

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
    centrecentre_1_top_label = new JLabel("               ");
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

    //ten indoor
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
    centreright_1_top_label = new JLabel("Any Other Assets:                                ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top_textfield.setEnabled(false);
    centreright_1_top_adddetail = new JButton("Add Detail");
    centreright_1_top_adddetail_update = new JButton("Add Detail");
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);
    centreright_1_top.add(centreright_1_top_adddetail);
    centreright_1_top.add(centreright_1_top_adddetail_update);
    centreright_1_top_adddetail_update.setVisible(false);
    centreright_1_top_adddetail.addActionListener(e -> adddetails_right_1());

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Less Liability:                                     ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top_textfield.setEnabled(false);
    centreright_2_top_adddetail = new JButton("Add Detail");
    centreright_2_top_adddetail_update = new JButton("Add Detail");
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);
    centreright_2_top.add(centreright_2_top_adddetail);
    centreright_2_top.add(centreright_2_top_adddetail_update);
    centreright_2_top_adddetail_update.setVisible(false);
    centreright_2_top_adddetail.addActionListener(e -> adddetails_right_2());

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Net Wealth as on last date of this income year(different asset & liability):                                   ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top_textfield.setEnabled(false);
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);

    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Net Wealth as on last date of previous income year:                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);
    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Accretion in wealth(differ 12 & 13):                                ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top_textfield.setEnabled(false);
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);

    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel("Family Expenditure(Total Expenditure as per Form IT 10 BB):                              ");
    centreright_6_top_textfield = new JTextField();

    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);

    //7
    centreright_7_top_box = new BoxLayout(centreright_7_top, BoxLayout.Y_AXIS);
    centreright_7_top.setLayout(centreright_7_top_box);
    centreright_7_top_label = new JLabel("Number of dependent member of Family:                               ");
    centreright_7_top_textfield = new JTextField();
    centreright_7_top_textfield.setEnabled(false);
    centreright_7_top_adddetail = new JButton("Add Detail");
    centreright_7_top_adddetail_update = new JButton("Add Detail");
    centreright_7_top.add(centreright_7_top_label);
    centreright_7_top.add(centreright_7_top_textfield);
    centreright_7_top.add(centreright_7_top_adddetail);
    centreright_7_top.add(centreright_7_top_adddetail_update);
    centreright_7_top_adddetail_update.setVisible(false);
    centreright_7_top_adddetail.addActionListener(e -> adddetails_right_7());
    //8
    centreright_8_top_box = new BoxLayout(centreright_8_top, BoxLayout.Y_AXIS);
    centreright_8_top.setLayout(centreright_8_top_box);
    centreright_8_top_label = new JLabel(" Total accretion of wealth(total 14 & 15):                                 ");
    centreright_8_top_textfield = new JTextField();
    centreright_8_top_textfield.setEnabled(false);
    centreright_8_top.add(centreright_8_top_label);
    centreright_8_top.add(centreright_8_top_textfield);

    //9
    centreright_9_top_box = new BoxLayout(centreright_9_top, BoxLayout.Y_AXIS);
    centreright_9_top.setLayout(centreright_9_top_box);
    centreright_9_top_label = new JLabel("Source of Fund:                                     ");
    centreright_9_top_textfield = new JTextField();
    centreright_9_top_textfield.setEnabled(false);
    centreright_9_top_adddetail = new JButton("Add Detail");
    centreright_9_top_adddetail_update = new JButton("Add Detail");
    centreright_9_top.add(centreright_9_top_label);
    centreright_9_top.add(centreright_9_top_textfield);
    centreright_9_top.add(centreright_9_top_adddetail);
    centreright_9_top.add(centreright_9_top_adddetail_update);
    centreright_9_top_adddetail_update.setVisible(false);
    centreright_9_top_adddetail.addActionListener(e -> adddetails_right_9());

    //10
    centreright_10_top_box = new BoxLayout(centreright_10_top, BoxLayout.Y_AXIS);
    centreright_10_top.setLayout(centreright_10_top_box);
    centreright_10_top_label = new JLabel("Difference( 16 & 17):                                     ");
    centreright_10_top_textfield = new JTextField();
    centreright_10_top_textfield.setEnabled(false);
    centreright_10_top.add(centreright_10_top_label);
    centreright_10_top.add(centreright_10_top_textfield);

}

public void adddetails_right_1() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_1_top_upper = new JPanel();
    centreright_1_top_box_upper = new BoxLayout(centreright_1_top_upper, BoxLayout.Y_AXIS);
    centreright_1_top_upper.setLayout(centreright_1_top_box_upper);

    centreright_1_top_middle = new JPanel();
    centreright_1_top_middle.setBackground(Color.green);

    centreright_1_top.add(centreright_1_top_upper, BorderLayout.NORTH);
    centreright_1_top.add(centreright_1_top_middle, BorderLayout.CENTER);
    centreright_1_top_label_next_exampted1 = new JLabel("Name:                                     ");
    centreright_1_top_textfield_next_exampted1 = new JTextField();
    centreright_1_top_label_next_taxable2 = new JLabel("Amount(Tk):                                   ");
    centreright_1_top_textfield_next_taxable2 = new JTextField();

    centreright_1_top_add = new JButton("Add");
    centreright_1_top_end = new JButton("End");

    centreright_1_top_add.addActionListener(e -> right_addrg1(centreright_1_top_textfield_next_exampted1.getText(), Integer.parseInt(centreright_1_top_textfield_next_taxable2.getText())));
    centreright_1_top_end.addActionListener(e -> {
        try {
            right_endrg1();
        } catch (JSONException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }
    });

    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_upper.add(centreright_1_top_label_next_exampted1);
    centreright_1_top_upper.add(centreright_1_top_textfield_next_exampted1);
    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_upper.add(centreright_1_top_label_next_taxable2);
    centreright_1_top_upper.add(centreright_1_top_textfield_next_taxable2);
    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_middle.add(centreright_1_top_add);
    centreright_1_top_middle.add(centreright_1_top_end);
    mainbody.revalidate();

}

public void right_addrg1(String name, int amount) {
    right1s.add(name);
    right1i1.add(amount);
    centreright_1_top_textfield_next_exampted1.setText(null);
    centreright_1_top_textfield_next_taxable2.setText(null);
}

public void right_endrg1() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < right1s.size(); i++) {
        otherassetname[i] = right1s.get(i);
        otherassetcost[i] = right1i1.get(i);
        sum = sum + right1i1.get(i);

    }

    centreright_1_top_textfield.setEnabled(true);
    centreright_1_top_textfield.setText(Integer.toString(sum));

    centreright_1_top_textfield.setEnabled(true);
    centreright_1_top_upper.setVisible(false);
    centreright_1_top_middle.setVisible(false);

}

public void adddetails_right_2() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_2_top_upper = new JPanel();
    centreright_2_top_box_upper = new BoxLayout(centreright_2_top_upper, BoxLayout.Y_AXIS);
    centreright_2_top_upper.setLayout(centreright_2_top_box_upper);

    centreright_2_top_middle = new JPanel();
    centreright_2_top_middle.setBackground(Color.green);

    centreright_2_top.add(centreright_2_top_upper, BorderLayout.NORTH);
    centreright_2_top.add(centreright_2_top_middle, BorderLayout.CENTER);
    centreright_2_top_label_next_mortgage1 = new JLabel("Mortgages Secured on property or land(tk):                                     ");
    centreright_2_top_textfield_next_mortgage1 = new JTextField();
    centreright_2_top_label_next_unsecured2 = new JLabel("Unsecured loans:                                   ");
    centreright_2_top_textfield_next_unsecured2 = new JTextField();

    centreright_2_top_label_next_provident2 = new JLabel("Loan From Provident Fund:                                   ");
    centreright_2_top_textfield_next_provident2 = new JTextField();
    centreright_2_top_label_next_other2 = new JLabel("Other:                                   ");
    centreright_2_top_textfield_next_other2 = new JTextField();

    centreright_2_top_add = new JButton("Add");

    centreright_2_top_add.addActionListener(e
            -> {
        if (centreright_2_top_textfield_next_mortgage1.getText().isEmpty()) {
            right2i.add(0);
        } else {
            right2i.add(Integer.parseInt(centreright_2_top_textfield_next_mortgage1.getText()));
        }
        if (centreright_2_top_textfield_next_unsecured2.getText().isEmpty()) {
            right2i.add(0);
        } else {
            right2i.add(Integer.parseInt(centreright_2_top_textfield_next_unsecured2.getText()));
        }
        if (centreright_2_top_textfield_next_provident2.getText().isEmpty()) {
            right2i.add(0);
        } else {
            right2i.add(Integer.parseInt(centreright_2_top_textfield_next_provident2.getText()));
        }
        if (centreright_2_top_textfield_next_other2.getText().isEmpty()) {
            right2i.add(0);
        } else {
            right2i.add(Integer.parseInt(centreright_2_top_textfield_next_other2.getText()));
        }
        for (int i = 0; i < 4; i++) {
            lessliability[i] = right2i.get(i);
        }
        int sum = adddetails_add1(right2i);
        centreright_2_top_textfield.setText(Integer.toString(sum));
        centreright_2_top_textfield.setEnabled(true);
        centreright_2_top_upper.setVisible(false);
        centreright_2_top_middle.setVisible(false);
    });

    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_mortgage1);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_mortgage1);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_unsecured2);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_unsecured2);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));

    centreright_2_top_upper.add(centreright_2_top_label_next_provident2);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_provident2);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));

    centreright_2_top_upper.add(centreright_2_top_label_next_other2);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_other2);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));

    centreright_2_top_middle.add(centreright_2_top_add);
    mainbody.revalidate();

}

public void adddetails_right_4() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_4_top_upper = new JPanel();
    centreright_4_top_box_upper = new BoxLayout(centreright_4_top_upper, BoxLayout.Y_AXIS);
    centreright_4_top_upper.setLayout(centreright_4_top_box_upper);

    centreright_4_top_middle = new JPanel();
    centreright_4_top_middle.setBackground(Color.green);

    centreright_4_top.add(centreright_4_top_upper, BorderLayout.NORTH);
    centreright_4_top.add(centreright_4_top_middle, BorderLayout.CENTER);
    centreright_4_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_4_top_textfield_next_exampted1 = new JTextField();
    centreright_4_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_4_top_textfield_next_taxable2 = new JTextField();

    centreright_4_top_add = new JButton("Add");

    centreright_4_top_add.addActionListener(e
            -> {
        int sum = adddetails_add(Integer.parseInt(centreright_4_top_textfield_next_exampted1.getText()), Integer.parseInt(centreright_4_top_textfield_next_taxable2.getText()));
        centreright_4_top_textfield.setText(Integer.toString(sum));
        centreright_4_top_textfield.setEnabled(true);
        centreright_4_top_upper.setVisible(false);
        centreright_4_top_middle.setVisible(false);
    });

    centreright_4_top_upper.add(Box.createVerticalStrut(20));
    centreright_4_top_upper.add(centreright_4_top_label_next_exampted1);
    centreright_4_top_upper.add(centreright_4_top_textfield_next_exampted1);
    centreright_4_top_upper.add(Box.createVerticalStrut(20));
    centreright_4_top_upper.add(centreright_4_top_label_next_taxable2);
    centreright_4_top_upper.add(centreright_4_top_textfield_next_taxable2);
    centreright_4_top_upper.add(Box.createVerticalStrut(20));
    centreright_4_top_middle.add(centreright_4_top_add);
    mainbody.revalidate();

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
    centreright_7_top_label_next_exampted1 = new JLabel("Adult:                                     ");
    centreright_7_top_textfield_next_exampted1 = new JTextField();
    centreright_7_top_label_next_taxable2 = new JLabel("Child:                                   ");
    centreright_7_top_textfield_next_taxable2 = new JTextField();

    centreright_7_top_add = new JButton("Add");

    centreright_7_top_add.addActionListener(e
            -> {
        if (!centreright_7_top_textfield_next_exampted1.getText().isEmpty()) {
            dependentmember[0] = Integer.parseInt(centreright_7_top_textfield_next_exampted1.getText());
        }
        if (!centreright_7_top_textfield_next_taxable2.getText().isEmpty()) {
            dependentmember[1] = Integer.parseInt(centreright_7_top_textfield_next_taxable2.getText());
        }

        int sum = dependentmember[0] + dependentmember[1];
        centreright_7_top_textfield.setText(Integer.toString(sum));
        centreright_7_top_textfield.setEnabled(true);
        centreright_7_top_upper.setVisible(false);
        centreright_7_top_middle.setVisible(false);
    });

    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_exampted1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_exampted1);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_taxable2);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_taxable2);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_middle.add(centreright_7_top_add);
    mainbody.revalidate();

}

public void adddetails_right_9() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_9_top_upper = new JPanel();
    centreright_9_top_box_upper = new BoxLayout(centreright_9_top_upper, BoxLayout.Y_AXIS);
    centreright_9_top_upper.setLayout(centreright_9_top_box_upper);

    centreright_9_top_middle = new JPanel();
    centreright_9_top_middle.setBackground(Color.green);

    centreright_9_top.add(centreright_9_top_upper, BorderLayout.NORTH);
    centreright_9_top.add(centreright_9_top_middle, BorderLayout.CENTER);
    centreright_9_top_label_next_returnincome1 = new JLabel("Shown Return Income:                                     ");
    centreright_9_top_textfield_next_returnincome1 = new JTextField();
    centreright_9_top_label_next_freeincome2 = new JLabel("Tax Free Income:                                   ");
    centreright_9_top_textfield_next_freeincome2 = new JTextField();
    centreright_9_top_label_next_other2 = new JLabel("Other Reciepts:                                   ");
    centreright_9_top_textfield_next_other2 = new JTextField();

    centreright_9_top_add = new JButton("Add");

    centreright_9_top_add.addActionListener(e
            -> {
        if (centreright_9_top_textfield_next_returnincome1.getText().isEmpty()) {
            right9i.add(0);
        } else {
            right9i.add(Integer.parseInt(centreright_9_top_textfield_next_returnincome1.getText()));
        }
        if (centreright_9_top_textfield_next_freeincome2.getText().isEmpty()) {
            right9i.add(0);
        } else {
            right9i.add(Integer.parseInt(centreright_9_top_textfield_next_freeincome2.getText()));
        }
        if (centreright_9_top_textfield_next_other2.getText().isEmpty()) {
            right9i.add(0);
        } else {
            right9i.add(Integer.parseInt(centreright_9_top_textfield_next_other2.getText()));
        }
        for (int i = 0; i < 3; i++) {
            sourcefund[i] = right9i.get(i);
        }
        int sum = adddetails_add1(right9i);
        centreright_9_top_textfield.setText(Integer.toString(sum));
        centreright_9_top_textfield.setEnabled(true);
        centreright_9_top_upper.setVisible(false);
        centreright_9_top_middle.setVisible(false);
    });

    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_returnincome1);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_returnincome1);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_freeincome2);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_freeincome2);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));

    centreright_9_top_upper.add(centreright_9_top_label_next_other2);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_other2);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_middle.add(centreright_9_top_add);
    mainbody.revalidate();

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

    System.out.println("Sorry bro");
    jj = new JButton("                       Submitted                          ");
    update = new JButton("                       Update                          ");
    bottom_top.add(jj);
    bottom_top.add(update);
    update.setVisible(false);
    jj.addActionListener(e -> adddetails_submit());

}

public void jsonnull2() {
    for (int i = 0; i < 5; i++) {
        left2s.add("null");
        left2i1.add(0);
        left2i2.add(0);
    }
}

public void jsonnull2h(int ll) {
    for (int i = 0; i < (5 - ll); i++) {
        left2s.add("null");
        left2i1.add(0);
        left2i2.add(0);

    }
}

public void jsonnull3() {
    for (int i = 0; i < 5; i++) {
        left3s.add("null");
        left3i1.add(0);
    }
}

public void jsonnull3h(int ll) {
    for (int i = 0; i < (5 - ll); i++) {
        left3s.add("null");
        left3i1.add(0);

    }
}

public void jsonnull4() {
    for (int i = 0; i < 5; i++) {
        left4s.add("null");
        left4i1.add(0);
    }
}

public void jsonnull4h(int ll) {
    for (int i = 0; i < (5 - ll); i++) {
        left4s.add("null");
        left4i1.add(0);

    }
}

public void jsonnull6() {
    for (int i = 0; i < 5; i++) {
        left6s.add("null");
        left6i1.add(0);
    }
}

public void jsonnull6h(int ll) {
    for (int i = 0; i < (5 - ll); i++) {
        left6s.add("null");
        left6i1.add(0);

    }
}

public void jsonnull7() {
    for (int i = 0; i < 5; i++) {
        left7s.add("null");
        left7i1.add(0);
    }
}

public void jsonnull7h(int ll) {
    for (int i = 0; i < (5 - ll); i++) {
        left7s.add("null");
        left7i1.add(0);
        left7i2.add(0);

    }
}

public void jsonnullr1() {
    for (int i = 0; i < 5; i++) {
        right1s.add("null");
        right1i1.add(0);

    }
}

public void jsonnullr1(int ll) {

    for (int i = 0; i < (5 - ll); i++) {

        right1s.add("null");
        right1i1.add(0);

    }
}

public void netwealth13() {

    int ss = 0;
    for (int i = 0; i < 11; i++) {
        ss = ss + sumasset.get(i);
    }
    presincome = ss - sumasset.get(11);
    String dif = Integer.toString(presincome);
    centreright_3_top_textfield.setText(dif);
    valuer3.add(presincome);

}

public void accretionincome5(int previncome) {

    accretionincome = presincome - previncome;
    centreright_5_top_textfield.setText(Integer.toString(accretionincome));
    valuer5.add(accretionincome);
}

public void accretionincome8(int familyexpepense) {

    accretionincome8 = accretionincome + familyexpepense;
    centreright_8_top_textfield.setText(Integer.toString(accretionincome8));
    valuer8.add(accretionincome8);
}

public void finaloutput() {
    finaloutput = accretionincome8 - sumsource.get(0);
    centreright_10_top_textfield.setText(Integer.toString(finaloutput));
    valuer10.add(finaloutput);
}

public void adddetails_submit() {
    try {
        databaseConnection conn = new databaseConnection();
        if (centreleft_1_top_textfield.getText().isEmpty()) {
            centreleft_1_top_textfield.setText("0");
            sumasset.add(0);
            value1.add(0);
        } else {
            sumasset.add(Integer.parseInt(centreleft_1_top_textfield.getText()));
            value1.add(Integer.parseInt(centreleft_1_top_textfield.getText()));

        }
        if (centreleft_2_top_textfield.getText().isEmpty()) {
            jsonnull2();
            sumasset.add(0);

        } else {
            jsonnull2h(left2s.size());
            sumasset.add(Integer.parseInt(centreleft_2_top_textfield.getText()));

        }
        if (centreleft_3_top_textfield.getText().isEmpty()) {
            jsonnull3();
            sumasset.add(0);

        } else {
            jsonnull3h(left3s.size());
            sumasset.add(Integer.parseInt(centreleft_3_top_textfield.getText()));

        }
        if (centreleft_4_top_textfield.getText().isEmpty()) {
            jsonnull4();
            sumasset.add(0);

        } else {
            jsonnull4h(left4s.size());
            sumasset.add(Integer.parseInt(centreleft_4_top_textfield.getText()));

        }
        if (centreleft_5_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 6; i++) {
                left5i.add(0);
            }
            sumasset.add(0);
        } else {
            sumasset.add(Integer.parseInt(centreleft_5_top_textfield.getText()));
        }
        if (centreleft_6_top_textfield.getText().isEmpty()) {
            jsonnull6();
            sumasset.add(0);

        } else {
            jsonnull6h(left6s.size());
            sumasset.add(Integer.parseInt(centreleft_6_top_textfield.getText()));

        }
        if (centreleft_7_top_textfield.getText().isEmpty()) {
            jsonnull7();
            sumasset.add(0);

        } else {
            jsonnull7h(left7s.size());
            sumasset.add(Integer.parseInt(centreleft_7_top_textfield.getText()));

        }
        if (centreleft_8_top_textfield.getText().isEmpty()) {
            centreleft_8_top_textfield.setText("0");
            sumasset.add(0);
            value8.add(0);
        } else {
            sumasset.add(Integer.parseInt(centreleft_8_top_textfield.getText()));
            value8.add(Integer.parseInt(centreleft_8_top_textfield.getText()));

        }
        if (centreleft_9_top_textfield.getText().isEmpty()) {
            centreleft_9_top_textfield.setText("0");
            sumasset.add(0);
            value9.add(0);
        } else {
            sumasset.add(Integer.parseInt(centreleft_9_top_textfield.getText()));
            value9.add(Integer.parseInt(centreleft_9_top_textfield.getText()));

        }
        if (centreleft_10_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 3; i++) {
                left10i.add(0);
            }
            sumasset.add(0);
        } else {
            sumasset.add(Integer.parseInt(centreleft_10_top_textfield.getText()));
        }

        if (centreright_1_top_textfield.getText().isEmpty()) {
            jsonnullr1();
            sumasset.add(0);

        } else {
            jsonnullr1(right1s.size());
            sumasset.add(Integer.parseInt(centreright_1_top_textfield.getText()));

        }
        if (centreright_2_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 4; i++) {
                right2i.add(0);
            }
            sumasset.add(0);

        } else {
            sumasset.add(Integer.parseInt(centreright_2_top_textfield.getText()));
            //JOptionPane.showMessageDialog(null,sumasset);

        }
        netwealth13();

        if (centreright_4_top_textfield.getText().isEmpty()) {
            centreright_4_top_textfield.setText("0");
            previncome = 0;
            valuer4.add(0);
        } else {
            previncome = Integer.parseInt(centreright_4_top_textfield.getText());
            valuer4.add(previncome);
        }
        accretionincome5(previncome);

        if (centreright_6_top_textfield.getText().isEmpty()) {
            centreright_6_top_textfield.setText("0");
            familyexpepense = 0;
            valuer6.add(0);
        } else {
            familyexpepense = Integer.parseInt(centreright_6_top_textfield.getText());
            valuer6.add(familyexpepense);
        }

        if (centreright_7_top_textfield.getText().isEmpty()) {
            valuer71.add(0);
            valuer72.add(0);

        } else {
            valuer71.add(Integer.parseInt(centreright_7_top_textfield_next_exampted1.getText()));
            valuer72.add(Integer.parseInt(centreright_7_top_textfield_next_taxable2.getText()));

        }
        accretionincome8(familyexpepense);

        if (centreright_9_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 3; i++) {
                right9i.add(0);
            }
            sumsource.add(0);
        } else {
            sumsource.add(Integer.parseInt(centreleft_9_top_textfield.getText()));
        }

        finaloutput();
        //conn.AssetLiability(NIN, value1, left2s, left2i1, left2i2, left3s, left3i1, left4s, left4i1,left5i, left6s, left6i1, left7s, left7i1, left7i2, value8, value9, left10i, right1s, right1i1, right2i, valuer3, valuer4, valuer5, valuer6, valuer71, valuer72, valuer8, right9i, valuer10);
        conn.AssetLiability(NIN, value1, shareholdingname, shareholdingshare, shareholdingamount, nonagriculname, nonagriculcost, agriculname, agriculcost, investment, motorname, motoramount, jwelleryname, jwelleryquantity, jwellerycost, value8, value9, cashasset, otherassetname, otherassetcost, lessliability, valuer3, valuer4, valuer5, valuer6, dependentmember, valuer8, sourcefund, valuer10,ayear);

        HousePropertyIcome hp = new HousePropertyIcome();
        hp.accessnin(NIN,ayear);
        hp.setVisible(true);
        dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }

}

public void bottom() {

}

public void update(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException {
    jj.setVisible(false);
    update.setVisible(true);
    accessnin(text,ayear);
    assetliabilityreturn = conn.Assetliavilityreturn(text,ayear);
    centreleft_1_top_textfield.setText(assetliabilityreturn[1]);
    centreleft_8_top_textfield.setText(assetliabilityreturn[8]);
    centreleft_9_top_textfield.setText(assetliabilityreturn[9]);
    centreleft_1_top_textfield.setEnabled(false);
    centreright_6_top_textfield.setEnabled(false);
    centreright_6_top_textfield.setText(Integer.toString(sumexpense));

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
    //totalasset[1]=Assetamount2;
    String[][] dataasset2 = {
        {"Name", "Share", "Cost"},
        {Assetname2[0], Integer.toString(Assetshare2[0]), Integer.toString(Assetshare2[0])},
        {Assetname2[1], Integer.toString(Assetshare2[1]), Integer.toString(Assetshare2[1])},
        {Assetname2[2], Integer.toString(Assetshare2[2]), Integer.toString(Assetshare2[2])},
        {Assetname2[3], Integer.toString(Assetshare2[3]), Integer.toString(Assetshare2[3])},
        {Assetname2[4], Integer.toString(Assetshare2[4]), Integer.toString(Assetshare2[4])},
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
    //  totalasset[2]=Assetamount3;
    String[][] dataasset3 = {
        {"Name", "Cost"},
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
    // totalasset[3]=Assetamount4;

    String[][] dataasset4 = {
        {"Name", "Cost"},
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
    //  totalasset[4]=Assetamount5;
    String[][] dataasset5 = {
        {"Name", "Cost"},
        {Assetname5[0], Integer.toString(Assetcost5[0])},
        {Assetname5[1], Integer.toString(Assetcost5[1])},
        {Assetname5[2], Integer.toString(Assetcost5[2])},
        {Assetname5[3], Integer.toString(Assetcost5[3])},
        {Assetname5[4], Integer.toString(Assetcost5[4])},
        {Assetname5[5], Integer.toString(Assetcost5[5])},
        {" ", "Total=" + Integer.toString(Assetamount5)},};

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
    // totalasset[5]=Assetamount6;
    String[][] dataasset6 = {
        {"Name", "Cost"},
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
    // totalasset[6]=Assetamount7;
    // totalasset[7]=Integer.parseInt(assetliabilityreturn[8]);
    // totalasset[8]=Integer.parseInt(assetliabilityreturn[9]);
    String[][] dataasset7 = {
        {"Name", "Cost"},
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
    // totalasset[9]=Assetamount10;
    String[][] dataasset10 = {
        {"Name", "Cost"},
        {Assetname10[0], Integer.toString(Assetcost10[0])},
        {Assetname10[1], Integer.toString(Assetcost10[1])},
        {Assetname10[2], Integer.toString(Assetcost10[2])},
        {" ", "Total=" + Integer.toString(Assetamount10)},};

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
    // totalasset[10]=Assetamount11;
    String[][] dataasset11 = {
        {"Name", "Cost"},
        {Assetname11[0], Integer.toString(Assetcost11[0])},
        {Assetname11[1], Integer.toString(Assetcost11[1])},
        {Assetname11[2], Integer.toString(Assetcost11[2])},
        {Assetname11[3], Integer.toString(Assetcost11[3])},
        {Assetname11[4], Integer.toString(Assetcost11[4])},
        {" ", "Total=" + Integer.toString(Assetamount11)},};

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
        {"Name", "Cost"},
        {Assetname12[0], Integer.toString(Assetcost12[0])},
        {Assetname12[1], Integer.toString(Assetcost12[1])},
        {Assetname12[2], Integer.toString(Assetcost12[2])},
        {Assetname12[3], Integer.toString(Assetcost12[3])},
        {" ", "Total=" + Integer.toString(Assetamount12)},};

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
        {"Name", "Cost"},
        {Assetname19[0], Integer.toString(Assetcost19[0])},
        {Assetname19[1], Integer.toString(Assetcost19[1])},
        {Assetname19[2], Integer.toString(Assetcost19[2])},
        {" ", "Total=" + Integer.toString(Assetamount19)},};

    centreleft_2_top_adddetail_update.setVisible(true);
    centreleft_2_top_adddetail.setVisible(false);
    centreleft_2_top_adddetail_update.addActionListener(e -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_2_top_upper = new JPanel();
        centreleft_2_top_box_upper = new BoxLayout(centreleft_2_top_upper, BoxLayout.Y_AXIS);
        centreleft_2_top_upper.setLayout(centreleft_2_top_box_upper);

        centreleft_2_top_middle = new JPanel();
        centreleft_2_top_middle.setBackground(Color.green);

        centreleft_2_top.add(centreleft_2_top_upper, BorderLayout.NORTH);
        centreleft_2_top.add(centreleft_2_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            comapayname[i] = new JLabel("Name Of Company:" + (i + 1) + "                                     ");
            comapanynametextfield[i] = new JTextField();
            comapanynametextfield[i].setText((Assetname2[i]));

            comapanyshare[i] = new JLabel("Amount of share:" + (i + 1) + "                                     ");
            comapanysharetextfield[i] = new JTextField();
            comapanysharetextfield[i].setText(Integer.toString(Assetcost2[i]));

            comapanyamount[i] = new JLabel("Amount of Money :" + (i + 1) + "                                     ");
            comapanyamounttextfield[i] = new JTextField();
            comapanyamounttextfield[i].setText(Integer.toString(Assetshare2[i]));

            companyaddbutton[i] = new JButton("Add");
            // companyaddbutton[i].addActionListener(f->right_addle2(comapanynametextfield[i].getText(),Integer.parseInt(comapanysharetextfield[i].getText()),Integer.parseInt(comapanyamounttextfield[i].getText())));
            centreleft_2_top_upper.add(Box.createVerticalStrut(20));
            centreleft_2_top_upper.add(comapayname[i]);
            centreleft_2_top_upper.add(comapanynametextfield[i]);

            centreleft_2_top_upper.add(Box.createVerticalStrut(20));
            centreleft_2_top_upper.add(comapanyshare[i]);
            centreleft_2_top_upper.add(comapanysharetextfield[i]);

            centreleft_2_top_upper.add(Box.createVerticalStrut(20));
            centreleft_2_top_upper.add(comapanyamount[i]);
            centreleft_2_top_upper.add(comapanyamounttextfield[i]);
            centreleft_2_top_upper.add(Box.createVerticalStrut(20));

        }
        centreleft_2_top_middle.add(companyaddbutton[0]);
        companyaddbutton[0].addActionListener(f -> {
            for (int i = 0; i < 5; i++) {
                // left2s.add(comapanynametextfield[i].getText());
                // left2i1.add(Integer.parseInt(comapanysharetextfield[i].getText()));
                // left2i2.add(Integer.parseInt(comapanyamounttextfield[i].getText()));
                shareholdingname[i] = comapanynametextfield[i].getText();
                shareholdingshare[i] = Integer.parseInt(comapanysharetextfield[i].getText());
                shareholdingamount[i] = Integer.parseInt(comapanyamounttextfield[i].getText());
                totalsum = totalsum + shareholdingamount[i];

            }
            centreleft_2_top_textfield.setText(Integer.toString(Integer.parseInt(comapanyamounttextfield[0].getText()) + Integer.parseInt(comapanyamounttextfield[1].getText()) + Integer.parseInt(comapanyamounttextfield[2].getText()) + Integer.parseInt(comapanyamounttextfield[3].getText()) + Integer.parseInt(comapanyamounttextfield[4].getText())));
            centreleft_2_top_textfield.setEnabled(true);
            centreleft_2_top_upper.setVisible(false);
            centreleft_2_top_middle.setVisible(false);
        });

        mainbody.revalidate();

    });

    centreleft_3_top_adddetail_update.setVisible(true);
    centreleft_3_top_adddetail.setVisible(false);
    centreleft_3_top_adddetail_update.addActionListener(f -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_3_top_upper = new JPanel();
        centreleft_3_top_box_upper = new BoxLayout(centreleft_3_top_upper, BoxLayout.Y_AXIS);
        centreleft_3_top_upper.setLayout(centreleft_3_top_box_upper);

        centreleft_3_top_middle = new JPanel();
        centreleft_3_top_middle.setBackground(Color.green);

        centreleft_3_top.add(centreleft_3_top_upper, BorderLayout.NORTH);
        centreleft_3_top.add(centreleft_3_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            nonagriname[i] = new JLabel("Land/House Property(Description & location Property): " + (i + 1) + "                                    ");
            nonagrinametextfield[i] = new JTextField();
            nonagrinametextfield[i].setText((Assetname3[i]));

            nonagriamount[i] = new JLabel("Amount(Tk):" + (i + 1) + "                                     ");
            nonagriamounttextfield[i] = new JTextField();
            nonagriamounttextfield[i].setText(Integer.toString(Assetshare3[i]));

            nonagriaddbutton[i] = new JButton("Add");
            // companyaddbutton[i].addActionListener(f->right_addle2(comapanynametextfield[i].getText(),Integer.parseInt(comapanysharetextfield[i].getText()),Integer.parseInt(comapanyamounttextfield[i].getText())));
            centreleft_3_top_upper.add(Box.createVerticalStrut(20));
            centreleft_3_top_upper.add(nonagriname[i]);
            centreleft_3_top_upper.add(nonagrinametextfield[i]);

            centreleft_3_top_upper.add(Box.createVerticalStrut(20));
            centreleft_3_top_upper.add(nonagriamount[i]);
            centreleft_3_top_upper.add(nonagriamounttextfield[i]);
            centreleft_3_top_upper.add(Box.createVerticalStrut(20));

        }
        centreleft_3_top_middle.add(nonagriaddbutton[0]);
        nonagriaddbutton[0].addActionListener(g -> {
            for (int i = 0; i < 5; i++) {
                // left3s.add(nonagrinametextfield[i].getText());
                // left3i1.add(Integer.parseInt(nonagriamounttextfield[i].getText()));
                nonagriculname[i] = nonagrinametextfield[i].getText();
                nonagriculcost[i] = Integer.parseInt(nonagriamounttextfield[i].getText());
                totalsum = totalsum + nonagriculcost[i];

            }
            centreleft_3_top_textfield.setText(Integer.toString(Integer.parseInt(nonagriamounttextfield[0].getText()) + Integer.parseInt(nonagriamounttextfield[1].getText()) + Integer.parseInt(nonagriamounttextfield[2].getText()) + Integer.parseInt(nonagriamounttextfield[3].getText()) + Integer.parseInt(nonagriamounttextfield[4].getText())));
            centreleft_3_top_textfield.setEnabled(true);
            centreleft_3_top_upper.setVisible(false);
            centreleft_3_top_middle.setVisible(false);

        });
        mainbody.revalidate();
    });

    centreleft_4_top_adddetail_update.setVisible(true);
    centreleft_4_top_adddetail.setVisible(false);
    centreleft_4_top_adddetail_update.addActionListener(f -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_4_top_upper = new JPanel();
        centreleft_4_top_box_upper = new BoxLayout(centreleft_4_top_upper, BoxLayout.Y_AXIS);
        centreleft_4_top_upper.setLayout(centreleft_4_top_box_upper);

        centreleft_4_top_middle = new JPanel();
        centreleft_4_top_middle.setBackground(Color.green);

        centreleft_4_top.add(centreleft_4_top_upper, BorderLayout.NORTH);
        centreleft_4_top.add(centreleft_4_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            agriname[i] = new JLabel("Land/House Property(Description & location Property): " + (i + 1) + "                                    ");
            agrinametextfield[i] = new JTextField();
            agrinametextfield[i].setText((Assetname4[i]));

            agriamount[i] = new JLabel("Amount(Tk):  " + (i + 1) + "                                   ");
            agriamounttextfield[i] = new JTextField();
            agriamounttextfield[i].setText(Integer.toString(Assetshare4[i]));

            agriaddbutton[i] = new JButton("Add");
            // companyaddbutton[i].addActionListener(f->right_addle2(comapanynametextfield[i].getText(),Integer.parseInt(comapanysharetextfield[i].getText()),Integer.parseInt(comapanyamounttextfield[i].getText())));
            centreleft_4_top_upper.add(Box.createVerticalStrut(20));
            centreleft_4_top_upper.add(agriname[i]);
            centreleft_4_top_upper.add(agrinametextfield[i]);

            centreleft_4_top_upper.add(Box.createVerticalStrut(20));
            centreleft_4_top_upper.add(agriamount[i]);
            centreleft_4_top_upper.add(agriamounttextfield[i]);
            centreleft_4_top_upper.add(Box.createVerticalStrut(20));

        }
        centreleft_4_top_middle.add(agriaddbutton[0]);
        agriaddbutton[0].addActionListener(g -> {
            for (int i = 0; i < 5; i++) {
                // left4s.add(agrinametextfield[i].getText());
                //left4i1.add(Integer.parseInt(agriamounttextfield[i].getText()));
                agriculname[i] = agrinametextfield[i].getText();
                agriculcost[i] = Integer.parseInt(agriamounttextfield[i].getText());
                totalsum = totalsum + agriculcost[i];
            }
            centreleft_4_top_textfield.setText(Integer.toString(Integer.parseInt(agriamounttextfield[0].getText()) + Integer.parseInt(agriamounttextfield[1].getText()) + Integer.parseInt(agriamounttextfield[2].getText()) + Integer.parseInt(agriamounttextfield[3].getText()) + Integer.parseInt(agriamounttextfield[4].getText())));
            centreleft_4_top_textfield.setEnabled(true);
            centreleft_4_top_upper.setVisible(false);
            centreleft_4_top_middle.setVisible(false);

        });
        mainbody.revalidate();
    });

    centreleft_5_top_adddetail_update.setVisible(true);
    centreleft_5_top_adddetail.setVisible(false);
    centreleft_5_top_adddetail_update.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_5_top_upper = new JPanel();
        centreleft_5_top_box_upper = new BoxLayout(centreleft_5_top_upper, BoxLayout.Y_AXIS);
        centreleft_5_top_upper.setLayout(centreleft_5_top_box_upper);

        centreleft_5_top_middle = new JPanel();
        centreleft_5_top_middle.setBackground(Color.green);

        centreleft_5_top.add(centreleft_5_top_upper, BorderLayout.NORTH);
        centreleft_5_top.add(centreleft_5_top_middle, BorderLayout.CENTER);
        centreleft_5_top_label_next_share1 = new JLabel("Share/Debentures:                                     ");
        centreleft_5_top_textfield_next_share1 = new JTextField();
        centreleft_5_top_textfield_next_share1.setText(Integer.toString(Assetcost5[0]));

        centreleft_5_top_label_next_insurance1 = new JLabel("Insurance/Saving Certificate:                                     ");
        centreleft_5_top_textfield_next_insurance1 = new JTextField();
        centreleft_5_top_textfield_next_insurance1.setText(Integer.toString(Assetcost5[1]));

        centreleft_5_top_label_next_dps1 = new JLabel("Saving Schema(DPS):                                     ");
        centreleft_5_top_textfield_next_dps1 = new JTextField();
        centreleft_5_top_textfield_next_dps1.setText(Integer.toString(Assetcost5[2]));

        centreleft_5_top_label_next_profund1 = new JLabel("Provident Fund:                                     ");
        centreleft_5_top_textfield_next_profund1 = new JTextField();
        centreleft_5_top_textfield_next_profund1.setText(Integer.toString(Assetcost5[3]));

        centreleft_5_top_label_next_annualfund1 = new JLabel("Contribution to Annual Fund:                                     ");
        centreleft_5_top_textfield_next_annualfund1 = new JTextField();
        centreleft_5_top_textfield_next_annualfund1.setText(Integer.toString(Assetcost5[4]));

        centreleft_5_top_label_next_groupinsurance1 = new JLabel("Group Insurance:                                     ");
        centreleft_5_top_textfield_next_groupinsurance1 = new JTextField();
        centreleft_5_top_textfield_next_groupinsurance1.setText(Integer.toString(Assetcost5[5]));

        centreleft_5_top_add = new JButton("Add");

        centreleft_5_top_add.addActionListener(f
                -> {
            if (centreleft_5_top_textfield_next_share1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_share1.getText()));
            }
            if (centreleft_5_top_textfield_next_insurance1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_insurance1.getText()));
            }
            if (centreleft_5_top_textfield_next_dps1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_dps1.getText()));
            }
            if (centreleft_5_top_textfield_next_profund1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_profund1.getText()));
            }
            if (centreleft_5_top_textfield_next_annualfund1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_annualfund1.getText()));
            }
            if (centreleft_5_top_textfield_next_groupinsurance1.getText().isEmpty()) {
                left5i.add(0);
            } else {
                left5i.add(Integer.parseInt(centreleft_5_top_textfield_next_groupinsurance1.getText()));
            }

            // int sum=adddetails_add(Integer.parseInt(centreleft_5_top_textfield_next_share1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_insurance1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_dps1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_profund1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_annualfund1.getText()),Integer.parseInt(centreleft_5_top_textfield_next_groupinsurance1.getText()));
            int sum = adddetails_add1(left5i);

            centreleft_5_top_textfield.setText(Integer.toString(sum));
            centreleft_5_top_textfield.setEnabled(true);
            centreleft_5_top_upper.setVisible(false);
            centreleft_5_top_middle.setVisible(false);
            for (int i = 0; i < 6; i++) {
                investment[i] = left5i.get(i);
                totalsum = totalsum + investment[i];
            }
        });

        centreleft_5_top_upper.add(Box.createVerticalStrut(20));
        centreleft_5_top_upper.add(centreleft_5_top_label_next_share1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_share1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_insurance1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_insurance1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_dps1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_dps1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_profund1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_profund1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_annualfund1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_annualfund1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_groupinsurance1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_groupinsurance1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_middle.add(centreleft_5_top_add);
        mainbody.revalidate();
    });

    centreleft_6_top_adddetail_update.setVisible(true);
    centreleft_6_top_adddetail.setVisible(false);
    centreleft_6_top_adddetail_update.addActionListener(f -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_6_top_upper = new JPanel();
        centreleft_6_top_box_upper = new BoxLayout(centreleft_6_top_upper, BoxLayout.Y_AXIS);
        centreleft_6_top_upper.setLayout(centreleft_6_top_box_upper);

        centreleft_6_top_middle = new JPanel();
        centreleft_6_top_middle.setBackground(Color.green);

        centreleft_6_top.add(centreleft_6_top_upper, BorderLayout.NORTH);
        centreleft_6_top.add(centreleft_6_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            motorrname[i] = new JLabel("Type of Motor vehicles and Registration number:" + (i + 1) + "                                      ");
            motorrnametextfield[i] = new JTextField();
            motorrnametextfield[i].setText((Assetname6[i]));

            motorramount[i] = new JLabel("Amount(Tk):  " + (i + 1) + "                                   ");
            motorramounttextfield[i] = new JTextField();
            motorramounttextfield[i].setText(Integer.toString(Assetshare6[i]));

            motorraddbutton[i] = new JButton("Add");
            // companyaddbutton[i].addActionListener(f->right_addle2(comapanynametextfield[i].getText(),Integer.parseInt(comapanysharetextfield[i].getText()),Integer.parseInt(comapanyamounttextfield[i].getText())));
            centreleft_6_top_upper.add(Box.createVerticalStrut(20));
            centreleft_6_top_upper.add(motorrname[i]);
            centreleft_6_top_upper.add(motorrnametextfield[i]);

            centreleft_6_top_upper.add(Box.createVerticalStrut(20));
            centreleft_6_top_upper.add(motorramount[i]);
            centreleft_6_top_upper.add(motorramounttextfield[i]);
            centreleft_6_top_upper.add(Box.createVerticalStrut(20));

        }
        centreleft_6_top_middle.add(motorraddbutton[0]);
        motorraddbutton[0].addActionListener(g -> {
            for (int i = 0; i < 5; i++) {
                // left6s.add(motorrnametextfield[i].getText());
                //left6i1.add(Integer.parseInt(motorramounttextfield[i].getText()));
                motorname[i] = motorrnametextfield[i].getText();
                motoramount[i] = Integer.parseInt(motorramounttextfield[i].getText());
                totalsum = totalsum + motoramount[i];

            }
            centreleft_6_top_textfield.setText(Integer.toString(Integer.parseInt(motorramounttextfield[0].getText()) + Integer.parseInt(motorramounttextfield[1].getText()) + Integer.parseInt(motorramounttextfield[2].getText()) + Integer.parseInt(motorramounttextfield[3].getText()) + Integer.parseInt(motorramounttextfield[4].getText())));
            centreleft_6_top_textfield.setEnabled(true);
            centreleft_6_top_upper.setVisible(false);
            centreleft_6_top_middle.setVisible(false);

        });
        mainbody.revalidate();
    });

    centreleft_7_top_adddetail_update.setVisible(true);
    centreleft_7_top_adddetail.setVisible(false);
    centreleft_7_top_adddetail_update.addActionListener(e -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_7_top_upper = new JPanel();
        centreleft_7_top_box_upper = new BoxLayout(centreleft_7_top_upper, BoxLayout.Y_AXIS);
        centreleft_7_top_upper.setLayout(centreleft_7_top_box_upper);

        centreleft_7_top_middle = new JPanel();
        centreleft_7_top_middle.setBackground(Color.green);

        centreleft_7_top.add(centreleft_7_top_upper, BorderLayout.NORTH);
        centreleft_7_top.add(centreleft_7_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            jwname[i] = new JLabel("Name Of Company:" + (i + 1) + "                                     ");
            jwnametextfield[i] = new JTextField();
            jwnametextfield[i].setText((Assetname7[i]));

            jwshare[i] = new JLabel("Amount of share:" + (i + 1) + "                                     ");
            jwsharetextfield[i] = new JTextField();
            jwsharetextfield[i].setText(Integer.toString(Assetcost7[i]));

            jwamount[i] = new JLabel("Amount of Money :" + (i + 1) + "                                     ");
            jwamounttextfield[i] = new JTextField();
            jwamounttextfield[i].setText(Integer.toString(Assetshare7[i]));

            jwaddbutton[i] = new JButton("Add");
            // companyaddbutton[i].addActionListener(f->right_addle2(comapanynametextfield[i].getText(),Integer.parseInt(comapanysharetextfield[i].getText()),Integer.parseInt(comapanyamounttextfield[i].getText())));
            centreleft_7_top_upper.add(Box.createVerticalStrut(20));
            centreleft_7_top_upper.add(jwname[i]);
            centreleft_7_top_upper.add(jwnametextfield[i]);

            centreleft_7_top_upper.add(Box.createVerticalStrut(20));
            centreleft_7_top_upper.add(jwshare[i]);
            centreleft_7_top_upper.add(jwsharetextfield[i]);

            centreleft_7_top_upper.add(Box.createVerticalStrut(20));
            centreleft_7_top_upper.add(jwamount[i]);
            centreleft_7_top_upper.add(jwamounttextfield[i]);
            centreleft_7_top_upper.add(Box.createVerticalStrut(20));

        }
        centreleft_7_top_middle.add(jwaddbutton[0]);
        jwaddbutton[0].addActionListener(f -> {
            for (int i = 0; i < 5; i++) {
                jwelleryname[i] = jwnametextfield[i].getText();
                jwelleryquantity[i] = Integer.parseInt(jwsharetextfield[i].getText());
                jwellerycost[i] = Integer.parseInt(jwamounttextfield[i].getText());
                totalsum = totalsum + jwellerycost[i];

            }
            centreleft_7_top_textfield.setText(Integer.toString(Integer.parseInt(jwamounttextfield[0].getText()) + Integer.parseInt(jwamounttextfield[1].getText()) + Integer.parseInt(jwamounttextfield[2].getText()) + Integer.parseInt(jwamounttextfield[3].getText()) + Integer.parseInt(jwamounttextfield[4].getText())));
            centreleft_7_top_textfield.setEnabled(true);
            centreleft_7_top_upper.setVisible(false);
            centreleft_7_top_middle.setVisible(false);
        });

        mainbody.revalidate();

    });

    centreleft_10_top_adddetail_update.setVisible(true);
    centreleft_10_top_adddetail.setVisible(false);
    centreleft_10_top_adddetail_update.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_10_top_upper = new JPanel();
        centreleft_10_top_box_upper = new BoxLayout(centreleft_10_top_upper, BoxLayout.Y_AXIS);
        centreleft_10_top_upper.setLayout(centreleft_10_top_box_upper);

        centreleft_10_top_middle = new JPanel();
        centreleft_10_top_middle.setBackground(Color.green);

        centreleft_10_top.add(centreleft_10_top_upper, BorderLayout.NORTH);
        centreleft_10_top.add(centreleft_10_top_middle, BorderLayout.CENTER);
        centreleft_10_top_label_next_cashhand1 = new JLabel("Cash in hand:                                     ");
        centreleft_10_top_textfield_next_cashhand1 = new JTextField();
        centreleft_10_top_textfield_next_cashhand1.setText(Integer.toString(Assetcost10[0]));

        centreleft_10_top_label_next_cashbank2 = new JLabel("Cash in Bank:                                   ");
        centreleft_10_top_textfield_next_cashbank2 = new JTextField();
        centreleft_10_top_textfield_next_cashbank2.setText(Integer.toString(Assetcost10[1]));

        centreleft_10_top_label_next_other2 = new JLabel("Other Deposits((Paid the interset of Mortgages):                                   ");
        centreleft_10_top_textfield_next_other2 = new JTextField();
        centreleft_10_top_textfield_next_other2.setText(Integer.toString(Assetcost10[2]));

        centreleft_10_top_add = new JButton("Add");

        centreleft_10_top_add.addActionListener(f
                -> {
            if (centreleft_10_top_textfield_next_cashhand1.getText().isEmpty()) {
                left10i.add(0);
            } else {
                left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_cashhand1.getText()));
            }
            if (centreleft_10_top_textfield_next_cashbank2.getText().isEmpty()) {
                left10i.add(0);
            } else {
                left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_cashbank2.getText()));
            }
            if (centreleft_10_top_textfield_next_other2.getText().isEmpty()) {
                left10i.add(0);
            } else {
                left10i.add(Integer.parseInt(centreleft_10_top_textfield_next_other2.getText()));
            }
            int sum = adddetails_add1(left10i);
            for (int i = 0; i < 3; i++) {
                cashasset[i] = left10i.get(i);
                totalsum = totalsum + cashasset[i];
            }

            centreleft_10_top_textfield.setText(Integer.toString(sum));
            centreleft_10_top_textfield.setEnabled(true);
            centreleft_10_top_upper.setVisible(false);
            centreleft_10_top_middle.setVisible(false);
        });

        centreleft_10_top_upper.add(Box.createVerticalStrut(20));

        centreleft_10_top_upper.add(centreleft_10_top_label_next_cashhand1);
        centreleft_10_top_upper.add(centreleft_10_top_textfield_next_cashhand1);
        centreleft_10_top_upper.add(Box.createVerticalStrut(20));

        centreleft_10_top_upper.add(centreleft_10_top_label_next_cashbank2);
        centreleft_10_top_upper.add(centreleft_10_top_textfield_next_cashbank2);
        centreleft_10_top_upper.add(Box.createVerticalStrut(20));

        centreleft_10_top_upper.add(centreleft_10_top_label_next_other2);
        centreleft_10_top_upper.add(centreleft_10_top_textfield_next_other2);
        centreleft_10_top_upper.add(Box.createVerticalStrut(20));
        centreleft_10_top_middle.add(centreleft_10_top_add);
        mainbody.revalidate();
    });

    centreright_1_top_adddetail_update.setVisible(true);
    centreright_1_top_adddetail.setVisible(false);
    centreright_1_top_adddetail_update.addActionListener(f -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreright_1_top_upper = new JPanel();
        centreright_1_top_box_upper = new BoxLayout(centreright_1_top_upper, BoxLayout.Y_AXIS);
        centreright_1_top_upper.setLayout(centreright_1_top_box_upper);

        centreright_1_top_middle = new JPanel();
        centreright_1_top_middle.setBackground(Color.green);

        centreright_1_top.add(centreright_1_top_upper, BorderLayout.NORTH);
        centreright_1_top.add(centreright_1_top_middle, BorderLayout.CENTER);

        for (int i = 0; i < 5; i++) {
            othername[i] = new JLabel("Type of Motor vehicles and Registration number:" + (i + 1) + "                                      ");
            othernametextfield[i] = new JTextField();
            othernametextfield[i].setText((Assetname11[i]));

            otheramount[i] = new JLabel("Amount(Tk):  " + (i + 1) + "                                   ");
            otheramounttextfield[i] = new JTextField();
            otheramounttextfield[i].setText(Integer.toString(Assetcost11[i]));

            otheraddbutton[i] = new JButton("Add");
            centreright_1_top_upper.add(Box.createVerticalStrut(20));
            centreright_1_top_upper.add(othername[i]);
            centreright_1_top_upper.add(othernametextfield[i]);

            centreright_1_top_upper.add(Box.createVerticalStrut(20));
            centreright_1_top_upper.add(otheramount[i]);
            centreright_1_top_upper.add(otheramounttextfield[i]);
            centreright_1_top_upper.add(Box.createVerticalStrut(20));

        }
        centreright_1_top_middle.add(otheraddbutton[0]);
        otheraddbutton[0].addActionListener(g -> {
            for (int i = 0; i < 5; i++) {
                otherassetname[i] = othernametextfield[i].getText();
                otherassetcost[i] = Integer.parseInt(otheramounttextfield[i].getText());
                totalsum = totalsum + otherassetcost[i];

            }
            centreright_1_top_textfield.setText(Integer.toString(Integer.parseInt(otheramounttextfield[0].getText()) + Integer.parseInt(otheramounttextfield[1].getText()) + Integer.parseInt(otheramounttextfield[2].getText()) + Integer.parseInt(otheramounttextfield[3].getText()) + Integer.parseInt(otheramounttextfield[4].getText())));
            centreright_1_top_textfield.setEnabled(true);
            centreright_1_top_upper.setVisible(false);
            centreright_1_top_middle.setVisible(false);

        });
        mainbody.revalidate();
    });

    centreright_2_top_adddetail_update.setVisible(true);
    centreright_2_top_adddetail.setVisible(false);
    centreright_2_top_adddetail_update.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreright_2_top_upper = new JPanel();
        centreright_2_top_box_upper = new BoxLayout(centreright_2_top_upper, BoxLayout.Y_AXIS);
        centreright_2_top_upper.setLayout(centreright_2_top_box_upper);

        centreright_2_top_middle = new JPanel();
        centreright_2_top_middle.setBackground(Color.green);

        centreright_2_top.add(centreright_2_top_upper, BorderLayout.NORTH);
        centreright_2_top.add(centreright_2_top_middle, BorderLayout.CENTER);
        centreright_2_top_label_next_mortgage1 = new JLabel("Mortgages Secured on property or land(tk):                                     ");
        centreright_2_top_textfield_next_mortgage1 = new JTextField();
        centreright_2_top_textfield_next_mortgage1.setText(Integer.toString(Assetcost12[0]));

        centreright_2_top_label_next_unsecured2 = new JLabel("Unsecured loans:                                   ");
        centreright_2_top_textfield_next_unsecured2 = new JTextField();
        centreright_2_top_textfield_next_unsecured2.setText(Integer.toString(Assetcost12[1]));

        centreright_2_top_label_next_provident2 = new JLabel("Loan From Provident Fund:                                   ");
        centreright_2_top_textfield_next_provident2 = new JTextField();
        centreright_2_top_textfield_next_provident2.setText(Integer.toString(Assetcost12[2]));

        centreright_2_top_label_next_other2 = new JLabel("Other:                                   ");
        centreright_2_top_textfield_next_other2 = new JTextField();
        centreright_2_top_textfield_next_other2.setText(Integer.toString(Assetcost12[3]));

        centreright_2_top_add = new JButton("Add");

        centreright_2_top_add.addActionListener(f
                -> {
            if (centreright_2_top_textfield_next_mortgage1.getText().isEmpty()) {
                right2i.add(0);
            } else {
                right2i.add(Integer.parseInt(centreright_2_top_textfield_next_mortgage1.getText()));
            }
            if (centreright_2_top_textfield_next_unsecured2.getText().isEmpty()) {
                right2i.add(0);
            } else {
                right2i.add(Integer.parseInt(centreright_2_top_textfield_next_unsecured2.getText()));
            }
            if (centreright_2_top_textfield_next_provident2.getText().isEmpty()) {
                right2i.add(0);
            } else {
                right2i.add(Integer.parseInt(centreright_2_top_textfield_next_provident2.getText()));
            }
            if (centreright_2_top_textfield_next_other2.getText().isEmpty()) {
                right2i.add(0);
            } else {
                right2i.add(Integer.parseInt(centreright_2_top_textfield_next_other2.getText()));
            }
            for (int i = 0; i < 4; i++) {
                lessliability[i] = right2i.get(i);
                lessliabilityy = lessliabilityy + lessliability[i];

            }
            int sum = adddetails_add1(right2i);
            centreright_2_top_textfield.setText(Integer.toString(sum));
            centreright_2_top_textfield.setEnabled(true);
            centreright_2_top_upper.setVisible(false);
            centreright_2_top_middle.setVisible(false);
        });

        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_mortgage1);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_mortgage1);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_unsecured2);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_unsecured2);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));

        centreright_2_top_upper.add(centreright_2_top_label_next_provident2);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_provident2);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));

        centreright_2_top_upper.add(centreright_2_top_label_next_other2);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_other2);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));

        centreright_2_top_middle.add(centreright_2_top_add);
        mainbody.revalidate();
    });

    centreright_7_top_adddetail_update.setVisible(true);
    centreright_7_top_adddetail.setVisible(false);
    centreright_7_top_adddetail_update.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreright_7_top_upper = new JPanel();
        centreright_7_top_box_upper = new BoxLayout(centreright_7_top_upper, BoxLayout.Y_AXIS);
        centreright_7_top_upper.setLayout(centreright_7_top_box_upper);

        centreright_7_top_middle = new JPanel();
        centreright_7_top_middle.setBackground(Color.green);

        centreright_7_top.add(centreright_7_top_upper, BorderLayout.NORTH);
        centreright_7_top.add(centreright_7_top_middle, BorderLayout.CENTER);
        centreright_7_top_label_next_exampted1 = new JLabel("Adult:                                     ");
        centreright_7_top_textfield_next_exampted1 = new JTextField();
        centreright_7_top_textfield_next_exampted1.setText(Integer.toString(Assetcost17[0]));

        centreright_7_top_label_next_taxable2 = new JLabel("Child:                                   ");
        centreright_7_top_textfield_next_taxable2 = new JTextField();
        centreright_7_top_textfield_next_taxable2.setText(Integer.toString(Assetcost17[1]));

        centreright_7_top_add = new JButton("Add");

        centreright_7_top_add.addActionListener(f
                -> {
            if (!centreright_7_top_textfield_next_exampted1.getText().isEmpty()) {
                dependentmember[0] = Integer.parseInt(centreright_7_top_textfield_next_exampted1.getText());
            }
            if (!centreright_7_top_textfield_next_taxable2.getText().isEmpty()) {
                dependentmember[1] = Integer.parseInt(centreright_7_top_textfield_next_taxable2.getText());
            }

            int sum = dependentmember[0] + dependentmember[1];
            centreright_7_top_textfield.setText(Integer.toString(sum));
            centreright_7_top_textfield.setEnabled(true);
            centreright_7_top_upper.setVisible(false);
            centreright_7_top_middle.setVisible(false);
        });

        centreright_7_top_upper.add(Box.createVerticalStrut(20));
        centreright_7_top_upper.add(centreright_7_top_label_next_exampted1);
        centreright_7_top_upper.add(centreright_7_top_textfield_next_exampted1);
        centreright_7_top_upper.add(Box.createVerticalStrut(20));
        centreright_7_top_upper.add(centreright_7_top_label_next_taxable2);
        centreright_7_top_upper.add(centreright_7_top_textfield_next_taxable2);
        centreright_7_top_upper.add(Box.createVerticalStrut(20));
        centreright_7_top_middle.add(centreright_7_top_add);
        mainbody.revalidate();
    });

    centreright_9_top_adddetail_update.setVisible(true);
    centreright_9_top_adddetail.setVisible(false);
    centreright_9_top_adddetail_update.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreright_9_top_upper = new JPanel();
        centreright_9_top_box_upper = new BoxLayout(centreright_9_top_upper, BoxLayout.Y_AXIS);
        centreright_9_top_upper.setLayout(centreright_9_top_box_upper);

        centreright_9_top_middle = new JPanel();
        centreright_9_top_middle.setBackground(Color.green);

        centreright_9_top.add(centreright_9_top_upper, BorderLayout.NORTH);
        centreright_9_top.add(centreright_9_top_middle, BorderLayout.CENTER);
        centreright_9_top_label_next_returnincome1 = new JLabel("Shown Return Income:                                     ");
        centreright_9_top_textfield_next_returnincome1 = new JTextField();
        centreright_9_top_textfield_next_returnincome1.setText(Integer.toString(Assetcost19[0]));

        centreright_9_top_label_next_freeincome2 = new JLabel("Tax Free Income:                                   ");
        centreright_9_top_textfield_next_freeincome2 = new JTextField();
        centreright_9_top_textfield_next_freeincome2.setText(Integer.toString(Assetcost19[1]));

        centreright_9_top_label_next_other2 = new JLabel("Other Reciepts:                                   ");
        centreright_9_top_textfield_next_other2 = new JTextField();
        centreright_9_top_textfield_next_other2.setText(Integer.toString(Assetcost19[2]));

        centreright_9_top_add = new JButton("Add");

        centreright_9_top_add.addActionListener(f
                -> {
            if (centreright_9_top_textfield_next_returnincome1.getText().isEmpty()) {
                right9i.add(0);
            } else {
                right9i.add(Integer.parseInt(centreright_9_top_textfield_next_returnincome1.getText()));
            }
            if (centreright_9_top_textfield_next_freeincome2.getText().isEmpty()) {
                right9i.add(0);
            } else {
                right9i.add(Integer.parseInt(centreright_9_top_textfield_next_freeincome2.getText()));
            }
            if (centreright_9_top_textfield_next_other2.getText().isEmpty()) {
                right9i.add(0);
            } else {
                right9i.add(Integer.parseInt(centreright_9_top_textfield_next_other2.getText()));
            }
            for (int i = 0; i < 3; i++) {
                sourcefund[i] = right9i.get(i);
                sourcefundd = sourcefundd + sourcefund[i];
            }
            int sum = adddetails_add1(right9i);
            centreright_9_top_textfield.setText(Integer.toString(sum));
            centreright_9_top_textfield.setEnabled(true);
            centreright_9_top_upper.setVisible(false);
            centreright_9_top_middle.setVisible(false);
        });

        centreright_9_top_upper.add(Box.createVerticalStrut(20));
        centreright_9_top_upper.add(centreright_9_top_label_next_returnincome1);
        centreright_9_top_upper.add(centreright_9_top_textfield_next_returnincome1);
        centreright_9_top_upper.add(Box.createVerticalStrut(20));
        centreright_9_top_upper.add(centreright_9_top_label_next_freeincome2);
        centreright_9_top_upper.add(centreright_9_top_textfield_next_freeincome2);
        centreright_9_top_upper.add(Box.createVerticalStrut(20));

        centreright_9_top_upper.add(centreright_9_top_label_next_other2);
        centreright_9_top_upper.add(centreright_9_top_textfield_next_other2);
        centreright_9_top_upper.add(Box.createVerticalStrut(20));
        centreright_9_top_middle.add(centreright_9_top_add);
        mainbody.revalidate();
    });

    update.addActionListener(m -> {
        if (centreleft_2_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                shareholdingname[i] = Assetname2[i];
                shareholdingshare[i] = Assetshare2[i];
                shareholdingamount[i] = Assetcost2[i];
            }
        }

        if (centreleft_3_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                nonagriculname[i] = Assetname3[i];
                nonagriculcost[i] = Assetcost3[i];
            }

        }

        if (centreleft_4_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                agriculname[i] = Assetname3[i];
                agriculcost[i] = Assetcost3[i];
            }
        }

        if (centreleft_5_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 6; i++) {
                investment[i] = (Assetcost5[1]);
            }
        }
        if (centreleft_6_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                motorname[i] = Assetname6[i];
                motoramount[i] = Assetcost6[i];
            }
        }

        if (centreleft_7_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                jwelleryname[i] = Assetname7[i];
                jwelleryquantity[i] = Assetshare7[i];
                jwellerycost[i] = Assetcost7[i];
            }
        }

        if (centreleft_10_top_textfield.getText().isEmpty()) {

            cashasset[0] = (Assetcost10[0]);
            cashasset[1] = (Assetcost10[1]);
            cashasset[2] = (Assetcost10[2]);

        }

        if (centreright_1_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                otherassetname[i] = Assetname11[i];
                otherassetcost[i] = Assetcost11[i];

            }

        }
        if (centreright_2_top_textfield.getText().isEmpty()) {

            lessliability[0] = (Assetcost12[0]);
            lessliability[1] = (Assetcost12[1]);
            lessliability[2] = (Assetcost12[2]);
            lessliability[3] = (Assetcost12[3]);
            lessliabilityy = lessliabilityy + lessliability[0] + lessliability[1] + lessliability[2] + lessliability[3];

        }

        if (centreright_7_top_textfield.getText().isEmpty()) {

            dependentmember[0] = (Assetcost17[0]);
            dependentmember[1] = (Assetcost17[1]);

        }
        if (centreright_9_top_textfield.getText().isEmpty()) {

            sourcefund[0] = (Assetcost19[0]);
            sourcefund[1] = (Assetcost19[1]);
            sourcefund[2] = (Assetcost19[2]);
            sourcefundd = sourcefundd + Assetcost19[0] + Assetcost19[1] + Assetcost19[2];

        }

        value1.add(Integer.parseInt(centreleft_1_top_textfield.getText()));
        value8.add(Integer.parseInt(centreleft_8_top_textfield.getText()));
        value9.add(Integer.parseInt(centreleft_9_top_textfield.getText()));
        totalsum = totalsum + value1.get(0) + value8.get(0) + value9.get(0);
        valuer3.add(((totalsum - lessliabilityy)));

        if (centreright_4_top_textfield.getText().isEmpty()) {
            valuer4.add(0);
        } else {
            valuer4.add(Integer.parseInt(centreright_4_top_textfield.getText()));
        }

        valuer5.add(valuer3.get(0) - valuer4.get(0));

        //accessnin(text);
        valuer6.add(sumexpense);
        valuer8.add((valuer5.get(0) + valuer6.get(0)));
        valuer10.add((valuer8.get(0) - sourcefundd));

        try {
            conn.AssetLiabilityUpdate(text, value1, shareholdingname, shareholdingshare, shareholdingamount, nonagriculname, nonagriculcost, agriculname, agriculcost, investment, motorname, motoramount, jwelleryname, jwelleryquantity, jwellerycost, value8, value9, cashasset, otherassetname, otherassetcost, lessliability, valuer3, valuer4, valuer5, valuer6, dependentmember, valuer8, sourcefund, valuer10,ayear);
            HomeForm hp = new HomeForm();
            hp.setVisible(true);
            dispose();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AssesseeLiabilty.class.getName()).log(Level.SEVERE, null, ex);
        }

    });

}
}
