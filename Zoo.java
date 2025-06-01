
import java.util.Scanner;
class Feedback{
    private String feedback;

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback() {
        return this.feedback;
    }
}
class SpecialDeals{
    private double offer;

    private int Ticket;
    private String open;
    private String closed;

    public void setOffer(double offer) {
        this.offer = offer;
    }
    public double getOffer(){
        return this.offer;
    }
    public void setTicket(int ticket) {
        this.Ticket = ticket;
    }

    public int getTicketprice() {
        return this.Ticket;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getOpen() {
        return this.open;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }
    public String getClosed(){
        return this.closed;
    }
    private String Specialdeals;

    public void setSpecialdeals(String specialdeals) {
        this.Specialdeals = specialdeals;
    }

    public String getSpecialdeals() {
        return this.Specialdeals;
    }
}
class Adminn{

    private String Username;
    private String Password;
    public void setUsername(String username) {
        this.Username = username;
    }
    public String getUsername(){
        return this.Username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
    public String getPassword(){
        return this.Password;
    }
}
class Visitors{
    private String Member;
    private String Ticket;
    private String name;
    private int age;
    private long phonenumber;
    private double balance;
    private String email;
    private String password;
    private int noOfTickets=0;

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public int getNoOfTickets() {
        return this.noOfTickets;
    }

