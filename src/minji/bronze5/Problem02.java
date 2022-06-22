package minji.bronze5;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Problem02 {
    /**
     * 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a.add(b) + "\n");
        bw.write(a.subtract(b) + "\n");
        bw.write(String.valueOf(a.multiply(b)));
        bw.flush();
        bw.close();
        br.close();
    }
}
