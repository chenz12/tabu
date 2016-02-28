package tabu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by panzer on 2016/2/27.
 */
public class input {
    String file_head;
    input(String a){
        this.file_head = "pr"+a;
    }
    public String readline(){
        File file = new File(file_head);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            return br.readLine();
        }
        catch (Exception a){
            System.out.print(a.fillInStackTrace());
        }
        return null;
    }
}
