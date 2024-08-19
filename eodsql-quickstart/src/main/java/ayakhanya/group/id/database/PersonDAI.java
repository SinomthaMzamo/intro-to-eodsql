package ayakhanya.group.id.database;
import net.lemnik.eodsql.*;
import java.util.List;

/**
 * Data Access Interface for performing CRUD operations on Person entities.
 */
public interface PersonDAI extends BaseQuery{

    // create new person entry (C) using PersonDO fields
    @Update("INSERT INTO persons (name, age, gender)"
            + "VALUES (?{1}, ?{2}, ?{3})"
    )
    void createNewPerson(String personName, int personAge, char personGender);

    // edit existing person entry (U)
    @Update("UPDATE persons "
            + "SET name = ?{2} "
            +"WHERE id = ?{1} "
    )
    void updatePersonName(int personId, String newName);

    // edit existing person entry (U)
    @Update("UPDATE persons "
            + "SET age = ?{2} "
            +"WHERE id = ?{1} "
    )
    void updatePersonAge(int personId, int newAge);

    // extract person(s) entry(ies) (R)
    @Select("SELECT count(*) FROM friends "
            + "WHERE id = {1} "
    )
    int getNumberOfFriends(int friendId);

    // extract PersonDO from database persons table
    @Select("SELECT p.id, p.name, p.age, p.gender "
        + "FROM persons p "
        + "WHERE p.id = ?{1}")
    PersonDO getPerson(int personId);

    // extract all FriendDOs with specified friend id
    @Select("SELECT f.id, f.friendId, f.name, f.gender "
        + "FROM friends f "
        + "WHERE f.friendId = ?{1}")
    List<FriendDO> getFriendsByFriendId(int friendId);
    
    // delete entry(ies)
}
