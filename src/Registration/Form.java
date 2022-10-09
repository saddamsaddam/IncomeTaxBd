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
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class Form extends JFrame {
int ayear;
long ggg;
String[] comm = new String[13];
int[] amm = new int[13];
long NIN;
JButton[] addcomment = new JButton[13];
String[] familyexpense = new String[17];
databaseConnection conn = new databaseConnection();
JSONObject json;
String values1, values2, values3, values4, values5, values6, values7, values8, values9, values10, values11, values12, values13;
int valuei1, valuei2, valuei3, valuei4, valuei5, valuei6, valuei7, valuei8, valuei9, valuei10, valuei11, valuei12, valuei13;
int value1 = 0, value2 = 0, value3 = 0, value4 = 0, value5 = 0, value6 = 0, value7 = 0, value8 = 0, value9 = 0, value10 = 0, value11 = 0, value12 = 0, value13 = 0;

JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre,
        centreleft_1_top_upper, centreleft_2_top_upper, centreleft_3_top_upper, centreleft_4_top_upper, centreleft_5_top_upper, centreleft_6_top_upper,
        centreleft_1_top_middle, centreleft_2_top_middle, centreleft_3_top_middle, centreleft_4_top_middle, centreleft_5_top_middle, centreleft_6_top_middle,
        centrecentre_1_top, centrecentre_1_bottom, centrecentre_1_centre, centrecentre_2_top, centrecentre_2_bottom, centrecentre_2_centre, centrecentre_3_top, centrecentre_3_bottom, centrecentre_3_centre, centrecentre_4_top, centrecentre_4_bottom, centrecentre_4_centre, centrecentre_5_top, centrecentre_5_bottom, centrecentre_5_centre, centrecentre_6_top, centrecentre_6_bottom, centrecentre_6_centre, centrecentre_7_top, centrecentre_7_bottom, centrecentre_7_centre,
        centrecentre_1_top_upper, centrecentre_2_top_upper, centrecentre_3_top_upper, centrecentre_4_top_upper, centrecentre_5_top_upper, centrecentre_6_top_upper, centrecentre_7_top_upper,
        centrecentre_1_top_middle, centrecentre_2_top_middle, centrecentre_3_top_middle, centrecentre_4_top_middle, centrecentre_5_top_middle, centrecentre_6_top_middle, centrecentre_7_top_middle,
        centreright_1_top, centreright_1_bottom, centreright_1_centre, centreright_2_top, centreright_2_bottom, centreright_2_centre, centreright_3_top, centreright_3_bottom, centreright_3_centre, centreright_4_top, centreright_4_bottom, centreright_4_centre, centreright_5_top, centreright_5_bottom, centreright_5_centre, centreright_6_top, centreright_6_bottom, centreright_6_centre, centreright_7_top, centreright_7_bottom, centreright_7_centre,
        centreright_1_top_upper, centreright_2_top_upper, centreright_3_top_upper, centreright_4_top_upper, centreright_5_top_upper, centreright_6_top_upper, centreright_7_top_upper,
        centreright_1_top_middle, centreright_2_top_middle, centreright_3_top_middle, centreright_4_top_middle, centreright_5_top_middle, centreright_6_top_middle, centreright_7_top_middle;

JScrollPane js;
JButton btn1;
BoxLayout centreleft_1_top_box, centreleft_2_top_box, centreleft_3_top_box, centreleft_4_top_box, centreleft_5_top_box, centreleft_6_top_box,
        centreleft_1_top_box_upper, centreleft_2_top_box_upper, centreleft_3_top_box_upper, centreleft_4_top_box_upper, centreleft_5_top_box_upper, centreleft_6_top_box_upper,
        centrecentre_1_top_box, centrecentre_2_top_box, centrecentre_3_top_box, centrecentre_4_top_box, centrecentre_5_top_box, centrecentre_6_top_box, centrecentre_7_top_box,
        centrecentre_1_top_box_upper, centrecentre_2_top_box_upper, centrecentre_3_top_box_upper, centrecentre_4_top_box_upper, centrecentre_5_top_box_upper, centrecentre_6_top_box_upper, centrecentre_7_top_box_upper,
        centreright_1_top_box, centreright_2_top_box, centreright_3_top_box, centreright_4_top_box, centreright_5_top_box, centreright_6_top_box, centreright_7_top_box,
        centreright_1_top_box_upper, centreright_2_top_box_upper, centreright_3_top_box_upper, centreright_4_top_box_upper, centreright_5_top_box_upper, centreright_6_top_box_upper, centreright_7_top_box_upper;

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

JLabel centreright_1_top_label, centreright_2_top_label, centreright_3_top_label, centreright_4_top_label, centreright_5_top_label, centreright_6_top_label, centreright_7_top_label,
        centreright_1_top_label_next_1, centreright_1_top_label_next_2,
        centreright_2_top_label_next_1, centreright_2_top_label_next_2,
        centreright_3_top_label_next_1, centreright_3_top_label_next_2,
        centreright_4_top_label_next_1, centreright_4_top_label_next_2,
        centreright_5_top_label_next_1, centreright_5_top_label_next_2,
        centreright_6_top_label_next_1, centreright_6_top_label_next_2,
        centreright_7_top_label_next_1, centreright_7_top_label_next_2;

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
        centreright_1_top_textfield, centreright_2_top_textfield, centreright_3_top_textfield, centreright_4_top_textfield, centreright_5_top_textfield, centreright_6_top_textfield, centreright_7_top_textfield,
        centreright_1_top_textfield_next_1, centreright_1_top_textfield_next_2,
        centreright_2_top_textfield_next_1, centreright_2_top_textfield_next_2,
        centreright_3_top_textfield_next_1, centreright_3_top_textfield_next_2,
        centreright_4_top_textfield_next_1, centreright_4_top_textfield_next_2,
        centreright_5_top_textfield_next_1, centreright_5_top_textfield_next_2,
        centreright_6_top_textfield_next_1, centreright_6_top_textfield_next_2,
        centreright_7_top_textfield_next_1, centreright_7_top_textfield_next_2;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate, jj, update;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end;

public Form() {
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
    Form window = new Form();
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
    JLabel jj = new JLabel("   Form     ");
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
    centreleft_1_top_label = new JLabel("Personal and fooding expenses:                                                                                                                   ");
    centreleft_1_top_textfield = new JTextField();
    centreleft_1_top_adddetail = new JButton("Add Comment");
    addcomment[0] = new JButton("Add Comment");
    centreleft_1_top_adddetail.addActionListener(e -> {
        value1 = 1;
    });
    centreleft_1_top.add(centreleft_1_top_label);
    centreleft_1_top.add(centreleft_1_top_textfield);
    centreleft_1_top.add(centreleft_1_top_adddetail);
    centreleft_1_top.add(addcomment[0]);
    addcomment[0].setVisible(false);

    centreleft_1_top_adddetail.addActionListener(e -> adddetails_left_1());

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Tax paid including deduction at source of the last financial year:                                     ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top_adddetail = new JButton("Add Comment");
    addcomment[1] = new JButton("Add Comment");
    centreleft_2_top_adddetail.addActionListener(e -> {
        value2 = 1;
    });
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);
    centreleft_2_top.add(centreleft_2_top_adddetail);
    centreleft_2_top.add(addcomment[1]);
    addcomment[1].setVisible(false);

    centreleft_2_top_adddetail.addActionListener(e -> adddetails_left_2());

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("Accommodation expense:                                     ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top_adddetail = new JButton("Add Comment");
    addcomment[2] = new JButton("Add Comment");
    centreleft_3_top_adddetail.addActionListener(e -> {
        value3 = 1;
    });
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);
    centreleft_3_top.add(centreleft_3_top_adddetail);
    centreleft_3_top.add(addcomment[2]);
    addcomment[2].setVisible(false);

    centreleft_3_top_adddetail.addActionListener(e -> adddetails_left_3());
    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("Transport expense:                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top_adddetail = new JButton("Add Comment");
    addcomment[3] = new JButton("Add Comment");
    centreleft_4_top_adddetail.addActionListener(e -> {
        value4 = 1;
    });
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);
    centreleft_4_top.add(centreleft_4_top_adddetail);
    centreleft_4_top.add(addcomment[3]);
    addcomment[3].setVisible(false);

    centreleft_4_top_adddetail.addActionListener(e -> adddetails_left_4());
    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("Electric bill for residence:                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top_adddetail = new JButton("Add Comment");
    addcomment[4] = new JButton("Add Comment");
    centreleft_5_top_adddetail.addActionListener(e -> {
        value5 = 1;
    });
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);
    centreleft_5_top.add(centreleft_5_top_adddetail);
    centreleft_5_top.add(addcomment[4]);
    addcomment[4].setVisible(false);

    centreleft_5_top_adddetail.addActionListener(e -> adddetails_left_5());
    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("Wasa bill for residence:                                    ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top_adddetail = new JButton("Add Comment");
    addcomment[5] = new JButton("Add Comment");
    centreleft_6_top_adddetail.addActionListener(e -> {
        value6 = 1;
    });
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);
    centreleft_6_top.add(centreleft_6_top_adddetail);
    centreleft_6_top.add(addcomment[5]);
    addcomment[5].setVisible(false);
    centreleft_6_top_adddetail.addActionListener(e -> adddetails_left_6());
}

