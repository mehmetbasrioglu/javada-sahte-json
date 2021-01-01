/**
 * 
 * 
 * Virtualized Json database in java management
 * java da sanal olarak json database yönetimi
 * 
 * Program Yazarı: Mehmet Basrioğlu
 * Bilgisayar Programcılığı bölümü için yapılmıştır.
 * 
 * 
 * Thank you for download
 * Indirdiğiniz için teşekkürler.
 * 
 * Thisn't real json database but you can add or remove data values
 * Bu gerçek bir json veritabanı değil ama veri değerlerini ekleyebilir veya silebilirsin
 * 
 * Username:admin
 * Password:root
 * Kullanıcı Adı:admin
 * Şifre:root
 * 
 * 
 */

//Kütüphaneler Libraries
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
//Kütüphaneler Libraries End

public class Ders {

    //Global Array
    private static ArrayList <String> citylist; 



public static void main(String[] args) {
    clearScreen();
    // Şehir Listesi
   // String[] city = new String[]{"istanbul","ıstanbul"};
     citylist = new ArrayList();
    citylist.add("istanbul");
    citylist.add("ıstanbul");
    citylist.add("ankara");
    citylist.add("izmir");
    citylist.add("antalya");
    citylist.add("izmit");
    JOptionPane.showMessageDialog(null,"Welcome the virtualized json database in java  \nAuthor:Mehmet Basrioğlu");
    //Şehir Listesi Sonu
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sign In or Guest ?:");
    String islem = scanner.nextLine().toLowerCase();
    
    switch(islem){
        case "sign in", "signin" -> {
            System.out.println("Username:");
            Scanner kullaniciadi = new Scanner(System.in);
            String kullaniciadi_ = kullaniciadi.nextLine().toLowerCase();
            System.out.println("Password:");
            Scanner sifre = new Scanner(System.in);
            String sifre_ = sifre.nextLine().toLowerCase();
            if(kullaniciadi_.equals("admin") && sifre_.equals("root")){
                System.out.println("Welcome "+kullaniciadi_);
                time();
                listOptions();
            }
            else if(!kullaniciadi_.equals("admin")){sendMessage("Error! Username doesn't match");JOptionPane.showMessageDialog(null,"Error! Username doesn't match");}
            else if(!sifre_.equals("root")){sendMessage("Error! Password doesn't match"); JOptionPane.showMessageDialog(null,"Error! Password doesn't match");}
            else if(kullaniciadi_ != "" && kullaniciadi_.length() < 3){ System.out.println("Error! Minimum length's 3"); JOptionPane.showMessageDialog(null,"Error! Minimum length's 3");}
            else if(kullaniciadi_ == ""){sendMessage("Can not be empty value"); JOptionPane.showMessageDialog(null,"Can not be empty value");}


        }
        case "Guest","guest" ->{
            sendMessage("Welcome Guest Member");
            wait(5000);
            sendMessage("Where you coming from?");
            Scanner sehir = new Scanner(System.in);
            String sehir_ = sehir.nextLine().toLowerCase();
            if(citylist.contains(sehir_)){
                sendMessage("Founded City:"+sehir_);
                JOptionPane.showMessageDialog(null,"Founded City:"+sehir_);
                wait(2000);
                sendMessage("Logout.");
                JOptionPane.showMessageDialog(null,"Logout from databse.");
            }
            else{
                int index = 0;
                sendMessageWithoutClear("Searching in virtual database please wait.");
                JOptionPane.showMessageDialog(null,"Searching in virtual database please wait.");
                for(int i =0 ; i<100; i++){
                    wait(250);
                    System.out.print("█");
                    index++;
                }
                if(index==100){
                    sendMessage("City doesn't exist");
                    JOptionPane.showMessageDialog(null,"City doesn't exist");
                    wait(1000);
                    sendMessage("Logout.");
                }
            }

        }
        default -> {
            System.out.println("HATA");
            JOptionPane.showMessageDialog(null,"HATA");
        }
    }
   
    

    
}
public static void listOptions(){
    wait(2000);
    sendMessage("[1] Add [2] Remove");
    Scanner option = new Scanner(System.in);
    int option_ = option.nextInt();
    switch (option_) {
        case 1:
            System.out.print("Please Enter Value:");
            Scanner newcity = new Scanner(System.in);
            String newcity_ = newcity.nextLine().toLowerCase();
            citylist.add(newcity_);
            sendMessageWithoutClear("New City added from database:"+newcity_);
            JOptionPane.showMessageDialog(null,"New City added from database:"+newcity_);
            sendMessageWithoutClear("Database new values:"+citylist);
            wait(2000);
            sendMessage("Logout.");
            JOptionPane.showMessageDialog(null,"Logout from database.");
            
            break;
        case 2:
        System.out.print("Please Enter what you want remove from database:");
        Scanner removecity = new Scanner(System.in);
        String removecity_ = removecity.nextLine().toLowerCase();
        if(citylist.contains(removecity_)){
            citylist.remove(removecity_);
        sendMessageWithoutClear("Removed "+removecity_+" from database");
        JOptionPane.showMessageDialog(null,"Removed"+removecity_+" from database");
        sendMessageWithoutClear("Database new values:"+citylist);
        wait(2000);
        sendMessage("Logout.");
        JOptionPane.showMessageDialog(null,"Logout from database.");
        }
        else
        {
            sendMessageWithoutClear("Doesn't exist");
            wait(2000);
            sendMessage("Logout.");
  
            JOptionPane.showMessageDialog(null,"Logout from database.");
        }
        break;
    
        default:
            break;
    }
}
public static void wait(int salise){

        try{
            Thread.sleep(salise);
        }
        catch(InterruptedException e){
    
        }
  
}

public static void time(){
SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
Date date = new Date(System.currentTimeMillis());
sendMessageWithoutClear("Date:"+formatter.format(date));
}
public static void sendMessageWithoutClear(String msj){

    System.out.println(msj);
}
public static void sendMessage(String msj){
    clearScreen();
    System.out.println(msj);
}
public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}
}