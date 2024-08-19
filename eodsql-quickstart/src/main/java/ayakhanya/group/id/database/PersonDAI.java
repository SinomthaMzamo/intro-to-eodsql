package ayakhanya.group.id.database;
import net.lemnik.eodsql.*;

/**
 * Data Access Interface for performing CRUD operations on Person entities.
 */
public interface PersonDAI extends BaseQuery{

    // create new person entry (C) using PersonDO fields
    @Update("INSERT INTO persons (pId, pName, pAge, pGender)"
            + "VALUES (?{1}, ?{2}, ?{3})"
    )
    void createNewPerson(String personName, int personAge, char personGender);

    // edit existing person entry (U)
    @Update("UPDATE persons "
            + "SET pName = ?{2} "
            +"WHERE pId = ?{1} "
    )
    void updatePersonName(int personId, String newName);

    // edit existing person entry (U)
    @Update("UPDATE persons "
            + "SET pAge = ?{2} "
            +"WHERE pId = ?{1} "
    )
    void updatePersonAge(int personId, int newAge);

    // extract person(s) entry(ies) (R)
    @Select("SELECT count(*) FROM friends "
            + "WHERE fId = {1} "
    )
    int getNumberOfFriends(int friendId);

    // extract PersonDO from database persons table
    @Select("SELECT p.id, p.pName, p.pAge, p.pGender "
        + "FROM persons p "
        + "WHERE p.id = ?{1}")
    PersonDO getPerson(int personId);
    // delete entry(ies)
}
