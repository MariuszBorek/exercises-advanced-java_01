package org.example7enum.zad_2;

public class App {
    public static void main(String[] args) {
        Role role = Role.SALES_MANAGER;
        role.isAdmin(role);

        System.out.println(role.isSalesManager());
        System.out.println(role.getLevelOfImportance());
    }
}
