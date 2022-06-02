package minji.jun;

import java.io.*;

public class Day220604_01 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num; i++){
            String str = br.readLine();
            char[] temp = str.toCharArray();
            int right = 0;
            int left = 0;
            for (int j = 0; j < temp.length; j++) {
                if(temp[j] == '('){
                    left++;
                }else{
                    right++;
                }
                if(left <right){
                    break;
                }
            }
            if(right == left){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
