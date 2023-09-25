package SeleniumJavaP;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        String[][] arr1 =
                {
                        {"habib", "Jameel", "Latif","bob"},
                        {"najib", "wahid", "Salim","tom"},
                        {"najibi", "wahida", "Saleh","john"},
                        {"naqib", "wahidi", "Saber","david"}
                };
        String[] row=arr1[1];
        System.out.println(Arrays.toString(row));
        String[] row1=arr1[0];
        System.out.println(Arrays.toString(row1));
    }
    }










