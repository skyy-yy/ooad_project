public class Order {

    private int orderid[] = new int[50];
    private String order_product[] = new String[50];
    private int order_totalp[] = new int[50];
    private String order_date[] = new String[50];
    private String order_member[] = new String[50];
    private String order_room[] = new String[50];
    private String ordershow[] = new String[50];

    int l = 1;

    Order(int orderid[], String[] order_product, int[] order_totalp, String order_date[], String ordershow[]) {
        this.orderid[l] = orderid[l - 1];
        this.order_product[l] = order_product[l - 1];
        this.order_totalp[l] = order_totalp[l - 1];
        this.order_date[l] = order_date[l - 1];
        this.ordershow[l] = ordershow[l - 1];

        l++;
    }

    public int getorderid(int id) {
        return orderid[id];
    }
    public void setorderid(int id, int orderid) {
        this.orderid[id] = orderid;
    }
    public String getorder_product(int id) {
        return order_product[id];
    }
    public void setorder_product(int id, String order_product) {
        this.order_product[id] = order_product;
    }
    public double getorder_totalp(int id) {
        return orderid[id];
    }
    public void setorder_totalp(int id, int order_totalp) {
        this.order_totalp[id] = order_totalp;
    }
    public String getorder_date(int id) {
        return order_date[id];
    }
    public void setorder_member(int id,String order_member) {
        this.order_member[id] = order_member;
    }
    public String getorder_member(int id) {
        return order_member[id];
    }
    public void setorder_room(int id,String order_room) {
        this.order_room[id] = order_room;
    }
    public String getorder_room(int id) {
        return order_room[id];
    }

    public String getordershow(int id) {
        return "Order Id : " + orderid[id]+"\n"
                +"Order Date : " + order_date[id]+"\n"
                +"Order Details : " + order_product[id];
    }
    public void setordershow(int id, String ordershow) {
        this.ordershow[id] = ordershow;
    }

}
