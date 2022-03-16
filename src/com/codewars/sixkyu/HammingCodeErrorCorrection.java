// Error correction #1 - Hamming Code
// https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e

package com.codewars.sixkyu;

public class HammingCodeErrorCorrection {
    public String encode(String str){
        String binary = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            binary = Integer.toBinaryString((int)str.charAt(i)); // translating each char to ASCII by casting to int and converting int to binary
            while (binary.length()!=8){
                binary = '0' + binary;
            }
            System.out.println(binary);
            for (int j = 0; j < binary.length(); j++) {
                sb.append(binary.charAt(j) +""+ binary.charAt(j) + binary.charAt(j));
            }
        }
        return sb.toString();
    }
    public void decode(String str){
        String[] strArr = str.split("(?<=\\G.{3})"); // Split the input into groups of three characters
        StringBuilder sb = new StringBuilder();
        for (String s: strArr) {    // Check if an error occurred: replace each group with the character that occurs most often
            int countZero = 0;
            int countOne = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0')
                    countZero++;
                else if(s.charAt(i)=='1')
                    countOne++;
            }
            if(countZero>countOne)
                sb.append('0');
            else
                sb.append('1');
        }
        String[] bytes = sb.toString().split("(?<=\\G.{8})"); // Take each group of 8 characters
        sb.delete(0,sb.length());       // Emptied string builder to store the reults
        for (String s: bytes) {
            sb.append((char)Integer.parseInt(s,2));     // Binary converted to int (ascii)  which is in turn converted to corresponding character
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        HammingCodeErrorCorrection hc = new HammingCodeErrorCorrection();
        System.out.println(hc.encode("hey"));
        hc.decode("100111111000111001000010000111111000000111001111000111110110111000010111");
    }
}
