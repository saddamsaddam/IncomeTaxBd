
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Registration;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import static javax.management.Query.value;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class AssesseeRegistration extends JFrame {
     String lenchker;
    int chvalue=0;
    validatiocheck ch = new validatiocheck();
    String stringlength;
                validatiocheck circle = new validatiocheck();
                int[] optional=new int[5];
 boolean validationcheck;
byte[] fileBytes;
byte[] kk;
byte[] immAsBytes = null;
JTextField imgg;
databaseConnection conn = new databaseConnection();
String[] registrationreturn = new String[21];
String calendaroutput = null;
JDatePickerImpl datePicker;
JDatePickerImpl datePicker1;
JMenuBar bar = new JMenuBar();
JMenu menu = new JMenu();
JMenuItem[] assessmemtyear = new JMenuItem[20];
LocalDateTime cyear = LocalDateTime.now();
int currentyear = (cyear.getYear());
int[] ayear = new int[20];

JRadioButton jb1, jb1update, jb2, jb3, jbb1, jbb1update, jbb2, jbbb1, jbbb1update, jbbb2, jbbb3, jbbb4, address;
ButtonGroup bg1, bg9, bg10, addreesg;
String values2, values7, values8, values9, values10, values11, values12, values13, values14, values15, values16, values17;
int valuei6;
long valuei5, valuei3, valuei4, valuei20, valuei12nin = 0,valuei18, valuei19;
String type = "Self", residstatus = "Resident", status = "Individual";
String filename = null;
byte[] person_image = null;
int NIN;
long TINN;

JPanel mainbody, left, right, bottom, top, centre, centreleft, centreright, centrecentre, bottom_left, bottom_right, bottom_bottom, bottom_centre, bottom_top,
        centreleft_1_top, centreleft_1_bottom, centreleft_1_centre, centreleft_2_top, centreleft_2_bottom, centreleft_2_centre, centreleft_3_top, centreleft_3_bottom, centreleft_3_centre, centreleft_4_top, centreleft_4_bottom, centreleft_4_centre, centreleft_5_top, centreleft_5_bottom, centreleft_5_centre, centreleft_6_top, centreleft_6_bottom, centreleft_6_centre, centreleft_7_top, centreleft_7_bottom, centreleft_7_centre, centreleft_8_top, centreleft_8_bottom, centreleft_8_centre, centreleft_9_top, centreleft_9_bottom, centreleft_9_centre, centreleft_10_top, centreleft_10_bottom, centreleft_10_centre,
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
        centreleft_2_top_label_next_company1, centreleft_2_top_label_next_share1,
        centreleft_3_top_label_next_description1, centreleft_3_top_label_next_amount1,
        centreleft_4_top_label_next_land1, centreleft_4_top_label_next_amount1,
        centreleft_5_top_label_next_deventures1, centreleft_5_top_label_next_insurance1, centreleft_5_top_label_next_dps1, centreleft_5_top_label_next_fund1, centreleft_5_top_label_next_annuationfund1, centreleft_5_top_label_next_groupinsurance1,
        centreleft_6_top_label_next_motor1, centreleft_6_top_label_next_amount1,
        centreleft_7_top_label_next_amountname1, centreleft_7_top_label_next_amount1,
        centreleft_8_top_label_next_name1, centreleft_8_top_label_next_amount1,
        centreleft_9_top_label_next_name1, centreleft_9_top_label_next_amount1;

JLabel centrecentre_1_top_label1, centrecentre_1_top_label2, centrecentre_2_top_label, centrecentre_3_top_label, centrecentre_4_top_label, centrecentre_5_top_label, centrecentre_6_top_label, centrecentre_7_top_label,
        centrecentre_1_top_label_next_1, centrecentre_1_top_label_next_2,
        centrecentre_2_top_label_next_1, centrecentre_2_top_label_next_2,
        centrecentre_3_top_label_next_1, centrecentre_3_top_label_next_2,
        centrecentre_4_top_label_next_1, centrecentre_4_top_label_next_2,
        centrecentre_5_top_label_next_1, centrecentre_5_top_label_next_2,
        centrecentre_6_top_label_next_1, centrecentre_6_top_label_next_2,
        centrecentre_7_top_label_next_1, centrecentre_7_top_label_next_2,
        centrecentre_5_top_label_next_heading;

JLabel centreright_1_top_label, centreright_2_top_label, centreright_3_top_label, centreright_4_top_label, centreright_5_top_label, centreright_6_top_label, centreright_7_top_label, centreright_8_top_label, centreright_9_top_label, centreright_10_top_label,
        centreright_1_top_label_next_cashhand1, centreright_1_top_label_next_cashbank1, centreright_1_top_label_next_deposit1,
        centreright_2_top_label_next_heading1, centreright_2_top_label_next_description1, centreright_2_top_label_next_amount1,
        centreright_3_top_label_next_mortgages1, centreright_3_top_label_next_unsecuredloan1, centreright_3_top_label_next_loan1, centreright_3_top_label_next_other1,
        centreright_4_top_label_next_exampted1, centreright_4_top_label_next_taxable2,
        centreright_5_top_label_next_exampted1, centreright_5_top_label_next_taxable2, centreright_5_top_labelprevious, centreright_5_top_labelupdate,
        centreright_6_top_label_next_exampted1, centreright_6_top_label_next_taxable2,
        centreright_7_top_label_next_amount1, centreright_7_top_label_next_adult1, centreright_7_top_label_next_child1,
        centreright_8_top_label_next_exampted1, centreright_8_top_label_next_taxable2,
        centreright_9_top_label_next_returnincome1, centreright_9_top_label_next_freeincome, centreright_9_top_label_next_other1,
        centreright_10_top_label_next_exampted1, centreright_10_top_label_next_taxable2;

JTextField centreleft_1_top_textfield, centreleft_2_top_textfield, centreleft_3_top_textfield, centreleft_4_top_textfield, centreleft_5_top_textfield, centreleft_6_top_textfield, centreleft_7_top_textfield, centreleft_8_top_textfield, centreleft_9_top_textfield,
        centreleft_1_top_textfield_next_exampted1, centreleft_1_top_textfield_next_taxable1,
        centreleft_2_top_textfield_next_company1, centreleft_2_top_textfield_next_share1,
        centreleft_3_top_textfield_next_description1, centreleft_3_top_textfield_next_amount1,
        centreleft_4_top_textfield_next_land1, centreleft_4_top_textfield_next_amount1,
        centreleft_5_top_textfield_next_deventures1, centreleft_5_top_textfield_next_insurance1, centreleft_5_top_textfield_next_dps1, centreleft_5_top_textfield_next_fund1, centreleft_5_top_textfield_next_annuationfund1, centreleft_5_top_textfield_next_groupinsurance1,
        centreleft_6_top_textfield_next_motor1, centreleft_6_top_textfield_next_amount1,
        centreleft_7_top_textfield_next_amountname1, centreleft_7_top_textfield_next_amount1,
        centreleft_8_top_textfield_next_name1, centreleft_8_top_textfield_next_amount1,
        centreleft_9_top_textfield_next_name1, centreleft_9_top_textfield_next_amount1,
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
        centreright_1_top_textfield_next_cashhand1, centreright_1_top_textfield_next_cashbank1, centreright_1_top_textfield_next_deposit1,
        centreright_2_top_textfield_next_heading1, centreright_2_top_textfield_next_description1, centreright_2_top_textfield_next_amount1,
        centreright_3_top_textfield_next_mortgages1, centreright_3_top_textfield_next_unsecuredloan1, centreright_3_top_textfield_next_loan1, centreright_3_top_textfield_next_other1,
        centreright_4_top_textfield_next_exampted1, centreright_4_top_textfield_next_taxable2,
        centreright_5_top_textfield_next_exampted1, centreright_5_top_textfield_next_taxable2,
        centreright_6_top_textfield_next_exampted1, centreright_6_top_textfield_next_taxable2,
        centreright_7_top_textfield_next_amount1, centreright_7_top_textfield_next_adult1, centreright_7_top_textfield_next_child1,
        centreright_8_top_textfield_next_exampted1, centreright_8_top_textfield_next_taxable2,
        centreright_9_top_textfield_next_returnincome1, centreright_9_top_textfield_next_freeincome, centreright_9_top_textfield_next_other1,
        centreright_10_top_textfield_next_exampted1, centreright_10_top_textfield_next_taxable2,
        centreright_2_top_textfield_next_pin;

JButton centreleft_1_top_adddetail, centreleft_2_top_adddetail, centreleft_3_top_adddetail, centreleft_4_top_adddetail, centreleft_5_top_adddetail, centreleft_6_top_adddetail, centreleft_7_top_adddetail, centreleft_8_top_adddetail, centreleft_9_top_adddetail, centreleft_1_top_add, centreleft_2_top_add, centreleft_3_top_add, centreleft_4_top_add, centreleft_5_top_add, centreleft_6_top_add, centreleft_7_top_add, centreleft_8_top_add, centreleft_9_top_add, centreleft_1_top_end, centreleft_2_top_end, centreleft_3_top_end, centreleft_4_top_end, centreleft_5_top_end, centreleft_6_top_end, centreleft_7_top_end, centreleft_8_top_end, centreleft_9_top_end;

JButton centrecentre_1_top_adddetail, centrecentre_2_top_adddetail, centrecentre_3_top_adddetail, centrecentre_4_top_adddetail, centrecentre_5_top_adddetail, centrecentre_6_top_adddetail, centrecentre_7_top_adddetail, centrecentre_1_top_add, centrecentre_2_top_add, centrecentre_3_top_add, centrecentre_4_top_add, centrecentre_5_top_add, centrecentre_6_top_add, centrecentre_7_top_add, centrecentre_1_top_end, centrecentre_2_top_end, centrecentre_3_top_end, centrecentre_4_top_end, centrecentre_5_top_end, centrecentre_6_top_end, centrecentre_7_top_end,
        centrecentre_5_top_new,
        centrecentre_5_top_terminate,
        imagebutton;

JButton centreright_1_top_adddetail, centreright_2_top_adddetail, centreright_2_top_adddetailUpdate, centreright_3_top_adddetail, centreright_4_top_adddetail, centreright_5_top_adddetail, centreright_6_top_adddetail, centreright_7_top_adddetail, centreright_8_top_adddetail, centreright_9_top_adddetail, centreright_10_top_adddetail, centreright_1_top_add, centreright_2_top_add, centreright_3_top_add, centreright_4_top_add, centreright_5_top_add, centreright_6_top_add, centreright_7_top_add, centreright_8_top_add, centreright_9_top_add, centreright_10_top_add, centreright_1_top_end, centreright_2_top_end, centreright_3_top_end, centreright_4_top_end, centreright_5_top_end, centreright_6_top_end, centreright_7_top_end, centreright_8_top_end, centreright_9_top_end, centreright_10_top_end, update, jj;

public AssesseeRegistration() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screen.width - 20, screen.height - 70);
    setTitle("MultiPanel Test");

    int count = 1;
    for (int i = 0; i < 20; i++) {
        ayear[i] = currentyear - count;
        count++;
        // System.out.print(ayear[i]);

    }
    DatePickerExample();
    mainbody(ayear);
    // assesmentyearcall();

}

