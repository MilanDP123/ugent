/* https://dodona.be/nl/courses/4165/series/46397/activities/1007952281 */

xargs -I {} seq -f '4/%g' 1 2 {} | paste -sd-+ | bc -l
s