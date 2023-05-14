package LiveCoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        //COllection은 Set이나 List를 구현하고있고 iterator를 공통적으로 구현하기때문에 사용이 가능하다.
        Collection<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<>();
        C.add(1);
        C.add(2);

        // A.addAll(B);     A에 B 합집합
        //A.retainAll(B);     A 와 B의 교집함
        //A.removeAll(B);   A - B 차집합

        System.out.println(A.containsAll(B)); //false
        System.out.println(A.containsAll(C)); //true

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());


        }

    }
}

