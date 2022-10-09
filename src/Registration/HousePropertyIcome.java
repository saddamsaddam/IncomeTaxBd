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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.element.Name;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class HousePropertyIcome extends JFrame {
    int ayear;

public HousePropertyIcome() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test");
    mainbody();

}

public void accessnin(long a,int ayea) {
    ayear=ayea;
    NIN = a;
}

public static void main(String[] args) {
    HousePropertyIcome window = new HousePropertyIcome();
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

}

public void top() {
    JLabel jj = new JLabel("   HouseProperty     ");
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

    addleftcontent();

}

public void addleftcontent() {

    centreleft_1_top_label = new JLabel("                                                                                                                    ");
    centreleft_1_top.add(centreleft_1_top_label);

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

    //second indoor
    centrecentre_1_centre.setLayout(new BorderLayout());
    centrecentre_2_top = new JPanel();
    centrecentre_2_centre = new JPanel();
    centrecentre_2_bottom = new JPanel();

    centrecentre_2_top.add(Box.createVerticalStrut(20));
    centrecentre_1_centre.add(centrecentre_2_top, BorderLayout.NORTH);
    centrecentre_1_centre.add(centrecentre_2_centre, BorderLayout.CENTER);
    //centreleft_1_centre.add(centreleft_2_bottom,BorderLayout.SOUTH);
    //third indoor
    centrecentre_2_centre.setLayout(new BorderLayout());
    centrecentre_3_top = new JPanel();
    centrecentre_3_centre = new JPanel();
    centrecentre_3_bottom = new JPanel();

    centrecentre_3_top.add(Box.createVerticalStrut(20));
    centrecentre_2_centre.add(centrecentre_3_top, BorderLayout.NORTH);
    centrecentre_2_centre.add(centrecentre_3_centre, BorderLayout.CENTER);
    // centreleft_2_centre.add(centreleft_3_bottom,BorderLayout.SOUTH);

    //four indoor
    centrecentre_3_centre.setLayout(new BorderLayout());
    centrecentre_4_top = new JPanel();
    centrecentre_4_centre = new JPanel();
    centrecentre_4_bottom = new JPanel();

    centrecentre_4_top.add(Box.createVerticalStrut(20));
    centrecentre_3_centre.add(centrecentre_4_top, BorderLayout.NORTH);
    centrecentre_3_centre.add(centrecentre_4_centre, BorderLayout.CENTER);
    // centreleft_2_centre.add(centreleft_3_bottom,BorderLayout.SOUTH);

    addcentrecontent();

}

public void addcentrecontent() {
    centrecentre_1_top_box = new BoxLayout(centrecentre_1_top, BoxLayout.Y_AXIS);
    centrecentre_1_top.setLayout(centrecentre_1_top_box);
    centrecentre_1_top.add(Box.createVerticalStrut(20));
    centrecentre_1_top_label = new JLabel("Assesment Year:                                     ");
    centrecentre_1_top_textfield = new JTextField();
   //  centrecentre_1_top.add(centrecentre_1_top_label);
   // centrecentre_1_top.add(centrecentre_1_top_textfield);

    //2
    centrecentre_2_top_box = new BoxLayout(centrecentre_2_top, BoxLayout.Y_AXIS);
    centrecentre_2_top.setLayout(centrecentre_2_top_box);
    centrecentre_2_top_label = new JLabel("RENTAL INCOME:                                    ");
    centrecentre_2_top_textfield = new JTextField();
    centrecentre_2_top.add(centrecentre_2_top_label);
    centrecentre_2_top.add(centrecentre_2_top_textfield);

    //3
    centrecentre_3_top_box = new BoxLayout(centrecentre_3_top, BoxLayout.Y_AXIS);
    centrecentre_3_top.setLayout(centrecentre_3_top_box);
    centrecentre_3_top_label = new JLabel("Claimed Expenses:                                     ");
    centrecentre_3_top_textfield = new JTextField(null);
    centrecentre_3_top_adddetail = new JButton("Add Detail");
    centrecentre_3_top_adddetailUpdate = new JButton("Add Detail");
    centrecentre_3_top.add(centrecentre_3_top_label);
    centrecentre_3_top.add(centrecentre_3_top_textfield);
    centrecentre_3_top.add(centrecentre_3_top_adddetail);
    centrecentre_3_top.add(centrecentre_3_top_adddetailUpdate);
    centrecentre_3_top_adddetailUpdate.setVisible(false);
    centrecentre_3_top.add(Box.createVerticalStrut(20));
    centrecentre_3_top_textfield.setEnabled(false);
    centrecentre_3_top_adddetail.addActionListener(e -> adddetails_centre_3());
    //4

    centrecentre_4_top_label = new JLabel("House Type:");
    jbb1 = new JRadioButton("Residential", true);
    jbb2 = new JRadioButton("Business                                                                                                                            ");
    bg9 = new ButtonGroup();
    bg9.add(jbb1);
    bg9.add(jbb2);
    centrecentre_4_top.add(centrecentre_4_top_label);
    centrecentre_4_top.add(jbb1);
    centrecentre_4_top.add(jbb2);

}

