/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeus;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author ROOT
 */
public class ExportFile {
    
    private String filePath = System.getProperty("user.home") + "/Desktop\\test.txt";
    
    public void WriteFile(String content, String fp, String fileName)
    {
        filePath = fp + ".txt";
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(filePath);
            bw =  new BufferedWriter(fw);
            bw.write(content);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        finally{
            try{
                if(bw!=null)
                    bw.close();
                if(fw!=null)
                    fw.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}
