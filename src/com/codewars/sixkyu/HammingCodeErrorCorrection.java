package com.codewars.sixkyu;

import java.util.Arrays;

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
        String[] strArr = str.split("(?<=\\G.{3})");
        System.out.println(Arrays.toString(
                strArr
        ));

    }
    public static void main(String[] args) {
        HammingCodeErrorCorrection hc = new HammingCodeErrorCorrection();
        System.out.println(hc.encode("hey"));
        hc.decode("100111111000111001000010000111111000000111001111000111110110111000010111");
    }
}