public void adddetails_centre_3() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centrecentre_3_top_upper = new JPanel();
    centrecentre_3_top_box_upper = new BoxLayout(centrecentre_3_top_upper, BoxLayout.Y_AXIS);
    centrecentre_3_top_upper.setLayout(centrecentre_3_top_box_upper);

    centrecentre_3_top_middle = new JPanel();
    // centrecentre_3_top_middle.setBackground(Color.green);

    centrecentre_3_top.add(centrecentre_3_top_upper, BorderLayout.NORTH);
    centrecentre_3_top.add(centrecentre_3_top_middle, BorderLayout.CENTER);
    centrecentre_3_top_label_next_repair1 = new JLabel("Repair, Collection,etc(TK):                                     ");
    centrecentre_3_top_textfield_next_repair1 = new JTextField(null);

    centrecentre_3_top_label_next_localtax1 = new JLabel("Municipal Or Local Tax(TK)::                                     ");
    centrecentre_3_top_textfield_next_localtax1 = new JTextField(null);

    centrecentre_3_top_label_next_landrevenue1 = new JLabel("Land Revenue(TK):                                     ");
    centrecentre_3_top_textfield_next_landrevenue1 = new JTextField(null);

    centrecentre_3_top_label_next_capitalcharge1 = new JLabel("Interest On Loan/Mortgage/Capital Charge(TK):                                     ");
    centrecentre_3_top_textfield_next_capitalcharge1 = new JTextField(null);

    centrecentre_3_top_label_next_insurancepremium1 = new JLabel("Insurance Premium(TK):                                     ");
    centrecentre_3_top_textfield_next_insurancepremium1 = new JTextField(null);

    centrecentre_3_top_label_next_vacancyallowance1 = new JLabel("Vacancy Allowance(TK):                                     ");
    centrecentre_3_top_textfield_next_vacancyallowance1 = new JTextField(null);

    centrecentre_3_top_label_next_other1 = new JLabel("Other,if Any:                                     ");
    centrecentre_3_top_textfield_next_other1 = new JTextField(null);

    centrecentre_3_top_add = new JButton("Add");
    centrecentre_3_top_add.addActionListener(e -> adddetails_centre_add());

    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));
    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_repair1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_repair1);

    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_localtax1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_localtax1);

    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_landrevenue1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_landrevenue1);

    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_capitalcharge1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_capitalcharge1);
    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_insurancepremium1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_insurancepremium1);
    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_vacancyallowance1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_vacancyallowance1);
    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_upper.add(centrecentre_3_top_label_next_other1);
    centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_other1);
    centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

    centrecentre_3_top_middle.add(centrecentre_3_top_add);
    mainbody.revalidate();

}

