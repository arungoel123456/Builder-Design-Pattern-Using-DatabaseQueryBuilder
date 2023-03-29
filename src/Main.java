import com.demo.*;

public class Main {
    public static void main(String[] args) {
        Query q1 = new QueryBuilder().select("name").from("students").build();
        System.out.println(q1);

        Query q2 = new QueryBuilder().select("id, name").from("teachers").where("id = 'TID234'").build();
        System.out.println(q2);

        Query q3 = new QueryBuilder().select("id").where("id = 'TID234'").build();
        System.out.println(q3);
    }
}