package stack;
class menu {
    String urutan;
    menu prev, next;
    menu(String j){urutan =j; System.out.println("menu "+j+"dibuat");}
}
class stacka{
    menu top, bottom;
    int jumlah, maks;
    stacka(int m){maks=m; System.out.println("Stacck"+m+"dibuat");}
    void push(String j){
        if (jumlah<maks){
            menu baru = new menu(j);
            if(top==null){top=bottom=baru;}
            else{
                baru.next=top; top.prev=baru; top=baru;
            }jumlah++;
        }else System.out.println("Stack full");
    }
    void tampil(){
        System.out.println("Isi Stack :");
        for(menu t=top; t!=null; t=t.next){
            System.out.println("Menu "+t.urutan);
        }
    }
    void pop(){
        if(jumlah>0){
            menu temp = top;
            if(top.next==null){top=bottom=null;}
            else{
                top=top.next; top.prev=null; temp.next=null;
            }jumlah--; tampil();
        }else System.out.println("Empty");
    }
}

public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu b= new menu("1");
        stacka s = new stacka(5);
        s.push("Bakso");s.push("Mie Ayam");s.push("Soto");s.push("Nasi Goreng");s.push("Jalabia");
        s.pop();s.pop();s.pop();s.pop();s.pop();
        
        
    }
    
}
