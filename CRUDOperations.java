import java.util.Scanner;

class CreateTable{
    Scanner sc = new Scanner(System.in);

    void menu(){
        System.out.println("1. View existing tables");
        System.out.println("2. Create a table");
        int choice = sc.nextInt();
    }
    
}

class UpdateTable{
    Scanner sc = new Scanner(System.in);

    void menu(){
        System.out.println("1. View existing tables");
        System.out.println("2. Update a table");
        int choice = sc.nextInt();
    }
}

class ReadTable{
    Scanner sc = new Scanner(System.in);

    void menu(){
        System.out.println("1. View existing tables");
        System.out.println("2. Read from a table");
        int choice = sc.nextInt();
    }
}

class DeleteTable{
    Scanner sc = new Scanner(System.in);

    void menu(){
        System.out.println("1. View existing tables");
        System.out.println("2. Delete a table");
        int choice = sc.nextInt();
    }
}


public class CRUDOperations{
    public static void main(String args[]){
        System.out.println("Welcome to CRUD Operations");
        CRUDOperations crud = new CRUDOperations();
        CreateTable ct = new CreateTable();
        ReadTable rt = new ReadTable();
        UpdateTable ut = new UpdateTable();
        DeleteTable dt = new DeleteTable(); 
        crud.Menu();
    }

    public void Menu(){
        System.out.println("1. Create a table ");
        System.out.println("2. Read from a table ");
        System.out.println("3. Update a table ");
        System.out.println("4. Delete a table ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 : 
                ct.menu();
                break;

            case 2 :
                rt.menu();
                break;

            case 3 : 
                ut.menu();
                break;

            case 4 : 
                dt.menu();
                break;
        }
    }
}