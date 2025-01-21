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
            case 997:
                result = 'a';
                break;
            case 995:
                result = 'b';
                break;
            case 993:
                result = 'c';
                break;
            case 991:
                result = 'd';
                break;
            case 989:
                result = 'e';
                break;
            case 987:
                result = 'f';
                break;
            case 985:
                result = 'g';
                break;
            case 983:
                result = 'h';
                break;
            case 981:
                result = 'i';
                break;
            case 979:
                result = 'j';
                break;
            case 977:
                result = 'k';
                break;
            case 975:
                result = 'l';
                break;
            case 973:
                result = 'm';
                break;
            case 971:
                result = 'n';
                break;
            case 969:
                result = 'o';
                break;
            case 967:
                result = 'p';
                break;
            case 965:
                result = 'q';
                break;
            case 963:
                result = 'r';
                break;
            case 961:
                result = 's';
                break;
            case 959:
                result = 't';
                break;
            case 957:
                result = 'u';
                break;
            case 955:
                result = 'v';
                break;
            case 953:
                result = 'w';
                break;
            case 951:
                result = 'x';
                break;
            case 949:
                result = 'y';
                break;
            case 947:
                result = 'z';
                break;
        }

        return result;
    }

    public static char getUChar(int number) {
        char result = 0;
        
        switch (number) {
            case 998:
                result = 'A';
                break;
            case 996:
                result = 'B';
                break;
            case 994:
                result = 'C';
                break;
            case 992:
                result = 'D';
                break;
            case 990:
                result = 'E';
                break;
            case 988:
                result = 'F';
                break;
            case 986:
                result = 'G';
                break;
            case 984:
                result = 'H';
                break;
            case 982:
                result = 'I';
                break;
            case 980:
                result = 'J';
                break;
            case 978:
                result = 'K';
                break;
            case 976:
                result = 'L';
                break;
            case 974:
                result = 'M';
                break;
            case 972:
                result = 'N';
                break;
            case 970:
                result = 'O';
                break;
            case 968:
                result = 'P';
                break;
            case 966:
                result = 'Q';
                break;
            case 964:
                result = 'R';
                break;
            case 962:
                result = 'S';
                break;
            case 960:
                result = 'T';
                break;
            case 958:
                result = 'U';
                break;
            case 956:
                result = 'V';
                break;
            case 954:
                result = 'W';
                break;
            case 952:
                result = 'X';
                break;
            case 950:
                result = 'Y';
                break;
            case 948:
                result = 'Z';
                break;
        }

        return result;
    }

    public static char getSChar(int number) {
        char result = 0;
        
        switch (number) {
            case 697:
                result = '`';
                break;
            case 694:
                result = '~';
                break;
            case 691:
                result = '!';
                break;
            case 688:
                result = '@';
                break;
            case 685:
                result = '#';
                break;
            case 682:
                result = '$';
                break;
            case 679:
                result = '%';
                break;
            case 676:
                result = '^';
                break;
            case 673:
                result = '&';
                break;
            case 670:
                result = '*';
                break;
            case 667:
                result = '(';
                break;
            case 664:
                result = ')';
                break;
            case 661:
                result = '-';
                break;
            case 658:
                result = '_';
                break;
            case 655:
                result = '=';
                break;
            case 652:
                result = '+';
                break;
            case 649:
                result = ';';
                break;
            case 646:
                result = ':';
                break;
            case 643:
                result = '{';
                break;
            case 640:
                result = '}';
                break;
            case 637:
                result = '[';
                break;
            case 634:
                result = ']';
                break;
            case 631:
                result = '|';
                break;
            case 628:
                result = '\\';
                break;
            case 625:
                result = '<';
                break;
            case 622:
                result = ',';
                break;
            case 619:
                result = '>';
                break;
            case 616:
                result = '.';
                break;
            case 613:
                result = '/';
                break;
            case 610:
                result = '?';
                break;
            case 607:
                result = '"';
                break;
            case 604:
                result = '\'';
                break;
        }

        return result;
    }

    public static char getNChar(int number) {
        char result = 0;

        switch (number) {
            case 123:
                result = '1';
                break;
            case 126:
                result = '2';
                break;
            case 129:
                result = '3';
                break;
            case 132:
                result = '4';
                break;
            case 135:
                result = '5';
                break;
            case 138:
                result = '6';
                break;
            case 141:
                result = '7';
                break;
            case 144:
                result = '8';
                break;
            case 147:
                result = '9';
                break;
            case 150:
                result = '0';
                break;
        }

        return result;
    }
}
