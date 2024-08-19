package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

/**
 * Data object representing a person's details in the database.
 */
public class PersonDO {
    @ResultColumn(value = "pAge")
    public int age;

    @ResultColumn(value = "pName")
    public String name;

    @ResultColumn(value = "pGender")
    public char gender;
}
