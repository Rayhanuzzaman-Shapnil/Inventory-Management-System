/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Inventory_s;

/**
 *
 * @author A
 */
public class cInventory_Price {
    
    public double Saffron,Paprika,Turmeric,Coriander,Fenugreek,Seasame,Cumin,BlackCumin,Pepper,Cardamom,Clove,Cinnamon,Mustard,BayLeaf,Nutmeg,RockSalt,BlackSalt,PoppySeed,Ginger,Garlic;
    public double itemtotal,itemtotal1,itemtotal2;
    
    
    public double GetAmount(){
        itemtotal1 = Saffron+Paprika+Turmeric+Coriander+Fenugreek+Seasame+Cumin+BlackCumin+Cardamom+Clove;
        itemtotal2 = Cinnamon+Mustard+BayLeaf+Nutmeg+RockSalt+BlackSalt+PoppySeed+Ginger+Garlic+Pepper;
        itemtotal = itemtotal1+itemtotal2;

        return(itemtotal);
    }
    
    public double pSaffron=5.60,pPaprika=1.78,pTurmeric=2.10,pCoriander=3.25,pFenugreek=5.96,pSeasame=4.50,pCumin=9.36,pBlackCumin=9.87,pPepper=2.03,pCardamom=6.32,pClove=9.88,pCinnamon=7.28,pMustard=2.28,pBayLeaf=9.71,pNutmeg=7.84,pRockSalt=8.74,pBlackSalt=5.45,pPoppySeed=3.65,pGinger=2.25,pGarlic=1.50;
    
}
