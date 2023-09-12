public class Member  {

    private int[] mid = new int[50];
    private String[] mname = new String[50];
    private String[] mpassword = new String[50];
    private String[] mtel = new String[50];

    int l = 1;

    Member(int[] mid, String[] mname, String[] mpassword, String[] mtel) {
        this.mid[l] = mid[l - 1];
        this.mname[l] = mname[l - 1];
        this.mpassword[l] = mpassword[l - 1];
        this.mtel[l] = mtel[l - 1];
        l++;
    }
    public int getmId(int i) {
        return mid[i];
    }
    public String getmName(int i) {
        return mname[i];
    }
    public void setmName(int i, String mname) {
        this.mname[i] = mname;
    }
    public String getmPassword(int i) {
        return mpassword[i];
    }
    public void setPassword(int i, String mpassword) {
        this.mpassword[i] = mpassword;
    }
    public String getmTel(int i) {
        return mtel[i];
    }
    public void setmTel(int i, String mtel) {
        this.mtel[i] = mtel;
    }
    public static Object password() {
        return null;
    }
    public static String mpassword() {
        return null;
    }
}
