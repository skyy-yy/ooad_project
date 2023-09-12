public class Reciept {
    int recid[] = new int[50];
    String recmem[] = new String[50];
    String rec_order[] = new String[50];
    String Order_Num[] = new String[50];
    int Price_total[] = new int[50];
    String Order_date[] = new String[50];
    String Order_Time[] = new String[50];
    String EName[] = new String[50];
    int mpoint[] = new int[50];

    public int getrecid(int i) {
        return recid[i];
    }

    public String getrecmem(int i) {
        return recmem[i];
    }

    public void setrecmem(int i, String recmem) {
        this.recmem[i] = recmem;
    }

    public String getrec_order(int i) {
        return rec_order[i];
    }

    public void setrec_order(int i, String rec_order) {
        this.rec_order[i] = rec_order;
    }
    public String getOrder_Num(int i) {
        return Order_Num[i];
    }
    public void setOrder_Num(int i, String Order_Num) {
        this.Order_Num[i] = Order_Num;
    }
    public int getPrice_total(int i) {
        return Price_total[i];
    }
    public void setPrice_total(int i, int Price_total) {
        this.Price_total[i] = Price_total;
    }
    public String getOrder_date(int i) {
        return Order_date[i];
    }
    public void setOrder_date(int i, String Order_date) {
        this.Order_date[i] = Order_date;
    }
    public String getOrder_Time(int i) {
        return recmem[i];
    }
    public void setOrder_Time(int i, String Order_Time) {
        this.Order_Time[i] = Order_Time;
    }
    public String getEName(int i) {
        return EName[i];
    }

    public void setEName(int i, String EName) {
        this.EName[i] = EName;
    }

    public int getmpoint(int i) {
        return mpoint[i];
    }

    public void setmpoint(int i, int mpoint) {
        this.mpoint[i] = mpoint;
    }

}
