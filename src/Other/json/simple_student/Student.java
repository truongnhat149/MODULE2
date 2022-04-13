package json.simple_student;

public class Student {
        String fullname;
        int age;
        String address;

        public Student() {
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" + "fullname=" + fullname + ", age=" + age + ", address=" + address + '}';
        }
    }

