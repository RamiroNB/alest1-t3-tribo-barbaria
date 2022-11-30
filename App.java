import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args)throws FileNotFoundException{
        GenericTree tree = new GenericTree();
        File arq = new File("pergaminho5.txt");
        Scanner scan = new Scanner(arq);
        ArrayList<Barbaro> barbaros = new ArrayList<>();//apenas utilizado para pegar input
        
        int firstLand = scan.nextInt();
        scan.nextLine();
        String first = scan.nextLine();
        String[] curr = first.split(" ");

        Barbaro primeiro_pai = new Barbaro(curr[0], firstLand);
        barbaros.add(primeiro_pai);
        Barbaro filho = new Barbaro(curr[1], Double.parseDouble(curr[2]));
        barbaros.add(filho);
        tree.setRoot(primeiro_pai);
        tree.add(filho, primeiro_pai);

        
         while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] lineSplit = line.split(" ");
            Barbaro pai_da_vez =null;
            Barbaro filho_da_vez = null;
            for (Barbaro b :  barbaros) {
                if(b.getNome().equals(lineSplit[0])){
                    pai_da_vez = b;
                }
                filho_da_vez = new Barbaro(lineSplit[1], Double.parseDouble(lineSplit[2]));
            }
            barbaros.add(filho_da_vez);
            tree.add(filho_da_vez, pai_da_vez);           
        }
        scan.close();
        
        Barbaro maior = tree.mostLandLastGen();

        System.out.println(maior.getNome()+" "+maior.getTerras());
        
    }
       
}
