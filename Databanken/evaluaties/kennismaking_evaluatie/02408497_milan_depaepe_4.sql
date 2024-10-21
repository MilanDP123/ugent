SELECT (SELECT naam FROM wielrenner 
   WHERE teamnaam LIKE 'Jumbo-Visma' 
   ORDER BY geboortedatum DESC LIMIT 1) AS jongste,
  (SELECT naam FROM wielrenner WHERE teamnaam LIKE 'Jumbo-Visma' 
   ORDER BY geboortedatum LIMIT 1) AS oudste;
