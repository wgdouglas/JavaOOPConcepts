package org.wgcodecompany.atmProject;

import java.io.IOException;

public class atm extends CustomerMainPage{
    public static void main(String[] args) throws IOException {
        CustomerMainPage otionMenu = new CustomerMainPage();

        otionMenu.getLogin();
    }
}
