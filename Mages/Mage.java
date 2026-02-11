package Mages;

import Spells.ISpell;

public abstract class Mage {

    public String name;
    public ISpell signatureSpell;

    public abstract void performSpell(ISpell spell);
    public abstract void changeSignatureSpell(ISpell newSpell);
    public abstract void showSignatureSpell();
}
