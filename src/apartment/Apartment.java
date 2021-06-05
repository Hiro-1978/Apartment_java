package apartment;

import java.sql.Connection;

public class Apartment {

    Connection conn = MyConnect.connect();

    public static void main(String[] args) {

       System.out.println("OK");

       JFrameApartment fm = new JFrameApartment();
        fm.setVisible(true);
    }

}