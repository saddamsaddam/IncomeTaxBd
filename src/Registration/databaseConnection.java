/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Registration;

import com.google.gson.Gson;
import com.sun.jdi.connect.spi.Connection;
import java.io.ByteArrayInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
*
* @author 01957
*/
public class databaseConnection {

//HouseProperty submit
public void HouseProperty(long a, int b, int c, int d, int e, int f, int g, int h, int i, String type,int ayear) throws ClassNotFoundException, SQLException {
    
   
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            String query = "INSERT INTO HOUSE_PROPERTY_INCOME(TIN,INCOME,CLAIMED,ASSYEAR) VALUES(" + a + "," + b + ", '{\"Repair\":" + c + ",\"Local_Tax\":" + d + ",\"Land_Revenue\":" + e + ",\"Interest_Loan\":" + f + ",\"Insurance_Premium\":" + g + ",\"Vacancy_Allowance\":" + h + ",\"Other\":" + i + ",\"type\":" + type + "}', "+ayear+")";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//HouseProperty submit
public void HousePropertyUpdate(long a, int b, int c, int d, int e, int f, int g, int h, int i, String type,int ayear) throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            //(TIN,INCOME,CLAIMED)
            String query = "UPDATE  HOUSE_PROPERTY_INCOME set INCOME= ?,CLAIMED='{\"Repair\":" + c + ",\"Local_Tax\":" + d + ",\"Land_Revenue\":" + e + ",\"Interest_Loan\":" + f + ",\"Insurance_Premium\":" + g + ",\"Vacancy_Allowance\":" + h + ",\"Other\":" + i + ",\"type\":" + type + "}' where TIN=" + a + " and  ASSYEAR="+ayear+";";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            pst.setString(1, Integer.toString(b));
            JOptionPane.showMessageDialog(null, "Update SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//Salary submit
public void Salary(long TIN, int lf11, int lf12, int lf21, int lf22, int lf31, int lf32, int lf41, int lf42, int lf51, int lf52, int lf61, int lf62, int lf71, int lf72, int lf81, int lf82, int lf91, int lf92, int rg11, int rg12, int rg21, int rg22, int rg31, int rg32, int rg41, int rg42, int rg51, int rg52, int rg61, int rg62, int rg71, int rg72, int rg81, int rg82,int ayear) throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            String query = "insert into Salary values(" + TIN + ",'{\"EXIN\":" + (lf11) + ",\"NETTAXIN\":" + (lf12) + "}','{\"EXIN\":" + (lf21) + ",\"NETTAXIN\":" + (lf22) + "}','{\"EXIN\":" + (lf31) + ",\"NETTAXIN\":" + (lf32) + "}','{\"EXIN\":" + (lf41) + ",\"NETTAXIN\":" + (lf42) + "}','{\"EXIN\":" + (lf51) + ",\"NETTAXIN\":" + (lf52) + "}','{\"EXIN\":" + (lf61) + ",\"NETTAXIN\":" + (lf62) + "}','{\"EXIN\":" + (lf71) + ",\"NETTAXIN\":" + (lf72) + "}','{\"EXIN\":" + (lf81) + ",\"NETTAXIN\":" + (lf82) + "}','{\"EXIN\":" + (lf91) + ",\"NETTAXIN\":" + (lf92) + "}','{\"EXIN\":" + (rg11) + ",\"NETTAXIN\":" + (rg12) + "}','{\"EXIN\":" + (rg21) + ",\"NETTAXIN\":" + (rg22) + "}','{\"EXIN\":" + (rg31) + ",\"NETTAXIN\":" + (rg32) + "}','{\"EXIN\":" + (rg41) + ",\"NETTAXIN\":" + (rg42) + "}','{\"EXIN\":" + (rg51) + ",\"NETTAXIN\":" + (rg52) + "}','{\"EXIN\":" + (rg61) + ",\"NETTAXIN\":" + (rg62) + "}','{\"EXIN\":" + (rg71) + ",\"NETTAXIN\":" + (rg72) + "}','{\"EXIN\":" + (rg81) + ",\"NETTAXIN\":" + (rg82) + "}',"+ayear+" );";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//Salary submit
public void SalaryUpdate(long TIN, int lf11, int lf12, int lf21, int lf22, int lf31, int lf32, int lf41, int lf42, int lf51, int lf52, int lf61, int lf62, int lf71, int lf72, int lf81, int lf82, int lf91, int lf92, int rg11, int rg12, int rg21, int rg22, int rg31, int rg32, int rg41, int rg42, int rg51, int rg52, int rg61, int rg62, int rg71, int rg72, int rg81, int rg82,int ayear) throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            String query = "update Salary set BASICPAY='{\"EXIN\":" + (lf11) + ",\"NETTAXIN\":" + (lf12) + "}',SPECIALPAY='{\"EXIN\":" + (lf21) + ",\"NETTAXIN\":" + (lf22) + "}',DEARNESSALLOWANCE='{\"EXIN\":" + (lf31) + ",\"NETTAXIN\":" + (lf32) + "}',CONVEYANCEALLOWANCE='{\"EXIN\":" + (lf41) + ",\"NETTAXIN\":" + (lf42) + "}',HOUSERENTALLOWANCE='{\"EXIN\":" + (lf51) + ",\"NETTAXIN\":" + (lf52) + "}',MEDICALALLOWANCE='{\"EXIN\":" + (lf61) + ",\"NETTAXIN\":" + (lf62) + "}',SERVENTALLOWANCE='{\"EXIN\":" + (lf71) + ",\"NETTAXIN\":" + (lf72) + "}',LEAVEALLOWANCE='{\"EXIN\":" + (lf81) + ",\"NETTAXIN\":" + (lf82) + "}',REWARD='{\"EXIN\":" + (lf91) + ",\"NETTAXIN\":" + (lf92) + "}',EDUCATIONALLOWANCE='{\"EXIN\":" + (rg11) + ",\"NETTAXIN\":" + (rg12) + "}',BONUS='{\"EXIN\":" + (rg21) + ",\"NETTAXIN\":" + (rg22) + "}',OTHERALLOWANCE='{\"EXIN\":" + (rg31) + ",\"NETTAXIN\":" + (rg32) + "}',EMPLOYERCONTRIBUTION='{\"EXIN\":" + (rg41) + ",\"NETTAXIN\":" + (rg42) + "}',INTERESTACCRUED='{\"EXIN\":" + (rg51) + ",\"NETTAXIN\":" + (rg52) + "}',INCOMETRANSPORT='{\"EXIN\":" + (rg61) + ",\"NETTAXIN\":" + (rg62) + "}',INCOMEACCOMMODATION='{\"EXIN\":" + (rg71) + ",\"NETTAXIN\":" + (rg72) + "}',OTHER='{\"EXIN\":" + (rg81) + ",\"NETTAXIN\":" + (rg82) + "}' where TIN=" + TIN + " and  ASSYEAR="+ayear+";";
            // String query="update Salary set BASICPAY='{\"EXIN\":"+(lf11)+",\"NETTAXIN\":"+(lf12)+"}',SPECIALPAY='{\"EXIN\":"+(lf21)+",\"NETTAXIN\":"+(lf22)+"}',DEARNESSALLOWANCE='{\"EXIN\":"+(lf31)+",\"NETTAXIN\":"+(lf32)+"}',CONVEYANCEALLOWANCE='{\"EXIN\":"+(lf41)+",\"NETTAXIN\":"+(lf42)+"}',HOUSERENTALLOWANCE='{\"EXIN\":"+(lf51)+",\"NETTAXIN\":"+(lf52)+"}',MEDICALALLOWANCE='{\"EXIN\":"+(lf61)+",\"NETTAXIN\":"+(lf62)+"}',SERVENTALLOWANCE='{\"EXIN\":"+(lf71)+",\"NETTAXIN\":"+(lf72)+"}',LEAVEALLOWANCE='{\"EXIN\":"+(lf81)+",\"NETTAXIN\":"+(lf82)+"}',REWARD='{\"EXIN\":"+(lf91)+",\"NETTAXIN\":"+(lf92)+"}',EDUCATIONALLOWANCE='{\"EXIN\":"+(rg11)+",\"NETTAXIN\":"+(rg12)+"}',BONUS='{\"EXIN\":"+(rg21)+",\"NETTAXIN\":"+(rg22)+"}',OTHERALLOWANCE='{\"EXIN\":"+(rg31)+",\"NETTAXIN\":"+(rg32)+"}',EMPLOYERCONTRIBUTION='{\"EXIN\":"+(rg41)+",\"NETTAXIN\":"+(rg42)+"}',INTERESTACCRUED='{\"EXIN\":"+(rg51)+",\"NETTAXIN\":"+(rg52)+"}',INCOMETRANSPORT='{\"EXIN\":"+(rg61)+",\"NETTAXIN\":"+(rg62)+"}',INCOMEACCOMMODATION='{\"EXIN\":"+(rg71)+",\"NETTAXIN\":"+(rg72)+"}',OTHER='{\"EXIN\":"+(rg81)+",\"NETTAXIN\":"+(rg82)+"}' where TIN="+TIN+";";
            // String query="update Salary set BASICPAY='{\"EXIN\":"+(lf11)+",\"NETTAXIN\":"+(lf12)+"}'where TIN="+TIN+"";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//Taxcredit submit
public void TaxCredit(long TIN, int lf1, int lf2, int lf3, int lf4, int lf5, int lf6, int rg1, int rg2, int rg3, int rg4, int rg5, ArrayList<String> rg6, ArrayList<Integer> rg7,int ayear) throws ClassNotFoundException, SQLException, JSONException {

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            String query = "INSERT INTO INVESTMENT_TAX_CREDIT_DONET VALUES(" + TIN + "," + lf1 + "," + lf2 + "," + lf3 + "," + lf4 + "," + lf5 + "," + lf6 + "," + rg1 + "," + rg2 + "," + rg3 + "," + rg4 + "," + rg5 + ",'{\"other\":[{\"name\":\"" + rg6.get(0) + "\",\"amount\":" + rg7.get(0) + "},{\"name\":\"" + rg6.get(1) + "\",\"amount\":" + rg7.get(1) + "},{\"name\":\"" + rg6.get(2) + "\",\"amount\":" + rg7.get(2) + "},{\"name\":\"" + rg6.get(3) + "\",\"amount\":" + rg7.get(3) + "},{\"name\":\"" + rg6.get(4) + "\",\"amount\":" + rg7.get(4) + "}]}',"+ayear+" )";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//Taxcredit submit
public void TaxCreditUpdate(long TIN, int lf1, int lf2, int lf3, int lf4, int lf5, int lf6, int rg1, int rg2, int rg3, int rg4, int rg5, ArrayList<String> rg6, ArrayList<Integer> rg7,int ayear) throws ClassNotFoundException, SQLException, JSONException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            //String  query="UPDATE  INVESTMENT_TAX_CREDIT_DONET SET LIFEINSURANCE="+lf1+",CONTRIBUTIONANNUUITY="+lf2+",PROVIDENTFUND1925="+lf3+",RECOGNIZEDPROVIDENTFUND="+lf4+",SUPERANNUTION="+lf5+",SHARESTOCK="+lf6+",DEPOSITPENSION="+rg1+",GROUPINSURANCE="+rg2+",ZAKATFUND="+rg3+",SAVINGCERTIFICATE="+rg4+",SAVINGSCHEMA="+rg5+",OTHER='{\"other\":[{\"name\":\""+rg6.get(0)+"\",\"amount\":"+rg7.get(0)+"},{\"name\":\""+rg6.get(1)+"\",\"amount\":"+rg7.get(1)+"},{\"name\":\""+rg6.get(2)+"\",\"amount\":"+rg7.get(2)+"},{\"name\":\""+rg6.get(3)+"\",\"amount\":"+rg7.get(3)+"},{\"name\":\""+rg6.get(4)+"\",\"amount\":"+rg7.get(4)+"}]}' where TIN="+TIN+"";
            String query = "UPDATE  INVESTMENT_TAX_CREDIT_DONET SET LIFEINSURANCE= ?,CONTRIBUTIONANNUUITY= ?,PROVIDENTFUND1925= ?,RECOGNIZEDPROVIDENTFUND= ?,SUPERANNUTION= ?,SHARESTOCK= ?,DEPOSITPENSION= ?,GROUPINSURANCE= ?,ZAKATFUND= ?,SAVINGCERTIFICATE= ?,SAVINGSCHEMA= ? ,OTHER='{\"other\":[{\"name\":\"" + rg6.get(0) + "\",\"amount\":" + rg7.get(0) + "},{\"name\":\"" + rg6.get(1) + "\",\"amount\":" + rg7.get(1) + "},{\"name\":\"" + rg6.get(2) + "\",\"amount\":" + rg7.get(2) + "},{\"name\":\"" + rg6.get(3) + "\",\"amount\":" + rg7.get(3) + "},{\"name\":\"" + rg6.get(4) + "\",\"amount\":" + rg7.get(4) + "}]}' where TIN=" + TIN + " and  ASSYEAR="+ayear+";";

//String query="UPDATE INVESTMENT_TAX_CREDIT_DONET SET LIFEINSURANCE=?  WHERE TIN="+TIN+" ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Integer.toString(lf1));
            pst.setString(2, Integer.toString(lf2));
            pst.setString(3, Integer.toString(lf3));
            pst.setString(4, Integer.toString(lf4));
            pst.setString(5, Integer.toString(lf5));
            pst.setString(6, Integer.toString(lf6));
            pst.setString(7, Integer.toString(rg1));
            pst.setString(8, Integer.toString(rg2));
            pst.setString(9, Integer.toString(rg3));
            pst.setString(10, Integer.toString(rg4));
            pst.setString(11, Integer.toString(lf5));
            pst.executeUpdate();

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//IncomeAssesse submit
public void IncomeAssessee(long TIN, double Salarylf1, double lf2, double HousePropertylf3, double lf4, double lf5, double lf6, double lf7, double lf8, double lf9, double rg1, double rg2, double rg3, double rg4, double TaxCreditrg5, double rg6, ArrayList<Integer> TaxPayment, double rg8, double rg9, double rg10,int ayear) throws ClassNotFoundException, SQLException {

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {

            query = "insert into INCOME_OF_ASSEESSEE values (" + TIN + "," + Salarylf1 + "," + lf2 + "," + HousePropertylf3 + "," + lf4 + "," + lf5 + "," + lf6 + "," + lf7 + "," + lf8 + "," + lf9 + "," + rg1 + "," + rg2 + "," + rg3 + "," + rg4 + "," + TaxCreditrg5 + "," + rg6 + ",'{\"TaxPayment\":{\"TaxReducted\":" + TaxPayment.get(0) + ",\"AdvanceTax\":" + TaxPayment.get(1) + ",\"TaxPaidReturn\":" + TaxPayment.get(2) + ",\"TaxRefund\":" + TaxPayment.get(3) + "}}'," + rg8 + "," + rg9 + "," + rg10 + ","+ayear+")";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString() );
    }

}

//IncomeAssesse update
public void IncomeAssesseeUpdate(long TIN, int Salarylf1, int lf2, int HousePropertylf3, int lf4, int lf5, int lf6, int lf7, int lf8, int lf9, int rg1, int rg2, int rg3, int rg4, int TaxCreditrg5, int rg6, ArrayList<Integer> TaxPayment, int rg8, int rg9, int rg10,int ayear) throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            //    query="update INCOME_OF_ASSEESSEE set SALARIES="+Salarylf1+", INTERSETSECURITIES="+lf2+", HOUSEPROPERTY="+HousePropertylf3+"  where TIN="+TIN+" ";
            query = "update INCOME_OF_ASSEESSEE set SALARIES=" + Salarylf1 + ",INTERSETSECURITIES=" + lf2 + ",HOUSEPROPERTY=" + HousePropertylf3 + ",AGRICULTURALINCOME=" + lf4 + ",BUSINESSINCOME=" + lf5 + ",SHAREPROFIT=" + lf6 + ",SPOUSEINCOME=" + lf7 + ",CAPITALGAINS=" + lf8 + ",OTHERSOURCEINCOME=" + lf9 + ",TOTAL19=" + rg1 + ",FORIEGNINCOME=" + rg2 + ",TOTALINCOME1011=" + rg3 + ",TAXLEVIABLE=" + rg4 + ",TAXREBATE=" + TaxCreditrg5 + ",TAXPAYABLE=" + rg6 + ",TAXPAYYMENT='{\"TaxPayment\":{\"TaxReducted\":" + TaxPayment.get(0) + ",\"AdvanceTax\":" + TaxPayment.get(1) + ",\"TaxPaidReturn\":" + TaxPayment.get(2) + ",\"TaxRefund\":" + TaxPayment.get(3) + "}}',DIFFEREN1516=" + rg8 + ",TAXFREEINCOME=" + rg9 + ",TAXPAIDLASTYEAR=" + rg10 + "  where TIN=" + TIN + " and  ASSYEAR="+ayear+"; ";

            // query="update INCOME_OF_ASSEESSEE set SALARIES=?,INTERSETSECURITIES=?,HOUSEPROPERTY=?,AGRICULTURALINCOME=?,BUSINESSINCOME=?,SHAREPROFIT=?,SPOUSEINCOME=?,CAPITALGAINS=?,OTHERSOURCEINCOME=?,TOTAL19=?,FORIEGNINCOME=?,TOTALINCOME1011=?,TAXLEVIABLE=?,TAXREBATE=?,TAXPAYABLE=?,TAXPAYYMENT='{\"TaxPayment\":{\"TaxReducted\":"+TaxPayment.get(0)+",\"AdvanceTax\":"+TaxPayment.get(1)+",\"TaxPaidReturn\":"+TaxPayment.get(2)+",\"TaxRefund\":"+TaxPayment.get(3)+"}}',DIFFEREN1516=?,TAXFREEINCOME=?,TAXPAIDLASTYEAR=?  where TIN="+TIN+" ";
            PreparedStatement pst = con.prepareStatement(query);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update SuccessFully");
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }

}

//IncomeAssesse submit
public void Form(long TIN, int lf1, String slf1, int lf2, String slf2, int lf3, String slf3, int lf4, String slf4, int lf5, String slf5, int lf6, String slf6, int rg1, String srg1, int rg2, String srg2, int rg3, String srg3, int rg4, String srg4, int rg5, String srg5, int rg6, String srg6, int rg7, String srg7,int ayear) throws ClassNotFoundException, SQLException {
    int summ = lf1 + lf2 + lf3 + lf4 + lf5 + lf6 + rg1 + rg2 + rg3 + rg4 + rg5 + rg6 + rg7;
    try {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        String query1;
        if (con != null) {
            query = "INSERT INTO FORM VALUES(" + TIN + ",'{\"amount\":" + lf1 + ",\"comment\":\"" + slf1 + "\"}','{\"amount\":" + lf2 + ",\"comment\":\"" + slf2 + "\"}','{\"amount\":" + lf3 + ",\"comment\":\"" + slf3 + "\"}','{\"amount\":" + lf4 + ",\"comment\":\"" + slf4 + "\"}','{\"amount\":" + lf5 + ",\"comment\":\"" + slf5 + "\"}','{\"amount\":" + lf6 + ",\"comment\":\"" + slf6 + "\"}','{\"amount\":" + rg1 + ",\"comment\":\"" + srg1 + "\"}','{\"amount\":" + rg2 + ",\"comment\":\"" + srg2 + "\"}','{\"amount\":" + rg3 + ",\"comment\":\"" + srg3 + "\"}','{\"amount\":" + rg4 + ",\"comment\":\"" + srg4 + "\"}','{\"amount\":" + rg5 + ",\"comment\":\"" + srg5 + "\"}','{\"amount\":" + rg6 + ",\"comment\":\"" + srg6 + "\"}','{\"amount\":" + rg7 + ",\"comment\":\"" + srg7 + "\"}', "+ayear+" );";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted SuccessFully");
            query1 = "update ASSETLIABILITY set FAMILYEXPENDITURE=" + summ + "  ";
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.executeUpdate();

        }

    } catch (Exception ee) {
        JOptionPane.showMessageDialog(null, ee.toString());

    }

}

//IncomeAssesse submit
public void FormUpdate(long TIN, int lf1, String slf1, int lf2, String slf2, int lf3, String slf3, int lf4, String slf4, int lf5, String slf5, int lf6, String slf6, int rg1, String srg1, int rg2, String srg2, int rg3, String srg3, int rg4, String srg4, int rg5, String srg5, int rg6, String srg6, int rg7, String srg7,int ayear) throws ClassNotFoundException, SQLException {
    int a = 5;
    try {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            query = "UPDATE  FORM SET PARSONALFOODEXPENSE='{\"amount\":" + lf1 + ",\"comment\":\"" + slf1 + "\"}',TAXPAIDDEDUCTION='{\"amount\":" + lf2 + ",\"comment\":\"" + slf2 + "\"}',ACCOMMODATIONEXPENSES='{\"amount\":" + lf3 + ",\"comment\":\"" + slf3 + "\"}',TRANSPORTEXPENSE='{\"amount\":" + lf4 + ",\"comment\":\"" + slf4 + "\"}',ELECTRICALBILLRESIDENCE='{\"amount\":" + lf5 + ",\"comment\":\"" + slf5 + "\"}', WASABILLRESIDENCE='{\"amount\":" + lf6 + ",\"comment\":\"" + slf6 + "\"}',GASBILLRESIDENCE='{\"amount\":" + rg1 + ",\"comment\":\"" + srg1 + "\"}',TELEPHONEBILLRESIDENCE='{\"amount\":" + rg2 + ",\"comment\":\"" + srg2 + "\"}',EDUCATIONEXPENSECHILD='{\"amount\":" + rg3 + ",\"comment\":\"" + srg3 + "\"}',BANKLOANINSTALLMENT ='{\"amount\":" + rg4 + ",\"comment\":\"" + srg4 + "\"}',FESTIVALOTHEREXPENSE='{\"amount\":" + rg5 + ",\"comment\":\"" + srg5 + "\"}',MEDICALPURPOSE='{\"amount\":" + rg6 + ",\"comment\":\"" + srg6 + "\"}',TOTALEXPENSE='{\"amount\":" + rg7 + ",\"comment\":\"" + srg7 + "\"}' WHERE TIN=" + TIN + " and ASSYEAR="+ayear+";";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update SuccessFully");
        }

    } catch (Exception ee) {
        JOptionPane.showMessageDialog(null, ee.toString());

    }

}

