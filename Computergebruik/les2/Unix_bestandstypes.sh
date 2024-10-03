/* https://dodona.be/nl/courses/4165/series/46397/activities/1403902420 */

awk '{print $3}' | cut -c-1  | sort | uniq -c | sort -nr