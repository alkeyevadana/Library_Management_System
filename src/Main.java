import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int choice = 0;
        while (choice != 3){
            choice=obj.nextInt();
            if (choice == 1){
                Module1 obj1 = new Module1();
                obj.nextLine();
                System.out.println("Enter student's name");
                String name = obj.nextLine();
                System.out.println("Enter student's surname");
                String surname = obj.nextLine();
                System.out.println("Enter university id");
                String uni_id = obj.nextLine();
                System.out.println("Enter the user id");
                String uid = obj.nextLine();
                System.out.println("Current trimester:");
                int trim = obj.nextInt();

                obj1.getdata(name, surname, uni_id, uid, trim);
                obj1.setdata();
            }
            else if (choice == 2){
                Module2 obj2 = new Module2();
                obj2.mathematics();
                obj2.web_technologies();
                obj2.languages();
            }
        }
    }

}
