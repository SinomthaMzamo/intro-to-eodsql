package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

public class PersonDO {
    @ResultColumn(value = "pAge")
    public int age;

    @ResultColumn(value = "pName")
    public String name;

    @ResultColumn(value = "pGender")
    public char gender;
}