public void DatePickerExample() {
    SqlDateModel model = new SqlDateModel();
    Properties p = new Properties();
    p.put("text.day", "Day");
    p.put("text.month", "Month");
    p.put("text.year", "Year");
    JDatePanelImpl panle = new JDatePanelImpl(model, p);
    datePicker = new JDatePickerImpl(panle, new AbstractFormatter() {
        @Override
        public Object stringToValue(String text) throws ParseException {

            return null;
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                calendaroutput = format.format(cal.getTime());
                values15 = calendaroutput;
                return calendaroutput;
            } else {
                values15 = null;
                return calendaroutput;

            }

        }

    });

}

public static void main(String[] args) {
    AssesseeRegistration window = new AssesseeRegistration();
    window.setVisible(true);

}

public void assesmentyearcall() {

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
    JLabel jj = new JLabel("Assessee Registration     ");
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
    centre.add(centreleft, BorderLayout.WEST);
    centre.add(centreright, BorderLayout.EAST);
    centre.add(centrecentre, BorderLayout.CENTER);
    centreleft(ayear);
    centreright();
    centremiddle();
    centrebottom();

}

public void centreleft(int[] ayear) {
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

    //ten indoor
    centreleft_9_centre.setLayout(new BorderLayout());
    centreleft_10_top = new JPanel();
    centreleft_10_centre = new JPanel();
    centreleft_10_bottom = new JPanel();

    centreleft_10_top.add(Box.createVerticalStrut(20));
    centreleft_9_centre.add(centreleft_10_top, BorderLayout.NORTH);
    centreleft_9_centre.add(centreleft_10_centre, BorderLayout.CENTER);
    // centreleft_5_centre.add(centreleft_6_bottom,BorderLayout.SOUTH);

    addleftcontent(ayear);

}

