import java.util.*;
public class App {
    public static void main(String[] args) {
        int pid[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        String pname[] = { "Beer LEO", "Beer CHANG", "OISHI", "COKE", "PEPSI","LAY", "TESTO", 
        "CHACHA Sunflower Seeds", "Lotus Stick Biscuit", "Plastic glass", "Ice" };
        int pprice[] = { 70, 70, 25, 20, 20, 30, 30, 25, 20, 2, 15 };
        String pdetail[] = { "70", "70", "25", "20", "20", "30", "30", "25", "20", "2", "15" };
        Product product = new Product(pid, pname, pprice, pdetail);
    
        int[] mid = { 1,2,3 };
        String[] mname = { "A" ,"B","C"};
        String[] mpassword = { "aaa","bbb","ccc" };
        String[] mtel = { "061-2345678","0623456789","0634567890" };
        Member member = new Member(mid, mname, mpassword, mtel);
    
        int eid[] = { 1, 2 };
        String ename[] = { "Moo", "Mee" };
        String[] epassword = { "1234","1234" };
        String[] etel = { "099999999","0888888888" };
        String eshift[] = { "13.30 PM - 19.30 PM ","19.30 PM - 03.00AM " };
        Employee employee = new Employee(eid, ename, epassword, etel,eshift);
    
        int roomid[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Room room = new Room(roomid);
    
        int orderid[] = new int[50];
        String order_product[] = new String[50];
        int order_totalp[] = new int[50];
        String order_date[] = new String[50];
        String order_member[] = new String[50];
        String order_room[] = new String[50];
        String ordershow[] = new String[50];
        Order order = new Order(orderid, order_product, order_totalp, order_date, ordershow);

        int CPID[] = new int[50];
        int mID[] = new int[50];
        int EID[] = new int[50];
        int mpoint[] = { 2,3 };
        Collectpoint collectpoint = new Collectpoint(CPID, mID, mpoint, mpoint);

        Scanner key = new Scanner(System.in);
        int selectUser;
        int selectRoom;
        do {
            System.out.println("--------- Welcome to TAURUS KARAOKE! --------");
            System.out.println("   [1] Member");
            System.out.println("   [2] Employee");
            System.out.println("   [0] Exit");
            System.out.print("Enter your status: ");
            selectUser = key.nextInt();
            if(selectUser == 1) {        // Member
                System.out.print("Enter your Name : ");
                String id = key.next();
                System.out.println("--------- Welcome to TAURUS KARAOKE! ---------");
                System.out.println("   [1] Select Room  ");
                System.out.println("   [2] Add Product  ");
                System.out.println("   [3] Check Bill  ");
                System.out.println("   [0] Cancel  ");
                System.out.print("Select : ");
                int select = key.nextInt();
                if (select == 1) {  //room
                    System.out.println("Select Room " + select );
                    System.out.print("Cancel (put 0 = cancel) : ");
                    selectRoom = key.nextInt();
                    
                    if (selectRoom == 1) { //room1
                        System.out.println("select : " + room.showRoomId(1));
                       
                    }else if (selectRoom == 2) {
                        System.out.println("select : " + room.showRoomId(2));
                        
                    }else if (selectRoom == 3) {
                        System.out.println("select : " + room.showRoomId(3));
                        
                    }else if (selectRoom == 4) {
                        System.out.println("select : " + room.showRoomId(4));
                        
                    }else if (selectRoom == 5) {
                        System.out.println("select : " + room.showRoomId(5));
                        
                    }else if (selectRoom == 6) {
                        System.out.println("select : " + room.showRoomId(6));
                        
                    }else if (selectRoom == 7) {
                        System.out.println("select : " + room.showRoomId(7));
                    
                    }else if (selectRoom == 8) {
                        System.out.println("select : " + room.showRoomId(8));
                    
                    }else{
                        System.out.println("!!Error!!");
                        break;
                    }       
                } else if (select == 2) { //product
                    int selectProduct;
                    System.out.println("Product (1 = Beer LEO \n2 = Beer CHANG\n3 = OISHI\n4 = COKE\n5 = PEPSI\n6 = LAY\n7 = TESTO\n8 = CHACHA Sunflower Seeds\n9 = Lotus Stick Biscuit\n10 = lastic glass\n11 = Ice)");
                    System.out.println("Select Product : ");
                    System.out.println(product.showProduct(id));
                    System.out.print("Cancel (put 0 = cancel) : ");
                    selectProduct = key.nextInt();

                    if (selectProduct == 1) {
                        System.out.println("select : " + product.getpId(1));
                        System.out.println(product.showProduct(1));
                        System.out.println("****** sale : " + product.getpPrice(1) + " Baht ******");
                        
                        
                    } else if (selectProduct == 2) {
                        System.out.println("select : " + product.getpId(2));
                        System.out.println(product.showProduct(2));
                        System.out.println("****** sale : " + product.getpPrice(2) + " Baht ******");
                        
                        
                    } else if (selectProduct == 3) {
                        System.out.println("select : " + product.getpId(3));
                        System.out.println(product.showProduct(3));
                        System.out.println("****** sale : " + product.getpPrice(3) + " Baht ******");
                        
                    } else if (selectProduct == 4) {
                        System.out.println("select : " + product.getpId(4));
                        System.out.println(product.showProduct(4));
                        System.out.println("****** sale : " + product.getpPrice(4) + " Baht ******");

                    } else if (selectProduct == 5) {
                        System.out.println("select : " + product.getpId(5));
                        System.out.println(product.showProduct(5));
                        System.out.println("****** sale : " + product.getpPrice(5) + " Baht ******");

                    } else if (selectProduct == 6) {
                        System.out.println("select : " + product.getpId(6));
                        System.out.println(product.showProduct(6));
                        System.out.println("****** sale : " + product.getpPrice(6) + " Baht ******");

                    } else if (selectProduct == 7) {
                        System.out.println("select : " + product.getpId(7));
                        System.out.println(product.showProduct(7));
                        System.out.println("****** sale : " + product.getpPrice(7) + " Baht ******");

                    } else if (selectProduct == 8) {
                        System.out.println("select : " + product.getpId(8));
                        System.out.println(product.showProduct(8));
                        System.out.println("****** sale : " + product.getpPrice(8) + " Baht ******");

                    } else if (selectProduct == 9) {
                        System.out.println("select : " + product.getpId(9));
                        System.out.println(product.showProduct(9));
                        System.out.println("****** sale : " + product.getpPrice(9) + " Baht ******");
                        
                    } else if (selectProduct == 10) {
                        System.out.println("select : " + product.getpId(10));
                        System.out.println(product.showProduct(10));
                        System.out.println("****** sale : " + product.getpPrice(10) + " Baht ******");

                    } else if (selectProduct == 11) {
                        System.out.println("select : " + product.getpId(11));
                        System.out.println(product.showProduct(11));
                        System.out.println("****** sale : " + product.getpPrice(11) + " Baht ******");

                    } else {
                        break;
                    }
                } else if (select == 3) { // chaek bill
                    System.out.println("Room : "+room.showRoomId(id));
                    System.out.println("Name : "+id);
                    System.out.println("Your Order : Room 150 bath \n" + product.showProduct(1)+ " Price  "+product.getpPrice(1));
                    System.out.println("Total Price : "+ (product.getpPrice(1)+150));
                        break;
                } else {
                    break;
                }
            }
            if(selectUser == 2){   //Employee
                System.out.print("Enter you Name : ");
                String idEm = key.next();
                System.out.println("--------- Welcome to TAURUS KARAOKE! ---------");
                System.out.println("   [1] Print Reciept");
                System.out.println("   [0] cancel");
                int selectem = key.nextInt();
                if(selectem == 1){  //reciept        
                    System.out.println("----------  TAURUS KARAOKE! ----------");
                    System.out.println("Room  : 1");
                    System.out.println("Employee Name : " +idEm);
                    System.out.println("Your Order : Room 150 bath \n" + product.showProduct(1)+ "  Price  "+product.getpPrice(1)+ " Baht");
                    System.out.println("Total Price : "+ (product.getpPrice(1)+150));
                    System.out.println("Your Collectpoint : " + collectpoint.getMpoint(1));
                    System.out.println("========== Thank you member1 ==========");
                    break;
                }
                if(selectem == 0){           
                    System.out.print("          Do again later :) ");
                    System.out.print("---------------------------------------");
                }
            }
        }while(selectUser != 0);
        
    }
}

