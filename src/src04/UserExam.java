package src04;

public class UserExam {
    public static void main(String[] args) {
        User user = new User("윤주형", "wngud5289@naver.com");

    //    System.out.println(user.getName());
    //    System.out.println(user.getEmail());
        System.out.println(user);

        System.out.println("-------------------------------");
        User user2 = new User("윤주형","1234@naveer.com", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);


    }

}
