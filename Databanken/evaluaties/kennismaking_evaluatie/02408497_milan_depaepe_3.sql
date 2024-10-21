SELECT DISTINCT uitslag.rennernaam AS rennernaam
	FROM uitslag JOIN wedstrijd ON uitslag.wedstrijdnaam = wedstrijd.naam AND positie = 1
	JOIN wielrenner ON wielrenner.naam = uitslag.rennernaam AND wielrenner.landcode = wedstrijd.landcode;
