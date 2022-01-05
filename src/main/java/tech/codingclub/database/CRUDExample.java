package tech.codingclub.database;

import tech.codingclub.entity.Coders;

import java.util.Date;
import java.util.List;

public class CRUDExample {
    public static void main(String[] args) {
        System.out.println("Reading rows at" + new Date().getTime());
        System.out.println("Reading words at" + new Date().getTime());

        Coders coder = new GenericDB<Coders>().getRow(tech.codingclub.tables.Coders.CODERS, Coders.class, null);
        readTableCoders();

        new GenericDB<String>().updateColumn(tech.codingclub.tables.Coders.CODERS.NAME, "new name",
                tech.codingclub.tables.Coders.CODERS, tech.codingclub.tables.Coders.CODERS.NAME.eq("Naman"));

        readTableCoders();

    }

    public static void readTableCoders() {
        List<Coders> rows = (List<Coders>) GenericDB.getRows(tech.codingclub.tables.Coders.CODERS, Coders.class, null, null);

        for (Coders row : rows) {
            System.out.println("Row:" + row.getName() + "" + row.getAge());

        }
    }
}

