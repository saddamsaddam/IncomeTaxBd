/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Registration;

import com.google.gson.Gson;
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
public class TaxCredit extends JFrame {
int ayear;
int[] amount = new int[5];
databaseConnection conn = new databaseConnection();
String[] taxdibate = new String[17];
ArrayList<String> othertopic = new ArrayList<String>();
ArrayList<String> otherstring = new ArrayList<String>();
ArrayList<Integer> otheramount = new ArrayList<Integer>();
ArrayList<String> list = new ArrayList<String>();
String json;
JLabel[] otherdetaillabel = new JLabel[5];
JLabel[] otheramountlabel = new JLabel[5];
String[] otherinputlabel = {"Detail-1", "Detail-2", "Detail-3", "Detail-4", "Detail-5"};
String[] othertamountlabel = {"Amount-1", "Amount-2", "Amount-3", "Amount-4", "Amount-5",};
JTextField[] othertextinput = new JTextField[5];
JTextField[] otheramountinput = new JTextField[5];
long NIN;
int[] leftpart = new int[6];
int[] rightpart = new int[5];
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
        centrecentre_3_top_label_next_1, centrecentre_3_top_label_next_2,
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

JTextField centreleft_1_top_textfield, centreleft_2_top_textfield, centreleft_3_top_textfield, centreleft_4_top_textfield, centreleft_5_top_textfield, centreleft_6_top_textfield,
        centreleft_1_top_textfield_next_1, centreleft_1_top_textfield_next_2,
        centreleft_2_top_textfield_next_1, centreleft_2_top_textfield_next_2,
        centreleft_3_top_textfield_next_1, centreleft_3_top_textfield_next_2,
        centreleft_4_top_textfield_next_1, centreleft_4_top_textfield_next_2,
        centreleft_5_top_textfield_next_1, centreleft_5_top_textfield_next_2,
        centreleft_6_top_textfield_next_1, centreleft_6_top_textfield_next_2,
        centrecentre_1_top_textfield, centrecentre_2_top_textfield, centrecentre_3_top_textfield, centrecentre_4_top_textfield, centrecentre_5_top_textfield, centrecentre_6_top_textfield, centrecentre_7_top_textfield,
        centrecentre_1_top_textfield_next_1, centrecentre_1_top_textfield_next_2,
        centrecentre_2_top_textfield_next_1, centrecentre_2_top_textfield_next_2,
        centrecentre_3_top_textfield_next_1, centrecentre_3_top_textfield_next_2,
        centrecentre_4_top_textfield_next_1, centrecentre_4_top_textfield_next_2,
        centrecentre_5_top_textfield_next_1, centrecentre_5_top_textfield_next_2,
        centrecentre_6_top_textfield_next_1, centrecentre_6_top_textfield_next_2,
        centrecentre_7_top_textfield_next_1, centrecentre_7_top_textfield_next_2,
        centrecentre_5_top_textfield_next_heading,
        centreright_1_top_textfield, centreright_2_top_textfield, centreright_3_top_textfield, centreright_4_top_textfield, centreright_5_top_textfield, centreright_6_top_textfield,
        centreright_1_top_textfield_next_1, centreright_1_top_textfield_next_2,
        centreright_2_top_textfield_next_1, centreright_2_top_textfield_next_2,
        centreright_3_top_textfield_next_1, centreright_3_top_textfield_next_2,
        centreright_4_top_textfield_next_1, centreright_4_top_textfield_next_2,
        centreright_5_top_textfield_next_1, centreright_5_top_textfield_next_2,
        centreright_6_top_textfield_next_1, centreright_6_top_textfield_next_2;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end,
        centreright_6_top_update,
        submit, update;

public TaxCredit() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test");
    mainbody();

}

public void accessnin(long a,int ayea) {
    NIN = a;
    ayear=ayea;
}

public static void main(String[] args) {
    TaxCredit window = new TaxCredit();
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
    JLabel jj = new JLabel("  Investment (biniog)     ");
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
    // centreleft_5_centre.add(centreleft_6_centre,BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addleftcontent();

}

