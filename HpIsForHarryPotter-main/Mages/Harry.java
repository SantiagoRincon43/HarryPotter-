package Mages;
import Spells.*;

public class Harry extends Mage{
    
    public Harry(){
        this.name = "Harry Potter";
        this.signatureSpell = new ExpectoPatronum();
    }

    @Override
    public void performSpell(ISpell spell) {
        System.out.println("\n*"+this.name+" is casting a spell*");
        spell.castSpell();
    }

    @Override
    public void changeSignatureSpell(ISpell newSpell) {
        System.out.println("\n*"+this.name+" has trained so much a new spell, now "+this.name +" new signature spell is: "+newSpell.getClass().getSimpleName()+"*");
        this.signatureSpell = newSpell;
    }

    @Override
    public void showSignatureSpell() {
        System.out.println("*Now Harry is casting his signature spell*");
        this.signatureSpell.castSpell();    
    }

}
