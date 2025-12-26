package String;
import java.util.*;

public class FUN {
	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens() == true){
			System.out.println(st.nextToken());
		}
		
	}

}
