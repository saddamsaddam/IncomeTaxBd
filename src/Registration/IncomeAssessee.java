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
import static java.lang.System.out;
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
public class IncomeAssessee extends JFrame {
int ayear;
// IncomeAssessee ic=new IncomeAssessee();
JSONObject jsontaxpa;
JSONObject jsontaxpay;
int[] taxpaymentamount = new int[5];
long NIN;
public int[] option = new int[7];
int houseincome;
ArrayList<Integer> TaxPayment = new ArrayList<Integer>();
String[] salary1 = new String[18];
public String[] houseproperty = new String[17];
String[] investment = new String[17];

String[] taxdibate = new String[17];
String[] taxcount = new String[23];
int sumsalary = 0, taxfreeincome = 0, housepropertysum = 0, taxsum = 0, taxpaymentsum = 0;
double taxpayable = 0;
double sum1_9 = 0, investmentsum = 0;
ArrayList<Integer> taxpayment = new ArrayList();
double[] leftpart = new double[9];
double[] rightpart = new double[10];
databaseConnection conn = new databaseConnection();
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

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_8_top_adddetail, centreright_9_top_adddetail, centreright_10_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_8_top_add, centreright_9_top_add, centreright_10_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end, centreright_8_top_end, centreright_9_top_end, centreright_10_top_end, centreright_7_top_adddetail_update, jj, update, centreright_7_top_add_update;

public IncomeAssessee() throws ClassNotFoundException, SQLException {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test");
    mainbody();

}

public void accessnin(long a,int ayea) throws ClassNotFoundException, SQLException, JSONException {
        ayear=ayea;
    NIN = (a);
    salary1 = conn.SALARYRETURN(NIN,ayear);

    if (salary1[0].matches("-1")) {
        JOptionPane.showMessageDialog(null, "Not Salary data faund");

    } else {
        for (int i = 1; i < 18; i++) {
            JSONObject json = new JSONObject(salary1[i]);
            int c = Integer.parseInt(json.getString("EXIN"));
            int b = Integer.parseInt(json.getString("NETTAXIN"));
            sumsalary = sumsalary + b;
            taxfreeincome = taxfreeincome + c;
        }
        centreleft_1_top_textfield.setText(Integer.toString(sumsalary));

        centreright_9_top_textfield.setText(Double.toString(taxfreeincome));
        centreleft_1_top_textfield.setEnabled(false);
        centreright_4_top_textfield.setEnabled(false);
        centreright_9_top_textfield.setEnabled(false);
    }
    ///////HOUSEPROPERTY
    houseproperty = conn.HOUSEPROPERTYRETURN(NIN, ayear);
    if (houseproperty[0].matches("-1")) {
        JOptionPane.showMessageDialog(null, "Not Houseproperty data faund");

    } else {

        String type;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                houseincome = Integer.parseInt(houseproperty[0]);
            } else {
                JSONObject json = new JSONObject(houseproperty[i]);
                option[0] = Integer.parseInt(json.getString("Repair"));
                option[1] = Integer.parseInt(json.getString("Local_Tax"));
                option[2] = Integer.parseInt(json.getString("Land_Revenue"));
                option[3] = Integer.parseInt(json.getString("Interest_Loan"));
                option[4] = Integer.parseInt(json.getString("Insurance_Premium"));
                option[5] = Integer.parseInt(json.getString("Vacancy_Allowance"));
                option[6] = Integer.parseInt(json.getString("Other"));
                type = (json.getString("type"));

                for (int j = 0; j < 7; j++) {
                    if (j == 0) {
                        if (type.matches("Residential")) {
                            housepropertysum = housepropertysum + ((option[j] * 25) / 100);
                        } else {
                            housepropertysum = housepropertysum + ((option[j] * 30) / 100);
                        }
                    } else {
                        housepropertysum = housepropertysum + option[j];
                    }

                }
            }

        }

