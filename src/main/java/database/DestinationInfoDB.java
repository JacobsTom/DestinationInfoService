package database;

import java.util.HashMap;
import java.util.Map;

public class DestinationInfoDB {

	private Map<String, String> destinationsInfo;
	
	public DestinationInfoDB()
	{
		destinationsInfo = new HashMap<String, String>();
		
		destinationsInfo.put("zichem", "Info: Zichem is een klein dorpje in Vlaams-Brabant.\nBezienswaardigheden: Kerk van Zichem, Maagdentoren aan de Demer");
		destinationsInfo.put("leuven", "Info: Leuven is de hoofdstad van Vlaams-Brabant. In deze studentenstad komt u veel studenten tegen.\nBezienswaardigheden: Grote Markt, Oude Markt, Stadhuis van Leuven, Ladeuzeplein,...");
		destinationsInfo.put("oostende", "Info: Oostende is een stad in West-Vlaanderen, die ongeveer in het midden aan de kust ligt.\nBezienswaardigheden: Fort Napoleon, Noordzeeaquarium, Strand en zee,...");
		destinationsInfo.put("averbode", "Info: Averbode is een dorp in Vlaams-Brabant.\nBezienswaardigheden: Abdij Averbode, Lekdreef");
		destinationsInfo.put("hasselt", "Info: Hasselt is de hoofdstad van Limburg, de mensen praten hier Limburgs, wat voor sommigen nogal raar klinkt.\nBezienswaardigheden: Sint-Quintinuskathedraal, Jenevermuseum, Japanse tuin,...");
		destinationsInfo.put("brussel", "Info: Brussel is de hoofdstad van Belgi�, waar velen tweetalig zijn.\nBezienswaardigheden: Atomium, Manneke Pis, Mini Europa,... ");
			
	}
	
	
	public String getInfo(String city)
	{
		if (!destinationsInfo.containsKey(city))
		{
			return "No info found for " + city;
		}
		else
		{
			return destinationsInfo.get(city);			
		}
	}
}
