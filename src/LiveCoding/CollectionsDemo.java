package LiveCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer(int serial, String owner) {
        this.serial = serial;
        this.owner =owner;
    }
    //Ex) int 타입에서 a.compareTo(b) 현재 가지고있는 객체 a-b를 하여 a가 더크다면 양수 같다면 0 a가 더 작다면 음수를 반환한다.
    public int compareTo(Object o) {    //Comparable의 구조를 강제적으로 구현해야한다.
        return this.serial - ((Computer) o).serial;
    }
    public String toString(){
        return serial+" "+owner;
    }
}

public class CollectionsDemo{
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphtitle"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        //결과 값: serial을 이용하여 값을 정렬하고있다.
//            before
//            500 egoing
//            200 leezche
//            3233 graphtitle
//
//                    after
//            200 leezche
//            500 egoing
//            3233 graphtitle
        }
    }
}