        centreleft_3_top_textfield.setText(Integer.toString(houseincome - housepropertysum));
        centreleft_3_top_textfield.setEnabled(false);
    }

    ///////TAXDIBATE
    taxdibate = conn.TAXDIBATE(NIN,ayear);
    if (taxdibate[0].matches("-1")) {
        JOptionPane.showMessageDialog(null, "Not Tax Dibate data faund");

    } else {

        int[] summ = new int[10];
        JSONObject jsonObject = new JSONObject(taxdibate[12]);
        // JSONObject temp=null;
        JSONArray jsonArray = jsonObject.getJSONArray("other");
        for (int i = 0; i < 5; i++) {
            JSONObject temp = null;
            temp = (JSONObject) jsonArray.get(i);
            summ[i] = temp.getInt("amount");
        }
        for (int i = 0; i < 5; i++) {
            taxsum = taxsum + summ[i];
        }

        for (int i = 1; i < 11; i++) {
            taxsum = taxsum + Integer.parseInt(taxdibate[i]);
        }
        // centreright_5_top_textfield.setText(Integer.toString(taxsum));
        centreright_5_top_textfield.setEnabled(false);
        centreright_6_top_textfield.setEnabled(false);
    }

}

public static void main(String[] args) throws ClassNotFoundException {
    IncomeAssessee window;
    try {
        window = new IncomeAssessee();
        window.setVisible(true);

    } catch (SQLException ex) {
        Logger.getLogger(IncomeAssessee.class.getName()).log(Level.SEVERE, null, ex);
    }

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
    JLabel jj = new JLabel("   kor count     ");
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
    //centreleft_8_centre.add(centreleft_9_centre,BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addleftcontent();

}

public void addleftcontent() {
    centreleft_1_top_box = new BoxLayout(centreleft_1_top, BoxLayout.Y_AXIS);
    centreleft_1_top.setLayout(centreleft_1_top_box);
    centreleft_1_top_label = new JLabel("  Salaries:u/s 21(as per schedule 1):                                                                                                                   ");
    centreleft_1_top_textfield = new JTextField();
    centreleft_1_top.add(centreleft_1_top_label);
    centreleft_1_top.add(centreleft_1_top_textfield);

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Interest on Securities:u/s 22                                    ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("Income From House property:u/s 24(as per schedule 2)                                    ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);

    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("Agricultural income:u/s 26                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);

    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("Income from business or profession:u/s 28:                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);

    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("Share Of Profit in a Firm:                                   ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);

    //7
    centreleft_7_top_box = new BoxLayout(centreleft_7_top, BoxLayout.Y_AXIS);
    centreleft_7_top.setLayout(centreleft_7_top_box);
    centreleft_7_top_label = new JLabel("Income Of the spouse or minor child as applicable:u/s 43(4)                                    ");
    centreleft_7_top_textfield = new JTextField();
    centreleft_7_top.add(centreleft_7_top_label);
    centreleft_7_top.add(centreleft_7_top_textfield);

    //8
    centreleft_8_top_box = new BoxLayout(centreleft_8_top, BoxLayout.Y_AXIS);
    centreleft_8_top.setLayout(centreleft_8_top_box);
    centreleft_8_top_label = new JLabel("Capital Gains:u/s 31                                  ");
    centreleft_8_top_textfield = new JTextField();
    centreleft_8_top.add(centreleft_8_top_label);
    centreleft_8_top.add(centreleft_8_top_textfield);

    //9
    centreleft_9_top_box = new BoxLayout(centreleft_9_top, BoxLayout.Y_AXIS);
    centreleft_9_top.setLayout(centreleft_9_top_box);
    centreleft_9_top_label = new JLabel("Income from other source:                                    ");
    centreleft_9_top_textfield = new JTextField();
    centreleft_9_top.add(centreleft_9_top_label);
    centreleft_9_top.add(centreleft_9_top_textfield);
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
    centreright_3_top_label = new JLabel("Total Income(Serial 10-11)korjoggo ay:                                   ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top_textfield.setEnabled(false);
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);
    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Tax Leviable on total income(kor count from total income):                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);
    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Tax rebate:u/s 44(2)(b)(as per schedule-3)(kor moukup):                                ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top_textfield.setEnabled(false);
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);
    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel("Tax payable(difference between serial 13 and 14)(kor map korar por ja obboisoi dite hobe):                              ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top_textfield.setEnabled(false);
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);
    //7
    centreright_7_top_box = new BoxLayout(centreright_7_top, BoxLayout.Y_AXIS);
    centreright_7_top.setLayout(centreright_7_top_box);
    centreright_7_top_label = new JLabel("Tax Payments: (koto paid)                              ");
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
    centreright_10_top.add(centreright_10_top_label);
    centreright_10_top.add(centreright_10_top_textfield);

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
    //NIN,RENTALINCOME,val1,val2,val3,val4,val5,val6,val7,valsum;
    if (centreright_7_top_textfield_next_taxdeducted1.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_taxdeducted1.getText()));
    }
    if (centreright_7_top_textfield_next_advancetax2.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_advancetax2.getText()));
    }
    if (centreright_7_top_textfield_next_taxpaid3.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_taxpaid3.getText()));
    }
    if (centreright_7_top_textfield_next_adjustrefund4.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_adjustrefund4.getText()));
    }

    for (int i = 0; i < 4; i++) {
        taxpaymentsum = taxpaymentsum + taxpayment.get(i);

    }
    centreright_7_top_textfield.setText(Integer.toString(taxpaymentsum));
    centreright_8_top_textfield.setText(Double.toString(taxpayable - taxpaymentsum));

    centreright_7_top_middle.setVisible(false);
    centreright_7_top_upper.setVisible(false);
    centreright_7_top_add.setVisible(false);
    // centrecentre_3_top_middle.setBackground(Color.gray);

}

