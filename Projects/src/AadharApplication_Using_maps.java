import java.util.HashMap;
import java.util.*;

class Person{
      private String name;
      private int age;
      private String mobile_number;
      private String address;

      Person(String name, int age, String mobile_number, String address){
                this.name = name;
                this.age = age;
                this.mobile_number = mobile_number;
                this.address = address;
      }
      public String getName() {
                return name;
      }
      public int getAge() {
              return age;
      }
      public String getMobile_number() {
              return mobile_number;
      }
      public String getAddress() {
              return address;
      }
      @Override
      public String toString() {
             return "Person [name=" + name + ", age=" + age + ", mobile_number=" + mobile_number + ", address=" + address + "]";
      }

}


public class AadharApplication_Using_maps {

	public static void main(String[] args) {
		Person p1 = new Person("Harish",21,"8919074193","Kurnool");
		Person p2 = new Person("SUhas",21,"515456124", "Hyderabad");
		HashMap h1 = new HashMap();
		h1.put(8919,p1);
		h1.put(5154,p2);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the aadhar number: ");
		int num = scan.nextInt();

		System.out.println(h1.get(num));

	}

}
