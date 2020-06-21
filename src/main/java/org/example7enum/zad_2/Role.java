package org.example7enum.zad_2;

public enum Role {
    ADMIN(10),
    SALES_MANAGER(8){
        public boolean isSalesManager() {
            return true;
        }
    },
    CLERK(5),
    CLIENT(2);

    private int levelOfImportance;

    Role(int levelOfImportance) {
        this.levelOfImportance = levelOfImportance;
    }

    public boolean isSalesManager() {
        return false;
    }

    public int getLevelOfImportance() {
        return levelOfImportance;
    }

    void isAdmin(Role role) {
        if(role == ADMIN) {
            System.out.println("Admin");
        } else if (role == SALES_MANAGER) {
            System.out.println("slaes manager");
        } else if (role == CLERK) {
            System.out.println("Clerk");
        } else if (role == CLIENT) {
            System.out.println("client");
        }
    }
}
