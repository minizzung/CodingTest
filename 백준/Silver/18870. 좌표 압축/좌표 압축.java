import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sortedarr = arr.clone();
		Arrays.sort(sortedarr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int v : sortedarr) {
			if(!map.containsKey(v))
				map.put(v, idx++);
		}
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<N; i++) {
			result.append(map.get(arr[i])).append(" ");
		}
		
		System.out.println(result.toString().trim());
	}
}