public void addleftcontent() {
    centreleft_1_top_box = new BoxLayout(centreleft_1_top, BoxLayout.Y_AXIS);
    centreleft_1_top.setLayout(centreleft_1_top_box);
    centreleft_1_top_label = new JLabel(" Life insurance premium:                                                                                                                   ");
    centreleft_1_top_textfield = new JTextField();
    centreleft_1_top.add(centreleft_1_top_label);
    centreleft_1_top.add(centreleft_1_top_textfield);

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Contribution to deffered annuity:                                    ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);
    centreleft_2_top.add(Box.createVerticalStrut(30));

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("Contribution to Provident Fund to whitch provident fund act, 1925 applies:                                    ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);

    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("Self contribution & employer's contribution to Recognized provident fund:                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);

    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("Contribution to Super annuation fund:                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);

    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("Investment in approved debenture or debenture stock,Stock or Shares:                                    ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);
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

    centrecentre_1_top_label = new JLabel("                                                      ");

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
    centreleft_5_centre.add(centreleft_6_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addrightcontent();

}

public void addrightcontent() {
    centreright_1_top_box = new BoxLayout(centreright_1_top, BoxLayout.Y_AXIS);
    centreright_1_top.setLayout(centreright_1_top_box);
    centreright_1_top_label = new JLabel("Contribution to deposit pension schema:                                                                                          ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Contribution to Benevolent fund and group insurance premium:                                    ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);
    centreright_2_top.add(Box.createVerticalStrut(30));

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Contribution to Zakat Fund:                                    ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);

    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Saving Certificate/Unit Certificate/Bond:                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);

    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Prize bond/Saving Schema/Computer:                                    ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);

    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel("Others, if any(give details)                                    ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top_textfield.setEnabled(false);
    centreright_6_top_adddetail = new JButton("Add Detail");
    centreright_6_top_update = new JButton("Update");
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);
    centreright_6_top.add(centreright_6_top_update);
    centreright_6_top_update.setVisible(false);
    centreright_6_top.add(centreright_6_top_adddetail);
    centreright_6_top_adddetail.addActionListener(e -> adddetails_right_6());

}

public void adddetails_right_6() {

    centreright_6_top_upper = new JPanel();
    centreright_6_top_box_upper = new BoxLayout(centreright_6_top_upper, BoxLayout.Y_AXIS);
    centreright_6_top_upper.setLayout(centreright_6_top_box_upper);

    centreright_6_top_middle = new JPanel();
    centreright_6_top_middle.setBackground(Color.green);

    centreright_6_top.add(centreright_6_top_upper, BorderLayout.NORTH);
    centreright_6_top.add(centreright_6_top_middle, BorderLayout.CENTER);

    centreright_6_top_label_next_1 = new JLabel("Details                                     ");
    centreright_6_top_textfield_next_1 = new JTextField();
    centreright_6_top_label_next_2 = new JLabel("Amount                                   ");
    centreright_6_top_textfield_next_2 = new JTextField();

    centreright_6_top_add = new JButton("Add");
    centreright_6_top_add.addActionListener(e -> right_add(Integer.parseInt(centreright_6_top_textfield_next_2.getText()), centreright_6_top_textfield_next_1.getText()));
    centreright_6_top_end = new JButton("End");
    centreright_6_top_end.addActionListener(e -> {
        try {
            right_end();
        } catch (JSONException ex) {
            Logger.getLogger(TaxCredit.class.getName()).log(Level.SEVERE, null, ex);
        }
    });

    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_label_next_1);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_textfield_next_1);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_label_next_2);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_textfield_next_2);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_middle.add(centreright_6_top_add);
    centreright_6_top_middle.add(centreright_6_top_end);

    mainbody.revalidate();

}

public void right_add(int amnt, String exmpt) {
    othertopic.add(exmpt);
    otheramount.add(amnt);
    centreright_6_top_textfield_next_1.setText(null);
    centreright_6_top_textfield_next_2.setText(null);
}

public void right_end() throws JSONException {

    String otherjson = "";
    int sum = 0;
    for (int i = 0; i < othertopic.size(); i++) {

        sum = sum + otheramount.get(i);

    }

    centreright_6_top_textfield.setEnabled(true);
    centreright_6_top_textfield.setText(Integer.toString(sum));

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

    submit = new JButton("                          Submit                          ");
    update = new JButton("                          Update                          ");
    bottom_top.add(submit);
    bottom_top.add(update);
    update.setVisible(false);
    submit.addActionListener(e -> submit());

}

public void otheraddcalculate(int ll) {
    for (int i = 0; i < 5 - ll; i++) {
        othertopic.add("null");
        otheramount.add(0);
    }
}