public void adddetails_centre_add() {
    //NIN,RENTALINCOME,val1,val2,val3,val4,val5,val6,val7,valsum;
    if (centrecentre_3_top_textfield_next_repair1.getText().isEmpty()) {
        val1 = 0;
    } else {
        val1 = Integer.parseInt(centrecentre_3_top_textfield_next_repair1.getText());
    }
    if (centrecentre_3_top_textfield_next_localtax1.getText().isEmpty()) {
        val2 = 0;
    } else {
        val2 = Integer.parseInt(centrecentre_3_top_textfield_next_localtax1.getText());
    }
    if (centrecentre_3_top_textfield_next_landrevenue1.getText().isEmpty()) {
        val3 = 0;
    } else {
        val3 = Integer.parseInt(centrecentre_3_top_textfield_next_landrevenue1.getText());
    }
    if (centrecentre_3_top_textfield_next_capitalcharge1.getText().isEmpty()) {
        val4 = 0;
    } else {
        val4 = Integer.parseInt(centrecentre_3_top_textfield_next_capitalcharge1.getText());
    }
    if (centrecentre_3_top_textfield_next_insurancepremium1.getText().isEmpty()) {
        val5 = 0;
    } else {
        val5 = Integer.parseInt(centrecentre_3_top_textfield_next_insurancepremium1.getText());
    }
    if (centrecentre_3_top_textfield_next_vacancyallowance1.getText().isEmpty()) {
        val6 = 0;
    } else {
        val6 = Integer.parseInt(centrecentre_3_top_textfield_next_vacancyallowance1.getText());
    }
    if (centrecentre_3_top_textfield_next_other1.getText().isEmpty()) {
        val7 = 0;
    } else {
        val7 = Integer.parseInt(centrecentre_3_top_textfield_next_other1.getText());
    }

    valsum = val1 + val2 + val3 + val4 + val5 + val6 + val7;
    centrecentre_3_top_textfield.setText(Integer.toString(valsum));

    centrecentre_3_top_middle.setVisible(false);
    centrecentre_3_top_upper.setVisible(false);
    centrecentre_3_top_add.setVisible(false);
    // centrecentre_3_top_middle.setBackground(Color.gray);

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

    addrightcontent();

}

public void addrightcontent() {

    centreright_1_top_label = new JLabel("                                                                                                                      ");

    centreright_1_top.add(centreright_1_top_label);

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

        if (jbb1.isSelected()) {
            type = "Residential";
        } else {
            type = "Business";
        }
        conn.HouseProperty(NIN, RENTALINCOME, val1, val2, val3, val4, val5, val6, val7, type,ayear);
        TaxCredit hh = new TaxCredit();
        hh.accessnin(NIN,ayear);
        hh.setVisible(true);
        dispose();

        // conn.HouseProperty(Integer.parseInt(centrecentre_1_top_textfield.getText()),Integer.parseInt(centrecentre_2_top_textfield.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_repair1.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_localtax1.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_landrevenue1.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_capitalcharge1.getText()),Integer.parseInt(centrecentre_3_top_textfield_next_insurancepremium1.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_vacancyallowance1.getText()), Integer.parseInt(centrecentre_3_top_textfield_next_other1.getText()));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());

    }

}
// update

