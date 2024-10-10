/* https://dodona.be/nl/courses/4165/series/46398/activities/631174941 */

### command 1 ###
mkdir secret music pop_music classical_music hits movies thriller romantic personal

### command 2 ###
echo "Amerikaanse grungeband" > nevermind_nirvana.txt;echo "Yellow submarine" > help_beatles.txt;echo "uitgebracht in 2004" > musicology_prince.txt

### command 3 ###
mv thriller romantic movies

### command 4 ###
mv movies personal

### command 5 ###
mv *.txt hits

### command 6 ###
mv *_music music

### command 7 ###
chmod 700 ~

### command 8 ###
cp -r music hits ~
chmod -R o-r ~/music ~/hits

### command 9 ###
echo "wat tekst" > secret/secret.txt
chmod 333 secret

### command 10 ###
chmod 733
rm -r secret personal
