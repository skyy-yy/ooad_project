public class Room {
    private int roomid[];

    Room(int roomId[]) {
        this.roomid = roomId;
    }

    public int showRoomId(String id) {
        return roomid[id.length()-1];
    }

    public String showRoomId(int i) {
        return roomid.toString();
    }
}
