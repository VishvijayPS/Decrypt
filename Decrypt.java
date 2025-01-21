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
        sb.setLength(0);
        for(int i = 0;i < rvalue.length;i++){
            if(rvalue[i] < 998 && rvalue[i] > 946 && ((rvalue[i] % 2) != 0)){
                char letter = getLChar(rvalue[i]);
                sb.append(letter);
            }

            else if(rvalue[i] < 999 && rvalue[i] > 946 && ((rvalue[i] % 2) == 0)){
                char letter = getUChar(rvalue[i]);
                sb.append(letter);
            }

            else if(rvalue[i] < 698 && rvalue[i] > 603){
                char letter = getSChar(rvalue[i]);
                sb.append(letter);
            }

            else if(rvalue[i] < 150 && rvalue[i] > 122){
                char letter = getNChar(rvalue[i]);
                sb.append(letter);
            }
            else if(rvalue[i] == 601){
                sb.append(' ');
            }
        }
        String Result = sb.toString();
        System.out.println("The value is: "+ Result);

    }
    public static char getLChar(int number) {
        char result = 0;
        
        switch (number) {
            case 997 -> result = 'a';
            case 995 -> result = 'b';
            case 993 -> result = 'c';
            case 991 -> result = 'd';
            case 989 -> result = 'e';
            case 987 -> result = 'f';
            case 985 -> result = 'g';
            case 983 -> result = 'h';
            case 981 -> result = 'i';
            case 979 -> result = 'j';
            case 977 -> result = 'k';
            case 975 -> result = 'l';
            case 973 -> result = 'm';
            case 971 -> result = 'n';
            case 969 -> result = 'o';
            case 967 -> result = 'p';
            case 965 -> result = 'q';
            case 963 -> result = 'r';
            case 961 -> result = 's';
            case 959 -> result = 't';
            case 957 -> result = 'u';
            case 955 -> result = 'v';
            case 953 -> result = 'w';
            case 951 -> result = 'x';
            case 949 -> result = 'y';
            case 947 -> result = 'z';
        }

        return result;
    }

    public static char getUChar(int number) {
        char result = 0;
        
        switch (number) {
            case 998 -> result = 'A';
            case 996 -> result = 'B';
            case 994 -> result = 'C';
            case 992 -> result = 'D';
            case 990 -> result = 'E';
            case 988 -> result = 'F';
            case 986 -> result = 'G';
            case 984 -> result = 'H';
            case 982 -> result = 'I';
            case 980 -> result = 'J';
            case 978 -> result = 'K';
            case 976 -> result = 'L';
            case 974 -> result = 'M';
            case 972 -> result = 'N';
            case 970 -> result = 'O';
            case 968 -> result = 'P';
            case 966 -> result = 'Q';
            case 964 -> result = 'R';
            case 962 -> result = 'S';
            case 960 -> result = 'T';
            case 958 -> result = 'U';
            case 956 -> result = 'V';
            case 954 -> result = 'W';
            case 952 -> result = 'X';
            case 950 -> result = 'Y';
            case 948 -> result = 'Z';
        }

        return result;
    }

    public static char getSChar(int number) {
        char result = 0;
        
        switch (number) {
            case 697 -> result = '`';
            case 694 -> result = '~';
            case 691 -> result = '!';
            case 688 -> result = '@';
            case 685 -> result = '#';
            case 682 -> result = '$';
            case 679 -> result = '%';
            case 676 -> result = '^';
            case 673 -> result = '&';
            case 670 -> result = '*';
            case 667 -> result = '(';
            case 664 -> result = ')';
            case 661 -> result = '-';
            case 658 -> result = '_';
            case 655 -> result = '=';
            case 652 -> result = '+';
            case 649 -> result = ';';
            case 646 -> result = ':';
            case 643 -> result = '{';
            case 640 -> result = '}';
            case 637 -> result = '[';
            case 634 -> result = ']';
            case 631 -> result = '|';
            case 628 -> result = '\\';
            case 625 -> result = '<';
            case 622 -> result = ',';
            case 619 -> result = '>';
            case 616 -> result = '.';
            case 613 -> result = '/';
            case 610 -> result = '?';
            case 607 -> result = '"';
            case 604 -> result = '\'';
        }

        return result;
    }

    public static char getNChar(int number) {
        char result = 0;

        switch (number) {
            case 123 -> result = '1';
            case 126 -> result = '2';
            case 129 -> result = '3';
            case 132 -> result = '4';
            case 135 -> result = '5';
            case 138 -> result = '6';
            case 141 -> result = '7';
            case 144 -> result = '8';
            case 147 -> result = '9';
            case 150 -> result = '0';
        }

        return result;
    }
}
