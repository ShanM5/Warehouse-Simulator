package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Uset his file to test restock
       
        int n = StdIn.readInt(); 
        Warehouse w = new Warehouse();
        while(n > 0){
            n--;
            String querie = StdIn.readString();
        
            if(querie.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            }else{
                if(querie.equals("delete")){
                    int id = StdIn.readInt();
                    int resAmount = StdIn.readInt();
                    w.restockProduct(id, resAmount);
                }
            }
           
        }

        StdOut.println(w);
    }
}