//Assetliability submit
// public void  AssetLiability(int TIN, ArrayList<Integer> BC,ArrayList<String> left2s, ArrayList<Integer> left2i1, ArrayList<Integer> left2i2,ArrayList<String> left3s, ArrayList<Integer> left3i1,ArrayList<String> left4s, ArrayList<Integer> left4i1,ArrayList<Integer> left5i,ArrayList<String> left6s, ArrayList<Integer> left6i1,ArrayList<String> left7s, ArrayList<Integer> left7i1,ArrayList<Integer> left7i2,ArrayList<Integer> value8,ArrayList<Integer> value9,ArrayList<Integer> left10i,ArrayList<String> rights1, ArrayList<Integer> right1i1,ArrayList<Integer> right2i,ArrayList<Integer> valuer3,ArrayList<Integer> valuer4,ArrayList<Integer> valuer5,ArrayList<Integer> valuer6,ArrayList<Integer> valuer71,ArrayList<Integer> valuer72,ArrayList<Integer> valuer8,ArrayList<Integer> right9i,ArrayList<Integer> valuer10) throws ClassNotFoundException, SQLException{
public void AssetLiability(long TIN, ArrayList<Integer> BC, String[] left2s, int[] left2i1, int[] left2i2, String[] left3s, int[] left3i1, String[] left4s, int[] left4i1, int[] left5i, String[] left6s, int[] left6i1, String[] left7s, int[] left7i1, int[] left7i2, ArrayList<Integer> value8, ArrayList<Integer> value9, int[] left10i, String[] rights1, int[] right1i1, int[] right2i, ArrayList<Integer> valuer3, ArrayList<Integer> valuer4, ArrayList<Integer> valuer5, ArrayList<Integer> valuer6, int[] valuer7i, ArrayList<Integer> valuer8, int[] right9i, ArrayList<Integer> valuer10,int ayear) throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        query = "INSERT INTO ASSETLIABILITY VALUES(" + TIN + "," + BC.get(0) + ",'{\"shareholding\":[{\"name\":\"" + left2s[0] + "\",\"share\":" + left2i1[0] + ",\"cost\":" + left2i2[0] + "},{\"name\":\"" + left2s[1] + "\",\"share\":" + left2i1[1] + ",\"cost\":" + left2i2[1] + "},{\"name\":\"" + left2s[2] + "\",\"share\":" + left2i1[2] + ",\"cost\":" + left2i2[2] + "},{\"name\":\"" + left2s[3] + "\",\"share\":" + left2i1[3] + ",\"cost\":" + left2i2[3] + "},{\"name\":\"" + left2s[4] + "\",\"share\":" + left2i1[4] + ",\"cost\":" + left2i2[4] + "}]}','{\"nonagricultural\":[{\"name\":\"" + left3s[0] + "\",\"cost\":" + left3i1[0] + "},{\"name\":\"" + left3s[1] + "\",\"cost\":" + left3i1[1] + "},{\"name\":\"" + left3s[2] + "\",\"cost\":" + left3i1[2] + "},{\"name\":\"" + left3s[3] + "\",\"cost\":" + left3i1[3] + "},{\"name\":\"" + left3s[4] + "\",\"cost\":" + left3i1[4] + "}]}','{\"agricultural\":[{\"name\":\"" + left4s[0] + "\",\"cost\":" + left4i1[0] + "},{\"name\":\"" + left4s[1] + "\",\"cost\":" + left4i1[1] + "},{\"name\":\"" + left4s[2] + "\",\"cost\":" + left4i1[2] + "},{\"name\":\"" + left4s[3] + "\",\"cost\":" + left4i1[3] + "},{\"name\":\"" + left4s[4] + "\",\"cost\":" + left4i1[4] + "}]}','{\"investment\":[{\"name\":\"share/debentures\",\"cost\":" + left5i[0] + "},{\"name\":\"insurance/saving Certificate\",\"cost\":" + left5i[1] + "},{\"name\":\"saving chema(DPS)\",\"cost\":" + left5i[2] + "},{\"name\":\"provident fund\",\"cost\":" + left5i[3] + "},{\"name\":\"Contribution to anual fund\",\"cost\":" + left5i[4] + "},{\"name\":\"Group insurance\",\"cost\":" + left5i[5] + "}]}','{\"motor\":[{\"name\":\"" + left6s[0] + "\",\"cost\":" + left6i1[0] + "},{\"name\":\"" + left6s[1] + "\",\"cost\":" + left6i1[1] + "},{\"name\":\"" + left6s[2] + "\",\"cost\":" + left6i1[2] + "},{\"name\":\"" + left6s[3] + "\",\"cost\":" + left6i1[3] + "},{\"name\":\"" + left6s[4] + "\",\"cost\":" + left6i1[4] + "}]}','{\"jwellery\":[{\"name\":\"" + left7s[0] + "\",\"amount\":" + left7i1[0] + ",\"cost\":" + left7i2[0] + "},{\"name\":\"" + left7s[1] + "\",\"amount\":" + left7i1[1] + ",\"cost\":" + left7i2[1] + "},{\"name\":\"" + left7s[2] + "\",\"amount\":" + left7i1[2] + ",\"cost\":" + left7i2[2] + "},{\"name\":\"" + left7s[3] + "\",\"amount\":" + left7i1[3] + ",\"cost\":" + left7i2[3] + "},{\"name\":\"" + left7s[4] + "\",\"amount\":" + left7i1[4] + ",\"cost\":" + left7i2[4] + "}]}'," + value8.get(0) + "," + value9.get(0) + ",'{\"cashasset\":[{\"name\":\"Cash in Hand\",\"cost\":" + left10i[0] + "},{\"name\":\"Cash at bank\",\"cost\":" + left10i[1] + "},{\"name\":\"other deposits\",\"cost\":" + left10i[2] + "}]}','{\"other\":[{\"name\":\"" + rights1[0] + "\",\"cost\":" + right1i1[0] + "},{\"name\":\"" + rights1[1] + "\",\"cost\":" + right1i1[1] + "},{\"name\":\"" + rights1[2] + "\",\"cost\":" + right1i1[2] + "},{\"name\":\"" + rights1[3] + "\",\"cost\":" + right1i1[3] + "},{\"name\":\"" + rights1[4] + "\",\"cost\":" + right1i1[4] + "}]}','{\"lessliability\":[{\"name\":\"Mortgages secured on property or land\",\"cost\":" + right2i[0] + "},{\"name\":\"Unsecured loans\",\"cost\":" + right2i[1] + "},{\"name\":\"Loan from provident Fund\",\"cost\":" + right2i[2] + "},{\"name\":\"other\",\"cost\":" + right2i[3] + "}]}'," + valuer3.get(0) + "," + valuer4.get(0) + "," + valuer5.get(0) + "," + valuer6.get(0) + ",'{\"member\":[{\"name\":\"Adult\",\"number\":" + valuer7i[0] + "},{\"name\":\"Child\",\"number\":" + valuer7i[1] + "}]}'," + valuer8.get(0) + ",'{\"sourcefund\":[{\"name\":\"shown return income\",\"cost\":" + right9i[0] + "},{\"name\":\"Tax free income\",\"cost\":" + right9i[1] + "},{\"name\":\"other reciepts\",\"cost\":" + right9i[2] + "}]}'," + valuer10.get(0) + ","+ayear+" );";
        //  query="INSERT INTO ASSETLIABILITY VALUES("+TIN+",76,'{\"shareholding\":[{\"name\":\""+left2s.get(0)+"\",\"share\":"+left2i1.get(0)+",\"cost\":"+left2i2.get(0)+"},{\"name\":\""+left2s.get(1)+"\",\"share\":"+left2i1.get(1)+",\"cost\":"+left2i2.get(1)+"},{\"name\":\""+left2s.get(2)+"\",\"share\":"+left2i1.get(2)+",\"cost\":"+left2i2.get(2)+"},{\"name\":\""+left2s.get(3)+"\",\"share\":"+left2i1.get(3)+",\"cost\":"+left2i2.get(3)+"},{\"name\":\""+left2s.get(4)+"\",\"share\":"+left2i1.get(4)+",\"cost\":"+left2i2.get(4)+"}]}','{\"nonagricultural\":[{\"name\":\""+left3s.get(0)+"\",\"cost\":"+left3i1.get(0)+"},{\"name\":\""+left3s.get(1)+"\",\"cost\":"+left3i1.get(1)+"},{\"name\":\""+left3s.get(2)+"\",\"cost\":"+left3i1.get(2)+"},{\"name\":\""+left3s.get(3)+"\",\"cost\":"+left3i1.get(3)+"},{\"name\":\""+left3s.get(4)+"\",\"cost\":"+left3i1.get(4)+"}]}','{\"agricultural\":[{\"name\":\""+left4s.get(0)+"\",\"cost\":"+left4i1.get(0)+"},{\"name\":\""+left4s.get(1)+"\",\"cost\":"+left4i1.get(1)+"},{\"name\":\""+left4s.get(2)+"\",\"cost\":"+left4i1.get(2)+"},{\"name\":\""+left4s.get(3)+"\",\"cost\":"+left4i1.get(3)+"},{\"name\":\""+left4s.get(4)+"\",\"cost\":"+left4i1.get(4)+"}]}','{\"investment\":[{\"name\":\"share/debentures\",\"cost\":"+left5i.get(0)+"},{\"name\":\"insurance/saving Certificate\",\"cost\":"+left5i.get(1)+"},{\"name\":\"saving chema(DPS)\",\"cost\":"+left5i.get(2)+"},{\"name\":\"provident fund\",\"cost\":"+left5i.get(3)+"},{\"name\":\"Contribution to anual fund\",\"cost\":"+left5i.get(4)+"},{\"name\":\"Group insurance\",\"cost\":"+left5i.get(5)+"}]}','{\"motor\":[{\"name\":\""+left6s.get(0)+"\",\"cost\":"+left6i1.get(0)+"},{\"name\":\""+left6s.get(1)+"\",\"cost\":"+left6i1.get(1)+"},{\"name\":\""+left6s.get(2)+"\",\"cost\":"+left6i1.get(2)+"},{\"name\":\""+left6s.get(3)+"\",\"cost\":"+left6i1.get(3)+"},{\"name\":\""+left6s.get(4)+"\",\"cost\":"+left6i1.get(4)+"}]}','{\"jwellery\":[{\"name\":\""+left7s.get(0)+"\",\"amount\":"+left7i1.get(0)+",\"cost\":"+left7i2.get(0)+"},{\"name\":\""+left7s.get(1)+"\",\"amount\":"+left7i1.get(1)+",\"cost\":"+left7i2.get(1)+"},{\"name\":\""+left7s.get(2)+"\",\"amount\":"+left7i1.get(2)+",\"cost\":"+left7i2.get(2)+"},{\"name\":\""+left7s.get(3)+"\",\"amount\":"+left7i1.get(3)+",\"cost\":"+left7i2.get(3)+"},{\"name\":\""+left7s.get(4)+"\",\"amount\":"+left7i1.get(4)+",\"cost\":"+left7i2.get(4)+"}]}',"+value8.get(0)+","+value9.get(0)+",'{\"cashasset\":[{\"name\":\"Cash in Hand\",\"cost\":"+left10i.get(0)+"},{\"name\":\"Cash at bank\",\"cost\":"+left10i.get(1)+"},{\"name\":\"other deposits\",\"cost\":"+left10i.get(2)+"}]}','{\"other\":[{\"name\":98,\"cost\":87},{\"name\":76,\"cost\":7554},{\"name\":87,\"cost\":998},{\"name\":jj,\"cost\":87},{\"name\":hgf,\"cost\":98}]}','{\"lessliability\":[{\"name\":\"Mortgages secured on property or land\",\"cost\":"+right2i.get(0)+"},{\"name\":\"Unsecured loans\",\"cost\":"+right2i.get(1)+"},{\"name\":\"Loan from provident Fund\",\"cost\":"+right2i.get(2)+"},{\"name\":\"other\",\"cost\":"+right2i.get(3)+"}]}',"+valuer3.get(0)+","+valuer4.get(0)+","+valuer5.get(0)+","+valuer6.get(0)+",'{\"member\":[{\"name\":\"Adult\",\"number\":"+valuer71.get(0)+"},{\"name\":\"Child\",\"number\":"+valuer72.get(0)+"}]}',"+valuer8.get(0)+",'{\"sourcefund\":[{\"name\":\"shown return income\",\"cost\":"+right9i.get(0)+"},{\"name\":\"Tax free income\",\"cost\":"+right9i.get(1)+"},{\"name\":\"other reciepts\",\"cost\":"+right9i.get(2)+"}]}',"+valuer10.get(0)+");";

        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Inserted SuccessFully");

    } catch (Exception ee) {
        System.out.println(ee.toString() );
    }

}

