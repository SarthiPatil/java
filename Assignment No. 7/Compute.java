
import java.io.*;
public class Compute {
    public static void main(String [] args){
        
       try( FileInputStream fin=new FileInputStream("sample.txt")){
      
        int count=0,wordCount=0,aCount=0;
        int a;
        while((a=fin.read())!=-1){
            
           char ch=(char)a;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
            if(ch==' '){
                wordCount++;
            }
            if(ch=='a'){
                aCount++;

            }

        }
        System.out.println("Number of vowels in the sample.txt: "+count);
        System.out.println("Number of words in the sample.txt: "+(wordCount+1));
        System.out.println("Number of a in the sample.txt: "+aCount);
    
    }catch(FileNotFoundException e1 ){
        System.out.println(e1);
    }catch(IOException e){
        System.out.println(e);


    }
    
}  
}
