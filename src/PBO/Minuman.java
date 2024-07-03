package PBO;

/**
 *
 * @author Administrator
 */
//Inheritance 
public class Minuman extends MenuCafe {
    private boolean dingin;
    
    //Constructor
    public Minuman (String nama, double harga, boolean dingin) {
        super (nama, harga);
        this.dingin = dingin;
        
    }
    //Accessor
    public boolean isDingin(){
        return dingin;
    }
    //Mutator
    public void setDingin(boolean dingin){
        this.dingin = dingin;
        
    }
    //Polymophism
    @Override
    public String toString(){
        return super.toString() + (dingin ? " (Dingin)" : "(Hangat)");
        
    }
}
