package org.jn.core.java.student.shoaeeb.stream.files;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) throws IOException{
        FileOutputStream fos  =new FileOutputStream("textfile.txt");
        DataInputStream dis = new DataInputStream(System.in);

        char ch;
        while((ch=(char)dis.read())!='@')
        {
            fos.write(ch);
        }
        fos.close();
    }
}