//Assetliability Update
// public void  AssetLiability(int TIN, ArrayList<Integer> BC,ArrayList<String> left2s, ArrayList<Integer> left2i1, ArrayList<Integer> left2i2,ArrayList<String> left3s, ArrayList<Integer> left3i1,ArrayList<String> left4s, ArrayList<Integer> left4i1,ArrayList<Integer> left5i,ArrayList<String> left6s, ArrayList<Integer> left6i1,ArrayList<String> left7s, ArrayList<Integer> left7i1,ArrayList<Integer> left7i2,ArrayList<Integer> value8,ArrayList<Integer> value9,ArrayList<Integer> left10i,ArrayList<String> rights1, ArrayList<Integer> right1i1,ArrayList<Integer> right2i,ArrayList<Integer> valuer3,ArrayList<Integer> valuer4,ArrayList<Integer> valuer5,ArrayList<Integer> valuer6,ArrayList<Integer> valuer71,ArrayList<Integer> valuer72,ArrayList<Integer> valuer8,ArrayList<Integer> right9i,ArrayList<Integer> valuer10) throws ClassNotFoundException, SQLException{
public void AssetLiabilityUpdate(long TIN, ArrayList<Integer> BC, String[] left2s, int[] left2i1, int[] left2i2, String[] left3s, int[] left3i1, String[] left4s, int[] left4i1, int[] left5i, String[] left6s, int[] left6i1, String[] left7s, int[] left7i1, int[] left7i2, ArrayList<Integer> value8, ArrayList<Integer> value9, int[] left10i, String[] rights1, int[] right1i1, int[] right2i, ArrayList<Integer> valuer3, ArrayList<Integer> valuer4, ArrayList<Integer> valuer5, ArrayList<Integer> valuer6, int[] valuer7i, ArrayList<Integer> valuer8, int[] right9i, ArrayList<Integer> valuer10,int ayear) throws ClassNotFoundException, SQLException {

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        query = "update ASSETLIABILITY set BUSINESSCAPITAL=" + BC.get(0) + ",SHAREHOLDING='{\"shareholding\":[{\"name\":\"" + left2s[0] + "\",\"share\":" + left2i1[0] + ",\"cost\":" + left2i2[0] + "},{\"name\":\"" + left2s[1] + "\",\"share\":" + left2i1[1] + ",\"cost\":" + left2i2[1] + "},{\"name\":\"" + left2s[2] + "\",\"share\":" + left2i1[2] + ",\"cost\":" + left2i2[2] + "},{\"name\":\"" + left2s[3] + "\",\"share\":" + left2i1[3] + ",\"cost\":" + left2i2[3] + "},{\"name\":\"" + left2s[4] + "\",\"share\":" + left2i1[4] + ",\"cost\":" + left2i2[4] + "}]}',NONAGRICULTURAL='{\"nonagricultural\":[{\"name\":\"" + left3s[0] + "\",\"cost\":" + left3i1[0] + "},{\"name\":\"" + left3s[1] + "\",\"cost\":" + left3i1[1] + "},{\"name\":\"" + left3s[2] + "\",\"cost\":" + left3i1[2] + "},{\"name\":\"" + left3s[3] + "\",\"cost\":" + left3i1[3] + "},{\"name\":\"" + left3s[4] + "\",\"cost\":" + left3i1[4] + "}]}',AGRICULTURAL='{\"agricultural\":[{\"name\":\"" + left4s[0] + "\",\"cost\":" + left4i1[0] + "},{\"name\":\"" + left4s[1] + "\",\"cost\":" + left4i1[1] + "},{\"name\":\"" + left4s[2] + "\",\"cost\":" + left4i1[2] + "},{\"name\":\"" + left4s[3] + "\",\"cost\":" + left4i1[3] + "},{\"name\":\"" + left4s[4] + "\",\"cost\":" + left4i1[4] + "}]}',INVESTMENT='{\"investment\":[{\"name\":\"share/debentures\",\"cost\":" + left5i[0] + "},{\"name\":\"insurance/saving Certificate\",\"cost\":" + left5i[1] + "},{\"name\":\"saving chema(DPS)\",\"cost\":" + left5i[2] + "},{\"name\":\"provident fund\",\"cost\":" + left5i[3] + "},{\"name\":\"Contribution to anual fund\",\"cost\":" + left5i[4] + "},{\"name\":\"Group insurance\",\"cost\":" + left5i[5] + "}]}',MOTOR='{\"motor\":[{\"name\":\"" + left6s[0] + "\",\"cost\":" + left6i1[0] + "},{\"name\":\"" + left6s[1] + "\",\"cost\":" + left6i1[1] + "},{\"name\":\"" + left6s[2] + "\",\"cost\":" + left6i1[2] + "},{\"name\":\"" + left6s[3] + "\",\"cost\":" + left6i1[3] + "},{\"name\":\"" + left6s[4] + "\",\"cost\":" + left6i1[4] + "}]}',JWELLERY='{\"jwellery\":[{\"name\":\"" + left7s[0] + "\",\"amount\":" + left7i1[0] + ",\"cost\":" + left7i2[0] + "},{\"name\":\"" + left7s[1] + "\",\"amount\":" + left7i1[1] + ",\"cost\":" + left7i2[1] + "},{\"name\":\"" + left7s[2] + "\",\"amount\":" + left7i1[2] + ",\"cost\":" + left7i2[2] + "},{\"name\":\"" + left7s[3] + "\",\"amount\":" + left7i1[3] + ",\"cost\":" + left7i2[3] + "},{\"name\":\"" + left7s[4] + "\",\"amount\":" + left7i1[4] + ",\"cost\":" + left7i2[4] + "}]}',FURNITURE=" + value8.get(0) + ",ELECTRICEQUIPMENT=" + value9.get(0) + ",CASHASSETOUTBUSINESS='{\"cashasset\":[{\"name\":\"Cash in Hand\",\"cost\":" + left10i[0] + "},{\"name\":\"Cash at bank\",\"cost\":" + left10i[1] + "},{\"name\":\"other deposits\",\"cost\":" + left10i[2] + "}]}',OTHERASSET='{\"other\":[{\"name\":\"" + rights1[0] + "\",\"cost\":" + right1i1[0] + "},{\"name\":\"" + rights1[1] + "\",\"cost\":" + right1i1[1] + "},{\"name\":\"" + rights1[2] + "\",\"cost\":" + right1i1[2] + "},{\"name\":\"" + rights1[3] + "\",\"cost\":" + right1i1[3] + "},{\"name\":\"" + rights1[4] + "\",\"cost\":" + right1i1[4] + "}]}',LESSLIABILITY='{\"lessliability\":[{\"name\":\"Mortgages secured on property or land\",\"cost\":" + right2i[0] + "},{\"name\":\"Unsecured loans\",\"cost\":" + right2i[1] + "},{\"name\":\"Loan from provident Fund\",\"cost\":" + right2i[2] + "},{\"name\":\"other\",\"cost\":" + right2i[3] + "}]}',NETWEALTHTHISYEAR=" + valuer3.get(0) + ",NETWEALTHLASTYEAR=" + valuer4.get(0) + ",ACCRETIONWEALTH=" + valuer5.get(0) + ",FAMILYEXPENDITURE=" + valuer6.get(0) + ", DEPENDEDMEMBER='{\"member\":[{\"name\":\"Adult\",\"number\":" + valuer7i[0] + "},{\"name\":\"Child\",\"number\":" + valuer7i[1] + "}]}',ACCRETIONWEALTH1415=" + valuer8.get(0) + ",SOURCEFUND='{\"sourcefund\":[{\"name\":\"shown return income\",\"cost\":" + right9i[0] + "},{\"name\":\"Tax free income\",\"cost\":" + right9i[1] + "},{\"name\":\"other reciepts\",\"cost\":" + right9i[2] + "}]}',DIFFER=" + valuer10.get(0) + "  where TIN=" + TIN + " and  ASSYEAR="+ayear+";";

        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Update SuccessFully");

    } catch (Exception ee) {
        System.out.println(ee.toString() );
    }

}
//EMPLOYEE submit

