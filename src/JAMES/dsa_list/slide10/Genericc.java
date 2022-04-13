package exercise_james.dsa_list.slide10;

public class Genericc {
    public  void main(String[] args) {
        System.out.println("Vd khi không có static");

    }

    class ArrayList<E> {}
    // E đại diện cho kiểu dữ liệu generic (cơ chế cho phép sử dụng kiểu dữ liệu như là tham số)
    // String Custommer các dữ liệu cụ thể
    ArrayList<String> strings = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
}
