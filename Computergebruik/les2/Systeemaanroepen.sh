/* https://dodona.be/nl/courses/4165/series/46397/activities/1902452886 */

2>&1 | sed 's/(.*//' | grep -o '^[^ ]*' | tr -d ')+' | grep -v '^$' | sort | uniq -c | sort -k1,1nr -k2,2d | head -n 10