public boolean AsseeRegistration(String type, String values2, long valuei3, long valuei4, long valuei5, int valuei6, String values7, String values8, String values9, String values10, String values11, String values12, long valuei12nin, String values13, String values14, String values15, String values16, String values17, long valuei18, long valuei19, long valuei20, byte[] immAsBytes) throws ClassNotFoundException, SQLException {
    boolean a = false;
    try {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            query = "insert into EMPLOYEE VALUES('" + type + "','" + values2 + "'," + valuei3 + "," + valuei4 + "," + valuei5 + "," + valuei6 + ",'" + values7 + "','" + values8 + "','" + values9 + "','" + values10 + "','" + values11 + "','{\"whname\":{\"name\":\"" + values12 + "\",\"TIN\":" + valuei12nin + "}}','" + values13 + "','" + values14 + "','" + values15 + "','" + values16 + "','" + values17 + "'," + valuei18 + "," + valuei19 + "," + valuei20 + ",?);";
            PreparedStatement pst = con.prepareStatement(query);
            ByteArrayInputStream bais = new ByteArrayInputStream(immAsBytes);
            pst.setBinaryStream(1, bais, immAsBytes.length);
            pst.executeUpdate();
            a = true;
        }

    } catch (Exception ee) {
        System.out.println(ee.toString());
    }
    return a;
}

