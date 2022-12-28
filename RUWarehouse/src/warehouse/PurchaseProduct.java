package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test purchaseProduct
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
                if(querie.equals("purchase")){
                    int day = StdIn.readInt();
                    int id = StdIn.readInt();
                    int am = StdIn.readInt();
                    w.purchaseProduct(id, day, am);
                }
            }
           
        }

        StdOut.println(w);
    }
}
