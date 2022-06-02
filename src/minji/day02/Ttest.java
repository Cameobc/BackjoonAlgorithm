package minji.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ttest {

    public static void main(String[] args){
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(bf.readLine());
            for(int i=0;i<c;i++) {
                String s = bf.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int num = Integer.parseInt(st.nextToken());
                double avg = 0;
                int []score = new int[num];
                double result =0;

                for(int j=0;j<num;j++) {
                    score[j]=Integer.parseInt(st.nextToken());
                    avg+=score[j];
                }
                avg = (double)avg/num;

                for(int j=0; j<num;j++) {
                    if(avg<score[j]) {
                        result++;
                    }
                }

                result = (double)100/num*result;
                System.out.println(String.format("%.3f", result)+"%");
            }

            bf.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