public void adddetails_left_1() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreleft_1_top_upper = new JPanel();
    centreleft_1_top_box_upper = new BoxLayout(centreleft_1_top_upper, BoxLayout.Y_AXIS);
    centreleft_1_top_upper.setLayout(centreleft_1_top_box_upper);

    centreleft_1_top_middle = new JPanel();
    centreleft_1_top_middle.setBackground(Color.green);

    centreleft_1_top.add(centreleft_1_top_upper, BorderLayout.NORTH);
    centreleft_1_top.add(centreleft_1_top_middle, BorderLayout.CENTER);
    centreleft_1_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_1_top_textfield_next_1 = new JTextField();

    centreleft_1_top_add = new JButton("Add");
    centreleft_1_top_add.addActionListener(e -> {
        centreleft_1_top_upper.setVisible(false);
        centreleft_1_top_middle.setVisible(false);
    });
    centreleft_1_top_upper.add(Box.createVerticalStrut(20));
    centreleft_1_top_upper.add(centreleft_1_top_label_next_1);
    centreleft_1_top_upper.add(centreleft_1_top_textfield_next_1);
    centreleft_1_top_upper.add(Box.createVerticalStrut(20));

    centreleft_1_top_middle.add(centreleft_1_top_add);
    mainbody.revalidate();
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
    centreleft_2_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_2_top_textfield_next_1 = new JTextField();

    centreleft_2_top_add = new JButton("Add");
    centreleft_2_top_add.addActionListener(e -> {
        centreleft_2_top_upper.setVisible(false);
        centreleft_2_top_middle.setVisible(false);
    });
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));
    centreleft_2_top_upper.add(centreleft_2_top_label_next_1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_1);
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));

    centreleft_2_top_middle.add(centreleft_2_top_add);
    mainbody.revalidate();

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
    centreleft_3_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_3_top_textfield_next_1 = new JTextField();

    centreleft_3_top_add = new JButton("Add");
    centreleft_3_top_add.addActionListener(e -> {
        centreleft_3_top_upper.setVisible(false);
        centreleft_3_top_middle.setVisible(false);
    });
    centreleft_3_top_upper.add(Box.createVerticalStrut(20));
    centreleft_3_top_upper.add(centreleft_3_top_label_next_1);
    centreleft_3_top_upper.add(centreleft_3_top_textfield_next_1);
    centreleft_3_top_upper.add(Box.createVerticalStrut(20));

    centreleft_3_top_middle.add(centreleft_3_top_add);
    mainbody.revalidate();

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
    centreleft_4_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_4_top_textfield_next_1 = new JTextField();

    centreleft_4_top_add = new JButton("Add");
    centreleft_4_top_add.addActionListener(e -> {
        centreleft_4_top_upper.setVisible(false);
        centreleft_4_top_middle.setVisible(false);
    });
    centreleft_4_top_upper.add(Box.createVerticalStrut(20));
    centreleft_4_top_upper.add(centreleft_4_top_label_next_1);
    centreleft_4_top_upper.add(centreleft_4_top_textfield_next_1);
    centreleft_4_top_upper.add(Box.createVerticalStrut(20));

    centreleft_4_top_middle.add(centreleft_4_top_add);
    mainbody.revalidate();

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
    centreleft_5_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_5_top_textfield_next_1 = new JTextField();

    centreleft_5_top_add = new JButton("Add");
    centreleft_5_top_add.addActionListener(e -> {
        centreleft_5_top_upper.setVisible(false);
        centreleft_5_top_middle.setVisible(false);
    });
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));
    centreleft_5_top_upper.add(centreleft_5_top_label_next_1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_1);
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
    centreleft_6_top_label_next_1 = new JLabel("Comment                                     ");
    centreleft_6_top_textfield_next_1 = new JTextField();

    centreleft_6_top_add = new JButton("Add");
    centreleft_6_top_add.addActionListener(e -> {
        centreleft_6_top_upper.setVisible(false);
        centreleft_6_top_middle.setVisible(false);
    });
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));
    centreleft_6_top_upper.add(centreleft_6_top_label_next_1);
    centreleft_6_top_upper.add(centreleft_6_top_textfield_next_1);
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));

    centreleft_6_top_middle.add(centreleft_6_top_add);
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
    //fourth indoor
    centrecentre_3_centre.setLayout(new BorderLayout());
    centrecentre_4_top = new JPanel();
    centrecentre_4_centre = new JPanel();
    centrecentre_4_bottom = new JPanel();

    centrecentre_4_top.add(Box.createVerticalStrut(20));
    centrecentre_3_centre.add(centrecentre_4_top, BorderLayout.NORTH);
    centrecentre_3_centre.add(centrecentre_4_centre, BorderLayout.CENTER);
    //centreleft_3_centre.add(centreleft_4_bottom,BorderLayout.SOUTH);

    //five indoor
    centrecentre_4_centre.setLayout(new BorderLayout());
    centrecentre_5_top = new JPanel();
    centrecentre_5_centre = new JPanel();
    centrecentre_5_bottom = new JPanel();

    centrecentre_5_top.add(Box.createVerticalStrut(20));
    centrecentre_4_centre.add(centrecentre_5_top, BorderLayout.NORTH);
    centrecentre_4_centre.add(centrecentre_5_centre, BorderLayout.CENTER);
    //centreleft_4_centre.add(centreleft_5_bottom,BorderLayout.SOUTH);

    //six indoor
    centrecentre_5_centre.setLayout(new BorderLayout());
    centrecentre_6_top = new JPanel();
    centrecentre_6_centre = new JPanel();
    centrecentre_6_bottom = new JPanel();

    centrecentre_6_top.add(Box.createVerticalStrut(20));
    centrecentre_5_centre.add(centrecentre_6_top, BorderLayout.NORTH);
    centrecentre_5_centre.add(centrecentre_6_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    //seven indoor
    centrecentre_6_centre.setLayout(new BorderLayout());
    centrecentre_7_top = new JPanel();
    centrecentre_7_centre = new JPanel();
    centrecentre_7_bottom = new JPanel();

    centrecentre_7_top.add(Box.createVerticalStrut(20));
    centrecentre_6_centre.add(centrecentre_7_top, BorderLayout.NORTH);
    centrecentre_6_centre.add(centrecentre_7_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addcentrecontent();

}

public void addcentrecontent() {
    centrecentre_1_top_box = new BoxLayout(centrecentre_1_top, BoxLayout.Y_AXIS);
    centrecentre_1_top.setLayout(centrecentre_1_top_box);
    centrecentre_1_top.add(Box.createVerticalStrut(20));
    centrecentre_1_top_label = new JLabel("                                                                  ");
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

    addrightcontent();

}

public void addrightcontent() {
    centreright_1_top_box = new BoxLayout(centreright_1_top, BoxLayout.Y_AXIS);
    centreright_1_top.setLayout(centreright_1_top_box);
    centreright_1_top_label = new JLabel("Gas bill for residence:                                                                      ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top_adddetail = new JButton("Add Comment");
    addcomment[6] = new JButton("Add Comment");
    centreright_1_top_adddetail.addActionListener(e -> {
        value7 = 1;
    });
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);
    centreright_1_top.add(centreright_1_top_adddetail);
    centreright_1_top.add(addcomment[6]);
    addcomment[6].setVisible(false);
    centreright_1_top_adddetail.addActionListener(e -> adddetails_right_1());

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Telephone bill for residence:                                     ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top_adddetail = new JButton("Add Comment");
    addcomment[7] = new JButton("Add Comment");
    centreright_2_top_adddetail.addActionListener(e -> {
        value8 = 1;
    });
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);
    centreright_2_top.add(centreright_2_top_adddetail);
    centreright_2_top.add(addcomment[7]);
    addcomment[7].setVisible(false);
    centreright_2_top_adddetail.addActionListener(e -> adddetails_right_2());

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Education expense for children:                                   ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top_adddetail = new JButton("Add Comment");
    addcomment[8] = new JButton("Add Comment");
    centreright_3_top_adddetail.addActionListener(e -> {
        value9 = 1;
    });
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);
    centreright_3_top.add(centreright_3_top_adddetail);
    centreright_3_top.add(addcomment[8]);
    addcomment[8].setVisible(false);
    centreright_3_top_adddetail.addActionListener(e -> adddetails_right_3());
    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Bank loan installment:                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top_adddetail = new JButton("Add Comment");
    addcomment[9] = new JButton("Add Comment");
    centreright_4_top_adddetail.addActionListener(e -> {
        value10 = 1;
    });
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);
    centreright_4_top.add(centreright_4_top_adddetail);
    centreright_4_top.add(addcomment[9]);
    addcomment[9].setVisible(false);
    centreright_4_top_adddetail.addActionListener(e -> adddetails_right_4());
    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel(" Festival and other special expense,if any:                                     ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top_adddetail = new JButton("Add Comment");
    addcomment[10] = new JButton("Add Comment");
    centreright_5_top_adddetail.addActionListener(e -> {
        value11 = 1;
    });
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);
    centreright_5_top.add(centreright_5_top_adddetail);
    centreright_5_top.add(addcomment[10]);
    addcomment[10].setVisible(false);
    centreright_5_top_adddetail.addActionListener(e -> adddetails_right_5());
    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel("Medical Purposes:                                   ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top_adddetail = new JButton("Add Comment");
    addcomment[11] = new JButton("Add Comment");
    centreright_6_top_adddetail.addActionListener(e -> {
        value12 = 11;
    });
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);
    centreright_6_top.add(centreright_6_top_adddetail);
    centreright_6_top.add(addcomment[11]);
    addcomment[11].setVisible(false);
    centreright_6_top_adddetail.addActionListener(e -> adddetails_right_6());

    centreright_7_top_box = new BoxLayout(centreright_7_top, BoxLayout.Y_AXIS);
    centreright_7_top.setLayout(centreright_7_top_box);
    centreright_7_top_label = new JLabel("Net wealth as on last date of this income year:                                    ");
    centreright_7_top_textfield = new JTextField();
    centreright_7_top_adddetail = new JButton("Add Comment");
    addcomment[12] = new JButton("Add Comment");
    centreright_7_top_adddetail.addActionListener(e -> {
        value13 = 1;
    });
    centreright_7_top.add(centreright_7_top_label);
    centreright_7_top.add(centreright_7_top_textfield);
    centreright_7_top.add(centreright_7_top_adddetail);
    centreright_7_top.add(addcomment[12]);
    addcomment[12].setVisible(false);
    centreright_7_top_adddetail.addActionListener(e -> adddetails_right_7());

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
    centreright_1_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_1_top_textfield_next_1 = new JTextField();

    centreright_1_top_add = new JButton("Add");
    centreright_1_top_add.addActionListener(e -> {
        centreright_1_top_upper.setVisible(false);
        centreright_1_top_middle.setVisible(false);
    });
    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_upper.add(centreright_1_top_label_next_1);
    centreright_1_top_upper.add(centreright_1_top_textfield_next_1);
    centreright_1_top_upper.add(Box.createVerticalStrut(20));

    centreright_1_top_middle.add(centreright_1_top_add);
    mainbody.revalidate();

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
    centreright_2_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_2_top_textfield_next_1 = new JTextField();

    centreright_2_top_add = new JButton("Add");
    centreright_2_top_add.addActionListener(e -> {
        centreright_2_top_upper.setVisible(false);
        centreright_2_top_middle.setVisible(false);
    });
    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_1);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_1);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));

    centreright_2_top_middle.add(centreright_2_top_add);
    mainbody.revalidate();

}

