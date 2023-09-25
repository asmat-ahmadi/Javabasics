package Class6;

public class rewiew6e2 {
    public static void main(String[] args) {
        boolean isMeat=true;
        boolean isEgg =true;
        boolean isFish=true;
        boolean milk=false;
        boolean veggies=true;
        boolean isProtein=(isEgg ||  isMeat || isFish) ;
        boolean isGoodiet=(isEgg  || isMeat||isFish) &&milk&&veggies;
        System.out.println(isProtein);
        System.out.println(isGoodiet);

    }
}
