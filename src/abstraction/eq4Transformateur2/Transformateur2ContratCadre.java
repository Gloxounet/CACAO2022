package abstraction.eq4Transformateur2;


import abstraction.eq8Romu.contratsCadres.Echeancier;
import abstraction.eq8Romu.contratsCadres.ExemplaireContratCadre;
import abstraction.eq8Romu.contratsCadres.IVendeurContratCadre;

import abstraction.eq8Romu.produits.Chocolat;

//Marie

public class Transformateur2ContratCadre extends Transformateur2Acteur implements IVendeurContratCadre {


	public void next() {
		super.next();
	}
	public void initialiser() {
		super.initialiser();
	}
	
	
	public Transformateur2ContratCadre() {
		super();
	}
	
	
@Override
public boolean vend(Object produit) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Echeancier contrePropositionDuVendeur(ExemplaireContratCadre contrat) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public double propositionPrix(ExemplaireContratCadre contrat) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double contrePropositionPrixVendeur(ExemplaireContratCadre contrat) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void notificationNouveauContratCadre(ExemplaireContratCadre contrat) {
	// TODO Auto-generated method stub
	
}

@Override
public double livrer(Object produit, double quantite, ExemplaireContratCadre contrat) {
	// TODO Auto-generated method stub
	return 0;
}
}
