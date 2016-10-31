package Beans;

/**
 * Created by 2 on 2016/10/31.
 */
public class PrimaryBean {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrimaryBean{" +
                "name='" + name + '\'' +
                '}';
    }

    public PrimaryBean(String name) {
        this.name = name;
    }

    public PrimaryBean() {
    }
}
