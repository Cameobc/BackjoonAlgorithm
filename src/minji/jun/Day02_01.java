package minji.jun;

import java.io.*;

public class Day02_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for(int i = 0; i<num; i++){
            arr[i] = br.readLine();
            String[] result = arr[i].split(" ");
            for(int j = 0; j<result.length; j++){
                String s = new StringBuffer(result[j]).reverse().toString();
                if(result.length-1 > j){
                    bw.write(s+" ");
                }else{
                    bw.write(s+"\n");
                }
            }
        }
        bw.flush();
    }
}