public void adddetails_centre_add_update() {
    //NIN,RENTALINCOME,val1,val2,val3,val4,val5,val6,val7,valsum;
    if (centreright_7_top_textfield_next_taxdeducted1.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_taxdeducted1.getText()));
    }
    if (centreright_7_top_textfield_next_advancetax2.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_advancetax2.getText()));
    }
    if (centreright_7_top_textfield_next_taxpaid3.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_taxpaid3.getText()));
    }
    if (centreright_7_top_textfield_next_adjustrefund4.getText().isEmpty()) {
        taxpayment.add(0);
    } else {
        taxpayment.add(Integer.parseInt(centreright_7_top_textfield_next_adjustrefund4.getText()));
    }

    for (int i = 0; i < 4; i++) {
        taxpaymentsum = taxpaymentsum + taxpayment.get(i);

    }
    centreright_7_top_textfield.setText(Integer.toString(taxpaymentsum));
    centreright_8_top_textfield.setText(Double.toString(taxpayable - taxpaymentsum));

    centreright_7_top_middle.setVisible(false);
    centreright_7_top_upper.setVisible(false);
    centreright_7_top_add.setVisible(false);
    // centrecentre_3_top_middle.setBackground(Color.gray);

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

    jj = new JButton("                          Submit                          ");
    update = new JButton("                          Update                          ");
    bottom_top.add(jj);
    bottom_top.add(update);
    update.setVisible(false);
    jj.addActionListener(e -> submit());

}

