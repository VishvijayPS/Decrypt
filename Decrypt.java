import java.util.*;

public class Decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Encrypted code: ");
        
        StringBuilder sb = new StringBuilder();
        String en = sc.nextLine();
        char[] enary = en.toCharArray();
        Set<Character> excludedChars = new HashSet<>(Arrays.asList(
            'w', 'O', '£', 'z', 'R', 'S', 'l', 'U', 'v', 'N', 'x', 'y', 'Q', 'j', 'k', 'T', 'm', '@', 'P', '$', '&'));

        for (int i = 0; i < 4; i++) {
            if (!excludedChars.contains(enary[i])) {
                sb.append(enary[i]);
            }
        }

        String lengthStr = sb.toString();
        int lentSt = Integer.parseInt(lengthStr, 16);
        // System.out.println("String length is " + lentSt);
        
        sb.setLength(0); 

        int[] info = new int[lentSt];
        int j = 0;

        for (int i = 4; i < enary.length; i++) {
            if (!excludedChars.contains(enary[i])) {
                sb.append(enary[i]);
            } else {
                if (sb.length() > 0) {
                    int temp = Integer.parseInt(sb.toString(), 16);
                    info[j++] = temp;
                    sb.setLength(0); 
                }
            }
        }

        if (sb.length() > 0) {
            int temp = Integer.parseInt(sb.toString(), 16);
            info[j++] = temp;
        }

        // for (int i = 0; i < info.length; i++) {
        //     System.out.println(info[i]);
        // }
        int [] rvalue = new int[info.length];
        for(int i=0;i<info.length;i++){
            rvalue[i] = info[i] / lentSt;
        }

        // for (int i = 0; i < rvalue.length; i++) {
        //     System.out.println(rvalue[i]);
        // }

    }
}
