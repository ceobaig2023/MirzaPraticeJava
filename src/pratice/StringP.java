package pratice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class StringP {

    public void StringP1(){
    String s1="Hello";
    String s2="Hode";


//    s1==s2 ;
        System.out.println(s1==s2);
    String s3=new String("Hatti");
//    s1==s3;
        System.out.println(s1==s3);

    }

    public static void main(String[] args) {
        StringP oo1=new StringP();
        oo1.StringP1();
    }
}
