import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App{
    public static void main(String[] args)throws FileNotFoundException{
        GenericTree tree = new GenericTree();
        File arq = new File("pergaminho.txt");
        Scanner scan = new Scanner(arq);

        int firstLand = scan.nextInt();
        scan.nextLine();
        String first = scan.nextLine();
        String[] curr = first.split(" ");
        tree.setRoot(new Barbaro(curr[0], firstLand, 1));
        System.out.println(curr.length);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
            
        }
        scan.close();
        
        
    }
    
    
}
