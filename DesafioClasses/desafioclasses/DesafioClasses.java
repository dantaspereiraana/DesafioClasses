
package desafioclasses;

public class DesafioClasses {

    public static void main(String[] args) {
        Classes c1 = new Classes();
        
        c1.name = "Morgana";
        c1.age = 35;
        c1.kind = "mago";
        c1.status();
        c1.action();
       System.out.println("--------------");
        
       Classes c2 = new Classes ();
        c2.name = "Garen";
        c2.age = 29;
        c2.kind = "guerreiro";
        c2.status();
        c2.action();
       System.out.println("--------------");
       
        Classes c3 = new Classes ();
        c3.name = "Lee Sin";
        c3.age = 39;
        c3.kind = "monge";
        c3.status();
        c3.action();
       System.out.println("--------------");
       
        Classes c4 = new Classes ();
        c4.name = "Akali";
        c4.age = 23;
        c4.kind = "ninja";
        c4.status();
        c4.action();
       System.out.println("--------------");
       
        Classes c5 = new Classes ();
        c5.name = "Lulu";
        c5.age = +2000;
        c5.kind = "Yordle";
        c5.status();
        c5.action();
       System.out.println("--------------");
    }
    
}
