public class Product {

    private int[] pid;
    private String pname[];
    private int[] pprice;
    private String[] pdetail;

    int l = 1;

    Product(int[] pid, String[] pname, int[] pprice, String[] pdetail) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pdetail = pdetail;

        l++;
    }

    public int getpId(int id) {
        return pid[id - 1];
    }

    public String getpName(int id) {
        return pname[id - 1];
    }

    public void setpName(int id, String pname) {
        this.pname[id - 1] = pname;
    }

    public int getpPrice(int id) {
        return pprice[id - 1];
    }

    public void setpPrice(int id, int pprice) {
        this.pprice[id - 1] = pprice;
    }

    public String getpDetail(int id) {
        return pdetail[id - 1];
    }

    public void setpDetail(int id, String pdetail) {
        this.pdetail[id - 1] = pdetail;
    }
    public String showProduct(int id){
        for(int i = 1; i < 1; i++){
            System.out.println(i+" " +pname[i]);
        }
        return "             " + pname[id];
    }
    public String showPrice(int pdetail){
        System.out.println(pprice[pdetail]);
        return getpName(pdetail);
    }
    public String[] showProduct(String id) {
        return pname;
    }
    public int[] getpPrice(String[] pdetail) {
        return pprice;
    }

}