//EMPLOYEE Update
public boolean AsseeRegistrationUpdate(String type, String values2, long valuei3, long valuei4, long valuei5, int valuei6, String values7, String values8, String values9, String values10, String values11, String values12, long valuei12nin, String values13, String values14, String values15, String values16, String values17, long valuei18, long valuei19, long valuei20, byte[] immAsBytes) throws ClassNotFoundException, SQLException {
    boolean a = false;
    try {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            query = "UPDATE  EMPLOYEE SET  TYPE='" + type + "',NAME='" + values2 + "',NID=" + valuei3 + ", UTIN=" + valuei4 + ",CIRCLE=" + valuei6 + ",TAXZONE='" + values7 + "',ASSESSMENTYEAR='" + values8 + "',RESIDENTIALSTATUS='" + values9 + "',STATUS='" + values10 + "',NAMEBUSINESS='" + values11 + "',WIFEHUSBANDNAME='{\"whname\":{\"name\":\"" + values12 + "\",\"TIN\":" + valuei12nin + "}}',FATHERNAME='" + values13 + "',MOTHERNAME='" + values14 + "',DOB='" + values15 + "',ADDRESSPRESENT='" + values16 + "',ADDRESSPERMANENT='" + values17 + "',TELEPHONEOFFICE=" + valuei18 + ",TELEPHONERESIDENTIAL=" + valuei19 + ",VATNUMBER=" + valuei20 + " ,IMAGE=?   where  TIN=" + valuei5 + " ;";
//query= "Update EMPLOYEE SET ";
            PreparedStatement pst = con.prepareStatement(query);
            ByteArrayInputStream bais = new ByteArrayInputStream(immAsBytes);
            pst.setBinaryStream(1, bais, immAsBytes.length);
            pst.executeUpdate();
            a = true;
        }

    } catch (Exception ee) {
        System.out.println(ee.toString());
    }
    return a;
}
//EMPLOYEE salary retrieve

