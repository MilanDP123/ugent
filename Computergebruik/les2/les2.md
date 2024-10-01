cat verlag.txt | tr 'A-Z' 'a-z' | tr -cs 'a-z' '\n' | sort | uniq | comm -23 - <(cat woordenboek.nl.txt | tr 'A-Z' 'a-z' | sort)


