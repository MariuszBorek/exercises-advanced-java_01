package org.example4;

public class Mag implements Postac, ZywyObiekt {
    @Override
    public void walcz() {
        System.out.println("zadałeś uderzenie :" + uderz());
    }

    @Override
    public void smier() {
        System.out.println("umarł");
    }
}
