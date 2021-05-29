package day48_constructors_static;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Mokoko");
        System.out.println(group1.getMembers().size());
        group1.addMember("Ali");
        group1.addMember("Veli");
        group1.addMember("Deli");
        group1.addMember("Ayse");
        group1.addMember("Fatma");
        group1.addMember("Hayriye");
        group1.addMember("YasiGelse");
        group1.addMember("Elliye");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.getMembers());
    }
}