public void submit() {
    try {

        if (!centreleft_1_top_textfield.getText().isEmpty()) {
            leftpart[0] = Integer.parseInt(centreleft_1_top_textfield.getText());
        }
        if (!centreleft_2_top_textfield.getText().isEmpty()) {
            leftpart[1] = Integer.parseInt(centreleft_2_top_textfield.getText());
        }
        if (!centreleft_3_top_textfield.getText().isEmpty()) {
            leftpart[2] = Integer.parseInt(centreleft_3_top_textfield.getText());
        }
        if (!centreleft_4_top_textfield.getText().isEmpty()) {
            leftpart[3] = Integer.parseInt(centreleft_4_top_textfield.getText());
        }
        if (!centreleft_5_top_textfield.getText().isEmpty()) {
            leftpart[4] = Integer.parseInt(centreleft_5_top_textfield.getText());
        }
        if (!centreleft_6_top_textfield.getText().isEmpty()) {
            leftpart[5] = Integer.parseInt(centreleft_6_top_textfield.getText());
        }
        if (!centreright_1_top_textfield.getText().isEmpty()) {
            rightpart[0] = Integer.parseInt(centreright_1_top_textfield.getText());
        }
        if (!centreright_2_top_textfield.getText().isEmpty()) {
            rightpart[1] = Integer.parseInt(centreright_2_top_textfield.getText());
        }
        if (!centreright_3_top_textfield.getText().isEmpty()) {
            rightpart[2] = Integer.parseInt(centreright_3_top_textfield.getText());
        }
        if (!centreright_4_top_textfield.getText().isEmpty()) {
            rightpart[3] = Integer.parseInt(centreright_4_top_textfield.getText());
        }
        if (!centreright_5_top_textfield.getText().isEmpty()) {
            rightpart[4] = Integer.parseInt(centreright_5_top_textfield.getText());
        }
        if (centreright_6_top_textfield.getText().isEmpty()) {
            for (int i = 0; i < 5; i++) {
                othertopic.add("null");
                otheramount.add(0);
            }

        } else {
            otheraddcalculate(othertopic.size());
        }

        conn.TaxCredit(NIN, leftpart[0], leftpart[1], leftpart[2], leftpart[3], leftpart[4], leftpart[5], rightpart[0], rightpart[1], rightpart[2], rightpart[3], rightpart[4], othertopic, otheramount,ayear);
        Salary hh = new Salary();
        hh.accessnin(NIN,ayear);
        hh.setVisible(true);
        dispose();
    } catch (Exception e) {
        System.out.println(e.toString());
    }

}

public void bottom() {

}

