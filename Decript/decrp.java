//sample(trial)
import java.util.*;
public class decrp{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Encrepted code : ");
       StringBuilder sb = new StringBuilder();
       String en = sc.nextLine();
       char[] enary = en.toCharArray();
       Set<Character> excludedChars = new HashSet<>();
       excludedChars.add('w');
       excludedChars.add('O');
       excludedChars.add('£');
       excludedChars.add('z');
       excludedChars.add('R');
       excludedChars.add('S');
       excludedChars.add('l');
       excludedChars.add('U');
       excludedChars.add('v');
       excludedChars.add('N');
       excludedChars.add('x');
       excludedChars.add('y');
       excludedChars.add('Q');
       excludedChars.add('j');
       excludedChars.add('k');
       excludedChars.add('T');
       excludedChars.add('m');
       excludedChars.add('@');
       excludedChars.add('P');
       excludedChars.add('$');
       excludedChars.add('&');
       for(int i = 0; i<4 ; i++){
        if (!excludedChars.contains(enary[i])) {
            sb.append(enary[i]);
            }
        }
        String Length = sb.toString();
        int lent_st = Integer.parseInt(Length, 16);
        System.out.println("string is "+ lent_st);
        int j = 0;
        int [] info = new int[lent_st];
        for(int i=4; i<enary.length; i++){
            while(!excludedChars.contains(enary[i])){
                sb.append(enary[i]);
            }
            int temp = Integer.parseInt((sb.toString()), 16);
            info[j] = temp;
        }

        for(int i = 0; i<info.length;i++){
            System.out.println(info[i]);
        }
    }
}

