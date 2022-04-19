package lt.viko.eif.liwaaaudi.model;

public class Class {
    private int classId;
    private int mainClassRoom;

    @Override
    public String toString() {

        return String.format("\tClass: %s\n\t\tMain Class Room: %s", classId, mainClassRoom);
    }

    public int getClassId() {

        return classId;
    }

    public void setClassId(int classId) {

        this.classId = classId;
    }

    public int getMainClassRoom() {

        return mainClassRoom;
    }

    public void setMainClassRoom(int mainClassRoom) {

        this.mainClassRoom = mainClassRoom;
    }
}
