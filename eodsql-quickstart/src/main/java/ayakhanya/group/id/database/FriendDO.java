package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

/**
 * Data object representing a friend's details in the database.
 */
public class FriendDO {
    @ResultColumn(value = "id")
    public int id;
    
    @ResultColumn(value = "friendId")
    public int friendId;

    @ResultColumn(value = "name")
    public String personName;

    @ResultColumn(value = "gender")
    public char personGender;

    public FriendDO(){}

}
