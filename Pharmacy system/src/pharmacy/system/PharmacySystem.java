package pharmacy.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PharmacySystem {

    public static void main(String[] args) {

        int x, y;
        int adminNo = 0;
        int delviryNo = 0;
        int userNo = 0;
        int cosmNo = 0;
        int prescMedicNo = 100;
        int medicNo = 1000;
        int id;
        int adId = 0;

        String input;

        HashMap<Integer, Products> prodMap = new HashMap<>();
        HashMap<Integer, Person> personMap = new HashMap<>();

        ArrayList<Products> oredrList = new ArrayList<>();

        // defining Medications
        Products med1 = new Products("Revo", 15, 1, 7);
        Products med2 = new Products("Aspriin", 10, 2, 15);
        Products med3 = new Products("Panadol", 22.5, 3, 30);
        Products med4 = new Products("Flagel", 8.5, 4, 8);
        Products med5 = new Products("Concor", 49.5, 5, 12);
        Products med6 = new Products("Zarontin", 75, 6, 21);

        Products presMed1 = new Products("acetaminophen", 150, 7, 18);
        Products presMed2 = new Products("Adalat CC", 105, 8, 9);
        Products presMed3 = new Products("Adalat", 195, 9, 20);
        Products presMed4 = new Products("Abraxane", 90, 10, 18);
        Products presMed5 = new Products("Abstral", 54, 11, 40);
        Products presMed6 = new Products("Accolate", 38, 12, 17);

        Products cosm1 = new Products("Hair Gel", 15.5, 13, 20);
        Products cosm2 = new Products("Hair Cream", 19, 14, 15);
        Products cosm3 = new Products("Ceriatiin", 22.5, 15, 14);
        Products cosm4 = new Products("Skin Cream", 14, 16, 13);
        Products cosm5 = new Products("Eye Linar", 23, 17, 22);
        Products cosm6 = new Products("LipStick", 19.5, 18, 18);

        prodMap.putIfAbsent(cosmNo++, cosm1);
        prodMap.putIfAbsent(cosmNo++, cosm2);
        prodMap.putIfAbsent(cosmNo++, cosm3);
        prodMap.putIfAbsent(cosmNo++, cosm4);
        prodMap.putIfAbsent(cosmNo++, cosm5);
        prodMap.putIfAbsent(cosmNo++, cosm6);

        prodMap.putIfAbsent(medicNo++, med1);
        prodMap.putIfAbsent(medicNo++, med2);
        prodMap.putIfAbsent(medicNo++, med3);
        prodMap.putIfAbsent(medicNo++, med4);
        prodMap.putIfAbsent(medicNo++, med5);
        prodMap.putIfAbsent(medicNo++, med6);

        prodMap.putIfAbsent(prescMedicNo++, presMed1);
        prodMap.putIfAbsent(prescMedicNo++, presMed2);
        prodMap.putIfAbsent(prescMedicNo++, presMed3);
        prodMap.putIfAbsent(prescMedicNo++, presMed4);
        prodMap.putIfAbsent(prescMedicNo++, presMed5);
        prodMap.putIfAbsent(prescMedicNo++, presMed6);

        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {
            System.out.println("Choose Your type : ");
            System.out.println("1. User.");
            System.out.println("2. Admin.");
            System.out.println("3. Delivery.");
            System.out.println("--------------------------");
            x = sc.nextInt();
            System.out.println("--------------------------");
            switch (x) {
                case 1:
                    System.out.println("1. Medications.");
                    System.out.println("2. Prescription Medications.");
                    System.out.println("3. Cosmetics.");
                    System.out.println("4. See Previous Orders.");
                    y = sc.nextInt();
                    System.out.println("--------------------------");
                    switch (y) {
                        case 1:
                            System.out.println("1. Search by Name.");
                            System.out.println("2. Browse Medications.");
                            System.out.println("--------------------------");
                            y = sc.nextInt();
                            System.out.println("--------------------------");
                            switch (y) {
                                case 1:
                                    break;
                                case 2:
                                    y = 0;
                                    for (int i : prodMap.keySet()) {
                                        if (i >= 1000 && i < medicNo) {
                                            Products prod = prodMap.get(i);
                                            System.out.println(prod);
                                            System.out.println("Press " + (y + 1) + " to order.");
                                            i++;
                                            y++;
                                            System.out.println("--------------------------");
                                        }
                                    }
                                    y = sc.nextInt();

                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1. Search by Name.");
                            System.out.println("2. Browse Prescription Medications.");
                            System.out.println("--------------------------");
                            y = sc.nextInt();
                            System.out.println("--------------------------");
                            switch (y) {
                                case 1:
                                    break;
                                case 2:
                                    y = 0;
                                    x = 100;
                                    for (int i : prodMap.keySet()) {
                                        if (i >= 100 && i < prescMedicNo) {
                                            Products prod = prodMap.get(i);
                                            System.out.println(prod);
                                            System.out.println("Press " + (y + 1) + " to order.");
                                            i++;
                                            y++;
                                            System.out.println("--------------------------");
                                        }
                                    }
                                    y = sc.nextInt();
                                    x += y;
                                    Products prod = prodMap.get(x);
                                    System.out.println(prod);
                                    Person pers = new Person();

                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("1. Search by Name.");
                            System.out.println("2. Browse Cosmetices.");
                            System.out.println("--------------------------");
                            y = sc.nextInt();
                            System.out.println("--------------------------");
                            switch (y) {
                                case 1:
                                    break;
                                case 2:
                                    y = 0;
                                    for (int i : prodMap.keySet()) {
                                        if (i < cosmNo) {
                                            Products prod = prodMap.get(i);
                                            System.out.println(prod);
                                            System.out.println("Press " + (y + 1) + " to order.");
                                            i++;
                                            y++;
                                            System.out.println("--------------------------");
                                        }
                                    }
                                    y = sc.nextInt();

                                    break;
                            }
                        case 4:

                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Add Admin.");
                    System.out.println("2. Current Admin.");
                    System.out.println("--------------------------");
                    y = sc.nextInt();
                    System.out.println("--------------------------");
                    switch (y) {
                        case 1:
                            Person person = new Person();
                            System.out.println("Enter your Name : ");
                            input = sc.next();
                            person.setName(input);
                            System.out.println("--------------------------");
                            System.out.println("Enter your User Name : ");
                            input = sc.next();
                            person.setUsername(input);
                            System.out.println("--------------------------");
                            System.out.println("Enter your Address : ");
                            input = sc.next();
                            person.setAddress(input);
                            System.out.println("--------------------------");
                            System.out.println("Enter your Contact : ");
                            input = sc.next();
                            person.setContact(input);
                            System.out.println("--------------------------");
                            System.out.println("Enter your Password : ");
                            input = sc.next();
                            person.setPassword(input);
                            System.out.println("--------------------------");
                            System.out.println("Your Id is " + (adId + 1));
                            personMap.put(adminNo, person);
                            System.out.println("--------------------------");
                            System.out.println("Your Data is :: ");
                            System.out.println(person);
                            adminNo++;
                            break;
                        case 2:
                            System.out.println("1. Make Order.");
                            System.out.println("2. Browse Data.");
                            System.out.println("3. Make Daily Repot.");
                            System.out.println("4. Add Product.");
                            System.out.println("--------------------------");
                            y = sc.nextInt();
                            System.out.println("--------------------------");
                            switch (y) {
                                case 1:
                                    y = 0;
                                    for (int i : prodMap.keySet()) {
                                        Products prod = prodMap.get(i);
                                        System.out.println(prod);
                                        System.out.println("Press " + (y + 1) + " to order.");
                                        i++;
                                        y++;
                                        System.out.println("--------------------------");
                                    }
                                    break;
                                case 2:
                                    y = 0;
                                    for (int i : prodMap.keySet()) {
                                        if (i < cosmNo) {
                                            Products prod = prodMap.get(i);
                                            System.out.println(prod);
                                            System.out.println("Press " + (y + 1) + " to order.");
                                            i++;
                                            y++;
                                            System.out.println("--------------------------");
                                        }
                                    }
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    System.out.println("Choose Product type : ");
                                    System.out.println("1. Medications.");
                                    System.out.println("2. Prescription Medication.");
                                    System.out.println("3. Cosmetics.");
                                    char type = sc.next().charAt(0);
                                    System.out.println("--------------------------");
                                    System.out.println("Enter Product Name : ");
                                    String name = sc.next();
                                    System.out.println("--------------------------");
                                    System.out.println("Enter Product price : ");
                                    double price = sc.nextDouble();
                                    System.out.println("--------------------------");
                                    System.out.println("Enter Product code : ");
                                    int code = sc.nextInt();
                                    System.out.println("--------------------------");
                                    System.out.println("Enter Product quantity : ");
                                    int quan = sc.nextInt();
                                    System.out.println("--------------------------");
                                    Products prod = new Products(name, price, code, quan);
                                    System.out.println(prod);
                                    System.out.println("--------------------------");
                                    switch (type) {
                                        case 1:
                                            int q = 0;
                                            for (int i : prodMap.keySet()) {
                                                if (i >= 1000 && i < medicNo) {
                                                    Products prods = prodMap.get(i);
                                                    i++;
                                                    y++;
                                                }
                                                q = i;
                                            }
                                            medicNo = q;
                                            prodMap.putIfAbsent(medicNo, prod);
                                            break;
                                        case 2:
                                            q = 0;
                                            for (int i : prodMap.keySet()) {
                                                if (i >= 100 && i < prescMedicNo) {
                                                    Products prods = prodMap.get(i);
                                                    i++;
                                                    y++;
                                                }
                                                q = i;
                                            }
                                            prescMedicNo = q;
                                            prodMap.putIfAbsent(prescMedicNo, prod);
                                            break;
                                        case 3:
                                            q = 0;
                                            for (int i : prodMap.keySet()) {
                                                if (i < cosmNo) {
                                                    Products prods = prodMap.get(i);
                                                    i++;
                                                    y++;
                                                }
                                                q = i;
                                            }
                                            cosmNo = q;
                                            prodMap.putIfAbsent(cosmNo++, prod);
                                            break;
                                    }
                                    break;
                            }
                    }
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("1. Check Orders.");
                    System.out.println("--------------------------");
                    for (int i = 0; i < oredrList.size(); i++) {
                        Products pro = oredrList.get(i);
                        System.out.println("--------------------------");
                        System.out.println(pro);
                        System.out.println("--------------------------");
                    }

                    break;

            }
            System.out.println("--------------------------");
            System.out.println("Enter 'Y' to continue or 'N' to close.");
            choice = sc.next().charAt(0);
            System.out.println("--------------------------");
        }

    }
}
