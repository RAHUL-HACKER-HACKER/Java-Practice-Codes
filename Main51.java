package EclipseJavaCodes;

public class Main51 {
    StringBuilder output = new StringBuilder();
    String inputstring;
    
    public Main51( String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
        
    }
    
    void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.print( output+"," );
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
    
    
    public static void main (String args[])
    {
    	
    	
        Main51 obj= new Main51("wxyz");
        System.out.println("All possible combination are :  ");
        obj.combine(0);
        
        
        
    }
    
   
    
} 