public String[] SALARYRETURN(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[18];
    int test = 0;
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        if (con != null) {
            String querymax = "select * from Salary where TIN=" + TIN + " AND ASSYEAR="+ayear+" ";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);

            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("TIN");
                sal[1] = rrr.getString("BASICPAY");
                sal[2] = rrr.getString("SPECIALPAY");
                sal[3] = rrr.getString("DEARNESSALLOWANCE");
                sal[4] = rrr.getString("CONVEYANCEALLOWANCE");
                sal[5] = rrr.getString("HOUSERENTALLOWANCE");
                sal[6] = rrr.getString("MEDICALALLOWANCE");
                sal[7] = rrr.getString("SERVENTALLOWANCE");
                sal[8] = rrr.getString("LEAVEALLOWANCE");
                sal[9] = rrr.getString("REWARD");
                sal[10] = rrr.getString("EDUCATIONALLOWANCE");
                sal[11] = rrr.getString("BONUS");
                sal[12] = rrr.getString("OTHERALLOWANCE");
                sal[13] = rrr.getString("EMPLOYERCONTRIBUTION");
                sal[14] = rrr.getString("INTERESTACCRUED");
                sal[15] = rrr.getString("INCOMETRANSPORT");
                sal[16] = rrr.getString("INCOMEACCOMMODATION");
                sal[17] = rrr.getString("OTHER");
            }
            if (test == 0) {
                sal[0] = "-1";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {
        System.out.println("Sorry sor no data fund");

    }
    return (sal);
}

