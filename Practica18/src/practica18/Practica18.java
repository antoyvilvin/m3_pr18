package practica18;

import java.util.Arrays;
import java.util.Scanner;

public class Practica18 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        do {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {
                case 1:

                    //declara un array con los valores iniciales: 7, 12,13,16,18
                    int[] arrayNumbers = new int[]{7, 12, 13, 16, 18};
                    viewArrayInt(arrayNumbers);

                    break;

                case 2:

                    int[] arrayIva;
                    arrayIva = new int[]{0, 4, 10, 21};
                    viewArrayIva(arrayIva);

                    break;
                case 3:

                    int[] arrayIva2 = new int[4];
                    arrayIva2[0] = 0;
                    arrayIva2[1] = 4;
                    arrayIva2[2] = 10;
                    arrayIva2[3] = 21;
                    viewArrayIva2(arrayIva2);
                    break;

                case 4:

                    int[] arrayIva3;
                    System.out.println("Cuantos elementos");
                    int N = keyboard.nextInt();
                    arrayIva3 = new int[N];
                    for (int i = 0; i < arrayIva3.length; i++) {

                        System.out.println("Valor de " + i + " :");
                        arrayIva3[i] = keyboard.nextInt();

                    }

                    viewArrayIva3(arrayIva3);

                    break;

                case 5:
                    String[] arrayName;
                    float[] ArrayAltura;
                    int Nmax;
                    System.out.println("Input the number of students: ");
                    Nmax = keyboard.nextInt();
                    //dimensionar los array:
                    arrayName = new String[Nmax];
                    ArrayAltura = new float[Nmax];
                    //rellenar los arrays
                    for (int i = 0; i < arrayName.length; i++) {
                        System.out.println("Name [" + i + "].");
                        arrayName[i] = keyboard.next();
                    }
                    for (int i2 = 0; i2 < ArrayAltura.length; i2++) {
                        System.out.println("Height [" + i2 + "].");
                        ArrayAltura[i2] = keyboard.nextFloat();
                    }

                    viewStudent(arrayName, ArrayAltura);

                    break;

                    
                    case 7:
                    System.out.print("Input a number to tell you a day: ");
                    int dia = keyboard.nextInt();
                    daysofwek(dia);
                    break;
                    
                    
                    
                    
                    
                case 8:
                    System.out.println("DNI? ");
                    int dni = keyboard.nextInt();
                    char letter = functionDNI(dni);

                    System.out.println(dni + "-" + letter);
                    break;

                case 10:

                    System.out.println("Quieres salir?");
                    String res = keyboard.next();
                    if (res.equals("Y")) {
                        System.out.print("BY...");
                    } else {
                        option = 90;
                    }
                    break;
                default:
                    System.out.println("NOOOOO");
            }
        } while (option != 10);
    }

    private static void userMenu() {
        System.out.println("Option 1 - ");
        System.out.println("Option 2 - ");
        System.out.println("Option 3 - ");
        System.out.println("Option 4 - ");
        System.out.println("Option 5 - ");
        System.out.println("Option 6 - ");
        System.out.println("Option 7 - ");
        System.out.println("Option 8 - ");
        System.out.println("Option 9 - ");
        System.out.println("Option 10 - ");
        System.out.println("0 - salir");
        System.out.print("\n Opción ?");
    }

    private static void viewArrayInt(int[] arrayNumbers) {
//        for (int i=0; i<5;i++){
        for (int i = 0; i < arrayNumbers.length; i++) { //array.length sirve para coger los elementos

            System.out.println("Array[" + i + "]:" + arrayNumbers[i]);
            //System.out.println(arrayNumbers[i]); 
        }

        System.out.println(Arrays.toString(arrayNumbers));
    }

    private static void viewArrayIva(int[] arrayIva) {
        for (int i = 0; i < arrayIva.length; i++) { //array.length sirve para coger los elementos

            System.out.println("Array[" + i + "]:" + arrayIva[i]);
            //System.out.println(arrayNumbers[i]); 
        }

        System.out.println(Arrays.toString(arrayIva));

    }

    private static void viewArrayIva2(int[] arrayIva2) {

        for (int i = 0; i < arrayIva2.length; i++) { //array.length sirve para coger los elementos

            System.out.println("Array[" + i + "]:" + arrayIva2[i]);
            //System.out.println(arrayNumbers[i]); 
        }
    }

    private static void viewArrayIva3(int[] arrayIva3) {

        for (int i2 = 0; i2 < arrayIva3.length; i2++) { //array.length sirve para coger los elementos

            System.out.println("Array[" + i2 + "]:" + arrayIva3[i2]);
            //System.out.println(arrayNumbers[i]); 
        }

    }

    private static void viewStudent(String[] arrayName, float[] ArrayAltura) {

        for (int i3 = 0; i3 < arrayName.length; i3++) { //array.length sirve para coger los elementos

            System.out.println("Array[" + arrayName[i3] + "]:" + ArrayAltura[i3]);
            //System.out.println(arrayNumbers[i]); 
        }

    }
    private static void daysofwek(int dia) {
        String[] arrayDay = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Day " + dia + " is " + arrayDay[dia - 1]);
    }

    private static char functionDNI(int dni) {

        char letter = ' ';
        String stringDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int residuo = dni % 23;
        letter = stringDNI.charAt(residuo);

        return letter;

    }

}
