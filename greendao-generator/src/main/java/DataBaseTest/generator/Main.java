package DataBaseTest.generator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class Main {
    public static void main(String[] args) throws Exception{
        Schema schema = new Schema(1, "com.example.databasetest.db");
        Entity program = schema.addEntity("Program");
        program.addIdProperty();
        program.addStringProperty("name");
        program.addDateProperty("beginDate");
        DaoGenerator dg = new DaoGenerator();
        dg.generateAll(schema, "./app/src/main/java");
    }
}
