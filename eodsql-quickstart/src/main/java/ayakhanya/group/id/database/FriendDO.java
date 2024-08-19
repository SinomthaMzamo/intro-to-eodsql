package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

public class FriendDO {
    @ResultColumn(value = "fId")
    public int friendId;

    @ResultColumn(value = "pName")
    public String personName;

    @ResultColumn(value = "pGender")
    public char personGender;
}
