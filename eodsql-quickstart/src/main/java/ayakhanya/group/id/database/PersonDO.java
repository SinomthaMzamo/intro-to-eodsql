package ayakhanya.group.id.database;

import net.lemnik.eodsql.ResultColumn;

/**
 * Data object representing a person's details in the database.
 */
public class PersonDO {
    @ResultColumn(value = "id")
    public int id;
    
    @ResultColumn(value = "age")
    public int age;

    @ResultColumn(value = "name")
    public String name;

    @ResultColumn(value = "gender")
    public char gender;

    public PersonDo(){}
}
