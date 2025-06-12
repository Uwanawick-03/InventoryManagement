package inventorymanagementkadse242f035;

import java.sql.*;
import javax.swing.*;

public class Helper {

    public static void loadBranchesIntoComboBox(JComboBox<String> comboBox) {
        try {
            Connection con = database.DBConnection.DBHelper.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT Branch_Name FROM branches");
            ResultSet rs = pst.executeQuery();

            comboBox.removeAllItems();

            while (rs.next()) {
                comboBox.addItem(rs.getString("Branch_Name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading branches: " + e.getMessage());
        }
    }
}
