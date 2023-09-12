public class Employee  {

    private int eid[] = new int[50];
    private String ename[] = new String[50];
    private String epassword[] = new String[50];
    private String etel[] = new String[50];
    private String eshift[] = new String[50];

    int l = 1;

    Employee(int[] eid, String[] ename, String[] epassword, String[] etel, String[] eshift) {
        this.eid[l] = eid[l - 1];
        this.ename[l] = ename[l - 1];
        this.epassword[l] = epassword[l - 1];
        this.etel[l] = etel[l - 1];
        this.eshift[l] = eshift[l - 1];

        l++;
    }

    public int geteId(int id) {
        return eid[id];
    }

    public String geteName(int id) {
        return ename[id];
    }

    public void seteName(int id, String ename) {
        this.ename[id] = ename;
    }

    public String getePassword(int id) {
        return epassword[id];
    }

    public void setePassword(int id, String epassword) {
        this.epassword[id] = epassword;
    }

    public String geteTel(int id) {
        return etel[id];
    }

    public void seteTel(int id, String etel) {
        this.etel[id] = etel;
    }

    public String geteshift(int id) {
        return ename[id];
    }

    public void seteshift(int id, String eshift) {
        this.eshift[id] = eshift;
    }

}
