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
public class Salary extends JFrame {
int ayear;
JButton[] adddetailupdate = new JButton[19];
databaseConnection conn = new databaseConnection();
String[] salary1 = new String[17];
JSONObject json = new JSONObject();
long NIN;
int[] leftpart1 = new int[9];
int[] leftpart2 = new int[9];
int[] rightpart1 = new int[9];
int[] rightpart2 = new int[9];
JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre, centreleft_7_top, centreleft_7_bottom, centreleft_7_centre, centreleft_8_top, centreleft_8_bottom, centreleft_8_centre, centreleft_9_top, centreleft_9_bottom, centreleft_9_centre,
        centreleft_1_top_upper, centreleft_2_top_upper, centreleft_3_top_upper, centreleft_4_top_upper, centreleft_5_top_upper, centreleft_6_top_upper, centreleft_7_top_upper, centreleft_8_top_upper, centreleft_9_top_upper,
        centreleft_1_top_middle, centreleft_2_top_middle, centreleft_3_top_middle, centreleft_4_top_middle, centreleft_5_top_middle, centreleft_6_top_middle, centreleft_7_top_middle, centreleft_8_top_middle, centreleft_9_top_middle,
        centrecentre_1_top, centrecentre_1_bottom, centrecentre_1_centre, centrecentre_2_top, centrecentre_2_bottom, centrecentre_2_centre, centrecentre_3_top, centrecentre_3_bottom, centrecentre_3_centre, centrecentre_4_top, centrecentre_4_bottom, centrecentre_4_centre, centrecentre_5_top, centrecentre_5_bottom, centrecentre_5_centre, centrecentre_6_top, centrecentre_6_bottom, centrecentre_6_centre, centrecentre_7_top, centrecentre_7_bottom, centrecentre_7_centre,
        centrecentre_1_top_upper, centrecentre_2_top_upper, centrecentre_3_top_upper, centrecentre_4_top_upper, centrecentre_5_top_upper, centrecentre_6_top_upper, centrecentre_7_top_upper,
        centrecentre_1_top_middle, centrecentre_2_top_middle, centrecentre_3_top_middle, centrecentre_4_top_middle, centrecentre_5_top_middle, centrecentre_6_top_middle, centrecentre_7_top_middle,
        centreright_1_top, centreright_1_bottom, centreright_1_centre, centreright_2_top, centreright_2_bottom, centreright_2_centre, centreright_3_top, centreright_3_bottom, centreright_3_centre, centreright_4_top, centreright_4_bottom, centreright_4_centre, centreright_5_top, centreright_5_bottom, centreright_5_centre, centreright_6_top, centreright_6_bottom, centreright_6_centre, centreright_7_top, centreright_7_bottom, centreright_7_centre, centreright_8_top, centreright_8_bottom, centreright_8_centre, centreright_9_top, centreright_9_bottom, centreright_9_centre,
        centreright_1_top_upper, centreright_2_top_upper, centreright_3_top_upper, centreright_4_top_upper, centreright_5_top_upper, centreright_6_top_upper, centreright_7_top_upper, centreright_8_top_upper, centreright_9_top_upper,
        centreright_1_top_middle, centreright_2_top_middle, centreright_3_top_middle, centreright_4_top_middle, centreright_5_top_middle, centreright_6_top_middle, centreright_7_top_middle, centreright_8_top_middle, centreright_9_top_middle;

JScrollPane js;
JButton btn1;
BoxLayout centreleft_1_top_box, centreleft_2_top_box, centreleft_3_top_box, centreleft_4_top_box, centreleft_5_top_box, centreleft_6_top_box, centreleft_7_top_box, centreleft_8_top_box, centreleft_9_top_box,
        centreleft_1_top_box_upper, centreleft_2_top_box_upper, centreleft_3_top_box_upper, centreleft_4_top_box_upper, centreleft_5_top_box_upper, centreleft_6_top_box_upper, centreleft_7_top_box_upper, centreleft_8_top_box_upper, centreleft_9_top_box_upper,
        centrecentre_1_top_box, centrecentre_2_top_box, centrecentre_3_top_box, centrecentre_4_top_box, centrecentre_5_top_box, centrecentre_6_top_box, centrecentre_7_top_box,
        centrecentre_1_top_box_upper, centrecentre_2_top_box_upper, centrecentre_3_top_box_upper, centrecentre_4_top_box_upper, centrecentre_5_top_box_upper, centrecentre_6_top_box_upper, centrecentre_7_top_box_upper,
        centreright_1_top_box, centreright_2_top_box, centreright_3_top_box, centreright_4_top_box, centreright_5_top_box, centreright_6_top_box, centreright_7_top_box, centreright_8_top_box, centreright_9_top_box,
        centreright_1_top_box_upper, centreright_2_top_box_upper, centreright_3_top_box_upper, centreright_4_top_box_upper, centreright_5_top_box_upper, centreright_6_top_box_upper, centreright_7_top_box_upper, centreright_8_top_box_upper, centreright_9_top_box_upper;

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

JLabel centreright_1_top_label, centreright_2_top_label, centreright_3_top_label, centreright_4_top_label, centreright_5_top_label, centreright_6_top_label, centreright_7_top_label, centreright_8_top_label, centreright_9_top_label,
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
        centreright_2_top_label_next_exampted1, centreright_2_top_label_next_taxable2,
        centreright_3_top_label_next_exampted1, centreright_3_top_label_next_taxable2,
        centreright_4_top_label_next_exampted1, centreright_4_top_label_next_taxable2,
        centreright_5_top_label_next_exampted1, centreright_5_top_label_next_taxable2,
        centreright_6_top_label_next_exampted1, centreright_6_top_label_next_taxable2,
        centreright_7_top_label_next_exampted1, centreright_7_top_label_next_taxable2,
        centreright_8_top_label_next_exampted1, centreright_8_top_label_next_taxable2,
        centreright_9_top_label_next_exampted1, centreright_9_top_label_next_taxable2;
;


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
        centreright_1_top_textfield, centreright_2_top_textfield, centreright_3_top_textfield, centreright_4_top_textfield, centreright_5_top_textfield, centreright_6_top_textfield, centreright_7_top_textfield, centreright_8_top_textfield, centreright_9_top_textfield,
        centreright_1_top_textfield_next_1, centreright_1_top_textfield_next_2,
        centreright_2_top_textfield_next_1, centreright_2_top_textfield_next_2,
        centreright_3_top_textfield_next_1, centreright_3_top_textfield_next_2,
        centreright_4_top_textfield_next_1, centreright_4_top_textfield_next_2,
        centreright_5_top_textfield_next_1, centreright_5_top_textfield_next_2,
        centreright_6_top_textfield_next_1, centreright_6_top_textfield_next_2,
        centreright_7_top_textfield_next_1, centreright_7_top_textfield_next_2,
        centreright_8_top_textfield_next_1, centreright_8_top_textfield_next_2,
        centreright_9_top_textfield_next_1, centreright_9_top_textfield_next_2,
        centreright_1_top_textfield_next_exampted1, centreright_1_top_textfield_next_taxable2,
        centreright_2_top_textfield_next_exampted1, centreright_2_top_textfield_next_taxable2,
        centreright_3_top_textfield_next_exampted1, centreright_3_top_textfield_next_taxable2,
        centreright_4_top_textfield_next_exampted1, centreright_4_top_textfield_next_taxable2,
        centreright_5_top_textfield_next_exampted1, centreright_5_top_textfield_next_taxable2,
        centreright_6_top_textfield_next_exampted1, centreright_6_top_textfield_next_taxable2,
        centreright_7_top_textfield_next_exampted1, centreright_7_top_textfield_next_taxable2,
        centreright_8_top_textfield_next_exampted1, centreright_8_top_textfield_next_taxable2,
        centreright_9_top_textfield_next_exampted1, centreright_9_top_textfield_next_taxable2;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_7_top_adddetail, centreleft_8_top_adddetail, centreleft_9_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_7_top_add, centreleft_8_top_add, centreleft_9_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end, centreleft_7_top_end, centreleft_8_top_end, centreleft_9_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate,
        jj, update;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_8_top_adddetail, centreright_9_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_8_top_add, centreright_9_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end, centreright_8_top_end, centreright_9_top_end;

public Salary() {
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
    Salary window = new Salary();
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
    JLabel jj = new JLabel("   income(korjoggo ay ber kora)     ");
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
    centreleft_1_top_label = new JLabel(" Basic Pay:                                                                                                                   ");
    centreleft_1_top_textfield = new JTextField();
    centreleft_1_top_textfield.setEnabled(false);
    centreleft_1_top_adddetail = new JButton("Add Detail");
    adddetailupdate[0] = new JButton("Add Detail");
    centreleft_1_top.add(centreleft_1_top_label);
    centreleft_1_top.add(centreleft_1_top_textfield);
    centreleft_1_top.add(centreleft_1_top_adddetail);
    centreleft_1_top.add(adddetailupdate[0]);
    adddetailupdate[0].setVisible(false);
    centreleft_1_top_adddetail.addActionListener(e -> adddetails_left_1());

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Special Pay:                                    ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top_textfield.setEnabled(false);
    centreleft_2_top_adddetail = new JButton("Add Detail");
    adddetailupdate[1] = new JButton("Add Detail");
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);
    centreleft_2_top.add(centreleft_2_top_adddetail);
    centreleft_2_top.add(adddetailupdate[1]);
    adddetailupdate[1].setVisible(false);
    centreleft_2_top_adddetail.addActionListener(e -> adddetails_left_2());

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("Dearness allowance:                                    ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top_textfield.setEnabled(false);
    centreleft_3_top_adddetail = new JButton("Add Detail");
    adddetailupdate[2] = new JButton("Add Detail");
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);
    centreleft_3_top.add(centreleft_3_top_adddetail);
    centreleft_3_top.add(adddetailupdate[2]);
    adddetailupdate[2].setVisible(false);
    centreleft_3_top_adddetail.addActionListener(e -> adddetails_left_3());
    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("Conveyance allowance:                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top_textfield.setEnabled(false);
    centreleft_4_top_adddetail = new JButton("Add Detail");
    adddetailupdate[3] = new JButton("Add Detail");
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);
    centreleft_4_top.add(centreleft_4_top_adddetail);
    centreleft_4_top.add(adddetailupdate[3]);
    adddetailupdate[3].setVisible(false);
    centreleft_4_top_adddetail.addActionListener(e -> adddetails_left_4());
    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("House rent Allowance:                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top_textfield.setEnabled(false);
    centreleft_5_top_adddetail = new JButton("Add Detail");
    adddetailupdate[4] = new JButton("Add Detail");
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);
    centreleft_5_top.add(centreleft_5_top_adddetail);
    centreleft_5_top.add(adddetailupdate[4]);
    adddetailupdate[4].setVisible(false);
    centreleft_5_top_adddetail.addActionListener(e -> adddetails_left_5());
    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("medical Allowance:                                    ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top_textfield.setEnabled(false);
    centreleft_6_top_adddetail = new JButton("Add Detail");
    adddetailupdate[5] = new JButton("Add Detail");
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);
    centreleft_6_top.add(centreleft_6_top_adddetail);
    centreleft_6_top.add(adddetailupdate[5]);
    adddetailupdate[5].setVisible(false);
    centreleft_6_top_adddetail.addActionListener(e -> adddetails_left_6());

