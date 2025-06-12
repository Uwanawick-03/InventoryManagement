/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author wickr
 */
public class OpenPdf {
    public static void OpenById(String id){
        try{
            if((new File(dao.InventoryUtils.billPath+id+".pdf")).exists()){
                @SuppressWarnings("deprecation")
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+dao.InventoryUtils.billPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
