package ayakhanya.group.id.database;
import net.lemnik.eodsql.*;

public interface PersonDAI extends BaseQuery{

    // create new person entry (C) using PersonDO fields
    @Update("INSERT INTO persons (id, name, age, gender)"
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
            + "WHERE friendId = {1} "
    )
    int getNumberOfFriends(int personId);


    // delete entry(ies)
}
