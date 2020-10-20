package company;

import company.dataaccess.LocalPostgresConnection;
import company.dataaccess.MyConnection;

public class Main {


    public static void main(String[] args){

        MyConnection myConnection = new LocalPostgresConnection();
    }
}
