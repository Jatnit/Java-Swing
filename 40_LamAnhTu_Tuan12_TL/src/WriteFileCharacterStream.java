
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class WriteFileCharacterStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            String[] str = new String[]{"A", "B", "C", "D"};
            for (String s : str) {
                bw.write(s);
                bw.write("\n");
            }
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
