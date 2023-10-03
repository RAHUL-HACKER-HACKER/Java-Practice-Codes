package EclipseJavaCodes.AdvancedJava;

import java.io.*;
import java.io.Serializable;  
class Student2 implements Serializable{  
	private static final long serialVersionUID = 1L;
    int id;  
    String name;  
    public Student2(int id, String name) {  
          this.id = id;  
          this.name = name;  
   }  
}  
class SerializetionAndDeserializetion{    
 public static void main(String args[]){    
  try{    
  //Creating the object    
  Student2 s1 =new Student2(211,"ravi"); 
  
  
  //Creating stream and writing the object 
  //Serialization process;
  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  //closing the stream    
  out.close();
  
  
//Creating stream to read the object 
//DeSerialization process;
  FileInputStream fin=new FileInputStream("f.txt");
  ObjectInputStream in=new ObjectInputStream(fin);  
  Student2 s2=(Student2)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s2.id+" "+s2.name);  
  //closing the stream  
  in.close(); 
  
  System.out.println("success");    
  }catch(Exception e){
	  System.out.println(e);
	  }    
  }    
}    
