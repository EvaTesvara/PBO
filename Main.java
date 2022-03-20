package tutorial.com;
import java.lang.Math;

class player {
    String name;
    double hp;
    weapon playersWeapon;
    armor playersArmor;

    player(String playerName, double playerHp){
        this.name = playerName; 
        this.hp = playerHp;
    }

    void fight(player opponent){
        System.out.println("\n" + this.name + " is attacking " + opponent.name);
    }

    void damage(player opponent){
        System.out.println(opponent.name + " received " + this.playersWeapon.attackPower + " damage from " + this.name);
    }

    void fightResult(player opponent){
        if(opponent.playersArmor.defencePower<=this.playersWeapon.attackPower){
            double minDefencePower = this.playersWeapon.attackPower - opponent.playersArmor.defencePower;
            opponent.hp -= minDefencePower;
            if(opponent.hp <= 0){
                System.out.println(opponent.name + " has been killed by " + this.name);
            }else{
                System.out.println("Opponent armor has absorbed " + this.playersWeapon.attackPower + " damage, " + opponent.name + " has lost their armor, hp left: " + opponent.hp);
            }
        }
        else if(opponent.playersArmor.defencePower>this.playersWeapon.attackPower){
            double armorLeft = opponent.playersArmor.defencePower - this.playersWeapon.attackPower;
            System.out.println(opponent.name + " survived " + this.name + " attack");
            System.out.println("\n" + opponent.name + " has " + armorLeft + " armor left");
        }
    }

    void equipSenjata (weapon weaponName){
        this.playersWeapon = weaponName;
    }

    void equipPertahanan (armor armorName){
        this.playersArmor = armorName;
    }

    void display (){
        System.out.println("\nnama pemain :" + this.name);
        System.out.println("nyawa pemain : " + this.hp);
        System.out.println("nama senjata : " + this.playersWeapon.name);
        System.out.println("kekuatan senjata : " + this.playersWeapon.attackPower);
        System.out.println("nama pertahanan : " + this.playersArmor.name);
        System.out.println("kekuatan pertahanan : " + this.playersArmor.defencePower);
    }
   
}

class weapon {
    String name;
    double attackPower;

    weapon(String weaponName, double weaponAttackPower){
        this.name = weaponName;
        this.attackPower = weaponAttackPower;
    }

    void display(){
        System.out.println("Weapon name : " + this.name + ". Attack power : " + this.attackPower);
    }
}

class armor {
    String name;
    double defencePower;

    armor (String armorName, double armorDefencePower){
        this.name = armorName;
        this.defencePower = armorDefencePower;
    }

    void display(){
        System.out.println("Armor name : " + this.name + ". Defence power : " + this.defencePower);
    }
}


public class Main {
    
    public static void main(String[] args) {
        //pemain
        player player1 = new player("Ucup",20.0);
        player player2 = new player("Indra", 80.0);
        //senjatacla
        weapon Pedang = new weapon("pedang besi",30);
        weapon flameThrower = new weapon ("penyembur api", 140);
        //pertahanan
        armor bajuBesi = new armor ("baju besi hitam", 40);
        armor bajuAntiPanas = new armor ("Baju tahan panas", 30);

        player1.equipSenjata(flameThrower);
        player1.equipPertahanan(bajuAntiPanas);
        player2.equipSenjata(Pedang);
        player2.equipPertahanan(bajuBesi);

        player1.display();
        player2.display();
        player1.fight(player2);
        player1.damage(player2);
        player1.fightResult(player2);
    }

} 