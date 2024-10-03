/* https://dodona.be/nl/courses/4165/series/46397/activities/1266270534 */

### command 1 ###
tail -n-25 numbers.txt

### command 2 ###
head -n+75 numbers.txt | tail -n+25

### command 3 ###
head -n+2 numbers.txt | tail -n-1

### command 4 ###
ls -a ~ | wc -w