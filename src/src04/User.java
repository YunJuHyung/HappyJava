package src04;

public class User {
    private String email;
    private String password;
    private String name;

    public User(String name, String email) {
        this(name, email, null);
    }

    //생성자 오버로딩
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {      //getter 메소드만 가지고있으면 불변 객체
        return email;
    }       //겟터메소드만 가지고 있으면 불변객체 String이 가지고 있는
                                                    //모든 값은 내부 값을 변경시키지 않는다.
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;


    }

}
