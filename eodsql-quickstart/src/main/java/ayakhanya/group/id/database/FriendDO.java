package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

/**
 * Data object representing a friend's details in the database.
 */
public class FriendDO {
    @ResultColumn(value = "fId")
    public int friendId;

    @ResultColumn(value = "pName")
    public String personName;

    @ResultColumn(value = "pGender")
    public char personGender;
}