public void update(long text,int year) throws ClassNotFoundException, SQLException, JSONException {
    houseproperty = conn.HOUSEPROPERTYRETURN(text,ayear);
    centrecentre_2_top_textfield.setText(houseproperty[0]);

    json = new JSONObject(houseproperty[1]);
    claimproperty[0] = Integer.parseInt(json.getString("Repair"));
    claimproperty[1] = Integer.parseInt(json.getString("Local_Tax"));
    claimproperty[2] = Integer.parseInt(json.getString("Land_Revenue"));
    claimproperty[3] = Integer.parseInt(json.getString("Interest_Loan"));
    claimproperty[4] = Integer.parseInt(json.getString("Insurance_Premium"));
    claimproperty[5] = Integer.parseInt(json.getString("Vacancy_Allowance"));
    claimproperty[6] = Integer.parseInt(json.getString("Other"));
    if (json.getString("type").matches("Residential")) {
        jbb1.setSelected(true);
    } else {
        jbb2.setSelected(true);
    }
    centrecentre_3_top_adddetail.setVisible(false);
    centrecentre_3_top_adddetailUpdate.setVisible(true);

    jj.setVisible(false);
    update.setVisible(true);
    centrecentre_3_top_adddetailUpdate.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centrecentre_3_top_upper = new JPanel();
        centrecentre_3_top_box_upper = new BoxLayout(centrecentre_3_top_upper, BoxLayout.Y_AXIS);
        centrecentre_3_top_upper.setLayout(centrecentre_3_top_box_upper);

        centrecentre_3_top_middle = new JPanel();
        // centrecentre_3_top_middle.setBackground(Color.green);

        centrecentre_3_top.add(centrecentre_3_top_upper, BorderLayout.NORTH);
        centrecentre_3_top.add(centrecentre_3_top_middle, BorderLayout.CENTER);
        centrecentre_3_top_label_next_repair1 = new JLabel("Repair, Collection,etc(TK):                                     ");
        centrecentre_3_top_textfield_next_repair1 = new JTextField();
        try {
            centrecentre_3_top_textfield_next_repair1.setText(json.getString("Repair"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        //{"Repair":2345678,"Local_Tax":0,"Land_Revenue":0,"Interest_Loan":0,"Insurance_Premium":0,"Vacancy_Allowance":0,"Other":0,"type":Residential}
        centrecentre_3_top_label_next_localtax1 = new JLabel("Municipal Or Local Tax(TK)::                                     ");
        centrecentre_3_top_textfield_next_localtax1 = new JTextField();
        try {
            centrecentre_3_top_textfield_next_localtax1.setText(json.getString("Local_Tax"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_label_next_landrevenue1 = new JLabel("Land Revenue(TK):                                     ");
        centrecentre_3_top_textfield_next_landrevenue1 = new JTextField();
        try {
            centrecentre_3_top_textfield_next_landrevenue1.setText(json.getString("Land_Revenue"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_label_next_capitalcharge1 = new JLabel("Interest On Loan/Mortgage/Capital Charge(TK):                                     ");
        centrecentre_3_top_textfield_next_capitalcharge1 = new JTextField();
        try {
            centrecentre_3_top_textfield_next_capitalcharge1.setText(json.getString("Interest_Loan"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_label_next_insurancepremium1 = new JLabel("Insurance Premium(TK):                                     ");
        centrecentre_3_top_textfield_next_insurancepremium1 = new JTextField();
        try {
            centrecentre_3_top_textfield_next_insurancepremium1.setText(json.getString("Insurance_Premium"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_label_next_vacancyallowance1 = new JLabel("Vacancy Allowance(TK):                                     ");
        centrecentre_3_top_textfield_next_vacancyallowance1 = new JTextField(null);
        try {
            centrecentre_3_top_textfield_next_vacancyallowance1.setText(json.getString("Vacancy_Allowance"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_label_next_other1 = new JLabel("Other,if Any:                                     ");
        centrecentre_3_top_textfield_next_other1 = new JTextField(null);
        try {
            centrecentre_3_top_textfield_next_other1.setText(json.getString("Other"));

        } catch (JSONException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        centrecentre_3_top_add = new JButton("Add");
        centrecentre_3_top_add.addActionListener(f -> adddetails_centre_add());

        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));
        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_repair1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_repair1);

        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_localtax1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_localtax1);

        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_landrevenue1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_landrevenue1);

        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_capitalcharge1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_capitalcharge1);
        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_insurancepremium1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_insurancepremium1);
        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_vacancyallowance1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_vacancyallowance1);
        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_upper.add(centrecentre_3_top_label_next_other1);
        centrecentre_3_top_upper.add(centrecentre_3_top_textfield_next_other1);
        centrecentre_3_top_upper.add(Box.createVerticalStrut(20));

        centrecentre_3_top_middle.add(centrecentre_3_top_add);
        mainbody.revalidate();

    });
    update.addActionListener(e -> {

        RENTALINCOME = Integer.parseInt(centrecentre_2_top_textfield.getText());
        if (centrecentre_3_top_textfield.getText().isEmpty()) {
            val1 = claimproperty[0];
            val2 = claimproperty[1];
            val3 = claimproperty[2];
            val4 = claimproperty[3];
            val5 = claimproperty[4];
            val6 = claimproperty[5];
            val7 = claimproperty[6];
            // type=Integer.toString(claimproperty[7]);
        } else {
            val1 = Integer.parseInt(centrecentre_3_top_textfield_next_repair1.getText());
            val2 = Integer.parseInt(centrecentre_3_top_textfield_next_localtax1.getText());
            val3 = Integer.parseInt(centrecentre_3_top_textfield_next_landrevenue1.getText());
            val4 = Integer.parseInt(centrecentre_3_top_textfield_next_capitalcharge1.getText());
            val5 = Integer.parseInt(centrecentre_3_top_textfield_next_insurancepremium1.getText());
            val6 = Integer.parseInt(centrecentre_3_top_textfield_next_vacancyallowance1.getText());
            val7 = Integer.parseInt(centrecentre_3_top_textfield_next_other1.getText());
        }

        if (jbb1.isSelected()) {
            type = "Residential";
        } else {
            type = "Business";
        }

        try {
            conn.HousePropertyUpdate(text, RENTALINCOME, val1, val2, val3, val4, val5, val6, val7, type,ayear);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            HomeForm h;
            h = new HomeForm();
            h.setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HousePropertyIcome.class.getName()).log(Level.SEVERE, null, ex);
        }

    });

}
//variable declare part
databaseConnection conn = new databaseConnection();
int[] claimproperty = new int[7];
String[] houseproperty = new String[17];
JSONObject json;
long NIN;
int RENTALINCOME = 0, val1 = 0, val2 = 0, val3 = 0, val4 = 0, val5 = 0, val6 = 0, val7 = 0, valsum = 0;
String type = "Residential";
JRadioButton jb1, jb2, jb3, jbb1, jbb2, jbbb1, jbbb2, jbbb3, jbbb4;
ButtonGroup bg1, bg9, bg10;
JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre,
        centreleft_1_top_upper, centreleft_2_top_upper, centreleft_3_top_upper, centreleft_4_top_upper, centreleft_5_top_upper, centreleft_6_top_upper,
        centreleft_1_top_middle, centreleft_2_top_middle, centreleft_3_top_middle, centreleft_4_top_middle, centreleft_5_top_middle, centreleft_6_top_middle,
        centrecentre_1_top, centrecentre_1_bottom, centrecentre_1_centre, centrecentre_2_top, centrecentre_2_bottom, centrecentre_2_centre, centrecentre_3_top, centrecentre_3_bottom, centrecentre_3_centre, centrecentre_4_top, centrecentre_4_bottom, centrecentre_4_centre, centrecentre_5_top, centrecentre_5_bottom, centrecentre_5_centre, centrecentre_6_top, centrecentre_6_bottom, centrecentre_6_centre, centrecentre_7_top, centrecentre_7_bottom, centrecentre_7_centre,
        centrecentre_1_top_upper, centrecentre_2_top_upper, centrecentre_3_top_upper, centrecentre_4_top_upper, centrecentre_5_top_upper, centrecentre_6_top_upper, centrecentre_7_top_upper,
        centrecentre_1_top_middle, centrecentre_2_top_middle, centrecentre_3_top_middle, centrecentre_4_top_middle, centrecentre_5_top_middle, centrecentre_6_top_middle, centrecentre_7_top_middle,
        centreright_1_top, centreright_1_bottom, centreright_1_centre, centreright_2_top, centreright_2_bottom, centreright_2_centre, centreright_3_top, centreright_3_bottom, centreright_3_centre, centreright_4_top, centreright_4_bottom, centreright_4_centre, centreright_5_top, centreright_5_bottom, centreright_5_centre, centreright_6_top, centreright_6_bottom, centreright_6_centre,
        centreright_1_top_upper, centreright_2_top_upper, centreright_3_top_upper, centreright_4_top_upper, centreright_5_top_upper, centreright_6_top_upper,
        centreright_1_top_middle, centreright_2_top_middle, centreright_3_top_middle, centreright_4_top_middle, centreright_5_top_middle, centreright_6_top_middle;

JScrollPane js;
JButton btn1;
BoxLayout centreleft_1_top_box, centreleft_2_top_box, centreleft_3_top_box, centreleft_4_top_box, centreleft_5_top_box, centreleft_6_top_box,
        centreleft_1_top_box_upper, centreleft_2_top_box_upper, centreleft_3_top_box_upper, centreleft_4_top_box_upper, centreleft_5_top_box_upper, centreleft_6_top_box_upper,
        centrecentre_1_top_box, centrecentre_2_top_box, centrecentre_3_top_box, centrecentre_4_top_box, centrecentre_5_top_box, centrecentre_6_top_box, centrecentre_7_top_box,
        centrecentre_1_top_box_upper, centrecentre_2_top_box_upper, centrecentre_3_top_box_upper, centrecentre_4_top_box_upper, centrecentre_5_top_box_upper, centrecentre_6_top_box_upper, centrecentre_7_top_box_upper,
        centreright_1_top_box, centreright_2_top_box, centreright_3_top_box, centreright_4_top_box, centreright_5_top_box, centreright_6_top_box,
        centreright_1_top_box_upper, centreright_2_top_box_upper, centreright_3_top_box_upper, centreright_4_top_box_upper, centreright_5_top_box_upper, centreright_6_top_box_upper;

JLabel centreleft_1_top_label, centreleft_2_top_label, centreleft_3_top_label, centreleft_4_top_label, centreleft_5_top_label, centreleft_6_top_label,
        centreleft_1_top_label_next_1, centreleft_1_top_label_next_2,
        centreleft_2_top_label_next_1, centreleft_2_top_label_next_2,
        centreleft_3_top_label_next_1, centreleft_3_top_label_next_2,
        centreleft_4_top_label_next_1, centreleft_4_top_label_next_2,
        centreleft_5_top_label_next_1, centreleft_5_top_label_next_2,
        centreleft_6_top_label_next_1, centreleft_6_top_label_next_2;

JLabel centrecentre_1_top_label, centrecentre_2_top_label, centrecentre_3_top_label, centrecentre_4_top_label, centrecentre_5_top_label, centrecentre_6_top_label, centrecentre_7_top_label,
        centrecentre_1_top_label_next_1, centrecentre_1_top_label_next_2,
        centrecentre_2_top_label_next_1, centrecentre_2_top_label_next_2,
        centrecentre_3_top_label_next_repair1, centrecentre_3_top_label_next_localtax1, centrecentre_3_top_label_next_landrevenue1, centrecentre_3_top_label_next_capitalcharge1, centrecentre_3_top_label_next_insurancepremium1, centrecentre_3_top_label_next_vacancyallowance1, centrecentre_3_top_label_next_other1,
        centrecentre_4_top_label_next_1, centrecentre_4_top_label_next_2,
        centrecentre_5_top_label_next_1, centrecentre_5_top_label_next_2,
        centrecentre_6_top_label_next_1, centrecentre_6_top_label_next_2,
        centrecentre_7_top_label_next_1, centrecentre_7_top_label_next_2,
        centrecentre_5_top_label_next_heading;

JLabel centreright_1_top_label, centreright_2_top_label, centreright_3_top_label, centreright_4_top_label, centreright_5_top_label, centreright_6_top_label,
        centreright_1_top_label_next_1, centreright_1_top_label_next_2,
        centreright_2_top_label_next_1, centreright_2_top_label_next_2,
        centreright_3_top_label_next_1, centreright_3_top_label_next_2,
        centreright_4_top_label_next_1, centreright_4_top_label_next_2,
        centreright_5_top_label_next_1, centreright_5_top_label_next_2,
        centreright_6_top_label_next_1, centreright_6_top_label_next_2;

JTextField centrecentre_1_top_textfield, centrecentre_2_top_textfield, centrecentre_3_top_textfield, centrecentre_4_top_textfield, centrecentre_5_top_textfield, centrecentre_6_top_textfield, centrecentre_7_top_textfield,
        centrecentre_1_top_textfield_next_1, centrecentre_1_top_textfield_next_2,
        centrecentre_2_top_textfield_next_1, centrecentre_2_top_textfield_next_2,
        centrecentre_3_top_textfield_next_repair1, centrecentre_3_top_textfield_next_localtax1, centrecentre_3_top_textfield_next_landrevenue1, centrecentre_3_top_textfield_next_capitalcharge1, centrecentre_3_top_textfield_next_insurancepremium1, centrecentre_3_top_textfield_next_vacancyallowance1, centrecentre_3_top_textfield_next_other1,
        centrecentre_4_top_textfield_next_1, centrecentre_4_top_textfield_next_2,
        centrecentre_5_top_textfield_next_1, centrecentre_5_top_textfield_next_2,
        centrecentre_6_top_textfield_next_1, centrecentre_6_top_textfield_next_2,
        centrecentre_7_top_textfield_next_1, centrecentre_7_top_textfield_next_2,
        centrecentre_5_top_textfield_next_heading;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate,
        centrecentre_3_top_adddetailUpdate, jj, update;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end;
}
