/* https://dodona.be/nl/courses/4165/series/46397/activities/1411140069 */

### command 1 ###
echo "COMPUTER" > output.txt

### command 2 ###
wget -q https://sandbox.dodona.be/nl/activities/1411140069/description/pKfBTCisHUMiQiW2/media/reservoir.txt

### command 3 ###
cat reservoir.txt >> output.txt 2> error.txt

### command 4 ###
whoami > userinfo 2>&1

### command 5 ###
sort xxx 2> userinfo

### command 6 ###
sort < xxx 2> userinfo

### command 7 ###
< xxx 2> userinfo sort

