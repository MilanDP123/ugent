SELECT id, vertrek, round( (hoogtemeters / floor(afstand))::numeric, 2) AS hoogtemeters_per_km 
	FROM route
	ORDER BY hoogtemeters_per_km DESC, vertrek;
