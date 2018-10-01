package q13458;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N,B,C;
	static long cnt;
	static int[] A;
	
	public static void main(String[] args) throws IOException {
		int i, j;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(in.readLine());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		for(i=0;i<N;i++) {
			A[i] = (A[i] > B) ? A[i] - B : 0; 
			cnt++;
		}
		
		for(i=0;i<N;i++) {
			cnt += Math.ceil((float) A[i] / C);
		}
		
		out.write(String.valueOf(cnt));
		
		out.flush();

		in.close();
		out.close();
	}
}
