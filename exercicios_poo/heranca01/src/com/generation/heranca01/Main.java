package com.generation.heranca01;

import com.generation.heranca01.model.Cachorro;
import com.generation.heranca01.model.Cavalo;
import com.generation.heranca01.model.Preguica;

public class Main {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Alberto",9);
		Cavalo cavalo = new Cavalo("William",13);
		Preguica preguica = new Preguica("Luciano",17);
		
		
		cachorro.som();
		cavalo.som();
		preguica.som();
		
	}
	
}