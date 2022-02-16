package design_parttern.creational_design_parttern.prototype;

public class ClientTest {
    public static void main(String[] args) {
        User user1 = new User("a", "123@gmail.com", 23);
        System.out.println(user1);

        User user2 = user1.clone();
        System.out.println(user2);
        System.out.println("===============");
        user1.setAge(13);
        System.out.println(user2);
        System.out.println(user1);
    }
}