    //7
    centreleft_7_top_box = new BoxLayout(centreleft_7_top, BoxLayout.Y_AXIS);
    centreleft_7_top.setLayout(centreleft_7_top_box);
    centreleft_7_top_label = new JLabel("Servent Allowance:                                    ");
    centreleft_7_top_textfield = new JTextField();
    centreleft_7_top_textfield.setEnabled(false);
    centreleft_7_top_adddetail = new JButton("Add Detail");
    adddetailupdate[6] = new JButton("Add Detail");
    centreleft_7_top.add(centreleft_7_top_label);
    centreleft_7_top.add(centreleft_7_top_textfield);
    centreleft_7_top.add(centreleft_7_top_adddetail);
    centreleft_7_top.add(adddetailupdate[6]);
    adddetailupdate[6].setVisible(false);
    centreleft_7_top_adddetail.addActionListener(e -> adddetails_left_7());

    //8
    centreleft_8_top_box = new BoxLayout(centreleft_8_top, BoxLayout.Y_AXIS);
    centreleft_8_top.setLayout(centreleft_8_top_box);
    centreleft_8_top_label = new JLabel("Leave Allowance:                                  ");
    centreleft_8_top_textfield = new JTextField();
    centreleft_8_top_textfield.setEnabled(false);
    centreleft_8_top_adddetail = new JButton("Add Detail");
    adddetailupdate[7] = new JButton("Add Detail");
    centreleft_8_top.add(centreleft_8_top_label);
    centreleft_8_top.add(centreleft_8_top_textfield);
    centreleft_8_top.add(centreleft_8_top_adddetail);
    centreleft_8_top.add(adddetailupdate[7]);
    adddetailupdate[7].setVisible(false);
    centreleft_8_top_adddetail.addActionListener(e -> adddetails_left_8());

    //9
    centreleft_9_top_box = new BoxLayout(centreleft_9_top, BoxLayout.Y_AXIS);
    centreleft_9_top.setLayout(centreleft_9_top_box);
    centreleft_9_top_label = new JLabel("Honorarium / Reward / fee:                                    ");
    centreleft_9_top_textfield = new JTextField();
    centreleft_9_top_textfield.setEnabled(false);
    centreleft_9_top_adddetail = new JButton("Add Detail");
    adddetailupdate[8] = new JButton("Add Detail");
    centreleft_9_top.add(centreleft_9_top_label);
    centreleft_9_top.add(centreleft_9_top_textfield);
    centreleft_9_top.add(centreleft_9_top_adddetail);
    centreleft_9_top.add(adddetailupdate[8]);
    adddetailupdate[8].setVisible(false);
    centreleft_9_top_adddetail.addActionListener(e -> adddetails_left_9());
}

