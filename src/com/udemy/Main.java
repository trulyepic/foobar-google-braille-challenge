package com.udemy;

public class Main {

    public static void main(String[] args) {

       System.out.println(solution("The quick brown fox jumps over the lazy dog"));
        //test
        String solution = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        String mySol = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        System.out.println(solution.compareTo(mySol));
    }

    /**
     *
     * @param st
     * @return
     */
    public static String solution(String st) {
        // Write a function solution(plaintext) that takes a string parameter
        // and returns a string of 1's and 0's representing the bumps and absence of bumps in the input
        //string. Your function should be able to encode the 26 lowercase letters,
        // handle capital letters by adding a Braille capitalization mark before that character, and use
        //a blank character (000000) for spaces. All signs on the space station are less
        // than fifty characters long and use only letters and spaces.

        String caps ="000001";
        String blank ="000000";
        String a ="100000"; String b ="110000"; String c ="100100"; String d ="100110"; String e ="100010";
        String f ="110100"; String g ="110110"; String h ="110010"; String i ="010100"; String j ="010110";
        String k ="101000"; String l ="111000"; String m ="101100"; String n ="101110"; String o ="101010";
        String p ="111100"; String q ="111110"; String r ="111010"; String s ="011100"; String t ="011110";
        String u ="101001"; String v ="111001"; String w ="010111"; String x ="101101"; String y ="101111";
        String z ="101011";
        StringBuilder sb = new StringBuilder();
        for (int indx =0; indx<st.length();indx++){
            char charValue = st.charAt(indx);
            if (st.length() > 50){
                System.out.println("signs is over 50 characters long.");
            }
            switch (charValue){
                case ' ':
                    sb.append(blank);
                    break;
                case 'a':
                    sb.append(a);
                    break;
                case 'A':
                    sb.append(caps + a);
                    break;
                case 'b':
                    sb.append(b);
                    break;
                case 'B':
                    sb.append(caps + b);
                    break;
                case 'c':
                    sb.append(c);
                    break;
                case 'C':
                    sb.append(caps + c);
                    break;
                case 'd':
                    sb.append(d);
                    break;
                case 'D':
                    sb.append(caps+ d);
                    break;
                case 'e':
                    sb.append(e);
                    break;
                case 'E':
                    sb.append(caps + e);
                    break;
                case 'f':
                    sb.append(f);
                    break;
                case 'F':
                    sb.append(caps+f);
                    break;
                case 'g':
                    sb.append(g);
                    break;
                case 'G':
                    sb.append(caps+g);
                    break;
                case 'h':
                    sb.append(h);
                    break;
                case 'H':
                    sb.append(caps+h);
                    break;
                case 'i':
                    sb.append(i);
                    break;
                case 'I':
                    sb.append(caps+i);
                    break;
                case 'j':
                    sb.append(j);
                    break;
                case 'J':
                    sb.append(caps+j);
                    break;
                case 'k':
                    sb.append(k);
                    break;
                case 'K':
                    sb.append(caps+k);
                    break;
                case 'l':
                    sb.append(l);
                    break;
                case 'L':
                    sb.append(caps+l);
                    break;
                case 'm':
                    sb.append(m);
                    break;
                case 'M':
                    sb.append(caps+m);
                    break;
                case 'n':
                    sb.append(n);
                    break;
                case 'N':
                    sb.append(caps+n);
                    break;
                case 'o':
                    sb.append(o);
                    break;
                case 'O':
                    sb.append(caps+o);
                    break;
                case 'p':
                    sb.append(p);
                    break;
                case 'P':
                    sb.append(caps+p);
                    break;
                case 'q':
                    sb.append(q);
                    break;
                case 'Q':
                    sb.append(caps+q);
                    break;
                case 'r':
                    sb.append(r);
                    break;
                case 'R':
                    sb.append(caps+r);
                    break;
                case 's':
                    sb.append(s);
                    break;
                case 'S':
                    sb.append(caps+s);
                    break;
                case 't':
                    sb.append(t);
                    break;
                case 'T':
                    sb.append(caps+t);
                    break;
                case 'u':
                    sb.append(u);
                    break;
                case 'U':
                    sb.append(caps+u);
                    break;
                case 'v':
                    sb.append(v);
                    break;
                case 'V':
                    sb.append(caps+v);
                    break;
                case 'w':
                    sb.append(w);
                    break;
                case 'W':
                    sb.append(caps+w);
                    break;
                case 'x':
                    sb.append(x);
                    break;
                case 'X':
                    sb.append(caps+x);
                    break;
                case 'y':
                    sb.append(y);
                    break;
                case 'Y':
                    sb.append(caps+y);
                    break;
                case 'z':
                    sb.append(z);
                    break;
                case 'Z':
                    sb.append(caps+z);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + charValue);
            }
        }
        return sb.toString();
    }
}
