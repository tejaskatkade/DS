package PRACT5;


import java.util.Scanner;


class Rr {
    public int index;
    public int id;
    public int f;
    String state;
}

public class Ring {

    public static void main(String[] args) {
        int temp, i, j;
        char str[] = new char[10];
        Rr proc[] = new Rr[10];
        for (i = 0; i < proc.length; i++)
            proc[i] = new Rr();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of process : ");
        int num = in.nextInt();
        for (i = 0; i < num; i++) {
            proc[i].index = i;
            System.out.println("Enter the id of process : ");
            proc[i].id = in.nextInt();
            proc[i].state = "active";
            proc[i].f = 0;
        }
        for (i = 0; i < num - 1; i++) {  
            for (j = 0; j < num - 1; j++) {
                if (proc[j].id > proc[j + 1].id) {
                    temp = proc[j].id;
                    proc[j].id = proc[j + 1].id;
                    proc[j + 1].id = temp;
                }
            }
        }
        for (i = 0; i < num; i++) {
            System.out.print("[" + i + "] " + " " + proc[i].id);
        }

        int init;
        int ch;
        int temp1;
        int temp2;
        //int ch1;
        int arr[] = new int[10];
        System.out.println("");
        System.out.println("\n Process " + proc[num - 1].id + " is CO-ORDINATOR");
        proc[num - 1].state = "inactive";
        System.out.println("\n Process 7 is inactive ");
        
        while (true) {
            System.out.println("Select the option");
            System.out.println("\n 1.Election \n 2.Quit ");
            ch = in.nextInt();

            for (i = 0; i < num; i++) {
                proc[i].f = 0;
            }

            switch (ch) {
                case 1:
                    System.out.println("\n Enter the Process number who initialised election : ");
                    init = in.nextInt();
                    temp2 = init;
                    temp1 = init + 1;
                    i = 0;
                    while (temp2 != temp1) {

                        if ("active".equals(proc[temp1].state) && proc[temp1].f == 0) {
                            System.out.println("\nProcess " + proc[init].id + "send message to " + proc[temp1].id);
                            proc[temp1].f = 1;
                            init = temp1;
                            arr[i] = proc[temp1].id;
                            i++;
                        }
                        if (temp1 == num) {
                            temp1 = 0;
                        } else {
                            temp1++;
                        }
                    }
                    System.out.println("\nProcess " + proc[init].id + " send message to " + proc[temp1].id);
                    arr[i] = proc[temp1].id;
                    i++;
                    int max = -1;
                    for (j = 0; j < i; j++) {
                        if (max < arr[j]) {
                            max = arr[j];
                        }
                    }

                    System.out.println("\n process " + max + "select as co-ordinator");
                    for (i = 0; i < num; i++) {
                        if (proc[i].id == max) {
                            proc[i].state = "inactive";
                        }
                    }
                    break;
                case 2:
                    System.out.println("Program terminated ...");
                    return;
                default:
                    System.out.println("\n invalid response \n");
                    break;
            }
        }
    }

}


    