public void update(long TEXT,int ayear) {
    try {
        taxdibate = conn.TAXDIBATE(TEXT,ayear);
        centreleft_1_top_textfield.setText(taxdibate[1]);
        centreleft_2_top_textfield.setText(taxdibate[2]);
        centreleft_3_top_textfield.setText(taxdibate[3]);
        centreleft_4_top_textfield.setText(taxdibate[4]);
        centreleft_5_top_textfield.setText(taxdibate[5]);
        centreleft_6_top_textfield.setText(taxdibate[6]);

        centreright_1_top_textfield.setText(taxdibate[7]);
        centreright_2_top_textfield.setText(taxdibate[8]);
        centreright_3_top_textfield.setText(taxdibate[9]);
        centreright_4_top_textfield.setText(taxdibate[10]);
        centreright_5_top_textfield.setText(taxdibate[11]);
        centreright_6_top_adddetail.setVisible(false);
        centreright_6_top_update.setVisible(true);

        centreright_6_top_update.addActionListener(e -> {
            try {
                centreright_6_top_upper = new JPanel();
                centreright_6_top_box_upper = new BoxLayout(centreright_6_top_upper, BoxLayout.Y_AXIS);
                centreright_6_top_upper.setLayout(centreright_6_top_box_upper);

                centreright_6_top_middle = new JPanel();
                centreright_6_top_middle.setBackground(Color.green);

                centreright_6_top.add(centreright_6_top_upper, BorderLayout.NORTH);
                centreright_6_top.add(centreright_6_top_middle, BorderLayout.CENTER);

                for (int i = 0; i < 5; i++) {
                    otherdetaillabel[i] = new JLabel(otherinputlabel[i]);
                    othertextinput[i] = new JTextField();

                    otheramountlabel[i] = new JLabel(othertamountlabel[i]);
                    otheramountinput[i] = new JTextField();

                    centreright_6_top_upper.add(Box.createVerticalStrut(20));
                    centreright_6_top_upper.add(otherdetaillabel[i]);
                    centreright_6_top_upper.add(Box.createVerticalStrut(20));
                    centreright_6_top_upper.add(othertextinput[i]);
                    centreright_6_top_upper.add(Box.createVerticalStrut(20));
                    centreright_6_top_upper.add(otheramountlabel[i]);
                    centreright_6_top_upper.add(Box.createVerticalStrut(20));
                    centreright_6_top_upper.add(otheramountinput[i]);
                    centreright_6_top_upper.add(Box.createVerticalStrut(20));
                }
                centreright_6_top_add = new JButton("Add");
                centreright_6_top_add.addActionListener(f -> {
                    int sum = 0;
                    for (int i = 0; i < 5; i++) {
                        sum = sum + Integer.parseInt(otheramountinput[i].getText());

                    }
                    centreright_6_top_textfield.setText(Integer.toString(sum));
                    centreright_6_top_upper.setVisible(false);
                    centreright_6_top_add.setVisible(false);
                    centreright_6_top_middle.setVisible(false);

                });

                centreright_6_top_middle.add(centreright_6_top_add);

                JSONObject jsonObject = new JSONObject(taxdibate[12]);
                // JSONObject temp=null;
                JSONArray jsonArray = jsonObject.getJSONArray("other");
                for (int i = 0; i < 5; i++) {
                    JSONObject temp = null;
                    temp = (JSONObject) jsonArray.get(i);
                    othertextinput[i].setText(temp.getString("name"));
                    otheramountinput[i].setText(temp.getString("amount"));
                    amount[i] = temp.getInt("amount");

                }

                mainbody.revalidate();
            } catch (JSONException ex) {
                Logger.getLogger(TaxCredit.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        submit.setVisible(false);
        update.setVisible(true);
        update.addActionListener(g -> {

            try {

                if (!centreleft_1_top_textfield.getText().isEmpty()) {
                    leftpart[0] = Integer.parseInt(centreleft_1_top_textfield.getText());
                }
                if (!centreleft_2_top_textfield.getText().isEmpty()) {
                    leftpart[1] = Integer.parseInt(centreleft_2_top_textfield.getText());
                }
                if (!centreleft_3_top_textfield.getText().isEmpty()) {
                    leftpart[2] = Integer.parseInt(centreleft_3_top_textfield.getText());
                }
                if (!centreleft_4_top_textfield.getText().isEmpty()) {
                    leftpart[3] = Integer.parseInt(centreleft_4_top_textfield.getText());
                }
                if (!centreleft_5_top_textfield.getText().isEmpty()) {
                    leftpart[4] = Integer.parseInt(centreleft_5_top_textfield.getText());
                }
                if (!centreleft_6_top_textfield.getText().isEmpty()) {
                    leftpart[5] = Integer.parseInt(centreleft_6_top_textfield.getText());
                }
                if (!centreright_1_top_textfield.getText().isEmpty()) {
                    rightpart[0] = Integer.parseInt(centreright_1_top_textfield.getText());
                }
                if (!centreright_2_top_textfield.getText().isEmpty()) {
                    rightpart[1] = Integer.parseInt(centreright_2_top_textfield.getText());
                }
                if (!centreright_3_top_textfield.getText().isEmpty()) {
                    rightpart[2] = Integer.parseInt(centreright_3_top_textfield.getText());
                }
                if (!centreright_4_top_textfield.getText().isEmpty()) {
                    rightpart[3] = Integer.parseInt(centreright_4_top_textfield.getText());
                }
                if (!centreright_5_top_textfield.getText().isEmpty()) {
                    rightpart[4] = Integer.parseInt(centreright_5_top_textfield.getText());
                }

                if (centreright_6_top_textfield.getText().isEmpty()) {
                    try {
                        JSONObject jsonObject = new JSONObject(taxdibate[12]);
                        // JSONObject temp=null;
                        JSONArray jsonArray = jsonObject.getJSONArray("other");
                        for (int i = 0; i < 5; i++) {
                            JSONObject temp = null;
                            temp = (JSONObject) jsonArray.get(i);
                            othertopic.add(temp.getString("name"));
                            otheramount.add(temp.getInt("amount"));

                        }
                    } catch (JSONException ex) {
                        Logger.getLogger(TaxCredit.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    for (int i = 0; i < 5; i++) {
                        othertopic.add(othertextinput[i].getText());
                        otheramount.add(Integer.parseInt(otheramountinput[i].getText()));
                    }

                }

                conn.TaxCreditUpdate(TEXT, leftpart[0], leftpart[1], leftpart[2], leftpart[3], leftpart[4], leftpart[5], rightpart[0], rightpart[1], rightpart[2], rightpart[3], rightpart[4], othertopic, otheramount,ayear);
                HomeForm hh = new HomeForm();
                hh.setVisible(true);
                dispose();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        });

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TaxCredit.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(TaxCredit.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
