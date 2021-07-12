import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Table extends Frame
{
    public Table()
    {
        setSize(600, 600); 
        GridLayout g = new GridLayout(0, 4);
        setLayout(g);
        try
        {
            FileInputStream fin = new FileInputStream("C:\\MyJava\\Table.txt");
            Scanner sc = new Scanner(fin).useDelimiter(",");
            String[] arrayList;
            String a;
            while (sc.hasNextLine())
            {
                    a = sc.nextLine();
                    arrayList = a.split(",");
                    for (String i : arrayList) 
                    {
                        add(new Label(i));
                    }                   
            }
      } 
      catch (Exception ex) {  }
      pack();
      setVisible(true);
      }
}
public class TableUsingLabels 
{
    public static void main(String[] args)
    {
          Table a = new Table();
    }
}