public void adddetails_right_3() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_3_top_upper = new JPanel();
    centreright_3_top_box_upper = new BoxLayout(centreright_3_top_upper, BoxLayout.Y_AXIS);
    centreright_3_top_upper.setLayout(centreright_3_top_box_upper);

    centreright_3_top_middle = new JPanel();
    centreright_3_top_middle.setBackground(Color.green);

    centreright_3_top.add(centreright_3_top_upper, BorderLayout.NORTH);
    centreright_3_top.add(centreright_3_top_middle, BorderLayout.CENTER);
    centreright_3_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_3_top_textfield_next_1 = new JTextField();

    centreright_3_top_add = new JButton("Add");
    centreright_3_top_add.addActionListener(e -> {
        centreright_3_top_upper.setVisible(false);
        centreright_3_top_middle.setVisible(false);
    });
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));

    centreright_3_top_middle.add(centreright_3_top_add);
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
    centreright_4_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_4_top_textfield_next_1 = new JTextField();

    centreright_4_top_add = new JButton("Add");
    centreright_4_top_add.addActionListener(e -> {
        centreright_4_top_upper.setVisible(false);
        centreright_4_top_middle.setVisible(false);
    });
    centreright_4_top_upper.add(Box.createVerticalStrut(20));
    centreright_4_top_upper.add(centreright_4_top_label_next_1);
    centreright_4_top_upper.add(centreright_4_top_textfield_next_1);
    centreright_4_top_upper.add(Box.createVerticalStrut(20));

    centreright_4_top_middle.add(centreright_4_top_add);
    mainbody.revalidate();

}

