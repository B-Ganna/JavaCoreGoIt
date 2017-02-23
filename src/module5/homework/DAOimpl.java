package module5.homework;


public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room upDate(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 0, 0, null, null, null);
        System.out.println("");

        return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[5];
    }
}
