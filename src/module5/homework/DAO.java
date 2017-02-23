package module5.homework;

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room upDate(Room room);

    Room findById(long id);


}
