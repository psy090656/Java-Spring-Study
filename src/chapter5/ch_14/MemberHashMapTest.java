package chapter5.ch_14;


import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();


        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");


        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKang);
        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer ,String>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");

        System.out.println(hashMap);
    }
}