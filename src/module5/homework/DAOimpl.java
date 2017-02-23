package module5.homework;


public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room + " is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + " is deleted");
        return true;
    }

    @Override
    public Room upDate(Room room) {
        System.out.println(room + " is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, null, null, null);
        System.out.println(room + " is found");
        return room;
    }
}
