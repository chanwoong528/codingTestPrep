package bruteforce;

import java.io.*;
import java.util.*;

public class Main1018 {
    static String[] chesspan = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", 
                        "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] input = new String[N];
        for(int i = 0; i < N; i++){
            input[i] = br.readLine();
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int cnt = 0;
                for(int k = 0; k < 8; k++){
                    //계산을 진행 할 위치의 값들을 임시로 받아옴
                    String temp = input[i + k].substring(j, j + 8);
                    for(int l = 0; l < 8; l++){
                        if(temp.charAt(l) == chesspan[k].charAt(l)){
                            cnt++;
                        }
                    }
                }
                if(cnt >= 32) cnt = 64 - cnt;
                ans = Math.min(ans, cnt);
            }
        }
        bw.write(ans + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}