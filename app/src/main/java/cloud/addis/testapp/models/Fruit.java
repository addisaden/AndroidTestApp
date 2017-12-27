package cloud.addis.testapp.models;

import com.orm.SugarRecord;

/**
 * Created by addisaden on 27.12.17.
 */

public class Fruit extends SugarRecord {
    String title;
    String color;

    public Fruit(String title) {
        this.title = title;
        this.color = "";
    }

    public Fruit(String title, String color) {
        this.title = title;
        this.color = color;
    }

    public String getTitle() {
        return this.title;
    }

    public String getColor() {
        return this.color;
    }
}
