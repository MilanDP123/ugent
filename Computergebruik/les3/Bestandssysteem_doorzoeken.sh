/* https://dodona.be/nl/courses/4165/series/46398/activities/1202281876 */

### command 1 ###
find . ! -newer participants.txt

### command 2 ###
find -empty -delete

### command 3 ###
find -size +10k -exec gzip {} \;

### command 4 ###
find  -type d -not -path "*/music/*" -print

### command 5 ###
find /etc -perm /o=x \( -name '[0-9]*' -o -name '*[0-9]' \) 2>/dev/null

