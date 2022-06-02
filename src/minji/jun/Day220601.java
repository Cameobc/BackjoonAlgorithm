package minji.jun;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day220601 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] stack = new int[num];
        int size = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(num-- >0){
            String str = sc.next();
            if(str.equals("push")){
                int number =  Integer.parseInt(sc.next());
                stack[size] = number;
                size++;
            }else if(str.equals("pop")){
                if(size == 0){
                    bw.write("-1\n");
                }else {
                    --size;
                    bw.write(stack[size]+"\n");
                }
            }else if(str.equals("size")){
                bw.write(size+"\n");
            }else if(str.equals("empty")){
                if(size == 0){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }else if(str.equals("top")){
                if(size == 0){
                    bw.write("-1\n");
                }else{
                    bw.write(stack[size-1]+"\n");
                }
            }
        }
        bw.flush();
    }

}