public void adddetails_right_5() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_5_top_upper = new JPanel();
    centreright_5_top_box_upper = new BoxLayout(centreright_5_top_upper, BoxLayout.Y_AXIS);
    centreright_5_top_upper.setLayout(centreright_5_top_box_upper);

    centreright_5_top_middle = new JPanel();
    centreright_5_top_middle.setBackground(Color.green);

    centreright_5_top.add(centreright_5_top_upper, BorderLayout.NORTH);
    centreright_5_top.add(centreright_5_top_middle, BorderLayout.CENTER);
    centreright_5_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_5_top_textfield_next_1 = new JTextField();

    centreright_5_top_add = new JButton("Add");
    centreright_5_top_add.addActionListener(e -> {
        centreright_5_top_upper.setVisible(false);
        centreright_5_top_middle.setVisible(false);
    });
    centreright_5_top_upper.add(Box.createVerticalStrut(20));
    centreright_5_top_upper.add(centreright_5_top_label_next_1);
    centreright_5_top_upper.add(centreright_5_top_textfield_next_1);
    centreright_5_top_upper.add(Box.createVerticalStrut(20));

    centreright_5_top_middle.add(centreright_5_top_add);
    mainbody.revalidate();

}

public void adddetails_right_6() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_6_top_upper = new JPanel();
    centreright_6_top_box_upper = new BoxLayout(centreright_6_top_upper, BoxLayout.Y_AXIS);
    centreright_6_top_upper.setLayout(centreright_6_top_box_upper);

    centreright_6_top_middle = new JPanel();
    centreright_6_top_middle.setBackground(Color.green);

    centreright_6_top.add(centreright_6_top_upper, BorderLayout.NORTH);
    centreright_6_top.add(centreright_6_top_middle, BorderLayout.CENTER);
    centreright_6_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_6_top_textfield_next_1 = new JTextField();

    centreright_6_top_add = new JButton("Add");
    centreright_6_top_add.addActionListener(e -> {
        centreright_6_top_upper.setVisible(false);
        centreright_6_top_middle.setVisible(false);
    });
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_label_next_1);
    centreright_6_top_upper.add(centreright_6_top_textfield_next_1);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));

    centreright_6_top_middle.add(centreright_6_top_add);
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
    centreright_7_top_label_next_1 = new JLabel("Comment                                     ");
    centreright_7_top_textfield_next_1 = new JTextField();

    centreright_7_top_add = new JButton("Add");
    centreright_7_top_add.addActionListener(e -> {
        centreright_7_top_upper.setVisible(false);
        centreright_7_top_middle.setVisible(false);
    });
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_1);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));

    centreright_7_top_middle.add(centreright_7_top_add);
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

    jj = new JButton("                          ok                          ");
    update = new JButton("                          Update                          ");
    bottom_top.add(jj);
    bottom_top.add(update);
    update.setVisible(false);
    jj.addActionListener(e -> submit());

}

