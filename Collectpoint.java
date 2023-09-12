public class Collectpoint {
    private int CPID[] = new int[50];
    private int mID[] = new int[50];
    private int EID[] = new int[50];
    private int mpoint[] = new int[50];
    int l = 1;
    Collectpoint(int[] CPID, int[] mid, int[] EID, int[] mpoint) {
        this.CPID[l] = CPID[l - 1];
        this.mID[l] = mid[l - 1];
        this.EID[l] = EID[l - 1];
        this.mpoint[l] = mpoint[l - 1];

        l++;
    }
    public int getCPID(int id) {
        return CPID[id];
    }
    public int getmID(int id) {
        return mID[id];
    }
    public int getEID(int id) {
        return EID[id];
    }
    public void setMpoint(int id, int count) {
        this.mpoint[id] += count;
    }
    public int getMpoint(int id) {
        return mpoint[id] ;

    }
}