public void submit() {
    try {

        //tax payment
        if (centreright_7_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 4; i++) {
                taxpayment.add(0);
            }
        }

//int  Salarylf1=Integer.parseInt(centreleft_1_top_textfield.getText()),lf2=Integer.parseInt(centreleft_2_top_textfield.getText()),HousePropertylf3=Integer.parseInt(centreleft_3_top_textfield.getText()),lf4=Integer.parseInt(centreleft_4_top_textfield.getText()),lf5=Integer.parseInt(centreleft_5_top_textfield.getText()),lf6=Integer.parseInt(centreleft_6_top_textfield.getText()),lf7=Integer.parseInt(centreleft_7_top_textfield.getText()),lf8=Integer.parseInt(centreleft_8_top_textfield.getText()),lf9=Integer.parseInt(centreleft_9_top_textfield.getText());
//int rg1=Integer.parseInt(centreright_1_top_textfield.getText()),rg2=Integer.parseInt(centreright_2_top_textfield.getText()),rg3=Integer.parseInt(centreright_3_top_textfield.getText()),rg4=Integer.parseInt(centreright_4_top_textfield.getText()),TaxCreditrg5=Integer.parseInt(centreright_5_top_textfield.getText()),rg6=Integer.parseInt(centreright_6_top_textfield.getText()),rg8=Integer.parseInt(centreright_8_top_textfield.getText()),rg9=Integer.parseInt(centreright_9_top_textfield.getText()),rg10=Integer.parseInt(centreright_10_top_textfield.getText());
        leftpart[0] = sumsalary;

        if (centreleft_2_top_textfield.getText().isEmpty()) {
            leftpart[1] = 0;

        } else {
            leftpart[1] = Integer.parseInt(centreleft_2_top_textfield.getText());
        }

        leftpart[2] = houseincome - housepropertysum;
        if (centreleft_4_top_textfield.getText().isEmpty()) {
            leftpart[3] = 0;

        } else {
            leftpart[3] = Integer.parseInt(centreleft_4_top_textfield.getText());
        }
        if (centreleft_5_top_textfield.getText().isEmpty()) {
            leftpart[4] = 0;

        } else {
            leftpart[4] = Integer.parseInt(centreleft_5_top_textfield.getText());
        }
        if (centreleft_6_top_textfield.getText().isEmpty()) {
            leftpart[5] = 0;

        } else {
            leftpart[5] = Integer.parseInt(centreleft_6_top_textfield.getText());
        }
        if (centreleft_7_top_textfield.getText().isEmpty()) {
            leftpart[6] = 0;

        } else {
            leftpart[6] = Integer.parseInt(centreleft_7_top_textfield.getText());
        }

        if (centreleft_8_top_textfield.getText().isEmpty()) {
            leftpart[7] = 0;

        } else {
            leftpart[7] = Integer.parseInt(centreleft_8_top_textfield.getText());
        }
        if (centreleft_9_top_textfield.getText().isEmpty()) {
            leftpart[8] = 0;

        } else {
            leftpart[8] = Integer.parseInt(centreleft_9_top_textfield.getText());
        }

        for (int i = 0; i < 9; i++) {
            sum1_9 = sum1_9 + leftpart[i];
        }
        rightpart[0] = sum1_9;
        if (centreright_2_top_textfield.getText().isEmpty()) {
            rightpart[1] = 0;

        } else {
            rightpart[1] = Integer.parseInt(centreright_2_top_textfield.getText());
        }
        rightpart[2] = rightpart[0] + rightpart[1];
        centreright_1_top_textfield.setText(Double.toString(rightpart[0]));
        centreright_2_top_textfield.setText(Double.toString(rightpart[1]));
        centreright_3_top_textfield.setText(Double.toString(rightpart[2]));
        validatiocheck gt = new validatiocheck();
        double sum = gt.korcount(rightpart[2]);

        rightpart[3] = sum;
        centreright_4_top_textfield.setText(Double.toString(rightpart[3]));
        double abc = gt.kormoukup(rightpart[2], taxsum);
        rightpart[4] = abc;
        centreright_5_top_textfield.setText(Double.toString(rightpart[4]));
        rightpart[5] = sum - abc;
        centreright_6_top_textfield.setText(Double.toString(rightpart[5]));

        rightpart[6] = taxpaymentsum;
        rightpart[7] = rightpart[5] - rightpart[6];
        centreright_8_top_textfield.setText(Double.toString(rightpart[7]));

        rightpart[8] = taxfreeincome;
        if (centreright_10_top_textfield.getText().isEmpty()) {
            rightpart[9] = 0;

        } else {
            rightpart[9] = Integer.parseInt(centreright_10_top_textfield.getText());
        }

        //conn.IncomeAssessee(NIN,Salarylf1,lf2,HousePropertylf3,lf4,lf5,lf6,lf7,lf8,lf9,rg1,rg2,rg3,rg4,TaxCreditrg5,rg6,TaxPayment,rg8,rg9,rg10);
        conn.IncomeAssessee(NIN, leftpart[0], leftpart[1], leftpart[2], leftpart[3], leftpart[4], leftpart[5], leftpart[6], leftpart[7], leftpart[8], rightpart[0], rightpart[1], rightpart[2], rightpart[3], rightpart[4], rightpart[5], taxpayment, rightpart[7], rightpart[8], rightpart[9],ayear);
        HomeForm hh = new HomeForm();
        hh.setVisible(true);
        dispose();
    } catch (Exception e) {
        System.out.println(e.toString());
    }

}

public void bottom() {

}

