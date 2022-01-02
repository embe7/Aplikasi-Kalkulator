import java.util.Scanner;

public class Main {

    public static int bilA;
    public static int bilB;
    public static int total;
    public static String operasi;

    public static void main(String[] args) {
        viewShowOperasi();
    }
    /**
     * method operator
     */

    public static void showOperasi(){

    switch (operasi){
        case "+":
            total = bilA + bilB;
            break;
        case "-":
            total = bilA - bilB;
            break;
        case "*":
            total = bilA * bilB;
            break;
        case "/":
            total = bilA / bilB;
            break;
        default:
            System.out.println("Operasi Tidak Ditemukan");
    }
        System.out.println("Hasi = " + total);
    }
    //Method test showOpewai
//    public static void testShowOperasi(){
//        bilA = 10;
//        bilB = 10;
//        operasi = "*";
//        showOperasi();
//    }

    /**
     * Input Data
     */
    public static String input(String info){
        Scanner scanner = new Scanner(System.in);

        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * view showOperasi
     */

    public static void viewShowOperasi(){
        Scanner InputUser = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        bilA = InputUser.nextInt();

        System.out.print("Masukan Operasi : ");
        operasi = InputUser.next();

        System.out.print("Masukan Angka : ");
        bilB = InputUser.nextInt();

        showOperasi();

        while (true){
            var input = input("ulangi (x)");
            if (input.equals("x")){
                viewShowOperasi();
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }
}