//EMPLOYEE houseproperty retrieve
public String[] HOUSEPROPERTYRETURN(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[10];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "SELECT * FROM HOUSE_PROPERTY_INCOME WHERE TIN=" + TIN + "  AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("INCOME");
                sal[1] = rrr.getString("CLAIMED");

                //out=rrr.getString("BASICPAY");
            }
            if (test == 0) {
                sal[0] = "-1";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {
        System.out.println("Sorry sor no data fund");

    }
    return (sal);
}

//EMPLOYEE TAXDIBATE retrieve
public String[] TAXDIBATE(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[17];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from INVESTMENT_TAX_CREDIT_DONET WHERE TIN=" + TIN + "  AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("TIN");
                sal[1] = rrr.getString("LIFEINSURANCE");
                sal[2] = rrr.getString("CONTRIBUTIONANNUUITY");
                sal[3] = rrr.getString("PROVIDENTFUND1925");
                sal[4] = rrr.getString("RECOGNIZEDPROVIDENTFUND");
                sal[5] = rrr.getString("SUPERANNUTION");
                sal[6] = rrr.getString("SHARESTOCK");
                sal[7] = rrr.getString("DEPOSITPENSION");
                sal[8] = rrr.getString("GROUPINSURANCE");
                sal[9] = rrr.getString("ZAKATFUND");
                sal[10] = rrr.getString("SAVINGCERTIFICATE");
                sal[11] = rrr.getString("SAVINGSCHEMA");
                sal[12] = rrr.getString("OTHER");
            }
            if (test == 0) {
                sal[0] = "-1";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {
        System.out.println("Sorry sor no data fund");

    }
    return (sal);
}

// Assetliavility retrieve
public int[] Assetliavilityy(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    int[] sal = new int[17];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from ASSETLIABILITY WHERE TIN=" + TIN + "  AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                //System.out.print(rrr.getString("BASICPAY"));
                sal[0] = rrr.getInt("NETWEALTHTHISYEAR");

                //out=rrr.getString("BASICPAY");
            }
            if (test == 0) {
                sal[0] = -1;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {
        System.out.println("Sorry sor no data fund");

    }
    return (sal);
}