public void update(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException {
    taxcount = conn.TaxCount(text,ayear);
    accessnin(text,ayear);

    int paymentsum = 0;
    jsontaxpa = new JSONObject(taxcount[16]);
    jsontaxpay = (JSONObject) jsontaxpa.get("TaxPayment");
    taxpaymentamount[0] = Integer.parseInt(jsontaxpay.getString("TaxReducted"));
    taxpaymentamount[1] = Integer.parseInt(jsontaxpay.getString("AdvanceTax"));
    taxpaymentamount[2] = Integer.parseInt(jsontaxpay.getString("TaxPaidReturn"));
    taxpaymentamount[3] = Integer.parseInt(jsontaxpay.getString("TaxRefund"));
    for (int i = 0; i < 4; i++) {
        paymentsum = paymentsum + taxpaymentamount[i];
    }
    centreright_7_top_adddetail_update.setVisible(true);
    centreright_7_top_adddetail.setVisible(false);
    jj.setVisible(false);
    update.setVisible(true);
    // centreleft_1_top_textfield.setText(taxcount[1]);
    centreleft_2_top_textfield.setText(taxcount[2]);
    //S centreleft_3_top_textfield.setText(Integer.toString(houseincome-housepropertysum));
    centreleft_4_top_textfield.setText(taxcount[4]);
    centreleft_5_top_textfield.setText(taxcount[5]);
    centreleft_6_top_textfield.setText(taxcount[6]);
    centreleft_7_top_textfield.setText(taxcount[7]);
    centreleft_8_top_textfield.setText(taxcount[8]);
    centreleft_9_top_textfield.setText(taxcount[9]);
    centreright_1_top_textfield.setText(taxcount[10]);
    centreright_2_top_textfield.setText(taxcount[11]);
    centreright_3_top_textfield.setText(taxcount[12]);
    centreright_4_top_textfield.setText(taxcount[13]);
    centreright_5_top_textfield.setText(taxcount[14]);
    centreright_6_top_textfield.setText(taxcount[15]);
    // centreright_7_top_textfield.setText(taxcount[16]);
    centreright_8_top_textfield.setText(taxcount[17]);
    centreright_9_top_textfield.setText(taxcount[18]);
    centreright_10_top_textfield.setText(taxcount[19]);
    centreright_7_top_adddetail_update.addActionListener(e -> {

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

        centreright_7_top_textfield_next_taxdeducted1.setText(Integer.toString(taxpaymentamount[0]));

        centreright_7_top_label_next_advancetax2 = new JLabel("Advance tax u/s 64/68(Please Attach challan):");
        centreright_7_top_textfield_next_advancetax2 = new JTextField();
        centreright_7_top_textfield_next_advancetax2.setText(Integer.toString(taxpaymentamount[1]));

        centreright_7_top_label_next_taxpaid3 = new JLabel("Tax paid on the basis of this return(u/s 74)(Please please attach challan/pay order/bank draft/cheque):");
        centreright_7_top_textfield_next_taxpaid3 = new JTextField();
        centreright_7_top_textfield_next_taxpaid3.setText(Integer.toString(taxpaymentamount[2]));

        centreright_7_top_label_next_adjustrefund4 = new JLabel("Adjust of Tax Refund (if any):");
        centreright_7_top_textfield_next_adjustrefund4 = new JTextField();
        centreright_7_top_textfield_next_adjustrefund4.setText(Integer.toString(taxpaymentamount[3]));

        centreright_7_top_add_update = new JButton("Add");
        centreright_7_top_add_update.addActionListener(f -> adddetails_centre_add_update());
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
        centreright_7_top_middle.add(centreright_7_top_add_update);
        mainbody.revalidate();
    });
    update.addActionListener(e -> {

        try {

            leftpart[0] = sumsalary;
            if (centreleft_1_top_textfield.getText().isEmpty()) {
                leftpart[0] = 0;

            } else {
                leftpart[0] = Integer.parseInt(centreleft_1_top_textfield.getText());
            }

            if (centreleft_2_top_textfield.getText().isEmpty()) {
                leftpart[1] = 0;

            } else {
                leftpart[1] = Integer.parseInt(centreleft_2_top_textfield.getText());
            }

            leftpart[2] = Double.parseDouble(centreleft_3_top_textfield.getText());
//centreleft_3_top_textfield.setText(taxcount[3]);
            if (centreleft_4_top_textfield.getText().isEmpty()) {
                leftpart[3] = 0;

            } else {
                leftpart[3] = Integer.parseInt(centreleft_4_top_textfield.getText());
            }
            if (centreleft_5_top_textfield.getText().isEmpty()) {
                leftpart[4] = 0;

            } else {
                leftpart[4] = Integer.parseInt(centreleft_5_top_textfield.getText());
            }
            if (centreleft_6_top_textfield.getText().isEmpty()) {
                leftpart[5] = 0;

            } else {
                leftpart[5] = Integer.parseInt(centreleft_6_top_textfield.getText());
            }
            if (centreleft_7_top_textfield.getText().isEmpty()) {
                leftpart[6] = 0;

            } else {
                leftpart[6] = Integer.parseInt(centreleft_7_top_textfield.getText());
            }

            if (centreleft_8_top_textfield.getText().isEmpty()) {
                leftpart[7] = 0;

            } else {
                leftpart[7] = Integer.parseInt(centreleft_8_top_textfield.getText());
            }
            if (centreleft_9_top_textfield.getText().isEmpty()) {
                leftpart[8] = 0;

            } else {
                leftpart[8] = Integer.parseInt(centreleft_9_top_textfield.getText());
            }

            for (int i = 0; i < 9; i++) {
                sum1_9 = sum1_9 + leftpart[i];
            }
            rightpart[0] = sum1_9;
            if (centreright_2_top_textfield.getText().isEmpty()) {
                rightpart[1] = 0;

            } else {
                rightpart[1] = Integer.parseInt(centreright_2_top_textfield.getText());
            }
            rightpart[2] = rightpart[0] + rightpart[1];
            centreright_1_top_textfield.setText(Double.toString(rightpart[0]));
            centreright_2_top_textfield.setText(Double.toString(rightpart[1]));
            centreright_3_top_textfield.setText(Double.toString(rightpart[2]));
            validatiocheck gt = new validatiocheck();
            double sum = gt.korcount(rightpart[2]);

            rightpart[3] = sum;
            centreright_4_top_textfield.setText(Double.toString(rightpart[3]));
            double abc = gt.kormoukup(rightpart[2], taxsum);
            rightpart[4] = abc;
            centreright_5_top_textfield.setText(Double.toString(rightpart[4]));
            rightpart[5] = sum - abc;
            centreright_6_top_textfield.setText(Double.toString(rightpart[5]));

            rightpart[6] = taxpaymentsum;
            rightpart[7] = rightpart[5] - rightpart[6];
            centreright_8_top_textfield.setText(Double.toString(rightpart[7]));

            rightpart[8] = taxfreeincome;
            if (centreright_10_top_textfield.getText().isEmpty()) {
                rightpart[9] = 0;

            } else {
                rightpart[9] = Integer.parseInt(centreright_10_top_textfield.getText());
            }
            if (centreright_7_top_textfield.getText().isEmpty()) {
                taxpayment.add(taxpaymentamount[0]);
                taxpayment.add(taxpaymentamount[1]);
                taxpayment.add(taxpaymentamount[2]);
                taxpayment.add(taxpaymentamount[3]);
            }

            //conn.IncomeAssessee(NIN,Salarylf1,lf2,HousePropertylf3,lf4,lf5,lf6,lf7,lf8,lf9,rg1,rg2,rg3,rg4,TaxCreditrg5,rg6,TaxPayment,rg8,rg9,rg10);
            conn.IncomeAssesseeUpdate(text, (int) leftpart[0], (int) leftpart[1], (int) leftpart[2], (int) leftpart[3], (int) leftpart[4], (int) leftpart[5], (int) leftpart[6], (int) leftpart[7], (int) leftpart[8], (int) rightpart[0], (int) rightpart[1], (int) rightpart[2], (int) rightpart[3], (int) rightpart[4], (int) rightpart[5], taxpayment, (int) rightpart[7], (int) rightpart[8], (int) rightpart[9],ayear);
            HomeForm hh = new HomeForm();
            hh.setVisible(true);
            dispose();
        } catch (Exception f) {
            System.out.println(f.toString());
        }

    });
}

}