public int adddetails_add(int a, int b) {
    return a + b;
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
    centreleft_1_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_1_top_textfield_next_exampted1 = new JTextField();

    centreleft_1_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_1_top_textfield_next_taxable1 = new JTextField();

    centreleft_1_top_add = new JButton("Add");
    centreleft_1_top_add.addActionListener(e
            -> {
        if (!centreleft_1_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[0] = Integer.parseInt(centreleft_1_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_1_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[0] = Integer.parseInt(centreleft_1_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[0], leftpart2[0]);

        centreleft_1_top_textfield.setText(Integer.toString(sum));
        centreleft_1_top_textfield.setEnabled(true);
        centreleft_1_top_upper.setVisible(false);
        centreleft_1_top_middle.setVisible(false);
    });

    centreleft_1_top_upper.add(Box.createVerticalStrut(20));
    centreleft_1_top_upper.add(centreleft_1_top_label_next_exampted1);
    centreleft_1_top_upper.add(centreleft_1_top_textfield_next_exampted1);
    centreleft_1_top_upper.add(Box.createVerticalStrut(20));

    centreleft_1_top_upper.add(centreleft_1_top_label_next_taxable1);
    centreleft_1_top_upper.add(centreleft_1_top_textfield_next_taxable1);
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
    centreleft_2_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_2_top_textfield_next_exampted1 = new JTextField();

    centreleft_2_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_2_top_textfield_next_taxable1 = new JTextField();

    centreleft_2_top_add = new JButton("Add");
    centreleft_2_top_add.addActionListener(e
            -> {
        if (!centreleft_2_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[1] = Integer.parseInt(centreleft_2_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_2_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[1] = Integer.parseInt(centreleft_2_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[1], leftpart2[1]);
        centreleft_2_top_textfield.setText(Integer.toString(sum));
        centreleft_2_top_textfield.setEnabled(true);
        centreleft_2_top_upper.setVisible(false);
        centreleft_2_top_middle.setVisible(false);
    });
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));
    centreleft_2_top_upper.add(centreleft_2_top_label_next_exampted1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_exampted1);
    centreleft_2_top_upper.add(Box.createVerticalStrut(20));

    centreleft_2_top_upper.add(centreleft_2_top_label_next_taxable1);
    centreleft_2_top_upper.add(centreleft_2_top_textfield_next_taxable1);
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
    centreleft_3_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_3_top_textfield_next_exampted1 = new JTextField();

    centreleft_3_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_3_top_textfield_next_taxable1 = new JTextField();

    centreleft_3_top_add = new JButton("Add");

    centreleft_3_top_add.addActionListener(e
            -> {
        if (!centreleft_3_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[2] = Integer.parseInt(centreleft_3_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_3_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[2] = Integer.parseInt(centreleft_3_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[2], leftpart2[2]);
        centreleft_3_top_textfield.setText(Integer.toString(sum));
        centreleft_3_top_textfield.setEnabled(true);
        centreleft_3_top_upper.setVisible(false);
        centreleft_3_top_middle.setVisible(false);
    });

    centreleft_3_top_upper.add(Box.createVerticalStrut(20));
    centreleft_3_top_upper.add(centreleft_3_top_label_next_exampted1);
    centreleft_3_top_upper.add(centreleft_3_top_textfield_next_exampted1);
    centreleft_3_top_upper.add(Box.createVerticalStrut(20));

    centreleft_3_top_upper.add(centreleft_3_top_label_next_taxable1);
    centreleft_3_top_upper.add(centreleft_3_top_textfield_next_taxable1);
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
    centreleft_4_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_4_top_textfield_next_exampted1 = new JTextField();

    centreleft_4_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_4_top_textfield_next_taxable1 = new JTextField();

    centreleft_4_top_add = new JButton("Add");

    centreleft_4_top_add.addActionListener(e
            -> {
        if (!centreleft_4_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[3] = Integer.parseInt(centreleft_4_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_4_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[3] = Integer.parseInt(centreleft_4_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[3], leftpart2[3]);
        centreleft_4_top_textfield.setText(Integer.toString(sum));
        centreleft_4_top_textfield.setEnabled(true);
        centreleft_4_top_upper.setVisible(false);
        centreleft_4_top_middle.setVisible(false);
    });

    centreleft_4_top_upper.add(Box.createVerticalStrut(20));
    centreleft_4_top_upper.add(centreleft_4_top_label_next_exampted1);
    centreleft_4_top_upper.add(centreleft_4_top_textfield_next_exampted1);
    centreleft_4_top_upper.add(Box.createVerticalStrut(20));

    centreleft_4_top_upper.add(centreleft_4_top_label_next_taxable1);
    centreleft_4_top_upper.add(centreleft_4_top_textfield_next_taxable1);
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
    centreleft_5_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_5_top_textfield_next_exampted1 = new JTextField();

    centreleft_5_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_5_top_textfield_next_taxable1 = new JTextField();

    centreleft_5_top_add = new JButton("Add");

    centreleft_5_top_add.addActionListener(e
            -> {
        if (!centreleft_5_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[4] = Integer.parseInt(centreleft_5_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_5_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[4] = Integer.parseInt(centreleft_5_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[4], leftpart2[4]);
        centreleft_5_top_textfield.setText(Integer.toString(sum));
        centreleft_5_top_textfield.setEnabled(true);
        centreleft_5_top_upper.setVisible(false);
        centreleft_5_top_middle.setVisible(false);
    });

    centreleft_5_top_upper.add(Box.createVerticalStrut(20));
    centreleft_5_top_upper.add(centreleft_5_top_label_next_exampted1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_exampted1);
    centreleft_5_top_upper.add(Box.createVerticalStrut(20));

    centreleft_5_top_upper.add(centreleft_5_top_label_next_taxable1);
    centreleft_5_top_upper.add(centreleft_5_top_textfield_next_taxable1);
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
    centreleft_6_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_6_top_textfield_next_exampted1 = new JTextField();

    centreleft_6_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_6_top_textfield_next_taxable1 = new JTextField();

    centreleft_6_top_add = new JButton("Add");

    centreleft_6_top_add.addActionListener(e
            -> {
        if (!centreleft_6_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[5] = Integer.parseInt(centreleft_6_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_6_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[5] = Integer.parseInt(centreleft_6_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[5], leftpart2[5]);
        centreleft_6_top_textfield.setText(Integer.toString(sum));
        centreleft_6_top_textfield.setEnabled(true);
        centreleft_6_top_upper.setVisible(false);
        centreleft_6_top_middle.setVisible(false);
    });

    centreleft_6_top_upper.add(Box.createVerticalStrut(20));
    centreleft_6_top_upper.add(centreleft_6_top_label_next_exampted1);
    centreleft_6_top_upper.add(centreleft_6_top_textfield_next_exampted1);
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));

    centreleft_6_top_upper.add(centreleft_6_top_label_next_taxable1);
    centreleft_6_top_upper.add(centreleft_6_top_textfield_next_taxable1);
    centreleft_6_top_upper.add(Box.createVerticalStrut(20));

    centreleft_6_top_middle.add(centreleft_6_top_add);
    mainbody.revalidate();

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
    centreleft_7_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreleft_7_top_textfield_next_exampted1 = new JTextField();

    centreleft_7_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
    centreleft_7_top_textfield_next_taxable1 = new JTextField();

    centreleft_7_top_add = new JButton("Add");

    centreleft_7_top_add.addActionListener(e
            -> {
        if (!centreleft_7_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[6] = Integer.parseInt(centreleft_7_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_7_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[6] = Integer.parseInt(centreleft_7_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[6], leftpart2[6]);
        centreleft_7_top_textfield.setText(Integer.toString(sum));
        centreleft_7_top_textfield.setEnabled(true);
        centreleft_7_top_upper.setVisible(false);
        centreleft_7_top_middle.setVisible(false);
    });

    centreleft_7_top_upper.add(Box.createVerticalStrut(20));
    centreleft_7_top_upper.add(centreleft_7_top_label_next_exampted1);
    centreleft_7_top_upper.add(centreleft_7_top_textfield_next_exampted1);
    centreleft_7_top_upper.add(Box.createVerticalStrut(20));

    centreleft_7_top_upper.add(centreleft_7_top_label_next_taxable1);
    centreleft_7_top_upper.add(centreleft_7_top_textfield_next_taxable1);
    centreleft_7_top_upper.add(Box.createVerticalStrut(20));

    centreleft_7_top_middle.add(centreleft_7_top_add);
    mainbody.revalidate();

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
        if (!centreleft_8_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[7] = Integer.parseInt(centreleft_8_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_8_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[7] = Integer.parseInt(centreleft_8_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[7], leftpart2[7]);
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
        if (!centreleft_9_top_textfield_next_exampted1.getText().isEmpty()) {
            leftpart1[8] = Integer.parseInt(centreleft_9_top_textfield_next_exampted1.getText());
        }
        if (!centreleft_9_top_textfield_next_taxable1.getText().isEmpty()) {
            leftpart2[8] = Integer.parseInt(centreleft_9_top_textfield_next_taxable1.getText());
        }

        int sum = adddetails_add(leftpart1[8], leftpart2[8]);
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

    addrightcontent();

}

public void addrightcontent() {
    centreright_1_top_box = new BoxLayout(centreright_1_top, BoxLayout.Y_AXIS);
    centreright_1_top.setLayout(centreright_1_top_box);
    centreright_1_top_label = new JLabel("Education Allowance:                                ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top_textfield.setEnabled(false);
    centreright_1_top_adddetail = new JButton("Add Detail");
    adddetailupdate[9] = new JButton("Add Detaile");
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);
    centreright_1_top.add(centreright_1_top_adddetail);
    centreright_1_top.add(adddetailupdate[9]);
    adddetailupdate[9].setVisible(false);
    centreright_1_top_adddetail.addActionListener(e -> adddetails_right_1());

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Bonus / Ex-gratia1:                                     ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top_textfield.setEnabled(false);
    centreright_2_top_adddetail = new JButton("Add Detail");
    adddetailupdate[10] = new JButton("Add Detail");
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);
    centreright_2_top.add(centreright_2_top_adddetail);
    centreright_2_top.add(adddetailupdate[10]);
    adddetailupdate[10].setVisible(false);
    centreright_2_top_adddetail.addActionListener(e -> adddetails_right_2());

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Other Allowance:                                   ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top_textfield.setEnabled(false);
    centreright_3_top_adddetail = new JButton("Add Detail");
    adddetailupdate[11] = new JButton("Add Detail");
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);
    centreright_3_top.add(centreright_3_top_adddetail);
    centreright_3_top.add(adddetailupdate[11]);
    adddetailupdate[11].setVisible(false);
    centreright_3_top_adddetail.addActionListener(e -> adddetails_right_3());
    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Employer's Contribution to recognized Provident Fund:                                    ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top_textfield.setEnabled(false);
    centreright_4_top_adddetail = new JButton("Add Detail");
    adddetailupdate[12] = new JButton("Add Detail");
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);
    centreright_4_top.add(centreright_4_top_adddetail);
    centreright_4_top.add(adddetailupdate[12]);
    adddetailupdate[12].setVisible(false);
    centreright_4_top_adddetail.addActionListener(e -> adddetails_right_4());
    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Interest accrued on Recognized Provident Fund:                                ");
    centreright_5_top_textfield = new JTextField();
    centreright_5_top_textfield.setEnabled(false);
    centreright_5_top_adddetail = new JButton("Add Detail");
    adddetailupdate[13] = new JButton("Add Detail");
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(centreright_5_top_textfield);
    centreright_5_top.add(centreright_5_top_adddetail);
    centreright_5_top.add(adddetailupdate[13]);
    adddetailupdate[13].setVisible(false);
    centreright_5_top_adddetail.addActionListener(e -> adddetails_right_5());
    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel(" Deemed income for transport facility:                              ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top_textfield.setEnabled(false);
    centreright_6_top_adddetail = new JButton("Add Detail");
    adddetailupdate[14] = new JButton("Add Detail");
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);
    centreright_6_top.add(centreright_6_top_adddetail);
    centreright_6_top.add(adddetailupdate[14]);
    adddetailupdate[14].setVisible(false);
    centreright_6_top_adddetail.addActionListener(e -> adddetails_right_6());
    //7
    centreright_7_top_box = new BoxLayout(centreright_7_top, BoxLayout.Y_AXIS);
    centreright_7_top.setLayout(centreright_7_top_box);
    centreright_7_top_label = new JLabel("Deemed income for free furnished/unfurnished accommodation                               ");
    centreright_7_top_textfield = new JTextField();
    centreright_7_top_textfield.setEnabled(false);
    centreright_7_top_adddetail = new JButton("Add Detail");
    adddetailupdate[15] = new JButton("Add Detail");
    centreright_7_top.add(centreright_7_top_label);
    centreright_7_top.add(centreright_7_top_textfield);
    centreright_7_top.add(centreright_7_top_adddetail);
    centreright_7_top.add(adddetailupdate[15]);
    adddetailupdate[15].setVisible(false);
    centreright_7_top_adddetail.addActionListener(e -> adddetails_right_7());
    //8
    centreright_8_top_box = new BoxLayout(centreright_8_top, BoxLayout.Y_AXIS);
    centreright_8_top.setLayout(centreright_8_top_box);
    centreright_8_top_label = new JLabel(" other,if any(give detail):                                 ");
    centreright_8_top_textfield = new JTextField();
    centreright_8_top_textfield.setEnabled(false);
    centreright_8_top_adddetail = new JButton("Add Detail");
    adddetailupdate[16] = new JButton("Add Detail");
    centreright_8_top.add(centreright_8_top_label);
    centreright_8_top.add(centreright_8_top_textfield);
    centreright_8_top.add(centreright_8_top_adddetail);
    centreright_8_top.add(adddetailupdate[16]);
    adddetailupdate[16].setVisible(false);
    centreright_8_top_adddetail.addActionListener(e -> adddetails_right_8());
    //9
    centreright_9_top_box = new BoxLayout(centreright_9_top, BoxLayout.Y_AXIS);
    centreright_9_top.setLayout(centreright_9_top_box);
    centreright_9_top_label = new JLabel("Net taxable income from salary:                                     ");
    centreright_9_top_textfield = new JTextField();
    centreright_9_top_textfield.setEnabled(false);
    centreright_9_top_adddetail = new JButton("Add Details");
    adddetailupdate[17] = new JButton("Add Detail");
    centreright_9_top_adddetail.setEnabled(false);
    centreright_9_top.add(centreright_9_top_label);
    centreright_9_top.add(centreright_9_top_textfield);
    centreright_9_top.add(centreright_9_top_adddetail);
    centreright_9_top_adddetail.addActionListener(e -> adddetails_right_9());

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
    centreright_1_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_1_top_textfield_next_exampted1 = new JTextField();
    centreright_1_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_1_top_textfield_next_taxable2 = new JTextField();

    centreright_1_top_add = new JButton("Add");

    centreright_1_top_add.addActionListener(e
            -> {
        if (!centreright_1_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[0] = Integer.parseInt(centreright_1_top_textfield_next_exampted1.getText());
        }
        if (!centreright_1_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[0] = Integer.parseInt(centreright_1_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[0], rightpart2[0]);
        centreright_1_top_textfield.setText(Integer.toString(sum));
        centreright_1_top_textfield.setEnabled(true);
        centreright_1_top_upper.setVisible(false);
        centreright_1_top_middle.setVisible(false);
    });

    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_upper.add(centreright_1_top_label_next_exampted1);
    centreright_1_top_upper.add(centreright_1_top_textfield_next_exampted1);
    centreright_1_top_upper.add(Box.createVerticalStrut(20));
    centreright_1_top_upper.add(centreright_1_top_label_next_taxable2);
    centreright_1_top_upper.add(centreright_1_top_textfield_next_taxable2);
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
    centreright_2_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_2_top_textfield_next_exampted1 = new JTextField();
    centreright_2_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_2_top_textfield_next_taxable2 = new JTextField();

    centreright_2_top_add = new JButton("Add");

    centreright_2_top_add.addActionListener(e
            -> {
        if (!centreright_2_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[1] = Integer.parseInt(centreright_2_top_textfield_next_exampted1.getText());
        }
        if (!centreright_2_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[1] = Integer.parseInt(centreright_2_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[1], rightpart2[1]);
        centreright_2_top_textfield.setText(Integer.toString(sum));
        centreright_2_top_textfield.setEnabled(true);
        centreright_2_top_upper.setVisible(false);
        centreright_2_top_middle.setVisible(false);
    });

    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_exampted1);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_exampted1);
    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_taxable2);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_taxable2);
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
    centreright_3_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_3_top_textfield_next_exampted1 = new JTextField();
    centreright_3_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_3_top_textfield_next_taxable2 = new JTextField();

    centreright_3_top_add = new JButton("Add");

    centreright_3_top_add.addActionListener(e
            -> {
        if (!centreright_3_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[2] = Integer.parseInt(centreright_3_top_textfield_next_exampted1.getText());
        }
        if (!centreright_3_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[2] = Integer.parseInt(centreright_3_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[2], rightpart2[2]);
        centreright_3_top_textfield.setText(Integer.toString(sum));
        centreright_3_top_textfield.setEnabled(true);
        centreright_3_top_upper.setVisible(false);
        centreright_3_top_middle.setVisible(false);
    });

    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_exampted1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_exampted1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_taxable2);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_taxable2);
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
    centreright_4_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_4_top_textfield_next_exampted1 = new JTextField();
    centreright_4_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_4_top_textfield_next_taxable2 = new JTextField();

    centreright_4_top_add = new JButton("Add");

    centreright_4_top_add.addActionListener(e
            -> {
        if (!centreright_4_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[3] = Integer.parseInt(centreright_4_top_textfield_next_exampted1.getText());
        }
        if (!centreright_4_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[3] = Integer.parseInt(centreright_4_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[3], rightpart2[3]);
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

public void adddetails_right_5() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_5_top_upper = new JPanel();
    centreright_5_top_box_upper = new BoxLayout(centreright_5_top_upper, BoxLayout.Y_AXIS);
    centreright_5_top_upper.setLayout(centreright_5_top_box_upper);

    centreright_5_top_middle = new JPanel();
    centreright_5_top_middle.setBackground(Color.green);

    centreright_5_top.add(centreright_5_top_upper, BorderLayout.NORTH);
    centreright_5_top.add(centreright_5_top_middle, BorderLayout.CENTER);
    centreright_5_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_5_top_textfield_next_exampted1 = new JTextField();
    centreright_5_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_5_top_textfield_next_taxable2 = new JTextField();

    centreright_5_top_add = new JButton("Add");

    centreright_5_top_add.addActionListener(e
            -> {
        if (!centreright_5_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[4] = Integer.parseInt(centreright_5_top_textfield_next_exampted1.getText());
        }
        if (!centreright_5_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[4] = Integer.parseInt(centreright_5_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[4], rightpart2[4]);
        centreright_5_top_textfield.setText(Integer.toString(sum));
        centreright_5_top_textfield.setEnabled(true);
        centreright_5_top_upper.setVisible(false);
        centreright_5_top_middle.setVisible(false);
    });

    centreright_5_top_upper.add(Box.createVerticalStrut(20));
    centreright_5_top_upper.add(centreright_5_top_label_next_exampted1);
    centreright_5_top_upper.add(centreright_5_top_textfield_next_exampted1);
    centreright_5_top_upper.add(Box.createVerticalStrut(20));
    centreright_5_top_upper.add(centreright_5_top_label_next_taxable2);
    centreright_5_top_upper.add(centreright_5_top_textfield_next_taxable2);
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
    centreright_6_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_6_top_textfield_next_exampted1 = new JTextField();
    centreright_6_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_6_top_textfield_next_taxable2 = new JTextField();

    centreright_6_top_add = new JButton("Add");

    centreright_6_top_add.addActionListener(e
            -> {
        if (!centreright_6_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[5] = Integer.parseInt(centreright_6_top_textfield_next_exampted1.getText());
        }
        if (!centreright_6_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[5] = Integer.parseInt(centreright_6_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[5], rightpart2[5]);
        centreright_6_top_textfield.setText(Integer.toString(sum));
        centreright_6_top_textfield.setEnabled(true);
        centreright_6_top_upper.setVisible(false);
        centreright_6_top_middle.setVisible(false);
    });

    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_label_next_exampted1);
    centreright_6_top_upper.add(centreright_6_top_textfield_next_exampted1);
    centreright_6_top_upper.add(Box.createVerticalStrut(20));
    centreright_6_top_upper.add(centreright_6_top_label_next_taxable2);
    centreright_6_top_upper.add(centreright_6_top_textfield_next_taxable2);
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
    centreright_7_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_7_top_textfield_next_exampted1 = new JTextField();
    centreright_7_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_7_top_textfield_next_taxable2 = new JTextField();

    centreright_7_top_add = new JButton("Add");

    centreright_7_top_add.addActionListener(e
            -> {
        if (!centreright_7_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[6] = Integer.parseInt(centreright_7_top_textfield_next_exampted1.getText());
        }
        if (!centreright_7_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[6] = Integer.parseInt(centreright_7_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[6], rightpart2[6]);
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

public void adddetails_right_8() {
    //centreleft_1_top.setLayout(new BorderLayout());
    centreright_8_top_upper = new JPanel();
    centreright_8_top_box_upper = new BoxLayout(centreright_8_top_upper, BoxLayout.Y_AXIS);
    centreright_8_top_upper.setLayout(centreright_8_top_box_upper);

    centreright_8_top_middle = new JPanel();
    centreright_8_top_middle.setBackground(Color.green);

    centreright_8_top.add(centreright_8_top_upper, BorderLayout.NORTH);
    centreright_8_top.add(centreright_8_top_middle, BorderLayout.CENTER);
    centreright_8_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_8_top_textfield_next_exampted1 = new JTextField();
    centreright_8_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_8_top_textfield_next_taxable2 = new JTextField();

    centreright_8_top_add = new JButton("Add");

    centreright_8_top_add.addActionListener(e
            -> {
        if (!centreright_8_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[7] = Integer.parseInt(centreright_8_top_textfield_next_exampted1.getText());
        }
        if (!centreright_8_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[7] = Integer.parseInt(centreright_8_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[7], rightpart2[7]);
        centreright_8_top_textfield.setText(Integer.toString(sum));
        centreright_8_top_textfield.setEnabled(true);
        centreright_8_top_upper.setVisible(false);
        centreright_8_top_middle.setVisible(false);
    });

    centreright_8_top_upper.add(Box.createVerticalStrut(20));
    centreright_8_top_upper.add(centreright_8_top_label_next_exampted1);
    centreright_8_top_upper.add(centreright_8_top_textfield_next_exampted1);
    centreright_8_top_upper.add(Box.createVerticalStrut(20));
    centreright_8_top_upper.add(centreright_8_top_label_next_taxable2);
    centreright_8_top_upper.add(centreright_8_top_textfield_next_taxable2);
    centreright_8_top_upper.add(Box.createVerticalStrut(20));
    centreright_8_top_middle.add(centreright_8_top_add);
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
    centreright_9_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
    centreright_9_top_textfield_next_exampted1 = new JTextField();
    centreright_9_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
    centreright_9_top_textfield_next_taxable2 = new JTextField();

    centreright_9_top_add = new JButton("Add");

    centreright_9_top_add.addActionListener(e
            -> {
        if (!centreright_9_top_textfield_next_exampted1.getText().isEmpty()) {
            rightpart1[8] = Integer.parseInt(centreright_9_top_textfield_next_exampted1.getText());
        }
        if (!centreright_9_top_textfield_next_taxable2.getText().isEmpty()) {
            rightpart2[8] = Integer.parseInt(centreright_9_top_textfield_next_taxable2.getText());
        }

        int sum = adddetails_add(rightpart1[8], rightpart2[8]);
        centreright_9_top_textfield.setText(Integer.toString(sum));
        centreright_9_top_textfield.setEnabled(true);
        centreright_9_top_upper.setVisible(false);
        centreright_9_top_middle.setVisible(false);
    });

    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_exampted1);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_exampted1);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_taxable2);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_taxable2);
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

    jj = new JButton("                       Submitted                          ");
    update = new JButton("                       Update                          ");
    bottom_top.add(jj);
    bottom_top.add(update);
    update.setVisible(false);
    jj.addActionListener(e -> adddetails_submit());

}

public void adddetails_submit() {
    try {
        conn.Salary(NIN, leftpart1[0], leftpart2[0], leftpart1[1], leftpart2[1], leftpart1[2], leftpart2[2], leftpart1[3], leftpart2[3], leftpart1[4], leftpart2[4], leftpart1[5], leftpart2[5], leftpart1[6], leftpart2[6], leftpart1[7], leftpart2[7], leftpart1[8], leftpart2[8], rightpart1[0], rightpart2[0], rightpart1[1], rightpart2[1], rightpart1[2], rightpart2[2], rightpart1[3], rightpart2[3], rightpart1[4], rightpart2[4], rightpart1[5], rightpart2[5], rightpart1[6], rightpart2[6], rightpart1[7], rightpart2[7],ayear);
        Form hh = new Form();
        hh.accessnin(NIN,ayear);
        hh.setVisible(true);
        dispose();
    } catch (Exception e) {
        System.out.println(e.toString());
    }

}

public void bottom() {

    for (int i = 0; i < 8; i++) {
    }

}

public void update(long text,int ayear) throws ClassNotFoundException, SQLException, JSONException {
    salary1 = conn.SALARYRETURN(text,ayear);
    centreleft_1_top_adddetail.setVisible(false);
    centreleft_2_top_adddetail.setVisible(false);
    centreleft_3_top_adddetail.setVisible(false);
    centreleft_4_top_adddetail.setVisible(false);
    centreleft_5_top_adddetail.setVisible(false);
    centreleft_6_top_adddetail.setVisible(false);
    centreleft_7_top_adddetail.setVisible(false);
    centreleft_8_top_adddetail.setVisible(false);
    centreleft_9_top_adddetail.setVisible(false);
    centreright_1_top_adddetail.setVisible(false);
    centreright_2_top_adddetail.setVisible(false);
    centreright_3_top_adddetail.setVisible(false);
    centreright_4_top_adddetail.setVisible(false);
    centreright_5_top_adddetail.setVisible(false);
    centreright_6_top_adddetail.setVisible(false);
    centreright_7_top_adddetail.setVisible(false);
    centreright_8_top_adddetail.setVisible(false);
    jj.setVisible(false);
    update.setVisible(true);

    int h = 0;
    for (int i = 0; i < 17; i++) {
        json = new JSONObject(salary1[i + 1]);

        if (i < 9) {
            leftpart1[i] = Integer.parseInt(json.getString("EXIN"));
            leftpart2[i] = Integer.parseInt(json.getString("NETTAXIN"));
        } else {
            rightpart1[h] = Integer.parseInt(json.getString("EXIN"));
            rightpart2[h] = Integer.parseInt(json.getString("NETTAXIN"));
            h++;
        }

        adddetailupdate[i].setVisible(true);
    }

    adddetailupdate[0].addActionListener(e -> {

        try {
            json = new JSONObject(salary1[1]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_1_top_upper = new JPanel();
        centreleft_1_top_box_upper = new BoxLayout(centreleft_1_top_upper, BoxLayout.Y_AXIS);
        centreleft_1_top_upper.setLayout(centreleft_1_top_box_upper);

        centreleft_1_top_middle = new JPanel();
        centreleft_1_top_middle.setBackground(Color.green);

        centreleft_1_top.add(centreleft_1_top_upper, BorderLayout.NORTH);
        centreleft_1_top.add(centreleft_1_top_middle, BorderLayout.CENTER);
        centreleft_1_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_1_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_1_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_1_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_1_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_1_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_1_top_add = new JButton("Add");
        centreleft_1_top_add.addActionListener(f
                -> {
            if (!centreleft_1_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[0] = Integer.parseInt(centreleft_1_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_1_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[0] = Integer.parseInt(centreleft_1_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[0], leftpart2[0]);

            centreleft_1_top_textfield.setText(Integer.toString(sum));
            centreleft_1_top_textfield.setEnabled(true);
            centreleft_1_top_upper.setVisible(false);
            centreleft_1_top_middle.setVisible(false);
        });

        centreleft_1_top_upper.add(Box.createVerticalStrut(20));
        centreleft_1_top_upper.add(centreleft_1_top_label_next_exampted1);
        centreleft_1_top_upper.add(centreleft_1_top_textfield_next_exampted1);
        centreleft_1_top_upper.add(Box.createVerticalStrut(20));

        centreleft_1_top_upper.add(centreleft_1_top_label_next_taxable1);
        centreleft_1_top_upper.add(centreleft_1_top_textfield_next_taxable1);
        centreleft_1_top_upper.add(Box.createVerticalStrut(20));

        centreleft_1_top_middle.add(centreleft_1_top_add);
        mainbody.revalidate();

    });

    adddetailupdate[1].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[2]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_2_top_upper = new JPanel();
        centreleft_2_top_box_upper = new BoxLayout(centreleft_2_top_upper, BoxLayout.Y_AXIS);
        centreleft_2_top_upper.setLayout(centreleft_2_top_box_upper);

        centreleft_2_top_middle = new JPanel();
        centreleft_2_top_middle.setBackground(Color.green);

        centreleft_2_top.add(centreleft_2_top_upper, BorderLayout.NORTH);
        centreleft_2_top.add(centreleft_2_top_middle, BorderLayout.CENTER);
        centreleft_2_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_2_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_2_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_2_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_2_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_2_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_2_top_add = new JButton("Add");
        centreleft_2_top_add.addActionListener(f
                -> {
            if (!centreleft_2_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[1] = Integer.parseInt(centreleft_2_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_2_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[1] = Integer.parseInt(centreleft_2_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[1], leftpart2[1]);
            centreleft_2_top_textfield.setText(Integer.toString(sum));
            centreleft_2_top_textfield.setEnabled(true);
            centreleft_2_top_upper.setVisible(false);
            centreleft_2_top_middle.setVisible(false);
        });
        centreleft_2_top_upper.add(Box.createVerticalStrut(20));
        centreleft_2_top_upper.add(centreleft_2_top_label_next_exampted1);
        centreleft_2_top_upper.add(centreleft_2_top_textfield_next_exampted1);
        centreleft_2_top_upper.add(Box.createVerticalStrut(20));

        centreleft_2_top_upper.add(centreleft_2_top_label_next_taxable1);
        centreleft_2_top_upper.add(centreleft_2_top_textfield_next_taxable1);
        centreleft_2_top_upper.add(Box.createVerticalStrut(20));

        centreleft_2_top_middle.add(centreleft_2_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[2].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[3]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_3_top_upper = new JPanel();
        centreleft_3_top_box_upper = new BoxLayout(centreleft_3_top_upper, BoxLayout.Y_AXIS);
        centreleft_3_top_upper.setLayout(centreleft_3_top_box_upper);

        centreleft_3_top_middle = new JPanel();
        centreleft_3_top_middle.setBackground(Color.green);

        centreleft_3_top.add(centreleft_3_top_upper, BorderLayout.NORTH);
        centreleft_3_top.add(centreleft_3_top_middle, BorderLayout.CENTER);
        centreleft_3_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_3_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_3_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_3_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_3_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_3_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_3_top_add = new JButton("Add");

        centreleft_3_top_add.addActionListener(f
                -> {
            if (!centreleft_3_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[2] = Integer.parseInt(centreleft_3_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_3_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[2] = Integer.parseInt(centreleft_3_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[2], leftpart2[2]);
            centreleft_3_top_textfield.setText(Integer.toString(sum));
            centreleft_3_top_textfield.setEnabled(true);
            centreleft_3_top_upper.setVisible(false);
            centreleft_3_top_middle.setVisible(false);
        });

        centreleft_3_top_upper.add(Box.createVerticalStrut(20));
        centreleft_3_top_upper.add(centreleft_3_top_label_next_exampted1);
        centreleft_3_top_upper.add(centreleft_3_top_textfield_next_exampted1);
        centreleft_3_top_upper.add(Box.createVerticalStrut(20));

        centreleft_3_top_upper.add(centreleft_3_top_label_next_taxable1);
        centreleft_3_top_upper.add(centreleft_3_top_textfield_next_taxable1);
        centreleft_3_top_upper.add(Box.createVerticalStrut(20));

        centreleft_3_top_middle.add(centreleft_3_top_add);
        mainbody.revalidate();

    });

    adddetailupdate[3].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[4]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_4_top_upper = new JPanel();
        centreright_4_top_box_upper = new BoxLayout(centreright_4_top_upper, BoxLayout.Y_AXIS);
        centreright_4_top_upper.setLayout(centreright_4_top_box_upper);

        centreright_4_top_middle = new JPanel();
        centreright_4_top_middle.setBackground(Color.green);

        centreright_4_top.add(centreright_4_top_upper, BorderLayout.NORTH);
        centreright_4_top.add(centreright_4_top_middle, BorderLayout.CENTER);
        centreright_4_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_4_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_4_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_4_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_4_top_textfield_next_taxable2 = new JTextField();
        try {
            centreleft_4_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_4_top_add = new JButton("Add");

        centreright_4_top_add.addActionListener(f
                -> {
            if (!centreright_4_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[3] = Integer.parseInt(centreright_4_top_textfield_next_exampted1.getText());
            }
            if (!centreright_4_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[3] = Integer.parseInt(centreright_4_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[3], rightpart2[3]);
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

    });
    adddetailupdate[4].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[5]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_5_top_upper = new JPanel();
        centreleft_5_top_box_upper = new BoxLayout(centreleft_5_top_upper, BoxLayout.Y_AXIS);
        centreleft_5_top_upper.setLayout(centreleft_5_top_box_upper);

        centreleft_5_top_middle = new JPanel();
        centreleft_5_top_middle.setBackground(Color.green);

        centreleft_5_top.add(centreleft_5_top_upper, BorderLayout.NORTH);
        centreleft_5_top.add(centreleft_5_top_middle, BorderLayout.CENTER);
        centreleft_5_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_5_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_5_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_5_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_5_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_5_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_5_top_add = new JButton("Add");

        centreleft_5_top_add.addActionListener(f
                -> {
            if (!centreleft_5_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[4] = Integer.parseInt(centreleft_5_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_5_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[4] = Integer.parseInt(centreleft_5_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[4], leftpart2[4]);
            centreleft_5_top_textfield.setText(Integer.toString(sum));
            centreleft_5_top_textfield.setEnabled(true);
            centreleft_5_top_upper.setVisible(false);
            centreleft_5_top_middle.setVisible(false);
        });

        centreleft_5_top_upper.add(Box.createVerticalStrut(20));
        centreleft_5_top_upper.add(centreleft_5_top_label_next_exampted1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_exampted1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_upper.add(centreleft_5_top_label_next_taxable1);
        centreleft_5_top_upper.add(centreleft_5_top_textfield_next_taxable1);
        centreleft_5_top_upper.add(Box.createVerticalStrut(20));

        centreleft_5_top_middle.add(centreleft_5_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[5].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[6]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_6_top_upper = new JPanel();
        centreleft_6_top_box_upper = new BoxLayout(centreleft_6_top_upper, BoxLayout.Y_AXIS);
        centreleft_6_top_upper.setLayout(centreleft_6_top_box_upper);

        centreleft_6_top_middle = new JPanel();
        centreleft_6_top_middle.setBackground(Color.green);

        centreleft_6_top.add(centreleft_6_top_upper, BorderLayout.NORTH);
        centreleft_6_top.add(centreleft_6_top_middle, BorderLayout.CENTER);
        centreleft_6_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_6_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_6_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_6_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_6_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_6_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_6_top_add = new JButton("Add");

        centreleft_6_top_add.addActionListener(f
                -> {
            if (!centreleft_6_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[5] = Integer.parseInt(centreleft_6_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_6_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[5] = Integer.parseInt(centreleft_6_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[5], leftpart2[5]);
            centreleft_6_top_textfield.setText(Integer.toString(sum));
            centreleft_6_top_textfield.setEnabled(true);
            centreleft_6_top_upper.setVisible(false);
            centreleft_6_top_middle.setVisible(false);
        });

        centreleft_6_top_upper.add(Box.createVerticalStrut(20));
        centreleft_6_top_upper.add(centreleft_6_top_label_next_exampted1);
        centreleft_6_top_upper.add(centreleft_6_top_textfield_next_exampted1);
        centreleft_6_top_upper.add(Box.createVerticalStrut(20));

        centreleft_6_top_upper.add(centreleft_6_top_label_next_taxable1);
        centreleft_6_top_upper.add(centreleft_6_top_textfield_next_taxable1);
        centreleft_6_top_upper.add(Box.createVerticalStrut(20));

        centreleft_6_top_middle.add(centreleft_6_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[6].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[7]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_7_top_upper = new JPanel();
        centreleft_7_top_box_upper = new BoxLayout(centreleft_7_top_upper, BoxLayout.Y_AXIS);
        centreleft_7_top_upper.setLayout(centreleft_7_top_box_upper);

        centreleft_7_top_middle = new JPanel();
        centreleft_7_top_middle.setBackground(Color.green);

        centreleft_7_top.add(centreleft_7_top_upper, BorderLayout.NORTH);
        centreleft_7_top.add(centreleft_7_top_middle, BorderLayout.CENTER);
        centreleft_7_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_7_top_textfield_next_exampted1 = new JTextField();

        try {
            centreleft_7_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_7_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_7_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_7_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_7_top_add = new JButton("Add");

        centreleft_7_top_add.addActionListener(f
                -> {
            if (!centreleft_7_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[6] = Integer.parseInt(centreleft_7_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_7_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[6] = Integer.parseInt(centreleft_7_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[6], leftpart2[6]);
            centreleft_7_top_textfield.setText(Integer.toString(sum));
            centreleft_7_top_textfield.setEnabled(true);
            centreleft_7_top_upper.setVisible(false);
            centreleft_7_top_middle.setVisible(false);
        });

        centreleft_7_top_upper.add(Box.createVerticalStrut(20));
        centreleft_7_top_upper.add(centreleft_7_top_label_next_exampted1);
        centreleft_7_top_upper.add(centreleft_7_top_textfield_next_exampted1);
        centreleft_7_top_upper.add(Box.createVerticalStrut(20));

        centreleft_7_top_upper.add(centreleft_7_top_label_next_taxable1);
        centreleft_7_top_upper.add(centreleft_7_top_textfield_next_taxable1);
        centreleft_7_top_upper.add(Box.createVerticalStrut(20));

        centreleft_7_top_middle.add(centreleft_7_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[7].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[8]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_8_top_upper = new JPanel();
        centreleft_8_top_box_upper = new BoxLayout(centreleft_8_top_upper, BoxLayout.Y_AXIS);
        centreleft_8_top_upper.setLayout(centreleft_8_top_box_upper);

        centreleft_8_top_middle = new JPanel();
        centreleft_8_top_middle.setBackground(Color.green);

        centreleft_8_top.add(centreleft_8_top_upper, BorderLayout.NORTH);
        centreleft_8_top.add(centreleft_8_top_middle, BorderLayout.CENTER);
        centreleft_8_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_8_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_8_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_8_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_8_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_8_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_8_top_add = new JButton("Add");

        centreleft_8_top_add.addActionListener(f
                -> {
            if (!centreleft_8_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[7] = Integer.parseInt(centreleft_8_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_8_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[7] = Integer.parseInt(centreleft_8_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[7], leftpart2[7]);
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
    });
    adddetailupdate[8].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[9]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_9_top_upper = new JPanel();
        centreleft_9_top_box_upper = new BoxLayout(centreleft_9_top_upper, BoxLayout.Y_AXIS);
        centreleft_9_top_upper.setLayout(centreleft_9_top_box_upper);

        centreleft_9_top_middle = new JPanel();
        centreleft_9_top_middle.setBackground(Color.green);

        centreleft_9_top.add(centreleft_9_top_upper, BorderLayout.NORTH);
        centreleft_9_top.add(centreleft_9_top_middle, BorderLayout.CENTER);
        centreleft_9_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreleft_9_top_textfield_next_exampted1 = new JTextField();
        try {
            centreleft_9_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreleft_9_top_label_next_taxable1 = new JLabel("Net Taxable Income(Tk):                                     ");
        centreleft_9_top_textfield_next_taxable1 = new JTextField();
        try {
            centreleft_9_top_textfield_next_taxable1.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreleft_9_top_add = new JButton("Add");

        centreleft_9_top_add.addActionListener(f
                -> {
            if (!centreleft_9_top_textfield_next_exampted1.getText().isEmpty()) {
                leftpart1[8] = Integer.parseInt(centreleft_9_top_textfield_next_exampted1.getText());
            }
            if (!centreleft_9_top_textfield_next_taxable1.getText().isEmpty()) {
                leftpart2[8] = Integer.parseInt(centreleft_9_top_textfield_next_taxable1.getText());
            }

            int sum = adddetails_add(leftpart1[8], leftpart2[8]);
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

    });

    //right part
    adddetailupdate[9].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[10]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_1_top_upper = new JPanel();
        centreright_1_top_box_upper = new BoxLayout(centreright_1_top_upper, BoxLayout.Y_AXIS);
        centreright_1_top_upper.setLayout(centreright_1_top_box_upper);

        centreright_1_top_middle = new JPanel();
        centreright_1_top_middle.setBackground(Color.green);

        centreright_1_top.add(centreright_1_top_upper, BorderLayout.NORTH);
        centreright_1_top.add(centreright_1_top_middle, BorderLayout.CENTER);
        centreright_1_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_1_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_1_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_1_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_1_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_1_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_1_top_add = new JButton("Add");

        centreright_1_top_add.addActionListener(f
                -> {
            if (!centreright_1_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[0] = Integer.parseInt(centreright_1_top_textfield_next_exampted1.getText());
            }
            if (!centreright_1_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[0] = Integer.parseInt(centreright_1_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[0], rightpart2[0]);
            centreright_1_top_textfield.setText(Integer.toString(sum));
            centreright_1_top_textfield.setEnabled(true);
            centreright_1_top_upper.setVisible(false);
            centreright_1_top_middle.setVisible(false);
        });

        centreright_1_top_upper.add(Box.createVerticalStrut(20));
        centreright_1_top_upper.add(centreright_1_top_label_next_exampted1);
        centreright_1_top_upper.add(centreright_1_top_textfield_next_exampted1);
        centreright_1_top_upper.add(Box.createVerticalStrut(20));
        centreright_1_top_upper.add(centreright_1_top_label_next_taxable2);
        centreright_1_top_upper.add(centreright_1_top_textfield_next_taxable2);
        centreright_1_top_upper.add(Box.createVerticalStrut(20));
        centreright_1_top_middle.add(centreright_1_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[10].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[11]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_2_top_upper = new JPanel();
        centreright_2_top_box_upper = new BoxLayout(centreright_2_top_upper, BoxLayout.Y_AXIS);
        centreright_2_top_upper.setLayout(centreright_2_top_box_upper);

        centreright_2_top_middle = new JPanel();
        centreright_2_top_middle.setBackground(Color.green);

        centreright_2_top.add(centreright_2_top_upper, BorderLayout.NORTH);
        centreright_2_top.add(centreright_2_top_middle, BorderLayout.CENTER);
        centreright_2_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_2_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_2_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_2_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_2_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_2_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_2_top_add = new JButton("Add");

        centreright_2_top_add.addActionListener(f
                -> {
            if (!centreright_2_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[1] = Integer.parseInt(centreright_2_top_textfield_next_exampted1.getText());
            }
            if (!centreright_2_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[1] = Integer.parseInt(centreright_2_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[1], rightpart2[1]);
            centreright_2_top_textfield.setText(Integer.toString(sum));
            centreright_2_top_textfield.setEnabled(true);
            centreright_2_top_upper.setVisible(false);
            centreright_2_top_middle.setVisible(false);
        });

        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_exampted1);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_exampted1);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_taxable2);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_taxable2);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_middle.add(centreright_2_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[11].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[12]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_3_top_upper = new JPanel();
        centreright_3_top_box_upper = new BoxLayout(centreright_3_top_upper, BoxLayout.Y_AXIS);
        centreright_3_top_upper.setLayout(centreright_3_top_box_upper);

        centreright_3_top_middle = new JPanel();
        centreright_3_top_middle.setBackground(Color.green);

        centreright_3_top.add(centreright_3_top_upper, BorderLayout.NORTH);
        centreright_3_top.add(centreright_3_top_middle, BorderLayout.CENTER);
        centreright_3_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_3_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_3_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_3_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_3_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_3_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_3_top_add = new JButton("Add");

        centreright_3_top_add.addActionListener(f
                -> {
            if (!centreright_3_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[2] = Integer.parseInt(centreright_3_top_textfield_next_exampted1.getText());
            }
            if (!centreright_3_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[2] = Integer.parseInt(centreright_3_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[2], rightpart2[2]);
            centreright_3_top_textfield.setText(Integer.toString(sum));
            centreright_3_top_textfield.setEnabled(true);
            centreright_3_top_upper.setVisible(false);
            centreright_3_top_middle.setVisible(false);
        });

        centreright_3_top_upper.add(Box.createVerticalStrut(20));
        centreright_3_top_upper.add(centreright_3_top_label_next_exampted1);
        centreright_3_top_upper.add(centreright_3_top_textfield_next_exampted1);
        centreright_3_top_upper.add(Box.createVerticalStrut(20));
        centreright_3_top_upper.add(centreright_3_top_label_next_taxable2);
        centreright_3_top_upper.add(centreright_3_top_textfield_next_taxable2);
        centreright_3_top_upper.add(Box.createVerticalStrut(20));
        centreright_3_top_middle.add(centreright_3_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[12].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[13]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_4_top_upper = new JPanel();
        centreright_4_top_box_upper = new BoxLayout(centreright_4_top_upper, BoxLayout.Y_AXIS);
        centreright_4_top_upper.setLayout(centreright_4_top_box_upper);

        centreright_4_top_middle = new JPanel();
        centreright_4_top_middle.setBackground(Color.green);

        centreright_4_top.add(centreright_4_top_upper, BorderLayout.NORTH);
        centreright_4_top.add(centreright_4_top_middle, BorderLayout.CENTER);
        centreright_4_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_4_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_4_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_4_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_4_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_4_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_4_top_add = new JButton("Add");

        centreright_4_top_add.addActionListener(f
                -> {
            if (!centreright_4_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[3] = Integer.parseInt(centreright_4_top_textfield_next_exampted1.getText());
            }
            if (!centreright_4_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[3] = Integer.parseInt(centreright_4_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[3], rightpart2[3]);
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

    });
    adddetailupdate[13].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[14]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_5_top_upper = new JPanel();
        centreright_5_top_box_upper = new BoxLayout(centreright_5_top_upper, BoxLayout.Y_AXIS);
        centreright_5_top_upper.setLayout(centreright_5_top_box_upper);

        centreright_5_top_middle = new JPanel();
        centreright_5_top_middle.setBackground(Color.green);

        centreright_5_top.add(centreright_5_top_upper, BorderLayout.NORTH);
        centreright_5_top.add(centreright_5_top_middle, BorderLayout.CENTER);
        centreright_5_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_5_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_5_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_5_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_5_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_5_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_5_top_add = new JButton("Add");

        centreright_5_top_add.addActionListener(f
                -> {
            if (!centreright_5_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[4] = Integer.parseInt(centreright_5_top_textfield_next_exampted1.getText());
            }
            if (!centreright_5_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[4] = Integer.parseInt(centreright_5_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[4], rightpart2[4]);
            centreright_5_top_textfield.setText(Integer.toString(sum));
            centreright_5_top_textfield.setEnabled(true);
            centreright_5_top_upper.setVisible(false);
            centreright_5_top_middle.setVisible(false);
        });

        centreright_5_top_upper.add(Box.createVerticalStrut(20));
        centreright_5_top_upper.add(centreright_5_top_label_next_exampted1);
        centreright_5_top_upper.add(centreright_5_top_textfield_next_exampted1);
        centreright_5_top_upper.add(Box.createVerticalStrut(20));
        centreright_5_top_upper.add(centreright_5_top_label_next_taxable2);
        centreright_5_top_upper.add(centreright_5_top_textfield_next_taxable2);
        centreright_5_top_upper.add(Box.createVerticalStrut(20));
        centreright_5_top_middle.add(centreright_5_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[14].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[15]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_6_top_upper = new JPanel();
        centreright_6_top_box_upper = new BoxLayout(centreright_6_top_upper, BoxLayout.Y_AXIS);
        centreright_6_top_upper.setLayout(centreright_6_top_box_upper);

        centreright_6_top_middle = new JPanel();
        centreright_6_top_middle.setBackground(Color.green);

        centreright_6_top.add(centreright_6_top_upper, BorderLayout.NORTH);
        centreright_6_top.add(centreright_6_top_middle, BorderLayout.CENTER);
        centreright_6_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_6_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_6_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_6_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_6_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_6_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_6_top_add = new JButton("Add");

        centreright_6_top_add.addActionListener(f
                -> {
            if (!centreright_6_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[5] = Integer.parseInt(centreright_6_top_textfield_next_exampted1.getText());
            }
            if (!centreright_6_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[5] = Integer.parseInt(centreright_6_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[5], rightpart2[5]);
            centreright_6_top_textfield.setText(Integer.toString(sum));
            centreright_6_top_textfield.setEnabled(true);
            centreright_6_top_upper.setVisible(false);
            centreright_6_top_middle.setVisible(false);
        });

        centreright_6_top_upper.add(Box.createVerticalStrut(20));
        centreright_6_top_upper.add(centreright_6_top_label_next_exampted1);
        centreright_6_top_upper.add(centreright_6_top_textfield_next_exampted1);
        centreright_6_top_upper.add(Box.createVerticalStrut(20));
        centreright_6_top_upper.add(centreright_6_top_label_next_taxable2);
        centreright_6_top_upper.add(centreright_6_top_textfield_next_taxable2);
        centreright_6_top_upper.add(Box.createVerticalStrut(20));
        centreright_6_top_middle.add(centreright_6_top_add);
        mainbody.revalidate();

    });
    adddetailupdate[15].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[16]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_7_top_upper = new JPanel();
        centreright_7_top_box_upper = new BoxLayout(centreright_7_top_upper, BoxLayout.Y_AXIS);
        centreright_7_top_upper.setLayout(centreright_7_top_box_upper);

        centreright_7_top_middle = new JPanel();
        centreright_7_top_middle.setBackground(Color.green);

        centreright_7_top.add(centreright_7_top_upper, BorderLayout.NORTH);
        centreright_7_top.add(centreright_7_top_middle, BorderLayout.CENTER);
        centreright_7_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_7_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_7_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_7_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_7_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_7_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_7_top_add = new JButton("Add");

        centreright_7_top_add.addActionListener(f
                -> {
            if (!centreright_7_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[6] = Integer.parseInt(centreright_7_top_textfield_next_exampted1.getText());
            }
            if (!centreright_7_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[6] = Integer.parseInt(centreright_7_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[6], rightpart2[6]);
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
    adddetailupdate[16].addActionListener(e -> {
        try {
            json = new JSONObject(salary1[17]);

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_8_top_upper = new JPanel();
        centreright_8_top_box_upper = new BoxLayout(centreright_8_top_upper, BoxLayout.Y_AXIS);
        centreright_8_top_upper.setLayout(centreright_8_top_box_upper);

        centreright_8_top_middle = new JPanel();
        centreright_8_top_middle.setBackground(Color.green);

        centreright_8_top.add(centreright_8_top_upper, BorderLayout.NORTH);
        centreright_8_top.add(centreright_8_top_middle, BorderLayout.CENTER);
        centreright_8_top_label_next_exampted1 = new JLabel("Amount Of Exempted Income(Tk):                                     ");
        centreright_8_top_textfield_next_exampted1 = new JTextField();
        try {
            centreright_8_top_textfield_next_exampted1.setText(json.getString("EXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
        centreright_8_top_label_next_taxable2 = new JLabel("Net Taxable Income(Tk):                                   ");
        centreright_8_top_textfield_next_taxable2 = new JTextField();
        try {
            centreright_8_top_textfield_next_taxable2.setText(json.getString("NETTAXIN"));

        } catch (JSONException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        centreright_8_top_add = new JButton("Add");

        centreright_8_top_add.addActionListener(f
                -> {
            if (!centreright_8_top_textfield_next_exampted1.getText().isEmpty()) {
                rightpart1[7] = Integer.parseInt(centreright_8_top_textfield_next_exampted1.getText());
            }
            if (!centreright_8_top_textfield_next_taxable2.getText().isEmpty()) {
                rightpart2[7] = Integer.parseInt(centreright_8_top_textfield_next_taxable2.getText());
            }

            int sum = adddetails_add(rightpart1[7], rightpart2[7]);
            centreright_8_top_textfield.setText(Integer.toString(sum));
            centreright_8_top_textfield.setEnabled(true);
            centreright_8_top_upper.setVisible(false);
            centreright_8_top_middle.setVisible(false);
        });

        centreright_8_top_upper.add(Box.createVerticalStrut(20));
        centreright_8_top_upper.add(centreright_8_top_label_next_exampted1);
        centreright_8_top_upper.add(centreright_8_top_textfield_next_exampted1);
        centreright_8_top_upper.add(Box.createVerticalStrut(20));
        centreright_8_top_upper.add(centreright_8_top_label_next_taxable2);
        centreright_8_top_upper.add(centreright_8_top_textfield_next_taxable2);
        centreright_8_top_upper.add(Box.createVerticalStrut(20));
        centreright_8_top_middle.add(centreright_8_top_add);
        mainbody.revalidate();
    });

    update.addActionListener(e -> {
        try {
            conn.SalaryUpdate(text, leftpart1[0], leftpart2[0], leftpart1[1], leftpart2[1], leftpart1[2], leftpart2[2], leftpart1[3], leftpart2[3], leftpart1[4], leftpart2[4], leftpart1[5], leftpart2[5], leftpart1[6], leftpart2[6], leftpart1[7], leftpart2[7], leftpart1[8], leftpart2[8], rightpart1[0], rightpart2[0], rightpart1[1], rightpart2[1], rightpart1[2], rightpart2[2], rightpart1[3], rightpart2[3], rightpart1[4], rightpart2[4], rightpart1[5], rightpart2[5], rightpart1[6], rightpart2[6], rightpart1[7], rightpart2[7],ayear);
            HomeForm hh = new HomeForm();
            hh.setVisible(true);
            dispose();
        } catch (Exception k) {
            System.out.println(k.toString());
        }

    });

}
}
