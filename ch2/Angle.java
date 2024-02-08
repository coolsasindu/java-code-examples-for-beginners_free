import javax.swing.JOptionPane;
import java.io.DataInputStream;
class Check{
   public static void main(String args[]){
DataInputStream in=new DataInputStream(System.in);
int age;
String d="";
try
{

//System.out.println("Enter value:");
d=JOptionPane.showInputDialog(null,"Please Enter your age:");
age =Integer.parseInt(d);
if(age>18)
System.out.println("adult");
else
System.out.println("Child");
JOptionPane.showMessageDialog(null," your Child");

}
catch(Exception e){}
}
}
    
   