public void submit() {
    try {

        if (centreleft_1_top_textfield.getText().isEmpty()) {
            valuei1 = 0;
            values1 = "null";
        } else {
            valuei1 = Integer.parseInt(centreleft_1_top_textfield.getText());
            if (value1 == 1) {
                if (centreleft_1_top_textfield_next_1.getText().isEmpty()) {
                    values1 = "null";
                } else {
                    values1 = centreleft_1_top_textfield_next_1.getText();
                }

            }

        }
        if (centreleft_2_top_textfield.getText().isEmpty()) {
            valuei2 = 0;
            values2 = "null";
        } else {
            valuei2 = Integer.parseInt(centreleft_2_top_textfield.getText());
            if (value2 == 1) {
                if (centreleft_2_top_textfield_next_1.getText().isEmpty()) {
                    values1 = "null";
                } else {
                    values2 = centreleft_2_top_textfield_next_1.getText();
                }

            }

        }
        if (centreleft_3_top_textfield.getText().isEmpty()) {
            valuei3 = 0;
            values3 = "null";
        } else {
            valuei3 = Integer.parseInt(centreleft_3_top_textfield.getText());
            if (value3 == 1) {
                if (centreleft_3_top_textfield_next_1.getText().isEmpty()) {
                    values3 = "null";
                } else {
                    values3 = centreleft_3_top_textfield_next_1.getText();
                }

            }

        }

        if (centreleft_4_top_textfield.getText().isEmpty()) {
            valuei4 = 0;
            values4 = "null";
        } else {
            valuei4 = Integer.parseInt(centreleft_4_top_textfield.getText());
            if (value4 == 1) {
                if (centreleft_4_top_textfield_next_1.getText().isEmpty()) {
                    values4 = "null";
                } else {
                    values4 = centreleft_4_top_textfield_next_1.getText();
                }

            }

        }
        if (centreleft_5_top_textfield.getText().isEmpty()) {
            valuei5 = 0;
            values5 = "null";
        } else {
            valuei5 = Integer.parseInt(centreleft_5_top_textfield.getText());
            if (value5 == 1) {
                if (centreleft_5_top_textfield_next_1.getText().isEmpty()) {
                    values5 = "null";
                } else {
                    values5 = centreleft_5_top_textfield_next_1.getText();
                }

            }

        }
        if (centreleft_6_top_textfield.getText().isEmpty()) {
            valuei6 = 0;
            values6 = "null";
        } else {
            valuei6 = Integer.parseInt(centreleft_1_top_textfield.getText());
            if (value6 == 1) {
                if (centreleft_6_top_textfield_next_1.getText().isEmpty()) {
                    values6 = "null";
                } else {
                    values6 = centreleft_6_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_1_top_textfield.getText().isEmpty()) {
            valuei7 = 0;
            values7 = "null";
        } else {
            valuei7 = Integer.parseInt(centreright_1_top_textfield.getText());
            if (value7 == 1) {
                if (centreright_1_top_textfield_next_1.getText().isEmpty()) {
                    values7 = "null";
                } else {
                    values7 = centreright_1_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_2_top_textfield.getText().isEmpty()) {
            valuei8 = 0;
            values8 = "null";
        } else {
            valuei8 = Integer.parseInt(centreright_2_top_textfield.getText());
            if (value8 == 1) {
                if (centreright_2_top_textfield_next_1.getText().isEmpty()) {
                    values8 = "null";
                } else {
                    values8 = centreright_2_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_3_top_textfield.getText().isEmpty()) {
            valuei9 = 0;
            values9 = "null";
        } else {
            valuei9 = Integer.parseInt(centreright_3_top_textfield.getText());
            if (value9 == 1) {
                if (centreright_3_top_textfield_next_1.getText().isEmpty()) {
                    values9 = "null";
                } else {
                    values9 = centreright_3_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_4_top_textfield.getText().isEmpty()) {
            valuei10 = 0;
            values10 = "null";
        } else {
            valuei10 = Integer.parseInt(centreright_4_top_textfield.getText());
            if (value10 == 1) {
                if (centreright_4_top_textfield_next_1.getText().isEmpty()) {
                    values10 = "null";
                } else {
                    values10 = centreright_4_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_5_top_textfield.getText().isEmpty()) {
            valuei11 = 0;
            values11 = "null";
        } else {
            valuei11 = Integer.parseInt(centreright_5_top_textfield.getText());
            if (value11 == 1) {
                if (centreright_5_top_textfield_next_1.getText().isEmpty()) {
                    values11 = "null";
                } else {
                    values11 = centreright_5_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_6_top_textfield.getText().isEmpty()) {
            valuei12 = 0;
            values12 = "null";
        } else {
            valuei12 = Integer.parseInt(centreright_6_top_textfield.getText());
            if (value12 == 1) {
                if (centreright_6_top_textfield_next_1.getText().isEmpty()) {
                    values12 = "null";
                } else {
                    values12 = centreright_6_top_textfield_next_1.getText();
                }

            }

        }
        if (centreright_7_top_textfield.getText().isEmpty()) {
            valuei13 = 0;
            values13 = "null";
        } else {
            valuei13 = Integer.parseInt(centreright_7_top_textfield.getText());
            if (value13 == 1) {
                if (centreright_7_top_textfield_next_1.getText().isEmpty()) {
                    values13 = "null";
                } else {
                    values13 = centreright_7_top_textfield_next_1.getText();
                }

            }

        }
        conn.Form(NIN, valuei1, values1, valuei2, values2, valuei3, values3, valuei4, values4, valuei5, values5, valuei6, values6, valuei7, values7, valuei8, values8, valuei9, values9, valuei10, values10, valuei11, values11, valuei12, values12, valuei13, values13,ayear);
        IncomeAssessee hh = new IncomeAssessee();
        // HomeForm hh=new HomeForm();
        hh.accessnin(NIN,ayear);
        hh.setVisible(true);
        dispose();
    } catch (Exception e) {
    }

}

public void bottom() {

}

public void update(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException {
    centreleft_1_top_adddetail.setVisible(false);
    centreleft_2_top_adddetail.setVisible(false);
    centreleft_3_top_adddetail.setVisible(false);
    centreleft_4_top_adddetail.setVisible(false);
    centreleft_5_top_adddetail.setVisible(false);
    centreleft_6_top_adddetail.setVisible(false);
    centreright_1_top_adddetail.setVisible(false);
    centreright_2_top_adddetail.setVisible(false);
    centreright_3_top_adddetail.setVisible(false);
    centreright_4_top_adddetail.setVisible(false);
    centreright_5_top_adddetail.setVisible(false);
    centreright_6_top_adddetail.setVisible(false);
    centreright_7_top_adddetail.setVisible(false);
    jj.setVisible(false);
    update.setVisible(true);
    familyexpense = conn.FamilyExpense(text,ayear);
    for (int i = 1; i < 14; i++) {
        json = new JSONObject(familyexpense[i]);
        comm[i - 1] = json.getString("comment");
        amm[i - 1] = json.getInt("amount");
    }
    for (int i = 0; i < 13; i++) {
        addcomment[i].setVisible(true);
    }

    json = new JSONObject(familyexpense[1]);
    centreleft_1_top_textfield.setText(json.getString("amount"));
    amm[0] = Integer.parseInt(centreleft_1_top_textfield.getText());

    json = new JSONObject(familyexpense[2]);
    centreleft_2_top_textfield.setText(json.getString("amount"));
    amm[1] = Integer.parseInt(centreleft_2_top_textfield.getText());

    json = new JSONObject(familyexpense[3]);
    centreleft_3_top_textfield.setText(json.getString("amount"));
    amm[2] = Integer.parseInt(centreleft_3_top_textfield.getText());

    json = new JSONObject(familyexpense[4]);
    centreleft_4_top_textfield.setText(json.getString("amount"));
    amm[3] = Integer.parseInt(centreleft_4_top_textfield.getText());

    json = new JSONObject(familyexpense[5]);
    centreleft_5_top_textfield.setText(json.getString("amount"));
    amm[4] = Integer.parseInt(centreleft_5_top_textfield.getText());

    json = new JSONObject(familyexpense[6]);
    centreleft_6_top_textfield.setText(json.getString("amount"));
    amm[5] = Integer.parseInt(centreleft_6_top_textfield.getText());

    json = new JSONObject(familyexpense[7]);
    centreright_1_top_textfield.setText(json.getString("amount"));
    amm[6] = Integer.parseInt(centreright_1_top_textfield.getText());

    json = new JSONObject(familyexpense[8]);
    centreright_2_top_textfield.setText(json.getString("amount"));
    amm[7] = Integer.parseInt(centreright_2_top_textfield.getText());

    json = new JSONObject(familyexpense[9]);
    centreright_3_top_textfield.setText(json.getString("amount"));
    amm[8] = Integer.parseInt(centreright_3_top_textfield.getText());

    json = new JSONObject(familyexpense[10]);
    centreright_4_top_textfield.setText(json.getString("amount"));
    amm[9] = Integer.parseInt(centreright_4_top_textfield.getText());

    json = new JSONObject(familyexpense[11]);
    centreright_5_top_textfield.setText(json.getString("amount"));
    amm[10] = Integer.parseInt(centreright_5_top_textfield.getText());

    json = new JSONObject(familyexpense[12]);
    centreright_6_top_textfield.setText(json.getString("amount"));
    amm[11] = Integer.parseInt(centreright_6_top_textfield.getText());

    json = new JSONObject(familyexpense[13]);
    centreright_7_top_textfield.setText(json.getString("amount"));
    amm[12] = Integer.parseInt(centreright_7_top_textfield.getText());

    addcomment[0].addActionListener(e -> {

        //centreleft_1_top.setLayout(new BorderLayout());
        centreleft_1_top_upper = new JPanel();
        centreleft_1_top_box_upper = new BoxLayout(centreleft_1_top_upper, BoxLayout.Y_AXIS);
        centreleft_1_top_upper.setLayout(centreleft_1_top_box_upper);

        centreleft_1_top_middle = new JPanel();
        centreleft_1_top_middle.setBackground(Color.green);

        centreleft_1_top.add(centreleft_1_top_upper, BorderLayout.NORTH);
        centreleft_1_top.add(centreleft_1_top_middle, BorderLayout.CENTER);
        centreleft_1_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_1_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[1]);
            centreleft_1_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_1_top_add = new JButton("Add");
        centreleft_1_top_add.addActionListener(f -> {
            comm[0] = centreleft_1_top_textfield_next_1.getText();
            centreleft_1_top_upper.setVisible(false);
            centreleft_1_top_middle.setVisible(false);
        });
        centreleft_1_top_upper.add(Box.createVerticalStrut(20));
        centreleft_1_top_upper.add(centreleft_1_top_label_next_1);
        centreleft_1_top_upper.add(centreleft_1_top_textfield_next_1);
        centreleft_1_top_upper.add(Box.createVerticalStrut(20));

        centreleft_1_top_middle.add(centreleft_1_top_add);
        mainbody.revalidate();

    });
    addcomment[1].addActionListener(e -> {
        centreleft_2_top_upper = new JPanel();
        centreleft_2_top_box_upper = new BoxLayout(centreleft_2_top_upper, BoxLayout.Y_AXIS);
        centreleft_2_top_upper.setLayout(centreleft_2_top_box_upper);

        centreleft_2_top_middle = new JPanel();
        centreleft_2_top_middle.setBackground(Color.green);

        centreleft_2_top.add(centreleft_2_top_upper, BorderLayout.NORTH);
        centreleft_2_top.add(centreleft_2_top_middle, BorderLayout.CENTER);
        centreleft_2_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_2_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[2]);
            centreleft_2_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_2_top_add = new JButton("Add");
        centreleft_2_top_add.addActionListener(f -> {
            comm[1] = centreleft_2_top_textfield_next_1.getText();
            centreleft_2_top_upper.setVisible(false);
            centreleft_2_top_middle.setVisible(false);
        });
        centreleft_2_top_upper.add(Box.createVerticalStrut(20));
        centreleft_2_top_upper.add(centreleft_2_top_label_next_1);
        centreleft_2_top_upper.add(centreleft_2_top_textfield_next_1);
        centreleft_2_top_upper.add(Box.createVerticalStrut(20));

        centreleft_2_top_middle.add(centreleft_2_top_add);
        mainbody.revalidate();

    });
    addcomment[2].addActionListener(e -> {
        centreleft_3_top_upper = new JPanel();
        centreleft_3_top_box_upper = new BoxLayout(centreleft_3_top_upper, BoxLayout.Y_AXIS);
        centreleft_3_top_upper.setLayout(centreleft_3_top_box_upper);

        centreleft_3_top_middle = new JPanel();
        centreleft_3_top_middle.setBackground(Color.green);

        centreleft_3_top.add(centreleft_3_top_upper, BorderLayout.NORTH);
        centreleft_3_top.add(centreleft_3_top_middle, BorderLayout.CENTER);
        centreleft_3_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_3_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[3]);
            centreleft_3_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_3_top_add = new JButton("Add");
        centreleft_3_top_add.addActionListener(f -> {
            comm[2] = centreleft_3_top_textfield_next_1.getText();
            centreleft_3_top_upper.setVisible(false);
            centreleft_3_top_middle.setVisible(false);
        });
        centreleft_3_top_upper.add(Box.createVerticalStrut(20));
        centreleft_3_top_upper.add(centreleft_3_top_label_next_1);
        centreleft_3_top_upper.add(centreleft_3_top_textfield_next_1);
        centreleft_3_top_upper.add(Box.createVerticalStrut(20));

        centreleft_3_top_middle.add(centreleft_3_top_add);
        mainbody.revalidate();
    });
    addcomment[3].addActionListener(e -> {
        centreleft_4_top_upper = new JPanel();
        centreleft_4_top_box_upper = new BoxLayout(centreleft_4_top_upper, BoxLayout.Y_AXIS);
        centreleft_4_top_upper.setLayout(centreleft_4_top_box_upper);

        centreleft_4_top_middle = new JPanel();
        centreleft_4_top_middle.setBackground(Color.green);

        centreleft_4_top.add(centreleft_4_top_upper, BorderLayout.NORTH);
        centreleft_4_top.add(centreleft_4_top_middle, BorderLayout.CENTER);
        centreleft_4_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_4_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[4]);
            centreleft_4_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_4_top_add = new JButton("Add");
        centreleft_4_top_add.addActionListener(f -> {
            comm[3] = centreleft_4_top_textfield_next_1.getText();
            centreleft_4_top_upper.setVisible(false);
            centreleft_4_top_middle.setVisible(false);
        });
        centreleft_4_top_upper.add(Box.createVerticalStrut(20));
        centreleft_4_top_upper.add(centreleft_4_top_label_next_1);
        centreleft_4_top_upper.add(centreleft_4_top_textfield_next_1);
        centreleft_4_top_upper.add(Box.createVerticalStrut(20));

        centreleft_4_top_middle.add(centreleft_4_top_add);
        mainbody.revalidate();
    });
    addcomment[4].addActionListener(e -> {
        centreleft_5_top_upper = new JPanel();
        centreleft_5_top_box_upper = new BoxLayout(centreleft_5_top_upper, BoxLayout.Y_AXIS);
        centreleft_5_top_upper.setLayout(centreleft_5_top_box_upper);

        centreleft_5_top_middle = new JPanel();
        centreleft_5_top_middle.setBackground(Color.green);

        centreleft_5_top.add(centreleft_5_top_upper, BorderLayout.NORTH);
        centreleft_5_top.add(centreleft_5_top_middle, BorderLayout.CENTER);
        centreleft_5_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_5_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[5]);
            centreleft_5_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_5_top_add = new JButton("Add");
        centreleft_5_top_add.addActionListener(f -> {
            comm[4] = centreleft_5_top_textfield_next_1.getText();
            centreleft_5_top_upper.setVisible(false);
            centreleft_5_top_middle.setVisible(false);
        });
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));
        centreleft_5_top_upper.add(centreleft_5_top_label_next_1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_middle.add(centreleft_5_top_add);
        mainbody.revalidate();
    });
    addcomment[5].addActionListener(e -> {
        centreleft_6_top_upper = new JPanel();
        centreleft_6_top_box_upper = new BoxLayout(centreleft_6_top_upper, BoxLayout.Y_AXIS);
        centreleft_6_top_upper.setLayout(centreleft_6_top_box_upper);

        centreleft_6_top_middle = new JPanel();
        centreleft_6_top_middle.setBackground(Color.green);

        centreleft_6_top.add(centreleft_6_top_upper, BorderLayout.NORTH);
        centreleft_6_top.add(centreleft_6_top_middle, BorderLayout.CENTER);
        centreleft_6_top_label_next_1 = new JLabel("Comment                                     ");
        centreleft_6_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[6]);
            centreleft_6_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_6_top_add = new JButton("Add");
        centreleft_6_top_add.addActionListener(f -> {
            comm[5] = centreleft_6_top_textfield_next_1.getText();
            centreleft_6_top_upper.setVisible(false);
            centreleft_6_top_middle.setVisible(false);
        });
        centreleft_6_top_upper.add(Box.createVerticalStrut(20));
        centreleft_6_top_upper.add(centreleft_6_top_label_next_1);
        centreleft_6_top_upper.add(centreleft_6_top_textfield_next_1);
        centreleft_6_top_upper.add(Box.createVerticalStrut(20));

        centreleft_6_top_middle.add(centreleft_6_top_add);
        mainbody.revalidate();
    });
    addcomment[6].addActionListener(e -> {
        centreright_1_top_upper = new JPanel();
        centreright_1_top_box_upper = new BoxLayout(centreright_1_top_upper, BoxLayout.Y_AXIS);
        centreright_1_top_upper.setLayout(centreright_1_top_box_upper);

        centreright_1_top_middle = new JPanel();
        centreright_1_top_middle.setBackground(Color.green);

        centreright_1_top.add(centreright_1_top_upper, BorderLayout.NORTH);
        centreright_1_top.add(centreright_1_top_middle, BorderLayout.CENTER);
        centreright_1_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_1_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[7]);
            centreright_1_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_1_top_add = new JButton("Add");
        centreright_1_top_add.addActionListener(f -> {
            comm[6] = centreright_1_top_textfield_next_1.getText();
            centreright_1_top_upper.setVisible(false);
            centreright_1_top_middle.setVisible(false);
        });
        centreright_1_top_upper.add(Box.createVerticalStrut(20));
        centreright_1_top_upper.add(centreright_1_top_label_next_1);
        centreright_1_top_upper.add(centreright_1_top_textfield_next_1);
        centreright_1_top_upper.add(Box.createVerticalStrut(20));

        centreright_1_top_middle.add(centreright_1_top_add);
        mainbody.revalidate();
    });
    addcomment[7].addActionListener(e -> {
        centreright_2_top_upper = new JPanel();
        centreright_2_top_box_upper = new BoxLayout(centreright_2_top_upper, BoxLayout.Y_AXIS);
        centreright_2_top_upper.setLayout(centreright_2_top_box_upper);

        centreright_2_top_middle = new JPanel();
        centreright_2_top_middle.setBackground(Color.green);

        centreright_2_top.add(centreright_2_top_upper, BorderLayout.NORTH);
        centreright_2_top.add(centreright_2_top_middle, BorderLayout.CENTER);
        centreright_2_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_2_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[8]);
            centreright_2_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_2_top_add = new JButton("Add");
        centreright_2_top_add.addActionListener(f -> {
            comm[7] = centreright_2_top_textfield_next_1.getText();
            centreright_2_top_upper.setVisible(false);
            centreright_2_top_middle.setVisible(false);
        });
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_1);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_1);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));

        centreright_2_top_middle.add(centreright_2_top_add);
        mainbody.revalidate();
    });
    addcomment[8].addActionListener(e -> {
        centreright_3_top_upper = new JPanel();
        centreright_3_top_box_upper = new BoxLayout(centreright_3_top_upper, BoxLayout.Y_AXIS);
        centreright_3_top_upper.setLayout(centreright_3_top_box_upper);

        centreright_3_top_middle = new JPanel();
        centreright_3_top_middle.setBackground(Color.green);

        centreright_3_top.add(centreright_3_top_upper, BorderLayout.NORTH);
        centreright_3_top.add(centreright_3_top_middle, BorderLayout.CENTER);
        centreright_3_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_3_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[9]);
            centreright_3_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_3_top_add = new JButton("Add");
        centreright_3_top_add.addActionListener(f -> {
            comm[8] = centreright_3_top_textfield_next_1.getText();
            centreright_3_top_upper.setVisible(false);
            centreright_3_top_middle.setVisible(false);
        });
        centreright_3_top_upper.add(Box.createVerticalStrut(20));
        centreright_3_top_upper.add(centreright_3_top_label_next_1);
        centreright_3_top_upper.add(centreright_3_top_textfield_next_1);
        centreright_3_top_upper.add(Box.createVerticalStrut(20));

        centreright_3_top_middle.add(centreright_3_top_add);
        mainbody.revalidate();
    });
    addcomment[9].addActionListener(e -> {
        centreright_4_top_upper = new JPanel();
        centreright_4_top_box_upper = new BoxLayout(centreright_4_top_upper, BoxLayout.Y_AXIS);
        centreright_4_top_upper.setLayout(centreright_4_top_box_upper);

        centreright_4_top_middle = new JPanel();
        centreright_4_top_middle.setBackground(Color.green);

        centreright_4_top.add(centreright_4_top_upper, BorderLayout.NORTH);
        centreright_4_top.add(centreright_4_top_middle, BorderLayout.CENTER);
        centreright_4_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_4_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[10]);
            centreright_4_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_4_top_add = new JButton("Add");
        centreright_4_top_add.addActionListener(f -> {
            comm[9] = centreright_4_top_textfield_next_1.getText();
            centreright_4_top_upper.setVisible(false);
            centreright_4_top_middle.setVisible(false);
        });
        centreright_4_top_upper.add(Box.createVerticalStrut(20));
        centreright_4_top_upper.add(centreright_4_top_label_next_1);
        centreright_4_top_upper.add(centreright_4_top_textfield_next_1);
        centreright_4_top_upper.add(Box.createVerticalStrut(20));

        centreright_4_top_middle.add(centreright_4_top_add);
        mainbody.revalidate();
    });
    addcomment[10].addActionListener(e -> {
        centreright_5_top_upper = new JPanel();
        centreright_5_top_box_upper = new BoxLayout(centreright_5_top_upper, BoxLayout.Y_AXIS);
        centreright_5_top_upper.setLayout(centreright_5_top_box_upper);

        centreright_5_top_middle = new JPanel();
        centreright_5_top_middle.setBackground(Color.green);

        centreright_5_top.add(centreright_5_top_upper, BorderLayout.NORTH);
        centreright_5_top.add(centreright_5_top_middle, BorderLayout.CENTER);
        centreright_5_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_5_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[11]);
            centreright_5_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_5_top_add = new JButton("Add");
        centreright_5_top_add.addActionListener(d -> {
            comm[10] = centreright_5_top_textfield_next_1.getText();
            centreright_5_top_upper.setVisible(false);
            centreright_5_top_middle.setVisible(false);
        });
        centreright_5_top_upper.add(Box.createVerticalStrut(20));
        centreright_5_top_upper.add(centreright_5_top_label_next_1);
        centreright_5_top_upper.add(centreright_5_top_textfield_next_1);
        centreright_5_top_upper.add(Box.createVerticalStrut(20));

        centreright_5_top_middle.add(centreright_5_top_add);
        mainbody.revalidate();
    });
    addcomment[11].addActionListener(e -> {
        centreright_6_top_upper = new JPanel();
        centreright_6_top_box_upper = new BoxLayout(centreright_6_top_upper, BoxLayout.Y_AXIS);
        centreright_6_top_upper.setLayout(centreright_6_top_box_upper);

        centreright_6_top_middle = new JPanel();
        centreright_6_top_middle.setBackground(Color.green);

        centreright_6_top.add(centreright_6_top_upper, BorderLayout.NORTH);
        centreright_6_top.add(centreright_6_top_middle, BorderLayout.CENTER);
        centreright_6_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_6_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[12]);
            centreright_6_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_6_top_add = new JButton("Add");
        centreright_6_top_add.addActionListener(h -> {
            comm[11] = centreright_6_top_textfield_next_1.getText();
            centreright_6_top_upper.setVisible(false);
            centreright_6_top_middle.setVisible(false);
        });
        centreright_6_top_upper.add(Box.createVerticalStrut(20));
        centreright_6_top_upper.add(centreright_6_top_label_next_1);
        centreright_6_top_upper.add(centreright_6_top_textfield_next_1);
        centreright_6_top_upper.add(Box.createVerticalStrut(20));

        centreright_6_top_middle.add(centreright_6_top_add);
        mainbody.revalidate();
    });
    addcomment[12].addActionListener(e -> {
        centreright_7_top_upper = new JPanel();
        centreright_7_top_box_upper = new BoxLayout(centreright_7_top_upper, BoxLayout.Y_AXIS);
        centreright_7_top_upper.setLayout(centreright_7_top_box_upper);

        centreright_7_top_middle = new JPanel();
        centreright_7_top_middle.setBackground(Color.green);

        centreright_7_top.add(centreright_7_top_upper, BorderLayout.NORTH);
        centreright_7_top.add(centreright_7_top_middle, BorderLayout.CENTER);
        centreright_7_top_label_next_1 = new JLabel("Comment                                     ");
        centreright_7_top_textfield_next_1 = new JTextField();
        try {
            json = new JSONObject(familyexpense[13]);
            centreright_7_top_textfield_next_1.setText(json.getString("comment"));

        } catch (JSONException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_7_top_add = new JButton("Add");
        centreright_7_top_add.addActionListener(f -> {
            comm[12] = centreright_7_top_textfield_next_1.getText();
            centreright_7_top_upper.setVisible(false);
            centreright_7_top_middle.setVisible(false);
        });
        centreright_7_top_upper.add(Box.createVerticalStrut(20));
        centreright_7_top_upper.add(centreright_7_top_label_next_1);
        centreright_7_top_upper.add(centreright_7_top_textfield_next_1);
        centreright_7_top_upper.add(Box.createVerticalStrut(20));

        centreright_7_top_middle.add(centreright_7_top_add);
        mainbody.revalidate();
    });

    update.addActionListener(e -> {

        amm[0] = Integer.parseInt(centreleft_1_top_textfield.getText());

        amm[1] = Integer.parseInt(centreleft_2_top_textfield.getText());

        amm[2] = Integer.parseInt(centreleft_3_top_textfield.getText());

        amm[3] = Integer.parseInt(centreleft_4_top_textfield.getText());

        amm[4] = Integer.parseInt(centreleft_5_top_textfield.getText());

        amm[5] = Integer.parseInt(centreleft_6_top_textfield.getText());

        amm[6] = Integer.parseInt(centreright_1_top_textfield.getText());

        amm[7] = Integer.parseInt(centreright_2_top_textfield.getText());

        amm[8] = Integer.parseInt(centreright_3_top_textfield.getText());

        amm[9] = Integer.parseInt(centreright_4_top_textfield.getText());

        amm[10] = Integer.parseInt(centreright_5_top_textfield.getText());

        amm[11] = Integer.parseInt(centreright_6_top_textfield.getText());

        amm[12] = Integer.parseInt(centreright_7_top_textfield.getText());

        valuei1 = amm[0];
        valuei2 = amm[1];
        valuei3 = amm[2];
        valuei4 = amm[3];
        valuei5 = amm[4];
        valuei6 = amm[5];
        valuei7 = amm[6];
        valuei8 = amm[7];
        valuei9 = amm[8];
        valuei10 = amm[9];
        valuei11 = amm[10];
        valuei12 = amm[11];
        valuei13 = amm[12];

        values1 = comm[0];
        values2 = comm[1];
        values3 = comm[2];
        values4 = comm[3];
        values5 = comm[4];
        values6 = comm[5];
        values7 = comm[6];
        values8 = comm[7];
        values9 = comm[8];
        values10 = comm[9];
        values11 = comm[10];
        values12 = comm[11];
        values13 = comm[12];
        try {
            conn.FormUpdate(text, valuei1, values1, valuei2, values2, valuei3, values3, valuei4, values4, valuei5, values5, valuei6, values6, valuei7, values7, valuei8, values8, valuei9, values9, valuei10, values10, valuei11, values11, valuei12, values12, valuei13, values13,ayear);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            HomeForm h;
            h = new HomeForm();
            h.setVisible(true);
                    dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();
    });
}

}
