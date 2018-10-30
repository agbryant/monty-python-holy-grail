package com.agbryant.montypythonholygrail.repository;


import com.agbryant.montypythonholygrail.entity.Location;
import org.springframework.stereotype.Repository;


@Repository
public class LocationRepository {

	public Location setup() {

		Location britain = Location.builder().name("Britain").build();
		Location camelot = Location.builder().name("Camelot").description("A silly place").build();
		Location castleAnthrax = new Location("Castle Anthrax");
		Location swampCastle = new Location("Swamp Castle");
		Location caveofCaerbannog = Location.builder().name("Cave of Caerbannog").description("Guarded by an unknown monster").build();
		Location bridgeOfDeath = Location.builder().name("Bridge of Death").description("spans the Gorge of Eternal Peril").build();
		Location castleOfAarrgh = Location.builder().name("Castle of Aarrgh").build();
		Location modernDay = Location.builder().name("Modern Day").finalLocation(true).build();

		britain.setNext(camelot);
		camelot.setNext(castleAnthrax);
		castleAnthrax.setNext(swampCastle);
		swampCastle.setNext(caveofCaerbannog);
		caveofCaerbannog.setNext(bridgeOfDeath);
		bridgeOfDeath.setNext(castleOfAarrgh);
		castleOfAarrgh.setNext(modernDay);

		return britain;
	}

	public String ohThePlacesWeWillGo(){

		Location currentLocation = setup();
		StringBuilder output = new StringBuilder();

		while(!currentLocation.isFinalLocation()){

			output.append(currentLocation.getName()).append(" ").append(currentLocation.getDescription()).append("\n");
			currentLocation = currentLocation.getNext();
		}

		return output.toString();
	}
}