public void addleftcontent(int[] ayear) {

    centreleft_1_top.setLayout(new BorderLayout());
    JPanel centreleft_1_top_top = new JPanel();
    JPanel centreleft_1_top_centre = new JPanel();
    centreleft_1_top.add(centreleft_1_top_top, BorderLayout.NORTH);
    centreleft_1_top.add(centreleft_1_top_centre, BorderLayout.CENTER);

    centreleft_1_top_label = new JLabel("                                                           Click Wherever applicable:                                                                            ");
    jb1 = new JRadioButton("Self", true);
    jb2 = new JRadioButton("Universal Self");
    jb3 = new JRadioButton("Normal");

    bg1 = new ButtonGroup();
    bg1.add(jb1);
    bg1.add(jb2);
    bg1.add(jb3);

    centreleft_1_top_top.add(centreleft_1_top_label);
    centreleft_1_top_centre.add(jb1);
    centreleft_1_top_centre.add(jb2);
    centreleft_1_top_centre.add(jb3);

    //2
    centreleft_2_top_box = new BoxLayout(centreleft_2_top, BoxLayout.Y_AXIS);
    centreleft_2_top.setLayout(centreleft_2_top_box);
    centreleft_2_top_label = new JLabel("Name Of The Assessee                                    ");
    centreleft_2_top_textfield = new JTextField();
    centreleft_2_top.add(centreleft_2_top_label);
    centreleft_2_top.add(centreleft_2_top_textfield);

    //3
    centreleft_3_top_box = new BoxLayout(centreleft_3_top, BoxLayout.Y_AXIS);
    centreleft_3_top.setLayout(centreleft_3_top_box);
    centreleft_3_top_label = new JLabel("National ID(if any):10-digit(smart)/17-digit(old)                                    ");
    centreleft_3_top_textfield = new JTextField();
    centreleft_3_top.add(centreleft_3_top_label);
    centreleft_3_top.add(centreleft_3_top_textfield);

    //4
    centreleft_4_top_box = new BoxLayout(centreleft_4_top, BoxLayout.Y_AXIS);
    centreleft_4_top.setLayout(centreleft_4_top_box);
    centreleft_4_top_label = new JLabel("UTIN(if any):12-digit                                    ");
    centreleft_4_top_textfield = new JTextField();
    centreleft_4_top.add(centreleft_4_top_label);
    centreleft_4_top.add(centreleft_4_top_textfield);

    //5
    centreleft_5_top_box = new BoxLayout(centreleft_5_top, BoxLayout.Y_AXIS);
    centreleft_5_top.setLayout(centreleft_5_top_box);
    centreleft_5_top_label = new JLabel("TIN(EX:1234567):12-digit                                    ");
    centreleft_5_top_textfield = new JTextField();
    centreleft_5_top.add(centreleft_5_top_label);
    centreleft_5_top.add(centreleft_5_top_textfield);
    //6
    centreleft_6_top_box = new BoxLayout(centreleft_6_top, BoxLayout.Y_AXIS);
    centreleft_6_top.setLayout(centreleft_6_top_box);
    centreleft_6_top_label = new JLabel("Circle(EX:12344):                                    ");
    centreleft_6_top_textfield = new JTextField();
    centreleft_6_top.add(centreleft_6_top_label);
    centreleft_6_top.add(centreleft_6_top_textfield);

    //7
    centreleft_7_top_box = new BoxLayout(centreleft_7_top, BoxLayout.Y_AXIS);
    centreleft_7_top.setLayout(centreleft_7_top_box);
    centreleft_7_top_label = new JLabel("Taxes Zone(EX:Dhaka):                                    ");
    centreleft_7_top_textfield = new JTextField();
    centreleft_7_top.add(centreleft_7_top_label);
    centreleft_7_top.add(centreleft_7_top_textfield);

    //8
    centreleft_8_top.setLayout(new BorderLayout());
    JPanel allleft = new JPanel();
    JPanel alltop = new JPanel();
    JPanel allmidle = new JPanel();
    JPanel allright = new JPanel();
    JPanel allbottom = new JPanel();
    centreleft_8_top.add(alltop, BorderLayout.NORTH);
    centreleft_8_top.add(allleft, BorderLayout.WEST);
    centreleft_8_top.add(allright, BorderLayout.EAST);
    centreleft_8_top.add(allmidle, BorderLayout.CENTER);

    centreleft_8_top_label = new JLabel("Assessment Year(EX: " + ayear[0] + "):                                                                                                                     ", JLabel.LEFT);
    centreleft_8_top_textfield = new JTextField("                                                       ");
    JLabel alljl = new JLabel("                                                                   ");
    menu = new JMenu("Click             ");
    for (int i = 0; i < 20; i++) {
       
        assessmemtyear[i] = new JMenuItem(Integer.toString(ayear[i]));

    }

    for (int i = 0; i < 20; i++) {
        menu.add(assessmemtyear[i]);
    }

    bar = new JMenuBar();
    bar.add(menu);
    setJMenuBar(bar);

    assessmemtyear[0].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[0]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[1].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[1]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[2].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[2]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[3].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[3]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[4].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[4]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[5].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[5]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[6].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[6]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[7].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[7]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[8].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[8]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[9].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[9]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[10].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[10]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[11].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[11]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[12].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[12]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[13].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[13]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[14].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[14]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[15].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[15]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[16].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[16]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[17].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[17]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[18].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[18]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });
    assessmemtyear[19].addActionListener(e -> {
        centreleft_8_top_textfield.setText(Integer.toString(ayear[19]) + "                                    ");
        centreleft_8_top_textfield.revalidate();
    });

    alltop.add(centreleft_8_top_label);
    allleft.add(centreleft_8_top_textfield);
    allleft.add(bar);
    allright.add(alljl);
    centreleft_8_top.add(Box.createVerticalStrut(30));

    //9
    centreleft_9_top_label = new JLabel("Residential Status:");
    jbb1 = new JRadioButton("Resident", true);

    jbb2 = new JRadioButton("Non-Resident");
    bg9 = new ButtonGroup();
    bg9.add(jbb1);
    bg9.add(jbb2);
    centreleft_9_top.add(centreleft_9_top_label);
    centreleft_9_top.add(jbb1);
    centreleft_9_top.add(jbb2);

    //10
    JLabel centreleft_10_top_label = new JLabel("Status:         ");
    jbbb1 = new JRadioButton("Individual", true);
    jbbb2 = new JRadioButton("Firm");
    jbbb3 = new JRadioButton("Association of Persons");
    jbbb4 = new JRadioButton("Hindu Undivided Family");
    bg10 = new ButtonGroup();
    bg10.add(jbbb1);
    bg10.add(jbbb2);
    bg10.add(jbbb3);
    bg10.add(jbbb4);
    centreleft_10_top.add(centreleft_10_top_label);
    centreleft_10_top.add(jbbb1);
    centreleft_10_top.add(jbbb2);
    centreleft_10_top.add(jbbb3);
    centreleft_10_top.add(jbbb4);
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
    centrecentre_1_top.add(Box.createVerticalStrut(300));
    centrecentre_1_top_label1 = new JLabel("                                           ");
    centrecentre_1_top_label2 = new JLabel("                    .                       ");
    imgg = new JTextField();

    // centrecentre_1_top_label1.setPreferredSize(new Dimension(250, 100));
    imagebutton = new JButton("               Select Image              ");
    imagebutton.addActionListener(e -> {
        try {
            imagefunction();
        } catch (IOException ex) {
            Logger.getLogger(AssesseeRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    centrecentre_1_top.add(centrecentre_1_top_label1);
    centrecentre_1_top.add(centrecentre_1_top_label2);
    //  centrecentre_1_top.add(imgg);
    // imgg.setEnabled(false);
    centrecentre_1_top.add(imagebutton);

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
    centreright_1_top_label = new JLabel(" Name Of The Empoyer/Business(Where applicable)                               ");
    centreright_1_top_textfield = new JTextField();
    centreright_1_top.add(centreright_1_top_label);
    centreright_1_top.add(centreright_1_top_textfield);

    //2
    centreright_2_top_box = new BoxLayout(centreright_2_top, BoxLayout.Y_AXIS);
    centreright_2_top.setLayout(centreright_2_top_box);
    centreright_2_top_label = new JLabel("Wife/Husband's Name:                                     ");
    centreright_2_top_textfield = new JTextField();
    centreright_2_top_adddetail = new JButton("Add TIN(if assessee ,please mention TIN)");
    centreright_2_top_adddetailUpdate = new JButton("Add TIN(if assessee ,please mention TIN)");
    centreright_2_top_adddetail.addActionListener(e -> {
        valuei12nin = 1;
    });
    centreright_2_top_adddetailUpdate.addActionListener(e -> {
        valuei12nin = 1;
    });
    centreright_2_top.add(centreright_2_top_label);
    centreright_2_top.add(centreright_2_top_textfield);
    centreright_2_top.add(centreright_2_top_adddetail);
    centreright_2_top.add(centreright_2_top_adddetailUpdate);
    centreright_2_top_adddetailUpdate.setVisible(false);
    centreright_2_top_adddetail.addActionListener(e -> adddetails_right_2());

    //3
    centreright_3_top_box = new BoxLayout(centreright_3_top, BoxLayout.Y_AXIS);
    centreright_3_top.setLayout(centreright_3_top_box);
    centreright_3_top_label = new JLabel("Father's Name:                                    ");
    centreright_3_top_textfield = new JTextField();
    centreright_3_top.add(centreright_3_top_label);
    centreright_3_top.add(centreright_3_top_textfield);

    //4
    centreright_4_top_box = new BoxLayout(centreright_4_top, BoxLayout.Y_AXIS);
    centreright_4_top.setLayout(centreright_4_top_box);
    centreright_4_top_label = new JLabel("Mother's Name:                                     ");
    centreright_4_top_textfield = new JTextField();
    centreright_4_top.add(centreright_4_top_label);
    centreright_4_top.add(centreright_4_top_textfield);

    //5
    centreright_5_top_box = new BoxLayout(centreright_5_top, BoxLayout.Y_AXIS);
    centreright_5_top.setLayout(centreright_5_top_box);
    centreright_5_top_label = new JLabel("Date Of Birth:                                ");
    centreright_5_top.add(centreright_5_top_label);
    centreright_5_top.add(datePicker);

    //6
    centreright_6_top_box = new BoxLayout(centreright_6_top, BoxLayout.Y_AXIS);
    centreright_6_top.setLayout(centreright_6_top_box);
    centreright_6_top_label = new JLabel(" Present Address(Details):                              ");
    centreright_6_top_textfield = new JTextField();
    centreright_6_top.add(centreright_6_top_label);
    centreright_6_top.add(centreright_6_top_textfield);

    //7
    centreright_7_top.setLayout(new BorderLayout());
    JPanel singleleft = new JPanel();
    JPanel singletop = new JPanel();
    JPanel singlemidle = new JPanel();
    JPanel singleright = new JPanel();
    centreright_7_top.add(singletop, BorderLayout.NORTH);
    centreright_7_top.add(singleleft, BorderLayout.WEST);
    centreright_7_top.add(singleright, BorderLayout.EAST);
    centreright_7_top.add(singlemidle, BorderLayout.CENTER);
    centreright_7_top_label = new JLabel("Permanent Address(Details):                                                                                                     ", JLabel.LEFT);
    centreright_7_top_textfield = new JTextField("                                                ");
    JLabel jl = new JLabel("                                                                          ");
    address = new JRadioButton("Same      ");
    address.addActionListener(e -> {
        if (address.isSelected()) {
            centreright_7_top_textfield.setText(" " + centreright_6_top_textfield.getText());
        } else {
            centreright_7_top_textfield.setText(null);
        }

    });
    if (address.isSelected()) {

    }

    singletop.add(centreright_7_top_label);
    singleleft.add(centreright_7_top_textfield);
    singleleft.add(address);
    singleright.add(jl);
    centreright_7_top.add(Box.createVerticalStrut(30));

    //8
    centreright_8_top_box = new BoxLayout(centreright_8_top, BoxLayout.Y_AXIS);
    centreright_8_top.setLayout(centreright_8_top_box);
    centreright_8_top_label = new JLabel(" Telephone:Office/Business(EX:0xxxxxxxxxx:                                   ");
    centreright_8_top_textfield = new JTextField();
    centreright_8_top.add(centreright_8_top_label);
    centreright_8_top.add(centreright_8_top_textfield);
    //9
    centreright_9_top_box = new BoxLayout(centreright_9_top, BoxLayout.Y_AXIS);
    centreright_9_top.setLayout(centreright_9_top_box);
    centreright_9_top_label = new JLabel("Telephone:Residential(EX:0xxxxxxxxxx:                                    ");
    centreright_9_top_textfield = new JTextField();
    centreright_9_top.add(centreright_9_top_label);
    centreright_9_top.add(centreright_9_top_textfield);

    //10
    centreright_10_top_box = new BoxLayout(centreright_10_top, BoxLayout.Y_AXIS);
    centreright_10_top.setLayout(centreright_10_top_box);
    centreright_10_top_label = new JLabel("Vat Registration Number(if any):6-digit                                    ");
    centreright_10_top_textfield = new JTextField();
    centreright_10_top.add(centreright_10_top_label);
    centreright_10_top.add(centreright_10_top_textfield);

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
    JLabel centreright_2_top_label_next_pin = new JLabel("TIN:12-digit                                     ");
    centreright_2_top_textfield_next_pin = new JTextField();

    centreright_2_top_add = new JButton("Add");
    centreright_2_top_add.addActionListener(e -> {
        centreright_2_top_upper.setVisible(false);
        centreright_2_top_middle.setVisible(false);
    });
    centreright_2_top_upper.add(Box.createVerticalStrut(20));
    centreright_2_top_upper.add(centreright_2_top_label_next_pin);
    centreright_2_top_upper.add(centreright_2_top_textfield_next_pin);
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
    centreright_3_top_label_next_mortgages1 = new JLabel("Mortgages secured on property or land(Tk):                                     ");
    centreright_3_top_textfield_next_mortgages1 = new JTextField();
    centreright_3_top_label_next_unsecuredloan1 = new JLabel("Unsecured loans(Tk):                                   ");
    centreright_3_top_textfield_next_unsecuredloan1 = new JTextField();
    centreright_3_top_label_next_loan1 = new JLabel("Loan from Provident Fund(Tk):                                   ");
    centreright_3_top_textfield_next_loan1 = new JTextField();
    centreright_3_top_label_next_other1 = new JLabel("Others(Tk):                                   ");
    centreright_3_top_textfield_next_other1 = new JTextField();

    centreright_3_top_add = new JButton("Add");
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_mortgages1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_mortgages1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_unsecuredloan1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_unsecuredloan1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_loan1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_loan1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_upper.add(centreright_3_top_label_next_other1);
    centreright_3_top_upper.add(centreright_3_top_textfield_next_other1);
    centreright_3_top_upper.add(Box.createVerticalStrut(20));
    centreright_3_top_middle.add(centreright_3_top_add);
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
    centreright_7_top_label_next_amount1 = new JLabel("Amount:                                     ");
    centreright_7_top_textfield_next_amount1 = new JTextField();
    centreright_7_top_label_next_adult1 = new JLabel("Number of dependent peaple(Adult):                                   ");
    centreright_7_top_textfield_next_adult1 = new JTextField();

    centreright_7_top_label_next_child1 = new JLabel("Number of dependent peaple(Child):                                   ");
    centreright_7_top_textfield_next_child1 = new JTextField();

    centreright_7_top_add = new JButton("Add");
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_amount1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_amount1);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_adult1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_adult1);
    centreright_7_top_upper.add(Box.createVerticalStrut(20));
    centreright_7_top_upper.add(centreright_7_top_label_next_child1);
    centreright_7_top_upper.add(centreright_7_top_textfield_next_child1);
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
    centreright_9_top_label_next_returnincome1 = new JLabel("Shown Return Income(Tk):                                     ");
    centreright_9_top_textfield_next_returnincome1 = new JTextField();
    centreright_9_top_label_next_freeincome = new JLabel("Tax exempted/Tax free Income(Tk):                                   ");
    centreright_9_top_textfield_next_freeincome = new JTextField();
    centreright_9_top_label_next_other1 = new JLabel("Other(Tk):                                   ");
    centreright_9_top_textfield_next_other1 = new JTextField();

    centreright_9_top_add = new JButton("Add");
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_returnincome1);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_returnincome1);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_freeincome);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_freeincome);
    centreright_9_top_upper.add(Box.createVerticalStrut(20));
    centreright_9_top_upper.add(centreright_9_top_label_next_other1);
    centreright_9_top_upper.add(centreright_9_top_textfield_next_other1);
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

    jj = new JButton("                          ok                          ");
    update = new JButton("                          Update                         ");
    bottom_top.add(jj);
    bottom_top.add(update);
    update.setVisible(false);
    jj.addActionListener(e -> adddetails_submit("submit",23));

}

