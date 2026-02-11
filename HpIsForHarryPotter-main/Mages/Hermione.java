package Mages;
import Spells.*;

public class Hermione extends Mage{
    public Hermione(){
        this.name = "Hermione Granger";
        this.signatureSpell = new WingardiumLeviosa();
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
        System.out.println("*Now Hermione is casting her signature spell*");
        this.signatureSpell.castSpell();    
    }

}
