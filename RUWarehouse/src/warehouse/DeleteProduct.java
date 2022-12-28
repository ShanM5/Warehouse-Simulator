package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
	    // Use this file to test deleteProduct

        int n = StdIn.readInt();
        Warehouse w = new Warehouse();

        while(n > 0){
           
            String querie = StdIn.readString();
            if(querie.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            }else{
                int id = StdIn.readInt();
                w.deleteProduct(id);
            }
            n--;
        }

        StdOut.println(w);
    }
}