public void imagefunction() throws IOException {
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    //filename=f.getAbsolutePath();
    BufferedImage imm = ImageIO.read(f);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    //use another encoding if JPG is innappropriate for you
    ImageIO.write(imm, "jpg", baos);
    baos.flush();
    immAsBytes = baos.toByteArray();
    baos.close();

    ImageIcon image = new ImageIcon(immAsBytes);
    Image im = image.getImage();
    Image myImg = im.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
    ImageIcon newImage = new ImageIcon(myImg);
    centrecentre_1_top_label1.setIcon(newImage);

}

public void adddetails_submit(String input,int ayear) {
    try {

        if (jb2.isSelected()) {
            type = "Universal Self";
        }
        if (jb3.isSelected()) {
            type = "Normal";
        }
        if (jb1.isSelected()) {
            type = "Self";
        }

        if (centreleft_2_top_textfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Insert Name");
        } else {
            values2 = centreleft_2_top_textfield.getText();
            if (centreleft_3_top_textfield.getText().isEmpty()) {
                valuei3 = 0;
            } else {
                    validationcheck = circle.NID(centreleft_3_top_textfield.getText());
                    if (!validationcheck) {
                       // JOptionPane.showMessageDialog(null, "NID is not formatted");
                         optional[0]=1;
                    }
                    else
                    {
                     valuei3 = Long.parseLong(centreleft_3_top_textfield.getText());  
                        optional[0] = 0;
                    }
                
            }

            if (centreleft_4_top_textfield.getText().isEmpty()) {
                valuei4 = 0;
            } else {
                 validationcheck = circle.UTIN_TIN(centreleft_4_top_textfield.getText());
                    if (!validationcheck) {
                       // JOptionPane.showMessageDialog(null, "UTIN is not formatted");
                         optional[1]=1;
                    }
                    else
                    {
                     valuei4 = Long.parseLong(centreleft_4_top_textfield.getText()); 
                     optional[1]=0;
                    }
            }
            if (centreleft_5_top_textfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Insert TIN");
            } else {
                validationcheck = circle.UTIN_TIN(centreleft_5_top_textfield.getText());
                    if (!validationcheck) {
                        JOptionPane.showMessageDialog(null, "TIN is not formatted");
                    }
                    else
                    {
                     valuei5 = Long.parseLong(centreleft_5_top_textfield.getText());   
                    
                if (centreleft_6_top_textfield.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Insert Circle");
                } else {

                     circle = new validatiocheck();
                  validationcheck = circle.circle(centreleft_6_top_textfield.getText());
                    if (!validationcheck) {
                        JOptionPane.showMessageDialog(null, "circle is not formatted");
                    } else {

                        valuei6 = Integer.parseInt(centreleft_6_top_textfield.getText());
                        if (centreleft_7_top_textfield.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please Insert Tax Zone");
                        } else {
                            validatiocheck zone = new validatiocheck();
                            boolean validationcheck1 = zone.circle(centreleft_7_top_textfield.getText());
                            if (!validationcheck1) {
                                JOptionPane.showMessageDialog(null, "Tax Zone is not formatted");
                            } else {

                                values7 = centreleft_7_top_textfield.getText();
                                if (centreleft_8_top_textfield.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Please Insert Assessment Year");
                                } else {

                                    values8 = centreleft_8_top_textfield.getText();
                                    if (jbb1.isSelected()) {
                                        residstatus = "Resident";
                                    }
                                    if (jbb2.isSelected()) {
                                        residstatus = "Non Resident";
                                    }
                                    if (jbbb1.isSelected()) {
                                        status = "Individual";
                                    }
                                    if (jbbb2.isSelected()) {
                                        status = "Firm";
                                    }
                                    if (jbbb3.isSelected()) {
                                        status = "Association Of Persions";
                                    }
                                    if (jbbb4.isSelected()) {
                                        status = "Hindu Undivided Family";
                                    }

                                    if (centreright_1_top_textfield.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Please Insert Name of Business");
                                    } else {
                                        //values11 = centreright_1_top_textfield.getText();
                                        chvalue=80;
                                        lenchker=ch.textfieldcheckString(centreright_1_top_textfield.getText());
                                        if(lenchker.length()>chvalue)
                                        {
                                          JOptionPane.showMessageDialog(null, "The present string character must be less than "+chvalue+"");  
                                        }
                                        else
                                        {
                                          stringlength=circle.stringlengthcheck(lenchker,chvalue);  
                                        values11 =stringlength;
                                        if (centreright_2_top_textfield.getText().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Please Insert Name of Husband/Wife");
                                        } else {
                                            values12 = centreright_2_top_textfield.getText();
                                            if (valuei12nin == 1) {
                                                if (centreright_2_top_textfield_next_pin.getText().isEmpty()) {
                                                    valuei12nin = 0;
                                                } else {
                                                    
                                                    validationcheck = circle.UTIN_TIN(centreright_2_top_textfield_next_pin.getText());
                                                    if (!validationcheck) {
                                                       // JOptionPane.showMessageDialog(null, "Husband/Wife TIN is not formatted");
                                                         optional[2]=1;
                                                    }
                                                    else
                                                    {
                                                    valuei12nin = Long.parseLong(centreright_2_top_textfield_next_pin.getText());
                                                    optional[2]=0;
                                                    }
                                                }
                                            }

                                            if (centreright_3_top_textfield.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(null, "Please Insert Name of Father");
                                            } else {
                                                values13 = centreright_3_top_textfield.getText();
                                                if (centreright_4_top_textfield.getText().isEmpty()) {
                                                    JOptionPane.showMessageDialog(null, "Please Insert Name of Mother");
                                                } else {
                                                    values14 = centreright_4_top_textfield.getText();
                                                    if (values15 == null) {
                                                        JOptionPane.showMessageDialog(null, "Please Insert Date Of Birth");
                                                    } else {
                                                       
                                                        //values15=calendaroutput;
                                                        if (centreright_6_top_textfield.getText().isEmpty()) {
                                                            JOptionPane.showMessageDialog(null, "Please Insert Present Address");
                                                        } else {
                                                            chvalue=200;
                                                            lenchker=ch.textfieldcheckString(centreright_6_top_textfield.getText());
                                                           // JOptionPane.showMessageDialog(null, centreright_6_top_textfield.getText().length());
                                                            if(lenchker.length()>chvalue)
                                                            {
                                                              JOptionPane.showMessageDialog(null, "The present string character must be less than "+chvalue+"");  
                                                            }
                                                            else
                                                            {
                                                              stringlength=circle.stringlengthcheck(lenchker,chvalue);  
                                                            values16 =stringlength;
                                                            if (centreright_7_top_textfield.getText().isEmpty()) {
                                                                JOptionPane.showMessageDialog(null, "Please Insert Permanent Address");
                                                            } else {
                                                                
                                                               // values17 = centreright_7_top_textfield.getText();
                                                                 chvalue=200;
                                                            lenchker=ch.textfieldcheckString(centreright_7_top_textfield.getText());
                                                           // JOptionPane.showMessageDialog(null, centreright_6_top_textfield.getText().length());
                                                            if(lenchker.length()>chvalue)
                                                            {
                                                              JOptionPane.showMessageDialog(null, "The  permanent string character must be  less than "+chvalue+"");  
                                                            }
                                                            else
                                                            {
                                                              stringlength=circle.stringlengthcheck(lenchker,chvalue);  
                                                            values17 =stringlength;
                                                                if (centreright_8_top_textfield.getText().isEmpty()) {
                                                                    JOptionPane.showMessageDialog(null, "Please Insert office/business telephone number ");
                                                                } else {
                                                                    validatiocheck phone = new validatiocheck();
                                                                    boolean validationcheck4 = phone.PHONE(centreright_8_top_textfield.getText());
                                                                    if (!validationcheck4) {
                                                                        JOptionPane.showMessageDialog(null, "Office/business telephone Number is not formatted");
                                                                    } else {
                                                                        valuei18 = Long.parseLong(centreright_8_top_textfield.getText());
                                                                        
                                                                        if (centreright_9_top_textfield.getText().isEmpty()) {
                                                                            valuei19=0;
                                                                           // JOptionPane.showMessageDialog(null, "Please Insert resindetial number ");
                                                                        } else {
                                                                            validatiocheck phone1 = new validatiocheck();
                                                                            boolean validationcheck5 = phone1.PHONE(centreright_9_top_textfield.getText());
                                                                            if (!validationcheck5) {
                                                                                //JOptionPane.showMessageDialog(null, "Residential telephone Number is not formatted");
                                                                                 optional[3]=1;
                                                                            } else {
                                                                                valuei19 = Long.parseLong(centreright_9_top_textfield.getText());
                                                                                 optional[3]=0;
                                                                            }
                                                                                if (centreright_10_top_textfield.getText().isEmpty()) {
                                                                                    valuei20 = 0;
                                                                                } else {
                                                                                     validationcheck5 = phone1.VAT(centreright_10_top_textfield.getText());
                                                                                    if (!validationcheck5) {
                                                                                        optional[4]=1;
                                                                                       // JOptionPane.showMessageDialog(null, "VAT Number is not formatted");
                                                                                    } else {
                                                                                            valuei20 = Long.parseLong(centreright_10_top_textfield.getText());
                                                                                         optional[4]=0;
                                                                                    }
                                                                                }
                                                                                if (immAsBytes == null) {
                                                                                    JOptionPane.showMessageDialog(null, "Please Insert Image ");
                                                                                } else {
                                                                                    if(optional[0]==0 && optional[1]==0 && optional[2]==0 && optional[3]==0 && optional[4]==0)
                                                                                    {
                                                                                       
                                                                                        
                                                                                         if (input.matches("update")) {
                                                                                        boolean a = conn.AsseeRegistrationUpdate(type, values2, valuei3, valuei4, valuei5, valuei6, values7, values8, residstatus, status, values11, values12, valuei12nin, values13, values14, values15, values16, values17, valuei18, valuei19, valuei20, immAsBytes);
                                                                                        if (a == true) {
                                                                                            HomeForm hh = new HomeForm();
                                                                                            hh.setVisible(true);
                                                                                            dispose();
                                                                                        } else {
                                                                                            JOptionPane.showMessageDialog(null, "Not Inserted");
                                                                                        }

                                                                                    } else {

                                                                                        boolean a = conn.AsseeRegistration(type, values2, valuei3, valuei4, valuei5, valuei6, values7, values8, residstatus, status, values11, values12, valuei12nin, values13, values14, values15, values16, values17, valuei18, valuei19, valuei20, immAsBytes);
                                                                                        if (a == true) {
                                                                                            HomeForm hh = new HomeForm();
                                                                                            hh.setVisible(true);
                                                                                            dispose();
                                                                                        } else {
                                                                                            JOptionPane.showMessageDialog(null, "Not Inserted");
                                                                                        }

                                                                                    }
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                   
                                                                                    if(optional[0]==1)
                                                                                        {
                                                                                            JOptionPane.showMessageDialog(null, "NID Number is not formatted ");
                                                                                        }
                                                                                        if(optional[1]==1)
                                                                                        {
                                                                                            JOptionPane.showMessageDialog(null, "UTIN Number is not formatted ");
                                                                                        }
                                                                                        if(optional[2]==1)
                                                                                        {
                                                                                            JOptionPane.showMessageDialog(null, "Husband/Wife TIN Number is not formatted ");
                                                                                        }
                                                                                        if(optional[3]==1)
                                                                                        {
                                                                                            JOptionPane.showMessageDialog(null, "Residential  telephone number is not formatted ");
                                                                                        }
                                                                                        if(optional[4]==1)
                                                                                        {
                                                                                            JOptionPane.showMessageDialog(null, "  Vat number is not formatted ");
                                                                                        }
                                                                                    
                                                                                    }
                                                                                    

                                                                                }
                                                                                  }
                                                                            }

                                                                        }
                                                                        }
                                                                    }
                                                                    }
                                                                }

                                                            }

                                                        }

                                                    }
                                                }

                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
               }
            }
        

        databaseConnection conn = new databaseConnection();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());

    }

}

public void update(long text,int ayear) throws ClassNotFoundException, SQLException, IOException, JSONException {
    centreright_2_top_adddetailUpdate.setVisible(true);
    centreright_2_top_adddetail.setVisible(false);
    update.setVisible(true);
    jj.setVisible(false);
    registrationreturn = conn.RegistrationReturn(text);
    if (registrationreturn[0].matches("Self")) {
        jb1.setSelected(true);
    } else if (registrationreturn[0].matches("Universal Self")) {
        jb2.setSelected(true);
    } else {
        jb3.setSelected(true);
    }

    centreleft_2_top_textfield.setText(registrationreturn[1]);
    centreleft_3_top_textfield.setText(registrationreturn[2]);
    centreleft_4_top_textfield.setText(registrationreturn[3]);
    centreleft_5_top_textfield.setText(registrationreturn[4]);
    centreleft_6_top_textfield.setText(registrationreturn[5]);
    centreleft_7_top_textfield.setText(registrationreturn[6]);
    centreleft_8_top_textfield.setText(registrationreturn[7]);

    if (registrationreturn[8].matches("Resident")) {
        jbb1.setSelected(true);
    } else {
        jbb2.setSelected(true);
    }

    if (registrationreturn[9].matches("Individual")) {
        jbbb1.setSelected(true);
    } else if (registrationreturn[9].matches("Firm")) {
        jbbb2.setSelected(true);
    } else if (registrationreturn[9].matches("Association Of Persions")) {
        jbbb3.setSelected(true);
    } else {
        jbbb4.setSelected(true);
    }

    centreright_1_top_textfield.setText(ch.textfieldcheckdotcut(registrationreturn[10]));
    //registration part
    registrationreturn = conn.RegistrationReturn(text);
    JSONObject jsonObject;
    jsonObject = new JSONObject(registrationreturn[11]);
    String ggh = jsonObject.getString("whname");
    jsonObject = new JSONObject(ggh);
    String namee = jsonObject.getString("name");
    String amountt = jsonObject.getString("TIN");

    centreright_2_top_textfield.setText(namee);
    // centreright_2_top_adddetail.addActionListener(e->adddetails_right_2());
    centreright_2_top_adddetailUpdate.addActionListener(e -> {
        //centreleft_1_top.setLayout(new BorderLayout());
        centreright_2_top_upper = new JPanel();
        centreright_2_top_box_upper = new BoxLayout(centreright_2_top_upper, BoxLayout.Y_AXIS);
        centreright_2_top_upper.setLayout(centreright_2_top_box_upper);

        centreright_2_top_middle = new JPanel();
        centreright_2_top_middle.setBackground(Color.green);

        centreright_2_top.add(centreright_2_top_upper, BorderLayout.NORTH);
        centreright_2_top.add(centreright_2_top_middle, BorderLayout.CENTER);
        JLabel centreright_2_top_label_next_pin = new JLabel("PIN                                     ");
        centreright_2_top_textfield_next_pin = new JTextField();
        centreright_2_top_textfield_next_pin.setText(amountt);

        centreright_2_top_add = new JButton("Add");
        centreright_2_top_add.addActionListener(f -> {
            centreright_2_top_upper.setVisible(false);
            centreright_2_top_middle.setVisible(false);
        });
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_upper.add(centreright_2_top_label_next_pin);
        centreright_2_top_upper.add(centreright_2_top_textfield_next_pin);
        centreright_2_top_upper.add(Box.createVerticalStrut(20));
        centreright_2_top_middle.add(centreright_2_top_add);
        mainbody.revalidate();

    });

    centreright_3_top_textfield.setText(registrationreturn[12]);
    centreright_4_top_textfield.setText(registrationreturn[13]);
    datePicker.setVisible(false);

    SqlDateModel model = new SqlDateModel();
    Properties p = new Properties();
    p.put("text.day", "Day");
    p.put("text.month", "Month");
    p.put("text.year", "Year");
    JDatePanelImpl panle = new JDatePanelImpl(model, p);
    datePicker1 = new JDatePickerImpl(panle, new AbstractFormatter() {
        @Override
        public Object stringToValue(String text) throws ParseException {

            return null;
        }

        @Override
        public String valueToString(Object value) throws ParseException {

            if (value != null) {
                Calendar cal = (Calendar) value;
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                calendaroutput = format.format(cal.getTime());
                values15 = calendaroutput;
                return calendaroutput;
            } else {
                values15 = registrationreturn[14];
                return values15;
            }

        }

    });

    centreright_5_top.add(datePicker1);
    //ch.textfieldcheckdotcut(type)
    //centreright_6_top_textfield.setText(registrationreturn[15]);
    // JOptionPane.showMessageDialog(null,"sadd"+ ch.textfieldcheckdotcut(registrationreturn[15]));
    centreright_6_top_textfield.setText(ch.textfieldcheckdotcut(registrationreturn[15]));
    centreright_7_top_textfield.setText(ch.textfieldcheckdotcut(registrationreturn[16]));
    //centreright_7_top_textfield.setText(registrationreturn[16]);
    centreright_8_top_textfield.setText("0" + registrationreturn[17]);
    centreright_9_top_textfield.setText("0" + registrationreturn[18]);
    centreright_10_top_textfield.setText(registrationreturn[19]);

//image show
    immAsBytes = conn.RegistrationReturnimage(text);
    ImageIcon image = new ImageIcon(immAsBytes);
    Image im = image.getImage();
    Image myImg = im.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon newImage = new ImageIcon(myImg);
    centrecentre_1_top_label1.setIcon(newImage);

    OutputStream targetFile = new FileOutputStream("E:\\pdf\\" + text + ".JPG");
    targetFile.write(immAsBytes);
    targetFile.close();
    mainbody.revalidate();
    update.addActionListener(e -> adddetails_submit("update",ayear));
}

public void bottom() {

}

}