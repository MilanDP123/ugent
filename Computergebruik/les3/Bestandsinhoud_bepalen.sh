/* https://dodona.be/nl/courses/4165/series/46398/activities/578459704 */

find /bin -type f -executable -exec file -b {} \; | cut -d',' -f1 | sort | uniq -c | sort -k1,1nr -k2