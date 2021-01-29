import java.io.*;
import java.util.Scanner;

public class SystemA {
  static String fileName = null;
  static Library lib = new Library();
  static Scanner in = new Scanner(System.in);
  static Boolean running = true;

    public static void main(String[] args) {
while(running){
  System.out.println("Welcome to Network Library System \n Enter 0 to Load a file."
          + "\n Enter 1 to save and quit "
          +"\n Enter 2 to list all the equipments in the network library"
          +"\n Enter 3 to add new equipment to the network library"
          + "\n Enter 4 to edit an equipment in the network library"
          + "\n Enter 5 to search for a specific Equipment inside the library");
int answer = in.nextInt();
switch (answer){
  case 0:
    System.out.println("Enter file name  to load");
    loadFile(in.next());
    break;
  case 1:
    SaveAndquit();
    break;
  case 2:
    System.out.println(lib.toString());
    break;
  case 3:
    addEquipment();
    break;
  case 4:
    System.out.println("Enter the index of changed equipment:");
    int index = in.nextInt();
    editEquipment(index);
    break;
  case 5:
    searchEquipment();
    break;
}
}
System.exit(0);
    }

  private static void searchEquipment() {
    int SerNumber;
    String MACAddress;
    System.out.println("\n  Enter MACAddress or Serial Number ");
    MACAddress = in.next();



  }

  private static void editEquipment(int index) {
    String IpAddress;
    String Location;
    System.out.println("\n  Enter Ip Address or Location ");
    IpAddress = in.next();

  }

  private static void addEquipment() {
    String Name;
    String Manufacturer;
    int ModNumber;
    int SerNumber;
    String MACAddress;
    String IpAddress;
    String Location;
    String Category;

    System.out.println("\n Enter Name");
    Name = in.next();

    System.out.println("\n Enter Manufacturer");
    Manufacturer = in.next();

    System.out.println("\n Enter Model Number");
    ModNumber = in.nextInt();

    System.out.println("\n Enter Serial Number");
    SerNumber = in.nextInt();

    System.out.println("\n Enter MACAddress");
    MACAddress = in.next();

    System.out.println("\n Enter Ip Address");
    IpAddress = in.next();

    System.out.println("\n Enter Location");
    Location = in.next();
    System.out.println("\n Enter Category");
    Category = in.next();

    Equipments e = new Equipments( Name, Manufacturer,  ModNumber,  SerNumber,  MACAddress, IpAddress, Location, Category);
    lib.addEquipments(e);


  }


  private static void SaveAndquit() {
    System.out.println("Enter file name: ");
    fileName= in.next() + ".ser";
    running= false;
    FileOutputStream fos = null ;
    ObjectOutputStream out = null;
    try {
      fos = new FileOutputStream(fileName);
      out = new ObjectOutputStream(fos);
      out.writeObject(lib);
      fos.close();
      out.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static void loadFile(String name) {
    FileInputStream fis = null;
    ObjectInputStream in = null;

    File file =new File(name +".ser");
    if (file.exists()) {
      try {
        fis = new FileInputStream(file);
        in = new ObjectInputStream(fis);
        lib = (Library) in.readObject();
        fis.close();
        in.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("\n Sorry the file does not exist!");

    }
  }
}