// Employe retrieve
public int EMPLOYEE(long TIN) throws ClassNotFoundException, SQLException {
    int test = 0;
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from EMPLOYEE WHERE TIN='" + TIN + "';";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);

            while (rrr.next()) {
                test = 1;
                //System.out.print(rrr.getString("BASICPAY"));

                //out=rrr.getString("BASICPAY");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (test);
}

// Registration result
public String[] RegistrationReturn(long TIN) throws ClassNotFoundException, SQLException {
    String[] sal = new String[21];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from EMPLOYEE WHERE TIN='" + TIN + "';";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);

            while (rrr.next()) {
                sal[0] = rrr.getString("TYPE");
                sal[1] = rrr.getString("NAME");
                sal[2] = rrr.getString("NID");
                sal[3] = rrr.getString("UTIN");
                sal[4] = rrr.getString("TIN");
                sal[5] = rrr.getString("CIRCLE");
                sal[6] = rrr.getString("TAXZONE");
                sal[7] = rrr.getString("ASSESSMENTYEAR");
                sal[8] = rrr.getString("RESIDENTIALSTATUS");
                sal[9] = rrr.getString("STATUS");
                sal[10] = rrr.getString("NAMEBUSINESS");
                sal[11] = rrr.getString("WIFEHUSBANDNAME");
                sal[12] = rrr.getString("FATHERNAME");
                sal[13] = rrr.getString("MOTHERNAME");
                sal[14] = rrr.getString("DOB");
                sal[15] = rrr.getString("ADDRESSPRESENT");
                sal[16] = rrr.getString("ADDRESSPERMANENT");
                sal[17] = rrr.getString("TELEPHONEOFFICE");
                sal[18] = rrr.getString("TELEPHONERESIDENTIAL");
                sal[19] = rrr.getString("VATNUMBER");
                sal[20] = rrr.getString("IMAGE");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (sal);
}

// image return
public byte[] RegistrationReturnimage(long TIN) throws ClassNotFoundException, SQLException {
    byte[] img = null;
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from EMPLOYEE WHERE TIN='" + TIN + "';";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);

            while (rrr.next()) {

                img = rrr.getBytes("IMAGE");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (img);
}

// Assetliavility retrieve
public String[] Assetliavilityreturn(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[21];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from ASSETLIABILITY WHERE TIN=" + TIN + "  AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("TIN");
                sal[1] = rrr.getString("BUSINESSCAPITAL");
                sal[2] = rrr.getString("SHAREHOLDING");
                sal[3] = rrr.getString("NONAGRICULTURAL");
                sal[4] = rrr.getString("AGRICULTURAL");
                sal[5] = rrr.getString("INVESTMENT");
                sal[6] = rrr.getString("MOTOR");
                sal[7] = rrr.getString("JWELLERY");
                sal[8] = rrr.getString("FURNITURE");
                sal[9] = rrr.getString("ELECTRICEQUIPMENT");
                sal[10] = rrr.getString("CASHASSETOUTBUSINESS");
                sal[11] = rrr.getString("OTHERASSET");
                sal[12] = rrr.getString("LESSLIABILITY");
                sal[13] = rrr.getString("NETWEALTHTHISYEAR");
                sal[14] = rrr.getString("NETWEALTHLASTYEAR");
                sal[15] = rrr.getString("ACCRETIONWEALTH");
                sal[16] = rrr.getString("FAMILYEXPENDITURE");
                sal[17] = rrr.getString("DEPENDEDMEMBER");
                sal[18] = rrr.getString("ACCRETIONWEALTH1415");
                sal[19] = rrr.getString("SOURCEFUND");
                sal[20] = rrr.getString("DIFFER");
            }
            if (test == 0) {
                sal[0] = "-1";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (sal);
}

// Taxcount retrieve
public String[] TaxCount(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[21];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from INCOME_OF_ASSEESSEE WHERE TIN=" + TIN + " AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("TIN");
                sal[1] = rrr.getString("SALARIES");
                sal[2] = rrr.getString("INTERSETSECURITIES");
                sal[3] = rrr.getString("HOUSEPROPERTY");
                sal[4] = rrr.getString("AGRICULTURALINCOME");
                sal[5] = rrr.getString("BUSINESSINCOME");
                sal[6] = rrr.getString("SHAREPROFIT");
                sal[7] = rrr.getString("SPOUSEINCOME");
                sal[8] = rrr.getString("CAPITALGAINS");
                sal[9] = rrr.getString("OTHERSOURCEINCOME");
                sal[10] = rrr.getString("TOTAL19");
                sal[11] = rrr.getString("FORIEGNINCOME");
                sal[12] = rrr.getString("TOTALINCOME1011");
                sal[13] = rrr.getString("TAXLEVIABLE");
                sal[14] = rrr.getString("TAXREBATE");
                sal[15] = rrr.getString("TAXPAYABLE");
                sal[16] = rrr.getString("TAXPAYYMENT");
                sal[17] = rrr.getString("DIFFEREN1516");
                sal[18] = rrr.getString("TAXFREEINCOME");
                sal[19] = rrr.getString("TAXPAIDLASTYEAR");
            }
            if (test == 0) {
                sal[0] = "-1";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (sal);
}

// Taxcount retrieve
public String[] FamilyExpense(long TIN,int ayear) throws ClassNotFoundException, SQLException {
    String[] sal = new String[21];
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://SADDAMNVN:1433;databaseName=incomeTax;integratedSecurity=true;";
        java.sql.Connection con = DriverManager.getConnection(url);
        String query;
        if (con != null) {
            String querymax = "select * from FORM WHERE TIN=" + TIN + " AND ASSYEAR="+ayear+";";
            Statement state = con.createStatement();
            ResultSet rrr = state.executeQuery(querymax);
            int test = 0;
            while (rrr.next()) {
                test = 1;
                sal[0] = rrr.getString("TIN");
                sal[1] = rrr.getString("PARSONALFOODEXPENSE");
                sal[2] = rrr.getString("TAXPAIDDEDUCTION");
                sal[3] = rrr.getString("ACCOMMODATIONEXPENSES");
                sal[4] = rrr.getString("TRANSPORTEXPENSE");
                sal[5] = rrr.getString("ELECTRICALBILLRESIDENCE");
                sal[6] = rrr.getString("WASABILLRESIDENCE");
                sal[7] = rrr.getString("GASBILLRESIDENCE");
                sal[8] = rrr.getString("TELEPHONEBILLRESIDENCE");
                sal[9] = rrr.getString("EDUCATIONEXPENSECHILD");
                sal[10] = rrr.getString("BANKLOANINSTALLMENT");
                sal[11] = rrr.getString("FESTIVALOTHEREXPENSE");
                sal[12] = rrr.getString("MEDICALPURPOSE");
                sal[13] = rrr.getString("TOTALEXPENSE");
            }
            if (test == 0) {
                sal[0] = "-1";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Not Conected");
        }

    } catch (Exception ee) {

        System.out.println(ee.toString());
    }
    return (sal);
}

}