    public void setMember(String member) {
        this.Member = member;
    }
    public String getMember(){
        return this.Member;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public long getPhonenumber(){
        return this.phonenumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setTicket(String ticket) {
        this.Ticket = ticket;
    }

    public String getTicket() {
        return this.Ticket;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
class Attraction extends SpecialDeals{
    private String Attractionname;
    private String Discription;
//    private int ticketprice;

    public void setAttractionname(String attractionname) {
        this.Attractionname = attractionname;
    }

    public String getAttractionname() {
        return this.Attractionname;
    }

    public void setDiscription(String discription) {
        this.Discription = discription;
    }
    public String getDiscription(){
        return this.Discription;
    }

//    public void setTicketprice(int ticketprice) {
//        this.ticketprice = ticketprice;
//    }
//
//    public int getTicketprice() {
//        return this.ticketprice;
//    }
}
class Animals{
    private String name;
    private String type;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
class Discount{
    private String Category;
    private double Percentage;
    private String DiscountCode;

    public void setDiscountCode(String discountCode) {
        this.DiscountCode = discountCode;
    }

    public String getDiscountCode() {
        return this.DiscountCode;
    }

    public void setCategory(String category) {
        this.Category = category;
    }
    public String getCategory(){
        return this.Category;
    }

    public void setPercentage(double percentage) {
        this.Percentage = percentage;
    }

    public double getPercentage() {
        return this.Percentage;
    }
}
public class Zoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Adminn[] admins = new Adminn[100];
        int noOfAdmins = 0;
        for (int i = 0; i < admins.length; i++) {
            admins[i] = new Adminn();
        }
        Visitors[] visitors = new Visitors[100];
        int noOfVisitors = 0;
        for (int i = 0; i < visitors.length; i++) {
            visitors[i] = new Visitors();
        }
        int TotalVisitors = 0;
        double TotalRevenue = 0;
        Attraction[] attractions = new Attraction[100];
        int noOfAttraction = 0;
        for (int i = 0; i < attractions.length; i++) {
            attractions[i] = new Attraction();
        }
        Animals[] animals = new Animals[100];
        int noOfAnimals = 0;
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animals();
        }
        Discount[] discounts = new Discount[100];
        int noOfDiscount = 0;
        for (int i = 0; i < discounts.length; i++) {
            discounts[i] = new Discount();
        }
        Feedback[] feedbacks = new Feedback[100];
        int noOfFeedback = 0;
        for (int i = 0; i < feedbacks.length; i++) {
            feedbacks[i] = new Feedback();
        }
        SpecialDeals[] specialDeals = new SpecialDeals[100];
        int noOfdeals = 0;
        for (int i = 0; i < specialDeals.length; i++) {
            specialDeals[i] = new SpecialDeals();
        }
        int ChooseOption = 0;
        while (ChooseOption != 4) {
            System.out.println("Welcome to ZOOtopia!");
            System.out.println("-----------------------------------");
            System.out.println("1. Enter as Admin");
            System.out.println("2. Enter as Visitors");
            System.out.println("3. View Special Deals");
            System.out.println("-----------------------------------");
            System.out.println("Enter your Choice : ");
            ChooseOption = input.nextInt();
            if (ChooseOption == 1) {
                System.out.println("-----------------------------------");
                System.out.println("1. Register");
                System.out.println("2. LogIn");
                System.out.println("-----------------------------------");
                System.out.println("Enter Your Choice : ");
                int csd = input.nextInt();
                if (csd == 1) {
                    input.nextLine();
                    System.out.println("Enter UserName : ");
                    String name = input.nextLine();
                    System.out.println("Enter Password");
                    String password = input.nextLine();
                    admins[noOfAdmins].setUsername(name);
                    admins[noOfAdmins].setPassword(password);
                    noOfAdmins++;
                } else if (csd == 2) {
                    input.nextLine();
                    System.out.println("Enter UserName : ");
                    String name = input.nextLine();
                    System.out.println("Enter Password");
                    String password = input.nextLine();
                    for (int i = 0; i < noOfAdmins; i++) {
                        if (admins[i].getUsername().equals(name)) {
                            System.out.println("Logged in as Admin.");
                            int css = 0;
                            while (css != 8) {
                                System.out.println("Admin Menu");
                                System.out.println("-----------------------------------");
                                System.out.println("1. Manage Attractions");
                                System.out.println("2. Manage Animals");
                                System.out.println("3. Schedule Events");
                                System.out.println("4. Set Discounts");
                                System.out.println("5. Set Special Deals");
                                System.out.println("6. View Visitors Stats");
                                System.out.println("7. View Feedback");
                                System.out.println("8. Exit");
                                System.out.println("-----------------------------------");
                                System.out.println("Enter your Choice : ");
                                css = input.nextInt();
                                if (css == 1) {
                                    int csdd = 0;
                                    while (csdd != 5) {
                                        System.out.println("Manage Attractions.");
                                        System.out.println("-----------------------------------");
                                        System.out.println("1. Add Attraction");
                                        System.out.println("2. View Attraction");
                                        System.out.println("3. Modify Attraction");
                                        System.out.println("4. Remove Attraction");
                                        System.out.println("5. Exit");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Enter your Choice : ");
                                        csdd = input.nextInt();
                                        if (csdd == 1) {
                                            input.nextLine();
                                            System.out.println("Enter Attraction Name : ");
                                            String attractname = input.nextLine();
                                            System.out.println("Enter Attraction Description : ");
                                            String discription = input.nextLine();
//                                            System.out.println("Enter Attraction Ticket Price : ");
//                                            int ticket= input.nextInt();
                                            attractions[noOfAttraction].setAttractionname(attractname);
                                            attractions[noOfAttraction].setDiscription(discription);
//                                            attractions[noOfAttraction].setTicketprice(ticket);
                                            noOfAttraction++;
                                            System.out.println("Attraction Added Successfully!");
                                        } else if (csdd == 2) {
                                            for (int j = 0; j < noOfAttraction; j++) {
                                                if (attractions[j].getAttractionname() != null && attractions[j].getDiscription() != null) {
                                                    System.out.println("-----------------------------------");
                                                    System.out.println("Attraction Name :  " + attractions[j].getAttractionname());
                                                    System.out.println("Attraction Description : " + attractions[j].getDiscription());
                                                    System.out.println("-----------------------------------");
                                                }
                                            }
                                        } else if (csdd == 3) {
                                            System.out.println("Attractions Menu.");
                                            for (int j = 0; j < noOfAttraction; j++) {
                                                if (attractions[j].getAttractionname() != null && attractions[j].getDiscription() != null) {
                                                    System.out.println("-----------------------------------");
                                                    System.out.println(j + 1 + ". " + attractions[j].getAttractionname());
                                                    System.out.println("-----------------------------------");
                                                }
                                            }
                                            System.out.println("Enter the choice : ");
                                            int n = input.nextInt();
                                            if (n <= noOfAttraction) {
                                                input.nextLine();
                                                System.out.println("Enter Attraction Name : ");
                                                attractions[n - 1].setAttractionname(input.nextLine());
                                                System.out.println("Enter Attraction Description : ");
                                                attractions[n - 1].setDiscription(input.nextLine());
//                                                System.out.println("Enter Attraction Ticket Cost : ");
//                                                attractions[n-1].setTicketprice(input.nextInt());
                                                System.out.println("Attraction Modify");
                                            } else {
                                                System.out.println("Invalid Index.");
                                            }
                                        } else if (csdd == 4) {
                                            input.nextLine();
                                            System.out.println("Enter Attraction Name : ");
                                            String attractname = input.nextLine();
                                            System.out.println("Enter Attraction Description : ");
                                            String discription = input.nextLine();

                                            for (int j = 0; j < noOfAttraction; j++) {
                                                if (attractions[j].getAttractionname().equals(attractname) && attractions[j].getDiscription().equals(discription)) {
                                                    attractions[j].setDiscription(attractions[j + 1].getDiscription());
                                                    attractions[j].setAttractionname(attractions[j + 1].getAttractionname());

                                                    attractions[j + 1].setAttractionname(null);
                                                    attractions[j + 1].setDiscription(null);
//                                                    attractions[j+1].setTicketprice(0);

                                                    noOfAttraction--;
                                                }
                                                System.out.println("Attraction Removed Successfully!");
                                            }
                                        }
                                    }
                                } else if (css == 2) {
                                    int csdd = 0;
                                    while (csdd != 4) {
                                        System.out.println("Manage Animals.");
                                        System.out.println("-----------------------------------");
                                        System.out.println("1. Add Animal");
                                        System.out.println("2. Update Animal Detail");
                                        System.out.println("3. Remove Animal");
                                        System.out.println("4. Exit");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Enter Your Choice : ");
                                        csdd = input.nextInt();
                                        if (csdd == 1) {
                                            input.nextLine();
                                            System.out.println("Enter Animal Name : ");
                                            String animanlname = input.nextLine();
                                            System.out.println("Enter Animal Type : ");
                                            String animaltype = input.nextLine();

                                            animals[noOfAnimals].setName(animanlname);
                                            animals[noOfAnimals].setType(animaltype);
                                            noOfAnimals++;
                                            System.out.println("Animal Added Successfully!");
                                        }
                                        else if (csdd == 2) {
                                            System.out.println("Update Animal");
                                            for(int j=0;j<noOfAnimals;j++){
                                                if(animals[j].getName()!=null){
                                                    System.out.println(j+1+". "+animals[j].getName());
                                                }
                                            }
                                            System.out.println("Enter Your Choice to Update : ");
                                            int n=input.nextInt();
                                            for(int j=0;j<noOfAnimals;j++){
                                                if(animals[j].getName()!=null && n==j+1){
                                                    input.nextLine();
                                                    System.out.println("Enter The Animal Name : ");
                                                    animals[j].setName(input.nextLine());
                                                    System.out.println("Enter The Animal Type : ");
                                                    animals[j].setType(input.nextLine());
                                                }
                                            }
                                            System.out.println("Animal Update Successfully.");
                                        } else if (csdd == 3) {
                                            input.nextLine();
                                            System.out.println("Enter Animal Name : ");
                                            String animanlname = input.nextLine();
                                            System.out.println("Enter Animal Type : ");
                                            String animaltype = input.nextLine();

                                            for (int j = 0; j < noOfAnimals; j++) {
                                                if (animals[j].getName().equals(animanlname) && animals[j].getType().equals(animaltype)) {
                                                    animals[j].setName(animals[j + 1].getName());
                                                    animals[j].setType(animals[j + 1].getType());

                                                    animals[j + 1].setName(null);
                                                    animals[j + 1].setType(null);
                                                    noOfAnimals--;
                                                }
                                            }
                                            System.out.println("Animal Removed Successfully!");
                                        }
                                    }
                                } else if (css == 3) {
                                    for (int j = 0; j < noOfAttraction; j++) {
                                        if (attractions[j].getAttractionname() != null) {
                                            System.out.println(j + 1 + ". " + attractions[j].getAttractionname());
                                        }
                                    }
                                    System.out.println("Choose Attraction For Set Ticket Price : ");
                                    int ch = input.nextInt();
                                    for (int j = 0; j < noOfAttraction; j++) {
                                        if (ch == j + 1) {
                                            System.out.println("Enter The Ticket Price : ");
                                            attractions[j].setTicket(input.nextInt());
                                        }
                                    }
                                } else if (css == 4) {
                                    int csdd = 0;
                                    while (csdd != 4) {
                                        System.out.println("Set Discounts");
                                        System.out.println("-----------------------------------");
                                        System.out.println("1. Add Discount");
                                        System.out.println("2. Modify Discount");
                                        System.out.println("3. Remove Discount");
                                        System.out.println("4. Exit");
                                        System.out.println("-----------------------------------");
                                        System.out.println("Enter Your Choice : ");
                                        csdd = input.nextInt();

                                        if (csdd == 1) {
                                            input.nextLine();
                                            System.out.println("Enter Discount Category : ");
                                            String cat = input.nextLine();
                                            System.out.println("Enter Discount CODE : ");
                                            String code = input.nextLine();
                                            System.out.println("Enter Discount Percentage : ");
                                            double per = input.nextDouble();

                                            discounts[noOfDiscount].setCategory(cat);
                                            discounts[noOfDiscount].setDiscountCode(code);
                                            discounts[noOfDiscount].setPercentage(per);
                                            noOfDiscount++;
                                            System.out.println("Discount Added Successfully!");
                                        } else if (csdd == 2) {
                                            System.out.println("Modify Discount");
                                            for(int j=0;j<noOfDiscount;j++){
                                                if(discounts[j].getCategory()!=null && discounts[j].getPercentage()!=0){
                                                    System.out.println(j+1+". "+"Discount Category : "+discounts[j].getCategory()+". ("+discounts[j].getPercentage()+") : "+discounts[j].getDiscountCode());
                                                }
                                            }
                                            int no=input.nextInt();
                                            for(int j=0;j<noOfDiscount;j++){
                                                if(discounts[j].getDiscountCode()!=null && discounts[j].getCategory()!=null && no==j+1){
                                                    input.nextLine();
                                                    System.out.println("Enter The Discount Category : ");
                                                    discounts[j].setCategory(input.nextLine());
                                                    System.out.println("Enter The Discount Code : ");
                                                    discounts[j].setDiscountCode(input.nextLine());
                                                    System.out.println("Enter The Discount Percentage : ");
                                                    discounts[j].setPercentage(input.nextDouble());
                                                }
                                            }
                                        } else if (csdd == 3) {
                                            input.nextLine();
                                            System.out.println("Enter Discount Category : ");
                                            String cat = input.nextLine();
                                            System.out.println("Enter Discount CODE : ");
                                            String code = input.nextLine();
                                            System.out.println("Enter Discount Percentage : ");
                                            double per = input.nextDouble();

                                            for (int j = 0; j < noOfDiscount; j++) {
                                                if (discounts[j].getCategory().equals(cat) && discounts[j].getPercentage() == per) {
                                                    discounts[j].setCategory(discounts[j + 1].getCategory());
                                                    discounts[j].setPercentage(discounts[j + 1].getPercentage());
                                                    discounts[j].setDiscountCode(discounts[j + 1].getDiscountCode());

                                                    discounts[j + 1].setCategory(null);
                                                    discounts[j + 1].setDiscountCode(null);
                                                    discounts[j + 1].setPercentage(0.0);
                                                    noOfDiscount--;
                                                }
                                            }
                                            System.out.println("Discount Removed Successfully!");
                                        }
                                    }
                                } else if (css == 5) {
                                    input.nextLine();
                                    System.out.println("Set Special Deals.");
                                    System.out.println("Enter the Special Deals : ");
                                    String deals = input.nextLine();
                                    System.out.println("Enter the percentage off : ");
                                    double per = input.nextDouble();
                                    specialDeals[noOfdeals].setSpecialdeals(deals);
                                    specialDeals[noOfdeals].setOffer(per);
                                    noOfdeals++;

                                } else if (css == 6) {
                                    System.out.println("Visitors Statistics :");
                                    System.out.println("-----------------------------------");
                                    System.out.println("Total Visitors : " + TotalVisitors);
                                    System.out.println("Total Revenue : " + "$" + TotalRevenue);
                                    System.out.println("Most Popular Attraction : ");
                                    System.out.println("-----------------------------------");
                                } else if (css == 7) {
                                    System.out.println("View FeedBacks");
                                    for (int j = 0; j < feedbacks.length; j++) {
                                        if (feedbacks[j].getFeedback() != null) {
                                            System.out.println(j + 1 + ". " + feedbacks[j].getFeedback());
                                        }
                                    }
                                } else {
                                    System.out.println("Logged Out");
                                }
                            }
                        }
                    }
                }
            } else if (ChooseOption == 2) {
                System.out.println("-----------------------------------");
                System.out.println("1. Register");
                System.out.println("2. LogIn");
                System.out.println("-----------------------------------");
                int csd = input.nextInt();
                if (csd == 1) {
                    input.nextLine();
                    System.out.println("Enter Visitor Name : ");
                    String name = input.nextLine();
                    System.out.println("Enter Visitor Age : ");
                    int age = input.nextInt();
                    System.out.println("Enter Visitor Phone Number : ");
                    long phonenumber = input.nextLong();
                    System.out.println("Enter Visitor Balance : ");
                    int balance = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Visitor Email : ");
                    String mail = input.nextLine();
                    System.out.println("Enter Visitor Password : ");
                    String pass = input.nextLine();
                    visitors[noOfVisitors].setName(name);
                    visitors[noOfVisitors].setAge(age);
                    visitors[noOfVisitors].setPhonenumber(phonenumber);
                    visitors[noOfVisitors].setBalance(balance);
                    visitors[noOfVisitors].setEmail(mail);
                    visitors[noOfVisitors].setPassword(pass);
                    noOfVisitors++;
                    TotalVisitors++;
                    System.out.println("Registration Is Successful!");
                } else if (csd == 2) {
                    input.nextLine();
                    System.out.println("Enter Visitor Email : ");
                    String mail = input.nextLine();
                    System.out.println("Enter Visitor Password : ");
                    String pass = input.nextLine();

                    for (int j = 0; j < noOfVisitors; j++) {
                        if (visitors[j].getEmail().equals(mail) && visitors[j].getPassword().equals(pass)) {
                            int choose = 0;
                            while (choose != 9) {
                                System.out.println("LogIn Successful!");
                                System.out.println();
                                System.out.println();
                                System.out.println("Visitors Menu : ");
                                System.out.println("-----------------------------------");
                                System.out.println("1. Explore The Zoo ");
                                System.out.println("2. Buy Membership");
                                System.out.println("3. Buy Tickets");
                                System.out.println("4. View Discounts");
                                System.out.println("5. View Special Deals");
                                System.out.println("6. Visit Animals");
                                System.out.println("7. Visit Attractions");
                                System.out.println("8. Leave Feedback");
                                System.out.println("9. Log Out");
                                System.out.println("-----------------------------------");
                                System.out.println("Enter Your Choice : ");
                                choose = input.nextInt();
                                if (choose == 1) {
                                    System.out.println("Explore the Zoo :");
                                    int chooseopt = 0;
                                    while (chooseopt != 3) {
                                        System.out.println("-----------------------------------");
                                        System.out.println("1. View Attractions");
                                        System.out.println("2. View Animals");
                                        System.out.println("3. Exit");
                                        System.out.println("-----------------------------------");
                                        chooseopt = input.nextInt();
                                        if (chooseopt == 1) {
                                            System.out.println("Attractions in the Zoo : ");
                                            for (int k = 0; k < noOfAttraction; k++) {
                                                if (attractions[k].getAttractionname() != null) {
                                                    System.out.println(k + 1 + ". " + attractions[k].getAttractionname());
                                                }
                                            }
                                            System.out.println("Enter Your Choice : ");
                                            int cs = input.nextInt();
                                            System.out.println(attractions[cs - 1].getDiscription());
                                        } else if (chooseopt == 2) {
                                            for (int k = 0; k < noOfAnimals; k++) {
                                                if (animals[k].getName() != null && animals[k].getType() != null) {
                                                    System.out.println("-----------------------------------");
                                                    System.out.println(k + 1 + ". Animal Name : " + animals[k].getName());
                                                    System.out.println(k + 1 + ". Animal Type : " + animals[k].getType());
                                                    System.out.println("-----------------------------------");
                                                }
                                            }
                                        }
                                    }
                                } else if (choose == 2) {
                                    System.out.println("Buy Membership :");
                                    System.out.println("1. Basic Membership : " + "$20");
                                    System.out.println("2. Premium Membership : " + "$50");

                                    int chooseoption = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Apply Discount Code : ");
                                    String code = input.nextLine();

                                    double membershipPrice = 0;

                                    if (chooseoption == 1) {
                                        if (visitors[j].getAge() <= 18) {
                                            membershipPrice = 20;
                                        } else if (visitors[j].getAge() > 18 && visitors[j].getAge() < 60) {
                                            membershipPrice = 20;
                                        } else if (visitors[j].getAge() >= 60) {
                                            membershipPrice = 20;
                                        }
                                    } else if (chooseoption == 2) {
                                        if (visitors[j].getAge() <= 18) {
                                            membershipPrice = 50;
                                        } else if (visitors[j].getAge() > 18 && visitors[j].getAge() < 60) {
                                            membershipPrice = 50;
                                        } else if (visitors[j].getAge() >= 60) {
                                            membershipPrice = 50;
                                        }
                                    }

                                    boolean discountApplied = false;

                                    for (int k = 0; k < noOfDiscount; k++) {
                                        if (discounts[k].getDiscountCode().equals(code)) {
                                            double discountPercentage = discounts[k].getPercentage();
                                            double offer = membershipPrice - (membershipPrice * discountPercentage / 100);
                                            visitors[j].setBalance(visitors[j].getBalance() - offer);
                                            visitors[j].setMember(chooseoption == 1 ? "Basic Membership" : "Premium Membership");
                                            TotalRevenue += offer;
                                            System.out.println("Member - " + visitors[j].getName() + " has " + (chooseoption == 1 ? "Basic" : "Premium") + " Membership.");
                                            System.out.println(chooseoption == 1 ? "Basic Membership" : "Premium Membership" + " has been purchased. Your Balance is now : $" + visitors[j].getBalance());
                                            discountApplied = true;
                                            break;
                                        }
                                    }

                                    if (!discountApplied) {
                                        visitors[j].setBalance(visitors[j].getBalance() - membershipPrice);
                                        visitors[j].setMember(chooseoption == 1 ? "Basic Membership" : "Premium Membership");
                                        System.out.println(chooseoption == 1 ? "Basic Membership" : "Premium Membership" + " has been purchased. Your Balance is now : $" + visitors[j].getBalance());
                                        TotalRevenue += membershipPrice;
                                    }


                                } else if (choose == 3) {
                                    System.out.println("Buy Tickets:");
                                    System.out.println("Select an Attraction to Buy a Ticket:");
                                    for (int k = 0; k < noOfAttraction; k++) {
                                        if (attractions[k].getAttractionname() != null) {
                                            System.out.println(k + 1 + ". " + attractions[k].getAttractionname() + "($" + attractions[k].getTicketprice() + ")");
                                        }
                                    }
                                    System.out.println("Enter your Choice : ");
                                    int cs = input.nextInt();
                                    System.out.println("Enter the number of tickets : ");
                                    int num = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Apply Discount : ");
                                    String discountcode=input.nextLine();
                                    double discountoff=0;
                                    for(int l=0;l<noOfDiscount;l++){
                                        if(discounts[l].getDiscountCode().equals(discountcode)){
                                            discountoff=discounts[l].getPercentage();
                                        }
                                    }
                                    if (num == 1) {
                                        for (int k = 0; k < noOfAttraction; k++) {
                                            if (attractions[k].getAttractionname() != null && cs == k + 1 && visitors[j].getBalance() >= attractions[k].getTicketprice()) {
                                                double offer=attractions[k].getTicketprice()-((attractions[k].getTicketprice()*discountoff)/100);
                                                TotalRevenue = TotalRevenue + offer;
                                                visitors[j].setTicket(attractions[k].getAttractionname());
                                                visitors[j].setBalance(visitors[j].getBalance() - offer);
                                                visitors[j].setNoOfTickets(visitors[j].getNoOfTickets() + 1);
                                                System.out.println("The Ticket for " + attractions[k].getAttractionname() + " was Purchased Successfully. Your Balance is now $" + visitors[j].getBalance());
                                                System.out.println("Your Ticket : " + visitors[j].getTicket());
                                                break;
                                            } else {
                                                System.out.println("You Don't Have Enough Balance To Buy Tickets.");
                                            }
                                        }
                                    }
                                    else if (num == 2) {
                                        for (int k = 0; k < noOfAttraction; k++) {
                                            if (attractions[k].getAttractionname() != null && cs == k + 1 && visitors[j].getBalance() >= (2 * attractions[k].getTicketprice())) {
                                                double offer=2*attractions[k].getTicketprice()-((2*attractions[k].getTicketprice()*discountoff)/100);
                                                TotalRevenue = TotalRevenue + offer;
                                                visitors[j].setTicket(attractions[k].getAttractionname());
                                                visitors[j].setBalance(visitors[j].getBalance() - offer);
                                                visitors[j].setNoOfTickets(visitors[j].getNoOfTickets() + 2);
                                                System.out.println("The Ticket for " + attractions[k].getAttractionname() + " was Purchased Successfully. Your Balance is now $" + visitors[j].getBalance());
                                                System.out.println("Your Ticket : " + visitors[j].getTicket());
                                                break;
                                            } else {
                                                System.out.println("You Don't Have Enough Balance To Buy Tickets.");
                                            }
                                        }

                                    }
                                } else if (choose == 4) {
                                    System.out.println("Available Discounts.");
                                    for (int k = 0; k < noOfDiscount; k++) {
                                        if (discounts[k].getCategory() != null && discounts[k].getPercentage() != 0) {
                                            System.out.println(k + 1 + ". Discount Category " + discounts[k].getCategory() + "( %" + discounts[k].getPercentage() + " discount )" + " : " + discounts[k].getDiscountCode());
                                        }
                                    }
                                } else if (choose == 5) {
                                    System.out.println("Special Deals");
                                    for (int k = 0; k < noOfdeals; k++) {
                                        if (specialDeals[k].getSpecialdeals() != null) {
                                            System.out.println(k + 1 + ". " + specialDeals[k].getSpecialdeals());
                                        }
                                    }
                                } else if (choose == 6) {
                                    System.out.println("Animals.");
                                    for (int k = 0; k < noOfAnimals; k++) {
                                        if (animals[k].getName() != null && animals[k].getType() != null) {
                                            System.out.println("----------------------------------------");
                                            System.out.println(k + 1 + ". Animal Name : " + animals[k].getName());
                                            System.out.println(k + 1 + ". Animal Type : " + animals[k].getType());
                                            System.out.println("----------------------------------------");
                                        }
                                    }
                                } else if (choose == 7) {
                                    System.out.println("Select an Attraction to Visit.");
                                    for (int k = 0; k < noOfAttraction; k++) {
                                        if (attractions[k].getAttractionname() != null && attractions[k].getDiscription() != null && attractions[k].getTicketprice() != 0) {
                                            System.out.println(k + 1 + ". Attraction Name : " + attractions[k].getAttractionname());
                                        }
                                    }
                                    System.out.println("Enter Your Choice : ");
                                    int no = input.nextInt();
                                    try{
                                        if (visitors[j].getTicket() != null && visitors[j].getMember().equals("Basic Membership") && visitors[j].getTicket() != attractions[no - 1].getAttractionname() && visitors[j].getNoOfTickets() != 0) {
                                            System.out.println("Ticket not Available. Basic Member need to buy separate tickets for the attractions.");
                                        } else if (visitors[j].getTicket() != null && visitors[j].getMember().equals("Basic Membership") && visitors[j].getTicket() == attractions[no - 1].getAttractionname() && visitors[j].getNoOfTickets() != 0) {
                                            visitors[j].setNoOfTickets(visitors[j].getNoOfTickets() - 1);
                                            System.out.println("1 Ticket Used.");
                                            System.out.println("Thank You for Visiting " + attractions[no - 1].getAttractionname() + ". Hope you enjoyed the Attraction.");
                                        } else if (visitors[j].getNoOfTickets() != 0) {
                                            visitors[j].setNoOfTickets(visitors[j].getNoOfTickets() - 1);
                                            System.out.println("1 Ticket Used.");
                                            System.out.println("Thank You for Visiting " + attractions[no - 1].getAttractionname() + ". Hope you enjoyed the Attraction.");
                                        }
                                    }
                                    catch (Exception e){
                                        System.out.println("First Buy Tickets.");
                                    }
                                } else if (choose == 8) {
                                    System.out.println("Leave Feedback:");
                                    input.nextLine();
                                    System.out.println("Enter Your Feedback(max 200 characters) : ");
                                    feedbacks[j].setFeedback(input.nextLine());
                                    System.out.println("Thank You. for your feedback.");
                                }
                            }
                        }
                    }
                }
            }
            else if (ChooseOption == 3) {
                System.out.println("Special Deals");
                for (int k = 0; k < noOfdeals; k++) {
                    if (specialDeals[k].getSpecialdeals() != null) {
                        System.out.println(k + 1 + ". " + specialDeals[k].getSpecialdeals());
                    }
                }
            }
        }
    }
}