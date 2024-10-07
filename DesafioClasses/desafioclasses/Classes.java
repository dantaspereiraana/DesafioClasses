
package desafioclasses;

public class Classes {
    String name;
    int age;
    String kind;
    String power;
    
    void status(){
        System.out.println("Nome do personahem: " + this.name);
        System.out.println("Idade do personagem: " + this.age);
        System.out.println("Classe do personagem: " + this.kind);
    }
    
    void attack () {
                switch (this.kind.toLowerCase()) {
            case "mago":
                this.power = "magia";
                break;
            case "guerreiro":
                this.power = "espada";
                break;
            case "monge":
                this.power = "artes marciais";
                break;
            case "ninja":
                this.power = "shuriken";
                break;
            default:
                System.out.println("não encontrado");
                this.power = "nenhum";
                break;
        }
    }
   void action () {
        if (this.power == null) {
            this.attack(); 
        }
        
        if (this.power.equals("nenhum")) {
            System.out.println(this.name + " não pode atacar porque sua classe não é válida");
        }else {
            System.out.println(this.name + " ataca usando " + this.power + "!!!");
        }
   } 
}
    

